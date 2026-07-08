# Alight Motion XML — Master Reference
_Reverse-engineered from 26 real 2025 exports (app v5.x) + the open-source `ruwwww/am-renderer` (parser types + effects catalog). Verified against real data._

## 1. The two time systems (MOST COMMON BUG)
| Where | Unit | Example |
|---|---|---|
| `scene.totalTime`, layer `startTime`/`endTime`, `<bookmark t>` | **milliseconds** | `startTime="2016"` = 2.016s |
| `<kf t="...">` inside any property | **normalized 0.0–1.0** of that layer's duration | `t="0.5"` = layer midpoint |
Putting ms into `kf t` collapses all keyframes to the start. Normalize: `kf_t = (time_ms - layer.startTime) / (layer.endTime - layer.startTime)`.

## 2. Root
```xml
<scene title="" width="1920" height="1080" exportWidth="1920" exportHeight="1080"
       fps="60" totalTime="4031" bgcolor="#ff000000" precompose="dynamicResolution"
       amver="1028383" am="com.alightcreative.motion/5.0.272" amplatform="android">
```
- `bgcolor` / all colors = **`#AARRGGBB`** (alpha FIRST).
- Coordinates = **pixels, scene space**. `location="960,540,0"` = center of 1920×1080. Origin top-left. 3rd value = z/depth.

## 3. Layers (children of <scene>)
`<shape>` `<text>` `<media>` `<embedScene>` (precomp) `<audio>`
Common attrs: `id` · `label` · `startTime`/`endTime` (ms) · `parent` (id of parent layer) · `hidden` · `blending` · `fillType` · `s` (shape primitive).
- **z-order = document order** (later = on top). Overlap? everything defaults to center 960,540 until you set `<location>`.

### Shape primitives (`s=`)
- `.rect` ×618
- `.roundrect` ×143
- `.circle` ×23
- `.line` ×2
- `.arc` ×2
- `.pie` ×1
- `.triangle` ×1

### fillType
- `color` ×562
- `media` ×398
- `intrinsic` ×109
- `gradient` ×39
- `none` ×28

### Blending modes seen
- `screen` ×28
- `overlay` ×23
- `mask` ×18
- `multiply` ×13
- `soft-overlay` ×13
- `hard-light` ×5
- `soft-light` ×4
- `subtract` ×4
- `lighten` ×3
- `linear-dodge` ×3
- `darken` ×2
- `lighter-color` ×2
- `color-dodge` ×2
- `color-burn` ×2
- `diff` ×2
- `color` ×1
- `saturation` ×1
- `exclude` ×1
- `darker-color` ×1
- `linear-burn` ×1

## 4. Transform (animatable)
```xml
<transform>
  <location value="960,540,0"/>              <!-- static -->
  <scale><kf t="0" v="1,1"/><kf t="1" v="2,2"/></scale>  <!-- animated -->
  <rotation value="0"/>      <!-- degrees -->
  <opacity value="1"/>       <!-- 0..1 -->
  <pivot value="..."/>
</transform>
```
Any of location/scale/rotation/opacity is **static** (`value=`) OR **animated** (child `<kf>` list).

## 5. Keyframes & easing
```xml
<kf t="0.0" v="960,540,0" e="cubicBezier 0.42 0.0 1.0 1.0"/>
```
- `t` normalized (see §1) · `v` comma-separated value · `e` easing (optional; omit = linear/hold).
- Easing families in real files: `cubicBezier`, `elastic`, `cyclic`, `random`
- `e` format: `cubicBezier x1 y1 x2 y2` (standard bezier control pts). Also `elastic ...`, `cyclic ...`. May be prefixed `local ` (per-segment space).

## 6. Fonts (YOUR "MISSING FONT" BUG)
Two schemes:
- **`googlefonts?name=Roboto&weight=400[&italic=1]`** → auto-resolves, always works.
- **`imported?name=SomeFont.ttf`** → requires that font file to already be **imported in your app**. Hand-written XML referencing an imported font you don't have = font falls back / goes missing. Use googlefonts for portable edits.

Google fonts used in corpus:
- `googlefonts?name=Roboto&weight=900` ×15
- `googlefonts?name=Roboto&weight=700&italic=1` ×7
- `googlefonts?name=Roboto&weight=400` ×5
- `googlefonts?name=Roboto&weight=700` ×4
- `googlefonts?name=Muli&weight=900&italic=1` ×3
- `googlefonts?name=Montserrat&weight=800` ×2
- `googlefonts?name=Merienda&weight=700` ×1
- `googlefonts?name=Montserrat&weight=900` ×1
- `googlefonts?name=Muli&weight=900` ×1
- `googlefonts?name=Open Sans&weight=800` ×1
- `googlefonts?name=Open Sans&weight=800&italic=1` ×1

