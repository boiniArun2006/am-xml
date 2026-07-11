package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJN\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0012J\u0019\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010(\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0018\u0010,\u001a\u00020\u0010*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010.\u001a\u00020\u0010*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0018\u00100\u001a\u00020\u0010*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "Landroidx/compose/material3/CardElevation;", "t", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "O", "ty", "Landroidx/compose/material3/CardColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "rl", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "nr", "az", "", "enabled", "Landroidx/compose/foundation/BorderStroke;", "qie", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/ui/graphics/Shape;", "gh", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "xMQ", "elevatedShape", "mUb", "outlinedShape", "Landroidx/compose/material3/ColorScheme;", "J2", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultCardColors", "Uo", "defaultElevatedCardColors", "KN", "defaultOutlinedCardColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1#2:852\n1223#3,6:853\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n627#1:853,6\n*E\n"})
public final class CardDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CardDefaults f24661n = new CardDefaults();
    public static final int rl = 0;

    public final BorderStroke qie(boolean z2, Composer composer, int i2, int i3) {
        long jUo;
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-392936593, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:617)");
        }
        if (z2) {
            composer.eF(-134409770);
            jUo = ColorSchemeKt.xMQ(OutlinedCardTokens.f29761n.Uo(), composer, 6);
            composer.Xw();
        } else {
            composer.eF(-134330379);
            jUo = ColorKt.Uo(Color.az(ColorSchemeKt.xMQ(OutlinedCardTokens.f29761n.O(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.xMQ(ElevatedCardTokens.f29508n.n(), composer, 6));
            composer.Xw();
        }
        boolean zNr = composer.nr(jUo);
        Object objIF = composer.iF();
        if (zNr || objIF == Composer.INSTANCE.n()) {
            objIF = BorderStrokeKt.n(OutlinedCardTokens.f29761n.KN(), jUo);
            composer.o(objIF);
        }
        BorderStroke borderStroke = (BorderStroke) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStroke;
    }

    public final CardColors J2(ColorScheme colorScheme) {
        CardColors defaultCardColorsCached = colorScheme.getDefaultCardColorsCached();
        if (defaultCardColorsCached != null) {
            return defaultCardColorsCached;
        }
        FilledCardTokens filledCardTokens = FilledCardTokens.f29571n;
        CardColors cardColors = new CardColors(ColorSchemeKt.Uo(colorScheme, filledCardTokens.n()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, filledCardTokens.n())), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, filledCardTokens.nr()), filledCardTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledCardTokens.n())), Color.az(ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, filledCardTokens.n())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.qm(cardColors);
        return cardColors;
    }

    public final CardColors KN(ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached = colorScheme.getDefaultOutlinedCardColorsCached();
        if (defaultOutlinedCardColorsCached != null) {
            return defaultOutlinedCardColorsCached;
        }
        OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.f29761n;
        CardColors cardColors = new CardColors(ColorSchemeKt.Uo(colorScheme, outlinedCardTokens.n()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, outlinedCardTokens.n())), ColorSchemeKt.Uo(colorScheme, outlinedCardTokens.n()), Color.az(ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, outlinedCardTokens.n())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.Bu(cardColors);
        return cardColors;
    }

    public final CardElevation O(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = ElevatedCardTokens.f29508n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = ElevatedCardTokens.f29508n.mUb();
        }
        if ((i3 & 4) != 0) {
            f5 = ElevatedCardTokens.f29508n.KN();
        }
        if ((i3 & 8) != 0) {
            f6 = ElevatedCardTokens.f29508n.xMQ();
        }
        if ((i3 & 16) != 0) {
            f7 = ElevatedCardTokens.f29508n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = ElevatedCardTokens.f29508n.O();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1154241939, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:434)");
        }
        float f10 = f8;
        float f11 = f5;
        float f12 = f3;
        CardElevation cardElevation = new CardElevation(f12, f4, f11, f6, f9, f10, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardElevation;
    }

    public final CardColors Uo(ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached = colorScheme.getDefaultElevatedCardColorsCached();
        if (defaultElevatedCardColorsCached != null) {
            return defaultElevatedCardColorsCached;
        }
        ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.f29508n;
        CardColors cardColors = new CardColors(ColorSchemeKt.Uo(colorScheme, elevatedCardTokens.n()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, elevatedCardTokens.n())), ColorKt.Uo(Color.az(ColorSchemeKt.Uo(colorScheme, elevatedCardTokens.nr()), elevatedCardTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, elevatedCardTokens.nr())), Color.az(ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, elevatedCardTokens.n())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.EWS(cardColors);
        return cardColors;
    }

    public final CardColors rl(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long j6;
        long jAz;
        long jUo = (i3 & 1) != 0 ? Color.INSTANCE.Uo() : j2;
        long jT2 = (i3 & 2) != 0 ? ColorSchemeKt.t(jUo, composer, i2 & 14) : j3;
        long jUo2 = (i3 & 4) != 0 ? Color.INSTANCE.Uo() : j4;
        if ((i3 & 8) != 0) {
            long j7 = jT2;
            jAz = Color.az(j7, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j6 = j7;
        } else {
            j6 = jT2;
            jAz = j5;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1589582123, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:494)");
        }
        CardColors cardColorsT = J2(MaterialTheme.f26164n.n(composer, 6)).t(jUo, j6, jUo2, jAz);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardColorsT;
    }

    public final CardElevation t(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = FilledCardTokens.f29571n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = FilledCardTokens.f29571n.mUb();
        }
        if ((i3 & 4) != 0) {
            f5 = FilledCardTokens.f29571n.KN();
        }
        if ((i3 & 8) != 0) {
            f6 = FilledCardTokens.f29571n.xMQ();
        }
        if ((i3 & 16) != 0) {
            f7 = FilledCardTokens.f29571n.Uo();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = FilledCardTokens.f29571n.O();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-574898487, i2, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:405)");
        }
        float f10 = f8;
        float f11 = f5;
        float f12 = f3;
        CardElevation cardElevation = new CardElevation(f12, f4, f11, f6, f9, f10, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardElevation;
    }

    public final CardElevation ty(float f3, float f4, float f5, float f6, float f7, float f8, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f3 = OutlinedCardTokens.f29761n.rl();
        }
        if ((i3 & 2) != 0) {
            f4 = f3;
        }
        if ((i3 & 4) != 0) {
            f5 = f3;
        }
        if ((i3 & 8) != 0) {
            f6 = f3;
        }
        if ((i3 & 16) != 0) {
            f7 = OutlinedCardTokens.f29761n.J2();
        }
        float f9 = f7;
        if ((i3 & 32) != 0) {
            f8 = OutlinedCardTokens.f29761n.nr();
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-97678773, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:463)");
        }
        float f10 = f8;
        float f11 = f5;
        float f12 = f3;
        CardElevation cardElevation = new CardElevation(f12, f4, f11, f6, f9, f10, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardElevation;
    }

    private CardDefaults() {
    }

    public final CardColors az(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1204388929, i2, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:571)");
        }
        CardColors cardColorsKN = KN(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardColorsKN;
    }

    public final Shape gh(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1266660211, i2, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:376)");
        }
        Shape shapeO = ShapesKt.O(FilledCardTokens.f29571n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final Shape mUb(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1095404023, i2, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:384)");
        }
        Shape shapeO = ShapesKt.O(OutlinedCardTokens.f29761n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final CardColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1876034303, i2, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:476)");
        }
        CardColors cardColorsJ2 = J2(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardColorsJ2;
    }

    public final CardColors nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1610137975, i2, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:522)");
        }
        CardColors cardColorsUo = Uo(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return cardColorsUo;
    }

    public final Shape xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-133496185, i2, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:380)");
        }
        Shape shapeO = ShapesKt.O(ElevatedCardTokens.f29508n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
