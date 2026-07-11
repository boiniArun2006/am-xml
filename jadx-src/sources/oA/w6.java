package oA;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class w6 implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71356n;
    private final int nr;
    private final KType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f71357t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f71356n, w6Var.f71356n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f71357t, w6Var.f71357t) && this.nr == w6Var.nr;
    }

    public w6(KClass fromClass, KType toType, j parentPath, int i2) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        this.f71356n = fromClass;
        this.rl = toType;
        this.f71357t = parentPath;
        this.nr = i2;
    }

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        List list = (List) this.f71357t.O(receiver);
        if (list != null) {
            return CollectionsKt.getOrNull(list, this.nr);
        }
        return null;
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return ((List) this.f71357t.get(receiver)).get(this.nr);
    }

    public int hashCode() {
        return (((((this.f71356n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f71357t.hashCode()) * 31) + Integer.hashCode(this.nr);
    }

    @Override // oA.j
    public Object n(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        List list = (List) this.f71357t.get(receiver);
        return this.f71357t.rl(receiver, CollectionsKt.minus(list, list.get(this.nr)));
    }

    @Override // oA.j
    public KType nr() {
        return this.rl;
    }

    @Override // oA.j
    public Object rl(Object receiver, Object value) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(value, "value");
        List mutableList = CollectionsKt.toMutableList((Collection) this.f71357t.get(receiver));
        mutableList.set(this.nr, value);
        return this.f71357t.rl(receiver, CollectionsKt.toList(mutableList));
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        return this.f71357t + ".[" + this.nr + "]";
    }
}
