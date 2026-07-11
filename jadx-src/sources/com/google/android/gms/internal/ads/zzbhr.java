package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
public final class zzbhr {
    private final Map zza = new HashMap();
    private final zzbht zzb;

    public final zzbht zzc() {
        return this.zzb;
    }

    public final void zza(String str, @Nullable zzbhq zzbhqVar) {
        this.zza.put(str, zzbhqVar);
    }

    public final void zzb(String str, String str2, long j2) {
        Map map = this.zza;
        zzbhq zzbhqVar = (zzbhq) map.get(str2);
        String[] strArr = {str};
        if (zzbhqVar != null) {
            this.zzb.zzb(zzbhqVar, j2, strArr);
        }
        map.put(str, new zzbhq(j2, null, null));
    }

    public zzbhr(zzbht zzbhtVar) {
        this.zzb = zzbhtVar;
    }
}
