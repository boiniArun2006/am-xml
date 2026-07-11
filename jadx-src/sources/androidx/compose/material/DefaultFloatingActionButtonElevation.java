package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/DefaultFloatingActionButtonElevation;", "Landroidx/compose/material/FloatingActionButtonElevation;", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", c.f62177j, "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "rl", "t", "nr", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n1247#2,6:399\n1247#2,6:405\n1247#2,6:411\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n*L\n262#1:399,6\n271#1:405,6\n280#1:411,6\n*E\n"})
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6);
    }

    private DefaultFloatingActionButtonElevation(float f3, float f4, float f5, float f6) {
        this.defaultElevation = f3;
        this.pressedElevation = f4;
        this.hoveredElevation = f5;
        this.focusedElevation = f6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) other;
        if (Dp.mUb(this.defaultElevation, defaultFloatingActionButtonElevation.defaultElevation) && Dp.mUb(this.pressedElevation, defaultFloatingActionButtonElevation.pressedElevation) && Dp.mUb(this.hoveredElevation, defaultFloatingActionButtonElevation.hoveredElevation)) {
            return Dp.mUb(this.focusedElevation, defaultFloatingActionButtonElevation.focusedElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((Dp.gh(this.defaultElevation) * 31) + Dp.gh(this.pressedElevation)) * 31) + Dp.gh(this.hoveredElevation)) * 31) + Dp.gh(this.focusedElevation);
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    public State n(InteractionSource interactionSource, Composer composer, int i2) {
        composer.eF(-478475335);
        if (ComposerKt.v()) {
            ComposerKt.p5(-478475335, i2, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i3 = i2 & 14;
        int i5 = i3 ^ 6;
        boolean z2 = (i5 > 4 && composer.p5(interactionSource)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            Object floatingActionButtonElevationAnimatable = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.o(floatingActionButtonElevationAnimatable);
            objIF = floatingActionButtonElevationAnimatable;
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable2 = (FloatingActionButtonElevationAnimatable) objIF;
        boolean zE2 = composer.E2(floatingActionButtonElevationAnimatable2) | ((((i2 & 112) ^ 48) > 32 && composer.p5(this)) || (i2 & 48) == 32);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new DefaultFloatingActionButtonElevation$elevation$1$1(floatingActionButtonElevationAnimatable2, this, null);
            composer.o(objIF2);
        }
        EffectsKt.O(this, (Function2) objIF2, composer, (i2 >> 3) & 14);
        boolean zE22 = composer.E2(floatingActionButtonElevationAnimatable2) | ((i5 > 4 && composer.p5(interactionSource)) || (i2 & 6) == 4);
        Object objIF3 = composer.iF();
        if (zE22 || objIF3 == Composer.INSTANCE.n()) {
            objIF3 = new DefaultFloatingActionButtonElevation$elevation$2$1(interactionSource, floatingActionButtonElevationAnimatable2, null);
            composer.o(objIF3);
        }
        EffectsKt.O(interactionSource, (Function2) objIF3, composer, i3);
        State stateT = floatingActionButtonElevationAnimatable2.t();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateT;
    }
}
