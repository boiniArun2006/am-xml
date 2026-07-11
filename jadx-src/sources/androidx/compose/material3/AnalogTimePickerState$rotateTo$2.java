package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AnalogTimePickerState$rotateTo$2", f = "TimePicker.kt", i = {}, l = {803, 806}, m = "invokeSuspend", n = {}, s = {})
final class AnalogTimePickerState$rotateTo$2 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f24162O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f24163n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ AnalogTimePickerState f24164t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnalogTimePickerState$rotateTo$2(AnalogTimePickerState analogTimePickerState, float f3, boolean z2, Continuation continuation) {
        super(1, continuation);
        this.f24164t = analogTimePickerState;
        this.f24162O = f3;
        this.J2 = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AnalogTimePickerState$rotateTo$2(this.f24164t, this.f24162O, this.J2, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((AnalogTimePickerState$rotateTo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        if (r12.XQ(r1, r11) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f24163n;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (TimePickerSelectionMode.J2(this.f24164t.J2(), TimePickerSelectionMode.INSTANCE.n())) {
                int i3 = 12;
                this.f24164t.hourAngle = (r12.fD(this.f24162O) % 12) * 0.5235988f;
                TimePickerState state = this.f24164t.getState();
                AnalogTimePickerState analogTimePickerState = this.f24164t;
                int iFD = analogTimePickerState.fD(analogTimePickerState.hourAngle) % 12;
                if (!this.f24164t.mUb()) {
                    i3 = 0;
                }
                state.Uo(iFD + i3);
            } else {
                this.f24164t.minuteAngle = r12.E2(this.f24162O) * 0.10471976f;
                TimePickerState state2 = this.f24164t.getState();
                AnalogTimePickerState analogTimePickerState2 = this.f24164t;
                state2.KN(analogTimePickerState2.E2(analogTimePickerState2.minuteAngle));
            }
            if (!this.J2) {
                Animatable animatable = this.f24164t.anim;
                Float fBoxFloat = Boxing.boxFloat(this.f24164t.nY(this.f24162O));
                this.f24163n = 1;
            } else {
                AnalogTimePickerState analogTimePickerState3 = this.f24164t;
                float fZ = analogTimePickerState3.Z(analogTimePickerState3.nY(this.f24162O));
                Animatable animatable2 = this.f24164t.anim;
                Float fBoxFloat2 = Boxing.boxFloat(fZ);
                SpringSpec springSpecQie = AnimationSpecKt.qie(1.0f, 700.0f, null, 4, null);
                this.f24163n = 2;
                Object objJ2 = Animatable.J2(animatable2, fBoxFloat2, springSpecQie, null, null, this, 12, null);
                if (objJ2 != coroutine_suspended) {
                    return objJ2;
                }
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
