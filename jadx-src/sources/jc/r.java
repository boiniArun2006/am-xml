package jc;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gX.n;
import java.security.GeneralSecurityException;
import jc.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class r {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f69508O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f69509n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f69510t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f69511n;

        static {
            int[] iArr = new int[uBO.Ln.values().length];
            f69511n = iArr;
            try {
                iArr[uBO.Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69511n[uBO.Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69511n[uBO.Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69511n[uBO.Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        nri.j jVarO = gX.l3D.O("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f69509n = jVarO;
        rl = gX.C.n(new aC(), UGc.class, gX.eO.class);
        f69510t = gX.aC.n(new C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new o(), C2196c.class, gX.Xo.class);
        f69508O = gX.n.n(new n.InterfaceC0948n() { // from class: jc.Q
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, gAe.SPz sPz) {
                return r.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static UGc.w6 O(uBO.Ln ln2) throws GeneralSecurityException {
        int i2 = j.f69511n[ln2.ordinal()];
        if (i2 == 1) {
            return UGc.w6.rl;
        }
        if (i2 == 2 || i2 == 3) {
            return UGc.w6.f69478t;
        }
        if (i2 == 4) {
            return UGc.w6.nr;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f69510t);
        dsr.J2(nr);
        dsr.O(f69508O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C2196c rl(gX.Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                uBO.Pl plP5 = uBO.Pl.p5(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (plP5.P5() == 0) {
                    return C2196c.n().O(UGc.n().rl(plP5.U().size()).t(O(xo.O())).n()).nr(nri.n.n(plP5.U().r(), gAe.SPz.rl(sPz))).t(xo.t()).n();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
