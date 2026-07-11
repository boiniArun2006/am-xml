package Nh;

import Nh.I28;
import Nh.j;
import i.AbstractC2168n;
import i.C2169w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre {
    public static final j n(I28 i28, C2169w6 translations) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Intrinsics.checkNotNullParameter(translations, "translations");
        if (i28 instanceof I28.w6) {
            I28.w6 w6Var = (I28.w6) i28;
            return new j.w6(w6Var.n(), AbstractC2168n.n(w6Var.rl(), translations));
        }
        if (!(i28 instanceof I28.j)) {
            if (!(i28 instanceof I28.n)) {
                throw new NoWhenBranchMatchedException();
            }
            I28.n nVar = (I28.n) i28;
            return new j.n(nVar.n(), AbstractC2168n.n(nVar.rl(), translations));
        }
        I28.j jVar = (I28.j) i28;
        String strN = jVar.n();
        String strN2 = AbstractC2168n.n(jVar.t(), translations);
        List listRl = jVar.rl();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRl, 10));
        Iterator it = listRl.iterator();
        while (it.hasNext()) {
            arrayList.add(n((I28) it.next(), translations));
        }
        return new j.C0239j(strN, strN2, arrayList);
    }
}
