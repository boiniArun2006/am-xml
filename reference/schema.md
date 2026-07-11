# Alight Motion XML v5 Full Schema Reference

Generated from:

- 31 exported XML files
- 315 parsed bundled effect definitions
- 9 decompiled serializer sources
- Alight Motion 5.0.273 APK contents

This reference separates three confidence levels:

- **Serializer-confirmed**: directly present in decompiled read/write logic.
- **Export-confirmed**: observed in real Alight Motion exports.
- **Definition-confirmed**: declared by bundled effect or live-shape XML.

## 1. Root hierarchy

```xml
<scene ...>
  <media .../>
  <bookmark .../>
  <shape .../>
  <drawing .../>
  <embedScene .../>
  <text .../>
  <audio .../>
  <camera .../>
  <null .../>
</scene>
```

## 2. Top observed tags

| Tag | Observed count |
|---|---|
| property | 15443 |
| kf | 7357 |
| effect | 3181 |
| transform | 1428 |
| location | 1410 |
| scale | 1017 |
| shape | 980 |
| fillColor | 662 |
| bookmark | 453 |
| opacity | 281 |
| text | 267 |
| content | 265 |
| rotation | 238 |
| pivot | 203 |
| scene | 158 |
| media | 150 |
| embedScene | 127 |
| size | 108 |
| shadow | 82 |
| color | 67 |
| path-stroke | 55 |
| nullobj | 51 |
| gradient | 45 |
| border | 30 |
| gain | 28 |
| offset | 20 |
| path | 15 |
| audio | 13 |
| hardness | 9 |
| camera | 3 |
| fov | 3 |
| focus-blur | 3 |
| strength | 3 |
| depth-of-field | 3 |
| distance | 3 |
| fog | 3 |
| near-z | 3 |
| far-z | 3 |
| skew | 1 |

## 3. Layer types

| Layer XML tag | Observed count |
|---|---|
| shape | 980 |
| drawing | 0 |
| embedScene | 127 |
| text | 267 |
| audio | 13 |
| camera | 3 |
| null | 0 |

## 4. Easing families

| Easing | Observed count |
|---|---|
| linear | 0 |
| cubicBezier | 2438 |
| elastic | 38 |
| bounce | 0 |
| cyclic | 8 |
| random | 3 |
| step | 0 |
| elasticStep | 0 |
| local | 0 |
| reverse | 0 |

## 5. Property types

| Property type | Observed count |
|---|---|
| float | 9779 |
| int | 1019 |
| bool | 2534 |
| color | 717 |
| vec2 | 1241 |
| vec3 | 152 |
| vec4 | 0 |
| quat | 0 |
| uri | 0 |
| string | 0 |

## 6. Effects (top 120 by usage)

