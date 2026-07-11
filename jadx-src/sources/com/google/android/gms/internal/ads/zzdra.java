package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }

    private final com.google.common.util.concurrent.Xo zze(com.google.common.util.concurrent.Xo xo, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(xo, new zzdqx(this, zzdxhVar), this.zza);
        }
        return xo;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.common.util.concurrent.Xo zza(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        com.google.common.util.concurrent.Xo xoZza;
        JSONArray jSONArrayOptJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final com.google.common.util.concurrent.Xo xoSubmit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzb(zzfjcVar, zzfirVar, jSONObject);
            }
        });
        zze(xoSubmit, zzdxh.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrp zzdrpVar = this.zzb;
        final com.google.common.util.concurrent.Xo xoZzb = zzdrpVar.zzb(jSONObject, "images", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(xoZzb, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        final com.google.common.util.concurrent.Xo xoZzc = zzdrpVar.zzc(jSONObject, "images", zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(xoZzc, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final com.google.common.util.concurrent.Xo xoZza2 = zzdrpVar.zza(jSONObject, "secondary_image", zzdxh.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(xoZza2, zzdxh.NATIVE_ASSETS_LOADING_LOGO_END);
        final com.google.common.util.concurrent.Xo xoZza3 = zzdrpVar.zza(jSONObject, "app_icon", zzdxh.NATIVE_ASSETS_LOADING_ICON_START);
        zze(xoZza3, zzdxh.NATIVE_ASSETS_LOADING_ICON_END);
        final com.google.common.util.concurrent.Xo xoZzd = zzdrpVar.zzd(jSONObject, "attribution", zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(xoZzd, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final com.google.common.util.concurrent.Xo xoZzg = zzdrpVar.zzg(jSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(xoZzg, zzdxh.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzow)).booleanValue() && jSONObject.has("video")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
            if (jSONObjectOptJSONObject.has("flags") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("flags")) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= jSONArrayOptJSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i2++;
                    } else {
                        try {
                            if (Integer.parseInt(jSONObjectOptJSONObject2.optString("value")) == 3) {
                                xoZza = this.zzb.zzf(xoZzg);
                                zze(xoZza, zzdxh.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                xoZza = zzgzo.zza(new Bundle());
            }
        } else {
            xoZza = zzgzo.zza(new Bundle());
        }
        final com.google.common.util.concurrent.Xo xoZza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(xoZza4, zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final com.google.common.util.concurrent.Xo xoZze = this.zzb.zze(jSONObject, zzbVar, zzcceVar);
        zze(xoZze, zzdxh.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(xoSubmit);
        arrayList.add(xoZzb);
        arrayList.add(xoZzc);
        arrayList.add(xoZza2);
        arrayList.add(xoZza3);
        arrayList.add(xoZzd);
        arrayList.add(xoZzg);
        arrayList.add(xoZza);
        arrayList.add(xoZza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(xoZze);
        }
        final com.google.common.util.concurrent.Xo xo = xoZza;
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(xoSubmit, xoZzb, xoZza3, xoZza2, xoZzd, jSONObject, xoZzg, xo, xoZzc, xoZze, xoZza4);
            }
        }, this.zza);
    }

    final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) throws zzenv {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int iZzx = zzdohVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(iZzx);
            throw new zzenv(1, sb.toString());
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length());
            sb2.append(strZzD);
            sb2.append(" : ");
            sb2.append(strOptString);
            strOptString = sb2.toString();
        }
        zzdohVar.zzs("headline", strOptString);
        zzdohVar.zzs("body", jSONObject.optString("body", null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs("store", jSONObject.optString("store", null));
        zzdohVar.zzs("price", jSONObject.optString("price", null));
        zzdohVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdohVar;
    }

    final /* synthetic */ zzdoh zzc(com.google.common.util.concurrent.Xo xo, com.google.common.util.concurrent.Xo xo2, com.google.common.util.concurrent.Xo xo3, com.google.common.util.concurrent.Xo xo4, com.google.common.util.concurrent.Xo xo5, JSONObject jSONObject, com.google.common.util.concurrent.Xo xo6, com.google.common.util.concurrent.Xo xo7, com.google.common.util.concurrent.Xo xo8, com.google.common.util.concurrent.Xo xo9, com.google.common.util.concurrent.Xo xo10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdoh zzdohVar = (zzdoh) xo.get();
        zzdohVar.zzd((List) xo2.get());
        zzdohVar.zzj((zzbks) xo3.get());
        zzdohVar.zzk((zzbks) xo4.get());
        zzdohVar.zzc((zzbkl) xo5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) xo6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) xo7.get());
        zzcjl zzcjlVar2 = (zzcjl) xo8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) xo9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(xo9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) xo10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }
}
