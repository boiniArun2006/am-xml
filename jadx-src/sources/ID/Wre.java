package ID;

import Nh.j;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre {
    private final Nh.n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Nh.n f4100O;
    private final Nh.w6 Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f4101n;
    private final Map nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f4102t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Intrinsics.areEqual(this.f4101n, wre.f4101n) && this.rl == wre.rl && Intrinsics.areEqual(this.f4102t, wre.f4102t) && Intrinsics.areEqual(this.nr, wre.nr);
    }

    public Wre(List questions, int i2, List path, Map openFieldValues) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(openFieldValues, "openFieldValues");
        this.f4101n = questions;
        this.rl = i2;
        this.f4102t = path;
        this.nr = openFieldValues;
        this.f4100O = (Nh.n) CollectionsKt.lastOrNull(path);
        this.J2 = (Nh.n) CollectionsKt.getOrNull(path, path.size() - 2);
        this.Uo = (Nh.w6) CollectionsKt.getOrNull(questions, i2);
    }

    public static /* synthetic */ Wre rl(Wre wre, List list, int i2, List list2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = wre.f4101n;
        }
        if ((i3 & 2) != 0) {
            i2 = wre.rl;
        }
        if ((i3 & 4) != 0) {
            list2 = wre.f4102t;
        }
        if ((i3 & 8) != 0) {
            map = wre.nr;
        }
        return wre.n(list, i2, list2, map);
    }

    public final Map J2() {
        return this.nr;
    }

    public final List KN() {
        return this.f4102t;
    }

    public final Nh.w6 O() {
        return this.Uo;
    }

    public final int Uo() {
        List<Nh.n> list = this.f4102t;
        int i2 = 0;
        if (list != null && list.isEmpty()) {
            return 0;
        }
        for (Nh.n nVar : list) {
            if ((nVar instanceof j.C0239j) || (nVar instanceof Nh.w6)) {
                i2++;
                if (i2 < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i2;
    }

    public final List gh() {
        return this.f4101n;
    }

    public int hashCode() {
        return (((((this.f4101n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + this.f4102t.hashCode()) * 31) + this.nr.hashCode();
    }

    public final int mUb() {
        return this.rl;
    }

    public final Wre n(List questions, int i2, List path, Map openFieldValues) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(openFieldValues, "openFieldValues");
        return new Wre(questions, i2, path, openFieldValues);
    }

    public final Nh.n nr() {
        return this.f4100O;
    }

    public final Integer qie() {
        Nh.n nVar = this.f4100O;
        if (!(nVar instanceof j.n) && !(nVar instanceof j.w6)) {
            return null;
        }
        Nh.n nVar2 = this.J2;
        int iNextIndex = -1;
        if (nVar2 instanceof Nh.w6) {
            List listRl = ((Nh.w6) nVar2).rl();
            ListIterator listIterator = listRl.listIterator(listRl.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (Intrinsics.areEqual(((Nh.j) listIterator.previous()).getId(), ((Nh.j) this.f4100O).getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            return Integer.valueOf(iNextIndex);
        }
        if (!(nVar2 instanceof j.C0239j)) {
            return null;
        }
        List listRl2 = ((j.C0239j) nVar2).rl();
        ListIterator listIterator2 = listRl2.listIterator(listRl2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            if (Intrinsics.areEqual(((Nh.j) listIterator2.previous()).getId(), ((Nh.j) this.f4100O).getId())) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        return Integer.valueOf(iNextIndex);
    }

    public final List t() {
        Nh.n nVar = this.f4100O;
        if (nVar instanceof Nh.w6) {
            return ((Nh.w6) nVar).rl();
        }
        if (nVar instanceof j.C0239j) {
            return ((j.C0239j) nVar).rl();
        }
        if (!(nVar instanceof j.n) && !(nVar instanceof j.w6)) {
            return null;
        }
        Nh.n nVar2 = this.J2;
        if (nVar2 instanceof Nh.w6) {
            return ((Nh.w6) nVar2).rl();
        }
        if (nVar2 instanceof j.C0239j) {
            return ((j.C0239j) nVar2).rl();
        }
        return null;
    }

    public String toString() {
        return "SurveyViewModelState(questions=" + this.f4101n + ", questionIndex=" + this.rl + ", path=" + this.f4102t + ", openFieldValues=" + this.nr + ")";
    }

    public final Nh.n xMQ() {
        return this.J2;
    }
}
