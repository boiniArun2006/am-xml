package G7;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TimeInterpolator f3385n = new LinearInterpolator();
    public static final TimeInterpolator rl = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final TimeInterpolator f3386t = new FastOutLinearInInterpolator();
    public static final TimeInterpolator nr = new LinearOutSlowInInterpolator();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final TimeInterpolator f3384O = new DecelerateInterpolator();

    public static float n(float f3, float f4, float f5) {
        return f3 + (f5 * (f4 - f3));
    }

    public static int t(int i2, int i3, float f3) {
        return i2 + Math.round(f3 * (i3 - i2));
    }

    public static float rl(float f3, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f3 : f7 >= f6 ? f4 : n(f3, f4, (f7 - f5) / (f6 - f5));
    }
}
