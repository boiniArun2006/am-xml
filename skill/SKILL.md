---
name: alight-motion-xml
description: Generate valid, renderable Alight Motion v5 project XML. Use when the user wants to create an AM edit, animation, template, or project file from a description or uploaded media (image/video/audio).
---

# Alight Motion XML Generator

You emit ONE `.xml` file that opens cleanly in Alight Motion v5 and renders as intended.
Grounded in the serializer (`reference/xml.rs`), 30 real exports (`others/`),
`reference/BLUEPRINT.md`, and `reference/font_catalog.json`. Never invent tags, attrs,
effect ids, param names, or fonts — if it is not in those sources, do not emit it.

## THE BUILD ORDER (follow this sequence every time — do not skip ahead)

Build one pass at a time. Do NOT touch a later stage until the current one is correct.

1. **STEP 0** — Ask the user the setup questions. Get canvas w×h. (mandatory)
2. **TEXT** — Place all text. Get it perfect: no wrap, no overlap, no off-canvas, right gaps.
   This is where past edits broke. Nail it before anything else. (STEP 3)
3. **SHAPES** — Add backing shapes/pills/lines. Size each to fully cover its text. (STEP 4)
4. **3D** — Add z-depth / z-rotation only after 2D layout is locked. (STEP 4 notes)
5. **EFFECTS** — Add blur/glow/motionblur from the catalog. (STEP 5)
6. **KEYFRAMING** — Animate position/scale/opacity. Re-check text never wraps or collides
   at ANY keyframe, not just at rest. (STEP 2 + STEP 3)
7. **SELF-CHECK** — Run STEP 7 before output.

Rationale: text geometry is the root of every bug the user has hit (wrap, overlap,
off-canvas, uncovered pill). Lock text first; every later layer is positioned relative to it.

---

## STEP 0 — ALWAYS ASK FIRST (do not generate until answered)

Ask these in ONE message. A wrong answer here causes overlap and cut-off text.

1. **Orientation / ratio** → sets canvas w×h:
   - Vertical 9:16 → `1080×1920` · Horizontal 16:9 → `1920×1080` · Square 1:1 → `1080×1080` · Custom → ask px.
2. **Edit type**: video edit / image edit / text-only / 3D / audio-driven beat edit.
3. **Duration** in seconds (→ `totalTime` ms = s×1000).
4. **Weight**: simple (1–3 layers) / custom / heavy (many layers, stacked fx).
5. **Uploaded media?** Per file: type, pixel W×H (to scale), duration (video/audio, ms).
6. **Audio beat sync?** Ask BPM or beat timestamps (ms), or offer fixed interval.

If they won't give w×h, DEFAULT `1080×1920` and say so. **You must know w×h before any layer.**

---

## STEP 1 — MINIMAL VALID SKELETON (never deviate)

```xml
<?xml version='1.0' encoding='UTF-8' ?>
<scene title="TITLE" width="W" height="H" exportWidth="W" exportHeight="H"
       precompose="dynamicResolution" bgcolor="#ff000000" totalTime="MS" fps="30"
       am="com.alightcreative.motion/5.0.273" amplatform="android" retime="freeze">
  <!-- <media> declarations first, then layers. FIRST layer in doc = BOTTOM of z-stack. -->
</scene>
```

- `totalTime`, `startTime`, `endTime`, `bookmark t`, media `duration`, `inTime/outTime` = **ms**.
- Colors are **`#AARRGGBB`** (alpha FIRST). Opaque black = `#ff000000`. `&` → `&amp;`.
- fps 30 default; 60 for smooth motion.

---

## STEP 2 — THE UNIT RULE (bug #1)

| Where | Unit |
|---|---|
| `startTime`,`endTime`,`totalTime`,`inTime`,`outTime`,`bookmark t` | **milliseconds** (absolute) |
| keyframe `<kf t="...">` | **normalized 0.0–1.0 of THAT layer's own lifetime** |

Layer `startTime=2000 endTime=6000` lives 4000ms; `kf t="0.5"` fires at absolute 4000ms.
`t` is NEVER ms. Keyframe: `<kf t="0..1" v="VALUE" e="EASING"/>`. First kf usually no easing;
later kf carry easing INTO that kf. Static value: `<location value="..."/>`.

---

## STEP 3 — TEXT GEOMETRY (bug #2 — wrap, overlap, off-canvas). Do this pass FIRST.

Origin top-left. `location value="x,y,z"` in **pixels**. Canvas center = `W/2,H/2`.

