package pL6;

import io.grpc.Pl;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre extends w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pl.I28 f71848n;

    static final class j extends Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pl.Dsr f71849n;
        private final Pl.C rl;

        /* JADX INFO: renamed from: pL6.Wre$j$j, reason: collision with other inner class name */
        class C1099j implements Pl.C {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Pl.C f71850n;

            C1099j(Pl.C c2) {
                this.f71850n = c2;
            }

            @Override // io.grpc.Pl.C
            public void n(JP.Pl pl) {
                this.f71850n.n(pl);
                j.this.rl.n(pl);
            }
        }

        @Override // pL6.Ml, io.grpc.Pl.Dsr
        public void KN(Pl.C c2) {
            this.f71849n.KN(new C1099j(c2));
        }

        @Override // pL6.Ml
        public Pl.Dsr mUb() {
            return this.f71849n;
        }

        j(Pl.Dsr dsr, Pl.C c2) {
            this.f71849n = (Pl.Dsr) Xo.ck(dsr, "delegate");
            this.rl = (Pl.C) Xo.ck(c2, "healthListener");
        }

        @Override // pL6.Ml, io.grpc.Pl.Dsr
        public io.grpc.j t() {
            return super.t().nr().nr(Pl.nr, Boolean.TRUE).n();
        }
    }

    @Override // pL6.w6
    protected Pl.I28 Uo() {
        return this.f71848n;
    }

    @Override // pL6.w6, io.grpc.Pl.I28
    public Pl.Dsr n(Pl.n nVar) {
        Pl.C c2 = (Pl.C) nVar.t(Pl.f68162t);
        Pl.Dsr dsrN = super.n(nVar);
        return (c2 == null || dsrN.t().rl(Pl.nr) != null) ? dsrN : new j(dsrN, c2);
    }

    public Wre(Pl.I28 i28) {
        this.f71848n = (Pl.I28) Xo.ck(i28, "helper");
    }
}
