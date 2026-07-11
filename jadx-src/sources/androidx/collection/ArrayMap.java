package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.safedk.android.analytics.brandsafety.l;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    EntrySet J2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ValueCollection f14656o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    KeySet f14657r;

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.getSize();
        }
    }

    final class KeyIterator extends IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(ArrayMap.this.getSize());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void O(int i2) {
            ArrayMap.this.gh(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected Object t(int i2) {
            return ArrayMap.this.xMQ(i2);
        }
    }

    final class KeySet implements Set<K> {
        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = ArrayMap.this.getSize();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.xMQ(i2);
            }
            return objArr;
        }

        KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return ArrayMap.this.ty(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = ArrayMap.this.getSize() - 1; size >= 0; size--) {
                Object objXMQ = ArrayMap.this.xMQ(size);
                iHashCode += objXMQ == null ? 0 : objXMQ.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iUo = ArrayMap.this.Uo(obj);
            if (iUo < 0) {
                return false;
            }
            ArrayMap.this.gh(iUo);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return ArrayMap.this.ck(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return ArrayMap.this.Ik(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ArrayMap.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ArrayMap.HI(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.xMQ(i2);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f14660O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f14661n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f14662t = -1;

        MapIterator() {
            this.f14661n = ArrayMap.this.getSize() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f14660O) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return ContainerHelpersKt.t(entry.getKey(), ArrayMap.this.xMQ(this.f14662t)) && ContainerHelpersKt.t(entry.getValue(), ArrayMap.this.az(this.f14662t));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f14660O) {
                return ArrayMap.this.xMQ(this.f14662t);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f14660O) {
                return ArrayMap.this.az(this.f14662t);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14662t < this.f14661n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f14660O) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objXMQ = ArrayMap.this.xMQ(this.f14662t);
            Object objAz = ArrayMap.this.az(this.f14662t);
            return (objXMQ == null ? 0 : objXMQ.hashCode()) ^ (objAz != null ? objAz.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f14660O) {
                throw new IllegalStateException();
            }
            ArrayMap.this.gh(this.f14662t);
            this.f14662t--;
            this.f14661n--;
            this.f14660O = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f14660O) {
                return ArrayMap.this.qie(this.f14662t, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + l.ae + getValue();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (hasNext()) {
                this.f14662t++;
                this.f14660O = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    final class ValueCollection implements Collection<V> {
        @Override // java.util.Collection
        public Object[] toArray() {
            int size = ArrayMap.this.getSize();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.az(i2);
            }
            return objArr;
        }

        ValueCollection() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return ArrayMap.this.t(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iT = ArrayMap.this.t(obj);
            if (iT < 0) {
                return false;
            }
            ArrayMap.this.gh(iT);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = ArrayMap.this.getSize();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                if (collection.contains(ArrayMap.this.az(i2))) {
                    ArrayMap.this.gh(i2);
                    i2--;
                    size--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = ArrayMap.this.getSize();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                if (!collection.contains(ArrayMap.this.az(i2))) {
                    ArrayMap.this.gh(i2);
                    i2--;
                    size--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return ArrayMap.this.getSize();
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ArrayMap.this.az(i2);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }
    }

    final class ValueIterator extends IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(ArrayMap.this.getSize());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void O(int i2) {
            ArrayMap.this.gh(i2);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected Object t(int i2) {
            return ArrayMap.this.az(i2);
        }
    }

    public ArrayMap() {
    }

    static boolean HI(Set set, Object obj) {
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

    public ArrayMap(int i2) {
        super(i2);
    }

    @Override // java.util.Map
    public Set entrySet() {
        EntrySet entrySet = this.J2;
        if (entrySet != null) {
            return entrySet;
        }
        EntrySet entrySet2 = new EntrySet();
        this.J2 = entrySet2;
        return entrySet2;
    }

    @Override // java.util.Map
    public Set keySet() {
        KeySet keySet = this.f14657r;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet();
        this.f14657r = keySet2;
        return keySet2;
    }

    @Override // java.util.Map
    public Collection values() {
        ValueCollection valueCollection = this.f14656o;
        if (valueCollection != null) {
            return valueCollection;
        }
        ValueCollection valueCollection2 = new ValueCollection();
        this.f14656o = valueCollection2;
        return valueCollection2;
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    public boolean Ik(Collection collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(xMQ(size2))) {
                gh(size2);
            }
        }
        if (size != getSize()) {
            return true;
        }
        return false;
    }

    public boolean ck(Collection collection) {
        int size = getSize();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (size != getSize()) {
            return true;
        }
        return false;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        O(getSize() + map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    public boolean ty(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }
}
