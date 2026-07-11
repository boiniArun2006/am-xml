package mg4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements Map, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f70989n;

    public Ml(Map subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f70989n = subscriptions;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List J2(w6 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (List) this.f70989n.get(key);
    }

    public Set KN() {
        return this.f70989n.keySet();
    }

    public boolean O(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f70989n.containsValue(value);
    }

    public Set Uo() {
        return this.f70989n.entrySet();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public List remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof w6) {
            return t((w6) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof List) {
            return O((List) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        Map map = this.f70989n;
        Ml ml = obj instanceof Ml ? (Ml) obj : null;
        return Intrinsics.areEqual(map, ml != null ? ml.f70989n : null);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof w6) {
            return J2((w6) obj);
        }
        return null;
    }

    public final List gh() {
        return xMQ(w6.f70997n);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f70989n.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f70989n.isEmpty();
    }

    public int mUb() {
        return this.f70989n.size();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Collection qie() {
        return this.f70989n.values();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean t(w6 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f70989n.containsKey(key);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ml(Pair... pairs) {
        this(MapsKt.mapOf((Pair[]) Arrays.copyOf(pairs, pairs.length)));
        Intrinsics.checkNotNullParameter(pairs, "pairs");
    }

    private final List xMQ(w6 w6Var) {
        return (List) getOrDefault(w6Var, CollectionsKt.emptyList());
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return Uo();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return KN();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return mUb();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return qie();
    }
}
