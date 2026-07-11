package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhko implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    zzhko(zzhkr zzhkrVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhkrVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhkq(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
