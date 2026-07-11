package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "selected", "Landroidx/compose/runtime/State;", c.f62177j, "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSelectedColor-0d7_KjU", "()J", "rl", "getUnselectedColor-0d7_KjU", "t", "getDisabledSelectedColor-0d7_KjU", "nr", "getDisabledUnselectedColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,273:1\n708#2:274\n696#2:275\n708#2:276\n696#2:277\n708#2:278\n696#2:279\n708#2:280\n696#2:281\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material3/RadioButtonColors\n*L\n215#1:274\n215#1:275\n216#1:276\n216#1:277\n217#1:278\n217#1:279\n218#1:280\n218#1:281\n*E\n"})
public final class RadioButtonColors {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long selectedColor;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final long disabledUnselectedColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long unselectedColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedColor;

    public /* synthetic */ RadioButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) other;
        return Color.HI(this.selectedColor, radioButtonColors.selectedColor) && Color.HI(this.unselectedColor, radioButtonColors.unselectedColor) && Color.HI(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.HI(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    private RadioButtonColors(long j2, long j3, long j4, long j5) {
        this.selectedColor = j2;
        this.unselectedColor = j3;
        this.disabledSelectedColor = j4;
        this.disabledUnselectedColor = j5;
    }

    public int hashCode() {
        return (((((Color.XQ(this.selectedColor) * 31) + Color.XQ(this.unselectedColor)) * 31) + Color.XQ(this.disabledSelectedColor)) * 31) + Color.XQ(this.disabledUnselectedColor);
    }

    public final State n(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        State stateCk;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1840145292, i2, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
        }
        if (z2 && z3) {
            j2 = this.selectedColor;
        } else if (z2 && !z3) {
            j2 = this.unselectedColor;
        } else if (!z2 && z3) {
            j2 = this.disabledSelectedColor;
        } else {
            j2 = this.disabledUnselectedColor;
        }
        long j3 = j2;
        if (z2) {
            composer.eF(350067971);
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.Xw();
        } else {
            composer.eF(350170674);
            stateCk = SnapshotStateKt.ck(Color.xMQ(j3), composer, 0);
            composer.Xw();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateCk;
    }
}
