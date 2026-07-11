package pUk;

import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static n f72013n = n.n(0, j.f72014n);
    public static final Comparator rl = new Comparator() { // from class: pUk.Pl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return eO.n((eO) obj, (eO) obj2);
        }
    };

    public static abstract class j implements Comparable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f72014n = t(UGc.f72007t, C.t(), -1);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Comparator f72015t = new Comparator() { // from class: pUk.Xo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return eO.j.J2((QJ) obj).compareTo(eO.j.J2((QJ) obj2));
            }
        };

        public abstract int KN();

        public abstract C Uo();

        public abstract UGc xMQ();

        public static j t(UGc uGc, C c2, int i2) {
            return new pUk.n(uGc, c2, i2);
        }

        public static j J2(fuX fux) {
            return t(fux.mUb(), fux.getKey(), -1);
        }

        public static j nr(UGc uGc, int i2) {
            Timestamp timestamp;
            long seconds = uGc.rl().getSeconds();
            int nanoseconds = uGc.rl().getNanoseconds() + 1;
            if (nanoseconds == 1.0E9d) {
                timestamp = new Timestamp(seconds + 1, 0);
            } else {
                timestamp = new Timestamp(seconds, nanoseconds);
            }
            return t(new UGc(timestamp), C.t(), i2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int compareTo(j jVar) {
            int iCompareTo = xMQ().compareTo(jVar.xMQ());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Uo().compareTo(jVar.Uo());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            return Integer.compare(KN(), jVar.KN());
        }
    }

    public static abstract class n {
        public abstract long nr();

        public abstract j t();

        public static n n(long j2, j jVar) {
            return new pUk.w6(j2, jVar);
        }

        public static n rl(long j2, UGc uGc, C c2, int i2) {
            return n(j2, j.t(uGc, c2, i2));
        }
    }

    public static abstract class w6 implements Comparable {

        public enum j {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public abstract j nr();

        public abstract z t();

        public static w6 rl(z zVar, j jVar) {
            return new Ml(zVar, jVar);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compareTo(w6 w6Var) {
            int iCompareTo = t().compareTo(w6Var.t());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            return nr().compareTo(w6Var.nr());
        }
    }

    public abstract int J2();

    public abstract List KN();

    public abstract n Uo();

    public abstract String nr();

    public static eO rl(int i2, String str, List list, n nVar) {
        return new pUk.j(i2, str, list, nVar);
    }

    public List O() {
        ArrayList arrayList = new ArrayList();
        for (w6 w6Var : KN()) {
            if (!w6Var.nr().equals(w6.j.CONTAINS)) {
                arrayList.add(w6Var);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ int n(eO eOVar, eO eOVar2) {
        int iCompareTo = eOVar.nr().compareTo(eOVar2.nr());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator it = eOVar.KN().iterator();
        Iterator it2 = eOVar2.KN().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = ((w6) it.next()).compareTo((w6) it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    public w6 t() {
        for (w6 w6Var : KN()) {
            if (w6Var.nr().equals(w6.j.CONTAINS)) {
                return w6Var;
            }
        }
        return null;
    }
}
