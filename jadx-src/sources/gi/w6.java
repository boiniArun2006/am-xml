package gi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f67634n = j.f67635n;

    default boolean HI() {
        return false;
    }

    String Ik(EJn.Wre wre, int i2);

    char J2(EJn.Wre wre, int i2);

    byte T(EJn.Wre wre, int i2);

    float Uo(EJn.Wre wre, int i2);

    short ViF(EJn.Wre wre, int i2);

    default int X(EJn.Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    int XQ(EJn.Wre wre, int i2);

    I28 ck(EJn.Wre wre, int i2);

    Object e(EJn.Wre wre, int i2, XA.w6 w6Var, Object obj);

    Object fD(EJn.Wre wre, int i2, XA.w6 w6Var, Object obj);

    double iF(EJn.Wre wre, int i2);

    boolean mUb(EJn.Wre wre, int i2);

    DGv.Ml n();

    int nY(EJn.Wre wre);

    void t(EJn.Wre wre);

    long te(EJn.Wre wre, int i2);

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ j f67635n = new j();

        private j() {
        }
    }

    static /* synthetic */ Object O(w6 w6Var, EJn.Wre wre, int i2, XA.w6 w6Var2, Object obj, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i3 & 8) != 0) {
            obj = null;
        }
        return w6Var.fD(wre, i2, w6Var2, obj);
    }
}
