---
name: alight-motion-xml
description: Generate valid, renderable Alight Motion v5 project XML. Use when the user wants to create an AM edit, animation, template, or project file from a description or uploaded media (image/video/audio).
---

# Alight Motion XML Generator

You emit ONE `.xml` file that opens cleanly in Alight Motion v5 and renders as intended.
Grounded in the serializer (`reference/xml.rs`), 30 real exports (`others/`), and
`reference/BLUEPRINT.md`. Never invent tags, attrs, effect ids, or param names — if it
is not in those sources, do not emit it.

---

## STEP 0 — ALWAYS ASK FIRST (do not generate until answered)

Before writing any XML, ask the user these in ONE message. Never guess these — a wrong
answer here is what causes text overlap and cut-off content.

1. **Orientation / ratio** → sets canvas w×h. Offer:
   - Vertical 9:16 → `width=1080 height=1920` (Reels/TikTok/Shorts)
   - Horizontal 16:9 → `width=1920 height=1080`
   - Square 1:1 → `width=1080 height=1080`
   - Custom → ask exact px.
2. **Edit type**: video edit / image edit / text-only / 3D / audio-driven beat edit.
3. **Duration** in seconds (→ `totalTime` in ms = seconds×1000).
4. **Weight**: simple (1–3 layers, minimal fx) / custom / heavy (many layers, stacked fx).
5. **Uploaded media?** If yes, get for EACH file: type (image/video/audio), and if known
   its pixel width×height (needed to scale correctly) and duration (video/audio, ms).
6. **Audio beat sync?** If an audio-driven edit: ask for BPM or beat timestamps (ms), or
   offer to place cuts on a fixed interval (e.g. 500ms).

If the user won't specify w×h, DEFAULT to 1080×1920 and state that you did.
**You must know canvas w×h before placing any layer.** All positioning math below depends on it.

---

## STEP 1 — MINIMAL VALID SKELETON (never deviate from this frame)

```xml
<?xml version='1.0' encoding='UTF-8' ?>
<scene title="TITLE" width="W" height="H" exportWidth="W" exportHeight="H"
       precompose="dynamicResolution" bgcolor="#ff000000" totalTime="MS" fps="30"
       am="com.alightcreative.motion/5.0.272" amplatform="android" retime="freeze">
  <!-- media declarations first -->
  <!-- then layers: FIRST layer in document = BOTTOM of z-stack -->
</scene>
```

- `width/height` = canvas the renderer uses. `exportWidth/exportHeight` = output; keep equal to canvas.
- `totalTime`, `startTime`, `endTime`, `bookmark t`, media `duration`, audio `inTime/outTime` are **milliseconds**.
- fps: 30 default; 60 for smooth motion.
- Colors are **`#AARRGGBB`** (alpha FIRST). Opaque black = `#ff000000`.

---

## STEP 2 — THE UNIT RULE (this is the #1 bug — read twice)

Two different time systems coexist:

| Where | Unit |
|---|---|
| `startTime`, `endTime`, `totalTime`, `inTime`, `outTime`, `bookmark t` | **milliseconds** (absolute) |
| keyframe `<kf t="...">` | **normalized 0.0–1.0 of THAT LAYER's lifetime** |

A layer with `startTime=2000 endTime=6000` lives 4000ms. A `kf t="0.5"` inside it fires at
absolute 4000ms (halfway). `t` is NEVER milliseconds. Getting this wrong = animation fires at
the wrong time or instantly.

Keyframe shape: `<kf t="0..1" v="VALUE" e="EASING"/>`. First kf usually has no easing; later
kf carry the easing INTO that kf. Static value instead of kf: `<location value="..."/>`.

---

## STEP 3 — POSITIONING (this is the #2 bug — text overlap / cut off)

Coordinate origin is top-left. `location value="x,y,z"` in **pixels**. Center = `W/2, H/2`.

**Never overlap text. Never let text exceed canvas.** Rules:

- Vertical safe margins: keep content within x∈[80, W-80], y∈[120, H-120].
- **`wrapWidth`** (px) is the text box width at which lines wrap. Set it, don't leave default.
  Use `wrapWidth ≈ W - 160` for full-width text (e.g. 920 on a 1080-wide canvas). Real exports
  use 512 for narrow, up to ~940 for near-full-width. Text longer than one line WILL wrap and
  grow DOWNWARD from `location.y` — budget vertical space for it.
