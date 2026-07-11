package co4;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class eO {
    private static final void t(List list, Xo xo) {
        if (xo instanceof I28) {
            list.add(((I28) xo).t());
            return;
        }
        if (xo instanceof fuX) {
            Iterator it = ((fuX) xo).t().iterator();
            while (it.hasNext()) {
                t(list, (l3D) it.next());
            }
            return;
        }
        if (xo instanceof aC) {
            return;
        }
        if (xo instanceof SPz) {
            t(list, ((SPz) xo).J2());
            return;
        }
        if (!(xo instanceof w6)) {
            if (xo instanceof C1685c) {
                t(list, ((C1685c) xo).nr());
            }
        } else {
            w6 w6Var = (w6) xo;
            t(list, w6Var.nr());
            Iterator it2 = w6Var.t().iterator();
            while (it2.hasNext()) {
                t(list, (Xo) it2.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rl(Xo xo) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        t(listCreateListBuilder, xo);
        return CollectionsKt.build(listCreateListBuilder);
    }
}
