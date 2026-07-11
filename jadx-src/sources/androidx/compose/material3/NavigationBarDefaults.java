package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/NavigationBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "()F", "Elevation", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "t", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NavigationBarDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavigationBarDefaults f26406n = new NavigationBarDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Elevation = ElevationTokens.f29511n.n();

    public final float rl() {
        return Elevation;
    }

    private NavigationBarDefaults() {
    }

    public final long n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1528098623, i2, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:292)");
        }
        long jXMQ = ColorSchemeKt.xMQ(NavigationBarTokens.f29700n.Uo(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final WindowInsets t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1938678202, i2, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:298)");
        }
        WindowInsets windowInsetsN = SystemBarsDefaultInsets_androidKt.n(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsKN = WindowInsetsKt.KN(windowInsetsN, WindowInsetsSides.r(companion.Uo(), companion.O()));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsKN;
    }
}
