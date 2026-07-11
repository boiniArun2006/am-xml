package oA;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KClass f71344n;
    private final j nr;
    private final KType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f71345t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Intrinsics.areEqual(this.f71344n, dsr.f71344n) && Intrinsics.areEqual(this.rl, dsr.rl) && Intrinsics.areEqual(this.f71345t, dsr.f71345t) && Intrinsics.areEqual(this.nr, dsr.nr);
    }

    public Dsr(KClass fromClass, KType toType, j parentPath, j chainedLens) {
        Intrinsics.checkNotNullParameter(fromClass, "fromClass");
        Intrinsics.checkNotNullParameter(toType, "toType");
        Intrinsics.checkNotNullParameter(parentPath, "parentPath");
        Intrinsics.checkNotNullParameter(chainedLens, "chainedLens");
        this.f71344n = fromClass;
        this.rl = toType;
        this.f71345t = parentPath;
        this.nr = chainedLens;
    }

    @Override // oA.j
    public Object O(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Object objO = this.f71345t.O(receiver);
        if (objO != null) {
            return this.nr.O(objO);
        }
        return null;
    }

    @Override // oA.j
    public Object get(Object receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        return this.nr.get(this.f71345t.get(receiver));
    }

    public int hashCode() {
        return (((((this.f71344n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f71345t.hashCode()) * 31) + this.nr.hashCode();
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
    public Object rl(Object receiver, Object value) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f71345t.rl(receiver, this.nr.rl(this.f71345t.get(receiver), value));
    }

    @Override // oA.j
    public Object t(Object receiver, Function1 updater) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return rl(receiver, updater.invoke(get(receiver)));
    }

    public String toString() {
        return this.f71345t + "::" + this.nr;
    }
}
