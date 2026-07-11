package androidx.compose.material;

import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.fuX;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.InternalMutatorMutex;
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
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 103}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n120#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material/InternalMutatorMutex$mutate$2\n*L\n101#1:175,10\n*E\n"})
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f22123O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function1 f22124S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ InternalMutatorMutex f22125Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f22126n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutatePriority f22127o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private /* synthetic */ Object f22128r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f22129t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f22127o = mutatePriority;
        this.f22125Z = internalMutatorMutex;
        this.f22124S = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.f22127o, this.f22125Z, this.f22124S, continuation);
        internalMutatorMutex$mutate$2.f22128r = obj;
        return internalMutatorMutex$mutate$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((InternalMutatorMutex$mutate$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<Object> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, yB.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j jVar;
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        Function1 function1;
        Throwable th;
        InternalMutatorMutex internalMutatorMutex2;
        InternalMutatorMutex.Mutator mutator2;
        j jVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.J2;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            internalMutatorMutex2 = (InternalMutatorMutex) this.f22129t;
                            jVar2 = (j) this.f22126n;
                            mutator2 = (InternalMutatorMutex.Mutator) this.f22128r;
                            try {
                                ResultKt.throwOnFailure(obj);
                                fuX.n(internalMutatorMutex2.currentMutator, mutator2, null);
                                jVar2.T(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                fuX.n(internalMutatorMutex2.currentMutator, mutator2, null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex = (InternalMutatorMutex) this.f22123O;
                    function1 = (Function1) this.f22129t;
                    j jVar3 = (j) this.f22126n;
                    mutator = (InternalMutatorMutex.Mutator) this.f22128r;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f22128r;
                    MutatePriority mutatePriority = this.f22127o;
                    CoroutineContext.Element element = vdVar.getCoroutineContext().get(xuv.nr);
                    Intrinsics.checkNotNull(element);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (xuv) element);
                    this.f22125Z.J2(mutator3);
                    jVar = this.f22125Z.mutex;
                    Function1 function12 = this.f22124S;
                    InternalMutatorMutex internalMutatorMutex3 = this.f22125Z;
                    this.f22128r = mutator3;
                    this.f22126n = jVar;
                    this.f22129t = function12;
                    this.f22123O = internalMutatorMutex3;
                    this.J2 = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                        mutator = mutator3;
                        internalMutatorMutex = internalMutatorMutex3;
                        function1 = function12;
                    }
                    return coroutine_suspended;
                }
                this.f22128r = mutator;
                this.f22126n = jVar;
                this.f22129t = internalMutatorMutex;
                this.f22123O = null;
                this.J2 = 2;
                Object objInvoke = function1.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    jVar2 = jVar;
                    obj = objInvoke;
                    mutator2 = mutator;
                    fuX.n(internalMutatorMutex2.currentMutator, mutator2, null);
                    jVar2.T(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                mutator2 = mutator;
                fuX.n(internalMutatorMutex2.currentMutator, mutator2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r12.T(null);
            throw th4;
        }
    }
}
