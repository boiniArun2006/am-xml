package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzej;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Z implements zzej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Consumer f47594n;
    final /* synthetic */ int nr;
    final /* synthetic */ Runnable rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ DAz f47595t;

    Z(DAz dAz, int i2, Consumer consumer, Runnable runnable) {
        this.nr = i2;
        this.f47594n = consumer;
        this.rl = runnable;
        this.f47595t = dAz;
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public final void zza(Throwable th) {
        if (th instanceof TimeoutException) {
            this.f47595t.f(114, 28, Ln.f47542X);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            this.f47595t.f(107, 28, Ln.f47542X);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.rl.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        DAz dAz = this.f47595t;
        if (!DAz.Bu(iIntValue)) {
            this.rl.run();
        } else {
            this.f47594n.accept(dAz.p0N(this.nr, num.intValue()));
        }
    }
}
