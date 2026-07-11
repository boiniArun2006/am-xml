package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzlk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class iwV {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47612n;
    private bF.fuX rl;

    public final void n(zzlk zzlkVar) {
        if (this.f47612n) {
            zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.rl.n(bF.w6.J2(zzlkVar));
        } catch (Throwable unused) {
            zze.zzl("BillingLogger", "logging failed.");
        }
    }

    iwV(Context context) {
        try {
            veW.s4.J2(context);
            this.rl = veW.s4.t().Uo(com.google.android.datatransport.cct.j.Uo).n("PLAY_BILLING_LIBRARY", zzlk.class, bF.n.rl("proto"), new bF.CN3() { // from class: OS.iwV
                @Override // bF.CN3
                public final Object apply(Object obj) {
                    return ((zzlk) obj).zzh();
                }
            });
        } catch (Throwable unused) {
            this.f47612n = true;
        }
    }
}
