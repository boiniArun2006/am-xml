package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgsl extends zzgvj {
    final /* synthetic */ zzgsv zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgsk(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzgsv zzgsvVar = this.zza;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        return size > 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgsl(zzgsv zzgsvVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgsvVar);
        this.zza = zzgsvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzguy.zzb(iterator());
    }
}
