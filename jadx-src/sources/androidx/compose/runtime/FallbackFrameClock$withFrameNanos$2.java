package androidx.compose.runtime;

import GJW.vd;
import GJW.yg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2", f = "MonotonicFrameClock.android.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
final class FallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f30171n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Function1 f30172t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FallbackFrameClock$withFrameNanos$2(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f30172t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FallbackFrameClock$withFrameNanos$2(this.f30172t, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((FallbackFrameClock$withFrameNanos$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f30171n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f30171n = 1;
            if (yg.rl(16L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return this.f30172t.invoke(Boxing.boxLong(System.nanoTime()));
    }
}
