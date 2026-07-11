package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcqj {
    private final Map zza;
    private final Map zzb;

    zzcqj(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfjc zzfjcVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfja zzfjaVar : zzfjcVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfjaVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfjaVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfjaVar.zzb) != null) {
                    zzcql zzcqlVar = (zzcql) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcqlVar.zza(map3);
                }
            } else {
                ((zzcqm) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
