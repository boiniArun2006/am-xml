package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "t", "(JJJJJJ)Landroidx/compose/material3/IconToggleButtonColors;", "", "enabled", "checked", "Landroidx/compose/runtime/State;", c.f62177j, "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rl", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "O", "getDisabledContainerColor-0d7_KjU", "nr", "getDisabledContentColor-0d7_KjU", "getCheckedContainerColor-0d7_KjU", "J2", "getCheckedContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1292:1\n708#2:1293\n696#2:1294\n708#2:1295\n696#2:1296\n708#2:1297\n696#2:1298\n708#2:1299\n696#2:1300\n708#2:1301\n696#2:1302\n708#2:1303\n696#2:1304\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n*L\n1225#1:1293\n1225#1:1294\n1226#1:1295\n1226#1:1296\n1227#1:1297\n1227#1:1298\n1228#1:1299\n1228#1:1300\n1229#1:1301\n1229#1:1302\n1230#1:1303\n1230#1:1304\n*E\n"})
public final class IconToggleButtonColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long checkedContentColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long checkedContainerColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long disabledContentColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    public /* synthetic */ IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) other;
        return Color.HI(this.containerColor, iconToggleButtonColors.containerColor) && Color.HI(this.contentColor, iconToggleButtonColors.contentColor) && Color.HI(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.HI(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.HI(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.HI(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    private IconToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.disabledContainerColor = j4;
        this.disabledContentColor = j5;
        this.checkedContainerColor = j6;
        this.checkedContentColor = j7;
    }

    public static /* synthetic */ IconToggleButtonColors nr(IconToggleButtonColors iconToggleButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = iconToggleButtonColors.containerColor;
        }
        return iconToggleButtonColors.t(j2, (i2 & 2) != 0 ? iconToggleButtonColors.contentColor : j3, (i2 & 4) != 0 ? iconToggleButtonColors.disabledContainerColor : j4, (i2 & 8) != 0 ? iconToggleButtonColors.disabledContentColor : j5, (i2 & 16) != 0 ? iconToggleButtonColors.checkedContainerColor : j6, (i2 & 32) != 0 ? iconToggleButtonColors.checkedContentColor : j7);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    public int hashCode() {
        return (((((((((Color.XQ(this.containerColor) * 31) + Color.XQ(this.contentColor)) * 31) + Color.XQ(this.disabledContainerColor)) * 31) + Color.XQ(this.disabledContentColor)) * 31) + Color.XQ(this.checkedContainerColor)) * 31) + Color.XQ(this.checkedContentColor);
    }

    public final IconToggleButtonColors t(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor) {
        return new IconToggleButtonColors(containerColor != 16 ? containerColor : this.containerColor, contentColor != 16 ? contentColor : this.contentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledContentColor != 16 ? disabledContentColor : this.disabledContentColor, checkedContainerColor != 16 ? checkedContainerColor : this.checkedContainerColor, checkedContentColor != 16 ? checkedContentColor : this.checkedContentColor, null);
    }

    public final State n(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        if (ComposerKt.v()) {
            ComposerKt.p5(1175394478, i2, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
        }
        if (!z2) {
            j2 = this.disabledContainerColor;
        } else if (!z3) {
            j2 = this.containerColor;
        } else {
            j2 = this.checkedContainerColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }

    public final State rl(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        if (ComposerKt.v()) {
            ComposerKt.p5(1340854054, i2, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
        }
        if (!z2) {
            j2 = this.disabledContentColor;
        } else if (!z3) {
            j2 = this.contentColor;
        } else {
            j2 = this.checkedContentColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }
}
