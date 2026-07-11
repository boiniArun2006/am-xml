package gX;

import Cvc.n;
import Cvc.w6;
import gAe.UGc;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import uBO.ci;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n.j f67591n = new n(null);

    private static class n implements n.j {
        private n() {
        }

        @Override // Cvc.n.j
        public void n(int i2, long j2) {
        }

        @Override // Cvc.n.j
        public void rl() {
        }

        /* synthetic */ n(j jVar) {
            this();
        }
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67592n;

        static {
            int[] iArr = new int[ci.values().length];
            f67592n = iArr;
            try {
                iArr[ci.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67592n[ci.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67592n[ci.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String rl(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static gAe.C t(ci ciVar) {
        int i2 = j.f67592n[ciVar.ordinal()];
        if (i2 == 1) {
            return gAe.C.rl;
        }
        if (i2 == 2) {
            return gAe.C.f67131t;
        }
        if (i2 == 3) {
            return gAe.C.nr;
        }
        throw new IllegalStateException("Unknown key status");
    }

    public static Cvc.w6 n(UGc uGc) {
        w6.n nVarN = Cvc.w6.n();
        nVarN.nr(uGc.nr());
        Iterator it = uGc.t().iterator();
        while (it.hasNext()) {
            for (UGc.w6 w6Var : (List) it.next()) {
                nVarN.n(t(w6Var.KN()), w6Var.nr(), rl(w6Var.O()), w6Var.J2().name());
            }
        }
        if (uGc.O() != null) {
            nVarN.O(uGc.O().nr());
        }
        try {
            return nVarN.rl();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
