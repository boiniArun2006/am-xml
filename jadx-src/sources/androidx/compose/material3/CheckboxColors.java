package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "Landroidx/compose/ui/graphics/Color;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "t", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "enabled", "rl", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", c.f62177j, InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getCheckedCheckmarkColor-0d7_KjU", "()J", "getUncheckedCheckmarkColor-0d7_KjU", "getCheckedBoxColor-0d7_KjU", "nr", "getUncheckedBoxColor-0d7_KjU", "O", "getDisabledCheckedBoxColor-0d7_KjU", "J2", "getDisabledUncheckedBoxColor-0d7_KjU", "Uo", "getDisabledIndeterminateBoxColor-0d7_KjU", "KN", "getCheckedBorderColor-0d7_KjU", "xMQ", "getUncheckedBorderColor-0d7_KjU", "mUb", "getDisabledBorderColor-0d7_KjU", "gh", "getDisabledUncheckedBorderColor-0d7_KjU", "qie", "getDisabledIndeterminateBorderColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,607:1\n708#2:608\n696#2:609\n708#2:610\n696#2:611\n708#2:612\n696#2:613\n708#2:614\n696#2:615\n708#2:616\n696#2:617\n708#2:618\n696#2:619\n708#2:620\n696#2:621\n708#2:622\n696#2:623\n708#2:624\n696#2:625\n708#2:626\n696#2:627\n708#2:628\n696#2:629\n708#2:630\n696#2:631\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxColors\n*L\n462#1:608\n462#1:609\n463#1:610\n463#1:611\n464#1:612\n464#1:613\n465#1:614\n465#1:615\n466#1:616\n466#1:617\n467#1:618\n467#1:619\n468#1:620\n468#1:621\n469#1:622\n469#1:623\n470#1:624\n470#1:625\n471#1:626\n471#1:627\n472#1:628\n472#1:629\n473#1:630\n473#1:631\n*E\n"})
public final class CheckboxColors {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final long disabledUncheckedBorderColor;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long uncheckedBoxColor;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long checkedBoxColor;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final long uncheckedBorderColor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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

    public /* synthetic */ CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j9, j10, j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) other;
        return Color.HI(this.checkedCheckmarkColor, checkboxColors.checkedCheckmarkColor) && Color.HI(this.uncheckedCheckmarkColor, checkboxColors.uncheckedCheckmarkColor) && Color.HI(this.checkedBoxColor, checkboxColors.checkedBoxColor) && Color.HI(this.uncheckedBoxColor, checkboxColors.uncheckedBoxColor) && Color.HI(this.disabledCheckedBoxColor, checkboxColors.disabledCheckedBoxColor) && Color.HI(this.disabledUncheckedBoxColor, checkboxColors.disabledUncheckedBoxColor) && Color.HI(this.disabledIndeterminateBoxColor, checkboxColors.disabledIndeterminateBoxColor) && Color.HI(this.checkedBorderColor, checkboxColors.checkedBorderColor) && Color.HI(this.uncheckedBorderColor, checkboxColors.uncheckedBorderColor) && Color.HI(this.disabledBorderColor, checkboxColors.disabledBorderColor) && Color.HI(this.disabledUncheckedBorderColor, checkboxColors.disabledUncheckedBorderColor) && Color.HI(this.disabledIndeterminateBorderColor, checkboxColors.disabledIndeterminateBorderColor);
    }

    private CheckboxColors(long j2, long j3, long j4, long j5, long j6, long j7, long j9, long j10, long j11, long j12, long j13, long j14) {
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
        this.disabledUncheckedBorderColor = j13;
        this.disabledIndeterminateBorderColor = j14;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.XQ(this.checkedCheckmarkColor) * 31) + Color.XQ(this.uncheckedCheckmarkColor)) * 31) + Color.XQ(this.checkedBoxColor)) * 31) + Color.XQ(this.uncheckedBoxColor)) * 31) + Color.XQ(this.disabledCheckedBoxColor)) * 31) + Color.XQ(this.disabledUncheckedBoxColor)) * 31) + Color.XQ(this.disabledIndeterminateBoxColor)) * 31) + Color.XQ(this.checkedBorderColor)) * 31) + Color.XQ(this.uncheckedBorderColor)) * 31) + Color.XQ(this.disabledBorderColor)) * 31) + Color.XQ(this.disabledUncheckedBorderColor)) * 31) + Color.XQ(this.disabledIndeterminateBorderColor);
    }

    public final State n(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State stateCk;
        int i3;
        if (ComposerKt.v()) {
            ComposerKt.p5(1009643462, i2, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:534)");
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
                    if (i7 == 3) {
                        j2 = this.disabledUncheckedBorderColor;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j2 = this.disabledIndeterminateBorderColor;
                }
            } else {
                j2 = this.disabledBorderColor;
            }
        }
        long j3 = j2;
        if (z2) {
            composer.eF(-1725816497);
            if (toggleableState == ToggleableState.f33333t) {
                i3 = 100;
            } else {
                i3 = 50;
            }
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(i3, 0, null, 6, null), null, null, composer, 0, 12);
            composer.Xw();
        } else {
            composer.eF(-1725635953);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j3), composer, 0);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }

    public final State rl(boolean z2, ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        State stateCk;
        int i3;
        if (ComposerKt.v()) {
            ComposerKt.p5(360729865, i2, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:501)");
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
            composer.eF(-392211906);
            if (toggleableState == ToggleableState.f33333t) {
                i3 = 100;
            } else {
                i3 = 50;
            }
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(i3, 0, null, 6, null), null, null, composer, 0, 12);
            composer.Xw();
        } else {
            composer.eF(-392031362);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j3), composer, 0);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }

    public final State t(ToggleableState toggleableState, Composer composer, int i2) {
        long j2;
        int i3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-507585681, i2, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:481)");
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
        return stateN;
    }
}
