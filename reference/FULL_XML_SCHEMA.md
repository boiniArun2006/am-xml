# Alight Motion XML v5.0.273 Reference

Grounded in 31 real exports, 315 bundled
effect definitions, and 9 serializer sources.

## Root
`scene` contains media, bookmarks, and layers.

## Layer tags
`shape`, `drawing`, `embedScene`, `text`, `audio`, `camera`, `null`

## Transform
Children: `location`, `pivot`, `scale`, `rotation`, `opacity`, `skew`.
Attributes: `orientation`, `size`, `lockAspectRatio`.

## Keyframes
Static values use `value`. Animated values use `kf` children with:
`t`, `v`, optional `e` easing, and optional `s="auto"` smoothing.

Supported easing grammar:
`linear`, `cubicBezier`, `elastic`, `bounce`, `cyclic`, `random`, `step`, `elasticStep`, `local`, `reverse`

## Property types
`float`, `int`, `bool`, `color`, `vec2`, `vec3`, `vec4`, `quat`, `uri`, `string`

## Fills and decoration
Fill types: `none`, `intrinsic`, `color`, `media`, `gradient`.
Gradients: `linear`, `radial`, `sweep`.
Decorations: `border`, `shadow`, `glow`, `path-stroke`.

## Effects
Effects use `effect` containing typed `property` values. See
`reference/effects_catalog_v5.json` for the extracted parameter catalog.

## Evidence
`reference/schema_inventory.json` contains observed tags, attributes,
relationships, easing usage, animator types, and parse errors.
