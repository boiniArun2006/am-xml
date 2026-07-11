package d3z;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class s4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final j rl(UGc uGc) {
        ArrayList arrayList;
        List listRl = uGc.rl();
        ArrayList arrayList2 = null;
        if (listRl != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl, 10));
            Iterator it = listRl.iterator();
            while (it.hasNext()) {
                String strT = ((YV.o) it.next()).t();
                Intrinsics.checkNotNull(strT);
                arrayList.add(new Q(strT));
            }
        } else {
            arrayList = null;
        }
        List<YV.o> listN = uGc.n();
        if (listN != null) {
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
            for (YV.o oVar : listN) {
                String strT2 = oVar.t();
                Intrinsics.checkNotNull(strT2);
                String strJ2 = oVar.J2();
                n nVar = (n) uGc.t().get(oVar.J2());
                if (nVar == null) {
                    nVar = n.f63445n;
                }
                arrayList2.add(new Wre(strT2, strJ2, nVar));
            }
        }
        return new j(arrayList, arrayList2);
    }
}
