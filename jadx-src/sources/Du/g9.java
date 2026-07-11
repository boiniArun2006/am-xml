package Du;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class g9 {
    public static final void n(int i2, int i3, EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i5 = (~i2) & i3;
        for (int i7 = 0; i7 < 32; i7++) {
            if ((i5 & 1) != 0) {
                arrayList.add(descriptor.O(i7));
            }
            i5 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.KN());
    }
}
