package p5A;

import GJW.C;
import GJW.Lu;
import GJW.h;
import GJW.vd;
import GJW.xuv;
import ILs.CN3;
import ILs.aC;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sJa.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements sJa.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f71596n;
    private final xuv nr;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final vd f71597t;

    /* JADX INFO: renamed from: p5A.j$j, reason: collision with other inner class name */
    static final class C1089j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71599n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f71600t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1089j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C1089j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new C1089j(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[PHI: r1 r6
          0x0039: PHI (r1v2 kotlin.jvm.functions.Function2) = (r1v1 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:12:0x0036, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]
          0x0039: PHI (r6v5 java.lang.Object) = (r6v4 java.lang.Object), (r6v0 java.lang.Object) binds: [B:12:0x0036, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:11:0x0022). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Function2 function2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71600t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    function2 = (Function2) this.f71599n;
                    ResultKt.throwOnFailure(obj);
                    this.f71599n = null;
                    this.f71600t = 2;
                    if (function2.invoke(obj, this) != coroutine_suspended) {
                        function2 = j.this.f71596n;
                        CN3 cn3 = j.this.rl;
                        this.f71599n = function2;
                        this.f71600t = 1;
                        obj = cn3.KN(this);
                        if (obj != coroutine_suspended) {
                            this.f71599n = null;
                            this.f71600t = 2;
                            if (function2.invoke(obj, this) != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
            ResultKt.throwOnFailure(obj);
            function2 = j.this.f71596n;
            CN3 cn32 = j.this.rl;
            this.f71599n = function2;
            this.f71600t = 1;
            obj = cn32.KN(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    public j(Function2 processingBlock, Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(processingBlock, "processingBlock");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.f71596n = processingBlock;
        this.rl = aC.rl(Integer.MAX_VALUE, null, null, 6, null);
        vd vdVarN = Lu.n(dispatcherProvider.t());
        this.f71597t = vdVarN;
        this.nr = C.nr(vdVarN, null, h.f3489t, new C1089j(null), 1, null);
    }

    @Override // sJa.j
    public void n(Object obj) {
        this.rl.nr(obj);
    }

    @Override // sJa.j
    public void start() {
        this.nr.start();
    }
}
