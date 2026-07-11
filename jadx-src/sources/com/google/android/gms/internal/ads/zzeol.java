package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeol implements zzeki {
    private final Map zza = new HashMap();
    private final zzdvp zzb;

    @Override // com.google.android.gms.internal.ads.zzeki
    @Nullable
    public final zzekj zza(String str, JSONObject jSONObject) throws zzfjr {
        zzekj zzekjVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzekjVar = (zzekj) map.get(str);
                if (zzekjVar == null) {
                    zzekjVar = new zzekj(this.zzb.zza(str, jSONObject), new zzelw(), str);
                    map.put(str, zzekjVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzekjVar;
    }

    public zzeol(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }
}
