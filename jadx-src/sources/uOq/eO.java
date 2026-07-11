package uOq;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class eO {

    private static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final uOq.w6 f74382n;
        private final Set rl = new HashSet();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f74383t = new HashSet();

        boolean J2() {
            return this.f74383t.isEmpty();
        }

        boolean O() {
            return this.rl.isEmpty();
        }

        void Uo(n nVar) {
            this.f74383t.remove(nVar);
        }

        void n(n nVar) {
            this.rl.add(nVar);
        }

        Set nr() {
            return this.rl;
        }

        void rl(n nVar) {
            this.f74383t.add(nVar);
        }

        uOq.w6 t() {
            return this.f74382n;
        }

        n(uOq.w6 w6Var) {
            this.f74382n = w6Var;
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final g9s f74384n;
        private final boolean rl;

        private w6(g9s g9sVar, boolean z2) {
            this.f74384n = g9sVar;
            this.rl = z2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof w6) {
                w6 w6Var = (w6) obj;
                if (w6Var.f74384n.equals(this.f74384n) && w6Var.rl == this.rl) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f74384n.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.rl).hashCode();
        }
    }

    private static Set rl(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar.J2()) {
                hashSet.add(nVar);
            }
        }
        return hashSet;
    }

    private static Set t(List list) {
        Set<n> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (n nVar : (Set) it2.next()) {
                        for (z zVar : nVar.t().Uo()) {
                            if (zVar.O() && (set = (Set) map.get(new w6(zVar.t(), zVar.Uo()))) != null) {
                                for (n nVar2 : set) {
                                    nVar.n(nVar2);
                                    nVar2.rl(nVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            uOq.w6 w6Var = (uOq.w6) it.next();
            n nVar3 = new n(w6Var);
            for (g9s g9sVar : w6Var.mUb()) {
                w6 w6Var2 = new w6(g9sVar, !w6Var.ck());
                if (!map.containsKey(w6Var2)) {
                    map.put(w6Var2, new HashSet());
                }
                Set set2 = (Set) map.get(w6Var2);
                if (!set2.isEmpty() && !w6Var2.rl) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", g9sVar));
                }
                set2.add(nVar3);
            }
        }
    }

    static void n(List list) {
        Set<n> setT = t(list);
        Set setRl = rl(setT);
        int i2 = 0;
        while (!setRl.isEmpty()) {
            n nVar = (n) setRl.iterator().next();
            setRl.remove(nVar);
            i2++;
            for (n nVar2 : nVar.nr()) {
                nVar2.Uo(nVar);
                if (nVar2.J2()) {
                    setRl.add(nVar2);
                }
            }
        }
        if (i2 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (n nVar3 : setT) {
            if (!nVar3.J2() && !nVar3.O()) {
                arrayList.add(nVar3.t());
            }
        }
        throw new DependencyCycleException(arrayList);
    }
}
