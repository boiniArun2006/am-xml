package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzctd implements zzikg {
    private final zzikp zza;

    private zzctd(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzctd zza(zzikp zzikpVar) {
        return new zzctd(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcww) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
