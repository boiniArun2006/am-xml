package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PathInterpolatorCompat {

    @RequiresApi
    static class Api21Impl {
        static Interpolator n(float f3, float f4, float f5, float f6) {
            return new PathInterpolator(f3, f4, f5, f6);
        }

        static Interpolator rl(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator n(float f3, float f4, float f5, float f6) {
        return Api21Impl.n(f3, f4, f5, f6);
    }

    public static Interpolator rl(Path path) {
        return Api21Impl.rl(path);
    }
}
