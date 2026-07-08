# Alight Motion — Full Blueprint (from app v5.0.272 APK assets)

_Extracted from `assets/effects/` in your installed APK: **311 effect definitions**, plus format schema verified against 26 real exports. This is the app's own ground truth — param ids, types, defaults and ranges are exactly what the effect accepts._

## Parameter type system (widget → meaning in `<property>`)

| widget | value type | notes |
|---|---|---|
| `spinner` / `slider` / `float` | number | has `min`/`max`/`step`; some `type="angle"` (degrees) |
| `switch` | bool | `true`/`false` |
| `color` | `#AARRGGBB` | alpha first |
| `selector` | int enum | integer `value=`; see options per effect in JSON |
| `point` | `x,y` | vec2 |
| `xyz` | `x,y,z` | vec3 |
| `hue-disc` | number | hue wheel |
| `orient` | number | orientation |

Each `<property name="<id>" value="...">` (or animated with `<kf>`) uses the **param `id`** below.

## Blend-mode enum (used by many effects' `blendMode` selector)
`0`=normal `1`=multiply `2`=screen `3`=over `4`=under (plus dedicated `blend-*` effects for the full 25-mode set)

## Effects by category (311 total)

**3d** (26): `box`, `cube`, `cube2`, `cylinder`, `ellipsoid`, `extrude`, `flip`, `flip2`, `flip3`, `heart`, `heart2`, `hexprism`, `hollowbox`, `octahedron`, `pagecurl`, `plus`, `pyramid`, `ring`, `spherize`, `spherize2`, `starpoly`, `starprism`, `torus`, `triprism`, `triprism2`, `tunnel`

**blur** (30): `boxblur`, `boxblur2`, `boxblur3`, `chromaticvortexblur`, `chromaticzoomblur`, `dblur`, `fastboxblur`, `gaussianblur`, `innerblur`, `lensblur`, `lensblur2`, `maskblur`, `mosaic`, `motionblur`, `motionblur2`, `motionblur3`, `motionblur4`, `sharpen`, `spinblur`, `spinblur2`, `streaks`, `streaks-spin`, `streaks-zoom`, `streakstrips`, `unsharpmask`, `vortexblur`, `warpblur`, `zoomblur`, `zoomblur2`, `zoomblur3`

**color** (44): `brightcont`, `brightcont2`, `bumpmap`, `bumpmap2`, `cartoon`, `coloradj`, `colorbalance`, `colorhot`, `colorhot2`, `colorize`, `colortemperature`, `colortint`, `colortune`, `colortune2`, `darkglow`, `diff`, `exposure`, `fourcolorgradient`, `gradientmap`, `gradientoverlay`, `gradientoverlay2`, `highlightshadow`, `hueshift`, `invert`, `layernormtest`, `lightglow`, `longshadow`, `longshadow2`, `palettemap`, `posterize`, `radialshadow`, `radialshadow2`, `rays`, `replacecolor`, `rgb-gamma`, `rgb-mixer`, `rgbsep`, `satvib`, `softglow`, `solidcolor`, `spectralmap`, `spotcolor`, `spotcolor2`, `threshold`

**distort** (46): `360-reorient-sphere`, `bendwarp`, `circularripple`, `circularripple2`, `curl`, `displacemap`, `displacemap2`, `displacemap3`, `displacemaprad`, `fractalwarp`, `fractalwarp2`, `fractalwarp3`, `fractalwarp4`, `glass`, `glass2`, `gradientdisplace`, `hexrotate`, `hexshift`, `hextile`, `kaleidoscope`, `mirror`, `ominoglass`, `pinchbulge`, `pinchbulge2`, `pinchbulgeinside`, `pixelate`, `pixelate2`, `polar`, `squeeze`, `stretchsegment`, `swirl`, `swirl2`, `swirl3`, `swirl4`, `tile`, `tilerotate`, `tilerotate2`, `tileshift`, `tileshift2`, `turbulentdisplace`, `turbulentdisplace2`, `turbulentdisplace3`, `vrcombined`, `vrplayer`, `wavewarp`, `wavewarp2`

