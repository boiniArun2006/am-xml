package uh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import pUk.C2331c;
import uh.qf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ln {
    private static final qf gh;
    private static final qf qie;
    private final String J2;
    private final j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C2331c f74447O;
    private final long Uo;
    private final Dsr mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f74448n;
    private final List nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private vd f74449t;
    private final Dsr xMQ;

    public enum j {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    private static class n implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f74453n;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(pUk.fuX fux, pUk.fuX fux2) {
            Iterator it = this.f74453n.iterator();
            while (it.hasNext()) {
                int iN = ((qf) it.next()).n(fux, fux2);
                if (iN != 0) {
                    return iN;
                }
            }
            return 0;
        }

        n(List list) {
            boolean z2;
            Iterator it = list.iterator();
            loop0: while (true) {
                z2 = false;
                while (it.hasNext()) {
                    z2 = (z2 || ((qf) it.next()).t().equals(pUk.z.f72033t)) ? true : z2;
                }
            }
            if (z2) {
                this.f74453n = list;
                return;
            }
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }
    }

    public Ln(C2331c c2331c, String str, List list, List list2, long j2, j jVar, Dsr dsr, Dsr dsr2) {
        this.f74447O = c2331c;
        this.J2 = str;
        this.f74448n = list2;
        this.nr = list;
        this.Uo = j2;
        this.KN = jVar;
        this.xMQ = dsr;
        this.mUb = dsr2;
    }

    private synchronized vd ViF(List list) {
        if (this.KN == j.LIMIT_TO_FIRST) {
            return new vd(qie(), nr(), Uo(), list, this.Uo, az(), O());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qf qfVar = (qf) it.next();
            qf.j jVarRl = qfVar.rl();
            qf.j jVar = qf.j.DESCENDING;
            if (jVarRl == jVar) {
                jVar = qf.j.ASCENDING;
            }
            arrayList.add(qf.nr(jVar, qfVar.t()));
        }
        Dsr dsr = this.mUb;
        Dsr dsr2 = dsr != null ? new Dsr(dsr.rl(), this.mUb.t()) : null;
        Dsr dsr3 = this.xMQ;
        return new vd(qie(), nr(), Uo(), arrayList, this.Uo, dsr2, dsr3 != null ? new Dsr(dsr3.rl(), this.xMQ.t()) : null);
    }

    public synchronized vd aYN() {
        try {
            if (this.f74449t == null) {
                this.f74449t = ViF(gh());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f74449t;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    public synchronized java.util.List gh() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r0 = r6.rl     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L9b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.List r2 = r6.f74448n     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            uh.qf r3 = (uh.qf) r3     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            pUk.z r3 = r3.rl     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.t()     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L15
        L2e:
            r0 = move-exception
            goto L9f
        L30:
            java.util.List r2 = r6.f74448n     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            if (r2 <= 0) goto L4b
            java.util.List r2 = r6.f74448n     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2e
            uh.qf r2 = (uh.qf) r2     // Catch: java.lang.Throwable -> L2e
            uh.qf$j r2 = r2.rl()     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L4b:
            uh.qf$j r2 = uh.qf.j.ASCENDING     // Catch: java.lang.Throwable -> L2e
        L4d:
            java.util.SortedSet r3 = r6.KN()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2e
        L55:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2e
            pUk.z r4 = (pUk.z) r4     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r4.t()     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            boolean r5 = r4.XQ()     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            uh.qf r4 = uh.qf.nr(r2, r4)     // Catch: java.lang.Throwable -> L2e
            r0.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L55
        L79:
            pUk.z r3 = pUk.z.f72033t     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.t()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L95
            uh.qf$j r1 = uh.qf.j.ASCENDING     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L90
            uh.qf r1 = uh.Ln.gh     // Catch: java.lang.Throwable -> L2e
            goto L92
        L90:
            uh.qf r1 = uh.Ln.qie     // Catch: java.lang.Throwable -> L2e
        L92:
            r0.add(r1)     // Catch: java.lang.Throwable -> L2e
        L95:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L2e
            r6.rl = r0     // Catch: java.lang.Throwable -> L2e
        L9b:
            java.util.List r0 = r6.rl     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            return r0
        L9f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uh.Ln.gh():java.util.List");
    }

    static {
        qf.j jVar = qf.j.ASCENDING;
        pUk.z zVar = pUk.z.f72033t;
        gh = qf.nr(jVar, zVar);
        qie = qf.nr(qf.j.DESCENDING, zVar);
    }

    private boolean XQ(pUk.fuX fux) {
        Iterator it = this.nr.iterator();
        while (it.hasNext()) {
            if (!((AbstractC2405z) it.next()).nr(fux)) {
                return false;
            }
        }
        return true;
    }

    private boolean Z(pUk.fuX fux) {
        Dsr dsr = this.xMQ;
        if (dsr != null && !dsr.J2(gh(), fux)) {
            return false;
        }
        Dsr dsr2 = this.mUb;
        return dsr2 == null || dsr2.O(gh(), fux);
    }

    public static Ln rl(C2331c c2331c) {
        return new Ln(c2331c, null);
    }

    public boolean HI() {
        return this.J2 != null;
    }

    public Ln Ik(long j2) {
        return new Ln(this.f74447O, this.J2, this.nr, this.f74448n, j2, j.LIMIT_TO_FIRST, this.xMQ, this.mUb);
    }

    public List J2() {
        return this.f74448n;
    }

    public SortedSet KN() {
        TreeSet treeSet = new TreeSet();
        Iterator it = Uo().iterator();
        while (it.hasNext()) {
            for (eO eOVar : ((AbstractC2405z) it.next()).t()) {
                if (eOVar.xMQ()) {
                    treeSet.add(eOVar.J2());
                }
            }
        }
        return treeSet;
    }

    public Dsr O() {
        return this.mUb;
    }

    public List Uo() {
        return this.nr;
    }

    public Dsr az() {
        return this.xMQ;
    }

    public boolean ck() {
        return pUk.C.ty(this.f74447O) && this.J2 == null && this.nr.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ln.class != obj.getClass()) {
            return false;
        }
        Ln ln2 = (Ln) obj;
        if (this.KN != ln2.KN) {
            return false;
        }
        return aYN().equals(ln2.aYN());
    }

    public j mUb() {
        return this.KN;
    }

    public Ln n(C2331c c2331c) {
        return new Ln(c2331c, null, this.nr, this.f74448n, this.Uo, this.KN, this.xMQ, this.mUb);
    }

    public String nr() {
        return this.J2;
    }

    public boolean o() {
        return this.nr.isEmpty() && this.Uo == -1 && this.xMQ == null && this.mUb == null && (J2().isEmpty() || (J2().size() == 1 && ((qf) J2().get(0)).rl.XQ()));
    }

    public C2331c qie() {
        return this.f74447O;
    }

    public Comparator t() {
        return new n(gh());
    }

    public String toString() {
        return "Query(target=" + aYN().toString() + ";limitType=" + this.KN.toString() + ")";
    }

    public boolean ty() {
        return this.Uo != -1;
    }

    public long xMQ() {
        return this.Uo;
    }

    private boolean S(pUk.fuX fux) {
        for (qf qfVar : gh()) {
            if (!qfVar.t().equals(pUk.z.f72033t) && fux.nr(qfVar.rl) == null) {
                return false;
            }
        }
        return true;
    }

    private boolean WPU(pUk.fuX fux) {
        C2331c c2331cQie = fux.getKey().qie();
        if (this.J2 != null) {
            if (!fux.getKey().az(this.J2) || !this.f74447O.az(c2331cQie)) {
                return false;
            }
            return true;
        }
        if (pUk.C.ty(this.f74447O)) {
            return this.f74447O.equals(c2331cQie);
        }
        if (!this.f74447O.az(c2331cQie) || this.f74447O.ty() != c2331cQie.ty() - 1) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (aYN().hashCode() * 31) + this.KN.hashCode();
    }

    public boolean r(pUk.fuX fux) {
        if (fux.KN() && WPU(fux) && S(fux) && XQ(fux) && Z(fux)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Ln(C2331c c2331c, String str) {
        List list = Collections.EMPTY_LIST;
        this(c2331c, str, list, list, -1L, j.LIMIT_TO_FIRST, null, null);
    }
}
