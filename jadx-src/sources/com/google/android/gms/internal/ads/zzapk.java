package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzapk {
    private final zzaon zza;
    private final zzfg zzb;
    private final zzeq zzc = new zzeq(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzapk(zzaon zzaonVar, zzfg zzfgVar) {
        this.zza = zzaonVar;
        this.zzb = zzfgVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzer zzerVar) throws zzat {
        long jZze;
        char c2;
        zzeq zzeqVar = this.zzc;
        zzerVar.zzm(zzeqVar.zza, 0, 3);
        zzeqVar.zzf(0);
        zzeqVar.zzh(8);
        this.zzd = zzeqVar.zzi();
        this.zze = zzeqVar.zzi();
        zzeqVar.zzh(6);
        zzerVar.zzm(zzeqVar.zza, 0, zzeqVar.zzj(8));
        zzeqVar.zzf(0);
        if (this.zzd) {
            zzeqVar.zzh(4);
            long jZzj = zzeqVar.zzj(3);
            zzeqVar.zzh(1);
            int iZzj = zzeqVar.zzj(15) << 15;
            zzeqVar.zzh(1);
            long jZzj2 = zzeqVar.zzj(15);
            zzeqVar.zzh(1);
            if (this.zzf || !this.zze) {
                c2 = 30;
            } else {
                zzeqVar.zzh(4);
                long jZzj3 = ((long) zzeqVar.zzj(3)) << 30;
                zzeqVar.zzh(1);
                int iZzj2 = zzeqVar.zzj(15) << 15;
                zzeqVar.zzh(1);
                c2 = 30;
                long jZzj4 = zzeqVar.zzj(15);
                zzeqVar.zzh(1);
                this.zzb.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                this.zzf = true;
            }
            jZze = this.zzb.zze((jZzj << c2) | ((long) iZzj) | jZzj2);
        } else {
            jZze = 0;
        }
        zzaon zzaonVar = this.zza;
        zzaonVar.zzc(jZze, 4);
        zzaonVar.zzd(zzerVar);
        zzaonVar.zze(false);
    }
}
