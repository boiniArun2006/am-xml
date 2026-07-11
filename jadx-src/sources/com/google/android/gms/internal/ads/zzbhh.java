package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbhh {
    private final String zza = (String) zzbiy.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map zzd() {
        return this.zzb;
    }

    public zzbhh(Context context, String str) {
        String packageName;
        Object obj;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(CmcdData.STREAMING_FORMAT_SS, "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzv());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put(PangleCreativeInfo.f62498a, packageName);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (true == com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
            obj = "1";
        } else {
            obj = "0";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future futureZza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzy) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzy) futureZza.get()).zzk));
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmN)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.zzG(context) ? "0" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcX)).booleanValue() && !zzgrt.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzu())) {
                this.zzb.put("plugin", com.google.android.gms.ads.internal.zzt.zzh().zzu());
            }
        }
    }
}
