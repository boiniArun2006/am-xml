package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbnc implements zzboh {
    zzbnc() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbkf zzbkfVarZzar = zzcjlVar.zzar();
        if (zzbkfVarZzar == null || (jSONObjectZzc = zzbkfVarZzar.zzc()) == null) {
            zzcjlVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcjlVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
