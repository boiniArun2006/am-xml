package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdnr implements zzbde {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdoc zzb;

    zzdnr(zzdoc zzdocVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdocVar);
        this.zzb = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcp)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbddVar.zzj) {
                        zzdoc zzdocVar = this.zzb;
                        if (zzdocVar.zzaa() != null) {
                            zzdocVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdocVar.zzaa() == null) {
                                return;
                            } else {
                                zzdocVar.zzu(zzdocVar.zzaa().zzdE(), zzdocVar.zzaa().zzj(), zzdocVar.zzaa().zzk(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzbddVar.zzj) {
            zzdoc zzdocVar2 = this.zzb;
            if (zzdocVar2.zzaa() != null) {
                zzdocVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdocVar2.zzaa() == null) {
                    return;
                }
                zzdocVar2.zzu(zzdocVar2.zzaa().zzdE(), zzdocVar2.zzaa().zzj(), zzdocVar2.zzaa().zzk(), true);
            }
        }
    }
}
