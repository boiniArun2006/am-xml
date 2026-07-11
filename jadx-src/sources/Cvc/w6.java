package Cvc;

import gAe.C;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Cvc.j f1037n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f1038t;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ArrayList f1039n = new ArrayList();
        private Cvc.j rl = Cvc.j.rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f1040t = null;

        private boolean t(int i2) {
            Iterator it = this.f1039n.iterator();
            while (it.hasNext()) {
                if (((C0038w6) it.next()).n() == i2) {
                    return true;
                }
            }
            return false;
        }

        public n O(int i2) {
            if (this.f1039n == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f1040t = Integer.valueOf(i2);
            return this;
        }

        public n n(C c2, int i2, String str, String str2) {
            ArrayList arrayList = this.f1039n;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0038w6(c2, i2, str, str2));
            return this;
        }

        public n nr(Cvc.j jVar) {
            if (this.f1039n == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.rl = jVar;
            return this;
        }

        public w6 rl() throws GeneralSecurityException {
            if (this.f1039n == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f1040t;
            if (num != null && !t(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            w6 w6Var = new w6(this.rl, Collections.unmodifiableList(this.f1039n), this.f1040t);
            this.f1039n = null;
            return w6Var;
        }
    }

    /* JADX INFO: renamed from: Cvc.w6$w6, reason: collision with other inner class name */
    public static final class C0038w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final C f1041n;
        private final String nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f1042t;

        private C0038w6(C c2, int i2, String str, String str2) {
            this.f1041n = c2;
            this.rl = i2;
            this.f1042t = str;
            this.nr = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0038w6)) {
                return false;
            }
            C0038w6 c0038w6 = (C0038w6) obj;
            return this.f1041n == c0038w6.f1041n && this.rl == c0038w6.rl && this.f1042t.equals(c0038w6.f1042t) && this.nr.equals(c0038w6.nr);
        }

        public int hashCode() {
            return Objects.hash(this.f1041n, Integer.valueOf(this.rl), this.f1042t, this.nr);
        }

        public int n() {
            return this.rl;
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f1041n, Integer.valueOf(this.rl), this.f1042t, this.nr);
        }
    }

    private w6(Cvc.j jVar, List list, Integer num) {
        this.f1037n = jVar;
        this.rl = list;
        this.f1038t = num;
    }

    public static n n() {
        return new n();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return this.f1037n.equals(w6Var.f1037n) && this.rl.equals(w6Var.rl) && Objects.equals(this.f1038t, w6Var.f1038t);
    }

    public int hashCode() {
        return Objects.hash(this.f1037n, this.rl);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f1037n, this.rl, this.f1038t);
    }
}
