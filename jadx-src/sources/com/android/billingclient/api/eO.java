package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class eO implements Callable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f47605n;
    final /* synthetic */ OS.QJ rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ n f47606t;

    eO(n nVar, String str, OS.QJ qj) {
        this.f47605n = str;
        this.rl = qj;
        this.f47606t = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        OS.vd vdVarM = this.f47606t.M(this.f47605n, 9);
        if (vdVarM.rl() != null) {
            this.rl.n(vdVarM.n(), vdVarM.rl());
            return null;
        }
        this.rl.n(vdVarM.n(), zzco.zzl());
        return null;
    }
}