**drawing** (18): `contour`, `contourgrad`, `edgeglow`, `electricedges`, `findedges`, `findedges-edgeglow`, `glow`, `glowscan`, `halftonedots`, `halftonedotscmyk`, `halftonelines`, `inner-glow`, `progress`, `roughenedges`, `smoothbevel`, `smoothedges`, `strokecolor`, `stroketaper`

**matte** (16): `chromakey`, `chromakey-adv`, `differencematte`, `lumakey`, `lumakey2`, `lumakey3`, `lumastamper`, `mattechoke`, `mattechoke`, `mattefringe`, `radialwipe`, `solidmatte`, `spill-cleanup`, `vignette`, `wipe`, `wipe2`

**opacity** (11): `blink`, `blink2`, `checkerdissolve`, `checkerdissolve2`, `dissolve`, `fade`, `feather`, `flicker`, `flicker2`, `pulseopacity`, `pulseopacity2`

**other** (47): `border`, `border-center`, `border-inside`, `border-outside`, `border-three`, `border-two`, `channelmap`, `channelmaphsv`, `color`, `colorburn`, `colordodge`, `colormultiply`, `darken`, `darkercolor`, `diff`, `divide`, `echokf`, `exclusion`, `fillbehind`, `hardlight`, `hue`, `lift`, `lighten`, `lightercolor`, `linearburn`, `lineardodge`, `linearlight`, `luminance`, `magnifybg`, `outline`, `outlinebad`, `outlinebasic`, `overlay`, `parenthelper`, `pinlight`, `saturation`, `shadow`, `shadow`, `softlight`, `softoverlay`, `subtract`, `test`, `test2`, `test3`, `testblur`, `timequant`, `vividlight`

**procedural** (39): `blocknoise`, `blocknoise2`, `checker`, `checker2`, `clouds`, `clouds2`, `clouds3`, `contourstrips`, `dots`, `dots2`, `energybeam`, `grid`, `grid2`, `grunge`, `hexarray`, `irridescence`, `irridescence2`, `lensflare`, `lightning`, `noise`, `noise2`, `noise3`, `ominodiff`, `radialrays`, `ribbon`, `ridges`, `ridges2`, `simplestars`, `simplestars2`, `star`, `starfield`, `starfield2`, `starfield3`, `stripes`, `turbulence`, `turbulence2`, `volumetricclouds`, `voronoi`, `voronoi2`

**repeat** (7): `grid`, `line`, `path`, `radial`, `repeat`, `scatter`, `shapefield`

**text** (6): `counter`, `textprogress`, `textrand`, `textspacing`, `texttransform`, `timecode`

**transform** (25): `facemotion`, `growparts`, `jitter`, `morphpath`, `movealongpath`, `movealongpath2`, `movealongpath3`, `offset`, `oscillate`, `oscillate2`, `oscillate3`, `perlindisplace`, `pulsate`, `pulsate2`, `randomdisplace`, `scaleassist`, `shake`, `shake2`, `shakeparts`, `spin`, `stretch`, `stretch2`, `swing`, `swing2`, `transform`

## Detailed params — effects seen in real exports (most-used first)

_Full param data for ALL 315 effects is in `effects_catalog.json`._

### `motionblur4`  ×211  _(blur)_
- `tune` (slider) default=`1.0` [0.0..4.0]
- `usePos` (switch) default=`true`
- `useScale` (switch) default=`true`
- `useAngle` (switch) default=`true`

### `tile`  ×195  _(distort)_
- `scale` (spinner) default=`1.0` [0.005..20.0]
- `phase` (spinner) default=`0.0` [-100.0..100.0]
- `mirror` (switch) default=`false`
- `vertoffs` (switch) default=`false`
- `angle` (spinner angle) default=`0.0` [-1800.0..1800.0]

