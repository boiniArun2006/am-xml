package hw;

import gAe.InterfaceC2113c;
import gAe.o;
import gVA.n;
import gX.Ml;
import gX.o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import uBO.Q;
import uBO.SPz;
import uBO.UGc;
import uBO.r;
import uBO.s4;

/* JADX INFO: renamed from: hw.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2150C extends gX.Ml {
    private static final gX.o nr = gX.o.rl(new o.n() { // from class: hw.aC
        @Override // gX.o.n
        public final Object n(gAe.CN3 cn3) {
            return new ykH.w6((C2152Dsr) cn3);
        }
    }, C2152Dsr.class, InterfaceC2151CN3.class);

    /* JADX INFO: renamed from: hw.C$n */
    class n extends Ml.j {
        n(Class cls) {
            super(cls);
        }

        @Override // gX.Ml.j
        public Map t() {
            HashMap map = new HashMap();
            s4 s4Var = s4.SHA256;
            o.n nVar = o.n.TINK;
            map.put("HMAC_SHA256_128BITTAG", C2150C.az(32, 16, s4Var, nVar));
            o.n nVar2 = o.n.RAW;
            map.put("HMAC_SHA256_128BITTAG_RAW", C2150C.az(32, 16, s4Var, nVar2));
            map.put("HMAC_SHA256_256BITTAG", C2150C.az(32, 32, s4Var, nVar));
            map.put("HMAC_SHA256_256BITTAG_RAW", C2150C.az(32, 32, s4Var, nVar2));
            s4 s4Var2 = s4.SHA512;
            map.put("HMAC_SHA512_128BITTAG", C2150C.az(64, 16, s4Var2, nVar));
            map.put("HMAC_SHA512_128BITTAG_RAW", C2150C.az(64, 16, s4Var2, nVar2));
            map.put("HMAC_SHA512_256BITTAG", C2150C.az(64, 32, s4Var2, nVar));
            map.put("HMAC_SHA512_256BITTAG_RAW", C2150C.az(64, 32, s4Var2, nVar2));
            map.put("HMAC_SHA512_512BITTAG", C2150C.az(64, 64, s4Var2, nVar));
            map.put("HMAC_SHA512_512BITTAG_RAW", C2150C.az(64, 64, s4Var2, nVar2));
            return Collections.unmodifiableMap(map);
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
        public UGc n(Q q2) {
            return (UGc) UGc.E().HI(C2150C.this.ty()).ty(q2.M7()).az(com.google.crypto.tink.shaded.protobuf.fuX.J2(B8M.eO.t(q2.P5()))).t();
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
        public void O(Q q2) throws GeneralSecurityException {
            if (q2.P5() >= 16) {
                C2150C.r(q2.M7());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }

        @Override // gX.Ml.j
        /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
        public Q nr(com.google.crypto.tink.shaded.protobuf.fuX fux) {
            return Q.eF(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        }
    }

    public int ty() {
        return 0;
    }

    /* JADX INFO: renamed from: hw.C$j */
    class j extends gX.qz {
        j(Class cls) {
            super(cls);
        }

        @Override // gX.qz
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public InterfaceC2113c n(UGc uGc) throws GeneralSecurityException {
            s4 s4VarP5 = uGc.p5().P5();
            SecretKeySpec secretKeySpec = new SecretKeySpec(uGc.M7().r(), "HMAC");
            int iM7 = uGc.p5().M7();
            int i2 = w6.f68000n[s4VarP5.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return new B8M.Xo(new B8M.Pl("HMACSHA512", secretKeySpec), iM7);
                            }
                            throw new GeneralSecurityException("unknown hash");
                        }
                        return new B8M.Xo(new B8M.Pl("HMACSHA384", secretKeySpec), iM7);
                    }
                    return new B8M.Xo(new B8M.Pl("HMACSHA256", secretKeySpec), iM7);
                }
                return new B8M.Xo(new B8M.Pl("HMACSHA224", secretKeySpec), iM7);
            }
            return new B8M.Xo(new B8M.Pl("HMACSHA1", secretKeySpec), iM7);
        }
    }

    /* JADX INFO: renamed from: hw.C$w6 */
    static /* synthetic */ class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f68000n;

        static {
            int[] iArr = new int[s4.values().length];
            f68000n = iArr;
            try {
                iArr[s4.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68000n[s4.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68000n[s4.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68000n[s4.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68000n[s4.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C2150C() {
        super(UGc.class, new j(InterfaceC2113c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Ml.j.C0947j az(int i2, int i3, s4 s4Var, o.n nVar) {
        return new Ml.j.C0947j((Q) Q.p5().ty((r) r.p5().az(s4Var).ty(i3).t()).az(i2).t(), nVar);
    }

    public static void ck(boolean z2) {
        gAe.r.qie(new C2150C(), z2);
        Pl.t();
        gX.fuX.t().nr(nr);
    }

    @Override // gX.Ml
    public Ml.j J2() {
        return new n(Q.class);
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
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(r rVar) throws GeneralSecurityException {
        if (rVar.M7() >= 10) {
            int i2 = w6.f68000n[rVar.P5().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                if (rVar.M7() > 64) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (rVar.M7() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    if (rVar.M7() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                if (rVar.M7() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (rVar.M7() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public UGc KN(com.google.crypto.tink.shaded.protobuf.fuX fux) {
        return UGc.M(fux, com.google.crypto.tink.shaded.protobuf.Xo.rl());
    }

    @Override // gX.Ml
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public void mUb(UGc uGc) throws GeneralSecurityException {
        B8M.QJ.t(uGc.eF(), ty());
        if (uGc.M7().size() >= 16) {
            r(uGc.p5());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
