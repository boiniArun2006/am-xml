#!/usr/bin/env python3
"""Rasterize an Alight Motion project XML to PNG frames — a faithful-enough
re-implementation of AM's render contract (reverse-engineered from the app):
  origin top-left px; location = element CENTER; transform T(loc)R(rot)S(scale)
  on geometry centered at origin; shape `size` = HALF-extent; text centered on
  location; kf t normalized 0..1 -> sceneTime=start+(end-start)*t; cubic-bezier easing.
Usage: python3 render.py <scene.xml> [t_ms ...]   (default: contact sheet of 6 frames)
"""
import sys, os, math, glob
import xml.etree.ElementTree as ET
from PIL import Image, ImageDraw, ImageFont, ImageFilter

FONTDIR = os.path.join(os.path.dirname(__file__), "..", "fonts")

# ---- fonts ----
_fcache = {}
def load_font(family, weight, px):
    key = (family, weight, px)
    if key in _fcache: return _fcache[key]
    # match a fetched ttf: Family_wght_NNN.ttf, nearest weight
    cands = glob.glob(os.path.join(FONTDIR, f"{family}_wght_*.ttf"))
    path = None
    if cands:
        def w(p):
            try: return int(p.split("_wght_")[1].split(".")[0])
            except: return 400
        path = min(cands, key=lambda p: abs(w(p)-weight))
    try:
        f = ImageFont.truetype(path, px) if path else ImageFont.truetype("DejaVuSans.ttf", px)
    except Exception:
        f = ImageFont.load_default()
    _fcache[key] = f
    return f

# ---- easing (matches CubicBezierEasing.java) ----
def cubic_bezier(p1x,p1y,p2x,p2y):
    A=lambda a1,a2:1-3*a2+3*a1; B=lambda a1,a2:3*a2-6*a1; C=lambda a1:3*a1
    calc=lambda t,a1,a2:((A(a1,a2)*t+B(a1,a2))*t+C(a1))*t
    slope=lambda t,a1,a2:3*A(a1,a2)*t*t+2*B(a1,a2)*t+C(a1)
    def f(x):
        if x<=0: return 0.0
        if x>=1: return 1.0
        t=x
        for _ in range(8):
            xe=calc(t,p1x,p2x)-x
            if abs(xe)<1e-6: break
            d=slope(t,p1x,p2x)
            if abs(d)<1e-6: break
            t-=xe/d
        return calc(t,p1y,p2y)
    return f
LINEAR=lambda x:x
def parse_easing(e):
    if not e: return LINEAR
    parts=e.replace("local","").split()
    if parts and parts[0]=="cubicBezier" and len(parts)>=5:
        return cubic_bezier(*map(float,parts[1:5]))
    return LINEAR

def num(s): return float(s)
def vec(s): return [float(x) for x in s.split(",")]

def parse_track(node, parse):
    if node is None: return None
    kfs=node.findall("kf")
    if not kfs:
        v=node.get("value")
        return {"static":parse(v)} if v is not None else None
    return {"kfs":[{"t":float(k.get("t")),"v":parse(k.get("v")),"e":parse_easing(k.get("e"))} for k in kfs]}

def lerp(a,b,f):
    if isinstance(a,list): return [x+(b[i]-x)*f for i,x in enumerate(a)]
    return a+(b-a)*f
def eval_track(tr, lt):
    if tr is None: return None
    if "static" in tr: return tr["static"]
    k=tr["kfs"]
    if len(k)==1: return k[0]["v"]
    if lt<=k[0]["t"]: return k[0]["v"]
    if lt>=k[-1]["t"]: return k[-1]["v"]
    for i in range(len(k)-1):
        if k[i]["t"]<=lt<=k[i+1]["t"]:
            span=(k[i+1]["t"]-k[i]["t"]) or 1e-9
            f=k[i+1]["e"]((lt-k[i]["t"])/span)
            return lerp(k[i]["v"],k[i+1]["v"],f)
    return k[-1]["v"]

def amcolor(s):
    if not s: return None
    s=s.replace("#","")
    if len(s)==8:
        a=int(s[0:2],16); r=int(s[2:4],16); g=int(s[4:6],16); b=int(s[6:8],16)
        return (r,g,b,a)
    return (255,255,255,255)

