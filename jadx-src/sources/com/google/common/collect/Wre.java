package com.google.common.collect;

import com.google.common.collect.K;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Wre implements Lu {
    private transient Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private transient Collection f59667O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient Collection f59668n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient Set f59669t;

    class j extends K.n {
        j() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Wre.this.xMQ();
        }

        @Override // com.google.common.collect.K.n
        Lu rl() {
            return Wre.this;
        }
    }

    class n extends AbstractCollection {
        n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Wre.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return Wre.this.nr(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Wre.this.qie();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return Wre.this.size();
        }
    }

    abstract Collection J2();

    abstract Collection KN();

    abstract Map O();

    abstract Set Uo();

    abstract Iterator qie();

    abstract Iterator xMQ();

    public Set mUb() {
        Set set = this.f59669t;
        if (set != null) {
            return set;
        }
        Set setUo = Uo();
        this.f59669t = setUo;
        return setUo;
    }

    @Override // com.google.common.collect.Lu
    public Collection n() {
        Collection collection = this.f59668n;
        if (collection != null) {
            return collection;
        }
        Collection collectionJ2 = J2();
        this.f59668n = collectionJ2;
        return collectionJ2;
    }

    @Override // com.google.common.collect.Lu
    public Map rl() {
        Map map = this.J2;
        if (map != null) {
            return map;
        }
        Map mapO = O();
        this.J2 = mapO;
        return mapO;
    }

    @Override // com.google.common.collect.Lu
    public Collection values() {
        Collection collection = this.f59667O;
        if (collection != null) {
            return collection;
        }
        Collection collectionKN = KN();
        this.f59667O = collectionKN;
        return collectionKN;
    }

    Wre() {
    }

    public boolean equals(Object obj) {
        return K.n(this, obj);
    }

    public boolean gh(Object obj, Iterable iterable) {
        t1.Xo.HI(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty() || !get(obj).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext() || !iwV.n(get(obj), it)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return rl().hashCode();
    }

    @Override // com.google.common.collect.Lu
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public boolean nr(Object obj) {
        Iterator it = rl().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.Lu
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) rl().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.Lu
    public boolean t(Object obj, Object obj2) {
        Collection collection = (Collection) rl().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return rl().toString();
    }
}
