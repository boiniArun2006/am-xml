package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcqw implements zzcqm {
    private final zzebf zza;

    zzcqw(zzebf zzebfVar) {
        this.zza = zzebfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkG)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
