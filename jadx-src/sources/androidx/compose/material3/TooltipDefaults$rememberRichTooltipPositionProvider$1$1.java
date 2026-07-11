package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"androidx/compose/material3/TooltipDefaults$rememberRichTooltipPositionProvider$1$1", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", c.f62177j, "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TooltipDefaults$rememberRichTooltipPositionProvider$1$1 implements PopupPositionProvider {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ int f28772n;

    @Override // androidx.compose.ui.window.PopupPositionProvider
    public long n(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int left = anchorBounds.getLeft();
        if (IntSize.Uo(popupContentSize) + left > IntSize.Uo(windowSize) && (left = anchorBounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() - IntSize.Uo(popupContentSize)) < 0) {
            left = anchorBounds.getLeft() + ((anchorBounds.qie() - IntSize.Uo(popupContentSize)) / 2);
        }
        int top = (anchorBounds.getTop() - IntSize.J2(popupContentSize)) - this.f28772n;
        if (top < 0) {
            top = this.f28772n + anchorBounds.getBottom();
        }
        return IntOffsetKt.n(left, top);
    }
}