### The three text failures and their exact causes

- **A word/last letter drops to a new line** → the line's rendered width exceeds `wrapWidth`,
  so AM wraps it. FIX: `wrapWidth` must be LARGER than the widest line. For a single-line
  heading, set `wrapWidth` to the full usable width (`W − 40`, e.g. `1040` on 1080) so it can
  never wrap. Only use a small `wrapWidth` when you WANT multi-line, and then budget the height.
- **Texts overlap** → two layers visible at the same time have y-boxes that intersect.
  `location.y` is the box's VERTICAL CENTER; the box spans `y ± box_h/2`.
- **Text cut off at edge** → box extends past the safe margin.

### Estimate a text box (be conservative — real glyphs are wider than you think)

Real AM exports keep `size` small (18–56) and enlarge via `scale`. Effective font px = `size × scale`.
```
glyph_advance = 0.62            # em; conservative for Poppins/Roboto — round UP, never down
line_width  = len(text) × size × scale × 0.62
line_height = size × scale × 1.32
```
- **wrapWidth ≥ line_width + 40**, always. If unsure, set wrapWidth = `W − 40` for centered
  headings so wrapping is impossible.
- If you deliberately want N lines, `box_h = N × line_height`; else `box_h = line_height`.

### Mandatory LAYOUT TABLE — build before writing any text layer

1. List every text/shape layer that is visible at the same time (overlapping `startTime`–`endTime`).
2. Compute each layer's `line_width`, `box_h`, and horizontal extent from its `align`:
   - center → `[x − line_width/2, x + line_width/2]` · left → `[x, x+line_width]` · right → `[x−line_width, x]`.
3. Assign y top→bottom, non-overlapping: `y[n] = y[n-1] + box_h[n-1]/2 + gap(≥48) + box_h[n]/2`.
4. Confirm every box is inside safe margins: x∈`[80, W−80]`, y∈`[120, H−120]`.
5. Layers in DIFFERENT scenes (non-overlapping time) MAY reuse the same y — preferred for a
   centered keynote look (Apple RSVP: words flash one-at-a-time in the SAME spot, different times).
6. If a layer animates position, BOTH start and end y/x must stay in-band and in-margin.

### Text tag
```xml
<text id="100002" startTime="0" endTime="MS" fillType="color" size="40"
      font="googlefonts?name=Roboto&amp;weight=900" wrapWidth="1040" align="center">
  <transform><location value="X,Y,0"/><scale value="1,1"/></transform>
  <fillColor value="#ffffffff"/>
  <content>YOUR TEXT</content>
</text>
```

### Fonts — MUST exist in AM's catalog (the "missing font" bug)
AM bundles a fixed **884 Google font families** (`reference/font_catalog.json`), each with ONLY
specific weights. A name/weight not in that file renders blank.
- Font string: `googlefonts?name=NAME&amp;weight=W&amp;italic=1` (`&`→`&amp;`), or
  `imported?name=File.otf` ONLY if the USER supplied that file — never invent imported names.
- Use only a `name=` that is a key in the catalog, and a `weight=` in that family's list.
  `italic=1` only if the family's `"italic": true`.
- **"Inter" is NOT in the catalog.** If the user names an uncatalogued font, pick the closest
  catalogued family and say so.
- Safe all-weight (100–900) defaults: **Poppins, Montserrat, Raleway, Work Sans, Nunito**.
  General default: **Roboto** (100,300,400,500,700,900).

---

## STEP 4 — SHAPES, MEDIA, AUDIO (add after text is locked)

Every layer needs a **unique** integer `id` (start large, e.g. 300001, increment; never reuse).

### Shape / backing pill / line
```xml
<shape id="100001" label="NAME" startTime="0" endTime="MS" s=".rect" fillType="color">
  <transform><location value="X,Y,0"/><scale value="1,1"/></transform>
  <fillColor value="#ffffffff"/>
  <property name="size" type="vec2" value="HALF_W,HALF_H"/>
</shape>
```
- **CRITICAL — shape `size` is HALF-extent.** Rendered px = `size × 2 × scale`. A full-frame
  rect on 1080×1920 is `size="540,960"`. A pill that must cover text needs
  `HALF_W ≥ (line_width/2) + 40` and `HALF_H ≥ (line_height/2) + 22` — i.e. rendered box a
  comfortable margin bigger than the text on ALL sides. Verify the label fits, then add padding.
