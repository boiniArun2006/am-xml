package BC;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import pUk.QJ;
import pUk.l3D;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.C f397n;
    private final qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f398t;

    Wre(pUk.C c2, qz qzVar) {
        this(c2, qzVar, new ArrayList());
    }

    public abstract Ml n(QJ qj, Ml ml, Timestamp timestamp);

    public abstract Ml nr();

    public abstract void rl(QJ qj, Dsr dsr);

    Wre(pUk.C c2, qz qzVar, List list) {
        this.f397n = c2;
        this.rl = qzVar;
        this.f398t = list;
    }

    public pUk.C J2() {
        return this.f397n;
    }

    boolean KN(Wre wre) {
        return this.f397n.equals(wre.f397n) && this.rl.equals(wre.rl);
    }

    public List O() {
        return this.f398t;
    }

    public qz Uo() {
        return this.rl;
    }

    protected Map gh(Timestamp timestamp, QJ qj) {
        HashMap map = new HashMap(this.f398t.size());
        for (I28 i28 : this.f398t) {
            map.put(i28.n(), i28.rl().rl(qj.nr(i28.n()), timestamp));
        }
        return map;
    }

    String mUb() {
        return "key=" + this.f397n + ", precondition=" + this.rl;
    }

    protected Map qie(QJ qj, List list) {
        HashMap map = new HashMap(this.f398t.size());
        wqP.n.t(this.f398t.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f398t.size()));
        for (int i2 = 0; i2 < list.size(); i2++) {
            I28 i28 = (I28) this.f398t.get(i2);
            map.put(i28.n(), i28.rl().n(qj.nr(i28.n()), (s4) list.get(i2)));
        }
        return map;
    }

    public static Wre t(QJ qj, Ml ml) {
        if (qj.t()) {
            if (ml == null || !ml.rl().isEmpty()) {
                if (ml == null) {
                    if (qj.J2()) {
                        return new w6(qj.getKey(), qz.f406t);
                    }
                    return new Xo(qj.getKey(), qj.getData(), qz.f406t);
                }
                l3D data = qj.getData();
                l3D l3d = new l3D();
                HashSet hashSet = new HashSet();
                for (pUk.z zVar : ml.rl()) {
                    if (!hashSet.contains(zVar)) {
                        if (data.KN(zVar) == null && zVar.ty() > 1) {
                            zVar = (pUk.z) zVar.ck();
                        }
                        l3d.mUb(zVar, data.KN(zVar));
                        hashSet.add(zVar);
                    }
                }
                return new o(qj.getKey(), l3d, Ml.n(hashSet), qz.f406t);
            }
            return null;
        }
        return null;
    }

    void az(QJ qj) {
        wqP.n.t(qj.getKey().equals(J2()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    int xMQ() {
        return (J2().hashCode() * 31) + this.rl.hashCode();
    }
}
