package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Xo {

    static class j extends AbstractCollection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Collection f59672n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final t1.eO f59673t;

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return rv6.xMQ(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            t1.Xo.nr(this.f59673t.apply(obj));
            return this.f59672n.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            lej.KN(this.f59672n, this.f59673t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (Xo.t(this.f59672n, obj)) {
                return this.f59673t.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !lej.n(this.f59672n, this.f59673t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return iwV.xMQ(this.f59672n.iterator(), this.f59673t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f59672n.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f59673t.apply(next) && collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f59672n.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f59673t.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z2 = true;
                }
            }
            return z2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f59672n.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f59673t.apply(it.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return rv6.xMQ(iterator()).toArray(objArr);
        }

        j(Collection collection, t1.eO eOVar) {
            this.f59672n = collection;
            this.f59673t = eOVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                t1.Xo.nr(this.f59673t.apply(it.next()));
            }
            return this.f59672n.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return Xo.n(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (contains(obj) && this.f59672n.remove(obj)) {
                return true;
            }
            return false;
        }
    }

    static StringBuilder rl(int i2) {
        Pl.rl(i2, "size");
        return new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
    }

    static boolean n(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static boolean t(Collection collection, Object obj) {
        t1.Xo.HI(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
