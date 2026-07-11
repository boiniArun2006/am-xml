package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PainterModifierKt {
    public static final Modifier n(Modifier modifier, Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter) {
        return modifier.Zmq(new PainterElement(painter, z2, alignment, contentScale, f3, colorFilter));
    }

    public static /* synthetic */ Modifier rl(Modifier modifier, Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            alignment = Alignment.INSTANCE.O();
        }
        Alignment alignment2 = alignment;
        if ((i2 & 8) != 0) {
            contentScale = ContentScale.INSTANCE.J2();
        }
        ContentScale contentScale2 = contentScale;
        if ((i2 & 16) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        if ((i2 & 32) != 0) {
            colorFilter = null;
        }
        return n(modifier, painter, z3, alignment2, contentScale2, f4, colorFilter);
    }
}
