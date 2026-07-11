package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Q extends ci implements Collection {
    protected abstract Collection t();

    @Override // java.util.Collection
    public abstract Object[] toArray(Object[] objArr);

    protected Q() {
    }

    protected Object[] J2() {
        return toArray(new Object[size()]);
    }

    protected Object[] Uo(Object[] objArr) {
        return AbstractC1897m.J2(this, objArr);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        return t().add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        return t().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        t().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return t().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return t().containsAll(collection);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return t().isEmpty();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return t().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return t().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return t().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return t().size();
    }
}
