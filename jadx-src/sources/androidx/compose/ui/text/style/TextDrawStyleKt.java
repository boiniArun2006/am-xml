package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", TtmlNode.START, "stop", "", "fraction", "rl", "(Landroidx/compose/ui/text/style/TextForegroundStyle;Landroidx/compose/ui/text/style/TextForegroundStyle;F)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "alpha", "t", "(JF)J", "Lkotlin/Function0;", "block", "nr", "(FLkotlin/jvm/functions/Function0;)F", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "TextDrawStyleKt")
public final class TextDrawStyleKt {
    public static final TextForegroundStyle rl(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f3) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        return (z2 || (textForegroundStyle2 instanceof BrushStyle)) ? (z2 && (textForegroundStyle2 instanceof BrushStyle)) ? TextForegroundStyle.INSTANCE.n((Brush) SpanStyleKt.nr(((BrushStyle) textForegroundStyle).O(), ((BrushStyle) textForegroundStyle2).O(), f3), MathHelpersKt.rl(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f3)) : (TextForegroundStyle) SpanStyleKt.nr(textForegroundStyle, textForegroundStyle2, f3) : TextForegroundStyle.INSTANCE.rl(ColorKt.KN(textForegroundStyle.getValue(), textForegroundStyle2.getValue(), f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float nr(float f3, Function0 function0) {
        if (Float.isNaN(f3)) {
            return ((Number) function0.invoke()).floatValue();
        }
        return f3;
    }

    public static final long t(long j2, float f3) {
        if (Float.isNaN(f3) || f3 >= 1.0f) {
            return j2;
        }
        return Color.az(j2, Color.ck(j2) * f3, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
