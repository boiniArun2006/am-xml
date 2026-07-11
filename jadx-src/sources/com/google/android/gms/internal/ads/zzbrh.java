package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzbrh implements zzboh {
    final /* synthetic */ zzbro zza;
    private final zzboh zzb;

    final /* synthetic */ zzboh zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    public zzbrh(zzbro zzbroVar, zzboh zzbohVar) {
        Objects.requireNonNull(zzbroVar);
        this.zza = zzbroVar;
        this.zzb = zzbohVar;
    }
}