- **Stack text blocks with vertical gaps.** Estimate a line's rendered height ≈ `size × scale × 1.3`.
  For each text layer compute its block height (lines × line-height) and ensure the next layer's
  `y` starts below `previous.y + previous_block_height + gap(≈40px)`. Do NOT place two text
  layers at the same/near y.
- `size` is font size in points (12–56 typical). Bigger `size` on a small/narrow canvas overflows —
  scale `size` DOWN or `wrapWidth` UP, never let it clip.
- For headings centered horizontally: `align="center"`, `location.x = W/2`, and center the wrap
  box by keeping wrapWidth symmetric.
- `scale` is a unitless multiplier `x,y` (`1,1` = 100%). `pivot`/`rotation` rotate about pivot.

**CRITICAL — text.y is the VERTICAL CENTER, and it overlaps by default.** The #1 real bug:
giving two layers `y` values whose boxes intersect. `location.y` is the box's center; the box
spans roughly `y ± (block_height/2)`. To guarantee no overlap, BUILD A LAYOUT TABLE FIRST,
before writing any layer:

1. List every simultaneously-visible text/shape layer in one scene (layers that share any time).
2. For each, compute `block_height = lines × (size × scale × 1.3)`.
3. Assign non-overlapping `y` bands top→bottom: `y[n] = y[n-1] + block_height[n-1]/2 +
   gap(≥48px) + block_height[n]/2`.
4. Two layers that are visible at the same time must NEVER share a y band. If they animate y,
   both the START and END y must stay in their band (an entry that slides from y+40→y must keep
   y+40 clear of the layer above).
5. Layers in DIFFERENT scenes (non-overlapping time) may reuse the same y — that's fine and
   preferred for a centered keynote look. Overlap is only a bug when layers are on screen together.

Before finalizing: for each moment in time, list which layers are visible and confirm none of
their y-bands intersect. This check is mandatory, not optional.

---

## STEP 4 — LAYER RECIPES

Every layer needs a **unique** integer `id` (use large ints, e.g. start 100001 and increment;
never reuse an id). All need `startTime`/`endTime` (ms, within `totalTime`).

### Shape (rectangle, path, or media fill)
```xml
<shape id="100001" label="NAME" startTime="0" endTime="MS" s=".rect" fillType="color">
  <transform><location value="X,Y,0"/><scale value="1,1"/></transform>
  <fillColor value="#ffffffff"/>
</shape>
```
- `s=".rect"` (rectangle), `.ellipse`, or omit `s` and give a `<path d="M ... L ..."/>` child.
- `fillType`: `color` (+`<fillColor>`), `media` (+`fillImage`/`fillVideo` uri), `gradient`
  (+`<gradient type="linear" startColor= endColor= start= end=/>`), `none`, `intrinsic`.
- Media shape needs `mediaFillMode="fill"` (cover) or `"stretch"`, and a `<property name="size" type="vec2" value="W,H"/>` matching source px.

### Text
```xml
<text id="100002" startTime="0" endTime="MS" fillType="color" size="40"
      font="googlefonts?name=Roboto&amp;weight=900" wrapWidth="920" align="center">
  <transform><location value="X,Y,0"/></transform>
  <fillColor value="#ffffffff"/>
  <content>YOUR TEXT</content>
</text>
```
- Font string: `googlefonts?name=NAME&amp;weight=W&amp;italic=1` (escape `&` as `&amp;`) OR
  `imported?name=File.otf` (only if the USER supplies that file — never invent imported names).
- **CRITICAL — fonts must exist in AM's catalog.** AM bundles a fixed list of **884 Google
  font families** (`reference/font_catalog.json`), each with ONLY specific weights. A name or
  weight not in that file renders as fallback/blank = the "missing font" bug. Rules:
  - Only use a `name=` that is a key in `reference/font_catalog.json`, and a `weight=` in that
    family's allowed list. `italic=1` only if that family's `"italic": true`.
  - **"Inter" is NOT in the catalog** — do not use it. If the user names an uncatalogued font,
    pick the closest catalogued family and say so.
  - Safe defaults (all weights 100–900): **Poppins, Montserrat, Raleway, Work Sans, Nunito**.
    General default: **Roboto** (100,300,400,500,700,900).
  - `align`: left/center/right.

