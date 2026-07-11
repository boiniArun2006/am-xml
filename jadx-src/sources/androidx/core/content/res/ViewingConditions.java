package androidx.core.content.res;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class ViewingConditions {
    static final ViewingConditions gh = gh(CamUtils.f36356t, (float) ((((double) CamUtils.KN(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float J2;
    private final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f36376O;
    private final float[] Uo;
    private final float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f36377n;
    private final float nr;
    private final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f36378t;
    private final float xMQ;

    static ViewingConditions gh(float[] fArr, float f3, float f4, float f5, boolean z2) {
        float[][] fArr2 = CamUtils.f36355n;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = f7 + (fArr3[1] * f8);
        float f10 = fArr[2];
        float f11 = f9 + (fArr3[2] * f10);
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[0] * f6) + (fArr4[1] * f8) + (fArr4[2] * f10);
        float[] fArr5 = fArr2[2];
        float f13 = (f6 * fArr5[0]) + (f8 * fArr5[1]) + (f10 * fArr5[2]);
        float f14 = (f5 / 10.0f) + 0.8f;
        float fNr = ((double) f14) >= 0.9d ? CamUtils.nr(0.59f, 0.69f, (f14 - 0.9f) * 10.0f) : CamUtils.nr(0.525f, 0.59f, (f14 - 0.8f) * 10.0f);
        float fExp = z2 ? 1.0f : (1.0f - (((float) Math.exp(((-f3) - 42.0f) / 92.0f)) * 0.2777778f)) * f14;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp};
        float f15 = 1.0f / ((5.0f * f3) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float fCbrt = (f16 * f3) + (0.1f * f17 * f17 * ((float) Math.cbrt(((double) f3) * 5.0d)));
        float fKN = CamUtils.KN(f4) / fArr[1];
        double d4 = fKN;
        float fSqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f13)) / 100.0d, 0.42d)};
        float f18 = fArr7[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[2];
        float[] fArr8 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        return new ViewingConditions(fKN, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fNr, f14, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float J2() {
        return this.rl;
    }

    float KN() {
        return this.f36378t;
    }

    float O() {
        return this.J2;
    }

    float Uo() {
        return this.f36376O;
    }

    float mUb() {
        return this.mUb;
    }

    float n() {
        return this.f36377n;
    }

    float nr() {
        return this.xMQ;
    }

    float rl() {
        return this.nr;
    }

    float t() {
        return this.KN;
    }

    float[] xMQ() {
        return this.Uo;
    }

    private ViewingConditions(float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.J2 = f3;
        this.f36377n = f4;
        this.rl = f5;
        this.f36378t = f6;
        this.nr = f7;
        this.f36376O = f8;
        this.Uo = fArr;
        this.KN = f9;
        this.xMQ = f10;
        this.mUb = f11;
    }
}