### `lift`  ×190  _(other)_
- `fill` (spinner percent) default=`0.0` [0.0..1.0]

### `exposure`  ×169  _(color)_
- `exposure` (spinner) default=`0.0` [-2.0..2.0]
- `gamma` (spinner) default=`1.0` [0.01..9.99]
- `offset` (spinner) default=`0.0` [-0.9..0.9]

### `randomdisplace`  ×126  _(transform)_
- `mag` (spinner) default=`50` [0..2000]
- `evolution` (spinner) default=`0` [0..2000]
- `seed` (spinner) default=`0` [0..5]
- `scatter` (spinner percent) default=`0.5` [0..2]

### `oscillate3`  ×125  _(transform)_
- `direction` (selector) default=`0` opts={"0": "angle", "1": "depth", "2": "orbit"}
- `angle` (spinner angle) default=`45` [-3600.0..3600.0]
- `freq` (spinner hz) default=`2.0` [0.0..16.0]
- `mag` (spinner) default=`25` [0..4000]
- `type` (selector) default=`0` opts={"0": "sine", "1": "triangle"}
- `phase` (spinner) default=`0.0` [0.0..1000.0]

### `wavewarp2`  ×124  _(distort)_
- `phase` (spinner) default=`0` [0..500.0]
- `a1d` (spinner angle) default=`0.0` [-1800.0..1800.0]
- `m1` (spinner) default=`20` [0..500.0]
- `m2` (spinner) default=`4` [0..30.0]
- `a2d` (spinner angle) default=`90.0` [-180.0..180.0]
- `damping` (spinner percent) default=`0` [-1..1]
- `dampingSpace` (spinner percent) default=`0` [-1..1]
- `dampingOrigin` (spinner) default=`0.5` [0..1]
- `screenSpace` (switch) default=`false`

### `pinchbulge2`  ×103  _(distort)_
- `centerPoint` (point) default=`None`
- `strength` (spinner) default=`-0.9` [-1..1]
- `radius` (spinner) default=`0.3` [0.0..2.5]

### `gaussianblur`  ×101  _(blur)_
- `strength` (spinner) default=`0.15` [0.0..2.0]

### `satvib`  ×62  _(color)_
- `saturation` (spinner relative-percent) default=`0.0` [-1.0..1.0]
- `vib` (spinner) default=`1.0` [1.0..2.0]

### `chromakey`  ×57  _(matte)_
- `keyColor` (color) default=`#FF00FF00`
- `threshold` (spinner) default=`0.10` [0.0..1.0]
- `feather` (spinner) default=`0.05` [0.01..0.75]
- `defringe` (switch) default=`false`
- `invert` (switch) default=`false`

### `shake2`  ×53  _(transform)_
- `mag` (spinner) default=`50` [0..2000]
- `freq` (spinner hz) default=`2.0` [0.0..16.0]
- `evolution` (spinner) default=`0` [0..2000]
- `seed` (spinner) default=`0` [0..5]
- `angle` (spinner angle) default=`45.0` [0.0..3600.0]
- `slack` (spinner percent) default=`0.25` [0..1]
- `zshake` (spinner) default=`0` [0..2000]

### `circularripple2`  ×52  _(distort)_
- `centerPoint` (point) default=`None`
- `frequency` (spinner) default=`20` [0..100]
- `strength` (spinner) default=`0.025` [-1..1]
- `phase` (spinner) default=`0` [-1000..1000.0]
- `radius` (spinner) default=`0.3` [0.0..0.8]
- `feather` (spinner) default=`0.1` [0.001..1.0]

### `mirror`  ×50  _(distort)_
- `type` (selector) default=`0` opts={"0": "horizontal", "1": "vertical"}
- `blendMode` (selector) default=`0` opts={"0": "normal", "3": "over", "4": "under", "1": "multiply", "2": "screen"}
- `alpha` (spinner percent) default=`1.0` [0..1]
- `offset` (spinner percent) default=`0.0` [-2..2]

