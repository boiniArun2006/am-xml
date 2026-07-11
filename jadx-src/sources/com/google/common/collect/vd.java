package com.google.common.collect;

import com.google.common.collect.O;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class vd {

    static abstract class CN3 extends AbstractMap {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private transient Set f59797n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private transient Collection f59798t;

        abstract Set t();

        Collection O() {
            return new Wre(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f59797n;
            if (set != null) {
                return set;
            }
            Set setT = t();
            this.f59797n = setT;
            return setT;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f59798t;
            if (collection != null) {
                return collection;
            }
            Collection collectionO = O();
            this.f59798t = collectionO;
            return collectionO;
        }

        CN3() {
        }
    }

    static class I28 extends O.I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Map f59799n;

        Map rl() {
            return this.f59799n;
        }

        I28(Map map) {
            this.f59799n = (Map) t1.Xo.HI(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return rl().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return rl().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return rl().size();
        }
    }

    static class Wre extends AbstractCollection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Map f59800n;

        final Map rl() {
            return this.f59800n;
        }

        Wre(Map map) {
            this.f59800n = (Map) t1.Xo.HI(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            rl().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return rl().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return rl().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return vd.HI(rl().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : rl().entrySet()) {
                    if (t1.C.n(obj, entry.getValue())) {
                        rl().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) t1.Xo.HI(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetUo = O.Uo();
                for (Map.Entry entry : rl().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetUo.add(entry.getKey());
                    }
                }
                return rl().keySet().removeAll(hashSetUo);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) t1.Xo.HI(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetUo = O.Uo();
                for (Map.Entry entry : rl().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetUo.add(entry.getKey());
                    }
                }
                return rl().keySet().retainAll(hashSetUo);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return rl().size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class w6 implements t1.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f59802n = new j("KEY", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f59803t = new n("VALUE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ w6[] f59801O = n();

        private w6(String str, int i2) {
        }

        enum j extends w6 {
            j(String str, int i2) {
                super(str, i2, null);
            }

            @Override // t1.CN3
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        enum n extends w6 {
            n(String str, int i2) {
                super(str, i2, null);
            }

            @Override // t1.CN3
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        /* synthetic */ w6(String str, int i2, j jVar) {
            this(str, i2);
        }

        private static /* synthetic */ w6[] n() {
            return new w6[]{f59802n, f59803t};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) f59801O.clone();
        }
    }

    static int n(int i2) {
        if (i2 < 3) {
            Pl.rl(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) Math.ceil(((double) i2) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static abstract class Ml extends O.I28 {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        abstract Map rl();

        Ml() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            rl().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return rl().isEmpty();
        }

        @Override // com.google.common.collect.O.I28, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) t1.Xo.HI(collection));
            } catch (UnsupportedOperationException unused) {
                return O.gh(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.O.I28, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) t1.Xo.HI(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetKN = O.KN(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetKN.add(((Map.Entry) obj).getKey());
                    }
                }
                return rl().keySet().retainAll(hashSetKN);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return rl().size();
        }
    }

    class j extends KH {
        j(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.KH
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Object n(Map.Entry entry) {
            return entry.getKey();
        }
    }

    class n extends KH {
        n(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.KH
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Object n(Map.Entry entry) {
            return entry.getValue();
        }
    }

    static Iterator HI(Iterator it) {
        return new n(it);
    }

    static Iterator J2(Iterator it) {
        return new j(it);
    }

    public static IdentityHashMap KN() {
        return new IdentityHashMap();
    }

    public static Map.Entry O(Object obj, Object obj2) {
        return new Ew(obj, obj2);
    }

    public static HashMap Uo(int i2) {
        return new HashMap(n(i2));
    }

    static boolean nr(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static t1.CN3 ty() {
        return w6.f59803t;
    }

    static String az(Map map) {
        StringBuilder sbRl = Xo.rl(map.size());
        sbRl.append('{');
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                sbRl.append(", ");
            }
            sbRl.append(entry.getKey());
            sbRl.append('=');
            sbRl.append(entry.getValue());
            z2 = false;
        }
        sbRl.append('}');
        return sbRl.toString();
    }

    static Object gh(Map map, Object obj) {
        t1.Xo.HI(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean mUb(Map map, Object obj) {
        t1.Xo.HI(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object qie(Map map, Object obj) {
        t1.Xo.HI(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean rl(Map map, Object obj) {
        return iwV.nr(J2(map.entrySet().iterator()), obj);
    }

    static boolean t(Map map, Object obj) {
        return iwV.nr(HI(map.entrySet().iterator()), obj);
    }

    static void xMQ(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }
}
