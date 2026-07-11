package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhbd {
    private boolean zza;
    private final zzhbp zzc;
    private final zzhbb zzb = zzhbb.zza;
    private zzhbe zzd = null;
    private zzhbf zze = null;

    /* synthetic */ zzhbd(zzhbp zzhbpVar, byte[] bArr) {
        this.zzc = zzhbpVar;
    }

    public final zzhbd zzb() {
        this.zzd = zzhbe.zza;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z2) {
        this.zza = false;
    }

    final /* synthetic */ zzhbb zze() {
        return this.zzb;
    }

    final /* synthetic */ zzhbp zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzhbe zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzhbf zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzhbf zzhbfVar) {
        this.zze = zzhbfVar;
    }

    public final zzhbd zza() {
        zzhbf zzhbfVar = this.zze;
        if (zzhbfVar != null) {
            zzhbfVar.zzc();
        }
        this.zza = true;
        return this;
    }
}
