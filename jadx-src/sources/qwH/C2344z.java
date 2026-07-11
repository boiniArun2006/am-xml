package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qwH.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class C2344z extends co4.Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final qf f72621O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2344z(qf padding) {
        super(Dsr.f72514n.n(), padding == qf.f72606t ? 2 : 1, padding == qf.f72603O ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72621O = padding;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2344z) && this.f72621O == ((C2344z) obj).f72621O;
    }

    public int hashCode() {
        return this.f72621O.hashCode();
    }
}
