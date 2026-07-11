package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Mf extends KH implements ListIterator {
    private ListIterator rl() {
        return (ListIterator) this.f59604n;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    Mf(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return rl().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return rl().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return n(rl().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return rl().previousIndex();
    }
}
