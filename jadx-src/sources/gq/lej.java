package gq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import pUk.C2331c;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class lej implements InterfaceC2143n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TreeMap f67800n = new TreeMap();
    private final Map rl = new HashMap();

    private void Uo(int i2, BC.Wre wre) {
        BC.C c2 = (BC.C) this.f67800n.get(wre.J2());
        if (c2 != null) {
            ((Set) this.rl.get(Integer.valueOf(c2.t()))).remove(wre.J2());
        }
        this.f67800n.put(wre.J2(), BC.C.n(i2, wre));
        if (this.rl.get(Integer.valueOf(i2)) == null) {
            this.rl.put(Integer.valueOf(i2), new HashSet());
        }
        ((Set) this.rl.get(Integer.valueOf(i2))).add(wre.J2());
    }

    @Override // gq.InterfaceC2143n
    public Map J2(String str, int i2, int i3) {
        TreeMap treeMap = new TreeMap();
        for (BC.C c2 : this.f67800n.values()) {
            if (c2.rl().xMQ().equals(str) && c2.t() > i2) {
                Map map = (Map) treeMap.get(Integer.valueOf(c2.t()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(c2.t()), map);
                }
                map.put(c2.rl(), c2);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i3) {
                break;
            }
        }
        return map2;
    }

    @Override // gq.InterfaceC2143n
    public BC.C O(pUk.C c2) {
        return (BC.C) this.f67800n.get(c2);
    }

    @Override // gq.InterfaceC2143n
    public void n(int i2) {
        if (this.rl.containsKey(Integer.valueOf(i2))) {
            Set set = (Set) this.rl.get(Integer.valueOf(i2));
            this.rl.remove(Integer.valueOf(i2));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f67800n.remove((pUk.C) it.next());
            }
        }
    }

    @Override // gq.InterfaceC2143n
    public Map nr(C2331c c2331c, int i2) {
        HashMap map = new HashMap();
        int iTy = c2331c.ty() + 1;
        for (BC.C c2 : this.f67800n.tailMap(pUk.C.Uo((C2331c) c2331c.n(""))).values()) {
            pUk.C cRl = c2.rl();
            if (!c2331c.az(cRl.qie())) {
                break;
            }
            if (cRl.qie().ty() == iTy && c2.t() > i2) {
                map.put(c2.rl(), c2);
            }
        }
        return map;
    }

    @Override // gq.InterfaceC2143n
    public Map t(SortedSet sortedSet) {
        HashMap map = new HashMap();
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            pUk.C c2 = (pUk.C) it.next();
            BC.C c4 = (BC.C) this.f67800n.get(c2);
            if (c4 != null) {
                map.put(c2, c4);
            }
        }
        return map;
    }

    @Override // gq.InterfaceC2143n
    public void rl(int i2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Uo(i2, (BC.Wre) AbstractC2418c.nr((BC.Wre) entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }
}
