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
import androidx.media3.exoplayer.RendererCapabilities;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "O", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "J2", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "F", "rl", "t", "nr", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,851:1\n1223#2,6:852\n1223#2,6:858\n1223#2,6:864\n1223#2,6:870\n1223#2,6:876\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n662#1:852,6\n672#1:858,6\n673#1:864,6\n725#1:870,6\n727#1:876,6\n*E\n"})
public final class CardElevation {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float disabledElevation;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float draggedElevation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    public /* synthetic */ CardElevation(float f3, float f4, float f5, float f6, float f7, float f8, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, f7, f8);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) other;
        return Dp.mUb(this.defaultElevation, cardElevation.defaultElevation) && Dp.mUb(this.pressedElevation, cardElevation.pressedElevation) && Dp.mUb(this.focusedElevation, cardElevation.focusedElevation) && Dp.mUb(this.hoveredElevation, cardElevation.hoveredElevation) && Dp.mUb(this.disabledElevation, cardElevation.disabledElevation);
    }

    private CardElevation(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.defaultElevation = f3;
        this.pressedElevation = f4;
        this.focusedElevation = f5;
        this.hoveredElevation = f6;
        this.draggedElevation = f7;
        this.disabledElevation = f8;
    }

    private final State O(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        Animatable animatable;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1421890746, i2, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
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
            objIF2 = new CardElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.o(objIF2);
        }
        EffectsKt.O(interactionSource, (Function2) objIF2, composer, (i2 >> 3) & 14);
        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
        float f3 = !z2 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.defaultElevation;
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
            Object cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(animatable, f3, z2, this, interaction, null);
            composer.o(cardElevation$animateElevation$2$1);
            objIF4 = cardElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.O(dpNr, (Function2) objIF4, composer, 0);
        State stateUo = animatable.Uo();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateUo;
    }

    public int hashCode() {
        return (((((((Dp.gh(this.defaultElevation) * 31) + Dp.gh(this.pressedElevation)) * 31) + Dp.gh(this.focusedElevation)) * 31) + Dp.gh(this.hoveredElevation)) * 31) + Dp.gh(this.disabledElevation);
    }

    public final State J2(boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
        composer.eF(-1763481333);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1763481333, i2, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        composer.eF(-734838460);
        if (interactionSource == null) {
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Dp.nr(this.defaultElevation), null, 2, null);
                composer.o(objIF);
            }
            MutableState mutableState = (MutableState) objIF;
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composer.Xw();
            return mutableState;
        }
        composer.Xw();
        State stateO = O(z2, interactionSource, composer, i2 & 1022);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return stateO;
    }
}
