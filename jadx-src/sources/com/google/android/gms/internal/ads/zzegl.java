package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final /* synthetic */ class zzegl implements zzfmu {
    static final /* synthetic */ zzegl zza = new zzegl();

    private /* synthetic */ zzegl() {
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
