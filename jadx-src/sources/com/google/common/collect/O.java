package com.google.common.collect;

import com.google.common.collect.Xo;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class O {

    private static class Ml extends w6 implements SortedSet {
        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f59672n).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return iwV.mUb(this.f59672n.iterator(), this.f59673t);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new Ml(((SortedSet) this.f59672n).headSet(obj), this.f59673t);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f59672n;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f59673t.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new Ml(((SortedSet) this.f59672n).subSet(obj, obj2), this.f59673t);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new Ml(((SortedSet) this.f59672n).tailSet(obj), this.f59673t);
        }

        Ml(SortedSet sortedSet, t1.eO eOVar) {
            super(sortedSet, eOVar);
        }
    }

    public static abstract class Wre extends AbstractSet {
        /* synthetic */ Wre(j jVar) {
            this();
        }

        /* JADX INFO: renamed from: rl */
        public abstract xZD iterator();

        private Wre() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    class j extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Set f59646n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Set f59647t;

        /* JADX INFO: renamed from: com.google.common.collect.O$j$j, reason: collision with other inner class name */
        class C0793j extends com.google.common.collect.n {
            final Iterator J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final Iterator f59648O;

            C0793j() {
                this.f59648O = j.this.f59646n.iterator();
                this.J2 = j.this.f59647t.iterator();
            }

            @Override // com.google.common.collect.n
            protected Object n() {
                if (this.f59648O.hasNext()) {
                    return this.f59648O.next();
                }
                while (this.J2.hasNext()) {
                    Object next = this.J2.next();
                    if (!j.this.f59646n.contains(next)) {
                        return next;
                    }
                }
                return rl();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Set set, Set set2) {
            super(null);
            this.f59646n = set;
            this.f59647t = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f59646n.contains(obj) || this.f59647t.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f59646n.isEmpty() && this.f59647t.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public xZD iterator() {
            return new C0793j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f59646n.size();
            Iterator it = this.f59647t.iterator();
            while (it.hasNext()) {
                if (!this.f59646n.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    class n extends Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Set f59650n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Set f59651t;

        class j extends com.google.common.collect.n {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final Iterator f59652O;

            j() {
                this.f59652O = n.this.f59650n.iterator();
            }

            @Override // com.google.common.collect.n
            protected Object n() {
                while (this.f59652O.hasNext()) {
                    Object next = this.f59652O.next();
                    if (n.this.f59651t.contains(next)) {
                        return next;
                    }
                }
                return rl();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Set set, Set set2) {
            super(null);
            this.f59650n = set;
            this.f59651t = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f59650n.contains(obj) && this.f59651t.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f59650n.containsAll(collection) && this.f59651t.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f59651t, this.f59650n);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: rl */
        public xZD iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f59650n.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f59651t.contains(it.next())) {
                    i2++;
                }
            }
            return i2;
        }
    }

    static boolean gh(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean n(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static abstract class I28 extends AbstractSet {
        I28() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return O.mUb(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) t1.Xo.HI(collection));
        }
    }

    private static class w6 extends Xo.j implements Set {
        w6(Set set, t1.eO eOVar) {
            super(set, eOVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return O.n(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return O.nr(this);
        }
    }

    public static Set J2() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static HashSet KN(int i2) {
        return new HashSet(vd.n(i2));
    }

    public static Wre O(Set set, Set set2) {
        t1.Xo.ck(set, "set1");
        t1.Xo.ck(set2, "set2");
        return new n(set, set2);
    }

    public static HashSet Uo() {
        return new HashSet();
    }

    public static Wre qie(Set set, Set set2) {
        t1.Xo.ck(set, "set1");
        t1.Xo.ck(set2, "set2");
        return new j(set, set2);
    }

    public static Set rl(Set set, t1.eO eOVar) {
        if (set instanceof SortedSet) {
            return t((SortedSet) set, eOVar);
        }
        if (!(set instanceof w6)) {
            return new w6((Set) t1.Xo.HI(set), (t1.eO) t1.Xo.HI(eOVar));
        }
        w6 w6Var = (w6) set;
        return new w6((Set) w6Var.f59672n, t1.z.rl(w6Var.f59673t, eOVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet t(SortedSet sortedSet, t1.eO eOVar) {
        if (!(sortedSet instanceof w6)) {
            return new Ml((SortedSet) t1.Xo.HI(sortedSet), (t1.eO) t1.Xo.HI(eOVar));
        }
        w6 w6Var = (w6) sortedSet;
        return new Ml((SortedSet) w6Var.f59672n, t1.z.rl(w6Var.f59673t, eOVar));
    }

    static boolean mUb(Set set, Collection collection) {
        t1.Xo.HI(collection);
        if (collection instanceof psW) {
            collection = ((psW) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return iwV.Ik(set.iterator(), collection);
        }
        return gh(set, collection.iterator());
    }

    static int nr(Set set) {
        int iHashCode;
        int i2 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i2 = ~(~(i2 + iHashCode));
        }
        return i2;
    }

    public static Set xMQ() {
        return Collections.newSetFromMap(vd.KN());
    }
}
