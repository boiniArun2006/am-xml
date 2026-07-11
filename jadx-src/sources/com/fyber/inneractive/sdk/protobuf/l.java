package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56609a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f56611c;

    public l(s sVar) {
        this.f56611c = sVar;
        this.f56610b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56609a < this.f56610b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f56609a;
        if (i2 >= this.f56610b) {
            throw new NoSuchElementException();
        }
        this.f56609a = i2 + 1;
        return Byte.valueOf(this.f56611c.d(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
