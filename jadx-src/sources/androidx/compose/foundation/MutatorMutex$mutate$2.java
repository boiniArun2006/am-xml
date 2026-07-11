package androidx.compose.foundation;

import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.MutatorMutex;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,204:1\n120#2,10:205\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n123#1:205,10\n*E\n"})
final class MutatorMutex$mutate$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16232O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function1 f16233S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f16234Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutatePriority f16236o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private /* synthetic */ Object f16237r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16238t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f16236o = mutatePriority;
        this.f16234Z = mutatorMutex;
        this.f16233S = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f16236o, this.f16234Z, this.f16233S, continuation);
        mutatorMutex$mutate$2.f16237r = obj;
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
                            mutatorMutex2 = (MutatorMutex) this.f16238t;
                            jVar2 = (yB.j) this.f16235n;
                            mutator2 = (MutatorMutex.Mutator) this.f16237r;
                            try {
                                ResultKt.throwOnFailure(obj);
                                androidx.compose.animation.core.fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                                jVar2.T(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                androidx.compose.animation.core.fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex = (MutatorMutex) this.f16232O;
                    function1 = (Function1) this.f16238t;
                    yB.j jVar3 = (yB.j) this.f16235n;
                    mutator = (MutatorMutex.Mutator) this.f16237r;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f16237r;
                    MutatePriority mutatePriority = this.f16236o;
                    CoroutineContext.Element element = vdVar.getCoroutineContext().get(xuv.nr);
                    Intrinsics.checkNotNull(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (xuv) element);
                    this.f16234Z.Uo(mutator3);
                    jVar = this.f16234Z.mutex;
                    Function1 function12 = this.f16233S;
                    MutatorMutex mutatorMutex3 = this.f16234Z;
                    this.f16237r = mutator3;
                    this.f16235n = jVar;
                    this.f16238t = function12;
                    this.f16232O = mutatorMutex3;
                    this.J2 = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                        function1 = function12;
                    }
                    return coroutine_suspended;
                }
                this.f16237r = mutator;
                this.f16235n = jVar;
                this.f16238t = mutatorMutex;
                this.f16232O = null;
                this.J2 = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    mutatorMutex2 = mutatorMutex;
                    jVar2 = jVar;
                    obj = objInvoke;
                    mutator2 = mutator;
                    androidx.compose.animation.core.fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                    jVar2.T(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                mutatorMutex2 = mutatorMutex;
                mutator2 = mutator;
                androidx.compose.animation.core.fuX.n(mutatorMutex2.currentMutator, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.T(null);
            throw th4;
        }
    }
}
