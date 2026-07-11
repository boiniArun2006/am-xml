package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbon implements zzboh {
    private final Context zza;
    private final Map zzb;

    public zzbon(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzboh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Object obj, Map map) {
        byte b2;
        zzccq zzccqVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (!zzccqVarZzD.zza(context)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int iHashCode = str.hashCode();
        if (iHashCode != 94399) {
            if (iHashCode != 94401) {
                if (iHashCode == 94407 && str.equals("_ai")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("_ac")) {
                b2 = 0;
            }
        } else if (str.equals("_aa")) {
            b2 = 2;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    com.google.android.gms.ads.internal.zzt.zzD().zzn(context, str2);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, str2, (Map) this.zzb.get("_ai"));
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzk(context, str2, (Map) this.zzb.get("_ac"));
    }
}
