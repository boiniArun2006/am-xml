package com.safedk.android.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class SimpleConcurrentHashSet<T> extends ConcurrentHashMap<T, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Boolean f63129a = Boolean.TRUE;

    public boolean a(T t3) {
        return put(t3, f63129a) == null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean remove(Object obj) {
        return Boolean.valueOf(remove(obj, f63129a));
    }

    @Override // java.util.concurrent.ConcurrentHashMap
    public boolean contains(Object key) {
        return super.containsKey(key);
    }

    public Iterator<T> a() {
        return keySet().iterator();
    }

    public static <T> SimpleConcurrentHashSet<T> b() {
        return new SimpleConcurrentHashSet<>();
    }

    public boolean a(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (a(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }
}