def amfont(f):
    if not f: return ("Roboto",400,False)
    q=(f.split("?")[1] if "?" in f else "").replace("&amp;","&")
    d=dict(kv.split("=") for kv in q.split("&") if "=" in kv)
    if f.startswith("imported"):
        return (d.get("name","Roboto").rsplit(".",1)[0],400,False)
    return (d.get("name","Roboto"), int(d.get("weight",400)), d.get("italic")=="1")

def parse_scene(path):
    root=ET.parse(path).getroot()
    S={"w":int(root.get("width")),"h":int(root.get("height")),
       "ew":int(root.get("exportWidth",root.get("width"))),"eh":int(root.get("exportHeight",root.get("height"))),
       "fps":int(root.get("fps",30)),"total":int(root.get("totalTime",1000)),
       "bg":amcolor(root.get("bgcolor","#ff000000")),"layers":[]}
    for el in root:
        if el.tag not in ("shape","text","audio","embedScene","camera"): continue
        tf=el.find("transform")
        def t(name): return tf.find(name) if tf is not None else None
        prop_size=None
        for p in el.findall("property"):
            if p.get("name")=="size": prop_size=vec(p.get("value"))
        grad=el.find("gradient")
        content_el=el.find("content")
        S["layers"].append({
            "tag":el.tag,"id":el.get("id"),"label":el.get("label",""),
            "start":int(el.get("startTime",0)),"end":int(el.get("endTime",0)),
            "hidden":el.get("hidden")=="true","fillType":el.get("fillType"),"s":el.get("s"),
            "align":el.get("align","left"),"wrap":float(el.get("wrapWidth",512)),
            "size":float(el.get("size",0)),"font":el.get("font"),
            "content":(content_el.text or "") if content_el is not None else "",
            "fill":amcolor(el.find("fillColor").get("value")) if el.find("fillColor") is not None else None,
            "sizevec":prop_size,
            "grad":({"type":grad.get("type"),"c0":amcolor(grad.get("startColor")),"c1":amcolor(grad.get("endColor"))} if grad is not None else None),
            "effects":[{"id":ef.get("id").split(".")[-1],
                        "props":[{"name":p.get("name"),"track":parse_track(p,num)} for p in ef.findall("property")]}
                       for ef in el.findall("effect")],
            "loc":parse_track(t("location"),vec),"scale":parse_track(t("scale"),vec),
            "rot":parse_track(t("rotation"),num),"opacity":parse_track(t("opacity"),num),
        })
    return S

def wrap_text(draw, text, font, maxw):
    if not text: return [""]
    words=text.split(); lines=[]; cur=""
    for wd in words:
        test=(cur+" "+wd).strip()
        if draw.textlength(test,font=font)>maxw and cur:
            lines.append(cur); cur=wd
        else: cur=test
    if cur: lines.append(cur)
    return lines or [""]

def render(S, tms):
    W,H=S["w"],S["h"]
    img=Image.new("RGBA",(W,H),S["bg"] or (0,0,0,255))
    for L in S["layers"]:
        if L["hidden"] or tms<L["start"] or tms>=L["end"]: continue
        life=(L["end"]-L["start"]) or 1; lt=(tms-L["start"])/life
        op=eval_track(L["opacity"],lt); op=1.0 if op is None else max(0.0,min(1.0,op))
        loc=eval_track(L["loc"],lt) or [W/2,H/2,0]
        sc=eval_track(L["scale"],lt) or [1,1]
        rot=eval_track(L["rot"],lt) or 0
        blur=0.0
        for ef in L["effects"]:
            if ef["id"]=="gaussianblur":
                st=next((p for p in ef["props"] if p["name"]=="strength"),None)
                v=eval_track(st["track"],lt) if st else 0.15
                blur=max(blur,(v or 0)*10)
        # render the element into a sprite centered at origin, then place
        sprite=render_element(L,lt)
        if sprite is None: continue
        # scale
        sw=max(1,int(sprite.width*abs(sc[0]))); sh=max(1,int(sprite.height*abs(sc[1])))
        if (sw,sh)!=sprite.size: sprite=sprite.resize((sw,sh),Image.BILINEAR)
        if rot: sprite=sprite.rotate(-rot,expand=True,resample=Image.BILINEAR)
        if blur>0.3: sprite=sprite.filter(ImageFilter.GaussianBlur(blur))
        if op<1.0:
            a=sprite.split()[3].point(lambda x:int(x*op)); sprite.putalpha(a)
        img.alpha_composite(sprite,(int(loc[0]-sprite.width/2),int(loc[1]-sprite.height/2)))
    # export-crop guide
    if (S["ew"],S["eh"])!=(W,H):
        d=ImageDraw.Draw(img); s=min(W/S["ew"],H/S["eh"]); cw,ch=S["ew"]*s,S["eh"]*s
        d.rectangle([(W-cw)/2,(H-ch)/2,(W+cw)/2,(H+ch)/2],outline=(61,220,151,255),width=3)
    return img.convert("RGB")

