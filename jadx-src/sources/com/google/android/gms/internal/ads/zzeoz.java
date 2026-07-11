package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeoz implements zzekm {
    private final Context zza;
    private final Executor zzb;
    private final zzdue zzc;

    public zzeoz(Context context, Executor executor, zzdue zzdueVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdueVar;
    }

    final /* synthetic */ Executor zzc() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) {
        try {
            ((zzfki) zzekjVar.zzb).zzl(zzfjcVar.zza.zza.zzd, zzfirVar.zzv.toString());
        } catch (Exception e2) {
            String str = zzekjVar.zza;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.zzb;
        if (zzfkiVar.zzn()) {
            zze(zzfjcVar, zzfirVar, zzekjVar);
            return;
        }
        zzeow zzeowVar = new zzeow(this, zzfjcVar, zzfirVar, zzekjVar);
        zzdcp zzdcpVar = zzekjVar.zzc;
        ((zzelw) zzdcpVar).zzd(zzeowVar);
        Context context = this.zza;
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        String string = zzfirVar.zzv.toString();
        zzfkiVar.zzk(context, zzfjkVar.zzd, null, (zzcar) zzdcpVar, string);
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final /* bridge */ /* synthetic */ Object zzb(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr, zzenv {
        zzdua zzduaVarZzf = this.zzc.zzf(new zzcwv(zzfjcVar, zzfirVar, zzekjVar.zza), new zzdub(new zzeox(this, zzekjVar, zzfirVar)));
        zzduaVarZzf.zza().zzq(new zzcrl((zzfki) zzekjVar.zzb), this.zzb);
        zzdcm zzdcmVarZzb = zzduaVarZzf.zzb();
        zzdbd zzdbdVarZzc = zzduaVarZzf.zzc();
        ((zzelw) zzekjVar.zzc).zzc(new zzeoy(this, zzduaVarZzf.zzi(), zzdbdVarZzc, zzdcmVarZzb, zzduaVarZzf.zzk()));
        return zzduaVarZzf.zzh();
    }
}
