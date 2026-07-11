package jc;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gX.n;
import java.security.GeneralSecurityException;
import jc.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Pl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f69470O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f69471n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f69472t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f69473n;

        static {
            int[] iArr = new int[uBO.Ln.values().length];
            f69473n = iArr;
            try {
                iArr[uBO.Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69473n[uBO.Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69473n[uBO.Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69473n[uBO.Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        nri.j jVarO = gX.l3D.O("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f69471n = jVarO;
        rl = gX.C.n(new aC(), Dsr.class, gX.eO.class);
        f69472t = gX.aC.n(new C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new o(), CN3.class, gX.Xo.class);
        f69470O = gX.n.n(new n.InterfaceC0948n() { // from class: jc.qz
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, gAe.SPz sPz) {
                return Pl.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static Dsr.w6 O(uBO.Ln ln2) throws GeneralSecurityException {
        int i2 = j.f69473n[ln2.ordinal()];
        if (i2 == 1) {
            return Dsr.w6.rl;
        }
        if (i2 == 2 || i2 == 3) {
            return Dsr.w6.f69462t;
        }
        if (i2 == 4) {
            return Dsr.w6.nr;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f69472t);
        dsr.J2(nr);
        dsr.O(f69470O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CN3 rl(gX.Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                uBO.Dsr dsrE = uBO.Dsr.E(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (dsrE.p5() == 0) {
                    return CN3.n().O(Dsr.n().t(dsrE.P5().size()).rl(dsrE.M7().U()).nr(16).O(O(xo.O())).n()).nr(nri.n.n(dsrE.P5().r(), gAe.SPz.rl(sPz))).t(xo.t()).n();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
