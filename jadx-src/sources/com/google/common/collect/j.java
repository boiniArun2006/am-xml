package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class j extends M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f59717n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f59718t;

    protected abstract Object n(int i2);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f59718t < this.f59717n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f59718t > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f59718t;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f59718t - 1;
    }

    protected j(int i2, int i3) {
        t1.Xo.r(i3, i2);
        this.f59717n = i2;
        this.f59718t = i3;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i2 = this.f59718t;
            this.f59718t = i2 + 1;
            return n(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.f59718t - 1;
            this.f59718t = i2;
            return n(i2);
        }
        throw new NoSuchElementException();
    }
}
