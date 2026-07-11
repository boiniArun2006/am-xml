package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class m4 implements Set, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f48953a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f48954b = new HashSet();

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(a()) > 0) {
            this.f48953a.add(comparable);
        } else {
            this.f48953a.add(b(comparable), comparable);
        }
        return this.f48954b.add(comparable);
    }

    public Comparable b(int i2) {
        Comparable comparable = (Comparable) this.f48953a.remove(i2);
        this.f48954b.remove(comparable);
        return comparable;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iD = d((Comparable) obj);
        if (iD == -1) {
            return false;
        }
        this.f48953a.remove(iD);
        return this.f48954b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f48953a.toArray();
    }

    public int c(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f48953a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch < size() && comparableA == a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f48953a.clear();
        this.f48954b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f48954b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f48954b.containsAll(collection);
    }

    public int d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f48953a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f48953a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f48953a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f48953a.toArray(objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    public int b(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f48953a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableA = a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableA == a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f48953a.get(size);
            if (!collection.contains(comparable)) {
                this.f48953a.remove(size);
                this.f48954b.remove(comparable);
                z2 = true;
            }
        }
        return z2;
    }

    public Comparable a(int i2) {
        return (Comparable) this.f48953a.get(i2);
    }

    public void a(int i2, Comparable comparable) {
        this.f48954b.remove((Comparable) this.f48953a.get(i2));
        this.f48953a.set(i2, comparable);
        this.f48954b.add(comparable);
    }

    public Comparable a() {
        return (Comparable) this.f48953a.get(size() - 1);
    }
}
