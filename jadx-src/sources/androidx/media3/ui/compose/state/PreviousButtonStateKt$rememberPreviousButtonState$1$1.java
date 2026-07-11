package androidx.media3.ui.compose.state;

import GJW.vd;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.media3.ui.compose.state.PreviousButtonStateKt$rememberPreviousButtonState$1$1", f = "PreviousButtonState.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
final class PreviousButtonStateKt$rememberPreviousButtonState$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ PreviousButtonState $previousButtonState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviousButtonStateKt$rememberPreviousButtonState$1$1(PreviousButtonState previousButtonState, Continuation<? super PreviousButtonStateKt$rememberPreviousButtonState$1$1> continuation) {
        super(2, continuation);
        this.$previousButtonState = previousButtonState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviousButtonStateKt$rememberPreviousButtonState$1$1(this.$previousButtonState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return ((PreviousButtonStateKt$rememberPreviousButtonState$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            PreviousButtonState previousButtonState = this.$previousButtonState;
            this.label = 1;
            if (previousButtonState.observe(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
