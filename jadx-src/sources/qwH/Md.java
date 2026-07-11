package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Md extends co4.Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qf f72535O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Md(qf padding) {
        super(u.f72614n.t(), padding == qf.f72606t ? 2 : 1, padding == qf.f72603O ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72535O = padding;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Md) && this.f72535O == ((Md) obj).f72535O;
    }

    public int hashCode() {
        return this.f72535O.hashCode();
    }
}
