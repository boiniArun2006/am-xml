package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnf implements zzboh {
    zzbnf() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgpp zzgppVarZzl = zzgpq.zzl();
        zzgppVarZzl.zzb((String) map.get("appId"));
        zzgppVarZzl.zzg(zzcjlVar.getWidth());
        zzgppVarZzl.zza(zzcjlVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgppVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgppVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgppVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgppVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgppVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzt().zzc(zzcjlVar, zzgppVarZzl.zzi());
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
