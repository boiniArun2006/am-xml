package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeoe implements zzekm {
    private final Context zza;
    private final Executor zzb;
    private final zzdue zzc;

    public zzeoe(Context context, Executor executor, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        try {
            zzfjk zzfjkVar = zzfjcVar.zza.zza;
            if (zzfjkVar.zzp.zza == 3) {
                ((zzfki) zzekjVar.zzb).zzx(this.zza, zzfjkVar.zzd, zzfirVar.zzv.toString(), (zzbtz) zzekjVar.zzc);
            } else {
                ((zzfki) zzekjVar.zzb).zzv(this.zza, zzfjkVar.zzd, zzfirVar.zzv.toString(), (zzbtz) zzekjVar.zzc);
            }
        } catch (Exception e2) {
            String str = zzekjVar.zza;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdua zzduaVarZzf = this.zzc.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(new zzeod(this, zzekjVar, zzfirVar)));
        zzduaVarZzf.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzb);
        ((zzelv) zzekjVar.zzc).zzc(zzduaVarZzf.zzm());
        return zzduaVarZzf.zzh();
    }
}
