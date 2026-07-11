package co4;

import co4.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class r implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KMutableProperty1 f43866n;

    public r(KMutableProperty1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f43866n = property;
    }

    @Override // stX.j
    public String getName() {
        return this.f43866n.getName();
    }

    @Override // co4.n
    public Object n(Object obj) {
        return this.f43866n.get(obj);
    }

    @Override // stX.j
    public Object t(Object obj, Object obj2) {
        V v2 = this.f43866n.get(obj);
        if (v2 == 0) {
            this.f43866n.set(obj, obj2);
            return null;
        }
        if (Intrinsics.areEqual(v2, obj2)) {
            return null;
        }
        return v2;
    }

    @Override // co4.n
    public Object rl(Object obj) {
        return n.j.n(this, obj);
    }
}
