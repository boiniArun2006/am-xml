package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzegs implements zzbss {
    zzegs() {
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzegt zzegtVar = (zzegt) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue()) {
            zzbzw zzbzwVar = zzegtVar.zzc;
            jSONObject2.put("ad_request_url", zzbzwVar.zze());
            jSONObject2.put("ad_request_post_body", zzbzwVar.zzd());
        }
        zzbzw zzbzwVar2 = zzegtVar.zzc;
        jSONObject2.put("base_url", zzbzwVar2.zzc());
        jSONObject2.put("signals", zzegtVar.zzb);
        zzegz zzegzVar = zzegtVar.zza;
        jSONObject3.put("body", zzegzVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zza().zzk(zzegzVar.zzb));
        jSONObject3.put(com.safedk.android.analytics.brandsafety.c.f61802g, zzegzVar.zza);
        jSONObject3.put("latency", zzegzVar.zzd);
        jSONObject.put(obbPUqyhtS.bidDaNV, jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbzwVar2.zzh());
        return jSONObject;
    }
}
