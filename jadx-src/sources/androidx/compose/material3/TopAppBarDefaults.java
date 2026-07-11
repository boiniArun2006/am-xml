package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006R\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0018\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u001a\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u0018\u0010\u001d\u001a\u00020\u0004*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u00020\u0004*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001cR\u0018\u0010#\u001a\u00020\u0004*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0018\u0010$\u001a\u00020\u0004*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/TopAppBarColors;", "ty", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", c.f62177j, "az", "qie", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "mUb", "()F", "TopAppBarExpandedHeight", "t", "KN", "MediumAppBarCollapsedHeight", "nr", "xMQ", "MediumAppBarExpandedHeight", "O", "J2", "LargeAppBarCollapsedHeight", "Uo", "LargeAppBarExpandedHeight", "Landroidx/compose/material3/ColorScheme;", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColors", "Landroidx/compose/foundation/layout/WindowInsets;", "gh", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "defaultCenterAlignedTopAppBarColors", "defaultMediumTopAppBarColors", "defaultLargeTopAppBarColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2543:1\n1#2:2544\n*E\n"})
public final class TopAppBarDefaults {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float LargeAppBarExpandedHeight;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float LargeAppBarCollapsedHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TopAppBarDefaults f28845n = new TopAppBarDefaults();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float MediumAppBarExpandedHeight;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float TopAppBarExpandedHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MediumAppBarCollapsedHeight;

    static {
        TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.f29983n;
        TopAppBarExpandedHeight = topAppBarSmallTokens.rl();
        MediumAppBarCollapsedHeight = topAppBarSmallTokens.rl();
        MediumAppBarExpandedHeight = TopAppBarMediumTokens.f29977n.rl();
        LargeAppBarCollapsedHeight = topAppBarSmallTokens.rl();
        LargeAppBarExpandedHeight = TopAppBarLargeTokens.f29974n.rl();
    }

    public final float J2() {
        return LargeAppBarCollapsedHeight;
    }

    public final float KN() {
        return MediumAppBarCollapsedHeight;
    }

    public final float Uo() {
        return LargeAppBarExpandedHeight;
    }

    public final float mUb() {
        return TopAppBarExpandedHeight;
    }

    public final float xMQ() {
        return MediumAppBarExpandedHeight;
    }

    private TopAppBarDefaults() {
    }

    public final TopAppBarColors O(ColorScheme colorScheme) {
        TopAppBarColors defaultTopAppBarColorsCached = colorScheme.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached == null) {
            TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.f29983n;
            TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.Uo(colorScheme, topAppBarSmallTokens.n()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallTokens.J2()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallTokens.O()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallTokens.t()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallTokens.Uo()), null);
            colorScheme.uG(topAppBarColors);
            return topAppBarColors;
        }
        return defaultTopAppBarColorsCached;
    }

    public final TopAppBarColors az(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1268886463, i2, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:1085)");
        }
        TopAppBarColors topAppBarColorsNr = nr(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return topAppBarColorsNr;
    }

    public final WindowInsets gh(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2143182847, i2, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        WindowInsets windowInsetsN = SystemBarsDefaultInsets_androidKt.n(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsKN = WindowInsetsKt.KN(windowInsetsN, WindowInsetsSides.r(companion.Uo(), companion.gh()));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsKN;
    }

    public final TopAppBarColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(513940029, i2, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:1035)");
        }
        TopAppBarColors topAppBarColorsRl = rl(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return topAppBarColorsRl;
    }

    public final TopAppBarColors nr(ColorScheme colorScheme) {
        TopAppBarColors defaultMediumTopAppBarColorsCached = colorScheme.getDefaultMediumTopAppBarColorsCached();
        if (defaultMediumTopAppBarColorsCached == null) {
            TopAppBarMediumTokens topAppBarMediumTokens = TopAppBarMediumTokens.f29977n;
            TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.Uo(colorScheme, topAppBarMediumTokens.n()), ColorSchemeKt.Uo(colorScheme, TopAppBarSmallTokens.f29983n.J2()), ColorSchemeKt.Uo(colorScheme, topAppBarMediumTokens.O()), ColorSchemeKt.Uo(colorScheme, topAppBarMediumTokens.t()), ColorSchemeKt.Uo(colorScheme, topAppBarMediumTokens.J2()), null);
            colorScheme.QZ6(topAppBarColors);
            return topAppBarColors;
        }
        return defaultMediumTopAppBarColorsCached;
    }

    public final TopAppBarColors qie(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1744932393, i2, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
        }
        TopAppBarColors topAppBarColorsT = t(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return topAppBarColorsT;
    }

    public final TopAppBarColors rl(ColorScheme colorScheme) {
        TopAppBarColors defaultCenterAlignedTopAppBarColorsCached = colorScheme.getDefaultCenterAlignedTopAppBarColorsCached();
        if (defaultCenterAlignedTopAppBarColorsCached == null) {
            TopAppBarSmallCenteredTokens topAppBarSmallCenteredTokens = TopAppBarSmallCenteredTokens.f29980n;
            TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.Uo(colorScheme, topAppBarSmallCenteredTokens.n()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallCenteredTokens.nr()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallCenteredTokens.t()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallCenteredTokens.rl()), ColorSchemeKt.Uo(colorScheme, topAppBarSmallCenteredTokens.O()), null);
            colorScheme.mYa(topAppBarColors);
            return topAppBarColors;
        }
        return defaultCenterAlignedTopAppBarColorsCached;
    }

    public final TopAppBarColors t(ColorScheme colorScheme) {
        TopAppBarColors defaultLargeTopAppBarColorsCached = colorScheme.getDefaultLargeTopAppBarColorsCached();
        if (defaultLargeTopAppBarColorsCached == null) {
            TopAppBarLargeTokens topAppBarLargeTokens = TopAppBarLargeTokens.f29974n;
            TopAppBarColors topAppBarColors = new TopAppBarColors(ColorSchemeKt.Uo(colorScheme, topAppBarLargeTokens.n()), ColorSchemeKt.Uo(colorScheme, TopAppBarSmallTokens.f29983n.J2()), ColorSchemeKt.Uo(colorScheme, topAppBarLargeTokens.O()), ColorSchemeKt.Uo(colorScheme, topAppBarLargeTokens.t()), ColorSchemeKt.Uo(colorScheme, topAppBarLargeTokens.J2()), null);
            colorScheme.F(topAppBarColors);
            return topAppBarColors;
        }
        return defaultLargeTopAppBarColorsCached;
    }

    public final TopAppBarColors ty(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1388520854, i2, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        TopAppBarColors topAppBarColorsO = O(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return topAppBarColorsO;
    }
}
