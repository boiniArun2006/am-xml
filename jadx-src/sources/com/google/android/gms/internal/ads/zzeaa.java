package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzeaa implements zzgzl {
    final /* synthetic */ zzeak zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        synchronized (this) {
            zzeak zzeakVar = this.zza;
            zzeakVar.zzn(true);
            zzeakVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeakVar.zzo()));
            zzeakVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzeak zzeakVar = this.zza;
            zzeakVar.zzn(true);
            zzeakVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzeakVar.zzo()));
            zzeakVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }

    zzeaa(zzeak zzeakVar) {
        Objects.requireNonNull(zzeakVar);
        this.zza = zzeakVar;
    }
}