### `oscillate`  ×43  _(transform)_
- `angle` (spinner angle) default=`45` [0.0..180.0]
- `freq` (spinner) default=`2.0` [0.1..16.0]
- `mag` (slider) default=`25` [1..500]
- `type` (selector) default=`0` opts={"0": "sine", "1": "triangle"}

### `fractalwarp4`  ×41  _(distort)_
- `offs` (point) default=`None`
- `parr` (point) default=`None`
- `mag` (spinner) default=`0.2` [-5.0..5.0]
- `scale` (spinner) default=`1.0` [0.1..4.0]
- `intensity` (spinner) default=`0.5` [0.25..0.75]
- `screenSpace` (switch) default=`false`
- `octaves` (slider integer) default=`6` [1..9]

### `rgbsep`  ×41  _(color)_
- `strength` (spinner) default=`0.15` [-8.0..8.0]
- `angle` (spinner angle) default=`0.0` [0.0..3600.0]
- `centerChannel` (selector) default=`1` opts={"0": "R", "1": "G", "2": "B"}
- `mode` (selector) default=`2` opts={"2": "mode_light", "3": "mode_dark", "0": "mode_mask", "1": "mode_luma"}

### `brightcont2`  ×40  _(color)_
- `brightness` (spinner relative-percent) default=`0.0` [-1.0..1.0]
- `contrast` (spinner relative-percent) default=`0.0` [-1.0..3.0]

### `turbulentdisplace3`  ×38  _(distort)_
- `parr` (point) default=`None`
- `position` (point) default=`None`
- `intensity` (spinner) default=`0.25` [0.0..2.5]
- `evolution` (spinner) default=`0.0` [-50..50]
- `direction` (selector) default=`4` opts={"5": "\u03c6", "3": "r", "4": "\u03c6r", "0": "X", "1": "Y", "2": "XY"}
- `scale` (spinner) default=`1.0` [0.01..50.0]
- `stretch` (point) default=`1.0, 1.0` [0.01,0.01..10, 10]
- `seed` (spinner) default=`0.0` [0.0..5.0]
- `singleAxis` (switch) default=`true`
- `screenSpace` (switch) default=`false`
- `octaves` (slider integer) default=`6` [1..9]
- `offs` (spinner) default=`0.0` [-1..1]

### `wipe2`  ×37  _(matte)_
- `start` (spinner percent) default=`0.0` [-0.5..1.5]
- `end` (spinner percent) default=`1.0` [-0.5..1.5]
- `angle` (spinner angle) default=`0.0` [0.0..3600.0]
- `feather` (spinner) default=`0.0` [0.0..100.0]

### `swing`  ×37  _(transform)_
- `freq` (spinner) default=`2.0` [0.1..16.0]
- `a1` (spinner angle) default=`-30` [-180.0..180.0]
- `a2` (spinner angle) default=`30` [-180.0..180.0]
- `phase` (spinner) default=`0` [0..2]
- `type` (selector) default=`0` opts={"0": "sine", "1": "triangle"}

### `motionblur3`  ×37  _(blur)_
- `tune` (slider) default=`1.0` [0.0..4.0]
- `usePos` (switch) default=`true`
- `useScale` (switch) default=`true`
- `useAngle` (switch) default=`true`

### `gradientoverlay2`  ×32  _(color)_
- `color1` (color) default=`#FFEE5533`
- `color2` (color) default=`#FFFFEE88`
- `angle` (spinner angle) default=`0.0` [0.0..3600.0]
- `offset` (point) default=`None`
- `scale` (spinner) default=`1.0` [0.1..10.0]
- `alpha` (spinner percent) default=`0.75` [0.0..1.0]
- `gradType` (selector) default=`0` opts={"0": "grad_linear", "1": "grad_radial", "2": "grad_sweep"}
- `blendMode` (selector) default=`None` opts={"0": "normal", "1": "multiply", "2": "screen"}

