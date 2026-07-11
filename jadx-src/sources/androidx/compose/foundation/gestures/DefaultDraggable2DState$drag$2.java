package androidx.compose.foundation.gestures;

import GJW.vd;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
final class DefaultDraggable2DState$drag$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MutatePriority f16609O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16610n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ DefaultDraggable2DState f16611t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDraggable2DState$drag$2(DefaultDraggable2DState defaultDraggable2DState, MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f16611t = defaultDraggable2DState;
        this.f16609O = mutatePriority;
        this.J2 = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultDraggable2DState$drag$2(this.f16611t, this.f16609O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((DefaultDraggable2DState$drag$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16610n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutatorMutex mutatorMutex = this.f16611t.drag2DMutex;
            Drag2DScope drag2DScope = this.f16611t.drag2DScope;
            MutatePriority mutatePriority = this.f16609O;
            Function2 function2 = this.J2;
            this.f16610n = 1;
            if (mutatorMutex.J2(drag2DScope, mutatePriority, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
