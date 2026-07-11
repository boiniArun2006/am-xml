package oA;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 implements j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f71346O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71347n;
    private final Object nr;
    private final KType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f71348t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(this.f71347n, i28.f71347n) && Intrinsics.areEqual(this.rl, i28.rl) && Intrinsics.areEqual(this.f71348t, i28.f71348t) && Intrinsics.areEqual(this.nr, i28.nr) && Intrinsics.areEqual(this.f71346O, i28.f71346O);
    }

    public I28(KClass fromClass, KType toType, j parentPath, Object key, Object obj) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj, "default");
        this.f71347n = fromClass;
        this.rl = toType;
        this.f71348t = parentPath;
        this.nr = key;
        this.f71346O = obj;
    }

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return ((Map) this.f71348t.get(receiver)).get(this.nr);
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Object obj = ((Map) this.f71348t.get(receiver)).get(this.nr);
        return obj == null ? this.f71346O : obj;
    }

    public int hashCode() {
        return (((((((this.f71347n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f71348t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f71346O.hashCode();
    }

    @Override // oA.j
    public Object n(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Map mutableMap = MapsKt.toMutableMap((Map) this.f71348t.get(receiver));
        mutableMap.remove(this.nr);
        return this.f71348t.rl(receiver, MapsKt.toMap(mutableMap));
    }

    @Override // oA.j
    public KType nr() {
        return this.rl;
    }

    @Override // oA.j
    public Object rl(Object receiver, Object value) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(value, "value");
        Map mutableMap = MapsKt.toMutableMap((Map) this.f71348t.get(receiver));
        mutableMap.put(this.nr, value);
        return this.f71348t.rl(receiver, MapsKt.toMap(mutableMap));
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        return this.f71348t + ".['" + this.nr + "'?:" + this.f71346O + "]";
    }
}
