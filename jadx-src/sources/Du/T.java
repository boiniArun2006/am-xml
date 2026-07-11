package Du;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class T {
    public static final int n(EJn.Wre wre, EJn.Wre[] typeParams) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (wre.KN().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableN = EJn.aC.n(wre);
        Iterator it = iterableN.iterator();
        int iHashCode2 = 1;
        int i2 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i3 = i2 * 31;
            String strKN = ((EJn.Wre) it.next()).KN();
            if (strKN != null) {
                iHashCode3 = strKN.hashCode();
            }
            i2 = i3 + iHashCode3;
        }
        Iterator it2 = iterableN.iterator();
        while (it2.hasNext()) {
            int i5 = iHashCode2 * 31;
            EJn.Pl kind = ((EJn.Wre) it2.next()).getKind();
            iHashCode2 = i5 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i2) * 31) + iHashCode2;
    }
}
