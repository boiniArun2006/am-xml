package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Entry f14467n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Entry f14468t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WeakHashMap f14466O = new WeakHashMap();
    private int J2 = 0;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class AscendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry rl(Entry entry) {
            return entry.J2;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry t(Entry entry) {
            return entry.f14469O;
        }

        AscendingIterator(Entry entry, Entry entry2) {
            super(entry, entry2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static class DescendingIterator<K, V> extends ListIterator<K, V> {
        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry rl(Entry entry) {
            return entry.f14469O;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.ListIterator
        Entry t(Entry entry) {
            return entry.J2;
        }

        DescendingIterator(Entry entry, Entry entry2) {
            super(entry, entry2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class Entry<K, V> implements Map.Entry<K, V> {
        Entry J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Entry f14469O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Object f14470n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Object f14471t;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return this.f14470n.equals(entry.f14470n) && this.f14471t.equals(entry.f14471t);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f14470n;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f14471t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f14470n.hashCode() ^ this.f14471t.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f14470n + l.ae + this.f14471t;
        }

        Entry(Object obj, Object obj2) {
            this.f14470n = obj;
            this.f14471t = obj2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RestrictTo
    public class IteratorWithAdditions extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Entry f14473n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f14474t = true;

        IteratorWithAdditions() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14474t) {
                return SafeIterableMap.this.f14467n != null;
            }
            Entry entry = this.f14473n;
            return (entry == null || entry.f14469O == null) ? false : true;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        void n(Entry entry) {
            Entry entry2 = this.f14473n;
            if (entry == entry2) {
                Entry entry3 = entry2.J2;
                this.f14473n = entry3;
                this.f14474t = entry3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f14474t) {
                this.f14474t = false;
                this.f14473n = SafeIterableMap.this.f14467n;
            } else {
                Entry entry = this.f14473n;
                this.f14473n = entry != null ? entry.f14469O : null;
            }
            return this.f14473n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static abstract class ListIterator<K, V> extends SupportRemove<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Entry f14475n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Entry f14476t;

        abstract Entry rl(Entry entry);

        abstract Entry t(Entry entry);

        private Entry O() {
            Entry entry = this.f14476t;
            Entry entry2 = this.f14475n;
            if (entry == entry2 || entry2 == null) {
                return null;
            }
            return t(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14476t != null;
        }

        @Override // androidx.arch.core.internal.SafeIterableMap.SupportRemove
        public void n(Entry entry) {
            if (this.f14475n == entry && entry == this.f14476t) {
                this.f14476t = null;
                this.f14475n = null;
            }
            Entry entry2 = this.f14475n;
            if (entry2 == entry) {
                this.f14475n = rl(entry2);
            }
            if (this.f14476t == entry) {
                this.f14476t = O();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Entry entry = this.f14476t;
            this.f14476t = O();
            return entry;
        }

        ListIterator(Entry entry, Entry entry2) {
            this.f14475n = entry2;
            this.f14476t = entry;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RestrictTo
    public static abstract class SupportRemove<K, V> {
        abstract void n(Entry entry);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (size() != safeIterableMap.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = safeIterableMap.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    Entry J2(Object obj, Object obj2) {
        Entry entry = new Entry(obj, obj2);
        this.J2++;
        Entry entry2 = this.f14468t;
        if (entry2 == null) {
            this.f14467n = entry;
            this.f14468t = entry;
            return entry;
        }
        entry2.f14469O = entry;
        entry.J2 = entry2;
        this.f14468t = entry;
        return entry;
    }

    public Map.Entry O() {
        return this.f14468t;
    }

    public Iterator descendingIterator() {
        DescendingIterator descendingIterator = new DescendingIterator(this.f14468t, this.f14467n);
        this.f14466O.put(descendingIterator, Boolean.FALSE);
        return descendingIterator;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        AscendingIterator ascendingIterator = new AscendingIterator(this.f14467n, this.f14468t);
        this.f14466O.put(ascendingIterator, Boolean.FALSE);
        return ascendingIterator;
    }

    public IteratorWithAdditions nr() {
        IteratorWithAdditions iteratorWithAdditions = new IteratorWithAdditions();
        this.f14466O.put(iteratorWithAdditions, Boolean.FALSE);
        return iteratorWithAdditions;
    }

    public Map.Entry rl() {
        return this.f14467n;
    }

    public int size() {
        return this.J2;
    }

    protected Entry t(Object obj) {
        Entry entry = this.f14467n;
        while (entry != null && !entry.f14470n.equals(obj)) {
            entry = entry.f14469O;
        }
        return entry;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Apsps.BbTJNHx);
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Object KN(Object obj) {
        Entry entryT = t(obj);
        if (entryT == null) {
            return null;
        }
        this.J2--;
        if (!this.f14466O.isEmpty()) {
            Iterator<K> it = this.f14466O.keySet().iterator();
            while (it.hasNext()) {
                ((SupportRemove) it.next()).n(entryT);
            }
        }
        Entry entry = entryT.J2;
        if (entry != null) {
            entry.f14469O = entryT.f14469O;
        } else {
            this.f14467n = entryT.f14469O;
        }
        Entry entry2 = entryT.f14469O;
        if (entry2 != null) {
            entry2.J2 = entry;
        } else {
            this.f14468t = entry;
        }
        entryT.f14469O = null;
        entryT.J2 = null;
        return entryT.f14471t;
    }

    public Object Uo(Object obj, Object obj2) {
        Entry entryT = t(obj);
        if (entryT != null) {
            return entryT.f14471t;
        }
        J2(obj, obj2);
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }
}
