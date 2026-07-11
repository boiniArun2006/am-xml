package DTN;

import DTN.CN3;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final rB.Ml f1480n;
    private CN3.j nr;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f1481t;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f1482O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f1483n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f1484r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f1485t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1482O = obj;
            this.f1484r |= Integer.MIN_VALUE;
            return fuX.this.t(null, this);
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f1486O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f1487n;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1487n = obj;
            this.f1486O |= Integer.MIN_VALUE;
            return fuX.this.n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Context context, Continuation continuation) {
        j jVar;
        fuX fux;
        fuX fux2;
        x0X.n c1266n;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f1484r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f1484r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objT = jVar.f1482O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f1484r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            Ml ml = new Ml(context);
            jVar.f1483n = this;
            jVar.f1485t = context;
            jVar.f1484r = 1;
            objT = ml.t(jVar);
            if (objT != coroutine_suspended) {
                fux = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fux2 = (fuX) jVar.f1483n;
            ResultKt.throwOnFailure(objT);
            fux = fux2;
            c1266n = (x0X.n) objT;
            if (c1266n instanceof n.C1266n) {
                DTN.j jVar2 = (DTN.j) ((n.C1266n) c1266n).n();
                if (!fux.f1481t) {
                    rB.Ml ml2 = fux.f1480n;
                    if (ml2 != null) {
                        rB.I28.rl(ml2, CollectionsKt.listOf((Object[]) new String[]{"updateSecurityProvider", "failed"}), null, null, null, pq.I28.n(pq.n.n("isUserResolvable", jVar2.n())), 14, null);
                    }
                    fux.f1481t = true;
                    return c1266n;
                }
            } else if (!(c1266n instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return c1266n;
        }
        context = (Context) jVar.f1485t;
        fux = (fuX) jVar.f1483n;
        ResultKt.throwOnFailure(objT);
        if (((Boolean) objT).booleanValue()) {
            c1266n = new n.C1266n(new DTN.j(1, true));
            if (c1266n instanceof n.C1266n) {
            }
            return c1266n;
        }
        jVar.f1483n = fux;
        jVar.f1485t = null;
        jVar.f1484r = 2;
        objT = Dsr.rl(context, jVar);
        if (objT != coroutine_suspended) {
            fux2 = fux;
            fux = fux2;
            c1266n = (x0X.n) objT;
            if (c1266n instanceof n.C1266n) {
            }
            return c1266n;
        }
        return coroutine_suspended;
    }

    public fuX(Context context, rB.Ml ml, bH.CN3 cn3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1480n = ml != null ? d3.j.nr(ml, "providerInstaller") : null;
        this.rl = true;
        this.nr = CN3.j.f1461O;
        if (cn3 != null) {
            w6.n(cn3, context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // DTN.CN3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, Continuation continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f1486O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f1486O = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objT = nVar.f1487n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f1486O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            nVar.f1486O = 1;
            objT = t(context, nVar);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objT);
        }
        x0X.n nVar2 = (x0X.n) objT;
        if (nVar2 instanceof n.C1266n) {
            return new n.C1266n(Unit.INSTANCE);
        }
        if (nVar2 instanceof n.w6) {
            return nVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
