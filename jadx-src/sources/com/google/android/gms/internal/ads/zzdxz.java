package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdxz {
    private final zzdye zza;
    private final Executor zzb;
    private final Map zzc;

    final /* synthetic */ zzdye zzc() {
        return this.zza;
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }

    public final zzdxy zza() {
        zzdxy zzdxyVar = new zzdxy(this);
        zzdxyVar.zzl();
        return zzdxyVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznb)).booleanValue()) {
            zzdxy zzdxyVarZza = zza();
            zzdxyVarZza.zzc(FileUploadManager.f61572j, "pecr");
            zzdxyVarZza.zzd();
        }
    }

    public zzdxz(zzdye zzdyeVar, Executor executor) {
        this.zza = zzdyeVar;
        this.zzc = zzdyeVar.zza();
        this.zzb = executor;
    }
}
