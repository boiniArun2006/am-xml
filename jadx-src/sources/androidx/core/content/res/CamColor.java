package androidx.core.content.res;

import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class CamColor {
    private final float J2;
    private final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f36352O;
    private final float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f36353n;
    private final float nr;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f36354t;
    private final float xMQ;

    private static CamColor rl(float f3, float f4, float f5) {
        float f6 = 100.0f;
        float f7 = 1000.0f;
        float f8 = 0.0f;
        CamColor camColor = null;
        float f9 = 1000.0f;
        while (Math.abs(f8 - f6) > 0.01f) {
            float f10 = ((f6 - f8) / 2.0f) + f8;
            int iCk = O(f10, f4, f3).ck();
            float fRl = CamUtils.rl(iCk);
            float fAbs = Math.abs(f5 - fRl);
            if (fAbs < 0.2f) {
                CamColor camColorT = t(iCk);
                float fN = camColorT.n(O(camColorT.gh(), camColorT.xMQ(), f3));
                if (fN <= 1.0f) {
                    camColor = camColorT;
                    f7 = fAbs;
                    f9 = fN;
                }
            }
            if (f7 == 0.0f && f9 == 0.0f) {
                return camColor;
            }
            if (fRl < f5) {
                f8 = f10;
            } else {
                f6 = f10;
            }
        }
        return camColor;
    }

    static CamColor t(int i2) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        nr(i2, ViewingConditions.gh, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static int ty(float f3, float f4, float f5, ViewingConditions viewingConditions) {
        if (f4 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
            return CamUtils.n(f5);
        }
        float fMin = f3 < 0.0f ? 0.0f : Math.min(360.0f, f3);
        CamColor camColor = null;
        boolean z2 = true;
        float f6 = 0.0f;
        float f7 = f4;
        while (Math.abs(f6 - f4) >= 0.4f) {
            CamColor camColorRl = rl(fMin, f7, f5);
            if (!z2) {
                if (camColorRl == null) {
                    f4 = f7;
                } else {
                    f6 = f7;
                    camColor = camColorRl;
                }
                f7 = ((f4 - f6) / 2.0f) + f6;
            } else {
                if (camColorRl != null) {
                    return camColorRl.HI(viewingConditions);
                }
                f7 = ((f4 - f6) / 2.0f) + f6;
                z2 = false;
            }
        }
        return camColor == null ? CamUtils.n(f5) : camColor.HI(viewingConditions);
    }

    private static CamColor O(float f3, float f4, float f5) {
        return J2(f3, f4, f5, ViewingConditions.gh);
    }

    public static int az(float f3, float f4, float f5) {
        return ty(f3, f4, f5, ViewingConditions.gh);
    }

    static void nr(int i2, ViewingConditions viewingConditions, float[] fArr, float[] fArr2) {
        CamUtils.J2(i2, fArr2);
        float[][] fArr3 = CamUtils.f36355n;
        float f3 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f4 = fArr4[0] * f3;
        float f5 = fArr2[1];
        float f6 = f4 + (fArr4[1] * f5);
        float f7 = fArr2[2];
        float f8 = f6 + (fArr4[2] * f7);
        float[] fArr5 = fArr3[1];
        float f9 = (fArr5[0] * f3) + (fArr5[1] * f5) + (fArr5[2] * f7);
        float[] fArr6 = fArr3[2];
        float f10 = (f3 * fArr6[0]) + (f5 * fArr6[1]) + (f7 * fArr6[2]);
        float f11 = viewingConditions.xMQ()[0] * f8;
        float f12 = viewingConditions.xMQ()[1] * f9;
        float f13 = viewingConditions.xMQ()[2] * f10;
        float fPow = (float) Math.pow(((double) (viewingConditions.t() * Math.abs(f11))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (viewingConditions.t() * Math.abs(f12))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (viewingConditions.t() * Math.abs(f13))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f11) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f12) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f13) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f14 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d2)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = (((fSignum * 20.0f) + f16) + (21.0f * fSignum3)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * viewingConditions.J2()) / viewingConditions.n(), viewingConditions.rl() * viewingConditions.mUb())) * 100.0f;
        float fRl = (4.0f / viewingConditions.rl()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.n() + 4.0f) * viewingConditions.nr();
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.O()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.Uo()) * viewingConditions.KN()) * ((float) Math.sqrt((f14 * f14) + (f15 * f15)))) / (f17 + 0.305f), 0.9d));
        float fNr = viewingConditions.nr() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((r4 * viewingConditions.rl()) / (viewingConditions.n() + 4.0f))) * 50.0f;
        float f20 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fNr) + 1.0f)) * 43.85965f;
        double d4 = f19;
        float fCos = ((float) Math.cos(d4)) * fLog;
        float fSin = fLog * ((float) Math.sin(d4));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fRl;
            fArr[2] = fNr;
            fArr[3] = fSqrt2;
            fArr[4] = f20;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    float KN() {
        return this.xMQ;
    }

    float Uo() {
        return this.KN;
    }

    int ck() {
        return HI(ViewingConditions.gh);
    }

    float gh() {
        return this.f36354t;
    }

    float mUb() {
        return this.f36353n;
    }

    float qie() {
        return this.Uo;
    }

    float xMQ() {
        return this.rl;
    }

    CamColor(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f36353n = f3;
        this.rl = f4;
        this.f36354t = f5;
        this.nr = f6;
        this.f36352O = f7;
        this.J2 = f8;
        this.Uo = f9;
        this.KN = f10;
        this.xMQ = f11;
    }

    private static CamColor J2(float f3, float f4, float f5, ViewingConditions viewingConditions) {
        float fRl = (4.0f / viewingConditions.rl()) * ((float) Math.sqrt(((double) f3) / 100.0d)) * (viewingConditions.n() + 4.0f) * viewingConditions.nr();
        float fNr = viewingConditions.nr() * f4;
        float fSqrt = ((float) Math.sqrt(((f4 / ((float) Math.sqrt(r4))) * viewingConditions.rl()) / (viewingConditions.n() + 4.0f))) * 50.0f;
        float f6 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) fNr) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f5) / 180.0f;
        return new CamColor(f5, f4, f3, fRl, fNr, fSqrt, f6, ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    int HI(ViewingConditions viewingConditions) {
        float fXMQ;
        if (xMQ() != 0.0d && gh() != 0.0d) {
            fXMQ = xMQ() / ((float) Math.sqrt(((double) gh()) / 100.0d));
        } else {
            fXMQ = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fXMQ) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.O()), 0.73d), 1.1111111111111112d);
        double dMUb = (mUb() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dMUb) + 3.8d)) * 0.25f;
        float fN = viewingConditions.n() * ((float) Math.pow(((double) gh()) / 100.0d, (1.0d / ((double) viewingConditions.rl())) / ((double) viewingConditions.mUb())));
        float fUo = fCos * 3846.1538f * viewingConditions.Uo() * viewingConditions.KN();
        float fJ2 = fN / viewingConditions.J2();
        float fSin = (float) Math.sin(dMUb);
        float fCos2 = (float) Math.cos(dMUb);
        float f3 = (((0.305f + fJ2) * 23.0f) * fPow) / (((fUo * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f4 = fCos2 * f3;
        float f5 = f3 * fSin;
        float f6 = fJ2 * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float fSignum = Math.signum(f7) * (100.0f / viewingConditions.t()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f8) * (100.0f / viewingConditions.t()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / viewingConditions.t()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r8)) * 27.13d) / (400.0d - ((double) Math.abs(r8)))), 2.380952380952381d));
        float f9 = fSignum / viewingConditions.xMQ()[0];
        float f10 = fSignum2 / viewingConditions.xMQ()[1];
        float f11 = fSignum3 / viewingConditions.xMQ()[2];
        float[][] fArr = CamUtils.rl;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11);
        float[] fArr4 = fArr[2];
        return ColorUtils.t(f12, f13, (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    float n(CamColor camColor) {
        float fQie = qie() - camColor.qie();
        float fUo = Uo() - camColor.Uo();
        float fKN = KN() - camColor.KN();
        return (float) (Math.pow(Math.sqrt((fQie * fQie) + (fUo * fUo) + (fKN * fKN)), 0.63d) * 1.41d);
    }
}
