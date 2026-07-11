package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbtl implements zzgyw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final com.google.common.util.concurrent.Xo zzb;

    zzbtl(com.google.common.util.concurrent.Xo xo, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzb = xo;
    }

    public final com.google.common.util.concurrent.Xo zzb(final Object obj) {
        return zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj2) {
                return this.zza.zzc(obj, (zzbsm) obj2);
            }
        }, zzcei.zzg);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(Object obj, zzbsm zzbsmVar) throws JSONException {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbog.zzo.zzb(string, new zzbtj(this, zzcenVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzb(this.zza, jSONObject);
        return zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final com.google.common.util.concurrent.Xo zza(Object obj) throws Exception {
        return zzb(obj);
    }
}
