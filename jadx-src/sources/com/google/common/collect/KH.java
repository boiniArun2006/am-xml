package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class KH implements Iterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Iterator f59604n;

    abstract Object n(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f59604n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return n(this.f59604n.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f59604n.remove();
    }

    KH(Iterator it) {
        this.f59604n = (Iterator) t1.Xo.HI(it);
    }
}
