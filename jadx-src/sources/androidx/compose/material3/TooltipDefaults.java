package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00168Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00168Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010 \u001a\u00020\u0004*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material3/TooltipDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/RichTooltipColors;", "Uo", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/ui/unit/Dp;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/window/PopupPositionProvider;", "J2", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpSize;", "rl", "J", "getCaretSize-MYxV2XQ", "()J", "caretSize", "Landroidx/compose/ui/graphics/Shape;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "plainTooltipContainerShape", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/runtime/Composer;I)J", "plainTooltipContainerColor", "nr", "plainTooltipContentColor", "O", "richTooltipContainerShape", "Landroidx/compose/material3/ColorScheme;", c.f62177j, "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RichTooltipColors;", "defaultRichTooltipColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n1#2:646\n77#3:647\n77#3:654\n1223#4,6:648\n1223#4,6:655\n148#5:661\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n*L\n305#1:647\n338#1:654\n306#1:648,6\n339#1:655,6\n256#1:661\n*E\n"})
public final class TooltipDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TooltipDefaults f28770n = new TooltipDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final long caretSize = DpKt.rl(Dp.KN(16), Dp.KN(8));

    public final PopupPositionProvider J2(float f3, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = TooltipKt.mUb();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1047866909, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:302)");
        }
        final int iHow = ((Density) composer.ty(CompositionLocalsKt.J2())).How(f3);
        boolean zT2 = composer.t(iHow);
        Object objIF = composer.iF();
        if (zT2 || objIF == Composer.INSTANCE.n()) {
            objIF = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.ui.window.PopupPositionProvider
                public long n(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
                    int left = anchorBounds.getLeft() + ((anchorBounds.qie() - IntSize.Uo(popupContentSize)) / 2);
                    int top = (anchorBounds.getTop() - IntSize.J2(popupContentSize)) - iHow;
                    if (top < 0) {
                        top = iHow + anchorBounds.getBottom();
                    }
                    return IntOffsetKt.n(left, top);
                }
            };
            composer.o(objIF);
        }
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$1;
    }

    private TooltipDefaults() {
    }

    public final Shape O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1138709783, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:252)");
        }
        Shape shapeO = ShapesKt.O(RichTooltipTokens.f29849n.O(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final RichTooltipColors Uo(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1622312141, i2, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:261)");
        }
        RichTooltipColors richTooltipColorsN = n(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return richTooltipColorsN;
    }

    public final RichTooltipColors n(ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached = colorScheme.getDefaultRichTooltipColorsCached();
        if (defaultRichTooltipColorsCached == null) {
            RichTooltipTokens richTooltipTokens = RichTooltipTokens.f29849n;
            RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.Uo(colorScheme, richTooltipTokens.t()), ColorSchemeKt.Uo(colorScheme, richTooltipTokens.KN()), ColorSchemeKt.Uo(colorScheme, richTooltipTokens.J2()), ColorSchemeKt.Uo(colorScheme, richTooltipTokens.n()), null);
            colorScheme.Qu(richTooltipColors);
            return richTooltipColors;
        }
        return defaultRichTooltipColorsCached;
    }

    public final long nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1982928937, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:248)");
        }
        long jXMQ = ColorSchemeKt.xMQ(PlainTooltipTokens.f29832n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(102696215, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:244)");
        }
        long jXMQ = ColorSchemeKt.xMQ(PlainTooltipTokens.f29832n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final Shape t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(49570325, i2, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:240)");
        }
        Shape shapeO = ShapesKt.O(PlainTooltipTokens.f29832n.rl(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
