package uOq;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class g9s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f74385n;
    private final Class rl;

    private @interface j {
    }

    public static g9s n(Class cls, Class cls2) {
        return new g9s(cls, cls2);
    }

    public static g9s rl(Class cls) {
        return new g9s(j.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g9s.class != obj.getClass()) {
            return false;
        }
        g9s g9sVar = (g9s) obj;
        if (this.rl.equals(g9sVar.rl)) {
            return this.f74385n.equals(g9sVar.f74385n);
        }
        return false;
    }

    public int hashCode() {
        return (this.rl.hashCode() * 31) + this.f74385n.hashCode();
    }

    public String toString() {
        if (this.f74385n == j.class) {
            return this.rl.getName();
        }
        return "@" + this.f74385n.getName() + " " + this.rl.getName();
    }

    public g9s(Class cls, Class cls2) {
        this.f74385n = cls;
        this.rl = cls2;
    }
}
