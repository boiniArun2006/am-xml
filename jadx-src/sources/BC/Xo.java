package BC;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pUk.QJ;
import pUk.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Xo extends Wre {
    private final l3D nr;

    public Xo(pUk.C c2, l3D l3d, qz qzVar) {
        this(c2, l3d, qzVar, new ArrayList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Xo.class == obj.getClass()) {
            Xo xo = (Xo) obj;
            if (KN(xo) && this.nr.equals(xo.nr) && O().equals(xo.O())) {
                return true;
            }
        }
        return false;
    }

    @Override // BC.Wre
    public Ml nr() {
        return null;
    }

    public Xo(pUk.C c2, l3D l3d, qz qzVar, List list) {
        super(c2, qzVar, list);
        this.nr = l3d;
    }

    public String toString() {
        return "SetMutation{" + mUb() + ", value=" + this.nr + "}";
    }

    public l3D ty() {
        return this.nr;
    }

    public int hashCode() {
        return (xMQ() * 31) + this.nr.hashCode();
    }

    @Override // BC.Wre
    public Ml n(QJ qj, Ml ml, Timestamp timestamp) {
        az(qj);
        if (!Uo().O(qj)) {
            return ml;
        }
        Map mapGh = gh(timestamp, qj);
        l3D l3dClone = this.nr.clone();
        l3dClone.gh(mapGh);
        qj.gh(qj.getVersion(), l3dClone).Z();
        return null;
    }

    @Override // BC.Wre
    public void rl(QJ qj, Dsr dsr) {
        az(qj);
        l3D l3dClone = this.nr.clone();
        l3dClone.gh(qie(qj, dsr.n()));
        qj.gh(dsr.rl(), l3dClone).o();
    }
}
