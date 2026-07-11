package MoG;

import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Dsr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final d2n.Wre rl(Iterable iterable) {
        d2n.Ml mlRl;
        long jJ2;
        long jT2;
        Iterator it = iterable.iterator();
        d2n.Ml ml = null;
        if (!it.hasNext()) {
            mlRl = null;
        } else {
            mlRl = d2n.Ml.rl(((fuX) it.next()).rl().O());
            while (it.hasNext()) {
                d2n.Ml mlRl2 = d2n.Ml.rl(((fuX) it.next()).rl().O());
                if (mlRl.compareTo(mlRl2) > 0) {
                    mlRl = mlRl2;
                }
            }
        }
        if (mlRl != null) {
            jJ2 = mlRl.Ik();
        } else {
            jJ2 = d2n.Ml.f63370t.J2();
        }
        long j2 = jJ2;
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            d2n.Ml mlRl3 = d2n.Ml.rl(((fuX) it2.next()).rl().nr());
            loop0: while (true) {
                ml = mlRl3;
                while (it2.hasNext()) {
                    mlRl3 = d2n.Ml.rl(((fuX) it2.next()).rl().nr());
                    if (ml.compareTo(mlRl3) < 0) {
                        break;
                    }
                }
            }
        }
        if (ml != null) {
            jT2 = ml.Ik();
        } else {
            jT2 = d2n.Ml.f63370t.t(1L);
        }
        return new d2n.Wre(j2, jT2, null);
    }
}
