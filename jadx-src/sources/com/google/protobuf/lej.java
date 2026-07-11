package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class lej extends iwV {
    private final yg defaultInstance;

    static class n implements Map.Entry {
        private Map.Entry<Object, lej> entry;

        private n(Map.Entry<Object, lej> entry) {
            this.entry = entry;
        }

        public lej getField() {
            return this.entry.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            lej value = this.entry.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof yg) {
                return this.entry.getValue().setValue((yg) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class w6 implements Iterator {
        private Iterator<Map.Entry<Object, Object>> iterator;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            Map.Entry<Object, Object> next = this.iterator.next();
            return next.getValue() instanceof lej ? new n(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }

        public w6(Iterator<Map.Entry<Object, Object>> it) {
            this.iterator = it;
        }
    }

    public yg getValue() {
        return getValue(this.defaultInstance);
    }

    public lej(yg ygVar, QJ qj, C c2) {
        super(qj, c2);
        this.defaultInstance = ygVar;
    }

    @Override // com.google.protobuf.iwV
    public boolean containsDefaultInstance() {
        if (!super.containsDefaultInstance() && this.value != this.defaultInstance) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.iwV
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    @Override // com.google.protobuf.iwV
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
