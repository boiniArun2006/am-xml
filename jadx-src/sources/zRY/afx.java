package zRY;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import zRY.Ew;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class afx {
    /* JADX WARN: Removed duplicated region for block: B:62:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Ew n(Z z2) {
        Object next;
        Intrinsics.checkNotNullParameter(z2, "<this>");
        List listT = z2.t();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listT) {
            tN.j jVar = (tN.j) obj;
            List<tN.fuX> listO = z2.O();
            if (listO == null || !listO.isEmpty()) {
                for (tN.fuX fux : listO) {
                    if (fux.nr() != tN.CN3.f73455t && fux.t()) {
                        break;
                    }
                }
                if (Intrinsics.areEqual(jVar.n(), "category_transitions")) {
                    arrayList.add(obj);
                }
            } else if (Intrinsics.areEqual(jVar.n(), "category_transitions")) {
            }
        }
        if (arrayList.isEmpty()) {
            return Ew.n.f76470n;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((tN.j) next).n(), z2.nr())) {
                break;
            }
        }
        tN.j jVar2 = (tN.j) next;
        if (jVar2 == null) {
            jVar2 = (tN.j) CollectionsKt.first((List) arrayList);
        }
        List<tN.fuX> listO2 = z2.O();
        ArrayList arrayList2 = new ArrayList();
        for (tN.fuX fux2 : listO2) {
            tN.CN3 cn3Nr = fux2.t() ? fux2.nr() : null;
            if (cn3Nr != null) {
                arrayList2.add(cn3Nr);
            }
        }
        List listRl = jVar2.rl();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listRl) {
            Set setJ2 = ((tN.n) obj2).J2();
            if (!(setJ2 instanceof Collection) || !setJ2.isEmpty()) {
                Iterator it2 = setJ2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (arrayList2.contains((tN.CN3) it2.next())) {
                        arrayList3.add(obj2);
                        break;
                    }
                }
            }
        }
        return new Ew.j(arrayList3, arrayList, jVar2.n(), z2.O());
    }
}
