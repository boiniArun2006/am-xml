package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzgwr implements Iterator {
    final Iterator zzb;

    abstract Object zza(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    zzgwr(Iterator it) {
        it.getClass();
        this.zzb = it;
    }
}
