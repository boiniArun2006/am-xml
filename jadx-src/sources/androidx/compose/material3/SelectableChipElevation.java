package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b$\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'²\u0006\u0010\u0010&\u001a\u0004\u0018\u00010%8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/SelectableChipElevation;", "", "Landroidx/compose/ui/unit/Dp;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "t", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "J2", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "F", "getElevation-D9Ej5fM", "()F", "rl", "getPressedElevation-D9Ej5fM", "getFocusedElevation-D9Ej5fM", "nr", "getHoveredElevation-D9Ej5fM", "O", "getDraggedElevation-D9Ej5fM", "getDisabledElevation-D9Ej5fM", "Landroidx/compose/foundation/interaction/Interaction;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2787:1\n1223#2,6:2788\n1223#2,6:2794\n1223#2,6:2800\n1223#2,6:2806\n1223#2,6:2812\n81#3:2818\n107#3,2:2819\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n*L\n2320#1:2788,6\n2321#1:2794,6\n2322#1:2800,6\n2374#1:2806,6\n2376#1:2812,6\n2321#1:2818\n2321#1:2819,2\n*E\n"})
public final class SelectableChipElevation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float disabledElevation;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float draggedElevation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    public /* synthetic */ SelectableChipElevation(float f3, float f4, float f5, float f6, float f7, float f8, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, f7, f8);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) other;
        return Dp.mUb(this.elevation, selectableChipElevation.elevation) && Dp.mUb(this.pressedElevation, selectableChipElevation.pressedElevation) && Dp.mUb(this.focusedElevation, selectableChipElevation.focusedElevation) && Dp.mUb(this.hoveredElevation, selectableChipElevation.hoveredElevation) && Dp.mUb(this.disabledElevation, selectableChipElevation.disabledElevation);
    }

    private SelectableChipElevation(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.elevation = f3;
        this.pressedElevation = f4;
        this.focusedElevation = f5;
        this.hoveredElevation = f6;
        this.draggedElevation = f7;
        this.disabledElevation = f8;
    }

    private final State t(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        Animatable animatable;
        if (ComposerKt.v()) {
            ComposerKt.p5(664514136, i2, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2318)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt.J2();
            composer.o(objIF);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objIF;
        Object objIF2 = composer.iF();
        if (objIF2 == companion.n()) {
            objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
            composer.o(objIF2);
        }
        MutableState mutableState = (MutableState) objIF2;
        boolean z3 = true;
        boolean z4 = (((i2 & 112) ^ 48) > 32 && composer.p5(interactionSource)) || (i2 & 48) == 32;
        Object objIF3 = composer.iF();
        if (z4 || objIF3 == companion.n()) {
            objIF3 = new SelectableChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.o(objIF3);
        }
        EffectsKt.O(interactionSource, (Function2) objIF3, composer, (i2 >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f3 = !z2 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.elevation;
        Object objIF4 = composer.iF();
        if (objIF4 == companion.n()) {
            Object animatable2 = new Animatable(Dp.nr(f3), VectorConvertersKt.O(Dp.INSTANCE), null, null, 12, null);
            composer.o(animatable2);
            objIF4 = animatable2;
        }
        Animatable animatable3 = (Animatable) objIF4;
        Dp dpNr = Dp.nr(f3);
        boolean zE2 = composer.E2(animatable3) | composer.rl(f3);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.n(z2)) && (i2 & 6) != 4) {
            z3 = false;
        }
        boolean zE22 = zE2 | z3 | composer.E2(interaction);
        Object objIF5 = composer.iF();
        if (zE22 || objIF5 == companion.n()) {
            animatable = animatable3;
            Object selectableChipElevation$animateElevation$2$1 = new SelectableChipElevation$animateElevation$2$1(animatable, f3, z2, interaction, mutableState, null);
            composer.o(selectableChipElevation$animateElevation$2$1);
            objIF5 = selectableChipElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.O(dpNr, (Function2) objIF5, composer, 0);
        State stateUo = animatable.Uo();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateUo;
    }

    public int hashCode() {
        return (((((((Dp.gh(this.elevation) * 31) + Dp.gh(this.pressedElevation)) * 31) + Dp.gh(this.focusedElevation)) * 31) + Dp.gh(this.hoveredElevation)) * 31) + Dp.gh(this.disabledElevation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableState mutableState, Interaction interaction) {
        mutableState.setValue(interaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction nr(MutableState mutableState) {
        return (Interaction) mutableState.getValue();
    }

    public final State J2(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1888175651, i2, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2310)");
        }
        State stateT = t(z2, interactionSource, composer, i2 & 1022);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateT;
    }
}
