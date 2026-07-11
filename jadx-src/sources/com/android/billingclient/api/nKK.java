package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class nKK implements ServiceConnection {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ DAz f47629n;

    /* synthetic */ nKK(DAz dAz, OS.nKK nkk) {
        this.f47629n = dAz;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClientTesting", "Billing Override Service connected.");
        this.f47629n.f47530N = zzau.zzc(iBinder);
        this.f47629n.f47531T = 2;
        this.f47629n.ub(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
        this.f47629n.f47530N = null;
        this.f47629n.f47531T = 0;
    }
}
