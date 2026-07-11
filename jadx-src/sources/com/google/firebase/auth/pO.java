package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class pO implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60214n;

    pO(FirebaseAuth firebaseAuth) {
        this.f60214n = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f60214n.nr.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.j) it.next()).n(this.f60214n);
        }
    }
}