### `blink2`  ×30  _(opacity)_
- `freq` (spinner hz) default=`2.0` [0.1..16.0]

### `fade`  ×29  _(opacity)_
- `inTime` (spinner seconds) default=`0.5` [0.0..10.0]
- `outTime` (spinner seconds) default=`0.5` [0.0..10.0]

### `dblur`  ×27  _(blur)_
- `strength` (spinner) default=`0.15` [0.0..1.0]
- `angle` (spinner angle) default=`0.0` [0.0..3600.0]

### `edgeglow`  ×25  _(drawing)_
- `smoothing` (spinner) default=`5.` [1...10.]
- `threshold` (spinner) default=`0.7` [0...1.]
- `invert` (switch) default=`false`
- `strength` (spinner) default=`0.1` [0.0..2.0]
- `spread` (spinner) default=`1.5` [0.0..3.0]
- `fillColor` (color) default=`#FF0088FF`
- `blend` (slider percent) default=`0.00` [0.0..2]
- `gamma` (spinner) default=`1.0` [0.01..9.99]
- `brightness` (spinner relative-percent) default=`0.0` [-1.0..1.0]
- `tintColor` (color) default=`#FF000000`
- `tint` (spinner percent) default=`0.0` [0.0..1.0]

### `softglow`  ×25  _(color)_
- `strength` (spinner) default=`0.1` [0.0..2.0]
- `brightness` (spinner percent) default=`1.00` [0.0..2]
- `contrast` (spinner percent) default=`0.2` [0.0..1]
- `highlights` (spinner percent) default=`0.5` [0.0..1]
- `color` (color) default=`#FFFF5566`
- `blend` (slider percent) default=`0.25` [0.0..1]
- `alpha` (spinner percent) default=`1.00` [0.0..1]
- `outsideAlpha` (spinner percent) default=`0.00` [0.0..1]

### `hueshift`  ×25  _(color)_
- `hue` (spinner angle) default=`0.0` [0.0..3600.0]

### `colorhot`  ×25  _(color)_
- `color` (hue-disc) default=`0,1,0`
- `tint` (hue-disc) default=`60,1,0`

### `solidcolor`  ×22  _(color)_
- `color` (color) default=`#FF2D1EF6`
- `alpha` (spinner percent) default=`1.0` [0.0..1.0]
- `blendMode` (selector) default=`None` opts={"0": "normal", "1": "multiply", "2": "screen"}

### `invert`  ×22  _(color)_
- `invertRed` (switch) default=`true`
- `invertGreen` (switch) default=`true`
- `invertBlue` (switch) default=`true`

### `highlightshadow`  ×20  _(color)_
- `highlights` (spinner percent) default=`1.0` [0.0..2.0]
- `shadows` (spinner percent) default=`1.0` [0.0..2.0]

### `vignette`  ×20  _(matte)_
- `scale` (spinner percent) default=`0.95` [0.001..2.0]
- `roundness` (spinner percent) default=`1.5` [0.0..9.9]
- `feather` (spinner) default=`0.5` [0.001..1.0]
- `strength` (spinner) default=`0.8` [0.0..1.0]
- `tint` (spinner percent) default=`0.2` [0.0..1.0]
- `overlaycolor` (color) default=`#FF000000`
- `punchout` (switch) default=`false`

### `sharpen`  ×20  _(blur)_
- `strength` (spinner) default=`1.` [0...20.]
- `radius` (spinner) default=`1.` [1...10.]

### `colorize`  ×19  _(color)_
- `tint` (hue-disc) default=`None`

### `mosaic`  ×17  _(blur)_
- `size` (spinner) default=`10.` [1.0..500.0]
- `phase` (point) default=`None`

### `stripes`  ×16  _(procedural)_
- `amount` (spinner) default=`10.0` [0.5..200.0]
- `width` (spinner) default=`0.5` [0.0..1.0]
- `angle` (spinner angle) default=`45.0` [0.0..3600.0]
- `phase` (spinner) default=`0.0` [0.0..1000.0]
- `color` (color) default=`#FF2D1EF6`
- `punchout` (switch) default=`false`
- `smoothing` (spinner) default=`0.01` [0.0..0.5]
- `screenSpace` (switch) default=`false`

