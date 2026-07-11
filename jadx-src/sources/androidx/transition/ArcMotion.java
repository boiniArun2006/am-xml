package androidx.transition;

import android.graphics.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class ArcMotion extends PathMotion {
    private static final float nr = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f42133n;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f42134t;

    @Override // androidx.transition.PathMotion
    public Path n(float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f3, f4);
        float f10 = f5 - f3;
        float f11 = f6 - f4;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f3 + f5) / 2.0f;
        float f14 = (f4 + f6) / 2.0f;
        float f15 = 0.25f * f12;
        boolean z2 = f4 > f6;
        if (Math.abs(f10) < Math.abs(f11)) {
            float fAbs = Math.abs(f12 / (f11 * 2.0f));
            if (z2) {
                f8 = fAbs + f6;
                f7 = f5;
            } else {
                f8 = fAbs + f4;
                f7 = f3;
            }
            f9 = this.rl;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z2) {
                f8 = f4;
                f7 = f16 + f3;
            } else {
                f7 = f5 - f16;
                f8 = f6;
            }
            f9 = this.f42133n;
        }
        float f17 = f15 * f9 * f9;
        float f18 = f13 - f7;
        float f19 = f14 - f8;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.f42134t;
        float f22 = f15 * f21 * f21;
        if (f20 >= f17) {
            f17 = f20 > f22 ? f22 : 0.0f;
        }
        if (f17 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f17 / f20);
            f7 = ((f7 - f13) * fSqrt) + f13;
            f8 = f14 + (fSqrt * (f8 - f14));
        }
        path.cubicTo((f3 + f7) / 2.0f, (f4 + f8) / 2.0f, (f7 + f5) / 2.0f, (f8 + f6) / 2.0f, f5, f6);
        return path;
    }
}
