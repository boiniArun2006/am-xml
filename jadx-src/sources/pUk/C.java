package pUk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C implements Comparable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final eZ.I28 f71987O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Comparator f71988t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2331c f71989n;

    static {
        Comparator comparator = new Comparator() { // from class: pUk.aC
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C) obj).compareTo((C) obj2);
            }
        };
        f71988t = comparator;
        f71987O = new eZ.I28(Collections.EMPTY_LIST, comparator);
    }

    public static C KN(List list) {
        return new C(C2331c.r(list));
    }

    public static C Uo(C2331c c2331c) {
        return new C(c2331c);
    }

    public static Comparator n() {
        return f71988t;
    }

    public static eZ.I28 nr() {
        return f71987O;
    }

    public static C t() {
        return KN(Collections.EMPTY_LIST);
    }

    public boolean az(String str) {
        if (this.f71989n.ty() < 2) {
            return false;
        }
        C2331c c2331c = this.f71989n;
        return ((String) c2331c.f71991n.get(c2331c.ty() - 2)).equals(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        return this.f71989n.equals(((C) obj).f71989n);
    }

    public String gh() {
        return this.f71989n.xMQ();
    }

    public int hashCode() {
        return this.f71989n.hashCode();
    }

    public C2331c mUb() {
        return (C2331c) this.f71989n.ck();
    }

    public C2331c qie() {
        return this.f71989n;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public int compareTo(C c2) {
        return this.f71989n.compareTo(c2.f71989n);
    }

    public String toString() {
        return this.f71989n.toString();
    }

    public String xMQ() {
        return this.f71989n.mUb(r0.ty() - 2);
    }

    private C(C2331c c2331c) {
        wqP.n.t(ty(c2331c), "Not a document key path: %s", c2331c);
        this.f71989n = c2331c;
    }

    public static C J2(String str) {
        C2331c c2331cO = C2331c.o(str);
        boolean z2 = false;
        if (c2331cO.ty() > 4 && c2331cO.mUb(0).equals("projects") && c2331cO.mUb(2).equals("databases") && c2331cO.mUb(4).equals("documents")) {
            z2 = true;
        }
        wqP.n.t(z2, "Tried to parse an invalid key: %s", c2331cO);
        return Uo((C2331c) c2331cO.HI(5));
    }

    public static boolean ty(C2331c c2331c) {
        if (c2331c.ty() % 2 == 0) {
            return true;
        }
        return false;
    }
}
