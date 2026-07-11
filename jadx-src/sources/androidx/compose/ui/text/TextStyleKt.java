package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", TtmlNode.START, "stop", "", "fraction", "t", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;F)Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "nr", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/TextStyle;", "layoutDirection", "Landroidx/compose/ui/text/style/TextDirection;", "textDirection", "O", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "Landroidx/compose/ui/text/PlatformSpanStyle;", "platformSpanStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "platformParagraphStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "rl", "(Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformTextStyle;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextStyleKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.f34160n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.f34161t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int O(LayoutDirection layoutDirection, int i2) {
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (TextDirection.mUb(i2, companion.n())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                return companion.rl();
            }
            if (i3 == 2) {
                return companion.t();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!TextDirection.mUb(i2, companion.J2())) {
            return i2;
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i5 == 1) {
            return companion.nr();
        }
        if (i5 == 2) {
            return companion.O();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextStyle nr(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(SpanStyleKt.KN(textStyle.getSpanStyle()), ParagraphStyleKt.O(textStyle.getParagraphStyle(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle rl(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.n(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle t(TextStyle textStyle, TextStyle textStyle2, float f3) {
        return new TextStyle(SpanStyleKt.t(textStyle.rV9(), textStyle2.rV9(), f3), ParagraphStyleKt.rl(textStyle.v(), textStyle2.v(), f3));
    }
}
