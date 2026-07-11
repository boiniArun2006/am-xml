package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdxy {
    final /* synthetic */ zzdxz zza;
    private final Map zzb;

    public final zzdxy zza(zzfiu zzfiuVar) {
        zzc("gqi", zzfiuVar.zzb);
        return this;
    }

    public final zzdxy zzb(zzfir zzfirVar) {
        zzc("aai", zzfirVar.zzw);
        zzc("request_id", zzfirVar.zzan);
        zzc("ad_format", zzfir.zza(zzfirVar.zzb));
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpI)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdxz zzdxzVar = this.zza;
        return zzdxzVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
    }

    final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    final /* synthetic */ zzdxy zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }

    @VisibleForTesting
    zzdxy(zzdxz zzdxzVar) {
        Objects.requireNonNull(zzdxzVar);
        this.zza = zzdxzVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdxy zzc(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }
}
