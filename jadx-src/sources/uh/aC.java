package uh;

import android.content.Context;
import gq.C2144o;
import gq.tmw;
import gq.yg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class aC {
    private com.google.firebase.firestore.remote.ci J2;
    private C2144o KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private rv6 f74492O;
    private Xo Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final com.google.firebase.firestore.Pl f74493n;
    private gq.g9s nr;
    private com.google.firebase.firestore.remote.Q rl = new com.google.firebase.firestore.remote.Q();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private yg f74494t;
    private tmw xMQ;

    protected abstract com.google.firebase.firestore.remote.ci J2(j jVar);

    protected abstract yg O(j jVar);

    protected abstract rv6 Uo(j jVar);

    protected abstract Xo n(j jVar);

    protected abstract gq.g9s nr(j jVar);

    protected abstract tmw rl(j jVar);

    protected abstract C2144o t(j jVar);

    public static final class j {
        public final VtZ.j J2;
        public final Pe.C KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f74495O;
        public final VtZ.j Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Context f74496n;
        public final VtZ.aC nr;
        public final wqP.I28 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final o f74497t;

        public j(Context context, wqP.I28 i28, o oVar, VtZ.aC aCVar, int i2, VtZ.j jVar, VtZ.j jVar2, Pe.C c2) {
            this.f74496n = context;
            this.rl = i28;
            this.f74497t = oVar;
            this.nr = aCVar;
            this.f74495O = i2;
            this.J2 = jVar;
            this.Uo = jVar2;
            this.KN = c2;
        }
    }

    public yg HI() {
        return (yg) wqP.n.nr(this.f74494t, "persistence not initialized yet", new Object[0]);
    }

    public com.google.firebase.firestore.remote.ci Ik() {
        return (com.google.firebase.firestore.remote.ci) wqP.n.nr(this.J2, "remoteStore not initialized yet", new Object[0]);
    }

    public C2144o az() {
        return this.KN;
    }

    public com.google.firebase.firestore.remote.r ck() {
        return this.rl.mUb();
    }

    public Xo gh() {
        return (Xo) wqP.n.nr(this.Uo, "eventManager not initialized yet", new Object[0]);
    }

    public com.google.firebase.firestore.remote.Pl mUb() {
        return this.rl.Uo();
    }

    public void o(j jVar) {
        this.rl.gh(jVar);
        yg ygVarO = O(jVar);
        this.f74494t = ygVarO;
        ygVarO.az();
        this.nr = nr(jVar);
        this.J2 = J2(jVar);
        this.f74492O = Uo(jVar);
        this.Uo = n(jVar);
        this.nr.e();
        this.J2.nHg();
        this.xMQ = rl(jVar);
        this.KN = t(jVar);
    }

    public tmw qie() {
        return this.xMQ;
    }

    public rv6 r() {
        return (rv6) wqP.n.nr(this.f74492O, "syncEngine not initialized yet", new Object[0]);
    }

    public gq.g9s ty() {
        return (gq.g9s) wqP.n.nr(this.nr, "localStore not initialized yet", new Object[0]);
    }

    protected com.google.firebase.firestore.remote.qz xMQ() {
        return this.rl.J2();
    }

    public aC(com.google.firebase.firestore.Pl pl) {
        this.f74493n = pl;
    }

    public static aC KN(com.google.firebase.firestore.Pl pl) {
        if (pl.xMQ()) {
            return new M(pl);
        }
        return new nKK(pl);
    }
}
