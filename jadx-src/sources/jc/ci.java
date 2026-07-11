package jc;

import gAe.o;
import gX.Ml;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ci extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.QJ qj) {
            return new B8M.CN3(qj.U().r());
        }

        j(Class cls) {
            super(cls);
        }
    }

    class n extends Ml.j {
        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.l3D l3d) {
        }

        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        public Map t() {
            HashMap map = new HashMap();
            map.put("CHACHA20_POLY1305", new Ml.j.C0947j(uBO.l3D.Xw(), o.n.TINK));
            map.put("CHACHA20_POLY1305_RAW", new Ml.j.C0947j(uBO.l3D.Xw(), o.n.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.QJ n(uBO.l3D l3d) {
            return (uBO.QJ) uBO.QJ.M7().ty(ci.this.gh()).az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(32))).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.l3D nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.l3D.jB(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int gh() {
        return 0;
    }

    ci() {
        super(uBO.QJ.class, new j(gAe.j.class));
    }

    public static void az(boolean z2) {
        gAe.r.qie(new ci(), z2);
        Z.t();
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.l3D.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public uBO.QJ KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.QJ.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.QJ qj) throws GeneralSecurityException {
        B8M.QJ.t(qj.P5(), gh());
        if (qj.U().size() == 32) {
        } else {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
