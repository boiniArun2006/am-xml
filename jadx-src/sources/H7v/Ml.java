package H7v;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml implements Map, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SortedMap f3793n;

    public Ml(SortedMap mapping) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        this.f3793n = mapping;
        if (mapping.isEmpty()) {
            throw new IllegalArgumentException("Mapping must not be empty.");
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ml) && Intrinsics.areEqual(this.f3793n, ((Ml) obj).f3793n);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long J2() {
        Object objLastKey = this.f3793n.lastKey();
        Intrinsics.checkNotNullExpressionValue(objLastKey, "mapping.lastKey()");
        return ((d2n.Ml) objLastKey).Ik();
    }

    public Set KN() {
        Set setEntrySet = this.f3793n.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public Object O(long j2) {
        return this.f3793n.get(d2n.Ml.rl(j2));
    }

    public final Object Uo() {
        Collection collectionValues = this.f3793n.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mapping.values");
        return CollectionsKt.last(collectionValues);
    }

    public final List az() {
        SortedMap sortedMap = this.f3793n;
        ArrayList arrayList = new ArrayList(sortedMap.size());
        Iterator it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(CN3.n((Map.Entry) it.next()));
        }
        return arrayList;
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
        if (obj instanceof d2n.Ml) {
            return t(((d2n.Ml) obj).Ik());
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f3793n.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof d2n.Ml) {
            return O(((d2n.Ml) obj).Ik());
        }
        return null;
    }

    public final long gh() {
        Object objFirstKey = this.f3793n.firstKey();
        Intrinsics.checkNotNullExpressionValue(objFirstKey, "mapping.firstKey()");
        return ((d2n.Ml) objFirstKey).Ik();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f3793n.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f3793n.isEmpty();
    }

    public int mUb() {
        return this.f3793n.size();
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

    public final Object qie() {
        Collection collectionValues = this.f3793n.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "mapping.values");
        return CollectionsKt.first(collectionValues);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean t(long j2) {
        return this.f3793n.containsKey(d2n.Ml.rl(j2));
    }

    public String toString() {
        return "TimeFunction(mapping=" + this.f3793n + ')';
    }

    public Collection ty() {
        Collection collectionValues = this.f3793n.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    public Set xMQ() {
        Set setKeySet = this.f3793n.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return KN();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return xMQ();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return mUb();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return ty();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ml(Map mapping) {
        this(MapsKt.toSortedMap(mapping));
        Intrinsics.checkNotNullParameter(mapping, "mapping");
    }
}
