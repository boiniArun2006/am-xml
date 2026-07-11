package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class EdgeEffectCompat {

    @RequiresApi
    private static class Api31Impl {
        public static EdgeEffect n(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float rl(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float t(EdgeEffect edgeEffect, float f3, float f4) {
            try {
                return edgeEffect.onPullDistance(f3, f4);
            } catch (Throwable unused) {
                edgeEffect.onPull(f3, f4);
                return 0.0f;
            }
        }
    }

    @RequiresApi
    static class Api21Impl {
        static void n(EdgeEffect edgeEffect, float f3, float f4) {
            edgeEffect.onPull(f3, f4);
        }
    }

    public static EdgeEffect n(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.n(context, attributeSet) : new EdgeEffect(context);
    }

    public static float nr(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.t(edgeEffect, f3, f4);
        }
        t(edgeEffect, f3, f4);
        return f3;
    }

    public static float rl(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.rl(edgeEffect);
        }
        return 0.0f;
    }

    public static void t(EdgeEffect edgeEffect, float f3, float f4) {
        Api21Impl.n(edgeEffect, f3, f4);
    }
}
