package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzajx {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzer zzf;
    private final zzer zzg;
    private int zzh;
    private int zzi;

    public final boolean zza() {
        int i2 = this.zzb + 1;
        this.zzb = i2;
        if (i2 == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzer zzerVar = this.zzg;
            this.zzc = zzerVar.zzH();
            zzerVar.zzk(4);
            int i3 = this.zzi - 1;
            this.zzi = i3;
            this.zzh = i3 > 0 ? (-1) + zzerVar.zzH() : -1;
        }
        return true;
    }

    public zzajx(zzer zzerVar, zzer zzerVar2, boolean z2) throws zzat {
        this.zzg = zzerVar;
        this.zzf = zzerVar2;
        this.zze = z2;
        zzerVar2.zzh(12);
        this.zza = zzerVar2.zzH();
        zzerVar.zzh(12);
        this.zzi = zzerVar.zzH();
        zzaey.zza(zzerVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }
}
