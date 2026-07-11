package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzijx extends AbstractList {
    private static final zzijy zzc = zzijy.zzb(zzijx.class);
    final List zza;
    final Iterator zzb;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzijw(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        List list = this.zza;
        if (list.size() > i2) {
            return list.get(i2);
        }
        Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzijy zzijyVar = zzc;
        zzijyVar.zza("potentially expensive size() call");
        zzijyVar.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }

    public zzijx(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }
}
