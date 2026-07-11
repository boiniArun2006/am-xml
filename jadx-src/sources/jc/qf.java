package jc;

import gAe.o;
import gX.Ml;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.M;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class qf extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.iwV iwv) {
            return new B8M.l3D(iwv.U().r());
        }

        j(Class cls) {
            super(cls);
        }
    }

    class n extends Ml.j {
        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(M m2) {
        }

        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        public Map t() {
            HashMap map = new HashMap();
            map.put("XCHACHA20_POLY1305", new Ml.j.C0947j(M.Xw(), o.n.TINK));
            map.put("XCHACHA20_POLY1305_RAW", new Ml.j.C0947j(M.Xw(), o.n.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.iwV n(M m2) {
            return (uBO.iwV) uBO.iwV.M7().ty(qf.this.gh()).az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(32))).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public M nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return M.jB(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int gh() {
        return 0;
    }

    qf() {
        super(uBO.iwV.class, new j(gAe.j.class));
    }

    public static void az(boolean z2) {
        gAe.r.qie(new qf(), z2);
        iwV.t();
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(M.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public uBO.iwV KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.iwV.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.iwV iwv) throws GeneralSecurityException {
        B8M.QJ.t(iwv.P5(), gh());
        if (iwv.U().size() == 32) {
        } else {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
