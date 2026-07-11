package t1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class z {

    private static class n implements eO, Serializable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f73433n;

        @Override // t1.eO
        public boolean apply(Object obj) {
            for (int i2 = 0; i2 < this.f73433n.size(); i2++) {
                if (!((eO) this.f73433n.get(i2)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        private n(List list) {
            this.f73433n = list;
        }

        public boolean equals(Object obj) {
            if (obj instanceof n) {
                return this.f73433n.equals(((n) obj).f73433n);
            }
            return false;
        }

        public int hashCode() {
            return this.f73433n.hashCode() + 306654252;
        }

        public String toString() {
            return z.nr("and", this.f73433n);
        }
    }

    private static List t(eO eOVar, eO eOVar2) {
        return Arrays.asList(eOVar, eOVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nr(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z2 = true;
        for (Object obj : iterable) {
            if (!z2) {
                sb.append(',');
            }
            sb.append(obj);
            z2 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static eO rl(eO eOVar, eO eOVar2) {
        return new n(t((eO) Xo.HI(eOVar), (eO) Xo.HI(eOVar2)));
    }
}
