package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdyk {
    private final String zze;
    private final zzdye zzf;

    @GuardedBy
    private final List zzb = new ArrayList();

    @GuardedBy
    private boolean zzc = false;

    @GuardedBy
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(FileUploadManager.f61572j, "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(FileUploadManager.f61572j, "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(FileUploadManager.f61572j, "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put(FileUploadManager.f61572j, "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue() && !this.zzc) {
            Map mapZzg = zzg();
            mapZzg.put(FileUploadManager.f61572j, "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }

    public final synchronized void zzf() {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcF)).booleanValue() && !this.zzd) {
                Map mapZzg = zzg();
                mapZzg.put(FileUploadManager.f61572j, "init_finished");
                List list = this.zzb;
                list.add(mapZzg);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzf.zzb((Map) it.next());
                }
                this.zzd = true;
            }
        } finally {
        }
    }

    private final Map zzg() {
        Map mapZza = this.zzf.zza();
        mapZza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), 10));
        mapZza.put("tid", this.zza.zzx() ? "" : this.zze);
        return mapZza;
    }

    public zzdyk(String str, zzdye zzdyeVar) {
        this.zze = str;
        this.zzf = zzdyeVar;
    }
}
