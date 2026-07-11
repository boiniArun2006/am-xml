package uh;

import gq.C2144o;
import gq.C2147u;
import gq.mrQ;
import gq.tmw;
import gq.yg;
import uh.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class M extends nKK {
    @Override // uh.nKK, uh.aC
    protected yg O(aC.j jVar) {
        return new mrQ(jVar.f74496n, jVar.f74497t.t(), jVar.f74497t.n(), new gq.eO(ck()), C2147u.n.n(this.f74493n.Uo()));
    }

    @Override // uh.nKK, uh.aC
    protected C2144o t(aC.j jVar) {
        return new C2144o(HI(), jVar.rl, ty());
    }

    public M(com.google.firebase.firestore.Pl pl) {
        super(pl);
    }

    @Override // uh.nKK, uh.aC
    protected tmw rl(aC.j jVar) {
        return ((mrQ) HI()).Uo().O().xMQ(jVar.rl, ty());
    }
}
