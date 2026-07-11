package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzalm implements zzaeu {
    private zzaex zza;
    private zzalt zzb;
    private boolean zzc;

    static {
        int i2 = zzall.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    private final boolean zzh(zzaev zzaevVar) throws IOException {
        zzalo zzaloVar = new zzalo();
        if (zzaloVar.zzc(zzaevVar, true) && (zzaloVar.zza & 2) == 2) {
            int iMin = Math.min(zzaloVar.zze, 8);
            zzer zzerVar = new zzer(iMin);
            zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
            zzerVar.zzh(0);
            if (zzerVar.zzd() >= 5 && zzerVar.zzs() == 127 && zzerVar.zzz() == 1179402563) {
                this.zzb = new zzalk();
            } else {
                zzerVar.zzh(0);
                if (zzagn.zzd(1, zzerVar, true)) {
                    this.zzb = new zzalv();
                } else {
                    zzerVar.zzh(0);
                    if (zzalq.zzd(zzerVar)) {
                        this.zzb = new zzalq();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzaevVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzaevVar.zzl();
        }
        if (!this.zzc) {
            zzagh zzaghVarZzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzaghVarZzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        zzalt zzaltVar = this.zzb;
        if (zzaltVar != null) {
            zzaltVar.zzf(j2, j3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        try {
            return zzh(zzaevVar);
        } catch (zzat unused) {
            return false;
        }
    }
}
