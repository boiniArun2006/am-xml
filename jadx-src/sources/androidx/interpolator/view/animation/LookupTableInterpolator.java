package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class LookupTableInterpolator implements Interpolator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f38797n;
    private final float rl;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f38797n;
        int iMin = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f4 = this.rl;
        float f5 = (f3 - (iMin * f4)) / f4;
        float[] fArr2 = this.f38797n;
        float f6 = fArr2[iMin];
        return f6 + (f5 * (fArr2[iMin + 1] - f6));
    }

    protected LookupTableInterpolator(float[] fArr) {
        this.f38797n = fArr;
        this.rl = 1.0f / (fArr.length - 1);
    }
}
