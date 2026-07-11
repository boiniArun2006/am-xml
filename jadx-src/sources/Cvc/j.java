package Cvc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {
    public static final j rl = n().n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f1035n;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private HashMap f1036n = new HashMap();

        public j n() {
            if (this.f1036n == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            j jVar = new j(Collections.unmodifiableMap(this.f1036n));
            this.f1036n = null;
            return jVar;
        }
    }

    private j(Map map) {
        this.f1035n = map;
    }

    public static n n() {
        return new n();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f1035n.equals(((j) obj).f1035n);
        }
        return false;
    }

    public int hashCode() {
        return this.f1035n.hashCode();
    }

    public Map rl() {
        return this.f1035n;
    }

    public String toString() {
        return this.f1035n.toString();
    }
}
