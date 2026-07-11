package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzboj implements zzboh {
    private final zzbok zza;

    public zzboj(zzbok zzbokVar) {
        this.zza = zzbokVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f3 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f3 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e2);
        }
        zzbok zzbokVar = this.zza;
        zzbokVar.zza(zEquals);
        zzbokVar.zzb(zEquals2, f3);
        zzcjlVar.zzaE(zEquals);
    }
}
