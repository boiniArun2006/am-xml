package io.grpc.internal;

import io.grpc.AbstractC2170c;
import io.grpc.internal.L0y;
import io.grpc.internal.L0y.j;
import io.grpc.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class L0y extends vd {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final j.w6 f68293O = j.w6.n("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    private final JP.M nr;
    private final AbstractC2170c rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g9 f68294t;

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            L0y.this.rl();
        }
    }

    class n {
        n() {
        }

        public void n(io.grpc.SPz sPz) {
            if (sPz.HI()) {
                L0y.this.f68294t.reset();
            } else {
                L0y.this.f68294t.n(L0y.this.new j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class w6 extends AbstractC2170c.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private AbstractC2170c.Ml f68297n;

        w6(AbstractC2170c.Ml ml) {
            this.f68297n = ml;
        }

        @Override // io.grpc.AbstractC2170c.Ml
        public void n(io.grpc.SPz sPz) {
            this.f68297n.n(sPz);
            L0y.this.nr.execute(new Runnable() { // from class: io.grpc.internal.CM
                @Override // java.lang.Runnable
                public final void run() {
                    L0y.w6 w6Var = this.f68239n;
                    L0y.this.f68294t.n(L0y.this.new j());
                }
            });
        }

        @Override // io.grpc.AbstractC2170c.Ml
        public void rl(AbstractC2170c.I28 i28) {
            io.grpc.j jVarRl = i28.rl();
            j.w6 w6Var = L0y.f68293O;
            if (jVarRl.rl(w6Var) == null) {
                this.f68297n.rl(i28.O().t(i28.rl().nr().nr(w6Var, L0y.this.new n()).n()).n());
                return;
            }
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
    }

    @Override // io.grpc.internal.vd, io.grpc.AbstractC2170c
    public void nr(AbstractC2170c.Ml ml) {
        super.nr(new w6(ml));
    }

    L0y(AbstractC2170c abstractC2170c, g9 g9Var, JP.M m2) {
        super(abstractC2170c);
        this.rl = abstractC2170c;
        this.f68294t = g9Var;
        this.nr = m2;
    }

    @Override // io.grpc.internal.vd, io.grpc.AbstractC2170c
    public void t() {
        super.t();
        this.f68294t.reset();
    }
}
