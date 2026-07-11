package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material3/DefaultDrawerItemsColor;", "Landroidx/compose/material3/NavigationDrawerItemColors;", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedContainerColor", "unselectedContainerColor", "selectedBadgeColor", "unselectedBadgeColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "Landroidx/compose/runtime/State;", "rl", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "t", c.f62177j, "nr", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSelectedIconColor-0d7_KjU", "()J", "getUnselectedIconColor-0d7_KjU", "getSelectedTextColor-0d7_KjU", "getUnselectedTextColor-0d7_KjU", "O", "getSelectedContainerColor-0d7_KjU", "J2", "getUnselectedContainerColor-0d7_KjU", "Uo", "getSelectedBadgeColor-0d7_KjU", "KN", "getUnselectedBadgeColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultDrawerItemsColor implements NavigationDrawerItemColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long unselectedContainerColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long unselectedBadgeColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long selectedContainerColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long selectedBadgeColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long selectedIconColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long unselectedTextColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long unselectedIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long selectedTextColor;

    public /* synthetic */ DefaultDrawerItemsColor(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10);
    }

    private DefaultDrawerItemsColor(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10) {
        this.selectedIconColor = j2;
        this.unselectedIconColor = j3;
        this.selectedTextColor = j4;
        this.unselectedTextColor = j5;
        this.selectedContainerColor = j6;
        this.unselectedContainerColor = j7;
        this.selectedBadgeColor = j9;
        this.unselectedBadgeColor = j10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultDrawerItemsColor)) {
            return false;
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = (DefaultDrawerItemsColor) other;
        if (Color.HI(this.selectedIconColor, defaultDrawerItemsColor.selectedIconColor) && Color.HI(this.unselectedIconColor, defaultDrawerItemsColor.unselectedIconColor) && Color.HI(this.selectedTextColor, defaultDrawerItemsColor.selectedTextColor) && Color.HI(this.unselectedTextColor, defaultDrawerItemsColor.unselectedTextColor) && Color.HI(this.selectedContainerColor, defaultDrawerItemsColor.selectedContainerColor) && Color.HI(this.unselectedContainerColor, defaultDrawerItemsColor.unselectedContainerColor) && Color.HI(this.selectedBadgeColor, defaultDrawerItemsColor.selectedBadgeColor)) {
            return Color.HI(this.unselectedBadgeColor, defaultDrawerItemsColor.unselectedBadgeColor);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.XQ(this.selectedIconColor) * 31) + Color.XQ(this.unselectedIconColor)) * 31) + Color.XQ(this.selectedTextColor)) * 31) + Color.XQ(this.unselectedTextColor)) * 31) + Color.XQ(this.selectedContainerColor)) * 31) + Color.XQ(this.unselectedContainerColor)) * 31) + Color.XQ(this.selectedBadgeColor)) * 31) + Color.XQ(this.unselectedBadgeColor);
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State n(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-433512770);
        if (ComposerKt.v()) {
            ComposerKt.p5(-433512770, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.containerColor (NavigationDrawer.kt:1099)");
        }
        if (z2) {
            j2 = this.selectedContainerColor;
        } else {
            j2 = this.unselectedContainerColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State nr(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(-561675044);
        if (ComposerKt.v()) {
            ComposerKt.p5(-561675044, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.badgeColor (NavigationDrawer.kt:1106)");
        }
        if (z2) {
            j2 = this.selectedBadgeColor;
        } else {
            j2 = this.unselectedBadgeColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State rl(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(1141354218);
        if (ComposerKt.v()) {
            ComposerKt.p5(1141354218, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.iconColor (NavigationDrawer.kt:1089)");
        }
        if (z2) {
            j2 = this.selectedIconColor;
        } else {
            j2 = this.unselectedIconColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material3.NavigationDrawerItemColors
    public State t(boolean z2, Composer composer, int i2) {
        long j2;
        composer.eF(1275109558);
        if (ComposerKt.v()) {
            ComposerKt.p5(1275109558, i2, -1, "androidx.compose.material3.DefaultDrawerItemsColor.textColor (NavigationDrawer.kt:1094)");
        }
        if (z2) {
            j2 = this.selectedTextColor;
        } else {
            j2 = this.unselectedTextColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}
