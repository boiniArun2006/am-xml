package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/HandleImageCache;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ImageBitmap;", "rl", "Landroidx/compose/ui/graphics/ImageBitmap;", "t", "()Landroidx/compose/ui/graphics/ImageBitmap;", "J2", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "imageBitmap", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Canvas;", c.f62177j, "()Landroidx/compose/ui/graphics/Canvas;", "nr", "(Landroidx/compose/ui/graphics/Canvas;)V", "canvas", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "O", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "canvasDrawScope", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class HandleImageCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HandleImageCache f20745n = new HandleImageCache();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static CanvasDrawScope canvasDrawScope;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static ImageBitmap imageBitmap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static Canvas canvas;

    public final void J2(ImageBitmap imageBitmap2) {
        imageBitmap = imageBitmap2;
    }

    public final void O(CanvasDrawScope canvasDrawScope2) {
        canvasDrawScope = canvasDrawScope2;
    }

    public final Canvas n() {
        return canvas;
    }

    public final void nr(Canvas canvas2) {
        canvas = canvas2;
    }

    public final CanvasDrawScope rl() {
        return canvasDrawScope;
    }

    public final ImageBitmap t() {
        return imageBitmap;
    }

    private HandleImageCache() {
    }
}
