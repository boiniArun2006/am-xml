package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzefy implements zzeek {
    final /* synthetic */ zzegb zza;

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpB)).booleanValue()) {
            zzdxy zzdxyVarZza = this.zza.zzd().zza();
            zzdxyVarZza.zzc(FileUploadManager.f61572j, "ptard");
            zzdxyVarZza.zzc("ptard", "r");
            zzdxyVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(remoteException, "Preconnect Remote");
        }
    }

    zzefy(zzegb zzegbVar) {
        Objects.requireNonNull(zzegbVar);
        this.zza = zzegbVar;
    }
}
