package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class CamUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final float[][] f36355n = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] rl = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final float[] f36356t = {95.047f, 100.0f, 108.883f};
    static final float[][] nr = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static float O(int i2) {
        float f3 = i2 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static float nr(float f3, float f4, float f5) {
        return f3 + ((f4 - f3) * f5);
    }

    static float KN(float f3) {
        return (f3 > 8.0f ? (float) Math.pow((((double) f3) + 16.0d) / 116.0d, 3.0d) : f3 / 903.2963f) * 100.0f;
    }

    static int n(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f4 = (f3 + 16.0f) / 116.0f;
        float f5 = f3 > 8.0f ? f4 * f4 * f4 : f3 / 903.2963f;
        float f6 = f4 * f4 * f4;
        boolean z2 = f6 > 0.008856452f;
        float f7 = z2 ? f6 : ((f4 * 116.0f) - 16.0f) / 903.2963f;
        if (!z2) {
            f6 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f36356t;
        return ColorUtils.t(f7 * fArr[0], f5 * fArr[1], f6 * fArr[2]);
    }

    static float t(float f3) {
        float f4 = f3 / 100.0f;
        return f4 <= 0.008856452f ? f4 * 903.2963f : (((float) Math.cbrt(f4)) * 116.0f) - 16.0f;
    }

    static void J2(int i2, float[] fArr) {
        float fO = O(Color.red(i2));
        float fO2 = O(Color.green(i2));
        float fO3 = O(Color.blue(i2));
        float[][] fArr2 = nr;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fO) + (fArr3[1] * fO2) + (fArr3[2] * fO3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fO) + (fArr4[1] * fO2) + (fArr4[2] * fO3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fO * fArr5[0]) + (fO2 * fArr5[1]) + (fO3 * fArr5[2]);
    }

    static float Uo(int i2) {
        float fO = O(Color.red(i2));
        float fO2 = O(Color.green(i2));
        float fO3 = O(Color.blue(i2));
        float[] fArr = nr[1];
        return (fO * fArr[0]) + (fO2 * fArr[1]) + (fO3 * fArr[2]);
    }

    static float rl(int i2) {
        return t(Uo(i2));
    }
}
