package to2;

import B8M.QJ;
import com.google.crypto.tink.shaded.protobuf.Xo;
import com.google.crypto.tink.shaded.protobuf.fuX;
import gAe.I28;
import gAe.o;
import gAe.r;
import gX.Ml;
import gX.qz;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uBO.C2402z;
import uBO.SPz;
import uBO.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j extends Ml {

    /* JADX INFO: renamed from: to2.j$j, reason: collision with other inner class name */
    class C1193j extends qz {
        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public I28 n(eO eOVar) {
            return new B8M.Ml(eOVar.U().r());
        }

        C1193j(Class cls) {
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
            map.put("AES256_SIV", new Ml.j.C0947j((C2402z) C2402z.U().az(64).t(), o.n.TINK));
            map.put("AES256_SIV_RAW", new Ml.j.C0947j((C2402z) C2402z.U().az(64).t(), o.n.RAW));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public eO n(C2402z c2402z) {
            return (eO) eO.M7().az(fuX.J2(B8M.eO.t(c2402z.jB()))).ty(j.this.gh()).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(C2402z c2402z) throws InvalidAlgorithmParameterException {
            if (c2402z.jB() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + c2402z.jB() + ". Valid keys must have 64 bytes.");
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public C2402z nr(fuX fux) {
            return C2402z.P5(fux, Xo.rl());
        }
    }

    public int gh() {
        return 0;
    }

    j() {
        super(eO.class, new C1193j(I28.class));
    }

    public static void az(boolean z2) {
        r.qie(new j(), z2);
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(C2402z.class);
    }

    @Override // gX.Ml
    public SPz.w6 Uo() {
        return SPz.w6.SYMMETRIC;
    }

    @Override // gX.Ml
    public String nr() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public eO KN(fuX fux) {
        return eO.p5(fux, Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public void mUb(eO eOVar) throws GeneralSecurityException {
        QJ.t(eOVar.P5(), gh());
        if (eOVar.U().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + eOVar.U().size() + ". Valid keys must have 64 bytes.");
    }
}
