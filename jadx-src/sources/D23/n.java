package D23;

import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class n implements Map {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f1178n;

    public static Map t(Map map) {
        return new n(map);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Object put(Class cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f1178n.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f1178n.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        throw new UnsupportedOperationException(YjqZUJsVmhcjko.gWcnLtYzT);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (obj instanceof Class) {
            return this.f1178n.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f1178n.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f1178n.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f1178n.values();
    }

    private n(Map map) {
        this.f1178n = map;
    }
}
