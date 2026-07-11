package com.caoccao.javet.utils;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ThreadSafeMap<TKey, TValue> {
    private Map<TKey, TValue> map;
    private Type type;

    public enum Type {
        Permanent,
        Weak
    }

    public ThreadSafeMap() {
        this(Type.Permanent);
    }

    public ThreadSafeMap(Type type) {
        setType(type);
    }

    public void clear() {
        this.map.clear();
    }

    public TValue get(TKey tkey) {
        return this.map.get(tkey);
    }

    public Type getType() {
        return this.type;
    }

    public TValue put(TKey tkey, TValue tvalue) {
        return this.map.put(tkey, tvalue);
    }

    public void setType(Type type) {
        Objects.requireNonNull(type);
        Type type2 = this.type;
        if (type2 == null) {
            if (type == Type.Weak) {
                this.map = Collections.synchronizedMap(new WeakHashMap());
            } else {
                this.map = new ConcurrentHashMap();
            }
        } else if (type2 != type) {
            if (type == Type.Weak) {
                this.map = Collections.synchronizedMap(new WeakHashMap(this.map));
            } else {
                this.map = new ConcurrentHashMap(this.map);
            }
        }
        this.type = type;
    }
}
