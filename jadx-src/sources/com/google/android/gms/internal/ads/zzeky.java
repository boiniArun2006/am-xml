package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeky implements zzekm {
    private final Context zza;
    private final zzctl zzb;

    zzeky(Context context, zzctl zzctlVar) {
        this.zza = context;
        this.zzb = zzctlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.zzb;
            zzbvsVar.zzo(zzfirVar.zzZ);
            zzbvsVar.zzs(zzfirVar.zzU, zzfirVar.zzv.toString(), zzfjcVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzekx(zzekjVar, null), (zzbtz) zzekjVar.zzc);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e2);
            throw new zzfjr(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzeme zzemeVar = new zzeme(zzfirVar, (zzbvs) zzekjVar.zzb, AdFormat.APP_OPEN_AD);
        zzcti zzctiVarZzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdkr(zzemeVar, null), new zzctj(zzfirVar.zzaa));
        zzemeVar.zzc(zzctiVarZzf.zzd());
        ((zzelv) zzekjVar.zzc).zzc(zzctiVarZzf.zzg());
        return zzctiVarZzf.zzh();
    }
}
