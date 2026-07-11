package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", TtmlNode.START, "stop", "", "fraction", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/Shadow;F)Landroidx/compose/ui/graphics/Shadow;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ShadowKt {
    public static final Shadow n(Shadow shadow, Shadow shadow2, float f3) {
        return new Shadow(ColorKt.KN(shadow.getColor(), shadow2.getColor(), f3), OffsetKt.rl(shadow.getOffset(), shadow2.getOffset(), f3), MathHelpersKt.rl(shadow.getBlurRadius(), shadow2.getBlurRadius(), f3), null);
    }
}
