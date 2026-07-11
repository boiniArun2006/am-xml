package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfjs implements zzgzl {
    final /* synthetic */ zzcjl zza;
    final /* synthetic */ zzcrv zzb;
    final /* synthetic */ zzfqk zzc;
    final /* synthetic */ zzeiu zzd;

    zzfjs(zzcjl zzcjlVar, zzcrv zzcrvVar, zzfqk zzfqkVar, zzeiu zzeiuVar) {
        this.zza = zzcjlVar;
        this.zzb = zzcrvVar;
        this.zzc = zzfqkVar;
        this.zzd = zzeiuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrv zzcrvVar;
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        zzfir zzfirVarZzC = zzcjlVar.zzC();
        if (zzfirVarZzC != null && !zzfirVarZzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfirVarZzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzb) != null && zzcrv.zzc(str)) {
                zzcrvVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfiu zzfiuVarZzaC = zzcjlVar.zzaC();
        if (zzfiuVarZzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcjlVar.getContext());
        boolean z2 = false;
        boolean z3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhh)).booleanValue() && zzfirVarZzC != null && zzfirVarZzC.zzS;
        if (zzfirVarZzC != null && zzfirVarZzC.zzad != null) {
            z2 = true;
        }
        this.zzd.zze(new zzeiw(jCurrentTimeMillis, zzfiuVarZzaC.zzb, str, (zZzs || z3 || z2) ? 2 : 1));
    }
}
