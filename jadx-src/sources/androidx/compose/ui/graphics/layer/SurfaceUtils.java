package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/SurfaceUtils;", "", "<init>", "()V", "Landroid/view/Surface;", "surface", "Landroid/graphics/Canvas;", "rl", "(Landroid/view/Surface;)Landroid/graphics/Canvas;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SurfaceUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SurfaceUtils f31732n = new SurfaceUtils();

    public final boolean n() {
        return true;
    }

    public final Canvas rl(Surface surface) {
        return SurfaceVerificationHelper.f31733n.n(surface);
    }

    private SurfaceUtils() {
    }
}
