package gi;

import XA.eO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface Ml {
    void O(EJn.Wre wre, int i2, String str);

    void S(EJn.Wre wre, int i2, eO eOVar, Object obj);

    void WPU(EJn.Wre wre, int i2, long j2);

    void X(EJn.Wre wre, int i2, eO eOVar, Object obj);

    Wre Z(EJn.Wre wre, int i2);

    void ck(EJn.Wre wre, int i2, double d2);

    void e(EJn.Wre wre, int i2, byte b2);

    void fD(EJn.Wre wre, int i2, int i3);

    void gh(EJn.Wre wre, int i2, short s2);

    void qie(EJn.Wre wre, int i2, boolean z2);

    default boolean r(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    void t(EJn.Wre wre);

    void te(EJn.Wre wre, int i2, float f3);

    void xMQ(EJn.Wre wre, int i2, char c2);
}
