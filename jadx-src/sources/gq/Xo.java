package gq;

import com.google.firebase.Timestamp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import pUk.C2331c;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final O f67749n;
    private final qz nr;
    private final P rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2143n f67750t;

    eZ.w6 KN(uh.Ln ln2, eO.j jVar) {
        return xMQ(ln2, jVar, null);
    }

    private eZ.w6 J2(uh.Ln ln2, eO.j jVar, pO pOVar) {
        Map mapNr = this.f67750t.nr(ln2.qie(), jVar.KN());
        Map mapO = this.f67749n.O(ln2, jVar, mapNr.keySet(), pOVar);
        for (Map.Entry entry : mapNr.entrySet()) {
            if (!mapO.containsKey(entry.getKey())) {
                mapO.put((pUk.C) entry.getKey(), pUk.QJ.ck((pUk.C) entry.getKey()));
            }
        }
        eZ.w6 w6VarN = pUk.Dsr.n();
        for (Map.Entry entry2 : mapO.entrySet()) {
            BC.C c2 = (BC.C) mapNr.get(entry2.getKey());
            if (c2 != null) {
                c2.nr().n((pUk.QJ) entry2.getValue(), BC.Ml.rl, Timestamp.now());
            }
            if (ln2.r((pUk.fuX) entry2.getValue())) {
                w6VarN = w6VarN.Uo((pUk.C) entry2.getKey(), (pUk.fuX) entry2.getValue());
            }
        }
        return w6VarN;
    }

    private Map az(Map map) {
        List<BC.CN3> listRl = this.rl.rl(map.keySet());
        HashMap map2 = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (BC.CN3 cn3 : listRl) {
            for (pUk.C c2 : cn3.O()) {
                pUk.QJ qj = (pUk.QJ) map.get(c2);
                if (qj != null) {
                    map2.put(c2, cn3.n(qj, map2.containsKey(c2) ? (BC.Ml) map2.get(c2) : BC.Ml.rl));
                    int iNr = cn3.nr();
                    if (!treeMap.containsKey(Integer.valueOf(iNr))) {
                        treeMap.put(Integer.valueOf(iNr), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(iNr))).add(c2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap map3 = new HashMap();
            for (pUk.C c4 : (Set) entry.getValue()) {
                if (!hashSet.contains(c4)) {
                    BC.Wre wreT = BC.Wre.t((pUk.QJ) map.get(c4), (BC.Ml) map2.get(c4));
                    if (wreT != null) {
                        map3.put(c4, wreT);
                    }
                    hashSet.add(c4);
                }
            }
            this.f67750t.rl(((Integer) entry.getKey()).intValue(), map3);
        }
        return map2;
    }

    private Map n(Map map, Map map2, Set set) {
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (pUk.QJ qj : map.values()) {
            BC.C c2 = (BC.C) map2.get(qj.getKey());
            if (set.contains(qj.getKey()) && (c2 == null || (c2.nr() instanceof BC.o))) {
                map3.put(qj.getKey(), qj);
            } else if (c2 != null) {
                map4.put(qj.getKey(), c2.nr().nr());
                c2.nr().n(qj, c2.nr().nr(), Timestamp.now());
            } else {
                map4.put(qj.getKey(), BC.Ml.rl);
            }
        }
        map4.putAll(az(map3));
        HashMap map5 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map5.put((pUk.C) entry.getKey(), new iF((pUk.fuX) entry.getValue(), (BC.Ml) map4.get(entry.getKey())));
        }
        return map5;
    }

    private void qie(Map map, Set set) {
        TreeSet treeSet = new TreeSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            if (!map.containsKey(c2)) {
                treeSet.add(c2);
            }
        }
        map.putAll(this.f67750t.t(treeSet));
    }

    private pUk.QJ rl(pUk.C c2, BC.C c4) {
        return (c4 == null || (c4.nr() instanceof BC.o)) ? this.f67749n.nr(c2) : pUk.QJ.ck(c2);
    }

    Pl gh(String str, eO.j jVar, int i2) {
        Map mapJ2 = this.f67749n.J2(str, jVar, i2);
        Map mapJ22 = i2 - mapJ2.size() > 0 ? this.f67750t.J2(str, jVar.KN(), i2 - mapJ2.size()) : new HashMap();
        int iMax = -1;
        for (BC.C c2 : mapJ22.values()) {
            if (!mapJ2.containsKey(c2.rl())) {
                mapJ2.put(c2.rl(), rl(c2.rl(), c2));
            }
            iMax = Math.max(iMax, c2.t());
        }
        qie(mapJ22, mapJ2.keySet());
        return Pl.n(iMax, n(mapJ2, mapJ22, Collections.EMPTY_SET));
    }

    eZ.w6 mUb(Map map, Set set) {
        HashMap map2 = new HashMap();
        qie(map2, map.keySet());
        eZ.w6 w6VarN = pUk.Dsr.n();
        for (Map.Entry entry : n(map, map2, set).entrySet()) {
            w6VarN = w6VarN.Uo((pUk.C) entry.getKey(), ((iF) entry.getValue()).n());
        }
        return w6VarN;
    }

    eZ.w6 nr(Iterable iterable) {
        return mUb(this.f67749n.rl(iterable), new HashSet());
    }

    pUk.fuX t(pUk.C c2) {
        BC.C cO2 = this.f67750t.O(c2);
        pUk.QJ qjRl = rl(c2, cO2);
        if (cO2 != null) {
            cO2.nr().n(qjRl, BC.Ml.rl, Timestamp.now());
        }
        return qjRl;
    }

    void ty(Set set) {
        az(this.f67749n.rl(set));
    }

    Xo(O o2, P p2, InterfaceC2143n interfaceC2143n, qz qzVar) {
        this.f67749n = o2;
        this.rl = p2;
        this.f67750t = interfaceC2143n;
        this.nr = qzVar;
    }

    private eZ.w6 O(uh.Ln ln2, eO.j jVar, pO pOVar) {
        wqP.n.t(ln2.qie().gh(), "Currently we only support collection group queries at the root.", new Object[0]);
        String strNr = ln2.nr();
        eZ.w6 w6VarN = pUk.Dsr.n();
        Iterator it = this.nr.xMQ(strNr).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : J2(ln2.n((C2331c) ((C2331c) it.next()).n(strNr)), jVar, pOVar)) {
                w6VarN = w6VarN.Uo((pUk.C) entry.getKey(), (pUk.fuX) entry.getValue());
            }
        }
        return w6VarN;
    }

    private eZ.w6 Uo(C2331c c2331c) {
        eZ.w6 w6VarN = pUk.Dsr.n();
        pUk.fuX fuxT = t(pUk.C.Uo(c2331c));
        if (fuxT.KN()) {
            return w6VarN.Uo(fuxT.getKey(), fuxT);
        }
        return w6VarN;
    }

    eZ.w6 xMQ(uh.Ln ln2, eO.j jVar, pO pOVar) {
        C2331c c2331cQie = ln2.qie();
        if (ln2.ck()) {
            return Uo(c2331cQie);
        }
        if (ln2.HI()) {
            return O(ln2, jVar, pOVar);
        }
        return J2(ln2, jVar, pOVar);
    }
}
