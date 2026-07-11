package R5;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 implements Map, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f8645n;

    public CN3(Map subscriptionItems) {
        Intrinsics.checkNotNullParameter(subscriptionItems, "subscriptionItems");
        this.f8645n = subscriptionItems;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List J2(mg4.w6 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (List) this.f8645n.get(key);
    }

    public Set KN() {
        return this.f8645n.keySet();
    }

    public boolean O(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f8645n.containsValue(value);
    }

    public Set Uo() {
        return this.f8645n.entrySet();
    }

    public Collection az() {
        return this.f8645n.values();
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
        if (obj instanceof mg4.w6) {
            return t((mg4.w6) obj);
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
        Map map = this.f8645n;
        CN3 cn3 = obj instanceof CN3 ? (CN3) obj : null;
        return Intrinsics.areEqual(map, cn3 != null ? cn3.f8645n : null);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof mg4.w6) {
            return J2((mg4.w6) obj);
        }
        return null;
    }

    public final List gh() {
        return xMQ(mg4.w6.f70997n);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f8645n.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f8645n.isEmpty();
    }

    public int mUb() {
        return this.f8645n.size();
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

    public final List qie() {
        return xMQ(mg4.w6.f70998t);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean t(mg4.w6 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f8645n.containsKey(key);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public List remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CN3(Pair... pairs) {
        this(MapsKt.mapOf((Pair[]) Arrays.copyOf(pairs, pairs.length)));
        Intrinsics.checkNotNullParameter(pairs, "pairs");
    }

    private final List xMQ(mg4.w6 w6Var) {
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
        return az();
    }
}
