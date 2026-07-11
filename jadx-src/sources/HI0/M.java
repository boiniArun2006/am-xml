package HI0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class M {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Iterable f3823n;
    private final Function2 rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m2 = (M) obj;
        return Intrinsics.areEqual(this.f3823n, m2.f3823n) && Intrinsics.areEqual(this.rl, m2.rl);
    }

    public M(Iterable iterable, Function2 predicate) {
        Intrinsics.checkNotNullParameter(iterable, "iterable");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f3823n = iterable;
        this.rl = predicate;
    }

    public int hashCode() {
        return (this.f3823n.hashCode() * 31) + this.rl.hashCode();
    }

    public final Iterable n() {
        return this.f3823n;
    }

    public final Function2 rl() {
        return this.rl;
    }

    public String toString() {
        return "IterWithRunPredicate(iterable=" + this.f3823n + ", predicate=" + this.rl + ")";
    }
}
