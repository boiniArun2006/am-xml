package androidx.compose.foundation;

import GJW.vd;
import GJW.xuv;
import androidx.compose.foundation.MutatorMutex;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 165}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,204:1\n120#2,10:205\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n163#1:205,10\n*E\n"})
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    final /* synthetic */ Object E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16239O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f16240S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutatePriority f16241Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2 f16242g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16243n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private /* synthetic */ Object f16244o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16245r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16246t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f16241Z = mutatePriority;
        this.f16240S = mutatorMutex;
        this.f16242g = function2;
        this.E2 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f16241Z, this.f16240S, this.f16242g, this.E2, continuation);
        mutatorMutex$mutateWith$2.f16244o = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MutatorMutex$mutateWith$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yB.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yB.j jVar;
        Function2 function2;
        MutatorMutex.Mutator mutator;
        MutatorMutex mutatorMutex;
        Object obj2;
        Throwable th;
        MutatorMutex mutatorMutex2;
        MutatorMutex.Mutator mutator2;
        yB.j jVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f16245r;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            mutatorMutex2 = (MutatorMutex) this.f16246t;
                            jVar2 = (yB.j) this.f16243n;
                            mutator2 = (MutatorMutex.Mutator) this.f16244o;
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
                    mutatorMutex = (MutatorMutex) this.J2;
                    obj2 = this.f16239O;
                    function2 = (Function2) this.f16246t;
                    yB.j jVar3 = (yB.j) this.f16243n;
                    mutator = (MutatorMutex.Mutator) this.f16244o;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f16244o;
                    MutatePriority mutatePriority = this.f16241Z;
                    CoroutineContext.Element element = vdVar.getCoroutineContext().get(xuv.nr);
                    Intrinsics.checkNotNull(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (xuv) element);
                    this.f16240S.Uo(mutator3);
                    jVar = this.f16240S.mutex;
                    function2 = this.f16242g;
                    Object obj3 = this.E2;
                    MutatorMutex mutatorMutex3 = this.f16240S;
                    this.f16244o = mutator3;
                    this.f16243n = jVar;
                    this.f16246t = function2;
                    this.f16239O = obj3;
                    this.J2 = mutatorMutex3;
                    this.f16245r = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                        obj2 = obj3;
                    }
                    return coroutine_suspended;
                }
                this.f16244o = mutator;
                this.f16243n = jVar;
                this.f16246t = mutatorMutex;
                this.f16239O = null;
                this.J2 = null;
                this.f16245r = 2;
                Object objInvoke = function2.invoke(obj2, this);
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
