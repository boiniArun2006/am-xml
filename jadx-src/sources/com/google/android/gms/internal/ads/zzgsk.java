package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgsk implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzgsl zzc;

    zzgsk(zzgsl zzgslVar, Iterator it) {
        this.zzb = it;
        Objects.requireNonNull(zzgslVar);
        this.zzc = zzgslVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgrc.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        int size = collection.size();
        zzgsv zzgsvVar = this.zzc.zza;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        collection.clear();
        this.zza = null;
    }
}
