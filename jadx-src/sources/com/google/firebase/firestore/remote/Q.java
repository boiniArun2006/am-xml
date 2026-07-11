package com.google.firebase.firestore.remote;

import uh.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Q {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private qz f60393O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l3D f60394n;
    private Pl nr;
    private r rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private QJ f60395t;

    public qz J2() {
        return (qz) wqP.n.nr(this.f60393O, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public QJ KN() {
        return (QJ) wqP.n.nr(this.f60395t, "firestoreChannel not initialized yet", new Object[0]);
    }

    protected r O(aC.j jVar) {
        return new r(jVar.f74497t.n());
    }

    public Pl Uo() {
        return (Pl) wqP.n.nr(this.nr, "datastore not initialized yet", new Object[0]);
    }

    public r mUb() {
        return (r) wqP.n.nr(this.rl, "remoteSerializer not initialized yet", new Object[0]);
    }

    protected qz n(aC.j jVar) {
        return new aC(jVar.f74496n);
    }

    protected l3D nr(aC.j jVar) {
        return new l3D(jVar.rl, jVar.f74496n, jVar.f74497t, new eO(jVar.J2, jVar.Uo));
    }

    protected Pl rl(aC.j jVar) {
        return new Pl(jVar.rl, mUb(), KN());
    }

    protected QJ t(aC.j jVar) {
        return new QJ(jVar.rl, jVar.J2, jVar.Uo, jVar.f74497t.n(), jVar.KN, xMQ());
    }

    public l3D xMQ() {
        return (l3D) wqP.n.nr(this.f60394n, "grpcCallProvider not initialized yet", new Object[0]);
    }

    public void gh(aC.j jVar) {
        this.rl = O(jVar);
        this.f60394n = nr(jVar);
        this.f60395t = t(jVar);
        this.nr = rl(jVar);
        this.f60393O = n(jVar);
    }
}
