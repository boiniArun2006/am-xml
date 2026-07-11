package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgss extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzgss zzc;
    final Collection zzd;
    final /* synthetic */ zzgsv zze;

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    final void zza() {
        zzgss zzgssVar = this.zzc;
        if (zzgssVar != null) {
            zzgssVar.zza();
            if (zzgssVar.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzgsv zzgsvVar = this.zze;
            Collection collection = (Collection) zzgsvVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    final void zzb() {
        zzgss zzgssVar = this.zzc;
        if (zzgssVar != null) {
            zzgssVar.zzb();
        } else if (this.zzb.isEmpty()) {
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzo().remove(this.zza);
        }
    }

    final void zzc() {
        zzgss zzgssVar = this.zzc;
        if (zzgssVar != null) {
            zzgssVar.zzc();
            return;
        }
        zzgsv zzgsvVar = this.zze;
        zzgsvVar.zzo().put(this.zza, this.zzb);
    }

    zzgss(zzgsv zzgsvVar, Object obj, Collection collection, zzgss zzgssVar) {
        Collection collection2;
        Objects.requireNonNull(zzgsvVar);
        this.zze = zzgsvVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzgssVar;
        if (zzgssVar == null) {
            collection2 = null;
        } else {
            collection2 = zzgssVar.zzb;
        }
        this.zzd = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + 1);
            if (zIsEmpty) {
                zzc();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (zAddAll) {
            int size2 = this.zzb.size();
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
            if (size == 0) {
                zzc();
                return true;
            }
            return zAddAll;
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzgsv zzgsvVar = this.zze;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zza();
        return new zzgsr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zza();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            this.zze.zzq(r0.zzp() - 1);
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            zzgsv zzgsvVar = this.zze;
            zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
            zzb();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zza();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zza();
        return this.zzb.toString();
    }
}
