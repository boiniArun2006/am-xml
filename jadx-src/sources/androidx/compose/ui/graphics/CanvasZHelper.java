package androidx.compose.ui.graphics;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/CanvasZHelper;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/graphics/Canvas;Z)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CanvasZHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CanvasZHelper f31433n = new CanvasZHelper();

    public final void n(android.graphics.Canvas canvas, boolean enable) {
        if (enable) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    private CanvasZHelper() {
    }
}
