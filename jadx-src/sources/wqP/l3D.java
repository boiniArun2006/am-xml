package wqP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import uh.AbstractC2405z;
import uh.C;
import uh.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class l3D {
    private static void J2(AbstractC2405z abstractC2405z) {
        n.t((abstractC2405z instanceof uh.eO) || (abstractC2405z instanceof uh.C), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    private static boolean az(AbstractC2405z abstractC2405z) {
        return abstractC2405z instanceof uh.eO;
    }

    private static boolean mUb(AbstractC2405z abstractC2405z) {
        if (abstractC2405z instanceof uh.C) {
            uh.C c2 = (uh.C) abstractC2405z;
            if (c2.Uo()) {
                for (AbstractC2405z abstractC2405z2 : c2.rl()) {
                    if (!az(abstractC2405z2) && !qie(abstractC2405z2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static AbstractC2405z nr(uh.eO eOVar, uh.eO eOVar2) {
        return new uh.C(Arrays.asList(eOVar, eOVar2), C.j.AND);
    }

    private static boolean qie(AbstractC2405z abstractC2405z) {
        return (abstractC2405z instanceof uh.C) && ((uh.C) abstractC2405z).xMQ();
    }

    protected static AbstractC2405z KN(AbstractC2405z abstractC2405z) {
        J2(abstractC2405z);
        ArrayList arrayList = new ArrayList();
        if (abstractC2405z instanceof uh.eO) {
            if (abstractC2405z instanceof uh.SPz) {
                uh.SPz sPz = (uh.SPz) abstractC2405z;
                Iterator it = sPz.KN().Z().KN().iterator();
                while (it.hasNext()) {
                    arrayList.add(uh.eO.O(sPz.J2(), eO.n.EQUAL, (uB.s4) it.next()));
                }
                return new uh.C(arrayList, C.j.OR);
            }
            return abstractC2405z;
        }
        uh.C c2 = (uh.C) abstractC2405z;
        Iterator it2 = c2.rl().iterator();
        while (it2.hasNext()) {
            arrayList.add(KN((AbstractC2405z) it2.next()));
        }
        return new uh.C(arrayList, c2.O());
    }

    protected static AbstractC2405z O(AbstractC2405z abstractC2405z, AbstractC2405z abstractC2405z2) {
        AbstractC2405z abstractC2405zRl;
        J2(abstractC2405z);
        J2(abstractC2405z2);
        boolean z2 = abstractC2405z instanceof uh.eO;
        if (z2 && (abstractC2405z2 instanceof uh.eO)) {
            abstractC2405zRl = nr((uh.eO) abstractC2405z, (uh.eO) abstractC2405z2);
        } else if (z2 && (abstractC2405z2 instanceof uh.C)) {
            abstractC2405zRl = t((uh.eO) abstractC2405z, (uh.C) abstractC2405z2);
        } else if ((abstractC2405z instanceof uh.C) && (abstractC2405z2 instanceof uh.eO)) {
            abstractC2405zRl = t((uh.eO) abstractC2405z2, (uh.C) abstractC2405z);
        } else {
            abstractC2405zRl = rl((uh.C) abstractC2405z, (uh.C) abstractC2405z2);
        }
        return n(abstractC2405zRl);
    }

    protected static AbstractC2405z Uo(AbstractC2405z abstractC2405z) {
        boolean z2;
        J2(abstractC2405z);
        if (abstractC2405z instanceof uh.eO) {
            return abstractC2405z;
        }
        uh.C c2 = (uh.C) abstractC2405z;
        if (c2.rl().size() == 1) {
            return Uo((AbstractC2405z) abstractC2405z.rl().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c2.rl().iterator();
        while (it.hasNext()) {
            arrayList.add(Uo((AbstractC2405z) it.next()));
        }
        AbstractC2405z abstractC2405zN = n(new uh.C(arrayList, c2.O()));
        if (gh(abstractC2405zN)) {
            return abstractC2405zN;
        }
        n.t(abstractC2405zN instanceof uh.C, "field filters are already in DNF form.", new Object[0]);
        uh.C c4 = (uh.C) abstractC2405zN;
        n.t(c4.J2(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        if (c4.rl().size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        n.t(z2, "Single-filter composite filters are already in DNF form.", new Object[0]);
        AbstractC2405z abstractC2405zO = (AbstractC2405z) c4.rl().get(0);
        for (int i2 = 1; i2 < c4.rl().size(); i2++) {
            abstractC2405zO = O(abstractC2405zO, (AbstractC2405z) c4.rl().get(i2));
        }
        return abstractC2405zO;
    }

    private static boolean gh(AbstractC2405z abstractC2405z) {
        if (!az(abstractC2405z) && !qie(abstractC2405z) && !mUb(abstractC2405z)) {
            return false;
        }
        return true;
    }

    protected static AbstractC2405z n(AbstractC2405z abstractC2405z) {
        J2(abstractC2405z);
        if (az(abstractC2405z)) {
            return abstractC2405z;
        }
        uh.C c2 = (uh.C) abstractC2405z;
        List listRl = c2.rl();
        if (listRl.size() == 1) {
            return n((AbstractC2405z) listRl.get(0));
        }
        if (c2.KN()) {
            return c2;
        }
        ArrayList<AbstractC2405z> arrayList = new ArrayList();
        Iterator it = listRl.iterator();
        while (it.hasNext()) {
            arrayList.add(n((AbstractC2405z) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC2405z abstractC2405z2 : arrayList) {
            if (abstractC2405z2 instanceof uh.eO) {
                arrayList2.add(abstractC2405z2);
            } else if (abstractC2405z2 instanceof uh.C) {
                uh.C c4 = (uh.C) abstractC2405z2;
                if (c4.O().equals(c2.O())) {
                    arrayList2.addAll(c4.rl());
                } else {
                    arrayList2.add(c4);
                }
            }
        }
        if (arrayList2.size() == 1) {
            return (AbstractC2405z) arrayList2.get(0);
        }
        return new uh.C(arrayList2, c2.O());
    }

    private static AbstractC2405z rl(uh.C c2, uh.C c4) {
        boolean z2;
        uh.C c5;
        if (!c2.rl().isEmpty() && !c4.rl().isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        n.t(z2, "Found an empty composite filter", new Object[0]);
        if (c2.J2() && c4.J2()) {
            return c2.mUb(c4.rl());
        }
        if (c2.Uo()) {
            c5 = c2;
        } else {
            c5 = c4;
        }
        if (c2.Uo()) {
            c2 = c4;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c5.rl().iterator();
        while (it.hasNext()) {
            arrayList.add(O((AbstractC2405z) it.next(), c2));
        }
        return new uh.C(arrayList, C.j.OR);
    }

    private static AbstractC2405z t(uh.eO eOVar, uh.C c2) {
        if (c2.J2()) {
            return c2.mUb(Collections.singletonList(eOVar));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c2.rl().iterator();
        while (it.hasNext()) {
            arrayList.add(O(eOVar, (AbstractC2405z) it.next()));
        }
        return new uh.C(arrayList, C.j.OR);
    }

    public static List xMQ(uh.C c2) {
        if (c2.rl().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        AbstractC2405z abstractC2405zUo = Uo(KN(c2));
        n.t(gh(abstractC2405zUo), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        if (!az(abstractC2405zUo) && !qie(abstractC2405zUo)) {
            return abstractC2405zUo.rl();
        }
        return Collections.singletonList(abstractC2405zUo);
    }
}
