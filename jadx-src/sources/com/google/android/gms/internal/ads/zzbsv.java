package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final /* synthetic */ class zzbsv implements zzbsr {
    static final /* synthetic */ zzbsv zza = new zzbsv();

    private /* synthetic */ zzbsv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final /* synthetic */ Object zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
    }
}
