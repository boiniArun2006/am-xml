package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class r extends ci implements Map {
    @Override // com.google.common.collect.ci
    /* JADX INFO: renamed from: delegate */
    protected abstract Map t();

    public boolean equals(Object obj) {
        return obj == this || t().equals(obj);
    }

    protected r() {
    }

    @Override // java.util.Map
    public void clear() {
        t().clear();
    }

    public boolean containsKey(Object obj) {
        return t().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return t().containsValue(obj);
    }

    public Set entrySet() {
        return t().entrySet();
    }

    public Object get(Object obj) {
        return t().get(obj);
    }

    public int hashCode() {
        return t().hashCode();
    }

    public boolean isEmpty() {
        return t().isEmpty();
    }

    public Set keySet() {
        return t().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return t().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        t().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return t().remove(obj);
    }

    public int size() {
        return t().size();
    }

    protected void standardClear() {
        iwV.t(entrySet().iterator());
    }

    protected boolean standardContainsKey(Object obj) {
        return vd.rl(this, obj);
    }

    protected boolean standardContainsValue(Object obj) {
        return vd.t(this, obj);
    }

    protected boolean standardEquals(Object obj) {
        return vd.nr(this, obj);
    }

    protected int standardHashCode() {
        return O.nr(entrySet());
    }

    protected boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    protected void standardPutAll(Map<Object, Object> map) {
        vd.xMQ(this, map);
    }

    protected Object standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (t1.C.n(entry.getKey(), obj)) {
                Object value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String standardToString() {
        return vd.az(this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return t().values();
    }
}
