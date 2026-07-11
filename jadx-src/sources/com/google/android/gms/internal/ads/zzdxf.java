package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewFeature;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdxf implements zzdel, zzdct, zzdbi, zzdjy {
    private final zzdxt zza;
    private final zzdye zzb;
    private final int zzc;

    zzdxf(zzdxt zzdxtVar, zzdye zzdyeVar, int i2) {
        this.zza = zzdxtVar;
        this.zzb = zzdyeVar;
        this.zzc = i2;
    }

    private final void zzc(Bundle bundle, zzguf zzgufVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdxh.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdxtVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgufVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzdxi zzdxiVar = (zzdxi) zzgufVar.get(i2);
            long j2 = bundle.getLong(zzdxiVar.zzb().zza(), -1L);
            long j3 = bundle.getLong(zzdxiVar.zzc().zza(), -1L);
            if (j2 > 0 && j3 > 0) {
                zzdxtVar.zzd(zzdxiVar.zza(), String.valueOf(j3 - j2));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdxtVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdxtVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j2 = bundle.getLong(str);
            if (j2 >= 0) {
                this.zza.zzd(str, String.valueOf(j2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbjVar == null) {
                zzdxt zzdxtVar = this.zza;
                zzdxtVar.zzc().put(FileUploadManager.f61572j, "sgs");
                zzdxtVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdxtVar.zzc());
                return;
            }
            zzbzu zzbzuVar = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbzuVar != null) {
                zzc(zzbzuVar.zzm, zzdxi.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdxi.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                zzdxt zzdxtVar2 = this.zza;
                zzdxtVar2.zzc().put(FileUploadManager.f61572j, "sgs");
                Map mapZzc = zzdxtVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzle)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e2) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e2);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzbzu zzbzuVar2 = zzbjVar.zzd;
                if (zzbzuVar2 != null) {
                    this.zza.zzb(zzbzuVar2.zza);
                }
                zzdxt zzdxtVar3 = this.zza;
                zzdxtVar3.zzg();
                this.zzb.zzb(zzdxtVar3.zzc());
            } catch (JSONException unused) {
                zzdxt zzdxtVar4 = this.zza;
                zzdxtVar4.zzc().put(FileUploadManager.f61572j, "sgf");
                zzdxtVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdxtVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put(FileUploadManager.f61572j, "ftl");
        zzdxtVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdxtVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzig)).booleanValue()) {
            zzdxtVar.zzd("emsg", zzeVar.zzb);
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        this.zza.zzb(zzbzuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        this.zza.zza(zzfjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzc().put(FileUploadManager.f61572j, "sgf");
            zzdxtVar.zzd("sgf_reason", str);
            zzdxtVar.zzg();
            this.zzb.zzb(zzdxtVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put(FileUploadManager.f61572j, "loaded");
        zzc(zzdxtVar.zze(), zzdxi.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoc)).booleanValue()) {
            zzdxtVar.zzc().put("mafe", true != WebViewFeature.n("MUTE_AUDIO") ? "0" : "1");
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }
}
