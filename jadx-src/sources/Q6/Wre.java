package Q6;

import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(F6.j jVar, F6.j jVar2) {
        if (jVar2 == null || Intrinsics.areEqual(F6.j.rl(jVar2, null, jVar.O(), 1, null), jVar)) {
            return;
        }
        throw new IllegalArgumentException(("Current slice " + jVar + " and predicted one " + jVar2 + " may differ only in time range").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F6.j O(F6.j jVar, long j2) {
        d2n.Wre wreKN = d2n.CN3.KN(jVar.O(), j2);
        if (wreKN == null) {
            return null;
        }
        return F6.j.rl(jVar, null, wreKN, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F6.j nr(F6.j jVar, long j2) {
        return F6.j.rl(jVar, null, d2n.Wre.rl(jVar.O(), 0L, ((d2n.Ml) ComparisonsKt.minOf(d2n.Ml.rl(d2n.Ml.HI(jVar.O().nr(), j2)), d2n.Ml.rl(jVar.nr().Uo().nr()))).Ik(), 1, null), 1, null);
    }
}
