package gAe;

import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import gAe.UGc;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import uBO.C2401c;
import uBO.Ew;
import uBO.Ln;
import uBO.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z f67137n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Cvc.j f67138t = Cvc.j.rl;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CN3 f67140n;
        private final boolean nr;
        private final C rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f67141t;

        /* synthetic */ n(CN3 cn3, C c2, int i2, boolean z2, j jVar) {
            this(cn3, c2, i2, z2);
        }

        private n(CN3 cn3, C c2, int i2, boolean z2) {
            this.f67140n = cn3;
            this.rl = c2;
            this.f67141t = i2;
            this.nr = z2;
        }

        public CN3 n() {
            return this.f67140n;
        }
    }

    public static final Pl ty(eO eOVar, gAe.j jVar) {
        return HI(eOVar, jVar, new byte[0]);
    }

    public void r(z zVar, gAe.j jVar) {
        o(zVar, jVar, new byte[0]);
    }

    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f67139n;

        static {
            int[] iArr = new int[uBO.ci.values().length];
            f67139n = iArr;
            try {
                iArr[uBO.ci.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67139n[uBO.ci.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67139n[uBO.ci.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static List J2(Z z2) {
        ArrayList arrayList = new ArrayList(z2.p5());
        for (Z.w6 w6Var : z2.eF()) {
            int iP5 = w6Var.p5();
            try {
                arrayList.add(new n(gX.Dsr.n().nr(Ik(w6Var), Wre.n()), az(w6Var.E()), iP5, iP5 == z2.E(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static C az(uBO.ci ciVar) throws GeneralSecurityException {
        int i2 = j.f67139n[ciVar.ordinal()];
        if (i2 == 1) {
            return C.rl;
        }
        if (i2 == 2) {
            return C.f67131t;
        }
        if (i2 == 3) {
            return C.nr;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    private static void n(C2401c c2401c) throws GeneralSecurityException {
        if (c2401c == null || c2401c.U().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private Object qie(Class cls, Class cls2) throws GeneralSecurityException {
        ci.nr(this.f67137n);
        UGc.n nVarMUb = UGc.mUb(cls2);
        nVarMUb.O(this.f67138t);
        for (int i2 = 0; i2 < ck(); i2++) {
            Z.w6 w6VarM7 = this.f67137n.M7(i2);
            if (w6VarM7.E().equals(uBO.ci.ENABLED)) {
                Object objMUb = mUb(w6VarM7, cls2);
                Object objUo = this.rl.get(i2) != null ? Uo(((n) this.rl.get(i2)).n(), cls2) : null;
                if (w6VarM7.p5() == this.f67137n.E()) {
                    nVarMUb.rl(objUo, objMUb, w6VarM7);
                } else {
                    nVarMUb.n(objUo, objMUb, w6VarM7);
                }
            }
        }
        return r.HI(nVarMUb.nr(), cls);
    }

    private static void rl(Z z2) throws GeneralSecurityException {
        if (z2 == null || z2.p5() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    Z KN() {
        return this.f67137n;
    }

    public int ck() {
        return this.f67137n.p5();
    }

    public void o(z zVar, gAe.j jVar, byte[] bArr) {
        zVar.rl(nr(this.f67137n, jVar, bArr));
    }

    public Ew xMQ() {
        return ci.rl(this.f67137n);
    }

    private Pl(Z z2, List list) {
        this.f67137n = z2;
        this.rl = list;
    }

    public static final Pl HI(eO eOVar, gAe.j jVar, byte[] bArr) throws GeneralSecurityException {
        C2401c c2401cN = eOVar.n();
        n(c2401cN);
        return O(t(c2401cN, jVar, bArr));
    }

    private static gX.Xo Ik(Z.w6 w6Var) {
        Integer numValueOf;
        int iP5 = w6Var.p5();
        if (w6Var.eF() == Ln.RAW) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iP5);
        }
        try {
            return gX.Xo.rl(w6Var.M7().p5(), w6Var.M7().eF(), w6Var.M7().M7(), w6Var.eF(), numValueOf);
        } catch (GeneralSecurityException e2) {
            throw new TinkBugException("Creating a protokey serialization failed", e2);
        }
    }

    static final Pl O(Z z2) throws GeneralSecurityException {
        rl(z2);
        return new Pl(z2, J2(z2));
    }

    private Object Uo(CN3 cn3, Class cls) {
        try {
            return r.t(cn3, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static Object mUb(Z.w6 w6Var, Class cls) throws GeneralSecurityException {
        try {
            return r.Uo(w6Var.M7(), cls);
        } catch (GeneralSecurityException e2) {
            if (!e2.getMessage().contains("No key manager found for key type ") && !e2.getMessage().contains(" not supported by key manager of type ")) {
                throw e2;
            }
            return null;
        }
    }

    private static C2401c nr(Z z2, gAe.j jVar, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrN = jVar.n(z2.toByteArray(), bArr);
        try {
            if (Z.B(jVar.rl(bArrN, bArr), com.google.crypto.tink.shaded.protobuf.Xo.rl()).equals(z2)) {
                return (C2401c) C2401c.P5().az(com.google.crypto.tink.shaded.protobuf.fuX.J2(bArrN)).ty(ci.rl(z2)).t();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static Z t(C2401c c2401c, gAe.j jVar, byte[] bArr) throws GeneralSecurityException {
        try {
            Z zB = Z.B(jVar.rl(c2401c.U().r(), bArr), com.google.crypto.tink.shaded.protobuf.Xo.rl());
            rl(zB);
            return zB;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public Object gh(Class cls) throws GeneralSecurityException {
        Class clsNr = r.nr(cls);
        if (clsNr != null) {
            return qie(cls, clsNr);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public String toString() {
        return xMQ().toString();
    }
}
