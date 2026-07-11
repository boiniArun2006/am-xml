package jc;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gX.n;
import java.security.GeneralSecurityException;
import jc.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f69484O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f69485n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f69486t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f69487n;

        static {
            int[] iArr = new int[uBO.Ln.values().length];
            f69487n = iArr;
            try {
                iArr[uBO.Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69487n[uBO.Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69487n[uBO.Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69487n[uBO.Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        nri.j jVarO = gX.l3D.O("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f69485n = jVarO;
        rl = gX.C.n(new aC(), g9s.class, gX.eO.class);
        f69486t = gX.aC.n(new C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new o(), SPz.class, gX.Xo.class);
        f69484O = gX.n.n(new n.InterfaceC0948n() { // from class: jc.afx
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, gAe.SPz sPz) {
                return Z.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static g9s.j O(uBO.Ln ln2) throws GeneralSecurityException {
        int i2 = j.f69487n[ln2.ordinal()];
        if (i2 == 1) {
            return g9s.j.rl;
        }
        if (i2 == 2 || i2 == 3) {
            return g9s.j.f69493t;
        }
        if (i2 == 4) {
            return g9s.j.nr;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f69486t);
        dsr.J2(nr);
        dsr.O(f69484O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SPz rl(gX.Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                uBO.QJ qjP5 = uBO.QJ.p5(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (qjP5.P5() == 0) {
                    return SPz.n(O(xo.O()), nri.n.n(qjP5.U().r(), gAe.SPz.rl(sPz)), xo.t());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
