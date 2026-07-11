package com.google.firebase.auth;

import java.util.Iterator;
import oW.InterfaceC2312j;
import pa.C2333n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Sis implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f60139n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C2333n f60140t;

    Sis(FirebaseAuth firebaseAuth, C2333n c2333n) {
        this.f60139n = firebaseAuth;
        this.f60140t = c2333n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f60139n.f60101t.iterator();
        while (it.hasNext()) {
            ((InterfaceC2312j) it.next()).n(this.f60140t);
        }
        Iterator it2 = this.f60139n.rl.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.j.n(it2.next());
            throw null;
        }
    }
}
