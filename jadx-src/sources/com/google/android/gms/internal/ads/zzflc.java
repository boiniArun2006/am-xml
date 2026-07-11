package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzflc {
    private final zzflb zza = new zzflb();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    zzflc() {
    }

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzflb zzf() {
        zzflb zzflbVar = this.zza;
        zzflb zzflbVarClone = zzflbVar.clone();
        zzflbVar.zza = false;
        zzflbVar.zzb = false;
        return zzflbVarClone;
    }

    public final String zzg() {
        return "\n\tPool does not exist: " + this.zzd + "\n\tNew pools created: " + this.zzb + "\n\tPools removed: " + this.zzc + "\n\tEntries added: " + this.zzf + "\n\tNo entries retrieved: " + this.zze + "\n";
    }
}
