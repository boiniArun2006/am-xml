package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzgsu extends zzgss implements List {
    final /* synthetic */ zzgsv zzf;

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgst(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgsu(zzgsv zzgsvVar, Object obj, List list, zzgss zzgssVar) {
        super(zzgsvVar, obj, list, zzgssVar);
        Objects.requireNonNull(zzgsvVar);
        this.zzf = zzgsvVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i2, obj);
        zzgsv zzgsvVar = this.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i2, collection);
        if (zAddAll) {
            int size2 = this.zzb.size();
            zzgsv zzgsvVar = this.zzf;
            zzgsvVar.zzq(zzgsvVar.zzp() + (size2 - size));
            if (size == 0) {
                zzc();
                return true;
            }
            return zAddAll;
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zza();
        return ((List) this.zzb).get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        zza();
        return new zzgst(this, i2);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i2);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        zza();
        return ((List) this.zzb).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        zza();
        List listSubList = ((List) this.zzb).subList(i2, i3);
        zzgss zzgssVar = this.zzc;
        if (zzgssVar == null) {
            zzgssVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgssVar);
    }
}
