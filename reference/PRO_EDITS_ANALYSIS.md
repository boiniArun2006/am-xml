# Pro AMV Edits — Reverse-Engineered (ROBO EDITS, 2026)

_3 complete pro edits pulled with their real `.xml` + assets from a shared Drive folder (via Kaggle, zero phone bandwidth): Spider-Man, Iron Man, CR7. All by "ROBO EDITS". Plus a 32-min YouTube AM tutorial (screen-recorded editor UI) confirming the workflow from the inside._

## The shared formula (all 3 edits are near-identical in construction)
| | Spider-Man | Iron Man | CR7 |
|---|---|---|---|
| canvas | 1440×1440 | 1440×1440 | 1440×1440 (square!) |
| fps | 60 | 60 | 60 |
| length | 20.0s | 18.4s | 22.7s |
| media layers | 5 | 24 | 5 |
| **shape layers** | **51** | **52** | **47** |
| text | 8 | 8 | 18 |
| embedScene (precomp) | 2 | 3 | 13 |
| keyframes | 218 | 144 | 190 |

**The signature insight: pro edits are SHAPE-HEAVY, not media-heavy.** ~50 `.rect` shape layers per edit vs a handful of media. Those rects are: color-grade overlays, beat **flash frames**, letterbox bars, and **transition wipes**. This is the #1 thing that separates a pro AMV from a beginner slideshow.

## Canonical effect stack (frequency across the 3)
- **`motionblur4`** (28–44×) — on EVERY moving element. The "expensive" pro feel = motion blur on all transforms.
- **`tile`** (25–38×) — repeat/mirror backgrounds & transition patterns.
- **`deepglow2`** (4–30×) — the bloom/glow that makes highlights pop (CR7 leans hardest on it).
- **`textspacing`** (7–18×) — animated letter-spacing on titles (letters spread out on impact).
- **`shake2`** (2–4×) — beat-synced camera shake (mag/freq/angle from blueprint).
- **`randomdisplace`** (2–4×) — glitch/jitter hits.
- **`lift`** (3–10×) — chromatic-aberration / RGB-split look (copies bg pixels).
- **`wipe2`** (2–4×) — hard directional transitions.
- **`streaks`** (7× spider) — speed lines.
- **`exposure` / `satvib` / `hueshift` / `colorhot`** — the grade.
- Text legibility: **`dropshadow`** (cr7 6×).

## Two effects NOT in the stock 315 catalog
`opticcompesation` (iron man ×2) and `bbmaker` (spider ×3) — these are **custom/imported effect presets** (users can save effect stacks as reusable presets in AM), OR renamed in a newer app build. Flagged: the stock catalog covers ~99% but pros do use saved custom presets.

## Fonts = all imported display faces
`Pricedown Bl.otf` (GTA font), `The Amazing Spider-Man.ttf`, `Barclays Premier League.ttf`, `ARIALBLACKITALIC`, `Half Myself.otf`, `A_Voice_Liberty.ttf`. **Every title uses an imported themed font** — confirms: pro character-edits depend on the imported-font pipeline (and why the XML won't look right unless those .ttf/.otf are installed in-app). The Drive folder ships the fonts + audio + source images alongside — that's how these are meant to be shared.

## From the YouTube tutorial (editor UI, screen-recorded)
Watched the actual build of a "Good afternoon, Rocky" word-sync edit:
- **Graph editor** used for custom easing (S-curves drawn by hand) — not just presets.
- **Four-color Gradient** effect for text fill.
- **DeepGlow Enhanced** (= `deepglow2`) on text.
- **Fade In/Out** effect set to 0.15s in / 0.30s out.
- **Copy Effects → Paste Effects** to replicate a stack across word layers (how they do 18 text layers fast).
- Hex color entry (e.g. `#DD7122` warm orange).

## Recipe to reproduce the ROBO character-edit style in hand-written XML
1. Square 1440×1440, 60fps, ~20s.
2. Base media clip(s) with `motionblur4` + `<scale>`/`<location>` beat-punch keyframes.
3. **Stack of `.rect` shapes**: full-frame grade tint (low-alpha, blended), 2–3px flash frames on beats (`<opacity>` spike), top/bottom letterbox bars.
4. Title text: imported themed font, `textspacing` animating letters apart, `deepglow2`, `dropshadow`.
5. Beat hits: `shake2` + `randomdisplace` short bursts; `lift` for RGB-split accents.
6. Transitions: `wipe2` / `tile` between sections; precompose (`embedScene`) repeated segments.
7. Grade: `exposure` + `satvib` + `hueshift`.
