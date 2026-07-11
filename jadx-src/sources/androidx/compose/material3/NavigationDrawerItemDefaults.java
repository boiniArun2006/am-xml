package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jb\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "selectedContainerColor", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "Landroidx/compose/material3/NavigationDrawerItemColors;", c.f62177j, "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "Landroidx/compose/foundation/layout/PaddingValues;", "rl", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ItemPadding", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1167:1\n148#2:1168\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n1045#1:1168\n*E\n"})
public final class NavigationDrawerItemDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NavigationDrawerItemDefaults f26479n = new NavigationDrawerItemDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final PaddingValues ItemPadding = PaddingKt.t(Dp.KN(12), 0.0f, 2, null);

    public final NavigationDrawerItemColors n(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, Composer composer, int i2, int i3) {
        long j11;
        long jXMQ = (i3 & 1) != 0 ? ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.rl(), composer, 6) : j2;
        long jJ2 = (i3 & 2) != 0 ? Color.INSTANCE.J2() : j3;
        long jXMQ2 = (i3 & 4) != 0 ? ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.n(), composer, 6) : j4;
        long jXMQ3 = (i3 & 8) != 0 ? ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.KN(), composer, 6) : j5;
        long jXMQ4 = (i3 & 16) != 0 ? ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.O(), composer, 6) : j6;
        long jXMQ5 = (i3 & 32) != 0 ? ColorSchemeKt.xMQ(NavigationDrawerTokens.f29712n.xMQ(), composer, 6) : j7;
        long j12 = (i3 & 64) != 0 ? jXMQ4 : j9;
        long j13 = (i3 & 128) != 0 ? jXMQ5 : j10;
        if (ComposerKt.v()) {
            j11 = jXMQ5;
            ComposerKt.p5(-1574983348, i2, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:1029)");
        } else {
            j11 = jXMQ5;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(jXMQ2, jXMQ3, jXMQ4, j11, jXMQ, jJ2, j12, j13, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return defaultDrawerItemsColor;
    }

    private NavigationDrawerItemDefaults() {
    }
}
