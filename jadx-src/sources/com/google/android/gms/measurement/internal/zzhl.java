package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhl extends LruCache {
    final /* synthetic */ zzhs zza;

    @Override // androidx.collection.LruCache
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return this.zza.zzC(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhl(zzhs zzhsVar, int i2) {
        super(20);
        Objects.requireNonNull(zzhsVar);
        this.zza = zzhsVar;
    }
}
