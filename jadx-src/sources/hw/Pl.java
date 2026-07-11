package hw;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gAe.SPz;
import gX.l3D;
import gX.n;
import hw.C2160o;
import java.security.GeneralSecurityException;
import uBO.Ln;
import uBO.UGc;
import uBO.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f68012O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f68013n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f68014t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68015n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[Ln.values().length];
            rl = iArr;
            try {
                iArr[Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rl[Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                rl[Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[s4.values().length];
            f68015n = iArr2;
            try {
                iArr2[s4.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68015n[s4.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68015n[s4.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68015n[s4.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68015n[s4.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        nri.j jVarO = l3D.O("type.googleapis.com/google.crypto.tink.HmacKey");
        f68013n = jVarO;
        rl = gX.C.n(new jc.aC(), C2160o.class, gX.eO.class);
        f68014t = gX.aC.n(new jc.C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new jc.o(), C2152Dsr.class, gX.Xo.class);
        f68012O = gX.n.n(new n.InterfaceC0948n() { // from class: hw.qz
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, SPz sPz) {
                return Pl.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static C2160o.Ml J2(Ln ln2) throws GeneralSecurityException {
        int i2 = j.rl[ln2.ordinal()];
        if (i2 == 1) {
            return C2160o.Ml.rl;
        }
        if (i2 == 2) {
            return C2160o.Ml.f68035t;
        }
        if (i2 == 3) {
            return C2160o.Ml.nr;
        }
        if (i2 == 4) {
            return C2160o.Ml.f68034O;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    private static C2160o.w6 O(s4 s4Var) throws GeneralSecurityException {
        int i2 = j.f68015n[s4Var.ordinal()];
        if (i2 == 1) {
            return C2160o.w6.rl;
        }
        if (i2 == 2) {
            return C2160o.w6.f68040t;
        }
        if (i2 == 3) {
            return C2160o.w6.nr;
        }
        if (i2 == 4) {
            return C2160o.w6.f68039O;
        }
        if (i2 == 5) {
            return C2160o.w6.J2;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + s4Var.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f68014t);
        dsr.J2(nr);
        dsr.O(f68012O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2152Dsr rl(gX.Xo xo, SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                UGc uGcM = UGc.M(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (uGcM.eF() == 0) {
                    return C2152Dsr.t().O(C2160o.n().t(uGcM.M7().size()).nr(uGcM.p5().M7()).rl(O(uGcM.p5().P5())).O(J2(xo.O())).n()).nr(nri.n.n(uGcM.M7().r(), SPz.rl(sPz))).t(xo.t()).n();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
