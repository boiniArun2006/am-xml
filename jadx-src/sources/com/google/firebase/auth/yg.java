package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class yg implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.j f60225n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60226t;

    yg(FirebaseAuth firebaseAuth, FirebaseAuth.j jVar) {
        this.f60225n = jVar;
        this.f60226t = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f60225n.n(this.f60226t);
    }
}
