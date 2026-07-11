package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.common.util.concurrent.Xo;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzbh implements zzgyw {
    private final Executor zza;
    private final zzedt zzb;

    public zzbh(Executor executor, zzedt zzedtVar) {
        this.zza = executor;
        this.zzb = zzedtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ Xo zza(Object obj) throws Exception {
        final zzbzu zzbzuVar = (zzbzu) obj;
        return zzgzo.zzj(this.zzb.zza(zzbzuVar), new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ Xo zza(Object obj2) {
                zzefg zzefgVar = (zzefg) obj2;
                zzbj zzbjVar = new zzbj(new JsonReader(new InputStreamReader(zzefgVar.zza())), zzefgVar.zzb());
                zzbzu zzbzuVar2 = zzbzuVar;
                try {
                    zzbjVar.zzb = com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzbzuVar2.zza).toString();
                } catch (JSONException unused) {
                    zzbjVar.zzb = JsonUtils.EMPTY_JSON;
                }
                Bundle bundle = zzbzuVar2.zzn;
                if (!bundle.isEmpty()) {
                    try {
                        zzbjVar.zzc = com.google.android.gms.ads.internal.client.zzbb.zza().zzm(bundle).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return zzgzo.zza(zzbjVar);
            }
        }, this.zza);
    }
}
