package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaga implements zzaeu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzaex zzf;
    private zzagh zzg;

    public zzaga(int i2, int i3, String str) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j3) {
        if (j2 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        int i2 = this.zza;
        zzgrc.zzi((i2 == -1 || this.zzb == -1) ? false : true);
        int i3 = this.zzb;
        zzer zzerVar = new zzer(i3);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, i3, false);
        return zzerVar.zzt() == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(1024, 4);
        this.zzg = zzaghVarZzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzl(str);
        zztVar.zzm(str);
        zzaghVarZzu.zzz(zztVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzagb(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i2 = this.zze;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzagh zzaghVar = this.zzg;
        zzaghVar.getClass();
        int iZza = zzaghVar.zza(zzaevVar, 1024, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }
}
