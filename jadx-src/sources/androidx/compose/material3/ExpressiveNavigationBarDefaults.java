package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/ExpressiveNavigationBarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "rl", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "t", "contentColor", "Landroidx/compose/material3/NavigationBarArrangement;", c.f62177j, "()I", "arrangement", "Landroidx/compose/foundation/layout/WindowInsets;", "nr", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExpressiveNavigationBarDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ExpressiveNavigationBarDefaults f25846n = new ExpressiveNavigationBarDefaults();

    public final int n() {
        return NavigationBarArrangement.INSTANCE.rl();
    }

    private ExpressiveNavigationBarDefaults() {
    }

    public final WindowInsets nr(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1317880490, i2, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-windowInsets> (ExpressiveNavigationBar.kt:259)");
        }
        WindowInsets windowInsetsN = SystemBarsDefaultInsets_androidKt.n(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsKN = WindowInsetsKt.KN(windowInsetsN, WindowInsetsSides.r(companion.Uo(), companion.O()));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsKN;
    }

    public final long rl(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1666471887, i2, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-containerColor> (ExpressiveNavigationBar.kt:244)");
        }
        long jXMQ = ColorSchemeKt.xMQ(ColorSchemeKeyTokens.SurfaceContainer, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final long t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(190518351, i2, -1, "androidx.compose.material3.ExpressiveNavigationBarDefaults.<get-contentColor> (ExpressiveNavigationBar.kt:249)");
        }
        long jXMQ = ColorSchemeKt.xMQ(ColorSchemeKeyTokens.OnSurfaceVariant, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }
}
