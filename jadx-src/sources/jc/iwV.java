package jc;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gX.n;
import java.security.GeneralSecurityException;
import jc.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class iwV {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final gX.n f69495O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nri.j f69496n;
    private static final gX.w6 nr;
    private static final gX.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final gX.aC f69497t;

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f69498n;

        static {
            int[] iArr = new int[uBO.Ln.values().length];
            f69498n = iArr;
            try {
                iArr[uBO.Ln.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69498n[uBO.Ln.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69498n[uBO.Ln.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69498n[uBO.Ln.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        nri.j jVarO = gX.l3D.O("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f69496n = jVarO;
        rl = gX.C.n(new aC(), Ln.class, gX.eO.class);
        f69497t = gX.aC.n(new C(), jVarO, gX.eO.class);
        nr = gX.w6.n(new o(), u.class, gX.Xo.class);
        f69495O = gX.n.n(new n.InterfaceC0948n() { // from class: jc.lej
            @Override // gX.n.InterfaceC0948n
            public final gAe.CN3 n(gX.z zVar, gAe.SPz sPz) {
                return iwV.rl((gX.Xo) zVar, sPz);
            }
        }, jVarO, gX.Xo.class);
    }

    private static Ln.j O(uBO.Ln ln2) throws GeneralSecurityException {
        int i2 = j.f69498n[ln2.ordinal()];
        if (i2 == 1) {
            return Ln.j.rl;
        }
        if (i2 == 2 || i2 == 3) {
            return Ln.j.f69465t;
        }
        if (i2 == 4) {
            return Ln.j.nr;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + ln2.getNumber());
    }

    public static void nr(gX.Dsr dsr) {
        dsr.KN(rl);
        dsr.Uo(f69497t);
        dsr.J2(nr);
        dsr.O(f69495O);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static u rl(gX.Xo xo, gAe.SPz sPz) throws GeneralSecurityException {
        if (xo.J2().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                uBO.iwV iwvP5 = uBO.iwV.p5(xo.Uo(), com.google.crypto.tink.shaded.protobuf.Xo.rl());
                if (iwvP5.P5() == 0) {
                    return u.n(O(xo.O()), nri.n.n(iwvP5.U().r(), gAe.SPz.rl(sPz)), xo.t());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
    }

    public static void t() {
        nr(gX.Dsr.n());
    }
}
