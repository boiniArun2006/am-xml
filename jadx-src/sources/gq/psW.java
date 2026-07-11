package gq;

import gq.C2147u;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class psW extends yg {
    private boolean gh;
    private OU mUb;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final M f67832t = new M();
    private final Map nr = new HashMap();
    private final rv6 J2 = new rv6();
    private final Zs Uo = new Zs(this);
    private final Ln KN = new Ln();
    private final Md xMQ = new Md();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f67831O = new HashMap();

    public static psW HI(C2147u.n nVar, eO eOVar) {
        psW psw = new psW();
        psw.Z(new Lu(psw, nVar, eOVar));
        return psw;
    }

    private void Z(OU ou2) {
        this.mUb = ou2;
    }

    public static psW ty() {
        psW psw = new psW();
        psw.Z(new iwV(psw));
        return psw;
    }

    Iterable Ik() {
        return this.nr.values();
    }

    @Override // gq.yg
    InterfaceC2142m J2() {
        return new K();
    }

    @Override // gq.yg
    P O(VtZ.aC aCVar, qz qzVar) {
        h hVar = (h) this.nr.get(aCVar);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, aCVar);
        this.nr.put(aCVar, hVar2);
        return hVar2;
    }

    @Override // gq.yg
    public OU Uo() {
        return this.mUb;
    }

    @Override // gq.yg
    public void az() {
        wqP.n.t(!this.gh, "MemoryPersistence double-started!", new Object[0]);
        this.gh = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gq.yg
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public rv6 nr(VtZ.aC aCVar) {
        return this.J2;
    }

    @Override // gq.yg
    Object gh(String str, wqP.s4 s4Var) {
        this.mUb.az();
        try {
            return s4Var.get();
        } finally {
            this.mUb.qie();
        }
    }

    @Override // gq.yg
    public boolean mUb() {
        return this.gh;
    }

    @Override // gq.yg
    j n() {
        return this.KN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gq.yg
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Zs xMQ() {
        return this.Uo;
    }

    @Override // gq.yg
    void qie(String str, Runnable runnable) {
        this.mUb.az();
        try {
            runnable.run();
        } finally {
            this.mUb.qie();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gq.yg
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Md KN() {
        return this.xMQ;
    }

    @Override // gq.yg
    InterfaceC2143n rl(VtZ.aC aCVar) {
        lej lejVar = (lej) this.f67831O.get(aCVar);
        if (lejVar != null) {
            return lejVar;
        }
        lej lejVar2 = new lej();
        this.f67831O.put(aCVar, lejVar2);
        return lejVar2;
    }

    @Override // gq.yg
    CN3 t() {
        return this.f67832t;
    }

    private psW() {
    }
}
