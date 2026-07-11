package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzaom implements zzaon {
    private final List zza;
    private final zzagh[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i2 = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i2 >= zzaghVarArr.length) {
                return;
            }
            zzapy zzapyVar = (zzapy) this.zza.get(i2);
            zzaqbVar.zza();
            zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm("application/dvbsubs");
            zztVar.zzp(Collections.singletonList(zzapyVar.zzb));
            zztVar.zze(zzapyVar.zza);
            zzaghVarZzu.zzz(zztVar.zzM());
            zzaghVarArr[i2] = zzaghVarZzu;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j2;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzerVar, 32)) {
                if (this.zze != 1 || zzf(zzerVar, 0)) {
                    int iZzg = zzerVar.zzg();
                    int iZzd = zzerVar.zzd();
                    for (zzagh zzaghVar : this.zzc) {
                        zzerVar.zzh(iZzg);
                        zzaghVar.zzc(zzerVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z2) {
        if (this.zzd) {
            zzgrc.zzi(this.zzg != -9223372036854775807L);
            for (zzagh zzaghVar : this.zzc) {
                zzaghVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }

    public zzaom(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
    }

    private final boolean zzf(zzer zzerVar, int i2) {
        if (zzerVar.zzd() == 0) {
            return false;
        }
        if (zzerVar.zzs() != i2) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }
}
