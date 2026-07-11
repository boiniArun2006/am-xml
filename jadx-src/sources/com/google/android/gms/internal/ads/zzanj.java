package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzanj implements zzama {
    private final zzanc zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    @Override // com.google.android.gms.internal.ads.zzama
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final long zzb(int i2) {
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final List zzc(long j2) {
        return this.zza.zzh(j2, this.zzc, this.zzd, this.zze);
    }

    public zzanj(zzanc zzancVar, Map map, Map map2, Map map3) {
        this.zza = zzancVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzancVar.zzg();
    }
}
