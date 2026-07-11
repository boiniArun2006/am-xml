package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ew extends co4.Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qf f72521O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ew(qf padding) {
        super(Dsr.f72514n.t(), padding == qf.f72606t ? 2 : 1, padding == qf.f72603O ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72521O = padding;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Ew) && this.f72521O == ((Ew) obj).f72521O;
    }

    public int hashCode() {
        return this.f72521O.hashCode();
    }
}
