package lD;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t2.CN3;
import t2.I28;
import t2.Wre;
import t2.w6;

/* JADX INFO: renamed from: lD.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class AbstractC2256j {
    public static final N1.n n(I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        if (i28 instanceof t2.Ml) {
            return new N1.w6(((t2.Ml) i28).n());
        }
        if (i28 instanceof CN3) {
            return new N1.CN3(((CN3) i28).n());
        }
        if (i28 instanceof Wre) {
            return new N1.I28(((Wre) i28).n());
        }
        if (i28 instanceof w6.n ? true : Intrinsics.areEqual(i28, w6.j.f73440n)) {
            return new N1.Ml(i28);
        }
        throw new NoWhenBranchMatchedException();
    }
}
