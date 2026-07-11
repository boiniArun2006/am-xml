package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material/DefaultCheckboxColors;", "Landroidx/compose/material/CheckboxColors;", "Landroidx/compose/ui/graphics/Color;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", c.f62177j, "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "enabled", "t", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "rl", "J", "nr", "O", "J2", "Uo", "KN", "xMQ", "mUb", "gh", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultCheckboxColors implements CheckboxColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long uncheckedBoxColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long checkedBoxColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long uncheckedBorderColor;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.f33331n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.f33330O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.f33333t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13);
    }

    private DefaultCheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13) {
        this.checkedCheckmarkColor = j2;
        this.uncheckedCheckmarkColor = j3;
        this.checkedBoxColor = j4;
        this.uncheckedBoxColor = j5;
        this.disabledCheckedBoxColor = j6;
        this.disabledUncheckedBoxColor = j7;
        this.disabledIndeterminateBoxColor = j9;
        this.checkedBorderColor = j10;
        this.uncheckedBorderColor = j11;
        this.disabledBorderColor = j12;
        this.disabledIndeterminateBorderColor = j13;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State n(ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        int i3;
        composer.eF(544656267);
        if (ComposerKt.v()) {
            ComposerKt.p5(544656267, i2, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:407)");
        }
        ToggleableState toggleableState2 = ToggleableState.f33333t;
        if (toggleableState == toggleableState2) {
            j2 = this.uncheckedCheckmarkColor;
        } else {
            j2 = this.checkedCheckmarkColor;
        }
        long j3 = j2;
        if (toggleableState == toggleableState2) {
            i3 = 100;
        } else {
            i3 = 50;
        }
        State stateN = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(i3, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateN;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State rl(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        Composer composer2;
        State stateCk;
        int i3;
        composer.eF(-1568341342);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1568341342, i2, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:447)");
        }
        if (z2) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3) {
                    j2 = this.uncheckedBorderColor;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j2 = this.checkedBorderColor;
            }
        } else {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 = this.disabledBorderColor;
                } else {
                    j2 = this.disabledIndeterminateBorderColor;
                }
            } else {
                j2 = this.disabledBorderColor;
            }
        }
        long j3 = j2;
        if (z2) {
            composer.eF(-840498473);
            if (toggleableState == ToggleableState.f33333t) {
                i3 = 100;
            } else {
                i3 = 50;
            }
            composer2 = composer;
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(i3, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.Xw();
        } else {
            composer2 = composer;
            composer2.eF(-840317929);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j3), composer2, 0);
            composer2.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer2.Xw();
        return stateCk;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State t(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        Composer composer2;
        State stateCk;
        int i3;
        composer.eF(840901029);
        if (ComposerKt.v()) {
            ComposerKt.p5(840901029, i2, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:420)");
        }
        if (z2) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3) {
                    j2 = this.uncheckedBoxColor;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j2 = this.checkedBoxColor;
            }
        } else {
            int i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        j2 = this.disabledUncheckedBoxColor;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j2 = this.disabledIndeterminateBoxColor;
                }
            } else {
                j2 = this.disabledCheckedBoxColor;
            }
        }
        long j3 = j2;
        if (z2) {
            composer.eF(507535414);
            if (toggleableState == ToggleableState.f33333t) {
                i3 = 100;
            } else {
                i3 = 50;
            }
            composer2 = composer;
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(i3, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.Xw();
        } else {
            composer2 = composer;
            composer2.eF(507715958);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j3), composer2, 0);
            composer2.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer2.Xw();
        return stateCk;
    }
}
