package androidx.core.view.animation;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class PathInterpolatorApi14 implements Interpolator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f36870n;
    private final float[] rl;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f36870n.length - 1;
        int i2 = 0;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f3 < this.f36870n[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f36870n;
        float f4 = fArr[length];
        float f5 = fArr[i2];
        float f6 = f4 - f5;
        if (f6 == 0.0f) {
            return this.rl[i2];
        }
        float f7 = (f3 - f5) / f6;
        float[] fArr2 = this.rl;
        float f8 = fArr2[i2];
        return f8 + (f7 * (fArr2[length] - f8));
    }
}
