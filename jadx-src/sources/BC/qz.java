package BC;

import pUk.QJ;
import pUk.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qz {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f406t = new qz(null, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final UGc f407n;
    private final Boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qz.class == obj.getClass()) {
            qz qzVar = (qz) obj;
            UGc uGc = this.f407n;
            if (uGc == null ? qzVar.f407n != null : !uGc.equals(qzVar.f407n)) {
                return false;
            }
            Boolean bool = this.rl;
            Boolean bool2 = qzVar.rl;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public static qz J2(UGc uGc) {
        return new qz(uGc, null);
    }

    public static qz n(boolean z2) {
        return new qz(null, Boolean.valueOf(z2));
    }

    public boolean O(QJ qj) {
        if (this.f407n != null) {
            return qj.KN() && qj.getVersion().equals(this.f407n);
        }
        Boolean bool = this.rl;
        if (bool != null) {
            return bool.booleanValue() == qj.KN();
        }
        wqP.n.t(nr(), "Precondition should be empty", new Object[0]);
        return true;
    }

    public int hashCode() {
        UGc uGc = this.f407n;
        int iHashCode = (uGc != null ? uGc.hashCode() : 0) * 31;
        Boolean bool = this.rl;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public boolean nr() {
        return this.f407n == null && this.rl == null;
    }

    public Boolean rl() {
        return this.rl;
    }

    public UGc t() {
        return this.f407n;
    }

    private qz(UGc uGc, Boolean bool) {
        boolean z2;
        if (uGc != null && bool != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        wqP.n.t(z2, "Precondition can specify \"exists\" or \"updateTime\" but not both", new Object[0]);
        this.f407n = uGc;
        this.rl = bool;
    }

    public String toString() {
        if (nr()) {
            return "Precondition{<none>}";
        }
        if (this.f407n != null) {
            return "Precondition{updateTime=" + this.f407n + "}";
        }
        if (this.rl != null) {
            return "Precondition{exists=" + this.rl + "}";
        }
        throw wqP.n.n("Invalid Precondition", new Object[0]);
    }
}
