package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.FieldSet;
import com.safedk.android.analytics.brandsafety.l;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private volatile EntrySet J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f38141O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f38142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile DescendingEntrySet f38143o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f38144r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f38145t;

    private class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f38147n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Iterator f38148t;

        private DescendingEntryIterator() {
            this.f38147n = SmallSortedMap.this.f38142n.size();
        }

        private Iterator n() {
            if (this.f38148t == null) {
                this.f38148t = SmallSortedMap.this.f38144r.entrySet().iterator();
            }
            return this.f38148t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f38147n;
            return (i2 > 0 && i2 <= SmallSortedMap.this.f38142n.size()) || n().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!n().hasNext()) {
                List list = SmallSortedMap.this.f38142n;
                int i2 = this.f38147n - 1;
                this.f38147n = i2;
                return (Map.Entry) list.get(i2);
            }
            return (Map.Entry) n().next();
        }
    }

    private class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new DescendingEntryIterator();
        }
    }

    private class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Comparable f38151n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Object f38152t;

        Entry(SmallSortedMap smallSortedMap, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return rl(this.f38151n, entry.getKey()) && rl(this.f38152t, entry.getValue());
        }

        Entry(Comparable comparable, Object obj) {
            this.f38151n = comparable;
            this.f38152t = obj;
        }

        private boolean rl(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f38152t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f38151n;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f38152t;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            SmallSortedMap.this.mUb();
            Object obj2 = this.f38152t;
            this.f38152t = obj;
            return obj2;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f38151n;
        }

        public String toString() {
            return this.f38151n + l.ae + this.f38152t;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(Entry entry) {
            return getKey().compareTo(entry.getKey());
        }
    }

    private class EntryIterator implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Iterator f38153O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f38154n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f38155t;

        private EntryIterator() {
            this.f38154n = -1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f38155t = true;
            int i2 = this.f38154n + 1;
            this.f38154n = i2;
            return i2 < SmallSortedMap.this.f38142n.size() ? (Map.Entry) SmallSortedMap.this.f38142n.get(this.f38154n) : (Map.Entry) n().next();
        }

        private Iterator n() {
            if (this.f38153O == null) {
                this.f38153O = SmallSortedMap.this.f38145t.entrySet().iterator();
            }
            return this.f38153O;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38154n + 1 < SmallSortedMap.this.f38142n.size() || (!SmallSortedMap.this.f38145t.isEmpty() && n().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f38155t) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f38155t = false;
            SmallSortedMap.this.mUb();
            if (this.f38154n >= SmallSortedMap.this.f38142n.size()) {
                n().remove();
                return;
            }
            SmallSortedMap smallSortedMap = SmallSortedMap.this;
            int i2 = this.f38154n;
            this.f38154n = i2 - 1;
            smallSortedMap.S(i2);
        }
    }

    private class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            SmallSortedMap.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (!contains(entry)) {
                SmallSortedMap.this.put((Comparable) entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int iTy = ty();
        if (iTy != smallSortedMap.ty()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i2 = 0; i2 < iTy; i2++) {
            if (!az(i2).equals(smallSortedMap.az(i2))) {
                return false;
            }
        }
        if (iTy != size) {
            return this.f38145t.equals(smallSortedMap.f38145t);
        }
        return true;
    }

    private SmallSortedMap() {
        this.f38142n = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f38145t = map;
        this.f38144r = map;
    }

    static SmallSortedMap Z() {
        return new SmallSortedMap<FieldSet.FieldDescriptorLite<Object>, Object>() { // from class: androidx.datastore.preferences.protobuf.SmallSortedMap.1
            @Override // androidx.content.preferences.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((Comparable) obj, obj2);
            }

            @Override // androidx.content.preferences.protobuf.SmallSortedMap
            public void o() {
                if (!r()) {
                    for (int i2 = 0; i2 < ty(); i2++) {
                        Map.Entry entryAz = az(i2);
                        if (((FieldSet.FieldDescriptorLite) entryAz.getKey()).isRepeated()) {
                            entryAz.setValue(Collections.unmodifiableList((List) entryAz.getValue()));
                        }
                    }
                    for (Map.Entry entry : ck()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.o();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mUb() {
        if (this.f38141O) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int xMQ(Comparable comparable) {
        int i2;
        int i3;
        int size = this.f38142n.size();
        int i5 = size - 1;
        if (i5 < 0) {
            i2 = 0;
            while (i2 <= i5) {
                int i7 = (i2 + i5) / 2;
                int iCompareTo = comparable.compareTo(((Entry) this.f38142n.get(i7)).getKey());
                if (iCompareTo < 0) {
                    i5 = i7 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i7;
                    }
                    i2 = i7 + 1;
                }
            }
            i3 = i2 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Entry) this.f38142n.get(i5)).getKey());
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i2 = 0;
                while (i2 <= i5) {
                }
                i3 = i2 + 1;
            }
        }
        return -i3;
    }

    public int HI() {
        return this.f38145t.size();
    }

    public Map.Entry az(int i2) {
        return (Map.Entry) this.f38142n.get(i2);
    }

    public Iterable ck() {
        return this.f38145t.isEmpty() ? Collections.EMPTY_SET : this.f38145t.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return xMQ(comparable) >= 0 || this.f38145t.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.J2 == null) {
            this.J2 = new EntrySet();
        }
        return this.J2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iXMQ = xMQ(comparable);
        return iXMQ >= 0 ? ((Entry) this.f38142n.get(iXMQ)).getValue() : this.f38145t.get(comparable);
    }

    Set gh() {
        if (this.f38143o == null) {
            this.f38143o = new DescendingEntrySet();
        }
        return this.f38143o;
    }

    public void o() {
        if (this.f38141O) {
            return;
        }
        this.f38145t = this.f38145t.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f38145t);
        this.f38144r = this.f38144r.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f38144r);
        this.f38141O = true;
    }

    public boolean r() {
        return this.f38141O;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f38142n.size() + this.f38145t.size();
    }

    public int ty() {
        return this.f38142n.size();
    }

    private SortedMap Ik() {
        mUb();
        if (this.f38145t.isEmpty() && !(this.f38145t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f38145t = treeMap;
            this.f38144r = treeMap.descendingMap();
        }
        return (SortedMap) this.f38145t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object S(int i2) {
        mUb();
        Object value = ((Entry) this.f38142n.remove(i2)).getValue();
        if (!this.f38145t.isEmpty()) {
            Iterator it = Ik().entrySet().iterator();
            this.f38142n.add(new Entry(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private void qie() {
        mUb();
        if (this.f38142n.isEmpty() && !(this.f38142n instanceof ArrayList)) {
            this.f38142n = new ArrayList(16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public Object put(Comparable comparable, Object obj) {
        mUb();
        int iXMQ = xMQ(comparable);
        if (iXMQ >= 0) {
            return ((Entry) this.f38142n.get(iXMQ)).setValue(obj);
        }
        qie();
        int i2 = -(iXMQ + 1);
        if (i2 >= 16) {
            return Ik().put(comparable, obj);
        }
        if (this.f38142n.size() == 16) {
            Entry entry = (Entry) this.f38142n.remove(15);
            Ik().put(entry.getKey(), entry.getValue());
        }
        this.f38142n.add(i2, new Entry(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        mUb();
        if (!this.f38142n.isEmpty()) {
            this.f38142n.clear();
        }
        if (!this.f38145t.isEmpty()) {
            this.f38145t.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iTy = ty();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iTy; i2++) {
            iHashCode += ((Entry) this.f38142n.get(i2)).hashCode();
        }
        if (HI() > 0) {
            return iHashCode + this.f38145t.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        mUb();
        Comparable comparable = (Comparable) obj;
        int iXMQ = xMQ(comparable);
        if (iXMQ >= 0) {
            return S(iXMQ);
        }
        if (this.f38145t.isEmpty()) {
            return null;
        }
        return this.f38145t.remove(comparable);
    }
}
