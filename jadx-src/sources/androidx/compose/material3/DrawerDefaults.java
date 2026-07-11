package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00148Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00148Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/DrawerDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "nr", "()F", "ModalDrawerElevation", "t", "O", "PermanentDrawerElevation", c.f62177j, "DismissibleDrawerElevation", "MaximumDrawerWidth", "Landroidx/compose/ui/graphics/Shape;", "Uo", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "J2", "(Landroidx/compose/runtime/Composer;I)J", "scrimColor", "KN", "standardContainerColor", "modalContainerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "xMQ", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DrawerDefaults {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float MaximumDrawerWidth;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float DismissibleDrawerElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float PermanentDrawerElevation;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DrawerDefaults f25687n = new DrawerDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float ModalDrawerElevation = ElevationTokens.f29511n.n();

    static {
        NavigationDrawerTokens navigationDrawerTokens = NavigationDrawerTokens.f29712n;
        PermanentDrawerElevation = navigationDrawerTokens.qie();
        DismissibleDrawerElevation = navigationDrawerTokens.qie();
        MaximumDrawerWidth = navigationDrawerTokens.Uo();
    }

    public final float O() {
        return PermanentDrawerElevation;
    }

    public final float n() {
        return DismissibleDrawerElevation;
    }

    public final float nr() {
        return ModalDrawerElevation;
    }

    public final float rl() {
        return MaximumDrawerWidth;
    }

    private DrawerDefaults() {
    }

    public final long J2(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1055074989, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-scrimColor> (NavigationDrawer.kt:869)");
        }
        long jAz = Color.az(ColorSchemeKt.xMQ(ScrimTokens.f29851n.n(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jAz;
    }

    public final long KN(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-125949421, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-standardContainerColor> (NavigationDrawer.kt:884)");
        }
        long jXMQ = ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.gh(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final Shape Uo(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(928378975, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-shape> (NavigationDrawer.kt:865)");
        }
        Shape shapeO = ShapesKt.O(NavigationDrawerTokens.f29712n.J2(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return shapeO;
    }

    public final long t(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(706424321, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-modalContainerColor> (NavigationDrawer.kt:888)");
        }
        long jXMQ = ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.mUb(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }

    public final WindowInsets xMQ(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-909973510, i2, -1, "androidx.compose.material3.DrawerDefaults.<get-windowInsets> (NavigationDrawer.kt:897)");
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
