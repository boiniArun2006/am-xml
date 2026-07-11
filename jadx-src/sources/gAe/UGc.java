package gAe;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import uBO.Ln;
import uBO.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f67143O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentMap f67144n;
    private final Cvc.j nr;
    private w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Class f67145t;

    private static class Ml implements Comparable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final byte[] f67146n;

        private Ml(byte[] bArr) {
            this.f67146n = Arrays.copyOf(bArr, bArr.length);
        }

        public boolean equals(Object obj) {
            if (obj instanceof Ml) {
                return Arrays.equals(this.f67146n, ((Ml) obj).f67146n);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f67146n);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(Ml ml) {
            byte[] bArr = this.f67146n;
            int length = bArr.length;
            byte[] bArr2 = ml.f67146n;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i2 = 0;
            while (true) {
                byte[] bArr3 = this.f67146n;
                if (i2 >= bArr3.length) {
                    return 0;
                }
                byte b2 = bArr3[i2];
                byte b4 = ml.f67146n[i2];
                if (b2 != b4) {
                    return b2 - b4;
                }
                i2++;
            }
        }

        public String toString() {
            return B8M.C.rl(this.f67146n);
        }
    }

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f67147n;
        private Cvc.j nr;
        private ConcurrentMap rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private w6 f67148t;

        public n n(Object obj, Object obj2, Z.w6 w6Var) {
            return t(obj, obj2, w6Var, false);
        }

        public n rl(Object obj, Object obj2, Z.w6 w6Var) {
            return t(obj, obj2, w6Var, true);
        }

        private n(Class cls) {
            this.rl = new ConcurrentHashMap();
            this.f67147n = cls;
            this.nr = Cvc.j.rl;
        }

        private n t(Object obj, Object obj2, Z.w6 w6Var, boolean z2) throws GeneralSecurityException {
            if (this.rl == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (w6Var.E() != uBO.ci.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            w6 w6VarRl = UGc.rl(obj, obj2, w6Var, this.rl);
            if (!z2) {
                return this;
            }
            if (this.f67148t != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f67148t = w6VarRl;
            return this;
        }

        public n O(Cvc.j jVar) {
            if (this.rl == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.nr = jVar;
            return this;
        }

        public UGc nr() {
            ConcurrentMap concurrentMap = this.rl;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            UGc uGc = new UGc(concurrentMap, this.f67148t, this.nr, this.f67147n);
            this.rl = null;
            return uGc;
        }
    }

    public static final class w6 {
        private final int J2;
        private final CN3 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Ln f67149O;
        private final String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f67150n;
        private final uBO.ci nr;
        private final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final byte[] f67151t;

        public Ln J2() {
            return this.f67149O;
        }

        public uBO.ci KN() {
            return this.nr;
        }

        public String O() {
            return this.Uo;
        }

        public Object Uo() {
            return this.rl;
        }

        public Object n() {
            return this.f67150n;
        }

        public int nr() {
            return this.J2;
        }

        public final byte[] rl() {
            byte[] bArr = this.f67151t;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public CN3 t() {
            return this.KN;
        }

        w6(Object obj, Object obj2, byte[] bArr, uBO.ci ciVar, Ln ln2, int i2, String str, CN3 cn3) {
            this.f67150n = obj;
            this.rl = obj2;
            this.f67151t = Arrays.copyOf(bArr, bArr.length);
            this.nr = ciVar;
            this.f67149O = ln2;
            this.J2 = i2;
            this.Uo = str;
            this.KN = cn3;
        }
    }

    private UGc(ConcurrentMap concurrentMap, w6 w6Var, Cvc.j jVar, Class cls) {
        this.f67144n = concurrentMap;
        this.rl = w6Var;
        this.f67145t = cls;
        this.nr = jVar;
        this.f67143O = false;
    }

    public static n mUb(Class cls) {
        return new n(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w6 rl(Object obj, Object obj2, Z.w6 w6Var, ConcurrentMap concurrentMap) {
        Integer numValueOf = Integer.valueOf(w6Var.p5());
        if (w6Var.eF() == Ln.RAW) {
            numValueOf = null;
        }
        w6 w6Var2 = new w6(obj, obj2, gAe.Ml.n(w6Var), w6Var.E(), w6Var.eF(), w6Var.p5(), w6Var.M7().p5(), gX.Dsr.n().nr(gX.Xo.rl(w6Var.M7().p5(), w6Var.M7().eF(), w6Var.M7().M7(), w6Var.eF(), numValueOf), Wre.n()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(w6Var2);
        Ml ml = new Ml(w6Var2.rl());
        List list = (List) concurrentMap.put(ml, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(w6Var2);
            concurrentMap.put(ml, Collections.unmodifiableList(arrayList2));
        }
        return w6Var2;
    }

    public List J2(byte[] bArr) {
        List list = (List) this.f67144n.get(new Ml(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public List KN() {
        return J2(gAe.Ml.f67135n);
    }

    public w6 O() {
        return this.rl;
    }

    public Class Uo() {
        return this.f67145t;
    }

    public Cvc.j nr() {
        return this.nr;
    }

    public Collection t() {
        return this.f67144n.values();
    }

    public boolean xMQ() {
        return !this.nr.rl().isEmpty();
    }
}
