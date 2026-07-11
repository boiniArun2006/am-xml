package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class K extends BroadcastReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47538n;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ psW f47539t;

    public final synchronized void n(Context context, IntentFilter intentFilter) {
        try {
            if (this.f47538n) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.rl ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f47538n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void rl(Context context, IntentFilter intentFilter, String str) {
        K k2;
        try {
            try {
                if (this.f47538n) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    k2 = this;
                    context.registerReceiver(k2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.rl ? 4 : 2);
                } else {
                    k2 = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                k2.f47538n = true;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    K(psW psw, boolean z2) {
        this.f47539t = psw;
        this.rl = z2;
    }

    private final void t(Bundle bundle, Ml ml, int i2) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f47539t.f47634t.J2(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                this.f47539t.f47634t.J2(u.rl(23, i2, ml));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i2 = 1;
        if (extras == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            qf qfVar = this.f47539t.f47634t;
            Ml ml = Ln.gh;
            qfVar.J2(u.rl(11, 1, ml));
            psW psw = this.f47539t;
            if (psw.rl != null) {
                psw.rl.HI(ml, null);
                return;
            }
            return;
        }
        Ml mlZzf = zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
            i2 = 2;
        }
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (mlZzf.rl() != 0) {
                    t(extras, mlZzf, i2);
                    this.f47539t.rl.HI(mlZzf, zzco.zzl());
                    return;
                }
                psW psw2 = this.f47539t;
                psW.n(psw2);
                psW.O(psw2);
                zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                qf qfVar2 = this.f47539t.f47634t;
                Ml ml2 = Ln.gh;
                qfVar2.J2(u.rl(77, i2, ml2));
                this.f47539t.rl.HI(ml2, zzco.zzl());
                return;
            }
            return;
        }
        List listZzj = zze.zzj(extras);
        if (mlZzf.rl() == 0) {
            this.f47539t.f47634t.nr(u.nr(i2));
        } else {
            t(extras, mlZzf, i2);
        }
        this.f47539t.rl.HI(mlZzf, listZzj);
    }
}
