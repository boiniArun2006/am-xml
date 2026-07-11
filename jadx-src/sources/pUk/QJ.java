package pUk;

import com.google.android.gms.ads.identifier.Ov.YmsTEL;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class QJ implements fuX {
    private l3D J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private UGc f71994O;
    private j Uo;
    private UGc nr;
    private final C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private n f71995t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private enum j {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private enum n {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private QJ(C c2) {
        this.rl = c2;
        this.f71994O = UGc.f72007t;
    }

    public static QJ HI(C c2, UGc uGc, l3D l3d) {
        return new QJ(c2).gh(uGc, l3d);
    }

    public static QJ Ik(C c2, UGc uGc) {
        return new QJ(c2).qie(uGc);
    }

    public static QJ ck(C c2) {
        n nVar = n.INVALID;
        UGc uGc = UGc.f72007t;
        return new QJ(c2, nVar, uGc, uGc, new l3D(), j.SYNCED);
    }

    public static QJ r(C c2, UGc uGc) {
        return new QJ(c2).az(uGc);
    }

    @Override // pUk.fuX
    public boolean J2() {
        return this.f71995t.equals(n.NO_DOCUMENT);
    }

    @Override // pUk.fuX
    public boolean KN() {
        return this.f71995t.equals(n.FOUND_DOCUMENT);
    }

    @Override // pUk.fuX
    public boolean Uo() {
        return this.f71995t.equals(n.UNKNOWN_DOCUMENT);
    }

    public QJ XQ(UGc uGc) {
        this.f71994O = uGc;
        return this;
    }

    public QJ Z() {
        this.Uo = j.HAS_LOCAL_MUTATIONS;
        this.nr = UGc.f72007t;
        return this;
    }

    public QJ az(UGc uGc) {
        this.nr = uGc;
        this.f71995t = n.UNKNOWN_DOCUMENT;
        this.J2 = new l3D();
        this.Uo = j.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QJ.class != obj.getClass()) {
            return false;
        }
        QJ qj = (QJ) obj;
        if (this.rl.equals(qj.rl) && this.nr.equals(qj.nr) && this.f71995t.equals(qj.f71995t) && this.Uo.equals(qj.Uo)) {
            return this.J2.equals(qj.J2);
        }
        return false;
    }

    @Override // pUk.fuX
    public l3D getData() {
        return this.J2;
    }

    @Override // pUk.fuX
    public C getKey() {
        return this.rl;
    }

    @Override // pUk.fuX
    public UGc getVersion() {
        return this.nr;
    }

    public QJ gh(UGc uGc, l3D l3d) {
        this.nr = uGc;
        this.f71995t = n.FOUND_DOCUMENT;
        this.J2 = l3d;
        this.Uo = j.SYNCED;
        return this;
    }

    public int hashCode() {
        return this.rl.hashCode();
    }

    @Override // pUk.fuX
    public UGc mUb() {
        return this.f71994O;
    }

    @Override // pUk.fuX
    public QJ n() {
        return new QJ(this.rl, this.f71995t, this.nr, this.f71994O, this.J2.clone(), this.Uo);
    }

    public QJ o() {
        this.Uo = j.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public QJ qie(UGc uGc) {
        this.nr = uGc;
        this.f71995t = n.NO_DOCUMENT;
        this.J2 = new l3D();
        this.Uo = j.SYNCED;
        return this;
    }

    @Override // pUk.fuX
    public boolean rl() {
        return this.Uo.equals(j.HAS_COMMITTED_MUTATIONS);
    }

    @Override // pUk.fuX
    public boolean t() {
        return this.Uo.equals(j.HAS_LOCAL_MUTATIONS);
    }

    public String toString() {
        return YmsTEL.Pzo + this.rl + ", version=" + this.nr + ", readTime=" + this.f71994O + ", type=" + this.f71995t + ", documentState=" + this.Uo + ", value=" + this.J2 + '}';
    }

    public boolean ty() {
        return !this.f71995t.equals(n.INVALID);
    }

    @Override // pUk.fuX
    public boolean O() {
        if (!t() && !rl()) {
            return false;
        }
        return true;
    }

    @Override // pUk.fuX
    public uB.s4 nr(z zVar) {
        return getData().KN(zVar);
    }

    private QJ(C c2, n nVar, UGc uGc, UGc uGc2, l3D l3d, j jVar) {
        this.rl = c2;
        this.nr = uGc;
        this.f71994O = uGc2;
        this.f71995t = nVar;
        this.Uo = jVar;
        this.J2 = l3d;
    }
}
