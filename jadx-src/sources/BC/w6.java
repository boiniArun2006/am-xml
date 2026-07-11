package BC;

import com.google.firebase.Timestamp;
import pUk.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 extends Wre {
    @Override // BC.Wre
    public Ml nr() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6.class != obj.getClass()) {
            return false;
        }
        return KN((w6) obj);
    }

    public String toString() {
        return "DeleteMutation{" + mUb() + "}";
    }

    public w6(pUk.C c2, qz qzVar) {
        super(c2, qzVar);
    }

    public int hashCode() {
        return xMQ();
    }

    @Override // BC.Wre
    public Ml n(QJ qj, Ml ml, Timestamp timestamp) {
        az(qj);
        if (Uo().O(qj)) {
            qj.qie(qj.getVersion()).Z();
            return null;
        }
        return ml;
    }

    @Override // BC.Wre
    public void rl(QJ qj, Dsr dsr) {
        az(qj);
        wqP.n.t(dsr.n().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        qj.qie(dsr.rl()).o();
    }
}