### Media (uploaded image/video) — declare + reference
Declare once at top of scene, then a shape references it:
```xml
<media uri="URI" type="image/png" width="SRCW" height="SRCH"/>
<media uri="URI" type="video/mp4" duration="DUR_MS" width="SRCW" height="SRCH"/>
```
- `uri` for user uploads: `content://media/external/images/media/<id>` (image),
  `.../video/media/<id>` (video), `.../audio/media/<id>` (audio). Use `am-internal:///<hash>.ext`
  if the app repackaged it. If the user gives no real uri, use a clear placeholder like
  `content://media/external/images/media/PLACEHOLDER_1` and tell them to relink in-app.
- **Scaling uploaded media to fit canvas:** with `mediaFillMode="fill"` and the shape's
  `size` = source W,H, AM covers the frame. To fit exactly, set `scale = max(W/srcW, H/srcH)`
  (fill) or `min(...)` (letterbox). This prevents a portrait photo being cut off on a landscape canvas and vice-versa.
- Video shape uses `fillVideo="URI"`, plus `inTime`/`outTime` (ms) to trim the source clip.

### Audio
```xml
<audio id="100003" startTime="0" endTime="MS" src="URI" inTime="0" outTime="MS" mediaFillMode="fill">
  <gain><kf t="0" v="1"/><kf t="0.99" v="0"/></gain>
</audio>
```
- `src` = audio/video uri. `inTime`/`outTime` trim the source. `gain` kf fade the volume (0–1).

### embedScene (nesting / precomp)
A `<embedScene ...>` holds its own nested `<scene>` — use for grouped, reusable animated units.
Copy structure from `others/` exports when needed; don't hand-author blind.

---

## STEP 5 — EFFECTS

```xml
<effect id="com.alightcreative.effects.EFFECTID" locallyApplied="true">
  <property name="PARAM" type="TYPE" value="V"/>
  <property name="PARAM" type="float"><kf t="0" v="12"/><kf t="0.25" v="0"/></property>
</effect>
```
- **Only use effect ids and param names/types from `reference/BLUEPRINT.md` / `effects_catalog.json`.**
  Do not guess param names (e.g. gaussianblur's param is `strength`, NOT `radius`). Respect each
  param's documented range.
- `type`: float, int, bool, color, vec2 (`x,y`), vec3. Selector params take the integer enum value.
- Effect with no params: self-close `<effect id="..." locallyApplied="true"/>`.
- Common: `motionblur4`, `gaussianblur`(strength), `fade`(inTime/outTime sec), `glow`, `tile`,
  `oscillate3`, `exposure`, `satvib`, `rgbsep`. Look each up before emitting.

---

## STEP 6 — AUDIO-DRIVEN / BEAT EDIT

When the user wants cuts/hits on the beat:
- beat interval ms = `60000 / BPM`. Or use provided beat timestamps.
- Place a `<bookmark t="MS"/>` on each beat (editing aid) AND align layer `startTime`/`endTime`
  or scale-punch keyframes to those beats.
- Typical beat hit: a scale punch on the active layer — `<scale><kf t="0" v="1.15,1.15"/>`
  `<kf t="0.15" v="1,1" e="cubicBezier 0 0 0.58 1"/></scale>` retriggered per beat-length layer,
  or one layer with kf at each normalized beat position.
- Keep audio layer spanning the whole timeline; sync visuals to its beats.

---

## STEP 7 — SELF-CHECK BEFORE OUTPUT (run every item)

1. `<?xml ...?>` header present; single root `<scene>`; well-formed, all tags closed.
2. w×h set; every layer inside `totalTime`; `endTime > startTime`.
3. Every `id` unique. Every `<media>` referenced by a layer is declared, and vice-versa.
4. **Every `kf t` is 0.0–1.0**, never ms. Every ms field is an absolute ms.
5. **No two text/content layers overlap; every text box fits inside canvas** (Step 3 check).
6. Uploaded media scaled with fill/fit math so nothing is unexpectedly cropped or letterboxed.
7. Every effect id + param name/type exists in BLUEPRINT; values within range.
8. Colors are `#AARRGGBB`. `&` in font/attr values escaped as `&amp;`.

Output ONLY the XML file (plus a one-line note of any placeholders the user must relink).
When unsure of exact structure, copy the pattern from a matching file in `others/`.
