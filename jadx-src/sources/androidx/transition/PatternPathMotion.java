package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Path f42196n;
    private final Matrix rl;

    private static float rl(float f3, float f4) {
        return (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }

    @Override // androidx.transition.PathMotion
    public Path n(float f3, float f4, float f5, float f6) {
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float fRl = rl(f7, f8);
        double dAtan2 = Math.atan2(f8, f7);
        this.rl.setScale(fRl, fRl);
        this.rl.postRotate((float) Math.toDegrees(dAtan2));
        this.rl.postTranslate(f3, f4);
        Path path = new Path();
        this.f42196n.transform(this.rl, path);
        return path;
    }
}
