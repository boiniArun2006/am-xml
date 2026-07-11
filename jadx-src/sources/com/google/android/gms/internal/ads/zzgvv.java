package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgvv extends zzgse {
    final transient zzgru zza;

    @Override // com.google.android.gms.internal.ads.zzgse, com.google.android.gms.internal.ads.zzgsv
    protected final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    zzgvv(Map map, zzgru zzgruVar) {
        super(map);
        this.zza = zzgruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv, com.google.android.gms.internal.ads.zzgsy
    final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgsv, com.google.android.gms.internal.ads.zzgsy
    final Map zzl() {
        return zzm();
    }
}
