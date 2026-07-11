package androidx.core.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Pair<F, S> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f36686n;
    public final Object rl;

    public static Pair n(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.n(pair.f36686n, this.f36686n) && ObjectsCompat.n(pair.rl, this.rl);
    }

    public int hashCode() {
        Object obj = this.f36686n;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.rl;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f36686n + " " + this.rl + "}";
    }

    public Pair(Object obj, Object obj2) {
        this.f36686n = obj;
        this.rl = obj2;
    }
}