- A pill that scales up (pop-in) EXPOSES its text if the label is already full-size. FIX: start
  the label AFTER the pill has settled (label `startTime` ≥ pill settle time), or scale both together.
- `s`: `.rect`, `.ellipse`, or omit `s` + `<path d="M ... L ..."/>`.
- `fillType`: `color`(+`fillColor`), `gradient`(+`<gradient type="linear|radial" startColor= endColor= start= end=/>`),
  `media`(+`fillImage`/`fillVideo` uri, `mediaFillMode="fill"`, `size`=source px), `none`, `intrinsic`.

### 3D (only after 2D is locked)
- z lives in the 3rd `location` component and in `rotationX/rotationY`. Add depth last so it
  doesn't shift your validated 2D layout. Keep text readable — extreme z-rotation clips glyphs.

### Media (uploaded image/video) — declare then reference
```xml
<media uri="URI" type="image/png" width="SRCW" height="SRCH"/>
<media uri="URI" type="video/mp4" duration="DUR_MS" width="SRCW" height="SRCH"/>
```
- Upload uris: `content://media/external/images/media/<id>` (image), `.../video/media/<id>`,
  `.../audio/media/<id>`; or `am-internal:///<hash>.ext`. No real uri → clear placeholder
  (`.../PLACEHOLDER_1`) and tell the user to relink in-app.
- **Fit to canvas:** `mediaFillMode="fill"` + shape `size`=source px covers frame; set
  `scale = max(W/srcW, H/srcH)` (fill/cover) or `min(...)` (letterbox) so nothing unexpectedly crops.
- Video uses `fillVideo="URI"` + `inTime`/`outTime` (ms) to trim.

### Audio
```xml
<audio id="100003" startTime="0" endTime="MS" src="URI" inTime="0" outTime="MS" mediaFillMode="fill">
  <gain><kf t="0" v="1"/><kf t="0.99" v="0"/></gain>
</audio>
```

### embedScene — nested precomp for reusable animated units. Copy structure from `others/`; don't hand-author blind.

---

## STEP 5 — EFFECTS (from the catalog only)

```xml
<effect id="com.alightcreative.effects.EFFECTID" locallyApplied="true">
  <property name="PARAM" type="TYPE" value="V"/>
  <property name="PARAM" type="float"><kf t="0" v="12"/><kf t="0.25" v="0"/></property>
</effect>
```
- **Only ids + param names/types from `reference/BLUEPRINT.md` / `effects_catalog.json`.** Do not
  guess params — e.g. gaussianblur's param is `strength` (0.0–2.0), NOT `radius`. Respect ranges.
- `type`: float/int/bool/color/vec2/vec3. No-param effect: self-close `<effect id="..." locallyApplied="true"/>`.
- Common: `motionblur4`, `gaussianblur`(strength), `glow`, `textspacing`(letterspacing/linespacing),
  `texttransform`, `exposure`, `satvib`, `rgbsep`. Look each up before emitting.

---

## STEP 6 — AUDIO-DRIVEN / BEAT EDIT

- beat interval ms = `60000 / BPM`, or use given timestamps. Place `<bookmark t="MS"/>` per beat.
- Align layer `startTime`/`endTime` or scale-punch kf to beats. Typical hit: scale punch
  `<scale><kf t="0" v="1.15,1.15"/><kf t="0.15" v="1,1" e="cubicBezier 0 0 0.58 1"/></scale>`.
- Keep the audio layer spanning the timeline; sync visuals to its beats.

---

## STEP 7 — SELF-CHECK BEFORE OUTPUT

1. `<?xml ...?>` header; single root `<scene>`; well-formed, all tags closed.
2. w×h set; every layer inside `totalTime`; `endTime > startTime`; every `id` unique.
3. Every `<media>` referenced by a layer, and vice-versa.
4. **Every `kf t` is 0.0–1.0**, never ms.
5. **TEXT PASS:** for every text — `wrapWidth > line_width` (no wrap); box inside margins
   x∈[80,W−80] y∈[120,H−120]; no two simultaneously-visible boxes intersect. Check at
   rest AND at every position keyframe.
6. **SHAPE PASS:** every backing pill/line covers its text with margin (remember size = HALF-extent,
   ×2 for px); label appears only when its pill is settled.
7. Uploaded media scaled with fill/fit math.
8. Every effect id + param exists in BLUEPRINT; values in range. Colors `#AARRGGBB`; `&`→`&amp;`.

Output ONLY the XML (plus a one-line note of any placeholders to relink). When unsure of
structure, copy the pattern from a matching file in `others/`.
