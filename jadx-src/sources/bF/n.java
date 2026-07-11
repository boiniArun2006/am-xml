package bF;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f43221n;

    public static n rl(String str) {
        return new n(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f43221n.equals(((n) obj).f43221n);
        }
        return false;
    }

    public int hashCode() {
        return this.f43221n.hashCode() ^ 1000003;
    }

    public String n() {
        return this.f43221n;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f43221n + "\"}";
    }

    private n(String str) {
        if (str != null) {
            this.f43221n = str;
            return;
        }
        throw new NullPointerException("name is null");
    }
}
