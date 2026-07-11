package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class s4 extends co4.Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qf f72612O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(qf padding) {
        super(M.f72527n.rl(), padding == qf.f72606t ? 2 : 1, padding == qf.f72603O ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72612O = padding;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s4) && this.f72612O == ((s4) obj).f72612O;
    }

    public int hashCode() {
        return this.f72612O.hashCode();
    }
}
