package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.SPz;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class u extends LinkedHashMap {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final u f60032t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60033n;

    private u() {
        this.f60033n = true;
    }

    static boolean gh(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !mUb(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public void az() {
        this.f60033n = false;
    }

    static {
        u uVar = new u();
        f60032t = uVar;
        uVar.az();
    }

    public static u KN() {
        return f60032t;
    }

    private static int O(Object obj) {
        if (obj instanceof byte[]) {
            return SPz.nr((byte[]) obj);
        }
        if (obj instanceof SPz.j) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static boolean mUb(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && gh(this, (Map) obj);
    }

    public boolean qie() {
        return this.f60033n;
    }

    private u(Map map) {
        super(map);
        this.f60033n = true;
    }

    private static void J2(Map map) {
        for (Object obj : map.keySet()) {
            SPz.n(obj);
            SPz.n(map.get(obj));
        }
    }

    static int t(Map map) {
        int iO = 0;
        for (Map.Entry entry : map.entrySet()) {
            iO += O(entry.getValue()) ^ O(entry.getKey());
        }
        return iO;
    }

    private void xMQ() {
        if (qie()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public u HI() {
        if (isEmpty()) {
            return new u();
        }
        return new u(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        xMQ();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return t(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        xMQ();
        SPz.n(obj);
        SPz.n(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        xMQ();
        J2(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        xMQ();
        return super.remove(obj);
    }

    public void ty(u uVar) {
        xMQ();
        if (!uVar.isEmpty()) {
            putAll(uVar);
        }
    }
}
