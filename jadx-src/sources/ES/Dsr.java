package ES;

import androidx.core.util.Pair;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f2304n;
    Object rl;

    private static boolean n(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return n(pair.f36686n, this.f2304n) && n(pair.rl, this.rl);
    }

    public int hashCode() {
        Object obj = this.f2304n;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.rl;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public void rl(Object obj, Object obj2) {
        this.f2304n = obj;
        this.rl = obj2;
    }

    public String toString() {
        return "Pair{" + this.f2304n + " " + this.rl + "}";
    }
}
