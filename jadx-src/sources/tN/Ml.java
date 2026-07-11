package tN;

import i.AbstractC2168n;
import i.C2169w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {
    public static final j n(w6 w6Var, C2169w6 translations) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        Intrinsics.checkNotNullParameter(translations, "translations");
        String strN = w6Var.n();
        String strN2 = AbstractC2168n.n(w6Var.t(), translations);
        List listRl = w6Var.rl();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl, 10));
        Iterator it = listRl.iterator();
        while (it.hasNext()) {
            arrayList.add(Wre.n((I28) it.next(), translations));
        }
        return new j(strN, strN2, arrayList);
    }
}
