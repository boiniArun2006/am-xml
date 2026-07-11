package androidx.window.sidecar;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", c.f62177j, "(Landroid/app/Activity;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ActivityCompatHelperApi30 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ActivityCompatHelperApi30 f42625n = new ActivityCompatHelperApi30();

    public final Rect n(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    private ActivityCompatHelperApi30() {
    }
}
