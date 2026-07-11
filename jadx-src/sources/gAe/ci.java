package gAe;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import uBO.Ew;
import uBO.Ln;
import uBO.SPz;
import uBO.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Charset f67155n = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    public static Ew.w6 n(Z.w6 w6Var) {
        return (Ew.w6) Ew.w6.p5().ck(w6Var.M7().p5()).HI(w6Var.E()).ty(w6Var.eF()).az(w6Var.p5()).t();
    }

    public static void nr(Z z2) {
        int iE = z2.E();
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = true;
        for (Z.w6 w6Var : z2.eF()) {
            if (w6Var.E() == uBO.ci.ENABLED) {
                t(w6Var);
                if (w6Var.p5() == iE) {
                    if (!z3) {
                        z3 = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (w6Var.M7().M7() != SPz.w6.ASYMMETRIC_PUBLIC) {
                    z4 = false;
                }
                i2++;
            }
        }
        if (i2 != 0) {
            if (!z3 && !z4) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    public static Ew rl(Z z2) {
        Ew.n nVarTy = Ew.p5().ty(z2.E());
        Iterator it = z2.eF().iterator();
        while (it.hasNext()) {
            nVarTy.az(n((Z.w6) it.next()));
        }
        return (Ew) nVarTy.t();
    }

    public static void t(Z.w6 w6Var) throws GeneralSecurityException {
        if (w6Var.M()) {
            if (w6Var.eF() != Ln.UNKNOWN_PREFIX) {
                if (w6Var.E() != uBO.ci.UNKNOWN_STATUS) {
                    return;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(w6Var.p5())));
                }
            }
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(w6Var.p5())));
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(w6Var.p5())));
    }
}