| Effect ID | Export usage | Bundled params |
|---|---|---|
| com.alightcreative.effects.motionblur4 | 320 | 5 |
| com.alightcreative.effects.tile | 284 | 6 |
| com.alightcreative.effects.lift | 208 | 3 |
| com.alightcreative.effects.exposure | 178 | 4 |
| com.alightcreative.effects.randomdisplace | 136 | 4 |
| com.alightcreative.effects.oscillate3 | 125 | 6 |
| com.alightcreative.effects.wavewarp2 | 124 | 10 |
| com.alightcreative.effects.gaussianblur | 106 | 5 |
| com.alightcreative.effects.pinchbulge2 | 105 | 4 |
| com.alightcreative.effects.satvib | 65 | 3 |
| com.alightcreative.effects.shake2 | 63 | 7 |
| com.alightcreative.effects.circularripple2 | 58 | 7 |
| com.alightcreative.effects.chromakey | 57 | 6 |
| com.alightcreative.effects.textspacing | 55 | 2 |
| com.alightcreative.effects.mirror | 50 | 5 |
| com.alightcreative.effects.wipe2 | 47 | 5 |
| com.alightcreative.effects.oscillate | 43 | 4 |
| com.alightcreative.effects.brightcont2 | 42 | 3 |
| com.alightcreative.effects.fractalwarp4 | 41 | 8 |
| com.alightcreative.effects.rgbsep | 41 | 5 |
| com.alightcreative.effects.turbulentdisplace3 | 38 | 13 |
| com.alightcreative.effects.motionblur3 | 37 | 5 |
| com.alightcreative.effects.swing | 37 | 5 |
| com.alightcreative.internal.smoothbevel | 33 | 12 |
| com.alightcreative.gradientoverlay2 | 32 | 9 |
| com.alightcreative.effects.blink2 | 30 | 1 |
| com.alightcreative.effects.hueshift | 30 | 2 |
| com.alightcreative.effects.fade | 29 | 2 |
| com.alightcreative.effects.colorhot | 28 | 3 |
| com.alightcreative.effects.dblur | 27 | 3 |
| com.alightcreative.effects.edgeglow | 25 | 14 |
| com.alightcreative.effects.softglow | 25 | 11 |
| com.alightcreative.effects.invert | 24 | 4 |
| com.alightcreative.solidcolor | 22 | 4 |
| com.alightcreative.effects.highlightshadow | 20 | 3 |
| com.alightcreative.effects.sharpen | 20 | 3 |
| com.alightcreative.effects.vignette | 20 | 8 |
| com.alightcreative.effects.colorize | 19 | 2 |
| com.alightcreative.effects.mosaic | 17 | 4 |
| com.alightcreative.effects.stripes | 16 | 9 |
| com.alightcreative.effects.halftonelines | 15 | 7 |
| com.alightcreative.effects.swing2 | 14 | 5 |
| com.alightcreative.spectralmap | 14 | 11 |
| com.alightcreative.effects.drawing.progress | 13 | 2 |
| com.alightcreative.effects.shake | 13 | 6 |
| com.alightcreative.effects.threshold | 13 | 5 |
| com.alightcreative.effects.colortemperature | 12 | 3 |
| com.alightcreative.effects.texttransform | 12 | 18 |
| com.alightcreative.effects.halftonedots | 10 | 7 |
| com.alightcreative.effects.colortune2 | 9 | 5 |
| com.alightcreative.glow | 9 | 8 |
| com.alightcreative.effects.displacemap3 | 8 | 8 |
| com.alightcreative.effects.motionblur | 8 | 5 |
| com.alightcreative.replacecolor | 8 | 7 |
| com.alightcreative.effects.circularripple | 7 | 7 |
| com.alightcreative.effects.counter | 7 | 2 |
| com.alightcreative.effects.extrude | 7 | 23 |
| com.alightcreative.effects.innerblur | 7 | 4 |
| com.alightcreative.effects.streaks | 7 | 9 |
| com.alightcreative.effects.electricedges | 6 | 24 |
| com.alightcreative.effects.flip3 | 6 | 17 |
| com.alightcreative.effects.transform | 6 | 8 |
| com.alightcreative.effects.boxblur3 | 5 | 4 |
| com.alightcreative.effects.offset | 5 | 4 |
| com.alightcreative.effects.stretch2 | 5 | 4 |
| com.alightcreative.effects.oscillate2 | 4 | 5 |
| com.alightcreative.effects.parenthelper | 4 | 6 |
| com.alightcreative.effects.darkglow | 3 | 9 |
| com.alightcreative.effects.pinchbulge | 3 | 4 |
| com.alightcreative.effects.rays | 3 | 9 |
| com.alightcreative.inner-glow | 3 | 7 |
| com.alightcreative.spotcolor2 | 3 | 6 |
| com.alightcreative.effects.bendwarp | 2 | 7 |
| com.alightcreative.effects.checker2 | 2 | 8 |
| com.alightcreative.effects.colorbalance | 2 | 11 |
| com.alightcreative.effects.feather | 2 | 6 |
| com.alightcreative.effects.findedges | 2 | 4 |
| com.alightcreative.effects.lightglow | 2 | 11 |
| com.alightcreative.effects.longshadow2 | 2 | 9 |
| com.alightcreative.effects.pulseopacity2 | 2 | 4 |
| com.alightcreative.effects.repeat.scatter | 2 | 21 |
| com.alightcreative.effects.simplestars2 | 2 | 10 |
| com.alightcreative.effects.smoothedges | 2 | 6 |
| com.alightcreative.effects.channelmap | 1 | 5 |
| com.alightcreative.effects.displacemaprad | 1 | 10 |
| com.alightcreative.effects.flicker2 | 1 | 4 |
| com.alightcreative.effects.pixelate2 | 1 | 9 |
| com.alightcreative.effects.radialwipe | 1 | 7 |
| com.alightcreative.effects.repeat.path | 1 | 22 |
| com.alightcreative.effects.roughenedges | 1 | 6 |
| com.alightcreative.effects.spill-cleanup | 1 | 5 |
| com.alightcreative.effects.squeeze | 1 | 2 |
| com.alightcreative.effects.swirl4 | 1 | 4 |
| com.alightcreative.effects.turbulence2 | 1 | 14 |
| com.alightcreative.fourcolorgradient | 1 | 12 |
| com.alightcreative.blend.color | 0 | 2 |
| com.alightcreative.blend.colorburn | 0 | 2 |
| com.alightcreative.blend.colordodge | 0 | 2 |
| com.alightcreative.blend.colormultiply | 0 | 2 |
| com.alightcreative.blend.darken | 0 | 2 |
| com.alightcreative.blend.darkercolor | 0 | 2 |
| com.alightcreative.blend.diff | 0 | 2 |
| com.alightcreative.blend.divide | 0 | 2 |
| com.alightcreative.blend.exclusion | 0 | 2 |
| com.alightcreative.blend.hardlight | 0 | 2 |
| com.alightcreative.blend.hue | 0 | 2 |
| com.alightcreative.blend.lighten | 0 | 2 |
| com.alightcreative.blend.lightercolor | 0 | 2 |
| com.alightcreative.blend.linearburn | 0 | 2 |
| com.alightcreative.blend.lineardodge | 0 | 2 |
| com.alightcreative.blend.linearlight | 0 | 2 |
| com.alightcreative.blend.luminance | 0 | 2 |
| com.alightcreative.blend.overlay | 0 | 2 |
| com.alightcreative.blend.pinlight | 0 | 2 |
| com.alightcreative.blend.saturation | 0 | 2 |
| com.alightcreative.blend.softlight | 0 | 2 |
| com.alightcreative.blend.softoverlay | 0 | 2 |
| com.alightcreative.blend.subtract | 0 | 2 |
| com.alightcreative.blend.vividlight | 0 | 2 |
| com.alightcreative.contour | 0 | 10 |

## 7. Parse errors

Export parse errors: 0
Effect definition parse errors: 0
