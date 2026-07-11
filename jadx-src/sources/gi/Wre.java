package gi;

import XA.eO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Wre {
    void E2(int i2);

    void HI(EJn.Wre wre, int i2);

    void Ik();

    Wre J2(EJn.Wre wre);

    void KN(byte b2);

    void T(String str);

    void Uo(double d2);

    void XQ(boolean z2);

    void aYN(float f3);

    void az(long j2);

    default void g() {
    }

    DGv.Ml n();

    void nY(char c2);

    void o(short s2);

    Ml rl(EJn.Wre wre);

    default void ViF(eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    default Ml mUb(EJn.Wre descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return rl(descriptor);
    }

    default void ty(eO serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().rl()) {
            ViF(serializer, obj);
        } else if (obj == null) {
            Ik();
        } else {
            g();
            ViF(serializer, obj);
        }
    }
}
