package jc;

import gX.Ml;
import java.security.GeneralSecurityException;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Wre extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public B8M.o n(uBO.Wre wre) {
            return new B8M.j(wre.M7().r(), wre.p5().U());
        }

        j(Class cls) {
            super(cls);
        }
    }

    class n extends Ml.j {
        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.Wre n(uBO.CN3 cn3) {
            return (uBO.Wre) uBO.Wre.E().ty(cn3.M7()).az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(cn3.P5()))).HI(Wre.this.qie()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.CN3 cn3) throws GeneralSecurityException {
            B8M.QJ.n(cn3.P5());
            Wre.this.HI(cn3.M7());
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.CN3 nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.CN3.eF(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int qie() {
        return 0;
    }

    Wre() {
        super(uBO.Wre.class, new j(B8M.o.class));
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.CN3.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HI(uBO.fuX fux) throws GeneralSecurityException {
        if (fux.U() >= 12 && fux.U() <= 16) {
        } else {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public uBO.Wre KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.Wre.M(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.Wre wre) throws GeneralSecurityException {
        B8M.QJ.t(wre.eF(), qie());
        B8M.QJ.n(wre.M7().size());
        HI(wre.p5());
    }
}
