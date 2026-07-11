package com.safedk.android.utils;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class LimitedConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f63102a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63103b = "LimitedConcurrentHashMap";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<K> f63105d;

    public LimitedConcurrentHashMap() {
        this(15);
    }

    public LimitedConcurrentHashMap(int maxSize) {
        this.f63104c = -1;
        this.f63105d = new ArrayDeque<>();
        if (maxSize > 0) {
            this.f63104c = maxSize;
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (containsKey(key)) {
            this.f63105d.remove(key);
            this.f63105d.addLast(key);
            super.put(key, value);
            return value;
        }
        if (this.f63104c > 0 && this.f63105d.size() > 0 && size() == this.f63104c) {
            super.remove(this.f63105d.removeFirst());
        }
        this.f63105d.addLast(key);
        super.put(key, value);
        return value;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        this.f63105d.remove(obj);
        return (V) super.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        this.f63105d.remove(key);
        return super.remove(key, value);
    }

    public synchronized V a() {
        return get(this.f63105d.getFirst());
    }

    public int b() {
        return this.f63104c;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public String toString() {
        return "LimitedConcurrentHashMap size=" + size() + " map is: " + super.toString();
    }

    @Override // java.util.AbstractMap
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LimitedConcurrentHashMap<K, V> clone() {
        LimitedConcurrentHashMap<K, V> limitedConcurrentHashMap = new LimitedConcurrentHashMap<>(this.f63104c);
        limitedConcurrentHashMap.putAll(this);
        return limitedConcurrentHashMap;
    }
}
