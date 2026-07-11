package androidx.arch.core.internal;

import androidx.annotation.RestrictTo;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final HashMap f14465r = new HashMap();

    public boolean contains(Object obj) {
        return this.f14465r.containsKey(obj);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected SafeIterableMap.Entry t(Object obj) {
        return (SafeIterableMap.Entry) this.f14465r.get(obj);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public Object KN(Object obj) {
        Object objKN = super.KN(obj);
        this.f14465r.remove(obj);
        return objKN;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public Object Uo(Object obj, Object obj2) {
        SafeIterableMap.Entry entryT = t(obj);
        if (entryT != null) {
            return entryT.f14471t;
        }
        this.f14465r.put(obj, J2(obj, obj2));
        return null;
    }

    public Map.Entry xMQ(Object obj) {
        if (contains(obj)) {
            return ((SafeIterableMap.Entry) this.f14465r.get(obj)).J2;
        }
        return null;
    }
}
