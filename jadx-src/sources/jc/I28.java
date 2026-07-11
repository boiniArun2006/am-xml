package jc;

import gAe.InterfaceC2113c;
import gAe.o;
import gVA.n;
import gX.Ml;
import hw.C2150C;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.Ml ml) {
            return new B8M.fuX((B8M.o) new Wre().O(ml.P5(), B8M.o.class), (InterfaceC2113c) new C2150C().O(ml.M7(), InterfaceC2113c.class), ml.M7().p5().M7());
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
        public uBO.Ml n(uBO.I28 i28) {
            uBO.Wre wre = (uBO.Wre) new Wre().J2().n(i28.U());
            return (uBO.Ml) uBO.Ml.eF().az(wre).ty((uBO.UGc) new C2150C().J2().n(i28.P5())).HI(I28.this.ty()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.I28 i28) throws InvalidAlgorithmParameterException {
            new Wre().J2().O(i28.U());
            new C2150C().J2().O(i28.P5());
            B8M.QJ.n(i28.U().P5());
        }

        @Override // gX.Ml.j
        public Map t() {
            HashMap map = new HashMap();
            uBO.s4 s4Var = uBO.s4.SHA256;
            o.n nVar = o.n.TINK;
            map.put("AES128_CTR_HMAC_SHA256", I28.qie(16, 16, 32, 16, s4Var, nVar));
            o.n nVar2 = o.n.RAW;
            map.put("AES128_CTR_HMAC_SHA256_RAW", I28.qie(16, 16, 32, 16, s4Var, nVar2));
            map.put("AES256_CTR_HMAC_SHA256", I28.qie(32, 16, 32, 32, s4Var, nVar));
            map.put("AES256_CTR_HMAC_SHA256_RAW", I28.qie(32, 16, 32, 32, s4Var, nVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.I28 nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.I28.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int ty() {
        return 0;
    }

    I28() {
        super(uBO.Ml.class, new j(gAe.j.class));
    }

    public static void ck(boolean z2) {
        gAe.r.qie(new I28(), z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ml.j.C0947j qie(int i2, int i3, int i5, int i7, uBO.s4 s4Var, o.n nVar) {
        return new Ml.j.C0947j(az(i2, i3, i5, i7, s4Var), nVar);
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.I28.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public n.EnumC0945n n() {
        return n.EnumC0945n.f67570t;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    private static uBO.I28 az(int i2, int i3, int i5, int i7, uBO.s4 s4Var) {
        uBO.CN3 cn3 = (uBO.CN3) uBO.CN3.p5().ty((uBO.fuX) uBO.fuX.P5().az(i3).t()).az(i2).t();
        return (uBO.I28) uBO.I28.M7().az(cn3).ty((uBO.Q) uBO.Q.p5().ty((uBO.r) uBO.r.p5().az(s4Var).ty(i7).t()).az(i5).t()).t();
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public uBO.Ml KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.Ml.E(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.Ml ml) throws GeneralSecurityException {
        B8M.QJ.t(ml.p5(), ty());
        new Wre().mUb(ml.P5());
        new C2150C().mUb(ml.M7());
    }
}
