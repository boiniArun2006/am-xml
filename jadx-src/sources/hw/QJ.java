package hw;

import Cvc.n;
import gAe.InterfaceC2113c;
import gAe.Q;
import gAe.UGc;
import gAe.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import uBO.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class QJ implements Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f68016n = Logger.getLogger(QJ.class.getName());
    private static final byte[] rl = {0};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final QJ f68017t = new QJ();

    private static class n implements InterfaceC2113c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final UGc f68018n;
        private final n.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final n.j f68019t;

        @Override // gAe.InterfaceC2113c
        public void n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length <= 5) {
                this.f68019t.rl();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (UGc.w6 w6Var : this.f68018n.J2(bArrCopyOf)) {
                try {
                    ((InterfaceC2113c) w6Var.Uo()).n(bArrCopyOfRange, w6Var.J2().equals(Ln.LEGACY) ? B8M.Wre.n(bArr2, QJ.rl) : bArr2);
                    this.f68019t.n(w6Var.nr(), r3.length);
                    return;
                } catch (GeneralSecurityException e2) {
                    QJ.f68016n.info("tag prefix matches a key, but cannot verify: " + e2);
                }
            }
            for (UGc.w6 w6Var2 : this.f68018n.KN()) {
                try {
                    ((InterfaceC2113c) w6Var2.Uo()).n(bArr, bArr2);
                    this.f68019t.n(w6Var2.nr(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f68019t.rl();
            throw new GeneralSecurityException("invalid MAC");
        }

        private n(UGc uGc) {
            this.f68018n = uGc;
            if (!uGc.xMQ()) {
                n.j jVar = gX.Wre.f67591n;
                this.rl = jVar;
                this.f68019t = jVar;
            } else {
                Cvc.n nVarN = gX.CN3.rl().n();
                Cvc.w6 w6VarN = gX.Wre.n(uGc);
                this.rl = nVarN.n(w6VarN, "mac", "compute");
                this.f68019t = nVarN.n(w6VarN, "mac", "verify");
            }
        }

        @Override // gAe.InterfaceC2113c
        public byte[] rl(byte[] bArr) throws GeneralSecurityException {
            if (this.f68018n.O().J2().equals(Ln.LEGACY)) {
                bArr = B8M.Wre.n(bArr, QJ.rl);
            }
            try {
                byte[] bArrN = B8M.Wre.n(this.f68018n.O().rl(), ((InterfaceC2113c) this.f68018n.O().Uo()).rl(bArr));
                this.rl.n(this.f68018n.O().nr(), bArr.length);
                return bArrN;
            } catch (GeneralSecurityException e2) {
                this.rl.rl();
                throw e2;
            }
        }
    }

    public static void J2() {
        r.ty(f68017t);
    }

    @Override // gAe.Q
    public Class n() {
        return InterfaceC2113c.class;
    }

    @Override // gAe.Q
    public Class t() {
        return InterfaceC2113c.class;
    }

    QJ() {
    }

    private void Uo(UGc uGc) throws GeneralSecurityException {
        Iterator it = uGc.t().iterator();
        while (it.hasNext()) {
            for (UGc.w6 w6Var : (List) it.next()) {
                if (w6Var.t() instanceof eO) {
                    eO eOVar = (eO) w6Var.t();
                    nri.j jVarN = nri.j.n(w6Var.rl());
                    if (!jVarN.equals(eOVar.n())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + eOVar.rl() + " has wrong output prefix (" + eOVar.n() + ") instead of (" + jVarN + ")");
                    }
                }
            }
        }
    }

    @Override // gAe.Q
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public InterfaceC2113c rl(UGc uGc) throws GeneralSecurityException {
        Uo(uGc);
        return new n(uGc);
    }
}
