package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzlc {
    public zzmd zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlc(zzmd zzmdVar) {
        this.zza = zzmdVar;
    }

    public final void zza(int i2) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i2);
        this.zzb += i2;
    }

    public final void zzb(zzmd zzmdVar) {
        this.zze |= this.zza != zzmdVar;
        this.zza = zzmdVar;
    }

    final /* synthetic */ boolean zzd() {
        return this.zze;
    }

    public final void zzc(int i2) {
        if (this.zzc && this.zzd != 5) {
            zzgrc.zza(i2 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i2;
    }
}
