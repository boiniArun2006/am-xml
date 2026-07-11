package androidx.compose.animation.core;

import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.MutatorMutex;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {176, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,170:1\n120#2,10:171\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutate$2\n*L\n122#1:171,10\n*E\n"})
final class MutatorMutex$mutate$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f15549O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function1 f15550S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f15551Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15552n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutatePriority f15553o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private /* synthetic */ Object f15554r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f15555t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f15553o = mutatePriority;
        this.f15551Z = mutatorMutex;
        this.f15550S = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f15553o, this.f15551Z, this.f15550S, continuation);
        mutatorMutex$mutate$2.f15554r = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MutatorMutex$mutate$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yB.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yB.j jVar;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        Function1 function1;
        Throwable th;
        MutatorMutex mutatorMutex2;
        MutatorMutex.Mutator mutator2;
        yB.j jVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.J2;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            mutatorMutex2 = (MutatorMutex) this.f15555t;
                            jVar2 = (yB.j) this.f15552n;
                            mutator2 = (MutatorMutex.Mutator) this.f15554r;
                            try {
                                ResultKt.throwOnFailure(obj);
                                fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                                jVar2.T(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex = (MutatorMutex) this.f15549O;
                    function1 = (Function1) this.f15555t;
                    yB.j jVar3 = (yB.j) this.f15552n;
                    mutator = (MutatorMutex.Mutator) this.f15554r;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f15554r;
                    MutatePriority mutatePriority = this.f15553o;
                    CoroutineContext.Element element = vdVar.getCoroutineContext().get(xuv.nr);
                    Intrinsics.checkNotNull(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (xuv) element);
                    this.f15551Z.J2(mutator3);
                    jVar = this.f15551Z.mutex;
                    Function1 function12 = this.f15550S;
                    MutatorMutex mutatorMutex3 = this.f15551Z;
                    this.f15554r = mutator3;
                    this.f15552n = jVar;
                    this.f15555t = function12;
                    this.f15549O = mutatorMutex3;
                    this.J2 = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                        function1 = function12;
                    }
                    return coroutine_suspended;
                }
                this.f15554r = mutator;
                this.f15552n = jVar;
                this.f15555t = mutatorMutex;
                this.f15549O = null;
                this.J2 = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    mutatorMutex2 = mutatorMutex;
                    jVar2 = jVar;
                    obj = objInvoke;
                    mutator2 = mutator;
                    fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                    jVar2.T(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                mutatorMutex2 = mutatorMutex;
                mutator2 = mutator;
                fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.T(null);
            throw th4;
        }
    }
}
