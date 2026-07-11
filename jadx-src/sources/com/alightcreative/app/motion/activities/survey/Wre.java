package com.alightcreative.app.motion.activities.survey;

import KQ.Pl;
import KQ.eO;
import Nh.j;
import com.alightcreative.app.motion.activities.survey.CN3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Wre {
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[LOOP:0: B:36:0x0088->B:38:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CN3 n(ID.Wre wre) {
        Nh.n nVarXMQ;
        String strN;
        String str;
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Nh.n nVarNr = wre.nr();
        if (nVarNr == null) {
            return CN3.n.f45656n;
        }
        Nh.w6 w6VarO = wre.O();
        if (w6VarO == null) {
            return CN3.n.f45656n;
        }
        List<Nh.j> listT = wre.t();
        if (listT == null) {
            return CN3.n.f45656n;
        }
        if (nVarNr instanceof j.C0239j) {
            strN = ((j.C0239j) nVarNr).n();
        } else {
            if ((!(nVarNr instanceof j.w6) && !(nVarNr instanceof j.n)) || (wre.xMQ() instanceof Nh.w6) || (nVarXMQ = wre.xMQ()) == null) {
                str = null;
                int i2 = wre.mUb() + 1 >= wre.gh().size() ? 2132017374 : 2132017380;
                String id = nVarNr.getId();
                String strN2 = w6VarO.n();
                String strT = w6VarO.t();
                int iNr = w6VarO.nr();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT, 10));
                for (Nh.j jVar : listT) {
                    arrayList.add(new Pl(jVar.getId(), jVar.n(), jVar instanceof j.n));
                }
                return new CN3.j(new eO(id, strN2, strT, arrayList, str, iNr, wre.qie(), wre.gh().size(), wre.mUb(), wre.Uo()), wre.J2(), wre.Uo() <= 1, true, i2, wre.qie() == null);
            }
            strN = nVarXMQ.n();
        }
        str = strN;
        int i22 = wre.mUb() + 1 >= wre.gh().size() ? 2132017374 : 2132017380;
        String id2 = nVarNr.getId();
        String strN22 = w6VarO.n();
        String strT2 = w6VarO.t();
        int iNr2 = w6VarO.nr();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listT, 10));
        while (r0.hasNext()) {
        }
        return new CN3.j(new eO(id2, strN22, strT2, arrayList2, str, iNr2, wre.qie(), wre.gh().size(), wre.mUb(), wre.Uo()), wre.J2(), wre.Uo() <= 1, true, i22, wre.qie() == null);
    }
}
