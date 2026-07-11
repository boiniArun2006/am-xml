package jc;

import gX.Ml;
import java.security.GeneralSecurityException;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ew extends gX.Ml {

    class n extends Ml.j {
        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.DAz dAz) {
        }

        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.nKK n(uBO.DAz dAz) {
            return (uBO.nKK) uBO.nKK.M7().az(dAz).ty(Ew.this.gh()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.DAz nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.DAz.U(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
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
        public gAe.j n(uBO.nKK nkk) {
            String strJB = nkk.U().jB();
            return gAe.l3D.n(strJB).rl(strJB);
        }
    }

    Ew() {
        super(uBO.nKK.class, new j(gAe.j.class));
    }

    public static void az(boolean z2) {
        gAe.r.qie(new Ew(), z2);
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.DAz.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.REMOTE;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public uBO.nKK KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.nKK.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.nKK nkk) throws GeneralSecurityException {
        B8M.QJ.t(nkk.P5(), gh());
    }
}
