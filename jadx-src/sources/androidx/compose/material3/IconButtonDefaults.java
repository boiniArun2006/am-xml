package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u001e\u0010\u0016\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u001e\u0010\u0018\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0010J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0018\u0010)\u001a\u00020\u0004*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010,\u001a\u00020\f*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010.\u001a\u00020\u0004*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010(R\u0018\u00100\u001a\u00020\f*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/IconButtonColors;", "HI", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "Landroidx/compose/ui/graphics/Color;", "localContentColor", c.f62177j, "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/IconToggleButtonColors;", "ck", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconToggleButtonColors;", "rl", "(Landroidx/compose/material3/ColorScheme;J)Landroidx/compose/material3/IconToggleButtonColors;", "O", "J2", "Uo", "KN", "r", "t", "Z", "nr", "", "enabled", "checked", "Landroidx/compose/foundation/BorderStroke;", "o", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "Ik", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "Landroidx/compose/ui/graphics/Shape;", "az", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledShape", "ty", "outlinedShape", "xMQ", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconButtonColors;", "defaultFilledIconButtonColors", "mUb", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/IconToggleButtonColors;", "defaultFilledIconToggleButtonColors", "gh", "defaultFilledTonalIconButtonColors", "qie", "defaultFilledTonalIconToggleButtonColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1292:1\n77#2:1293\n77#2:1294\n77#2:1295\n77#2:1297\n77#2:1298\n77#2:1299\n77#2:1300\n77#2:1301\n77#2:1302\n77#2:1303\n77#2:1304\n77#2:1305\n77#2:1306\n77#2:1307\n77#2:1308\n1#3:1296\n1223#4,6:1309\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n594#1:1293\n618#1:1294\n624#1:1295\n652#1:1297\n679#1:1298\n687#1:1299\n941#1:1300\n942#1:1301\n966#1:1302\n972#1:1303\n1002#1:1304\n1029#1:1305\n1037#1:1306\n1095#1:1307\n1097#1:1308\n1101#1:1309,6\n*E\n"})
public final class IconButtonDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final IconButtonDefaults f25965n = new IconButtonDefaults();

    public final IconToggleButtonColors Z(Composer composer, int i2) {
        composer.eF(-779749183);
        if (ComposerKt.v()) {
            ComposerKt.p5(-779749183, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:1000)");
        }
        long value = ((Color) composer.ty(ContentColorKt.n())).getValue();
        IconToggleButtonColors iconToggleButtonColorsNr = nr(MaterialTheme.f26164n.n(composer, 6), value);
        if (Color.HI(iconToggleButtonColorsNr.getContentColor(), value)) {
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return iconToggleButtonColorsNr;
        }
        IconToggleButtonColors iconToggleButtonColorsNr2 = IconToggleButtonColors.nr(iconToggleButtonColorsNr, 0L, value, 0L, Color.az(value, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return iconToggleButtonColorsNr2;
    }

    public final IconToggleButtonColors ck(Composer composer, int i2) {
        composer.eF(-589987581);
        if (ComposerKt.v()) {
            ComposerKt.p5(-589987581, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:650)");
        }
        long value = ((Color) composer.ty(ContentColorKt.n())).getValue();
        IconToggleButtonColors iconToggleButtonColorsRl = rl(MaterialTheme.f26164n.n(composer, 6), value);
        if (Color.HI(iconToggleButtonColorsRl.getContentColor(), value)) {
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return iconToggleButtonColorsRl;
        }
        IconToggleButtonColors iconToggleButtonColorsNr = IconToggleButtonColors.nr(iconToggleButtonColorsRl, 0L, value, 0L, Color.az(value, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return iconToggleButtonColorsNr;
    }

    public final IconButtonColors gh(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached = colorScheme.getDefaultFilledTonalIconButtonColorsCached();
        if (defaultFilledTonalIconButtonColorsCached != null) {
            return defaultFilledTonalIconButtonColorsCached;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.n()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.n())), Color.az(ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.O()), filledTonalIconButtonTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.nr()), filledTonalIconButtonTokens.Uo(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.ER(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors mUb(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached = colorScheme.getDefaultFilledIconToggleButtonColorsCached();
        if (defaultFilledIconToggleButtonColorsCached != null) {
            return defaultFilledIconToggleButtonColorsCached;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.gh()), ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.mUb()), Color.az(ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.J2()), filledIconButtonTokens.Uo(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.O()), filledIconButtonTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.xMQ()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.xMQ())), null);
        colorScheme.How(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors nr(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached = colorScheme.getDefaultIconToggleButtonColorsCached();
        if (defaultIconToggleButtonColorsCached != null) {
            return defaultIconToggleButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jJ2 = companion.J2();
        long jJ22 = companion.J2();
        long jAz = Color.az(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        OutlinedIconButtonTokens outlinedIconButtonTokens = OutlinedIconButtonTokens.f29765n;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(jJ2, j2, jJ22, jAz, ColorSchemeKt.Uo(colorScheme, outlinedIconButtonTokens.t()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, outlinedIconButtonTokens.t())), null);
        colorScheme.Uf(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors qie(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached = colorScheme.getDefaultFilledTonalIconToggleButtonColorsCached();
        if (defaultFilledTonalIconToggleButtonColorsCached != null) {
            return defaultFilledTonalIconToggleButtonColorsCached;
        }
        FilledTonalIconButtonTokens filledTonalIconButtonTokens = FilledTonalIconButtonTokens.f29617n;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.mUb()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.mUb())), Color.az(ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.O()), filledTonalIconButtonTokens.J2(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.nr()), filledTonalIconButtonTokens.Uo(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.KN()), ColorSchemeKt.Uo(colorScheme, filledTonalIconButtonTokens.xMQ()), null);
        colorScheme.lLA(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors rl(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached = colorScheme.getDefaultIconToggleButtonColorsCached();
        if (defaultIconToggleButtonColorsCached != null) {
            return defaultIconToggleButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(companion.J2(), j2, companion.J2(), Color.az(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.J2(), ColorSchemeKt.Uo(colorScheme, IconButtonTokens.f29649n.rl()), null);
        colorScheme.RQ(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors xMQ(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached = colorScheme.getDefaultFilledIconButtonColorsCached();
        if (defaultFilledIconButtonColorsCached != null) {
            return defaultFilledIconButtonColorsCached;
        }
        FilledIconButtonTokens filledIconButtonTokens = FilledIconButtonTokens.f29576n;
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.n()), ColorSchemeKt.rl(colorScheme, ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.n())), Color.az(ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.J2()), filledIconButtonTokens.Uo(), 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, filledIconButtonTokens.O()), filledIconButtonTokens.KN(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.K(iconButtonColors);
        return iconButtonColors;
    }

    private IconButtonDefaults() {
    }

    public final IconButtonColors HI(Composer composer, int i2) {
        composer.eF(-1519621781);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1519621781, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long value = ((Color) composer.ty(ContentColorKt.n())).getValue();
        IconButtonColors iconButtonColorsN = n(MaterialTheme.f26164n.n(composer, 6), value);
        if (Color.HI(iconButtonColorsN.getContentColor(), value)) {
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return iconButtonColorsN;
        }
        IconButtonColors iconButtonColorsNr = IconButtonColors.nr(iconButtonColorsN, 0L, value, 0L, Color.az(value, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return iconButtonColorsNr;
    }

    public final BorderStroke Ik(boolean z2, Composer composer, int i2) {
        long jAz;
        if (ComposerKt.v()) {
            ComposerKt.p5(-511461558, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:1091)");
        }
        if (z2) {
            composer.eF(1186104514);
            jAz = ((Color) composer.ty(ContentColorKt.n())).getValue();
            composer.Xw();
        } else {
            composer.eF(1186170420);
            jAz = Color.az(((Color) composer.ty(ContentColorKt.n())).getValue(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.Xw();
        }
        boolean zNr = composer.nr(jAz);
        Object objIF = composer.iF();
        if (zNr || objIF == Composer.INSTANCE.n()) {
            objIF = BorderStrokeKt.n(OutlinedIconButtonTokens.f29765n.nr(), jAz);
            composer.o(objIF);
        }
        BorderStroke borderStroke = (BorderStroke) objIF;
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return borderStroke;
    }

    public final IconToggleButtonColors J2(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1554706367, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:766)");
        }
        IconToggleButtonColors iconToggleButtonColorsMUb = mUb(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iconToggleButtonColorsMUb;
    }

    public final IconToggleButtonColors KN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(434219587, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:878)");
        }
        IconToggleButtonColors iconToggleButtonColorsQie = qie(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iconToggleButtonColorsQie;
    }

    public final IconButtonColors O(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1857395287, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:719)");
        }
        IconButtonColors iconButtonColorsXMQ = xMQ(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iconButtonColorsXMQ;
    }

    public final IconButtonColors Uo(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1099140437, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:830)");
        }
        IconButtonColors iconButtonColorsGh = gh(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return iconButtonColorsGh;
    }

    public final Shape az(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1265841879, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:584)");
        }
        Shape shapeO = ShapesKt.O(FilledIconButtonTokens.f29576n.t(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final IconButtonColors n(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached == null) {
            Color.Companion companion = Color.INSTANCE;
            IconButtonColors iconButtonColors = new IconButtonColors(companion.J2(), j2, companion.J2(), Color.az(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.W(iconButtonColors);
            return iconButtonColors;
        }
        return defaultIconButtonColorsCached;
    }

    public final BorderStroke o(boolean z2, boolean z3, Composer composer, int i2) {
        composer.eF(1244729690);
        if (ComposerKt.v()) {
            ComposerKt.p5(1244729690, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:1078)");
        }
        if (z3) {
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return null;
        }
        BorderStroke borderStrokeIk = Ik(z2, composer, (i2 & 14) | ((i2 >> 3) & 112));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return borderStrokeIk;
    }

    public final IconButtonColors r(Composer composer, int i2) {
        composer.eF(389287465);
        if (ComposerKt.v()) {
            ComposerKt.p5(389287465, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:938)");
        }
        IconButtonColors iconButtonColorsT = t(MaterialTheme.f26164n.n(composer, 6), ((Color) composer.ty(ContentColorKt.n())).getValue());
        long value = ((Color) composer.ty(ContentColorKt.n())).getValue();
        if (Color.HI(iconButtonColorsT.getContentColor(), value)) {
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return iconButtonColorsT;
        }
        IconButtonColors iconButtonColorsNr = IconButtonColors.nr(iconButtonColorsT, 0L, value, 0L, Color.az(value, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return iconButtonColorsNr;
    }

    public final IconButtonColors t(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultOutlinedIconButtonColorsCached = colorScheme.getDefaultOutlinedIconButtonColorsCached();
        if (defaultOutlinedIconButtonColorsCached == null) {
            Color.Companion companion = Color.INSTANCE;
            IconButtonColors iconButtonColors = new IconButtonColors(companion.J2(), j2, companion.J2(), Color.az(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.p0N(iconButtonColors);
            return iconButtonColors;
        }
        return defaultOutlinedIconButtonColorsCached;
    }

    public final Shape ty(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1327125527, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:588)");
        }
        Shape shapeO = ShapesKt.O(OutlinedIconButtonTokens.f29765n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }
}
