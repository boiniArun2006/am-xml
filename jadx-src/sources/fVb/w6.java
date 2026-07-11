package fVb;

import FjR.Dsr;
import FjR.aC;
import Z.fuX;
import fVb.n;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 implements n.j {
    private final eQ.w6 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final fuX f66968O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FjR.fuX f66969n;
    private final FjR.fuX nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f66970t;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f66971O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66972n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f66973r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f66974t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66971O = obj;
            this.f66973r |= Integer.MIN_VALUE;
            return w6.this.Uo(null, this);
        }
    }

    static /* synthetic */ w6 nr(w6 w6Var, int i2, FjR.fuX fux, fuX fux2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = w6Var.f66970t;
        }
        if ((i3 & 2) != 0) {
            fux = w6Var.n();
        }
        if ((i3 & 4) != 0) {
            fux2 = w6Var.getSize();
        }
        return w6Var.t(i2, fux, fux2);
    }

    private final w6 t(int i2, FjR.fuX fux, fuX fux2) {
        return new w6(this.f66969n, this.rl, i2, fux, fux2, this.J2, this.Uo);
    }

    public final boolean J2() {
        return this.Uo;
    }

    public final eQ.w6 O() {
        return this.J2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Uo(FjR.fuX fux, Continuation continuation) {
        j jVar;
        n nVar;
        w6 w6Var;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f66973r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f66973r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f66971O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f66973r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int i5 = this.f66970t;
            if (i5 > 0) {
                rl(fux, (n) this.rl.get(i5 - 1));
            }
            n nVar2 = (n) this.rl.get(this.f66970t);
            w6 w6VarNr = nr(this, this.f66970t + 1, fux, null, 4, null);
            jVar.f66972n = this;
            jVar.f66974t = nVar2;
            jVar.f66973r = 1;
            Object objN = nVar2.n(w6VarNr, jVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objN;
            nVar = nVar2;
            w6Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) jVar.f66974t;
            w6Var = (w6) jVar.f66972n;
            ResultKt.throwOnFailure(obj);
        }
        Dsr dsr = (Dsr) obj;
        w6Var.rl(dsr.rl(), nVar);
        return dsr;
    }

    @Override // fVb.n.j
    public fuX getSize() {
        return this.f66968O;
    }

    @Override // fVb.n.j
    public FjR.fuX n() {
        return this.nr;
    }

    public w6(FjR.fuX fux, List list, int i2, FjR.fuX fux2, fuX fux3, eQ.w6 w6Var, boolean z2) {
        this.f66969n = fux;
        this.rl = list;
        this.f66970t = i2;
        this.nr = fux2;
        this.f66968O = fux3;
        this.J2 = w6Var;
        this.Uo = z2;
    }

    private final void rl(FjR.fuX fux, n nVar) {
        if (fux.qie() == this.f66969n.qie()) {
            if (fux.az() != aC.f3019n) {
                if (fux.v() == this.f66969n.v()) {
                    if (fux.nY() == this.f66969n.nY()) {
                        if (fux.s7N() == this.f66969n.s7N()) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + nVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + nVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + nVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + nVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + nVar + "' cannot modify the request's context.").toString());
    }
}
