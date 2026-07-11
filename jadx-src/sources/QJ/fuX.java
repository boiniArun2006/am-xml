package QJ;

import androidx.core.graphics.BlendModeCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public enum fuX {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    f8010U;

    public BlendModeCompat rl() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal != 16) {
                                return null;
                            }
                            return BlendModeCompat.PLUS;
                        }
                        return BlendModeCompat.LIGHTEN;
                    }
                    return BlendModeCompat.DARKEN;
                }
                return BlendModeCompat.OVERLAY;
            }
            return BlendModeCompat.SCREEN;
        }
        return BlendModeCompat.MODULATE;
    }
}
