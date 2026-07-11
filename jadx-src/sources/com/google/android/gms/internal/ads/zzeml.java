package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzeml implements zzeki {
    private final zzdvp zza;

    public zzeml(zzdvp zzdvpVar) {
        this.zza = zzdvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeki
    @Nullable
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        return new zzekj(this.zza.zza(str, jSONObject), new zzelv(), str);
    }
}
