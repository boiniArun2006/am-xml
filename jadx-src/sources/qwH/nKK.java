package qwH;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class nKK extends co4.QJ {
    private final DAz nr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nKK(DAz names) {
        super(Dsr.f72514n.t(), names.rl(), "monthName");
        Intrinsics.checkNotNullParameter(names, "names");
        this.nr = names;
    }

    public boolean equals(Object obj) {
        return (obj instanceof nKK) && Intrinsics.areEqual(this.nr.rl(), ((nKK) obj).nr.rl());
    }

    public int hashCode() {
        return this.nr.rl().hashCode();
    }
}
