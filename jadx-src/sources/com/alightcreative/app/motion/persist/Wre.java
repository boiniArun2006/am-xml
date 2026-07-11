package com.alightcreative.app.motion.persist;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Wre implements Map, KMutableMap {
    private Map J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f45800O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SharedPreferences f45801n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f45802t;

    private static final class j implements Map.Entry, KMutableMap.Entry {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f45803n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Object f45804t;

        public j(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f45803n = key;
            this.f45804t = value;
        }

        public void O(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "<set-?>");
            this.f45804t = obj;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f45804t;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            Object value = getValue();
            O(newValue);
            return value;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return this.f45803n;
        }
    }

    public Wre(SharedPreferences prefMgr, Object defaultValue, boolean z2) {
        Intrinsics.checkNotNullParameter(prefMgr, "prefMgr");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f45801n = prefMgr;
        this.f45802t = defaultValue;
        this.f45800O = z2;
        this.J2 = new LinkedHashMap();
    }

    public Set J2() {
        Map<String, ?> all = this.f45801n.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        ArrayList arrayList = new ArrayList(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            Object value = entry.getValue();
            Intrinsics.checkNotNull(value);
            arrayList.add(TypeIntrinsics.asMutableMapEntry(new j(key, value)));
        }
        return CollectionsKt.toMutableSet(arrayList);
    }

    public int KN() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    public Object O(String key) {
        Object objRl;
        List listSplit$default;
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f45800O && (obj = this.J2.get(key)) != null) {
            return obj;
        }
        Object obj2 = this.f45802t;
        if (obj2 instanceof Enum) {
            String string = this.f45801n.getString(key, ((Enum) obj2).name());
            Object[] enumConstants = this.f45802t.getClass().getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            for (int i2 = 0; i2 < length; i2++) {
                objRl = enumConstants[i2];
                Intrinsics.checkNotNull(objRl, "null cannot be cast to non-null type kotlin.Enum<*>");
                if (!Intrinsics.areEqual(((Enum) objRl).name(), string)) {
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        if (obj2 instanceof String) {
            objRl = this.f45801n.getString(key, (String) obj2);
        } else if (obj2 instanceof Boolean) {
            objRl = Boolean.valueOf(this.f45801n.getBoolean(key, ((Boolean) obj2).booleanValue()));
        } else if (obj2 instanceof Integer) {
            objRl = Integer.valueOf(this.f45801n.getInt(key, ((Number) obj2).intValue()));
        } else if (obj2 instanceof Float) {
            objRl = Float.valueOf(this.f45801n.getFloat(key, ((Number) obj2).floatValue()));
        } else if (obj2 instanceof Long) {
            objRl = Long.valueOf(this.f45801n.getLong(key, ((Number) obj2).longValue()));
        } else if (obj2 instanceof Set) {
            SharedPreferences sharedPreferences = this.f45801n;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            objRl = sharedPreferences.getStringSet(key, (Set) obj2);
        } else {
            if (!(obj2 instanceof w6)) {
                throw new UnsupportedOperationException();
            }
            String string2 = this.f45801n.getString(key, null);
            if (string2 == null || (listSplit$default = StringsKt.split$default((CharSequence) string2, new String[]{"\u001f"}, false, 0, 6, (Object) null)) == null || (objRl = w6.rl((w6) this.f45802t, 0, listSplit$default, 1, null)) == null) {
                objRl = (w6) this.f45802t;
            }
        }
        Object obj3 = objRl != null ? objRl : null;
        if (this.f45800O && obj3 != null) {
            this.J2.put(key, obj3);
        }
        return obj3;
    }

    public Set Uo() {
        return CollectionsKt.toMutableSet(this.f45801n.getAll().keySet());
    }

    @Override // java.util.Map
    public void clear() {
        if (this.f45800O) {
            this.J2.clear();
        }
        this.f45801n.edit().clear().apply();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return t((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return CollectionsKt.contains(this.f45801n.getAll().values(), obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return O((String) obj);
        }
        return null;
    }

    public Object gh(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = get(key);
        this.f45801n.edit().remove(key).apply();
        if (this.f45800O) {
            this.J2.remove(key);
        }
        return obj;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f45801n.getAll().isEmpty();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Object put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object obj = get(key);
        if (this.f45800O) {
            this.J2.put(key, value);
        }
        Object obj2 = this.f45802t;
        if (obj2 instanceof Enum) {
            this.f45801n.edit().putString(key, ((Enum) value).name()).apply();
            return obj;
        }
        if (obj2 instanceof String) {
            this.f45801n.edit().putString(key, (String) value).apply();
            return obj;
        }
        if (obj2 instanceof Boolean) {
            this.f45801n.edit().putBoolean(key, ((Boolean) value).booleanValue()).apply();
            return obj;
        }
        if (obj2 instanceof Integer) {
            this.f45801n.edit().putInt(key, ((Integer) value).intValue()).apply();
            return obj;
        }
        if (obj2 instanceof Float) {
            this.f45801n.edit().putFloat(key, ((Float) value).floatValue()).apply();
            return obj;
        }
        if (obj2 instanceof Long) {
            this.f45801n.edit().putLong(key, ((Long) value).longValue()).apply();
            return obj;
        }
        if (obj2 instanceof Set) {
            this.f45801n.edit().putStringSet(key, (Set) value).apply();
            return obj;
        }
        if (!(obj2 instanceof w6)) {
            throw new UnsupportedOperationException();
        }
        this.f45801n.edit().putString(key, CollectionsKt.joinToString$default(((w6) value).t(), "\u001f", null, null, 0, null, null, 62, null)).apply();
        return obj;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Object obj : from.keySet()) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            String str = (String) obj;
            Object obj2 = from.get(str);
            if (obj2 != null) {
                put(str, obj2);
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return gh((String) obj);
        }
        return null;
    }

    public boolean t(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f45801n.contains(key);
    }

    public Collection xMQ() {
        Set mutableSet = CollectionsKt.toMutableSet(this.f45801n.getAll().values());
        Intrinsics.checkNotNull(mutableSet, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of com.alightcreative.app.motion.persist.SharedStringMapPrefImpl>");
        return TypeIntrinsics.asMutableSet(mutableSet);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return J2();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return Uo();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return KN();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return xMQ();
    }
}
