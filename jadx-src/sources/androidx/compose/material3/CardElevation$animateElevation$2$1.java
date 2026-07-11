package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", i = {}, l = {731, 741}, m = "invokeSuspend", n = {}, s = {})
final class CardElevation$animateElevation$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f24669O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f24670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Interaction f24671o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ CardElevation f24672r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Animatable f24673t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$2$1(Animatable animatable, float f3, boolean z2, CardElevation cardElevation, Interaction interaction, Continuation continuation) {
        super(2, continuation);
        this.f24673t = animatable;
        this.f24669O = f3;
        this.J2 = z2;
        this.f24672r = cardElevation;
        this.f24671o = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardElevation$animateElevation$2$1(this.f24673t, this.f24669O, this.J2, this.f24672r, this.f24671o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((CardElevation$animateElevation$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r7.XQ(r1, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.nr(r7, r1, r3, r4, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f24670n;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (!Dp.mUb(((Dp) this.f24673t.qie()).getValue(), this.f24669O)) {
                if (!this.J2) {
                    Animatable animatable = this.f24673t;
                    Dp dpNr = Dp.nr(this.f24669O);
                    this.f24670n = 1;
                } else {
                    float value = ((Dp) this.f24673t.qie()).getValue();
                    Interaction start = null;
                    if (Dp.mUb(value, this.f24672r.pressedElevation)) {
                        start = new PressInteraction.Press(Offset.INSTANCE.t(), null);
                    } else if (Dp.mUb(value, this.f24672r.hoveredElevation)) {
                        start = new HoverInteraction.Enter();
                    } else if (Dp.mUb(value, this.f24672r.focusedElevation)) {
                        start = new FocusInteraction.Focus();
                    } else if (Dp.mUb(value, this.f24672r.draggedElevation)) {
                        start = new DragInteraction.Start();
                    }
                    Animatable animatable2 = this.f24673t;
                    float f3 = this.f24669O;
                    Interaction interaction = this.f24671o;
                    this.f24670n = 2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
