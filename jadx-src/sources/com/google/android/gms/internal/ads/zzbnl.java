package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnl implements zzgzl {
    final /* synthetic */ zzcjl zza;

    zzbnl(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str, null, zzcjlVar.zzC() != null ? zzcjlVar.zzC().zzax : null).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }
}
