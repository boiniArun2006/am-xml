package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class lej implements qf {
    private zzku rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iwV f47617t;

    lej(Context context, zzku zzkuVar) {
        this.f47617t = new iwV(context);
        this.rl = zzkuVar;
    }

    @Override // com.android.billingclient.api.qf
    public final void J2(zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.rl);
            zzliVarZzc.zza(zzjzVar);
            this.f47617t.n((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.qf
    public final void O(zzlu zzluVar) {
        if (zzluVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.rl);
            zzliVarZzc.zzq(zzluVar);
            this.f47617t.n((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.qf
    public final void Uo(zzkd zzkdVar, int i2) {
        try {
            zzks zzksVar = (zzks) this.rl.zzn();
            zzksVar.zza(i2);
            this.rl = (zzku) zzksVar.zzf();
            nr(zzkdVar);
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.qf
    public final void nr(zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.rl);
            zzliVarZzc.zzm(zzkdVar);
            this.f47617t.n((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.qf
    public final void rl(zzlq zzlqVar) {
        try {
            iwV iwv = this.f47617t;
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.rl);
            zzliVarZzc.zzp(zzlqVar);
            iwv.n((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.qf
    public final void t(zzjz zzjzVar, int i2) {
        try {
            zzks zzksVar = (zzks) this.rl.zzn();
            zzksVar.zza(i2);
            this.rl = (zzku) zzksVar.zzf();
            J2(zzjzVar);
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.qf
    public final void n(zzkl zzklVar) {
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.rl);
            zzliVarZzc.zzn(zzklVar);
            this.f47617t.n((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to log.", th);
        }
    }
}