def render_element(L,lt):
    if L["tag"]=="shape":
        half=L["sizevec"] or [50,50]; hw,hh=int(half[0]),int(half[1])
        spr=Image.new("RGBA",(max(2,hw*2),max(2,hh*2)),(0,0,0,0))
        d=ImageDraw.Draw(spr)
        fill=L["fill"] or (255,255,255,255)
        if L["fillType"]=="gradient" and L["grad"]:
            fill=L["grad"]["c0"] or fill   # flat approx of gradient
        if L["s"]==".ellipse": d.ellipse([0,0,hw*2-1,hh*2-1],fill=fill)
        else: d.rectangle([0,0,hw*2-1,hh*2-1],fill=fill)
        return spr
    if L["tag"]=="text":
        fam,wt,it=amfont(L["font"]); px=int(L["size"] or 24)
        font=load_font(fam,wt,px)
        tmp=ImageDraw.Draw(Image.new("RGBA",(4,4)))
        lines=wrap_text(tmp,L["content"],font,L["wrap"])
        lh=int(px*1.32)
        # AM centers the ACTUAL text block (not the wrapWidth box) on location.
        widths=[tmp.textlength(ln,font=font) for ln in lines]
        box_w=int(max(widths)) or 2; box_h=max(lh,lh*len(lines))
        spr=Image.new("RGBA",(box_w,box_h),(0,0,0,0))
        d=ImageDraw.Draw(spr)
        fill=L["fill"] or (255,255,255,255)
        y=0
        for ln,w in zip(lines,widths):
            if L["align"]=="center": x=(box_w-w)/2
            elif L["align"]=="right": x=box_w-w
            else: x=0   # left: lines flush-left within the block, block centered on location
            d.text((x,y+(lh-px)/2),ln,font=font,fill=fill)
            y+=lh
        return spr
    # placeholder box for media/audio/embed
    half=L["sizevec"] or [200,120]; hw,hh=int(half[0]),int(half[1])
    spr=Image.new("RGBA",(max(2,hw*2),max(2,hh*2)),(120,140,180,70))
    ImageDraw.Draw(spr).rectangle([0,0,hw*2-1,hh*2-1],outline=(120,140,180,180),width=3)
    return spr

def main():
    path=sys.argv[1] if len(sys.argv)>1 else "nimbus_saas_reveal.xml"
    S=parse_scene(path)
    outdir=os.path.dirname(os.path.abspath(path))
    if len(sys.argv)>2:
        times=[int(x) for x in sys.argv[2:]]
    else:
        times=[int(S["total"]*f) for f in (0.05,0.14,0.30,0.48,0.62,0.78,0.90)]
    frames=[render(S,t) for t in times]
    # contact sheet
    tw=360; th=int(tw*S["h"]/S["w"]); cols=min(4,len(frames)); rows=math.ceil(len(frames)/cols)
    sheet=Image.new("RGB",(cols*tw,rows*(th+20)),(20,22,28))
    dd=ImageDraw.Draw(sheet); lab=load_font("Roboto",400,14)
    for i,(t,fr) in enumerate(zip(times,frames)):
        th_img=fr.resize((tw,th)); r,c=divmod(i,cols)
        sheet.paste(th_img,(c*tw,r*(th+20)))
        dd.text((c*tw+6,r*(th+20)+th+3),f"t={t}ms  frame {int(t/1000*S['fps'])}",font=lab,fill=(180,190,205))
    out=os.path.join(outdir,"_contact_sheet.png"); sheet.save(out)
    print(f"scene {S['w']}x{S['h']} -> export {S['ew']}x{S['eh']}, {len(S['layers'])} layers, {S['total']}ms")
    print(f"wrote {out}  ({len(frames)} frames @ {times})")

if __name__=="__main__": main()
