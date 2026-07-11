package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzbxy {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbxy(boolean z2, String str, boolean z3) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = z3;
    }

    @Nullable
    public static zzbxy zza(JSONObject jSONObject) {
        return new zzbxy(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
