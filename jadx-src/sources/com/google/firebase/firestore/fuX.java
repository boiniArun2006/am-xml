package com.google.firebase.firestore;

import java.util.Map;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FirebaseFirestore f60355n;
    private final DAz nr;
    private final pUk.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pUk.fuX f60356t;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.firebase.firestore.fuX$j, still in use, count: 1, list:
      (r0v0 com.google.firebase.firestore.fuX$j) from 0x0024: SPUT (r0v0 com.google.firebase.firestore.fuX$j) (LINE:38) com.google.firebase.firestore.fuX.j.J2 com.google.firebase.firestore.fuX$j
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class j {
        NONE,
        ESTIMATE,
        PREVIOUS;

        static final j J2 = new j();

        static {
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f60359r.clone();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        pUk.fuX fux;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux2 = (fuX) obj;
        return this.f60355n.equals(fux2.f60355n) && this.rl.equals(fux2.rl) && this.nr.equals(fux2.nr) && ((fux = this.f60356t) != null ? !(fux2.f60356t == null || !fux.getData().equals(fux2.f60356t.getData())) : fux2.f60356t == null);
    }

    static fuX O(FirebaseFirestore firebaseFirestore, pUk.C c2, boolean z2) {
        return new fuX(firebaseFirestore, c2, null, z2, false);
    }

    private Object mUb(pUk.z zVar, j jVar) {
        uB.s4 s4VarNr;
        pUk.fuX fux = this.f60356t;
        if (fux == null || (s4VarNr = fux.nr(zVar)) == null) {
            return null;
        }
        return new Ln(this.f60355n, jVar).J2(s4VarNr);
    }

    static fuX nr(FirebaseFirestore firebaseFirestore, pUk.fuX fux, boolean z2, boolean z3) {
        return new fuX(firebaseFirestore, fux.getKey(), fux, z2, z3);
    }

    public Object J2(C c2, j jVar) {
        AbstractC2418c.t(c2, "Provided field path must not be null.");
        AbstractC2418c.t(jVar, "Provided serverTimestampBehavior value must not be null.");
        return mUb(c2.rl(), jVar);
    }

    public Map KN(j jVar) {
        AbstractC2418c.t(jVar, "Provided serverTimestampBehavior value must not be null.");
        Ln ln2 = new Ln(this.f60355n, jVar);
        pUk.fuX fux = this.f60356t;
        if (fux == null) {
            return null;
        }
        return ln2.rl(fux.getData().xMQ());
    }

    public Object az(Class cls, j jVar) {
        AbstractC2418c.t(cls, "Provided POJO type must not be null.");
        AbstractC2418c.t(jVar, "Provided serverTimestampBehavior value must not be null.");
        Map mapKN = KN(jVar);
        if (mapKN == null) {
            return null;
        }
        return wqP.o.HI(mapKN, cls, gh());
    }

    public CN3 gh() {
        return new CN3(this.rl, this.f60355n);
    }

    public int hashCode() {
        int iHashCode = ((this.f60355n.hashCode() * 31) + this.rl.hashCode()) * 31;
        pUk.fuX fux = this.f60356t;
        int iHashCode2 = (iHashCode + (fux != null ? fux.getKey().hashCode() : 0)) * 31;
        pUk.fuX fux2 = this.f60356t;
        return ((iHashCode2 + (fux2 != null ? fux2.getData().hashCode() : 0)) * 31) + this.nr.hashCode();
    }

    public boolean n(C c2) {
        AbstractC2418c.t(c2, "Provided field path must not be null.");
        pUk.fuX fux = this.f60356t;
        return (fux == null || fux.nr(c2.rl()) == null) ? false : true;
    }

    public Object qie(Class cls) {
        return az(cls, j.J2);
    }

    public boolean t() {
        return this.f60356t != null;
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.rl + ", metadata=" + this.nr + ", doc=" + this.f60356t + '}';
    }

    public String xMQ() {
        return this.rl.gh();
    }

    fuX(FirebaseFirestore firebaseFirestore, pUk.C c2, pUk.fuX fux, boolean z2, boolean z3) {
        this.f60355n = (FirebaseFirestore) AbstractC2418c.rl(firebaseFirestore);
        this.rl = (pUk.C) AbstractC2418c.rl(c2);
        this.f60356t = fux;
        this.nr = new DAz(z3, z2);
    }

    public Object Uo(String str) {
        return J2(C.n(str), j.J2);
    }

    public boolean rl(String str) {
        return n(C.n(str));
    }
}
