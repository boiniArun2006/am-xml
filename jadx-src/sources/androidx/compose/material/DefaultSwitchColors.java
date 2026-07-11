package androidx.compose.material;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001bR\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material/DefaultSwitchColors;", "Landroidx/compose/material/SwitchColors;", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "uncheckedThumbColor", "uncheckedTrackColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "rl", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", c.f62177j, "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "t", "nr", "O", "J2", "Uo", "KN", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultSwitchColors implements SwitchColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledCheckedTrackColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long disabledUncheckedTrackColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedThumbColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long disabledUncheckedThumbColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long checkedThumbColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long uncheckedTrackColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long checkedTrackColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedThumbColor;

    public /* synthetic */ DefaultSwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultSwitchColors.class != other.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) other;
        return Color.HI(this.checkedThumbColor, defaultSwitchColors.checkedThumbColor) && Color.HI(this.checkedTrackColor, defaultSwitchColors.checkedTrackColor) && Color.HI(this.uncheckedThumbColor, defaultSwitchColors.uncheckedThumbColor) && Color.HI(this.uncheckedTrackColor, defaultSwitchColors.uncheckedTrackColor) && Color.HI(this.disabledCheckedThumbColor, defaultSwitchColors.disabledCheckedThumbColor) && Color.HI(this.disabledCheckedTrackColor, defaultSwitchColors.disabledCheckedTrackColor) && Color.HI(this.disabledUncheckedThumbColor, defaultSwitchColors.disabledUncheckedThumbColor) && Color.HI(this.disabledUncheckedTrackColor, defaultSwitchColors.disabledUncheckedTrackColor);
    }

    private DefaultSwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10) {
        this.checkedThumbColor = j2;
        this.checkedTrackColor = j3;
        this.uncheckedThumbColor = j4;
        this.uncheckedTrackColor = j5;
        this.disabledCheckedThumbColor = j6;
        this.disabledCheckedTrackColor = j7;
        this.disabledUncheckedThumbColor = j9;
        this.disabledUncheckedTrackColor = j10;
    }

    public int hashCode() {
        return (((((((((((((Color.XQ(this.checkedThumbColor) * 31) + Color.XQ(this.checkedTrackColor)) * 31) + Color.XQ(this.uncheckedThumbColor)) * 31) + Color.XQ(this.uncheckedTrackColor)) * 31) + Color.XQ(this.disabledCheckedThumbColor)) * 31) + Color.XQ(this.disabledCheckedTrackColor)) * 31) + Color.XQ(this.disabledUncheckedThumbColor)) * 31) + Color.XQ(this.disabledUncheckedTrackColor);
    }

    @Override // androidx.compose.material.SwitchColors
    public State n(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(-1176343362);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1176343362, i2, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:379)");
        }
        if (z2) {
            if (z3) {
                j2 = this.checkedTrackColor;
            } else {
                j2 = this.uncheckedTrackColor;
            }
        } else if (z3) {
            j2 = this.disabledCheckedTrackColor;
        } else {
            j2 = this.disabledUncheckedTrackColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.SwitchColors
    public State rl(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        composer.eF(-66424183);
        if (ComposerKt.v()) {
            ComposerKt.p5(-66424183, i2, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:368)");
        }
        if (z2) {
            if (z3) {
                j2 = this.checkedThumbColor;
            } else {
                j2 = this.uncheckedThumbColor;
            }
        } else if (z3) {
            j2 = this.disabledCheckedThumbColor;
        } else {
            j2 = this.disabledUncheckedThumbColor;
        }
        State stateCk = SnapshotStateKt.ck(Color.xMQ(j2), composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateCk;
    }
}
