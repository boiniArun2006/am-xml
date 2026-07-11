package CuC;

import GJW.Dsr;
import GJW.OU;
import GJW.lej;
import GJW.vd;
import TFv.Wre;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rB.Ml;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n implements U5u.j {
    private final Wre nr;
    private final HF.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f1028t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1030n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1031t;

        /* JADX INFO: renamed from: CuC.n$j$j, reason: collision with other inner class name */
        static final class C0036j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f1032O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1033n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ n f1034t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0036j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0036j(n nVar, String str, Continuation continuation) {
                super(2, continuation);
                this.f1034t = nVar;
                this.f1032O = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0036j(this.f1034t, this.f1032O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f1033n == 0) {
                    ResultKt.throwOnFailure(obj);
                    x0X.n nVarN = this.f1034t.rl.n(this.f1032O);
                    n nVar = this.f1034t;
                    if (nVarN instanceof n.C1266n) {
                        Error error = (Error) ((n.C1266n) nVarN).n();
                        Ml ml = nVar.f1028t;
                        if (ml != null) {
                            ml.t(CuC.j.f1027n.n(error));
                            return nVarN;
                        }
                    } else if (!(nVarN instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return nVarN;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = n.this.new j(continuation);
            jVar.f1031t = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation continuation) {
            return ((j) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1030n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.f1031t;
            if (str == null) {
                return new n.w6(null);
            }
            lej lejVarN = OU.n();
            C0036j c0036j = new C0036j(n.this, str, null);
            this.f1030n = 1;
            Object objUo = Dsr.Uo(lejVarN, c0036j, this);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUo;
        }
    }

    public n(Wre backendRawResponseFlow, HF.j settingsDeserializer, Ml ml) {
        Intrinsics.checkNotNullParameter(backendRawResponseFlow, "backendRawResponseFlow");
        Intrinsics.checkNotNullParameter(settingsDeserializer, "settingsDeserializer");
        this.rl = settingsDeserializer;
        this.f1028t = ml;
        this.nr = xFr.Ml.n(backendRawResponseFlow, new j(null));
    }

    @Override // U5u.j
    public Wre n() {
        return this.nr;
    }
}
