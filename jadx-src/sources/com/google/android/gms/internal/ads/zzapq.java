package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzapq {
    private final List zza;
    private final zzagh[] zzc;
    private final String zzb = "video/mp2t";
    private final zzgq zzd = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzapp
        @Override // com.google.android.gms.internal.ads.zzgp
        public final /* synthetic */ void zza(long j2, zzer zzerVar) {
            this.zza.zzf(j2, zzerVar);
        }
    });

    public final void zza(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i2 = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i2 >= zzaghVarArr.length) {
                return;
            }
            zzaqbVar.zza();
            zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i2);
            String str = zzvVar.zzo;
            boolean z2 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z2 = false;
            }
            zzgrc.zzf(z2, "Invalid closed caption MIME type provided: %s", str);
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzaqbVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzaghVarZzu.zzz(zztVar.zzM());
            zzaghVarArr[i2] = zzaghVarZzu;
            i2++;
        }
    }

    public final void zzb(int i2) {
        this.zzd.zza(i2);
    }

    public final void zzc(long j2, zzer zzerVar) {
        this.zzd.zzc(j2, zzerVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j2, zzer zzerVar) {
        zzaeh.zza(j2, zzerVar, this.zzc);
    }

    public zzapq(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
    }
}
