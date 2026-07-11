package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeoh implements zzekm {
    private final Context zza;
    private final zzdue zzb;

    public zzeoh(Context context, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzp.zza == 3) {
                zzbvsVar.zzp(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjkVar.zzd, ObjectWrapper.wrap(this.zza), new zzeog(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
            } else {
                zzbvsVar.zzl(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjkVar.zzd, ObjectWrapper.wrap(this.zza), new zzeog(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, AdFormat.REWARDED);
        zzdua zzduaVarZzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(zzemeVar));
        zzemeVar.zzc(zzduaVarZzf.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzduaVarZzf.zzn());
        return zzduaVarZzf.zzh();
    }
}
