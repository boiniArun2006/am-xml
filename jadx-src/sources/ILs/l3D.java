package ILs;

import GJW.h;
import GJW.qf;
import GJW.vd;
import GJW.xuv;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l3D {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f4188O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4189n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4190t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4188O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return l3D.rl(null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ GJW.Pl f4191n;

        n(GJW.Pl pl) {
            this.f4191n = pl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable th) {
            GJW.Pl pl = this.f4191n;
            Result.Companion companion = Result.INSTANCE;
            pl.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    public static final Q O(vd vdVar, CoroutineContext coroutineContext, int i2, ILs.j jVar, h hVar, Function1 function1, Function2 function2) {
        C1376c c1376c = new C1376c(qf.mUb(vdVar, coroutineContext), aC.rl(i2, jVar, null, 4, null));
        if (function1 != null) {
            c1376c.invokeOnCompletion(function1);
        }
        c1376c.RQ(hVar, c1376c, function2);
        return c1376c;
    }

    public static /* synthetic */ Q J2(vd vdVar, CoroutineContext coroutineContext, int i2, ILs.j jVar, h hVar, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            jVar = ILs.j.f4185n;
        }
        if ((i3 & 8) != 0) {
            hVar = h.f3486n;
        }
        if ((i3 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return O(vdVar, coroutineContext, i2, jVar, hVar, function12, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(s4 s4Var, Function0 function0, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f4188O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (jVar.getContext().get(xuv.nr) != s4Var) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                jVar.f4189n = s4Var;
                jVar.f4190t = function0;
                jVar.J2 = 1;
                GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(jVar), 1);
                eOVar.e();
                s4Var.t(new n(eOVar));
                Object objWPU = eOVar.WPU();
                if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(jVar);
                }
                if (objWPU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) jVar.f4190t;
                ResultKt.throwOnFailure(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public static /* synthetic */ Object t(s4 s4Var, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = new Function0() { // from class: ILs.QJ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l3D.nr();
                }
            };
        }
        return rl(s4Var, function0, continuation);
    }
}
