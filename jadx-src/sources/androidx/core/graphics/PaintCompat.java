package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PaintCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f36412n = new ThreadLocal();

    @RequiresApi
    static class Api29Impl {
        static void n(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    @RequiresApi
    static class Api23Impl {
        static boolean n(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean rl(Paint paint, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.n(paint, blendModeCompat != null ? BlendModeUtils.Api29Impl.n(blendModeCompat) : null);
            return true;
        }
        if (blendModeCompat == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeN = BlendModeUtils.n(blendModeCompat);
        paint.setXfermode(modeN != null ? new PorterDuffXfermode(modeN) : null);
        return modeN != null;
    }

    public static boolean n(Paint paint, String str) {
        return Api23Impl.n(paint, str);
    }
}
