package com.google.firebase.firestore;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wqP.eO f60344n;
    private uh.r rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private wqP.I28 f60345t = new wqP.I28();

    synchronized Object n(wqP.eO eOVar) {
        rl();
        return eOVar.apply(this.rl);
    }

    synchronized void rl() {
        if (!t()) {
            this.rl = (uh.r) this.f60344n.apply(this.f60345t);
        }
    }

    boolean t() {
        return this.rl != null;
    }

    Xo(wqP.eO eOVar) {
        this.f60344n = eOVar;
    }
}
