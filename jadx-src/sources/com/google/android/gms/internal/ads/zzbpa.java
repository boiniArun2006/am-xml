package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbpa implements zzboh {
    private final zzboz zza;

    public zzbpa(zzboz zzbozVar) {
        this.zza = zzbozVar;
    }

    public static void zzb(zzcjl zzcjlVar, zzboz zzbozVar) {
        zzcjlVar.zzab("/reward", new zzbpa(zzbozVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(FileUploadManager.f61572j);
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzcas zzcasVar = null;
        try {
            int i2 = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcasVar = new zzcas(str2, i2);
            }
        } catch (NumberFormatException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e2);
        }
        this.zza.zzb(zzcasVar);
    }
}
