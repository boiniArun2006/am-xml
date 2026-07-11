package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "Landroidx/compose/ui/text/font/Font;", c.f62177j, "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontFamily;", "t", "(Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontKt {
    public static final FontFamily t(Font font) {
        return FontFamilyKt.rl(font);
    }

    public static final Font n(int i2, FontWeight fontWeight, int i3, int i5) {
        return new ResourceFont(i2, fontWeight, i3, new FontVariation.Settings(new FontVariation.Setting[0]), i5, null);
    }

    public static /* synthetic */ Font rl(int i2, FontWeight fontWeight, int i3, int i5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.O();
        }
        if ((i7 & 4) != 0) {
            i3 = FontStyle.INSTANCE.rl();
        }
        if ((i7 & 8) != 0) {
            i5 = FontLoadingStrategy.INSTANCE.rl();
        }
        return n(i2, fontWeight, i3, i5);
    }
}
