package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", c.f62177j, "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "F", "rl", "t", "nr", "O", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,616:1\n1247#2,6:617\n1247#2,6:623\n1247#2,6:629\n1247#2,6:635\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n*L\n505#1:617,6\n506#1:623,6\n548#1:629,6\n550#1:635,6\n*E\n"})
final class DefaultButtonElevation implements ButtonElevation {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    public /* synthetic */ DefaultButtonElevation(float f3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, f7);
    }

    private DefaultButtonElevation(float f3, float f4, float f5, float f6, float f7) {
        this.defaultElevation = f3;
        this.pressedElevation = f4;
        this.disabledElevation = f5;
        this.hoveredElevation = f6;
        this.focusedElevation = f7;
    }

    @Override // androidx.compose.material.ButtonElevation
    public State n(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        Animatable animatable;
        composer.eF(-1588756907);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1588756907, i2, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:503)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt.J2();
            composer.o(objIF);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objIF;
        boolean z3 = true;
        boolean z4 = (((i2 & 112) ^ 48) > 32 && composer.p5(interactionSource)) || (i2 & 48) == 32;
        Object objIF2 = composer.iF();
        if (z4 || objIF2 == companion.n()) {
            objIF2 = new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.o(objIF2);
        }
        EffectsKt.O(interactionSource, (Function2) objIF2, composer, (i2 >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f3 = !z2 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
        Object objIF3 = composer.iF();
        if (objIF3 == companion.n()) {
            Object animatable2 = new Animatable(Dp.nr(f3), VectorConvertersKt.O(Dp.INSTANCE), null, null, 12, null);
            composer.o(animatable2);
            objIF3 = animatable2;
        }
        Animatable animatable3 = (Animatable) objIF3;
        Dp dpNr = Dp.nr(f3);
        boolean zE2 = composer.E2(animatable3) | composer.rl(f3) | ((((i2 & 14) ^ 6) > 4 && composer.n(z2)) || (i2 & 6) == 4);
        if ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256 || !composer.p5(this)) && (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
            z3 = false;
        }
        boolean zE22 = zE2 | z3 | composer.E2(interaction);
        Object objIF4 = composer.iF();
        if (zE22 || objIF4 == companion.n()) {
            animatable = animatable3;
            Object defaultButtonElevation$elevation$2$1 = new DefaultButtonElevation$elevation$2$1(animatable, f3, z2, this, interaction, null);
            composer.o(defaultButtonElevation$elevation$2$1);
            objIF4 = defaultButtonElevation$elevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.O(dpNr, (Function2) objIF4, composer, 0);
        State stateUo = animatable.Uo();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateUo;
    }
}
