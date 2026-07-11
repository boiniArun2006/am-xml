package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ln extends co4.Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qf f72523O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ln(qf padding) {
        super(M.f72527n.nr(), padding == qf.f72606t ? 2 : 1, padding == qf.f72603O ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72523O = padding;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ln) && this.f72523O == ((Ln) obj).f72523O;
    }

    public int hashCode() {
        return this.f72523O.hashCode();
    }
}
