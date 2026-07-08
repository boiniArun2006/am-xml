# Alight Motion — 2026 Editing Styles (observed from real videos)

_Watched via frame contact-sheets (ffmpeg → tiled stills → vision). 5 real edits analysed: 2 of the user's own AM exports + 3 saved reference reels. Each style below is mapped to the concrete AM XML building blocks (effects/transforms/keyframes) that produce it, using the 315-effect blueprint._

## Style 1 — Beat-sync hype / tribute edit  (user's "Happy Birthday Jagannath")
**Look:** dark moody grade, heavy drifting **smoke/fog overlay**, bold **condensed red display font** locked center, photos punch/zoom behind the text, hard **motion-blur zoom** cuts on the beat, vignette.
**XML recipe:**
- Text: static `<location>` center (960,540), big `size`, red `fillColor="#ffff2d2d"`, condensed imported font. Fixed while media animates.
- Media punch-in: `<scale>` kf from ~1.0→1.15 with ease-out `cubicBezier 0.0 0.0 0.0 1.0`.
- Transition blur: effect `motionblur4` (or `motionblur3`) pulsed at cut points; `dblur`/`zoomblur` for the zoom-cut.
- Smoke: a screen-blended media/overlay layer (`blending` = screen) OR `clouds`/`clouds2` procedural effect drifting via `offset` kf.
- Grade: `vignette` (strength ~0.8), `brightness-contrast-2`, `satvib` down slightly.
- End card: second text block fades in (`<opacity>` kf 0→1).

## Style 2 — Devotional / AI-art slideshow  (user's Radha-Krishna edit)
**Look:** AI-generated stills, slow **Ken Burns** zoom/pan, soft **glow/bloom**, warm golden grade, gentle crossfades. No hard cuts.
**XML recipe:**
- Each still: slow `<scale>` 1.0→1.08 + slight `<location>` drift across the layer's full duration (kf t=0→1). This is the Ken Burns move.
- Crossfade: overlap layers, `<opacity>` out-going 1→0 while next 0→1.
- Glow: `softglow` or `deepglow2` (low strength), warm push via `colortemperature` + `exposure`.
- Optional light leaks: screen-blended overlay.

## Style 3 — Kinetic word-sync captions / typography reel  (Rowan Atkinson clip)
**Look:** talking-head footage, **each spoken word pops in synced to audio**; bold white sans for normal words, *italic serif* for emphasized/quoted words. The signature "quote reel" look.
**XML recipe:**
- One `<text>` layer **per word or phrase**, each with tight `startTime`/`endTime` matching the spoken word (ms).
- Pop-in: `<scale>` kf 0.8→1.0 + `<opacity>` 0→1 over ~80ms with ease-out; sometimes a tiny `<location>` rise.
- Two font styles: normal = `googlefonts?name=...&weight=800`; emphasis = a serif italic (`...&weight=700&italic=1`).
- Usually no heavy effects — it's pure timing precision. This is the style most sensitive to the **kf-t normalization** rule.

## Style 4 — Cinematic narrative short  (cassette love-story reel)
**Look:** **teal-orange film grade**, subtle grain, **bottom-center subtitle captions**, occasional **handwritten-script accent** overlays ("10 minutes ago"), dialogue-driven storytelling.
**XML recipe:**
- Grade stack: `colorbalance` / `colortune2` (push shadows teal, skin warm), `brightness-contrast-2`, light `vignette`, grain via `noise`/`noise2` (low alpha, screen).
- Subtitles: single reusable `<text>` layer, bottom-center, semi-transparent bg or drop `shadow` effect for legibility; content swapped per line (start/end times).
- Handwritten accents: imported script font, small, fade in/out.
- Letterbox optional: two black `shape` bars top/bottom.

## Style 5 — Static announcement / flyer  (NCC "Congratulations" post)
**Look:** single photo + **boxed text banner**, effectively motionless. College/org announcements.
**XML recipe:**
- One media layer full-frame, one `<text>` with a solid/rounded `shape` behind it (boxed caption).
- Minimal/no keyframes. This is the simplest AM output — basically a poster export.

---

## Cross-cutting building blocks (what every style leans on)
| Need | AM mechanism |
|---|---|
| Punch/zoom | `<scale>` keyframes + `motionblur4` |
| Smooth ease | `e="cubicBezier 0.0 0.0 0.0 1.0"` (ease-out) on kf |
| Glow/bloom | `softglow`, `deepglow2`, `glow` |
| Film grade | `colorbalance`, `colortune2`, `colortemperature`, `brightness-contrast-2`, `vignette` |
| Grain/texture | `noise`, `noise2`, screen-blended overlay |
| Shake/energy | `shake2` (mag/freq/angle) |
| Warp/liquid | `wavewarp2`, `turbulentdisplace3`, `fractalwarp4` |
| Green-screen | `chromakey` (keyColor/threshold/feather) |
| Legible captions | drop `shadow` effect or boxed `shape` bg |
| Word-sync text | one text layer per word, tight start/end times |

## The two things that break beginners' hand-written versions of these
1. **kf `t` is 0–1 of the layer, not ms** — word-sync (Style 3) and Ken Burns (Style 2) collapse if you put ms here.
2. **Imported fonts must exist in-app** — Styles 1/3/4 all rely on imported display/serif fonts; reference `googlefonts?...` for anything meant to be portable.
