package androidx.content.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class LazyField extends LazyFieldLite {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MessageLite f38065O;

    static class LazyEntry<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Map.Entry f38066n;

        private LazyEntry(Map.Entry entry) {
            this.f38066n = entry;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f38066n.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField lazyField = (LazyField) this.f38066n.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.J2();
        }

        public LazyField n() {
            return (LazyField) this.f38066n.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f38066n.getValue()).nr((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class LazyIterator<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Iterator f38067n;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38067n.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f38067n.next();
            return entry.getValue() instanceof LazyField ? new LazyEntry(entry) : entry;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f38067n.remove();
        }

        public LazyIterator(Iterator it) {
            this.f38067n = it;
        }
    }

    public MessageLite J2() {
        return t(this.f38065O);
    }

    @Override // androidx.content.preferences.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return J2().equals(obj);
    }

    @Override // androidx.content.preferences.protobuf.LazyFieldLite
    public int hashCode() {
        return J2().hashCode();
    }

    public String toString() {
        return J2().toString();
    }
}
