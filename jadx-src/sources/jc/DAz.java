package jc;

import gX.Ml;
import java.security.GeneralSecurityException;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DAz extends gX.Ml {

    class n extends Ml.j {
        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.u n(uBO.qf qfVar) {
            return (uBO.u) uBO.u.M7().az(qfVar).ty(DAz.this.gh()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.qf qfVar) throws GeneralSecurityException {
            if (!qfVar.U().isEmpty() && qfVar.P5()) {
            } else {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.qf nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.qf.M7(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int gh() {
        return 0;
    }

    class j extends gX.qz {
        j(Class cls) {
            super(cls);
        }

        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.u uVar) {
            String strU = uVar.U().U();
            return new nKK(uVar.U().jB(), gAe.l3D.n(strU).rl(strU));
        }
    }

    DAz() {
        super(uBO.u.class, new j(gAe.j.class));
    }

    public static void az(boolean z2) {
        gAe.r.qie(new DAz(), z2);
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.qf.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.REMOTE;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public uBO.u KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.u.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.u uVar) throws GeneralSecurityException {
        B8M.QJ.t(uVar.P5(), gh());
    }
}
