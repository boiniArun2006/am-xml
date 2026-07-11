package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.RequiresApi;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class ColorUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f36406n = new ThreadLocal();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RequiresApi
    static class Api26Impl {
    }

    public static void n(int i2, int i3, int i5, float[] fArr) {
        float f3;
        float fAbs;
        float f4 = i2 / 255.0f;
        float f5 = i3 / 255.0f;
        float f6 = i5 / 255.0f;
        float fMax = Math.max(f4, Math.max(f5, f6));
        float fMin = Math.min(f4, Math.min(f5, f6));
        float f7 = fMax - fMin;
        float f8 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f3 = 0.0f;
            fAbs = 0.0f;
        } else {
            f3 = fMax == f4 ? ((f5 - f6) / f7) % 6.0f : fMax == f5 ? ((f6 - f4) / f7) + 2.0f : 4.0f + ((f4 - f5) / f7);
            fAbs = f7 / (1.0f - Math.abs((2.0f * f8) - 1.0f));
        }
        float f9 = (f3 * 60.0f) % 360.0f;
        if (f9 < 0.0f) {
            f9 += 360.0f;
        }
        fArr[0] = az(f9, 0.0f, 360.0f);
        fArr[1] = az(fAbs, 0.0f, 1.0f);
        fArr[2] = az(f8, 0.0f, 1.0f);
    }

    private static double[] HI() {
        ThreadLocal threadLocal = f36406n;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static float az(float f3, float f4, float f5) {
        return f3 < f4 ? f4 : Math.min(f3, f5);
    }

    public static int ck(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException(aNrWBQYwFf.euOZH);
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    private static int mUb(int i2, int i3) {
        return 255 - (((255 - i3) * (255 - i2)) / 255);
    }

    public static int nr(int i2, int i3, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb((int) ((Color.alpha(i2) * f4) + (Color.alpha(i3) * f3)), (int) ((Color.red(i2) * f4) + (Color.red(i3) * f3)), (int) ((Color.green(i2) * f4) + (Color.green(i3) * f3)), (int) ((Color.blue(i2) * f4) + (Color.blue(i3) * f3)));
    }

    private static int qie(int i2, int i3, int i5, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i2 * 255) * i3) + ((i5 * i7) * (255 - i3))) / (i8 * 255);
    }

    public static void rl(int i2, int i3, int i5, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) i2) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d4 = ((double) i3) / 255.0d;
        double dPow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = ((double) i5) / 255.0d;
        double dPow3 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    private static int ty(int i2, int i3, int i5) {
        return i2 < i3 ? i3 : Math.min(i2, i5);
    }

    public static double J2(int i2) {
        double[] dArrHI = HI();
        xMQ(i2, dArrHI);
        return dArrHI[1] / 100.0d;
    }

    public static void KN(int i2, float[] fArr) {
        n(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
    }

    public static double O(int i2, int i3) {
        if (Color.alpha(i3) == 255) {
            if (Color.alpha(i2) < 255) {
                i2 = gh(i2, i3);
            }
            double dJ2 = J2(i2) + 0.05d;
            double dJ22 = J2(i3) + 0.05d;
            return Math.max(dJ2, dJ22) / Math.min(dJ2, dJ22);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
    }

    public static int Uo(int i2, int i3, float f3) {
        int i5 = 255;
        if (Color.alpha(i3) == 255) {
            double d2 = f3;
            if (O(ck(i2, 255), i3) < d2) {
                return -1;
            }
            int i7 = 0;
            for (int i8 = 0; i8 <= 10 && i5 - i7 > 1; i8++) {
                int i9 = (i7 + i5) / 2;
                if (O(ck(i2, i9), i3) < d2) {
                    i7 = i9;
                } else {
                    i5 = i9;
                }
            }
            return i5;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i3));
    }

    public static int gh(int i2, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i2);
        int iMUb = mUb(iAlpha2, iAlpha);
        return Color.argb(iMUb, qie(Color.red(i2), iAlpha2, Color.red(i3), iAlpha, iMUb), qie(Color.green(i2), iAlpha2, Color.green(i3), iAlpha, iMUb), qie(Color.blue(i2), iAlpha2, Color.blue(i3), iAlpha, iMUb));
    }

    public static void xMQ(int i2, double[] dArr) {
        rl(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    public static int t(double d2, double d4, double d5) {
        double dPow;
        double dPow2;
        double dPow3;
        double d6 = (((3.2406d * d2) + ((-1.5372d) * d4)) + ((-0.4986d) * d5)) / 100.0d;
        double d7 = ((((-0.9689d) * d2) + (1.8758d * d4)) + (0.0415d * d5)) / 100.0d;
        double d8 = (((0.0557d * d2) + ((-0.204d) * d4)) + (1.057d * d5)) / 100.0d;
        if (d6 > 0.0031308d) {
            dPow = (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow = d6 * 12.92d;
        }
        if (d7 > 0.0031308d) {
            dPow2 = (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow2 = d7 * 12.92d;
        }
        if (d8 > 0.0031308d) {
            dPow3 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            dPow3 = d8 * 12.92d;
        }
        return Color.rgb(ty((int) Math.round(dPow * 255.0d), 0, 255), ty((int) Math.round(dPow2 * 255.0d), 0, 255), ty((int) Math.round(dPow3 * 255.0d), 0, 255));
    }
}
