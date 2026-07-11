package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzemj implements zzekm {
    private final Context zza;
    private final zzdlu zzb;

    public zzemj(Context context, zzdlu zzdluVar) {
        this.zza = context;
        this.zzb = zzdluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzbvsVar.zzj(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzemi(this, zzekjVar, null), (zzbtz) zzekjVar.zzc);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e2);
            throw new zzfjr(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, AdFormat.INTERSTITIAL);
        zzdko zzdkoVarZzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(zzemeVar, null));
        zzemeVar.zzc(zzdkoVarZzd.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzdkoVarZzd.zzg());
        return zzdkoVarZzd.zzh();
    }
}
