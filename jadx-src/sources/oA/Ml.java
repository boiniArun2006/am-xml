package oA;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71349n;
    private final Object nr;
    private final KType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f71350t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f71349n, ml.f71349n) && Intrinsics.areEqual(this.rl, ml.rl) && Intrinsics.areEqual(this.f71350t, ml.f71350t) && Intrinsics.areEqual(this.nr, ml.nr);
    }

    public Ml(KClass fromClass, KType toType, j parentPath, Object key) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f71349n = fromClass;
        this.rl = toType;
        this.f71350t = parentPath;
        this.nr = key;
    }

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Map map = (Map) this.f71350t.O(receiver);
        if (map != null) {
            return map.get(this.nr);
        }
        return null;
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Object obj = ((Map) this.f71350t.get(receiver)).get(this.nr);
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No element with key: " + this.nr);
    }

    public int hashCode() {
        return (((((this.f71349n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f71350t.hashCode()) * 31) + this.nr.hashCode();
    }

    @Override // oA.j
    public Object n(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Map mutableMap = MapsKt.toMutableMap((Map) this.f71350t.get(receiver));
        mutableMap.remove(this.nr);
        return this.f71350t.rl(receiver, MapsKt.toMap(mutableMap));
    }

    @Override // oA.j
    public KType nr() {
        return this.rl;
    }

    @Override // oA.j
    public Object rl(Object receiver, Object value) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(value, "value");
        Map mutableMap = MapsKt.toMutableMap((Map) this.f71350t.get(receiver));
        mutableMap.put(this.nr, value);
        return this.f71350t.rl(receiver, MapsKt.toMap(mutableMap));
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        String str;
        j jVar = this.f71350t;
        Object obj = this.nr;
        if (obj instanceof String) {
            str = ".['" + obj + "']";
        } else {
            str = ".['" + obj + "' as " + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "]";
        }
        return jVar + str;
    }
}
