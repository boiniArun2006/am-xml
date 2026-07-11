package BC;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml {
    public static Ml rl = n(new HashSet());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f395n;

    public static Ml n(Set set) {
        return new Ml(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ml.class != obj.getClass()) {
            return false;
        }
        return this.f395n.equals(((Ml) obj).f395n);
    }

    public int hashCode() {
        return this.f395n.hashCode();
    }

    public Set rl() {
        return this.f395n;
    }

    public String toString() {
        return "FieldMask{mask=" + this.f395n.toString() + "}";
    }

    private Ml(Set set) {
        this.f395n = set;
    }
}
