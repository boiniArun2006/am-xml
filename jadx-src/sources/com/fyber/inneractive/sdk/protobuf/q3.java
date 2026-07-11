package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class q3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f56646a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56646a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f56646a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public q3(r3 r3Var) {
        this.f56646a = r3Var.f56653a.iterator();
    }
}
