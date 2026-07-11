package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzful {
    private JSONObject zza;
    private final zzfuu zzb;

    public zzful(zzfuu zzfuuVar) {
        this.zzb = zzfuuVar;
    }

    @VisibleForTesting
    public final JSONObject zzd() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.zzb.zza(new zzfux(this, hashSet, jSONObject, j2));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.zzb.zza(new zzfuw(this, hashSet, jSONObject, j2));
    }

    public final void zzc() {
        this.zzb.zza(new zzfuv(this));
    }
}
