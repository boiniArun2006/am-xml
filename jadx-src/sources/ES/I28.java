package ES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final I28 f2305t = new I28("COMPOSITION");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f2306n;
    private Wre rl;

    public I28(String... strArr) {
        this.f2306n = Arrays.asList(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            I28 i28 = (I28) obj;
            if (!this.f2306n.equals(i28.f2306n)) {
                return false;
            }
            Wre wre = this.rl;
            Wre wre2 = i28.rl;
            if (wre != null) {
                return wre.equals(wre2);
            }
            if (wre2 == null) {
                return true;
            }
        }
        return false;
    }

    private boolean J2(String str) {
        return "__container".equals(str);
    }

    private boolean rl() {
        return ((String) this.f2306n.get(r0.size() - 1)).equals("**");
    }

    public boolean KN(String str, int i2) {
        return "__container".equals(str) || i2 < this.f2306n.size() - 1 || ((String) this.f2306n.get(i2)).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f2306n.hashCode() * 31;
        Wre wre = this.rl;
        return iHashCode + (wre != null ? wre.hashCode() : 0);
    }

    public I28 n(String str) {
        I28 i28 = new I28(this);
        i28.f2306n.add(str);
        return i28;
    }

    public Wre nr() {
        return this.rl;
    }

    public boolean t(String str, int i2) {
        if (i2 >= this.f2306n.size()) {
            return false;
        }
        boolean z2 = i2 == this.f2306n.size() - 1;
        String str2 = (String) this.f2306n.get(i2);
        if (!str2.equals("**")) {
            return (z2 || (i2 == this.f2306n.size() + (-2) && rl())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z2 && ((String) this.f2306n.get(i2 + 1)).equals(str)) {
            return i2 == this.f2306n.size() + (-2) || (i2 == this.f2306n.size() + (-3) && rl());
        }
        if (z2) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.f2306n.size() - 1) {
            return false;
        }
        return ((String) this.f2306n.get(i3)).equals(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f2306n);
        sb.append(",resolved=");
        sb.append(this.rl != null);
        sb.append('}');
        return sb.toString();
    }

    public I28 xMQ(Wre wre) {
        I28 i28 = new I28(this);
        i28.rl = wre;
        return i28;
    }

    private I28(I28 i28) {
        this.f2306n = new ArrayList(i28.f2306n);
        this.rl = i28.rl;
    }

    public int O(String str, int i2) {
        if (J2(str)) {
            return 0;
        }
        if (!((String) this.f2306n.get(i2)).equals("**")) {
            return 1;
        }
        if (i2 == this.f2306n.size() - 1 || !((String) this.f2306n.get(i2 + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean Uo(String str, int i2) {
        if (J2(str)) {
            return true;
        }
        if (i2 >= this.f2306n.size()) {
            return false;
        }
        if (((String) this.f2306n.get(i2)).equals(str) || ((String) this.f2306n.get(i2)).equals("**") || ((String) this.f2306n.get(i2)).equals("*")) {
            return true;
        }
        return false;
    }
}
