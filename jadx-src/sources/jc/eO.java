package jc;

import gAe.o;
import gVA.n;
import gX.Ml;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class eO extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.o oVar) {
            return new B8M.w6(oVar.U().r());
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
            map.put("AES128_GCM", eO.qie(16, nVar));
            o.n nVar2 = o.n.RAW;
            map.put("AES128_GCM_RAW", eO.qie(16, nVar2));
            map.put("AES256_GCM", eO.qie(32, nVar));
            map.put("AES256_GCM_RAW", eO.qie(32, nVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.o n(uBO.qz qzVar) {
            return (uBO.o) uBO.o.M7().az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(qzVar.jB()))).ty(eO.this.az()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.qz qzVar) throws InvalidAlgorithmParameterException {
            B8M.QJ.n(qzVar.jB());
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.qz nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.qz.P5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int az() {
        return 0;
    }

    eO() {
        super(uBO.o.class, new j(gAe.j.class));
    }

    public static void HI(boolean z2) {
        gAe.r.qie(new eO(), z2);
        l3D.t();
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.qz.class);
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
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ml.j.C0947j qie(int i2, o.n nVar) {
        return new Ml.j.C0947j((uBO.qz) uBO.qz.U().az(i2).t(), nVar);
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.o oVar) throws GeneralSecurityException {
        B8M.QJ.t(oVar.P5(), az());
        B8M.QJ.n(oVar.U().size());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public uBO.o KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.o.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }
}
