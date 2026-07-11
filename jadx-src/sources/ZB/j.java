package ZB;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static float n(float f3, float f4, float f5, float f6) {
        return (float) Math.hypot(f5 - f3, f6 - f4);
    }

    public static float rl(float f3, float f4, float f5) {
        return ((1.0f - f5) * f3) + (f5 * f4);
    }
}
