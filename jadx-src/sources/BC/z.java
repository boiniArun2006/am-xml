package BC;

import com.google.firebase.Timestamp;
import pUk.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class z extends Wre {
    @Override // BC.Wre
    public Ml n(QJ qj, Ml ml, Timestamp timestamp) {
        throw wqP.n.n("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // BC.Wre
    public Ml nr() {
        return null;
    }

    @Override // BC.Wre
    public void rl(QJ qj, Dsr dsr) {
        throw wqP.n.n("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        return KN((z) obj);
    }

    public String toString() {
        return "VerifyMutation{" + mUb() + "}";
    }

    public z(pUk.C c2, qz qzVar) {
        super(c2, qzVar);
    }

    public int hashCode() {
        return xMQ();
    }
}
