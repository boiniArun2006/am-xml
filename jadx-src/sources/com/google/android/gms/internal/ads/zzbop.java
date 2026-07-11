package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbop implements zzboh {
    private final zzdzc zza;

    public zzbop(zzdzc zzdzcVar) {
        this.zza = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(StatsEvent.f62830z) || TextUtils.isEmpty((CharSequence) map.get(StatsEvent.f62830z))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get(StatsEvent.f62830z)), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e2);
        }
    }
}