### `halftonelines`  ×15  _(drawing)_
- `amount` (spinner) default=`100` [0..500]
- `strength` (spinner) default=`0.5` [0..1]
- `angle` (spinner angle) default=`45.0` [0.0..3600.0]
- `phase` (spinner) default=`0` [-1000..1000.0]
- `color1` (color) default=`#FF113355`
- `color2` (color) default=`#FFFFEEDD`

### `swing2`  ×14  _(transform)_
- `freq` (spinner hz) default=`2.0` [0.1..16.0]
- `a1` (spinner angle) default=`-30` [-180.0..180.0]
- `a2` (spinner angle) default=`30` [-180.0..180.0]
- `phase` (spinner) default=`0` [0..2]
- `type` (selector) default=`0` opts={"0": "sine", "1": "triangle"}

### `spectralmap`  ×14  _(color)_
- `phase` (spinner) default=`0.0` [-99.0..99.0]
- `repeat` (spinner) default=`1.0` [0.1..10.0]
- `alpha` (spinner) default=`1.0` [0.0..1.0]
- `squeeze` (spinner) default=`0.0` [0.0..1.0]
- `saturation` (spinner) default=`0.0` [-1.0..1.0]
- `redColor` (color) default=`#FFFF0000`
- `greenColor` (color) default=`#FF00FF00`
- `blueColor` (color) default=`#FF0000FF`
- `reverse` (switch) default=`false`
- `scaleBrightness` (switch) default=`false`

### `shake`  ×13  _(transform)_
- `mag` (spinner) default=`50` [0..2000]
- `speed` (spinner) default=`1` [0..2000]
- `evolution` (spinner) default=`0` [0..2000]
- `seed` (spinner) default=`0` [0..5]
- `angle` (spinner angle) default=`45.0` [0.0..3600.0]
- `slack` (spinner percent) default=`0.25` [0..1]

### `threshold`  ×13  _(color)_
- `threshold` (spinner) default=`0.4` [0.0..1.0]
- `feather` (spinner) default=`0.0` [0.0..1.0]
- `invert` (switch) default=`false`
- `blendMode` (selector) default=`0` opts={"0": "normal", "1": "multiply", "2": "screen"}

### `colortemperature`  ×12  _(color)_
- `temperature` (spinner kelvin) default=`6.5` [1.0..40.0]
- `strength` (spinner percent) default=`1.0` [0.0..1.0]

### `texttransform`  ×12  _(text)_
- `start` (spinner percent) default=`0.0` [0.0..1.0]
- `end` (spinner percent) default=`1.0` [0.0..1.0]
- `phase` (spinner percent) default=`0.0` [-1.0..2.0]
- `component` (selector) default=`1` opts={"0": "component_contour", "1": "component_letter", "2": "component_word", "3": "component_line"}
- `anchor` (selector) default=`0` opts={"0": "layer", "1": "component"}
- `offset` (point) default=`0.0,0.0`
- `angle` (spinner angle) default=`0.0` [-1800.0..1800.0]
- `scale` (spinner) default=`0.0` [-1.0..10.0]
- `stretch` (spinner) default=`0.0` [-1.0..10.0]
- `alpha` (spinner) default=`0` [-1..1]
- `useFillColor` (switch) default=`false`
- `fillColor` (color) default=`#FF00FF00`
- `easeIn` (slider percent) default=`0` [-1..1]
- `easeOut` (slider percent) default=`0` [-1..1]
- `overlap` (spinner percent) default=`0` [0..10]
- `shape` (selector) default=`0` opts={"0": "square", "1": "smooth", "2": "triangle"}
- `randomOrder` (switch) default=`false`
- `seed` (spinner) default=`0.0` [0.0..5.0]
