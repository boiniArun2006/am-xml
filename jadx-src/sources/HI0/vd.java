package HI0;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class vd {
    public static final double rl(double d2, double d4, double d5) {
        double dCoerceIn = RangesKt.coerceIn((d5 - d2) / (d4 - d2), 0.0d, 1.0d);
        return dCoerceIn * dCoerceIn * (3.0d - (dCoerceIn * 2.0d));
    }

    public static final float t(float f3, float f4, float f5) {
        float fCoerceIn = RangesKt.coerceIn((f5 - f3) / (f4 - f3), 0.0f, 1.0f);
        return fCoerceIn * fCoerceIn * (3.0f - (fCoerceIn * 2.0f));
    }

    public static final double n(double d2, double d4, float f3) {
        return (d2 * ((double) (1.0f - f3))) + (d4 * ((double) f3));
    }
}
