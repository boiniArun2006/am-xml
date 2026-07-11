package androidx.collection;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0017¨\u00063"}, d2 = {"Landroidx/collection/MapWrapper;", "K", "V", "", "Landroidx/collection/ScatterMap;", "parent", "<init>", "(Landroidx/collection/ScatterMap;)V", "", "isEmpty", "()Z", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "containsValue", "(Ljava/lang/Object;)Z", "containsKey", "", InneractiveMediationNameConsts.OTHER, "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "Landroidx/collection/ScatterMap;", "Landroidx/collection/Entries;", "t", "Landroidx/collection/Entries;", "_entries", "Landroidx/collection/Keys;", "O", "Landroidx/collection/Keys;", "_keys", "Landroidx/collection/Values;", "J2", "Landroidx/collection/Values;", "_values", "", "", "()Ljava/util/Set;", IV8ValueMap.FUNCTION_ENTRIES, IV8ValueMap.FUNCTION_KEYS, "", "Uo", "()Ljava/util/Collection;", IV8ValueMap.FUNCTION_VALUES, "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MapWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1787:1\n1#2:1788\n*E\n"})
class MapWrapper<K, V> implements Map<K, V>, KMappedMarker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Values _values;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Keys _keys;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ScatterMap parent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Entries _entries;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public MapWrapper(ScatterMap parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
    }

    public int J2() {
        return this.parent._size;
    }

    public Set O() {
        Keys keys = this._keys;
        if (keys != null) {
            return keys;
        }
        Keys keys2 = new Keys(this.parent);
        this._keys = keys2;
        return keys2;
    }

    public Collection Uo() {
        Values values = this._values;
        if (values != null) {
            return values;
        }
        Values values2 = new Values(this.parent);
        this._values = values2;
        return values2;
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.parent.t(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.parent.nr(value);
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        return Intrinsics.areEqual(this.parent, ((MapWrapper) other).parent);
    }

    @Override // java.util.Map
    public Object get(Object key) {
        return this.parent.O(key);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.parent.KN();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set t() {
        Entries entries = this._entries;
        if (entries != null) {
            return entries;
        }
        Entries entries2 = new Entries(this.parent);
        this._entries = entries2;
        return entries2;
    }

    public String toString() {
        return this.parent.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return t();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return O();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return J2();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return Uo();
    }
}
