package hw;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gAe.SPz;
import gX.l3D;
import gX.n;
import hw.C2154Ml;
import java.security.GeneralSecurityException;
import uBO.Ln;

/* JADX INFO: renamed from: hw.Wre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class AbstractC2155Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f68020O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f68021n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f68022t;

    /* JADX INFO: renamed from: hw.Wre$j */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68023n;

        static {
            int[] iArr = new int[Ln.values().length];
            f68023n = iArr;
            try {
                iArr[Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68023n[Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68023n[Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68023n[Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        nri.j jVarO = l3D.O("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f68021n = jVarO;
        rl = gX.C.n(new jc.aC(), C2154Ml.class, gX.eO.class);
        f68022t = gX.aC.n(new jc.C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new jc.o(), C2158j.class, gX.Xo.class);
        f68020O = gX.n.n(new n.InterfaceC0948n() { // from class: hw.I28
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, SPz sPz) {
                return AbstractC2155Wre.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static C2154Ml.w6 O(Ln ln2) throws GeneralSecurityException {
        int i2 = j.f68023n[ln2.ordinal()];
        if (i2 == 1) {
            return C2154Ml.w6.rl;
        }
        if (i2 == 2) {
            return C2154Ml.w6.f68010t;
        }
        if (i2 == 3) {
            return C2154Ml.w6.nr;
        }
        if (i2 == 4) {
            return C2154Ml.w6.f68009O;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f68022t);
        dsr.J2(nr);
        dsr.O(f68020O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2158j rl(gX.Xo xo, SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                uBO.j jVarE = uBO.j.E(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (jVarE.p5() == 0) {
                    return C2158j.t().O(C2154Ml.n().rl(jVarE.P5().size()).t(jVarE.M7().U()).nr(O(xo.O())).n()).t(nri.n.n(jVarE.P5().r(), SPz.rl(sPz))).nr(xo.t()).n();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
