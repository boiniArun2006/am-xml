package to2;

import B8M.Wre;
import Cvc.n;
import gAe.I28;
import gAe.Q;
import gAe.UGc;
import gAe.r;
import gX.CN3;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 implements Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f73673n = Logger.getLogger(w6.class.getName());
    private static final w6 rl = new w6();

    private static class j implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final UGc f73674n;
        private final n.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n.j f73675t;

        @Override // gAe.I28
        public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (UGc.w6 w6Var : this.f73674n.J2(bArrCopyOf)) {
                    try {
                        byte[] bArrRl = ((I28) w6Var.Uo()).rl(bArrCopyOfRange, bArr2);
                        this.f73675t.n(w6Var.nr(), bArrCopyOfRange.length);
                        return bArrRl;
                    } catch (GeneralSecurityException e2) {
                        w6.f73673n.info("ciphertext prefix matches a key, but cannot decrypt: " + e2);
                    }
                }
            }
            for (UGc.w6 w6Var2 : this.f73674n.KN()) {
                try {
                    byte[] bArrRl2 = ((I28) w6Var2.Uo()).rl(bArr, bArr2);
                    this.f73675t.n(w6Var2.nr(), bArr.length);
                    return bArrRl2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f73675t.rl();
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // gAe.I28
        public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrN = Wre.n(this.f73674n.O().rl(), ((I28) this.f73674n.O().Uo()).n(bArr, bArr2));
                this.rl.n(this.f73674n.O().nr(), bArr.length);
                return bArrN;
            } catch (GeneralSecurityException e2) {
                this.rl.rl();
                throw e2;
            }
        }

        public j(UGc uGc) {
            this.f73674n = uGc;
            if (uGc.xMQ()) {
                Cvc.n nVarN = CN3.rl().n();
                Cvc.w6 w6VarN = gX.Wre.n(uGc);
                this.rl = nVarN.n(w6VarN, "daead", "encrypt");
                this.f73675t = nVarN.n(w6VarN, "daead", "decrypt");
                return;
            }
            n.j jVar = gX.Wre.f67591n;
            this.rl = jVar;
            this.f73675t = jVar;
        }
    }

    public static void O() {
        r.ty(rl);
    }

    @Override // gAe.Q
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public I28 rl(UGc uGc) {
        return new j(uGc);
    }

    @Override // gAe.Q
    public Class n() {
        return I28.class;
    }

    @Override // gAe.Q
    public Class t() {
        return I28.class;
    }

    w6() {
    }
}
