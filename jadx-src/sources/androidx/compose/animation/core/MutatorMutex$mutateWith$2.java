package androidx.compose.animation.core;

import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.MutatorMutex;
import com.google.android.gms.ads.RequestConfiguration;
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
@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {176, 163}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,170:1\n120#2,10:171\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/animation/core/MutatorMutex$mutateWith$2\n*L\n161#1:171,10\n*E\n"})
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    final /* synthetic */ Object E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f15556O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ MutatorMutex f15557S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutatePriority f15558Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2 f15559g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private /* synthetic */ Object f15561o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f15562r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f15563t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f15558Z = mutatePriority;
        this.f15557S = mutatorMutex;
        this.f15559g = function2;
        this.E2 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f15558Z, this.f15557S, this.f15559g, this.E2, continuation);
        mutatorMutex$mutateWith$2.f15561o = obj;
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
        ?? r12 = this.f15562r;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            mutatorMutex2 = (MutatorMutex) this.f15563t;
                            jVar2 = (yB.j) this.f15560n;
                            mutator2 = (MutatorMutex.Mutator) this.f15561o;
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
                    mutatorMutex = (MutatorMutex) this.J2;
                    obj2 = this.f15556O;
                    function2 = (Function2) this.f15563t;
                    yB.j jVar3 = (yB.j) this.f15560n;
                    mutator = (MutatorMutex.Mutator) this.f15561o;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f15561o;
                    MutatePriority mutatePriority = this.f15558Z;
                    CoroutineContext.Element element = vdVar.getCoroutineContext().get(xuv.nr);
                    Intrinsics.checkNotNull(element);
                    MutatorMutex.Mutator mutator3 = new MutatorMutex.Mutator(mutatePriority, (xuv) element);
                    this.f15557S.J2(mutator3);
                    jVar = this.f15557S.mutex;
                    function2 = this.f15559g;
                    Object obj3 = this.E2;
                    MutatorMutex mutatorMutex3 = this.f15557S;
                    this.f15561o = mutator3;
                    this.f15560n = jVar;
                    this.f15563t = function2;
                    this.f15556O = obj3;
                    this.J2 = mutatorMutex3;
                    this.f15562r = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                        mutator = mutator3;
                        mutatorMutex = mutatorMutex3;
                        obj2 = obj3;
                    }
                    return coroutine_suspended;
                }
                this.f15561o = mutator;
                this.f15560n = jVar;
                this.f15563t = mutatorMutex;
                this.f15556O = null;
                this.J2 = null;
                this.f15562r = 2;
                Object objInvoke = function2.invoke(obj2, this);
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
