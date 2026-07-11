package androidx.compose.material;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "selected", "Landroidx/compose/runtime/State;", c.f62177j, "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "rl", "t", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultRadioButtonColors implements RadioButtonColors {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long selectedColor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final long unselectedColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long disabledColor;

    public /* synthetic */ DefaultRadioButtonColors(long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultRadioButtonColors.class != other.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) other;
        return Color.HI(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.HI(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.HI(this.disabledColor, defaultRadioButtonColors.disabledColor);
    }

    private DefaultRadioButtonColors(long j2, long j3, long j4) {
        this.selectedColor = j2;
        this.unselectedColor = j3;
        this.disabledColor = j4;
    }

    public int hashCode() {
        return (((Color.XQ(this.selectedColor) * 31) + Color.XQ(this.unselectedColor)) * 31) + Color.XQ(this.disabledColor);
    }

    @Override // androidx.compose.material.RadioButtonColors
    public State n(boolean z2, boolean z3, Composer composer, int i2) {
        long j2;
        Composer composer2;
        State stateCk;
        composer.eF(1243421834);
        if (ComposerKt.v()) {
            ComposerKt.p5(1243421834, i2, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:177)");
        }
        if (!z2) {
            j2 = this.disabledColor;
        } else if (!z3) {
            j2 = this.unselectedColor;
        } else {
            j2 = this.selectedColor;
        }
        long j3 = j2;
        if (z2) {
            composer.eF(1872435883);
            composer2 = composer;
            stateCk = SingleValueAnimationKt.n(j3, AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.Xw();
        } else {
            composer2 = composer;
            composer2.eF(1872538586);
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
