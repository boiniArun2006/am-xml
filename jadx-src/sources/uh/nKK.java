package uh;

import com.google.firebase.firestore.remote.ci;
import gq.C2144o;
import gq.C2147u;
import gq.Sis;
import gq.tmw;
import gq.yg;
import uh.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class nKK extends aC {

    private class n implements ci.w6 {
        private n() {
        }

        @Override // com.google.firebase.firestore.remote.ci.w6
        public void J2(Pe.o oVar) {
            nKK.this.r().J2(oVar);
        }

        @Override // com.google.firebase.firestore.remote.ci.w6
        public void O(int i2, io.grpc.SPz sPz) {
            nKK.this.r().O(i2, sPz);
        }

        @Override // com.google.firebase.firestore.remote.ci.w6
        public void n(u uVar) {
            nKK.this.r().n(uVar);
        }

        @Override // com.google.firebase.firestore.remote.ci.w6
        public void nr(BC.fuX fux) {
            nKK.this.r().nr(fux);
        }

        @Override // com.google.firebase.firestore.remote.ci.w6
        public eZ.I28 rl(int i2) {
            return nKK.this.r().rl(i2);
        }

        @Override // com.google.firebase.firestore.remote.ci.w6
        public void t(int i2, io.grpc.SPz sPz) {
            nKK.this.r().t(i2, sPz);
        }
    }

    @Override // uh.aC
    protected tmw rl(aC.j jVar) {
        return null;
    }

    @Override // uh.aC
    protected C2144o t(aC.j jVar) {
        return null;
    }

    @Override // uh.aC
    protected com.google.firebase.firestore.remote.ci J2(aC.j jVar) {
        return new com.google.firebase.firestore.remote.ci(jVar.f74497t.n(), new n(), ty(), mUb(), jVar.rl, xMQ());
    }

    @Override // uh.aC
    protected yg O(aC.j jVar) {
        if (!Z(this.f74493n)) {
            return gq.psW.ty();
        }
        return gq.psW.HI(C2147u.n.n(this.f74493n.Uo()), new gq.eO(ck()));
    }

    @Override // uh.aC
    protected rv6 Uo(aC.j jVar) {
        return new rv6(ty(), Ik(), jVar.nr, jVar.f74495O);
    }

    @Override // uh.aC
    protected Xo n(aC.j jVar) {
        return new Xo(r());
    }

    @Override // uh.aC
    protected gq.g9s nr(aC.j jVar) {
        return new gq.g9s(HI(), new Sis(), jVar.nr);
    }

    public nKK(com.google.firebase.firestore.Pl pl) {
        super(pl);
    }

    private boolean Z(com.google.firebase.firestore.Pl pl) {
        pl.J2();
        return false;
    }
}
