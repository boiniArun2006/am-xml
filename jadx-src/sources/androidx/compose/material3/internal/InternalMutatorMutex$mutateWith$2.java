package androidx.compose.material3.internal;

import GJW.vd;
import GJW.xuv;
import androidx.compose.animation.core.fuX;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.internal.InternalMutatorMutex;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "LGJW/vd;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {180, 142}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nInternalMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/internal/InternalMutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,174:1\n120#2,10:175\n*S KotlinDebug\n*F\n+ 1 InternalMutatorMutex.kt\nandroidx/compose/material3/internal/InternalMutatorMutex$mutateWith$2\n*L\n140#1:175,10\n*E\n"})
final class InternalMutatorMutex$mutateWith$2 extends SuspendLambda implements Function2<vd, Continuation<Object>, Object> {
    final /* synthetic */ Object E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f29206O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ InternalMutatorMutex f29207S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutatePriority f29208Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2 f29209g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f29210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private /* synthetic */ Object f29211o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f29212r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f29213t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, InternalMutatorMutex internalMutatorMutex, Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f29208Z = mutatePriority;
        this.f29207S = internalMutatorMutex;
        this.f29209g = function2;
        this.E2 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.f29208Z, this.f29207S, this.f29209g, this.E2, continuation);
        internalMutatorMutex$mutateWith$2.f29211o = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((InternalMutatorMutex$mutateWith$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
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
        InternalMutatorMutex.Mutator mutator;
        InternalMutatorMutex internalMutatorMutex;
        Object obj2;
        Throwable th;
        InternalMutatorMutex internalMutatorMutex2;
        InternalMutatorMutex.Mutator mutator2;
        yB.j jVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f29212r;
        try {
            try {
                if (r12 != 0) {
                    if (r12 != 1) {
                        if (r12 == 2) {
                            internalMutatorMutex2 = (InternalMutatorMutex) this.f29213t;
                            jVar2 = (yB.j) this.f29210n;
                            mutator2 = (InternalMutatorMutex.Mutator) this.f29211o;
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
                    internalMutatorMutex = (InternalMutatorMutex) this.J2;
                    obj2 = this.f29206O;
                    function2 = (Function2) this.f29213t;
                    yB.j jVar3 = (yB.j) this.f29210n;
                    mutator = (InternalMutatorMutex.Mutator) this.f29211o;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f29211o;
                    MutatePriority mutatePriority = this.f29208Z;
                    CoroutineContext.Element element = vdVar.getCoroutineContext().get(xuv.nr);
                    Intrinsics.checkNotNull(element);
                    InternalMutatorMutex.Mutator mutator3 = new InternalMutatorMutex.Mutator(mutatePriority, (xuv) element);
                    this.f29207S.J2(mutator3);
                    jVar = this.f29207S.mutex;
                    function2 = this.f29209g;
                    Object obj3 = this.E2;
                    InternalMutatorMutex internalMutatorMutex3 = this.f29207S;
                    this.f29211o = mutator3;
                    this.f29210n = jVar;
                    this.f29213t = function2;
                    this.f29206O = obj3;
                    this.J2 = internalMutatorMutex3;
                    this.f29212r = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                        mutator = mutator3;
                        internalMutatorMutex = internalMutatorMutex3;
                        obj2 = obj3;
                    }
                    return coroutine_suspended;
                }
                this.f29211o = mutator;
                this.f29210n = jVar;
                this.f29213t = internalMutatorMutex;
                this.f29206O = null;
                this.J2 = null;
                this.f29212r = 2;
                Object objInvoke = function2.invoke(obj2, this);
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
