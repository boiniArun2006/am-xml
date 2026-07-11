package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class QJ extends co4.QJ {
    private final l3D nr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QJ(l3D names) {
        super(Dsr.f72514n.rl(), names.rl(), "dayOfWeekName");
        Intrinsics.checkNotNullParameter(names, "names");
        this.nr = names;
    }

    public boolean equals(Object obj) {
        return (obj instanceof QJ) && Intrinsics.areEqual(this.nr.rl(), ((QJ) obj).nr.rl());
    }

    public int hashCode() {
        return this.nr.rl().hashCode();
    }
}
