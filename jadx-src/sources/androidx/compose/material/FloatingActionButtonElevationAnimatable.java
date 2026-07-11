package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/material/FloatingActionButtonElevationAnimatable;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/Interaction;", "nr", "(Landroidx/compose/foundation/interaction/Interaction;)F", "", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J2", "(FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "to", "rl", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "t", "()Landroidx/compose/runtime/State;", c.f62177j, "F", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "animatable", "Landroidx/compose/foundation/interaction/Interaction;", "lastTargetInteraction", "Uo", "targetInteraction", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FloatingActionButtonElevationAnimatable {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Interaction lastTargetInteraction;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Animatable animatable;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Interaction targetInteraction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float defaultElevation;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private float focusedElevation;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private float pressedElevation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float hoveredElevation;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6);
    }

    private FloatingActionButtonElevationAnimatable(float f3, float f4, float f5, float f6) {
        this.defaultElevation = f3;
        this.pressedElevation = f4;
        this.hoveredElevation = f5;
        this.focusedElevation = f6;
        this.animatable = new Animatable(Dp.nr(this.defaultElevation), VectorConvertersKt.O(Dp.INSTANCE), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(Continuation continuation) throws Throwable {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuation instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
            floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuation;
            int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$snapElevation$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuation);
            }
        }
        Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.f22064t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = floatingActionButtonElevationAnimatable$snapElevation$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            float fNr = nr(this.targetInteraction);
            if (!Dp.mUb(((Dp) this.animatable.qie()).getValue(), fNr)) {
                try {
                    Animatable animatable = this.animatable;
                    Dp dpNr = Dp.nr(fNr);
                    floatingActionButtonElevationAnimatable$snapElevation$1.f22063n = this;
                    floatingActionButtonElevationAnimatable$snapElevation$1.J2 = 1;
                    if (animatable.XQ(dpNr, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                } catch (Throwable th) {
                    th = th;
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                    throw th;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException(obbPUqyhtS.UuzDwFwebhJsL);
            }
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) floatingActionButtonElevationAnimatable$snapElevation$1.f22063n;
            try {
                ResultKt.throwOnFailure(obj);
                floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
            } catch (Throwable th2) {
                th = th2;
                floatingActionButtonElevationAnimatable.lastTargetInteraction = floatingActionButtonElevationAnimatable.targetInteraction;
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    private final float nr(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    public final Object J2(float f3, float f4, float f5, float f6, Continuation continuation) throws Throwable {
        this.defaultElevation = f3;
        this.pressedElevation = f4;
        this.hoveredElevation = f5;
        this.focusedElevation = f6;
        Object objO = O(continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Interaction interaction, Continuation continuation) throws Throwable {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuation instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
            floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuation;
            int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.f22060r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$animateElevation$1.f22060r = i2 - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuation);
            }
        }
        Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.f22058O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = floatingActionButtonElevationAnimatable$animateElevation$1.f22060r;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interaction = (Interaction) floatingActionButtonElevationAnimatable$animateElevation$1.f22061t;
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) floatingActionButtonElevationAnimatable$animateElevation$1.f22059n;
            try {
                ResultKt.throwOnFailure(obj);
                floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        float fNr = nr(interaction);
        this.targetInteraction = interaction;
        try {
            if (!Dp.mUb(((Dp) this.animatable.qie()).getValue(), fNr)) {
                Animatable animatable = this.animatable;
                Interaction interaction2 = this.lastTargetInteraction;
                floatingActionButtonElevationAnimatable$animateElevation$1.f22059n = this;
                floatingActionButtonElevationAnimatable$animateElevation$1.f22061t = interaction;
                floatingActionButtonElevationAnimatable$animateElevation$1.f22060r = 1;
                if (ElevationKt.nr(animatable, fNr, interaction2, interaction, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.lastTargetInteraction = interaction;
            throw th;
        }
    }

    public final State t() {
        return this.animatable.Uo();
    }
}
