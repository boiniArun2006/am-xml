package BC;

import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pUk.QJ;
import pUk.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class o extends Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml f405O;
    private final l3D nr;

    public o(pUk.C c2, l3D l3d, Ml ml, qz qzVar) {
        this(c2, l3d, ml, qzVar, new ArrayList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (KN(oVar) && this.nr.equals(oVar.nr) && O().equals(oVar.O())) {
                return true;
            }
        }
        return false;
    }

    public o(pUk.C c2, l3D l3d, Ml ml, qz qzVar, List list) {
        super(c2, qzVar, list);
        this.nr = l3d;
        this.f405O = ml;
    }

    private Map HI() {
        HashMap map = new HashMap();
        for (pUk.z zVar : this.f405O.rl()) {
            if (!zVar.gh()) {
                map.put(zVar, this.nr.KN(zVar));
            }
        }
        return map;
    }

    private List ty() {
        ArrayList arrayList = new ArrayList();
        Iterator it = O().iterator();
        while (it.hasNext()) {
            arrayList.add(((I28) it.next()).n());
        }
        return arrayList;
    }

    public l3D ck() {
        return this.nr;
    }

    @Override // BC.Wre
    public Ml nr() {
        return this.f405O;
    }

    public String toString() {
        return obbPUqyhtS.KlPNFOpWJrjD + mUb() + ", mask=" + this.f405O + ", value=" + this.nr + "}";
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
        Map mapHI = HI();
        l3D data = qj.getData();
        data.gh(mapHI);
        data.gh(mapGh);
        qj.gh(qj.getVersion(), qj.getData()).Z();
        if (ml == null) {
            return null;
        }
        HashSet hashSet = new HashSet(ml.rl());
        hashSet.addAll(this.f405O.rl());
        hashSet.addAll(ty());
        return Ml.n(hashSet);
    }

    @Override // BC.Wre
    public void rl(QJ qj, Dsr dsr) {
        az(qj);
        if (!Uo().O(qj)) {
            qj.az(dsr.rl());
            return;
        }
        Map mapQie = qie(qj, dsr.n());
        l3D data = qj.getData();
        data.gh(HI());
        data.gh(mapQie);
        qj.gh(dsr.rl(), qj.getData()).o();
    }
}
