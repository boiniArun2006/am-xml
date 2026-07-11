package com.safedk.android.utils;

import android.content.SharedPreferences;
import cS.Zv.SzFNXybiSxdx;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class PersistentConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63120a = "SafeDKCache";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63121b = "PersistentConcurrentHashMap";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<PersistentConcurrentHashMap<?, ?>> f63122c = new ArrayList();
    private static final long serialVersionUID = 7611795083821185660L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f63123d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile LinkedHashSet<K> f63126g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile String f63124e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile int f63125f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile AtomicBoolean f63127h = new AtomicBoolean(false);

    public static void a() {
        ArrayList<PersistentConcurrentHashMap> arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.d(f63121b, "save all maps...");
        synchronized (f63122c) {
            arrayList = new ArrayList(f63122c);
        }
        for (PersistentConcurrentHashMap persistentConcurrentHashMap : arrayList) {
            if (persistentConcurrentHashMap.f63127h.get()) {
                Logger.d(f63121b, "save all maps, map key=", persistentConcurrentHashMap.f63123d, ", size before filtering=", Integer.valueOf(persistentConcurrentHashMap.size()));
                e.a(persistentConcurrentHashMap, persistentConcurrentHashMap.f63123d);
                Logger.d(f63121b, "save all maps, map key=", persistentConcurrentHashMap.f63123d, ", size after filtering=", Integer.valueOf(persistentConcurrentHashMap.size()));
                persistentConcurrentHashMap.f();
            }
        }
        Logger.d(f63121b, "save all maps done in ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
    }

    public void a(String str) {
        this.f63124e += com.safedk.android.analytics.brandsafety.l.ad + str;
        Logger.d(f63121b, "sdk_null_check added value ", str);
    }

    public String b() {
        return this.f63124e;
    }

    public PersistentConcurrentHashMap(String sharePrefsKey) {
        a(sharePrefsKey, -1);
    }

    public PersistentConcurrentHashMap(String sharePrefsKey, int capacityLimit) {
        a(sharePrefsKey, capacityLimit);
    }

    private synchronized void a(String str, int i2) {
        if (str != null) {
            if (!str.isEmpty()) {
                synchronized (f63122c) {
                    f63122c.add(this);
                }
                this.f63123d = str;
                this.f63125f = i2;
                if (i2 > -1) {
                    this.f63126g = new LinkedHashSet<>(i2, 1.0f);
                    Logger.d(f63121b, "PersistentConcurrentHashMap filename = ", e(), ", capacity limit = ", Integer.valueOf(i2));
                }
                Logger.d(f63121b, "PersistentConcurrentHashMap instance created, filename = ", e());
                g();
            }
        }
        throw new InvalidParameterException("argument sharePrefsKey cannot be empty");
    }

    public PersistentConcurrentHashMap() {
    }

    public synchronized K c() {
        if (this.f63126g != null) {
            Iterator<K> it = this.f63126g.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    private PersistentConcurrentHashMap(int initialCapacity) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(Map m2) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void putAll(Map map) {
        Logger.v(f63121b, "putAll started");
        for (K k2 : map.keySet()) {
            put(k2, map.get(k2));
            if (this.f63126g != null) {
                this.f63126g.add(k2);
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (keySet().contains(key)) {
            super.remove(key);
            if (this.f63126g != null) {
                this.f63126g.remove(key);
            }
            Logger.d(f63121b, "put filename = ", e(), ", removed existing key ", key);
        }
        super.put(key, value);
        d();
        if (this.f63126g != null) {
            this.f63126g.add(key);
        }
        Logger.d(f63121b, "put filename = ", e(), ", added key ", key);
        this.f63127h.set(true);
        return value;
    }

    private synchronized void d() {
        if (this.f63125f > -1 && size() > this.f63125f) {
            K kC = c();
            if (kC != null) {
                remove(kC);
                Logger.d(SzFNXybiSxdx.iEqvQKvJJF, "remove oldest entry if necessary, filename = ", e(), ", removed key ", kC);
            } else {
                Logger.d(f63121b, "remove oldest entry if necessary, filename = ", e(), ", first item is null");
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        if (key == null) {
            return false;
        }
        boolean zRemove = super.remove(key, value);
        if (this.f63126g != null) {
            this.f63126g.remove(key);
        }
        if (zRemove) {
            Logger.d(f63121b, "remove filename = ", e(), ", removed key ", key);
            this.f63127h.set(true);
        }
        return zRemove;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        V v2 = (V) super.remove(obj);
        if (this.f63126g != null) {
            this.f63126g.remove(obj);
        }
        if (v2 != null) {
            Logger.v(f63121b, "remove filename=", e(), ", removed key ", obj);
            this.f63127h.set(true);
        }
        return v2;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean replace(K key, V oldValue, V newValue) {
        boolean zReplace;
        zReplace = super.replace(key, oldValue, newValue);
        if (zReplace) {
            Logger.d(f63121b, "replace filename = ", e(), ", replace key ", key.toString());
            this.f63127h.set(true);
        }
        return zReplace;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized V replace(K k2, V v2) {
        V v3;
        v3 = (V) super.replace(k2, v2);
        if (v3 != null) {
            Logger.d(f63121b, "replace filename = ", e(), ", replace key ", k2.toString());
            this.f63127h.set(true);
        }
        return v3;
    }

    private String e() {
        return "SafeDKCache_" + this.f63123d;
    }

    private void f() {
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().m().getSharedPreferences(e(), 0);
            if (sharedPreferences == null) {
                Logger.d(f63121b, "saveMap cannot get share prefs object");
                return;
            }
            if (this.f63127h.get()) {
                String strA = i.a(this);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (sharedPreferences.contains(this.f63123d)) {
                    editorEdit.remove(this.f63123d).apply();
                }
                editorEdit.putString(this.f63123d, strA);
                editorEdit.apply();
                Object[] objArr = new Object[6];
                objArr[0] = "Map saved, key=";
                objArr[1] = e();
                objArr[2] = ", size=";
                objArr[3] = Integer.valueOf(size());
                objArr[4] = ", content length=";
                objArr[5] = strA != null ? Integer.valueOf(strA.length()) : V8ValueNull.NULL;
                Logger.v(f63121b, objArr);
                this.f63127h.set(false);
            }
        } catch (Exception e2) {
            Logger.d(f63121b, "Exception while saving map data", e2);
        }
    }

    private void g() {
        Logger.d(f63121b, "loadMap started, map key=", e());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().m().getSharedPreferences(e(), 0);
            new ConcurrentHashMap();
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(this.f63123d, null);
                if (string != null) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i.a(string);
                    Logger.d(f63121b, "loadMap (", e(), ") content length = ", Integer.valueOf(string.length()), ", concurrentHashMap size = ", Integer.valueOf(concurrentHashMap.size()));
                    for (Map.Entry<K, V> entry : concurrentHashMap.entrySet()) {
                        if (entry.getValue() instanceof CreativeInfo) {
                            CreativeInfo creativeInfo = (CreativeInfo) entry.getValue();
                            if (creativeInfo != null) {
                                creativeInfo.a(com.safedk.android.analytics.brandsafety.l.f62648c, new l.a[0]);
                                creativeInfo.ah();
                                put(entry.getKey(), entry.getValue());
                                if (this.f63126g != null) {
                                    this.f63126g.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof List) {
                            List list = (List) entry.getValue();
                            if (!list.isEmpty() && (list.get(0) instanceof CreativeInfo)) {
                                CreativeInfo creativeInfo2 = (CreativeInfo) list.get(0);
                                Logger.d(f63121b, "loadMap including item ", creativeInfo2.N(), " ,AdType is ", creativeInfo2.M().name(), ", persistentContentSize(", e(), "):", Integer.valueOf(string.length()));
                                creativeInfo2.a(com.safedk.android.analytics.brandsafety.l.f62648c, new l.a[0]);
                                creativeInfo2.ah();
                                put(entry.getKey(), entry.getValue());
                                if (this.f63126g != null) {
                                    this.f63126g.add(entry.getKey());
                                }
                            }
                        } else if (entry.getValue() instanceof Boolean) {
                            put(entry.getKey(), entry.getValue());
                            if (this.f63126g != null) {
                                this.f63126g.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof StatsEvent) {
                            put(entry.getKey(), entry.getValue());
                            if (this.f63126g != null) {
                                this.f63126g.add(entry.getKey());
                            }
                        } else if (entry.getValue() instanceof RedirectData) {
                            Logger.d(f63121b, "loadMap item key: ", entry.getKey(), ", value: ", entry.getValue());
                            put(entry.getKey(), entry.getValue());
                            if (this.f63126g != null) {
                                this.f63126g.add(entry.getKey());
                            }
                        }
                    }
                } else {
                    Logger.d(f63121b, "loadMap map is empty");
                }
                Logger.d(f63121b, "loadMap loaded map ", e(), " : ", Integer.valueOf(size()), " items");
                f();
            }
        } catch (InvalidClassException e2) {
            Logger.d(f63121b, "loadMap Exception loading Map from file : ", e(), e2);
            this.f63127h.set(true);
        } catch (IllegalArgumentException e3) {
            Logger.d(f63121b, "loadMap Data mismatch exception loading Map from file : ", e(), e3);
            this.f63127h.set(true);
        } catch (Throwable th) {
            Logger.e(f63121b, "loadMap Error loading Map from file : ", e(), th);
            this.f63127h.set(true);
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
        this.f63127h.set(true);
    }
}
