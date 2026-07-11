package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgse extends zzgsv implements zzgva {
    @Override // com.google.android.gms.internal.ads.zzgsv
    /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    protected zzgse(Map map) {
        super(map);
    }
}
