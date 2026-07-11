package fE;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class C {
    /* JADX INFO: Access modifiers changed from: private */
    public static final x0X.n rl(x0X.n nVar, Object obj) {
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        Pair pair = (Pair) ((n.w6) nVar).n();
        List list = (List) pair.component1();
        return !list.isEmpty() ? new n.w6(TuplesKt.to(list, (List) pair.component2())) : new n.C1266n(obj);
    }
}
