package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzemu implements zzekm {
    private final Context zza;
    private final zzdmq zzb;
    private final Executor zzc;

    public zzemu(Context context, zzdmq zzdmqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdmqVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfjc zzfjcVar, int i2) {
        return zzfjcVar.zza.zza.zzh.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String string = zzfirVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfirVar.zzs);
        zzfkiVar.zzo(this.zza, zzfjkVar.zzd, string, strZzm, (zzbtz) zzekjVar.zzc, zzfjkVar.zzj, zzfjkVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdoh zzdohVarZzag;
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        zzbue zzbueVarZzD = zzfkiVar.zzD();
        zzbuf zzbufVarZzE = zzfkiVar.zzE();
        zzbui zzbuiVarZzu = zzfkiVar.zzu();
        if (zzbuiVarZzu != null && zzc(zzfjcVar, 6)) {
            zzdohVarZzag = zzdoh.zzaf(zzbuiVarZzu);
        } else if (zzbueVarZzD != null && zzc(zzfjcVar, 6)) {
            zzdohVarZzag = zzdoh.zzai(zzbueVarZzD);
        } else if (zzbueVarZzD != null && zzc(zzfjcVar, 2)) {
            zzdohVarZzag = zzdoh.zzah(zzbueVarZzD);
        } else if (zzbufVarZzE != null && zzc(zzfjcVar, 6)) {
            zzdohVarZzag = zzdoh.zzaj(zzbufVarZzE);
        } else {
            if (zzbufVarZzE == null || !zzc(zzfjcVar, 1)) {
                throw new zzenv(1, "No native ad mappers");
            }
            zzdohVarZzag = zzdoh.zzag(zzbufVarZzE);
        }
        if (zzdohVarZzag != null) {
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzh.contains(Integer.toString(zzdohVarZzag.zzx()))) {
                zzdoj zzdojVarZze = this.zzb.zze(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdos(zzdohVarZzag), new zzdql(zzbufVarZzE, zzbueVarZzD, zzbuiVarZzu));
                ((zzelv) zzekjVar.zzc).zzc(zzdojVarZze.zzf());
                zzdojVarZze.zza().zzq(new zzcrl(zzfkiVar), this.zzc);
                return zzdojVarZze.zzh();
            }
        }
        throw new zzenv(1, "No corresponding native ad listener");
    }
}
