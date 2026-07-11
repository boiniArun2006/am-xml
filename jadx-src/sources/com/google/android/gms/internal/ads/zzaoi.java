package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaoi implements zzaeu {
    private final zzaoj zza;
    private final zzer zzb;
    private final zzer zzc;
    private final zzeq zzd;
    private zzaex zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i2 = zzaoh.zza;
    }

    public zzaoi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar;
        int i2 = 0;
        while (true) {
            zzerVar = this.zzc;
            zzael zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i2 += iZzG + 10;
            zzaelVar.zzj(iZzG, false);
        }
        zzaevVar.zzl();
        zzael zzaelVar2 = (zzael) zzaevVar;
        zzaelVar2.zzj(i2, false);
        if (this.zzg == -1) {
            this.zzg = i2;
        }
        int i3 = 0;
        int i5 = 0;
        int i7 = i2;
        do {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 2, false);
            zzerVar.zzh(0);
            if (zzaoj.zzf(zzerVar.zzt())) {
                i3++;
                if (i3 >= 4 && i5 > 188) {
                    return true;
                }
                zzaelVar2.zzh(zzerVar.zzi(), 0, 4, false);
                zzeq zzeqVar = this.zzd;
                zzeqVar.zzf(14);
                int iZzj = zzeqVar.zzj(13);
                if (iZzj <= 6) {
                    i7++;
                    zzaevVar.zzl();
                    zzaelVar2.zzj(i7, false);
                } else {
                    zzaelVar2.zzj(iZzj - 6, false);
                    i5 += iZzj;
                }
            } else {
                i7++;
                zzaevVar.zzl();
                zzaelVar2.zzj(i7, false);
            }
            i3 = 0;
            i5 = 0;
        } while (i7 - i2 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public zzaoi(int i2) {
        this.zza = new zzaoj(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzer(2048);
        this.zzg = -1L;
        zzer zzerVar = new zzer(10);
        this.zzc = zzerVar;
        byte[] bArrZzi = zzerVar.zzi();
        this.zzd = new zzeq(bArrZzi, bArrZzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = zzaexVar;
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zze.getClass();
        zzer zzerVar = this.zzb;
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzafx(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }
}
