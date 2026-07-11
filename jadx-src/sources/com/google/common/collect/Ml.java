package com.google.common.collect;

import com.google.common.collect.Wre;
import com.google.common.collect.vd;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class Ml extends com.google.common.collect.Wre implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient int f59616o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient Map f59617r;

    class C extends AbstractCollection {
        final Collection J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final C f59618O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f59619n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Collection f59621t;

        class j implements Iterator {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final Iterator f59623n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final Collection f59624t;

            j() {
                Collection collection = C.this.f59621t;
                this.f59624t = collection;
                this.f59623n = Ml.ViF(collection);
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f59623n.remove();
                Ml.ck(Ml.this);
                C.this.Uo();
            }

            void rl() {
                C.this.J2();
                if (C.this.f59621t != this.f59624t) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                rl();
                return this.f59623n.hasNext();
            }

            Iterator n() {
                rl();
                return this.f59623n;
            }

            @Override // java.util.Iterator
            public Object next() {
                rl();
                return this.f59623n.next();
            }

            j(Iterator it) {
                this.f59624t = C.this.f59621t;
                this.f59623n = it;
            }
        }

        C(Object obj, Collection collection, C c2) {
            this.f59619n = obj;
            this.f59621t = collection;
            this.f59618O = c2;
            this.J2 = c2 == null ? null : c2.nr();
        }

        void J2() {
            Collection collection;
            C c2 = this.f59618O;
            if (c2 != null) {
                c2.J2();
                if (this.f59618O.nr() != this.J2) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f59621t.isEmpty() || (collection = (Collection) Ml.this.f59617r.get(this.f59619n)) == null) {
                    return;
                }
                this.f59621t = collection;
            }
        }

        Object O() {
            return this.f59619n;
        }

        void Uo() {
            C c2 = this.f59618O;
            if (c2 != null) {
                c2.Uo();
            } else if (this.f59621t.isEmpty()) {
                Ml.this.f59617r.remove(this.f59619n);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            J2();
            return this.f59621t.equals(obj);
        }

        Collection nr() {
            return this.f59621t;
        }

        void rl() {
            C c2 = this.f59618O;
            if (c2 != null) {
                c2.rl();
            } else {
                Ml.this.f59617r.put(this.f59619n, this.f59621t);
            }
        }

        C t() {
            return this.f59618O;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            J2();
            boolean zIsEmpty = this.f59621t.isEmpty();
            boolean zAdd = this.f59621t.add(obj);
            if (zAdd) {
                Ml.HI(Ml.this);
                if (zIsEmpty) {
                    rl();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f59621t.addAll(collection);
            if (zAddAll) {
                Ml.Ik(Ml.this, this.f59621t.size() - size);
                if (size == 0) {
                    rl();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f59621t.clear();
            Ml.r(Ml.this, size);
            Uo();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            J2();
            return this.f59621t.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            J2();
            return this.f59621t.containsAll(collection);
        }

        @Override // java.util.Collection
        public int hashCode() {
            J2();
            return this.f59621t.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            J2();
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            J2();
            boolean zRemove = this.f59621t.remove(obj);
            if (zRemove) {
                Ml.ck(Ml.this);
                Uo();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f59621t.removeAll(collection);
            if (zRemoveAll) {
                Ml.Ik(Ml.this, this.f59621t.size() - size);
                Uo();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            t1.Xo.HI(collection);
            int size = size();
            boolean zRetainAll = this.f59621t.retainAll(collection);
            if (zRetainAll) {
                Ml.Ik(Ml.this, this.f59621t.size() - size);
                Uo();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            J2();
            return this.f59621t.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            J2();
            return this.f59621t.toString();
        }
    }

    private final class CN3 extends aC implements NavigableSet {
        @Override // com.google.common.collect.Ml.aC, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Ml.aC, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // com.google.common.collect.Ml.aC, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        CN3(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return Ml.this.new CN3(t().descendingMap());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z2) {
            return Ml.this.new CN3(t().headMap(obj, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return Ml.this.new CN3(t().subMap(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z2) {
            return Ml.this.new CN3(t().tailMap(obj, z2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Ml.aC
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public NavigableMap t() {
            return (NavigableMap) super.t();
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return t().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return t().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return t().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return t().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return iwV.ck(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return iwV.ck(descendingIterator());
        }
    }

    private class Dsr extends w6 implements SortedMap {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        SortedSet f59626r;

        Dsr(SortedMap sortedMap) {
            super(sortedMap);
        }

        SortedMap gh() {
            return (SortedMap) this.f59641O;
        }

        @Override // java.util.SortedMap
        public SortedMap headMap(Object obj) {
            return Ml.this.new Dsr(gh().headMap(obj));
        }

        @Override // com.google.common.collect.Ml.w6, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public SortedSet keySet() {
            SortedSet sortedSet = this.f59626r;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetXMQ = xMQ();
            this.f59626r = sortedSetXMQ;
            return sortedSetXMQ;
        }

        @Override // java.util.SortedMap
        public SortedMap subMap(Object obj, Object obj2) {
            return Ml.this.new Dsr(gh().subMap(obj, obj2));
        }

        @Override // java.util.SortedMap
        public SortedMap tailMap(Object obj) {
            return Ml.this.new Dsr(gh().tailMap(obj));
        }

        SortedSet xMQ() {
            return Ml.this.new aC(gh());
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return gh().comparator();
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return gh().firstKey();
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return gh().lastKey();
        }
    }

    private class I28 extends vd.I28 {

        class j implements Iterator {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ I28 f59628O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Map.Entry f59629n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Iterator f59630t;

            j(I28 i28, Iterator it) {
                this.f59630t = it;
                this.f59628O = i28;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f59630t.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f59630t.next();
                this.f59629n = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                t1.Xo.S(this.f59629n != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f59629n.getValue();
                this.f59630t.remove();
                Ml.r(Ml.this, collection.size());
                collection.clear();
                this.f59629n = null;
            }
        }

        I28(Map map) {
            super(map);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || rl().keySet().equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            iwV.t(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return rl().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return rl().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new j(this, rl().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) rl().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                Ml.r(Ml.this, size);
            } else {
                size = 0;
            }
            if (size <= 0) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Ml$Ml, reason: collision with other inner class name */
    private abstract class AbstractC0792Ml implements Iterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Iterator f59632n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f59634t = null;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Collection f59631O = null;
        Iterator J2 = iwV.KN();

        abstract Object n(Object obj, Object obj2);

        AbstractC0792Ml() {
            this.f59632n = Ml.this.f59617r.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f59632n.hasNext() || this.J2.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.J2.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f59632n.next();
                this.f59634t = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f59631O = collection;
                this.J2 = collection.iterator();
            }
            return n(P.n(this.f59634t), this.J2.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.J2.remove();
            Collection collection = this.f59631O;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f59632n.remove();
            }
            Ml.ck(Ml.this);
        }
    }

    private final class Wre extends Dsr implements NavigableMap {
        @Override // com.google.common.collect.Ml.Dsr, java.util.SortedMap
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // com.google.common.collect.Ml.Dsr, java.util.SortedMap
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.google.common.collect.Ml.Dsr, java.util.SortedMap
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        Wre(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return Ml.this.new Wre(gh().descendingMap());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z2) {
            return Ml.this.new Wre(gh().headMap(obj, z2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Ml.Dsr
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public NavigableSet xMQ() {
            return Ml.this.new CN3(gh());
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z2, Object obj2, boolean z3) {
            return Ml.this.new Wre(gh().subMap(obj, z2, obj2, z3));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z2) {
            return Ml.this.new Wre(gh().tailMap(obj, z2));
        }

        Map.Entry HI(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionXQ = Ml.this.XQ();
            collectionXQ.addAll((Collection) entry.getValue());
            it.remove();
            return vd.O(entry.getKey(), Ml.this.te(collectionXQ));
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = gh().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return KN(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return gh().ceilingKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Ml.Dsr
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public NavigableMap gh() {
            return (NavigableMap) super.gh();
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = gh().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return KN(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = gh().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return KN(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return gh().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = gh().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return KN(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return gh().higherKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = gh().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return KN(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = gh().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return KN(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return gh().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return HI(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return HI(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.Ml.Dsr
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }
    }

    private class aC extends I28 implements SortedSet {
        aC(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedSet headSet(Object obj) {
            return Ml.this.new aC(t().headMap(obj));
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return Ml.this.new aC(t().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return Ml.this.new aC(t().tailMap(obj));
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return t().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return t().firstKey();
        }

        @Override // java.util.SortedSet
        public Object last() {
            return t().lastKey();
        }

        SortedMap t() {
            return (SortedMap) super.rl();
        }
    }

    private class fuX extends o implements RandomAccess {
        fuX(Object obj, List list, C c2) {
            super(obj, list, c2);
        }
    }

    class j extends AbstractC0792Ml {
        @Override // com.google.common.collect.Ml.AbstractC0792Ml
        Object n(Object obj, Object obj2) {
            return obj2;
        }

        j() {
            super();
        }
    }

    class n extends AbstractC0792Ml {
        n() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Ml.AbstractC0792Ml
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Map.Entry n(Object obj, Object obj2) {
            return vd.O(obj, obj2);
        }
    }

    class o extends C implements List {

        private class j extends C.j implements ListIterator {
            j() {
                super();
            }

            public j(int i2) {
                super(o.this.KN().listIterator(i2));
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = o.this.isEmpty();
                t().add(obj);
                Ml.HI(Ml.this);
                if (zIsEmpty) {
                    o.this.rl();
                }
            }

            private ListIterator t() {
                return (ListIterator) n();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return t().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return t().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return t().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return t().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                t().set(obj);
            }
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            J2();
            return new j();
        }

        o(Object obj, List list, C c2) {
            super(obj, list, c2);
        }

        List KN() {
            return (List) nr();
        }

        @Override // java.util.List
        public void add(int i2, Object obj) {
            J2();
            boolean zIsEmpty = nr().isEmpty();
            KN().add(i2, obj);
            Ml.HI(Ml.this);
            if (zIsEmpty) {
                rl();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = KN().addAll(i2, collection);
            if (zAddAll) {
                Ml.Ik(Ml.this, nr().size() - size);
                if (size == 0) {
                    rl();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i2) {
            J2();
            return KN().get(i2);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            J2();
            return KN().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            J2();
            return KN().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i2) {
            J2();
            return new j(i2);
        }

        @Override // java.util.List
        public Object remove(int i2) {
            J2();
            Object objRemove = KN().remove(i2);
            Ml.ck(Ml.this);
            Uo();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i2, Object obj) {
            J2();
            return KN().set(i2, obj);
        }

        @Override // java.util.List
        public List subList(int i2, int i3) {
            C cT;
            J2();
            Ml ml = Ml.this;
            Object objO = O();
            List listSubList = KN().subList(i2, i3);
            if (t() == null) {
                cT = this;
            } else {
                cT = t();
            }
            return ml.fD(objO, listSubList, cT);
        }
    }

    private class w6 extends vd.CN3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final transient Map f59641O;

        class j extends vd.Ml {
            j() {
            }

            @Override // com.google.common.collect.vd.Ml, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Xo.t(w6.this.f59641O.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return w6.this.new n();
            }

            @Override // com.google.common.collect.vd.Ml
            Map rl() {
                return w6.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                Ml.this.nY(entry.getKey());
                return true;
            }
        }

        class n implements Iterator {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final Iterator f59644n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Collection f59645t;

            n() {
                this.f59644n = w6.this.f59641O.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f59644n.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f59644n.next();
                this.f59645t = (Collection) entry.getValue();
                return w6.this.KN(entry);
            }

            @Override // java.util.Iterator
            public void remove() {
                t1.Xo.S(this.f59645t != null, "no calls to next() since the last call to remove()");
                this.f59644n.remove();
                Ml.r(Ml.this, this.f59645t.size());
                this.f59645t.clear();
                this.f59645t = null;
            }
        }

        w6(Map map) {
            this.f59641O = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) vd.gh(this.f59641O, obj);
            if (collection == null) {
                return null;
            }
            return Ml.this.iF(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f59641O.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionXQ = Ml.this.XQ();
            collectionXQ.addAll(collection);
            Ml.r(Ml.this, collection.size());
            collection.clear();
            return collectionXQ;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f59641O == Ml.this.f59617r) {
                Ml.this.clear();
            } else {
                iwV.t(new n());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return vd.mUb(this.f59641O, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f59641O.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f59641O.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set keySet() {
            return Ml.this.mUb();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f59641O.size();
        }

        @Override // com.google.common.collect.vd.CN3
        protected Set t() {
            return new j();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f59641O.toString();
        }

        Map.Entry KN(Map.Entry entry) {
            Object key = entry.getKey();
            return vd.O(key, Ml.this.iF(key, (Collection) entry.getValue()));
        }
    }

    abstract Collection XQ();

    abstract Collection iF(Object obj, Collection collection);

    abstract Collection te(Collection collection);

    static /* synthetic */ int HI(Ml ml) {
        int i2 = ml.f59616o;
        ml.f59616o = i2 + 1;
        return i2;
    }

    static /* synthetic */ int Ik(Ml ml, int i2) {
        int i3 = ml.f59616o + i2;
        ml.f59616o = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator ViF(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    static /* synthetic */ int ck(Ml ml) {
        int i2 = ml.f59616o;
        ml.f59616o = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nY(Object obj) {
        Collection collection = (Collection) vd.qie(this.f59617r, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f59616o -= size;
        }
    }

    static /* synthetic */ int r(Ml ml, int i2) {
        int i3 = ml.f59616o - i2;
        ml.f59616o = i3;
        return i3;
    }

    @Override // com.google.common.collect.Wre
    Collection J2() {
        return new Wre.j();
    }

    @Override // com.google.common.collect.Wre
    Collection KN() {
        return new Wre.n();
    }

    @Override // com.google.common.collect.Wre
    Map O() {
        return new w6(this.f59617r);
    }

    @Override // com.google.common.collect.Wre
    Set Uo() {
        return new I28(this.f59617r);
    }

    final Map WPU() {
        Map map = this.f59617r;
        return map instanceof NavigableMap ? new Wre((NavigableMap) this.f59617r) : map instanceof SortedMap ? new Dsr((SortedMap) this.f59617r) : new w6(this.f59617r);
    }

    Map Z() {
        return this.f59617r;
    }

    final Set aYN() {
        Map map = this.f59617r;
        return map instanceof NavigableMap ? new CN3((NavigableMap) this.f59617r) : map instanceof SortedMap ? new aC((SortedMap) this.f59617r) : new I28(this.f59617r);
    }

    @Override // com.google.common.collect.Lu
    public void clear() {
        Iterator it = this.f59617r.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f59617r.clear();
        this.f59616o = 0;
    }

    final List fD(Object obj, List list, C c2) {
        return list instanceof RandomAccess ? new fuX(obj, list, c2) : new o(obj, list, c2);
    }

    final void g(Map map) {
        this.f59617r = map;
        this.f59616o = 0;
        for (Collection collection : map.values()) {
            t1.Xo.nr(!collection.isEmpty());
            this.f59616o += collection.size();
        }
    }

    @Override // com.google.common.collect.Lu
    public Collection get(Object obj) {
        Collection collectionS = (Collection) this.f59617r.get(obj);
        if (collectionS == null) {
            collectionS = S(obj);
        }
        return iF(obj, collectionS);
    }

    @Override // com.google.common.collect.Lu
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f59617r.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f59616o++;
            return true;
        }
        Collection collectionS = S(obj);
        if (!collectionS.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f59616o++;
        this.f59617r.put(obj, collectionS);
        return true;
    }

    @Override // com.google.common.collect.Wre
    Iterator qie() {
        return new j();
    }

    @Override // com.google.common.collect.Lu
    public int size() {
        return this.f59616o;
    }

    @Override // com.google.common.collect.Wre
    Iterator xMQ() {
        return new n();
    }

    protected Ml(Map map) {
        t1.Xo.nr(map.isEmpty());
        this.f59617r = map;
    }

    Collection S(Object obj) {
        return XQ();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public Collection n() {
        return super.n();
    }

    @Override // com.google.common.collect.Wre, com.google.common.collect.Lu
    public Collection values() {
        return super.values();
    }
}
