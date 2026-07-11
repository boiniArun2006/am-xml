package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInPromise;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzeyy implements zzfav {
    private final zzfjk zza;

    @Nullable
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzeyy(zzfjk zzfjkVar, @Nullable PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfjkVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i2;
        zzbkh zzbkhVar = this.zza.zzj;
        if (zzbkhVar == null || (i2 = zzbkhVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbkhVar.zzj);
        bundle.putInt("sccg_dir", i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // com.google.android.gms.internal.ads.zzfav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        zzfjk zzfjkVar = this.zza;
        ArrayList<String> arrayList = zzfjkVar.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzdahVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzdahVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfjkVar.zzi);
        zzbkh zzbkhVar = zzfjkVar.zzj;
        if (zzbkhVar != null) {
            int i2 = zzbkhVar.zza;
            String str = V8ValueBuiltInPromise.FUNCTION_ANY;
            if (i2 > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i3 = zzbkhVar.zzh;
                String str2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "unknown" : "square" : "portrait" : "landscape" : V8ValueBuiltInPromise.FUNCTION_ANY;
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i5 = zzbkhVar.zzc;
            if (i5 != 0) {
                str = i5 != 1 ? i5 != 2 ? "unknown" : "landscape" : "portrait";
            }
            if (!"unknown".equals(str)) {
                bundle.putString("native_image_orientation", str);
            }
            bundle.putBoolean("native_multiple_images", zzbkhVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbkhVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i7 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
        if (i7 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i7);
        }
        JSONObject jSONObjectZzs = zzgVar.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfjkVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i8 = zzfjkVar.zzl;
        if (i8 > 1) {
            bundle.putInt("max_num_ads", i8);
        }
        zzbqs zzbqsVar = zzfjkVar.zzb;
        if (zzbqsVar != null) {
            String str3 = zzbqsVar.zzc;
            if (TextUtils.isEmpty(str3)) {
                int i9 = zzbqsVar.zza;
                String str4 = TtmlNode.TAG_P;
                if (i9 >= 2) {
                    int i10 = zzbqsVar.zzd;
                    if (i10 == 2 || i10 != 3) {
                        str4 = CmcdData.STREAM_TYPE_LIVE;
                    }
                    bundle.putString("ia_var", str4);
                } else {
                    int i11 = zzbqsVar.zzb;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i11);
                            sb.append(" is wrong.");
                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb.toString());
                            str4 = CmcdData.STREAM_TYPE_LIVE;
                        }
                        bundle.putString("ia_var", str4);
                    }
                }
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzno)).booleanValue() || zzbkhVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzbkhVar.zzf;
        if (zzgaVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzgaVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzgaVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzgaVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbkhVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbkhVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzdahVar.zzb);
    }
}
