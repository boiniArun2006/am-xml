package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u00020\u0004*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/ExpressiveNavigationBarItemDefaults;", "", "<init>", "()V", "Landroidx/compose/material3/NavigationItemColors;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationItemColors;", "Landroidx/compose/material3/ColorScheme;", "rl", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationItemColors;", "defaultExpressiveNavigationBarItemColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/ExpressiveNavigationBarItemDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,459:1\n1#2:460\n*E\n"})
public final class ExpressiveNavigationBarItemDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ExpressiveNavigationBarItemDefaults f25847n = new ExpressiveNavigationBarItemDefaults();

    public final NavigationItemColors rl(ColorScheme colorScheme) {
        NavigationItemColors defaultExpressiveNavigationBarItemColorsCached = colorScheme.getDefaultExpressiveNavigationBarItemColorsCached();
        if (defaultExpressiveNavigationBarItemColorsCached != null) {
            return defaultExpressiveNavigationBarItemColorsCached;
        }
        NavigationItemColors navigationItemColors = new NavigationItemColors(ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.Uo), ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.KN), ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.xMQ), ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.mUb), ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.gh), Color.az(ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.mUb), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.az(ColorSchemeKt.Uo(colorScheme, ExpressiveNavigationBarKt.gh), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.i(navigationItemColors);
        return navigationItemColors;
    }

    private ExpressiveNavigationBarItemDefaults() {
    }

    public final NavigationItemColors n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1959617551, i2, -1, "androidx.compose.material3.ExpressiveNavigationBarItemDefaults.colors (ExpressiveNavigationBar.kt:272)");
        }
        NavigationItemColors navigationItemColorsRl = rl(MaterialTheme.f26164n.n(composer, 6));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return navigationItemColorsRl;
    }
}
