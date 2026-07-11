package EJn;

import Du.mrQ;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public static final KClass n(Wre wre) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        if (wre instanceof w6) {
            return ((w6) wre).rl;
        }
        if (wre instanceof mrQ) {
            return n(((mrQ) wre).mUb());
        }
        return null;
    }

    public static final Wre rl(DGv.Ml ml, Wre descriptor) {
        XA.Ml mlT;
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass kClassN = n(descriptor);
        if (kClassN == null || (mlT = DGv.Ml.t(ml, kClassN, null, 2, null)) == null) {
            return null;
        }
        return mlT.getDescriptor();
    }

    public static final Wre t(Wre wre, KClass context) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new w6(wre, context);
    }
}
