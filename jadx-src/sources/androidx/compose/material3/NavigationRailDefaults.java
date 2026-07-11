package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/NavigationRailDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)J", "ContainerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "rl", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationRailDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavigationRailDefaults f26738n = new NavigationRailDefaults();

    private NavigationRailDefaults() {
    }

    public final long n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1949394041, i2, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:291)");
        }
        long jXMQ = ColorSchemeKt.xMQ(NavigationRailTokens.f29723n.Uo(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final WindowInsets rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1546379058, i2, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:297)");
        }
        WindowInsets windowInsetsN = SystemBarsDefaultInsets_androidKt.n(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsKN = WindowInsetsKt.KN(windowInsetsN, WindowInsetsSides.r(companion.qie(), companion.mUb()));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsKN;
    }
}
