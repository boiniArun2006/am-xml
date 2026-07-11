package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u00020\u0004*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/NavigationRailItemColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/material3/ColorScheme;", "rl", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationRailItemColors;", "defaultNavigationRailItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,749:1\n1#2:750\n*E\n"})
public final class NavigationRailItemDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavigationRailItemDefaults f26742n = new NavigationRailItemDefaults();

    public final NavigationRailItemColors rl(ColorScheme colorScheme) {
        NavigationRailItemColors defaultNavigationRailItemColorsCached = colorScheme.getDefaultNavigationRailItemColorsCached();
        if (defaultNavigationRailItemColorsCached != null) {
            return defaultNavigationRailItemColorsCached;
        }
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.f29723n;
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(ColorSchemeKt.Uo(colorScheme, navigationRailTokens.n()), ColorSchemeKt.Uo(colorScheme, navigationRailTokens.J2()), ColorSchemeKt.Uo(colorScheme, navigationRailTokens.rl()), ColorSchemeKt.Uo(colorScheme, navigationRailTokens.mUb()), ColorSchemeKt.Uo(colorScheme, navigationRailTokens.gh()), Color.az(ColorSchemeKt.Uo(colorScheme, navigationRailTokens.mUb()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, navigationRailTokens.gh()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.mI(navigationRailItemColors);
        return navigationRailItemColors;
    }

    private NavigationRailItemDefaults() {
    }

    public final NavigationRailItemColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2014332261, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:308)");
        }
        NavigationRailItemColors navigationRailItemColorsRl = rl(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return navigationRailItemColorsRl;
    }
}
