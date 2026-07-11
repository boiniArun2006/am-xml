package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnd implements zzboh {
    zzbnd() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzbkfVarZzar = zzcjlVar.zzar();
        if (zzbkfVarZzar == null || (jSONObjectZzd = zzbkfVarZzar.zzd()) == null) {
            zzcjlVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
