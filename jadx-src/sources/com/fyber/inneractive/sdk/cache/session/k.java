package com.fyber.inneractive.sdk.cache.session;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class k extends PriorityQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53212a;

    public k(int i2) {
        super(1, new l());
        this.f53212a = i2;
    }

    @Override // java.util.PriorityQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(g gVar) {
        boolean zAdd = super.add(gVar);
        if (super.size() > this.f53212a) {
            poll();
        }
        return zAdd;
    }
}
