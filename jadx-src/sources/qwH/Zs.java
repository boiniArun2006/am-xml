package qwH;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Zs extends co4.ci {
    private final qf J2;
    private final boolean Uo;

    public /* synthetic */ Zs(qf qfVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(qfVar, (i2 & 2) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zs(qf padding, boolean z2) {
        super(Dsr.f72514n.nr(), Integer.valueOf(padding != qf.f72606t ? 1 : 4), null, padding == qf.f72603O ? 4 : null, 4);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.J2 = padding;
        this.Uo = z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Zs)) {
            return false;
        }
        Zs zs = (Zs) obj;
        return this.J2 == zs.J2 && this.Uo == zs.Uo;
    }

    public int hashCode() {
        return (this.J2.hashCode() * 31) + Boolean.hashCode(this.Uo);
    }
}
