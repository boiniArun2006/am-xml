package hw;

import gAe.InterfaceC2113c;
import gAe.o;
import gAe.r;
import gX.Ml;
import gX.o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.SPz;

/* JADX INFO: renamed from: hw.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C2162w6 extends gX.Ml {
    private static final gX.o nr = gX.o.rl(new o.n() { // from class: hw.n
        @Override // gX.o.n
        public final Object n(gAe.CN3 cn3) {
            return new ykH.n((C2158j) cn3);
        }
    }, C2158j.class, InterfaceC2151CN3.class);

    /* JADX INFO: renamed from: hw.w6$j */
    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public InterfaceC2113c n(uBO.j jVar) {
            return new B8M.Xo(new B8M.qz(jVar.P5().r()), jVar.M7().U());
        }

        j(Class cls) {
            super(cls);
        }
    }

    /* JADX INFO: renamed from: hw.w6$n */
    class n extends Ml.j {
        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        public Map t() {
            HashMap map = new HashMap();
            uBO.n nVar = (uBO.n) uBO.n.M7().az(32).ty((uBO.w6) uBO.w6.P5().az(16).t()).t();
            o.n nVar2 = o.n.TINK;
            map.put("AES_CMAC", new Ml.j.C0947j(nVar, nVar2));
            map.put("AES256_CMAC", new Ml.j.C0947j((uBO.n) uBO.n.M7().az(32).ty((uBO.w6) uBO.w6.P5().az(16).t()).t(), nVar2));
            map.put("AES256_CMAC_RAW", new Ml.j.C0947j((uBO.n) uBO.n.M7().az(32).ty((uBO.w6) uBO.w6.P5().az(16).t()).t(), o.n.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.j n(uBO.n nVar) {
            return (uBO.j) uBO.j.eF().HI(0).az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(nVar.U()))).ty(nVar.P5()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.n nVar) throws GeneralSecurityException {
            C2162w6.Ik(nVar.P5());
            C2162w6.r(nVar.U());
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.n nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.n.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int az() {
        return 0;
    }

    C2162w6() {
        super(uBO.j.class, new j(InterfaceC2113c.class));
    }

    public static void HI(boolean z2) {
        r.qie(new C2162w6(), z2);
        AbstractC2155Wre.t();
        gX.fuX.t().nr(nr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i2) throws GeneralSecurityException {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.n.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Ik(uBO.w6 w6Var) throws GeneralSecurityException {
        if (w6Var.U() >= 10) {
            if (w6Var.U() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.j jVar) throws GeneralSecurityException {
        B8M.QJ.t(jVar.p5(), az());
        r(jVar.P5().size());
        Ik(jVar.M7());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public uBO.j KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.j.E(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }
}
