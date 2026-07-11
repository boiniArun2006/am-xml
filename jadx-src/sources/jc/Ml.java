package jc;

import Cvc.n;
import gAe.UGc;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ml implements gAe.Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f69467n = Logger.getLogger(Ml.class.getName());
    private static final Ml rl = new Ml();

    private static class n implements gAe.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final gAe.UGc f69468n;
        private final n.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n.j f69469t;

        @Override // gAe.j
        public byte[] rl(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (UGc.w6 w6Var : this.f69468n.J2(bArrCopyOf)) {
                    try {
                        byte[] bArrRl = ((gAe.j) w6Var.Uo()).rl(bArrCopyOfRange, bArr2);
                        this.f69469t.n(w6Var.nr(), bArrCopyOfRange.length);
                        return bArrRl;
                    } catch (GeneralSecurityException e2) {
                        Ml.f69467n.info("ciphertext prefix matches a key, but cannot decrypt: " + e2);
                    }
                }
            }
            for (UGc.w6 w6Var2 : this.f69468n.KN()) {
                try {
                    byte[] bArrRl2 = ((gAe.j) w6Var2.Uo()).rl(bArr, bArr2);
                    this.f69469t.n(w6Var2.nr(), bArr.length);
                    return bArrRl2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f69469t.rl();
            throw new GeneralSecurityException("decryption failed");
        }

        private n(gAe.UGc uGc) {
            this.f69468n = uGc;
            if (!uGc.xMQ()) {
                n.j jVar = gX.Wre.f67591n;
                this.rl = jVar;
                this.f69469t = jVar;
            } else {
                Cvc.n nVarN = gX.CN3.rl().n();
                Cvc.w6 w6VarN = gX.Wre.n(uGc);
                this.rl = nVarN.n(w6VarN, "aead", "encrypt");
                this.f69469t = nVarN.n(w6VarN, "aead", "decrypt");
            }
        }

        @Override // gAe.j
        public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            try {
                byte[] bArrN = B8M.Wre.n(this.f69468n.O().rl(), ((gAe.j) this.f69468n.O().Uo()).n(bArr, bArr2));
                this.rl.n(this.f69468n.O().nr(), bArr.length);
                return bArrN;
            } catch (GeneralSecurityException e2) {
                this.rl.rl();
                throw e2;
            }
        }
    }

    public static void O() {
        gAe.r.ty(rl);
    }

    @Override // gAe.Q
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public gAe.j rl(gAe.UGc uGc) {
        return new n(uGc);
    }

    @Override // gAe.Q
    public Class n() {
        return gAe.j.class;
    }

    @Override // gAe.Q
    public Class t() {
        return gAe.j.class;
    }

    Ml() {
    }
}
