package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class K extends co4.Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qf f72522O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(qf padding) {
        super(u.f72614n.n(), padding == qf.f72606t ? 2 : 1, padding == qf.f72603O ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72522O = padding;
    }

    public boolean equals(Object obj) {
        return (obj instanceof K) && this.f72522O == ((K) obj).f72522O;
    }

    public int hashCode() {
        return this.f72522O.hashCode();
    }
}
