package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class i1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f56579b;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        h1 h1Var = this.f56579b;
        Object obj = this.f56578a.get(i2);
        ((com.fyber.inneractive.sdk.bidder.j) h1Var).getClass();
        com.fyber.inneractive.sdk.bidder.n0 n0VarA = com.fyber.inneractive.sdk.bidder.n0.a(((Integer) obj).intValue());
        return n0VarA == null ? com.fyber.inneractive.sdk.bidder.n0.UNRECOGNIZED : n0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56578a.size();
    }

    public i1(List list, h1 h1Var) {
        this.f56578a = list;
        this.f56579b = h1Var;
    }
}