Imported fonts referenced (need the .ttf/.otf present):
- `imported?name=ultine-cond-demi.ttf` ×44
- `imported?name=inter-extra-bold.ttf` ×30
- `imported?name=Coolvetica Rg.otf` ×26
- `imported?name=American Captain.ttf` ×10
- `imported?name=Inter_18pt-Black.ttf` ×7
- `imported?name=Road_Rage.otf` ×7
- `imported?name=Wayland DEMO.ttf` ×6
- `imported?name=Touche-Bold-BF642a2ec04a3ad.ttf` ×5
- `imported?name=Coolvetica Rg.ttf` ×4
- `imported?name=Laffayette_Comic_Pro.ttf` ×4
- `imported?name=Uni Sans Heavy.otf` ×4
- `imported?name=pdark.ttf` ×4
- `imported?name=FontsFree-Net-SFProDisplay-Bold.ttf` ×3
- `imported?name=GalanoGrotesqueBold.ttf` ×3
- `imported?name=BANDICO-Bold.ttf` ×2
- `imported?name=FredokaOne-Regular.ttf` ×2
- `imported?name=LuckiestGuy-Regular.ttf` ×2
- `imported?name=RBNo3.1-Black.otf` ×2
- `imported?name=Fighting Spirit 2.ttf` ×1
- `imported?name=Futura PT Bold.ttf` ×1
- `imported?name=Ghastly_Panic.ttf` ×1
- `imported?name=Hey Comic.ttf` ×1
- `imported?name=LEMONMILK-Regular.otf` ×1
- `imported?name=Poppins-Bold.ttf` ×1
- `imported?name=Sectar.ttf` ×1

## 7. Effects
```xml
<effect id="com.alightcreative.effects.gaussianblur" locallyApplied="true">
  <property name="radius" type="float" value="12.0"/>
  <property name="feather"><kf t="0" v="0"/><kf t="1" v="20"/></property>
</effect>
```
- Applied in stack order. `<property>` is static (`value=`) or animated (`<kf>`).
- **105 distinct effects observed** across the corpus:
- `motionblur4` ×211
- `tile` ×195
- `lift` ×190
- `exposure` ×169
- `randomdisplace` ×126
- `oscillate3` ×125
- `wavewarp2` ×124
- `pinchbulge2` ×103
- `deepglow2` ×102
- `gaussianblur` ×101
- `satvib` ×62
- `chromakey` ×57
- `shake2` ×53
- `circularripple2` ×52
- `mirror` ×50
- `oscillate` ×43
- `fractalwarp4` ×41
- `rgbsep` ×41
- `brightcont2` ×40
- `turbulentdisplace3` ×38
- `wipe2` ×37
- `swing` ×37
- `motionblur3` ×37
- `internal.smoothbevel` ×33
- `gradientoverlay2` ×32
- `blink2` ×30
- `fade` ×29
- `dblur` ×27
- `edgeglow` ×25
- `softglow` ×25
- `hueshift` ×25
- `colorhot` ×25
- `solidcolor` ×22
- `invert` ×22
- `highlightshadow` ×20
- `vignette` ×20
- `sharpen` ×20
- `colorize` ×19
- `mosaic` ×17
- `stripes` ×16
- `extrudeflat` ×16
- `halftonelines` ×15
- `swing2` ×14
- `spectralmap` ×14
- `shake` ×13
- `threshold` ×13
- `drawing.progress` ×13
- `colortemperature` ×12
- `texttransform` ×12
- `halftonedots` ×10
- `textspacing` ×10
- `dropshadow` ×10
- `colortune2` ×9
- `glow` ×9
- `transform2` ×9
- `motionblur` ×8
- `replacecolor` ×8
- `displacemap3` ×8
- `counter` ×7
- `circularripple` ×7
- `innerblur` ×7
- `extrude` ×7
- `transform` ×6
- `electricedges` ×6
- `flip3` ×6
- `gradshadow` ×6
- `stretch2` ×5
- `boxblur3` ×5
- `offset` ×5
- `oscillate2` ×4
- `partx` ×4
- `gradientflow` ×4
- `parenthelper` ×4
- `pinchbulge` ×3
- `rays` ×3
- `darkglow` ×3
- `spotcolor2` ×3
- `inner-glow` ×3
- `bendwarp` ×2
- `feather` ×2
- `longshadow2` ×2
- `lightglow` ×2
- `colorbalance` ×2
- `pulseopacity2` ×2
- `findedges` ×2
- `checker2` ×2
- `simplestars2` ×2
- `repeat.scatter` ×2
- `3colorgrad` ×2
- `smoothedges` ×2
- `squeeze` ×1
- `flicker2` ×1
- `swirl4` ×1
- `displacemaprad` ×1
- `fourcolorgradient` ×1
- `channelmap` ×1
- `roughenedges` ×1
- `pixelate2` ×1
- `spill-cleanup` ×1
- `moblurplus` ×1
- `edgeline` ×1
- `repeat.path` ×1
- `turbulence2` ×1
- `radialwipe` ×1
- `lightsweep` ×1

## 8. Text layer
```xml
<text id="..." startTime="0" endTime="2015" fillType="color"
      size="18" font="googlefonts?name=Roboto&weight=400" wrapWidth="512" align="left">
  <transform><location value="960,540,0"/></transform>
  <fillColor value="#ffffffff"/>
  <content>your text</content>
</text>
```
`size` scales with the layer's transform scale — oversized text usually = a scale keyframe, not the `size` attr.

## 9. Media / gradient
- `<media uri="am-internal:///HASH.PNG" type="image/png" .../>` — assets are content-hashed; external media won't exist unless re-linked.
- `<gradient type="linear" startColor="#.." endColor="#.." start="x,y" end="x,y"/>` (positions normalized 0..1).
