package pUk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Wre implements Comparable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Wre f72009O = rl("", "");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f72010n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f72011t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Wre.class == obj.getClass()) {
            Wre wre = (Wre) obj;
            if (this.f72010n.equals(wre.f72010n) && this.f72011t.equals(wre.f72011t)) {
                return true;
            }
        }
        return false;
    }

    public static Wre rl(String str, String str2) {
        return new Wre(str, str2);
    }

    public String J2() {
        return this.f72010n;
    }

    public int hashCode() {
        return (this.f72010n.hashCode() * 31) + this.f72011t.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(Wre wre) {
        int iCompareTo = this.f72010n.compareTo(wre.f72010n);
        return iCompareTo != 0 ? iCompareTo : this.f72011t.compareTo(wre.f72011t);
    }

    public String nr() {
        return this.f72011t;
    }

    public String toString() {
        return "DatabaseId(" + this.f72010n + ", " + this.f72011t + ")";
    }

    private Wre(String str, String str2) {
        this.f72010n = str;
        this.f72011t = str2;
    }

    public static Wre t(String str) {
        C2331c c2331cO = C2331c.o(str);
        boolean z2 = false;
        if (c2331cO.ty() > 3 && c2331cO.mUb(0).equals("projects") && c2331cO.mUb(2).equals("databases")) {
            z2 = true;
        }
        wqP.n.t(z2, "Tried to parse an invalid resource name: %s", c2331cO);
        return new Wre(c2331cO.mUb(1), c2331cO.mUb(3));
    }
}
