package androidx.compose.material3;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {989, 998}, m = "invokeSuspend", n = {}, s = {})
final class ButtonElevation$animateElevation$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f24597O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f24598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Interaction f24599o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ ButtonElevation f24600r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Animatable f24601t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonElevation$animateElevation$2$1(Animatable animatable, float f3, boolean z2, ButtonElevation buttonElevation, Interaction interaction, Continuation continuation) {
        super(2, continuation);
        this.f24601t = animatable;
        this.f24597O = f3;
        this.J2 = z2;
        this.f24600r = buttonElevation;
        this.f24599o = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonElevation$animateElevation$2$1(this.f24601t, this.f24597O, this.J2, this.f24600r, this.f24599o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((ButtonElevation$animateElevation$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r7.XQ(r1, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.nr(r7, r1, r3, r4, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f24598n;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (!Dp.mUb(((Dp) this.f24601t.qie()).getValue(), this.f24597O)) {
                if (!this.J2) {
                    Animatable animatable = this.f24601t;
                    Dp dpNr = Dp.nr(this.f24597O);
                    this.f24598n = 1;
                } else {
                    float value = ((Dp) this.f24601t.qie()).getValue();
                    Interaction focus = null;
                    if (Dp.mUb(value, this.f24600r.pressedElevation)) {
                        focus = new PressInteraction.Press(Offset.INSTANCE.t(), null);
                    } else if (Dp.mUb(value, this.f24600r.hoveredElevation)) {
                        focus = new HoverInteraction.Enter();
                    } else if (Dp.mUb(value, this.f24600r.focusedElevation)) {
                        focus = new FocusInteraction.Focus();
                    }
                    Animatable animatable2 = this.f24601t;
                    float f3 = this.f24597O;
                    Interaction interaction = this.f24599o;
                    this.f24598n = 2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
