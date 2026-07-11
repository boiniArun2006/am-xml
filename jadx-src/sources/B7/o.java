package B7;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(as.n nVar, d2n.Wre wre) {
        int iT = as.aC.t(wre.t(), nVar.J2());
        if (Math.abs(as.w6.t(nVar) - iT) <= 3) {
            return;
        }
        throw new IllegalStateException(("Given audio fragment " + nVar + " has " + ((Object) as.Ml.mUb(as.w6.t(nVar))) + " frames while " + ((Object) as.Ml.mUb(iT)) + " were expected.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d2n.Wre O(aC aCVar, d2n.Wre wre) {
        List listJ2 = wre.J2(aCVar.t());
        if (listJ2.isEmpty()) {
            return null;
        }
        if (listJ2.size() != 2 && d2n.Ml.KN(((d2n.Wre) CollectionsKt.first(listJ2)).nr(), wre.nr())) {
            return (d2n.Wre) CollectionsKt.first(listJ2);
        }
        return wre;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final as.n nr(aC aCVar, d2n.Wre wre) {
        int iJ2 = w9.Ml.J2(as.aC.n(d2n.Ml.az(wre.O(), aCVar.t().O()), aCVar.n().Uo()));
        int iN = as.aC.n(wre.t(), aCVar.n().Uo());
        int iJ22 = v9.n.J2(aCVar.n().O());
        if (!w9.w6.mUb(iN) && w9.Ml.nr(iJ2, iJ22) < 0) {
            return as.n.rl(aCVar.n(), v9.n.qie(aCVar.n().O(), w9.Ml.HI(iJ2, ((w9.Ml) RangesKt.coerceAtMost(w9.Ml.rl(w9.Ml.qie(iJ2, iN)), w9.Ml.rl(iJ22))).ty())), null, 2, null);
        }
        return as.n.rl(aCVar.n(), v9.n.O(w9.w6.f74806t.n(), null, 2, null), null, 2, null);
    }
}
