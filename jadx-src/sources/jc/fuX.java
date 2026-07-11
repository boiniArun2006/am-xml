package jc;

import gAe.o;
import gX.Ml;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.Dsr dsr) {
            return new B8M.n(dsr.P5().r(), dsr.M7().U());
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
        public Map t() {
            HashMap map = new HashMap();
            o.n nVar = o.n.TINK;
            map.put("AES128_EAX", fuX.qie(16, 16, nVar));
            o.n nVar2 = o.n.RAW;
            map.put("AES128_EAX_RAW", fuX.qie(16, 16, nVar2));
            map.put("AES256_EAX", fuX.qie(32, 16, nVar));
            map.put("AES256_EAX_RAW", fuX.qie(32, 16, nVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.Dsr n(uBO.aC aCVar) {
            return (uBO.Dsr) uBO.Dsr.eF().az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(aCVar.U()))).ty(aCVar.P5()).HI(fuX.this.az()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.aC aCVar) throws GeneralSecurityException {
            B8M.QJ.n(aCVar.U());
            if (aCVar.P5().U() != 12 && aCVar.P5().U() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.aC nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.aC.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int az() {
        return 0;
    }

    fuX() {
        super(uBO.Dsr.class, new j(gAe.j.class));
    }

    public static void HI(boolean z2) {
        gAe.r.qie(new fuX(), z2);
        Pl.t();
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.aC.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ml.j.C0947j qie(int i2, int i3, o.n nVar) {
        return new Ml.j.C0947j((uBO.aC) uBO.aC.M7().az(i2).ty((uBO.C) uBO.C.P5().az(i3).t()).t(), nVar);
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.Dsr dsr) throws GeneralSecurityException {
        B8M.QJ.t(dsr.p5(), az());
        B8M.QJ.n(dsr.P5().size());
        if (dsr.M7().U() != 12 && dsr.M7().U() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public uBO.Dsr KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.Dsr.E(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }
}
