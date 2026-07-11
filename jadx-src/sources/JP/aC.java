package JP;

import JP.j;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC extends JP.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JP.j f4530n;
    private final JP.j rl;

    private static final class j extends j.AbstractC0157j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j.AbstractC0157j f4531n;
        private final io.grpc.QJ rl;

        @Override // JP.j.AbstractC0157j
        public void n(io.grpc.QJ qj) {
            t1.Xo.ck(qj, "headers");
            io.grpc.QJ qj2 = new io.grpc.QJ();
            qj2.az(this.rl);
            qj2.az(qj);
            this.f4531n.n(qj2);
        }

        @Override // JP.j.AbstractC0157j
        public void rl(io.grpc.SPz sPz) {
            this.f4531n.rl(sPz);
        }

        public j(j.AbstractC0157j abstractC0157j, io.grpc.QJ qj) {
            this.f4531n = abstractC0157j;
            this.rl = qj;
        }
    }

    private final class n extends j.AbstractC0157j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j.n f4533n;
        private final Xo nr;
        private final Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final j.AbstractC0157j f4534t;

        public n(j.n nVar, Executor executor, j.AbstractC0157j abstractC0157j, Xo xo) {
            this.f4533n = nVar;
            this.rl = executor;
            this.f4534t = (j.AbstractC0157j) t1.Xo.ck(abstractC0157j, "delegate");
            this.nr = (Xo) t1.Xo.ck(xo, "context");
        }

        @Override // JP.j.AbstractC0157j
        public void n(io.grpc.QJ qj) {
            t1.Xo.ck(qj, "headers");
            Xo xoRl = this.nr.rl();
            try {
                aC.this.rl.n(this.f4533n, this.rl, new j(this.f4534t, qj));
            } finally {
                this.nr.J2(xoRl);
            }
        }

        @Override // JP.j.AbstractC0157j
        public void rl(io.grpc.SPz sPz) {
            this.f4534t.rl(sPz);
        }
    }

    @Override // JP.j
    public void n(j.n nVar, Executor executor, j.AbstractC0157j abstractC0157j) {
        this.f4530n.n(nVar, executor, new n(nVar, executor, abstractC0157j, Xo.O()));
    }

    public aC(JP.j jVar, JP.j jVar2) {
        this.f4530n = (JP.j) t1.Xo.ck(jVar, "creds1");
        this.rl = (JP.j) t1.Xo.ck(jVar2, "creds2");
    }
}
