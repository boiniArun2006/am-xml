package x0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {
    public static int t(float f3, int i2, int i3) {
        if (i2 == i3 || f3 <= 0.0f) {
            return i2;
        }
        if (f3 >= 1.0f) {
            return i3;
        }
        float f4 = ((i2 >> 24) & 255) / 255.0f;
        float fN = n(((i2 >> 16) & 255) / 255.0f);
        float fN2 = n(((i2 >> 8) & 255) / 255.0f);
        float fN3 = n((i2 & 255) / 255.0f);
        float fN4 = n(((i3 >> 16) & 255) / 255.0f);
        float f5 = f4 + (((((i3 >> 24) & 255) / 255.0f) - f4) * f3);
        float fN5 = fN2 + ((n(((i3 >> 8) & 255) / 255.0f) - fN2) * f3);
        float fN6 = fN3 + (f3 * (n((i3 & 255) / 255.0f) - fN3));
        return (Math.round(rl(fN + ((fN4 - fN) * f3)) * 255.0f) << 16) | (Math.round(f5 * 255.0f) << 24) | (Math.round(rl(fN5) * 255.0f) << 8) | Math.round(rl(fN6) * 255.0f);
    }

    private static float n(float f3) {
        if (f3 <= 0.04045f) {
            return f3 / 12.92f;
        }
        return (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float rl(float f3) {
        if (f3 <= 0.0031308f) {
            return f3 * 12.92f;
        }
        return (float) ((Math.pow(f3, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
