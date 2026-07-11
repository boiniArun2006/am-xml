package androidx.compose.animation.core;

import GJW.Pl;
import GJW.vd;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", i = {0}, l = {2147}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2141:1\n120#2,10:2142\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n810#1:2142,10\n*E\n"})
final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransitionState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f15716O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15717n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f15718t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionKt$rememberTransition$1$1(TransitionState transitionState, Continuation continuation) {
        super(2, continuation);
        this.J2 = transitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransitionKt$rememberTransition$1$1(this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((TransitionKt$rememberTransition$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yB.j compositionContinuationMutex;
        TransitionState transitionState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15716O;
        if (i2 != 0) {
            if (i2 == 1) {
                transitionState = (TransitionState) this.f15718t;
                compositionContinuationMutex = (yB.j) this.f15717n;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ((SeekableTransitionState) this.J2).wTp();
            compositionContinuationMutex = ((SeekableTransitionState) this.J2).getCompositionContinuationMutex();
            TransitionState transitionState2 = this.J2;
            this.f15717n = compositionContinuationMutex;
            this.f15718t = transitionState2;
            this.f15716O = 1;
            if (compositionContinuationMutex.Z(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            transitionState = transitionState2;
        }
        try {
            ((SeekableTransitionState) transitionState).P5(transitionState.rl());
            Pl compositionContinuation = ((SeekableTransitionState) transitionState).getCompositionContinuation();
            if (compositionContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                compositionContinuation.resumeWith(Result.m313constructorimpl(transitionState.rl()));
            }
            ((SeekableTransitionState) transitionState).M7(null);
            Unit unit = Unit.INSTANCE;
            compositionContinuationMutex.T(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            compositionContinuationMutex.T(null);
            throw th;
        }
    }
}
