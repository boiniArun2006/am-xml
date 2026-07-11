package com.android.billingclient.api;

import OS.InterfaceC1422c;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class psW {
    private boolean J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f47633n;
    private final InterfaceC1422c rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qf f47634t;
    private final K nr = new K(this, true);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final K f47632O = new K(this, false);

    final void J2(boolean z2) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.J2 = z2;
        this.f47632O.n(this.f47633n, intentFilter2);
        if (this.J2) {
            this.nr.rl(this.f47633n, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.nr.n(this.f47633n, intentFilter);
        }
    }

    final InterfaceC1422c nr() {
        return this.rl;
    }

    psW(Context context, InterfaceC1422c interfaceC1422c, OS.M m2, OS.ci ciVar, OS.Q q2, qf qfVar) {
        this.f47633n = context;
        this.rl = interfaceC1422c;
        this.f47634t = qfVar;
    }

    static /* bridge */ /* synthetic */ OS.Q O(psW psw) {
        psw.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ OS.ci n(psW psw) {
        psw.getClass();
        return null;
    }
}
