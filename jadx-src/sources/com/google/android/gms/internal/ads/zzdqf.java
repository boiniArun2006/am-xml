package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdqf implements zzgzl {
    final /* synthetic */ zzdqh zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcjl zzcjlVar = (zzcjl) list.get(0);
            if (zzcjlVar != null) {
                this.zza.zza(zzcjlVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgr)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "omid native display exp");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgr)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "omid native display exp");
        }
    }

    zzdqf(zzdqh zzdqhVar) {
        Objects.requireNonNull(zzdqhVar);
        this.zza = zzdqhVar;
    }
}
