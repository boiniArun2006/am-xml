package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "", "t", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "", "isBold", "isItalic", "rl", "(ZZ)I", "Landroidx/compose/ui/text/font/FontWeight$Companion;", c.f62177j, "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/ui/text/font/FontWeight;", "AndroidBold", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidFontUtils_androidKt {
    public static final int rl(boolean z2, boolean z3) {
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final int t(FontWeight fontWeight, int i2) {
        return rl(fontWeight.compareTo(n(FontWeight.INSTANCE)) >= 0, FontStyle.J2(i2, FontStyle.INSTANCE.n()));
    }

    public static final FontWeight n(FontWeight.Companion companion) {
        return companion.xMQ();
    }
}
