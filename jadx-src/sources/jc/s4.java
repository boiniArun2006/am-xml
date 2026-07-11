package jc;

import gAe.o;
import gX.Ml;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import uBO.SPz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 extends gX.Ml {

    class j extends gX.qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public gAe.j n(uBO.Pl pl) {
            return new P3.j(pl.U().r());
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
            map.put("AES128_GCM_SIV", s4.az(16, nVar));
            o.n nVar2 = o.n.RAW;
            map.put("AES128_GCM_SIV_RAW", s4.az(16, nVar2));
            map.put("AES256_GCM_SIV", s4.az(32, nVar));
            map.put("AES256_GCM_SIV_RAW", s4.az(32, nVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public uBO.Pl n(uBO.Xo xo) {
            return (uBO.Pl) uBO.Pl.M7().az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(xo.jB()))).ty(s4.this.ty()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(uBO.Xo xo) throws InvalidAlgorithmParameterException {
            B8M.QJ.n(xo.jB());
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public uBO.Xo nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return uBO.Xo.P5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int ty() {
        return 0;
    }

    s4() {
        super(uBO.Pl.class, new j(gAe.j.class));
    }

    private static boolean qie() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(uBO.Xo.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ml.j.C0947j az(int i2, o.n nVar) {
        return new Ml.j.C0947j((uBO.Xo) uBO.Xo.U().az(i2).t(), nVar);
    }

    public static void ck(boolean z2) {
        if (qie()) {
            gAe.r.qie(new s4(), z2);
            r.t();
        }
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public uBO.Pl KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return uBO.Pl.p5(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public void mUb(uBO.Pl pl) throws GeneralSecurityException {
        B8M.QJ.t(pl.P5(), ty());
        B8M.QJ.n(pl.U().size());
    }
}
