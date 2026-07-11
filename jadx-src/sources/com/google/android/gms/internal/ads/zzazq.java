package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzazq extends zzaxz {
    public long zza;
    public long zzb;

    public zzazq() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzazq(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap mapZzb = zzaxz.zzb(str);
        if (mapZzb != null) {
            this.zza = ((Long) mapZzb.get(0)).longValue();
            this.zzb = ((Long) mapZzb.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    protected final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.zza));
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }
}
