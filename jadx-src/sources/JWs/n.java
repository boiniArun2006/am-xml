package JWs;

import GJW.C;
import GJW.vd;
import TFv.CN3;
import TFv.Wre;
import TFv.fuX;
import YgZ.w6;
import android.content.Context;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nKt.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements JWs.j {
    private String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f4603O;
    private PI.j nr;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n.InterfaceC1063n f4604t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4605n;

        /* JADX INFO: renamed from: JWs.n$j$j, reason: collision with other inner class name */
        static final class C0160j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ n f4607n;

            C0160j(n nVar) {
                this.f4607n = nVar;
            }

            public final Object n(boolean z2, Continuation continuation) {
                if (z2) {
                    this.f4607n.J2 = UUID.randomUUID().toString();
                }
                return Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4605n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre wreIk = fuX.Ik(n.this.nr.T());
                C0160j c0160j = new C0160j(n.this);
                this.f4605n = 1;
                if (wreIk.n(c0160j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public n(Context context, n.InterfaceC1063n config, PI.j lifecycleObserver, vd scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.rl = context;
        this.f4604t = config;
        this.nr = lifecycleObserver;
        this.f4603O = scope;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.J2 = string;
        C.nr(scope, null, null, new j(null), 3, null);
    }

    @Override // JWs.j
    public Object n(Continuation continuation) {
        YgZ.n nVar = new YgZ.n();
        w6 w6Var = w6.f12217n;
        return new SpD.w6(w6Var.t(this.rl), String.valueOf(w6Var.rl(this.rl)), nVar.t(), nVar.KN(), nVar.O(), nVar.rl(), nVar.Uo(), nVar.xMQ(), nVar.n(), String.valueOf(nVar.mUb(this.rl)), nVar.J2(), this.f4604t.getSdkVersion(), this.J2, nVar.nr(), nVar.gh(), nVar.qie());
    }
}
