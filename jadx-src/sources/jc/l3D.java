package jc;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gX.n;
import java.security.GeneralSecurityException;
import jc.C2197z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class l3D {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f69502O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f69503n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f69504t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f69505n;

        static {
            int[] iArr = new int[uBO.Ln.values().length];
            f69505n = iArr;
            try {
                iArr[uBO.Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69505n[uBO.Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69505n[uBO.Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69505n[uBO.Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        nri.j jVarO = gX.l3D.O("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f69503n = jVarO;
        rl = gX.C.n(new aC(), C2197z.class, gX.eO.class);
        f69504t = gX.aC.n(new C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new o(), Xo.class, gX.Xo.class);
        f69502O = gX.n.n(new n.InterfaceC0948n() { // from class: jc.QJ
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, gAe.SPz sPz) {
                return l3D.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static C2197z.w6 O(uBO.Ln ln2) throws GeneralSecurityException {
        int i2 = j.f69505n[ln2.ordinal()];
        if (i2 == 1) {
            return C2197z.w6.rl;
        }
        if (i2 == 2 || i2 == 3) {
            return C2197z.w6.f69518t;
        }
        if (i2 == 4) {
            return C2197z.w6.nr;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f69504t);
        dsr.J2(nr);
        dsr.O(f69502O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Xo rl(gX.Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                uBO.o oVarP5 = uBO.o.p5(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (oVarP5.P5() == 0) {
                    return Xo.n().O(C2197z.n().t(oVarP5.U().size()).rl(12).nr(16).O(O(xo.O())).n()).nr(nri.n.n(oVarP5.U().r(), gAe.SPz.rl(sPz))).t(xo.t()).n();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
