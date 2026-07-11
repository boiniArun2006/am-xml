package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", i = {}, l = {457}, m = "invokeSuspend", n = {}, s = {})
final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Transition J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Object f15607O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15608n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SeekableTransitionState f15609t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$snapTo$2(SeekableTransitionState seekableTransitionState, Object obj, Transition transition, Continuation continuation) {
        super(1, continuation);
        this.f15609t = seekableTransitionState;
        this.f15607O = obj;
        this.J2 = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SeekableTransitionState$snapTo$2(this.f15609t, this.f15607O, this.J2, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((SeekableTransitionState$snapTo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15608n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f15609t.E2();
            this.f15609t.lastFrameTimeNanos = Long.MIN_VALUE;
            this.f15609t.p5(0.0f);
            Object obj2 = this.f15607O;
            if (Intrinsics.areEqual(obj2, this.f15609t.n())) {
                f3 = -4.0f;
            } else if (Intrinsics.areEqual(obj2, this.f15609t.rl())) {
                f3 = -5.0f;
            } else {
                f3 = -3.0f;
            }
            this.J2.P5(this.f15607O);
            this.J2.s7N(0L);
            this.f15609t.eF(this.f15607O);
            this.f15609t.p5(0.0f);
            this.f15609t.nr(this.f15607O);
            this.J2.X(f3);
            if (f3 == -3.0f) {
                SeekableTransitionState seekableTransitionState = this.f15609t;
                this.f15608n = 1;
                if (seekableTransitionState.B(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        this.J2.te();
        return Unit.INSTANCE;
    }
}
