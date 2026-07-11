package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/Rect;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "t", "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "O", "(Landroid/graphics/Rect;)Landroidx/compose/ui/geometry/Rect;", "J2", "(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/IntRect;", "rl", "(Landroidx/compose/ui/unit/IntRect;)Landroid/graphics/Rect;", "nr", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/IntRect;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RectHelper_androidKt {
    public static final Rect J2(RectF rectF) {
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final Rect O(android.graphics.Rect rect) {
        return new Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final android.graphics.Rect n(Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), (int) rect.xMQ());
    }

    public static final IntRect nr(android.graphics.Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final android.graphics.Rect rl(IntRect intRect) {
        return new android.graphics.Rect(intRect.getLeft(), intRect.getTop(), intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), intRect.getBottom());
    }

    public static final RectF t(Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), rect.xMQ());
    }
}
