package com.google.common.collect;

import com.google.common.collect.Md;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class CN3 extends AbstractCollection implements psW {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Set f59597n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient Set f59598t;

    class j extends Md.Ml {
        j() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CN3.this.O();
        }

        @Override // com.google.common.collect.Md.Ml
        psW rl() {
            return CN3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CN3.this.nr();
        }
    }

    @Override // com.google.common.collect.psW
    public abstract int M(Object obj, int i2);

    abstract Iterator O();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        M(obj, 1);
        return true;
    }

    @Override // com.google.common.collect.psW
    public abstract int eF(Object obj, int i2);

    abstract int nr();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.psW
    public boolean remove(Object obj) {
        return eF(obj, 1) > 0;
    }

    abstract Set rl();

    @Override // com.google.common.collect.psW
    public Set elementSet() {
        Set set = this.f59597n;
        if (set != null) {
            return set;
        }
        Set setRl = rl();
        this.f59597n = setRl;
        return setRl;
    }

    @Override // com.google.common.collect.psW
    public Set entrySet() {
        Set set = this.f59598t;
        if (set != null) {
            return set;
        }
        Set setT = t();
        this.f59598t = setT;
        return setT;
    }

    Set t() {
        return new j();
    }

    CN3() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        return Md.rl(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.psW
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, com.google.common.collect.psW
    public final boolean equals(Object obj) {
        return Md.O(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.psW
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return Md.KN(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return Md.xMQ(this, collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
