package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgsr implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgss zzc;

    zzgsr(zzgss zzgssVar) {
        Objects.requireNonNull(zzgssVar);
        this.zzc = zzgssVar;
        Collection collection = zzgssVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgss zzgssVar = this.zzc;
        zzgssVar.zze.zzq(r1.zzp() - 1);
        zzgssVar.zzb();
    }

    final void zza() {
        zzgss zzgssVar = this.zzc;
        zzgssVar.zza();
        if (zzgssVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    zzgsr(zzgss zzgssVar, Iterator it) {
        Objects.requireNonNull(zzgssVar);
        this.zzc = zzgssVar;
        this.zzb = zzgssVar.zzb;
        this.zza = it;
    }
}
