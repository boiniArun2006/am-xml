package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaoc implements zzaeu {
    private final zzaod zza = new zzaod(null, 0, "audio/ac3");
    private final zzer zzb = new zzer(2786);
    private boolean zzc;

    static {
        int i2 = zzaob.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = new zzer(10);
        int i2 = 0;
        while (true) {
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
        int i3 = 0;
        int i5 = i2;
        while (true) {
            zzaelVar2.zzh(zzerVar.zzi(), 0, 6, false);
            zzerVar.zzh(0);
            if (zzerVar.zzt() != 2935) {
                zzaevVar.zzl();
                i5++;
                if (i5 - i2 >= 8192) {
                    return false;
                }
                zzaelVar2.zzj(i5, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iZzd = zzadv.zzd(zzerVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzaelVar2.zzj(iZzd - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
        zzaexVar.zzw(new zzafx(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzer zzerVar = this.zzb;
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }
}
