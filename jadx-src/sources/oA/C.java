package oA;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71342n;
    private final KType rl;

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return receiver;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Intrinsics.areEqual(this.f71342n, c2.f71342n) && Intrinsics.areEqual(this.rl, c2.rl);
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return receiver;
    }

    @Override // oA.j
    public Object rl(Object receiver, Object value) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public C(KClass fromClass, KType toType) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        this.f71342n = fromClass;
        this.rl = toType;
    }

    public KClass J2() {
        return this.f71342n;
    }

    public int hashCode() {
        return (this.f71342n.hashCode() * 31) + this.rl.hashCode();
    }

    @Override // oA.j
    public Object n(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        throw new UnsupportedOperationException();
    }

    @Override // oA.j
    public KType nr() {
        return this.rl;
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        String qualifiedName = J2().getQualifiedName();
        if (qualifiedName == null) {
            qualifiedName = "";
        }
        return qualifiedName + "::this";
    }
}
