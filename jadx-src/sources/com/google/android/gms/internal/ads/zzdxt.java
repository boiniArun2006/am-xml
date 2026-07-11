package com.google.android.gms.internal.ads;

import aT.dE.JLZo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.mediation.AppLovinUtils;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.safedk.android.analytics.brandsafety.l;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdxt {
    private final ConcurrentHashMap zza;
    private final zzcdz zzb;
    private final zzfjk zzc;
    private final String zzd;
    private final String zze;
    private final zzazh zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public final Map zzc() {
        return this.zza;
    }

    public final Bundle zze() {
        return this.zzg;
    }

    public final void zza(zzfjc zzfjcVar) {
        zzfjb zzfjbVar = zzfjcVar.zzb;
        List list = zzfjbVar.zza;
        if (!list.isEmpty()) {
            int i2 = ((zzfir) list.get(0)).zzb;
            zzd("ad_format", zzfir.zza(i2));
            if (i2 == 6) {
                this.zza.put(JLZo.tbAnyQSqfYNEx, true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            zzd(l.f62649d, Integer.toString(list.size()));
        }
        zzd("gqi", zzfjbVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(l.f62637R)) {
            zzd("network_coarse", Integer.toString(bundle.getInt(l.f62637R)));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoL)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkX)).booleanValue()) {
            zzazc zzazcVarZzb = this.zzf.zzb();
            if (zzazcVarZzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzazcVarZzb).zzc());
            } else if (zzazcVarZzb instanceof zzclz) {
                this.zza.put("asv", ((zzclz) zzazcVarZzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }

    public zzdxt(Context context, zzdye zzdyeVar, zzcdz zzcdzVar, zzfjk zzfjkVar, String str, String str2, zzazh zzazhVar) {
        ActivityManager.MemoryInfo memoryInfoZze;
        String str3;
        ConcurrentHashMap concurrentHashMapZzd = zzdyeVar.zzd();
        this.zza = concurrentHashMapZzd;
        this.zzb = zzcdzVar;
        this.zzc = zzfjkVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzazhVar;
        this.zzh = context;
        concurrentHashMapZzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcS)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoZze.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                if (true != memoryInfoZze.lowMemory) {
                    str3 = "0";
                } else {
                    str3 = "1";
                }
                zzd("low_m", str3);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcU)).booleanValue()) {
            zzd(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, zzfjkVar.zzg);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            return;
        }
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
        if (iZzg != 0) {
            if (iZzg != 1) {
                if (iZzg != 2) {
                    if (iZzg != 3) {
                        concurrentHashMapZzd.put("se", "r_both");
                    } else {
                        concurrentHashMapZzd.put("se", "r_adstring");
                    }
                } else {
                    concurrentHashMapZzd.put("se", "r_adinfo");
                }
            } else {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("se", "query_g");
            }
            concurrentHashMapZzd.put("scar", "true");
            zzd("ragent", zzfjkVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfjkVar.zzd)));
            return;
        }
        concurrentHashMapZzd.put("request_id", str);
        concurrentHashMapZzd.put("scar", V8ValueBoolean.FALSE);
    }

    public final void zzd(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }
}
