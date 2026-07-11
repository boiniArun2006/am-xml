package WkR;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f11554n;
    private final Map rl;

    /* JADX INFO: renamed from: WkR.n$n, reason: collision with other inner class name */
    public static final class C0419n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f11555n;
        private Map rl = null;

        public n n() {
            return new n(this.f11555n, this.rl == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.rl)));
        }

        public C0419n rl(Annotation annotation) {
            if (this.rl == null) {
                this.rl = new HashMap();
            }
            this.rl.put(annotation.annotationType(), annotation);
            return this;
        }

        C0419n(String str) {
            this.f11555n = str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f11554n.equals(nVar.f11554n) && this.rl.equals(nVar.rl);
    }

    private n(String str, Map map) {
        this.f11554n = str;
        this.rl = map;
    }

    public static C0419n n(String str) {
        return new C0419n(str);
    }

    public static n nr(String str) {
        return new n(str, Collections.EMPTY_MAP);
    }

    public int hashCode() {
        return (this.f11554n.hashCode() * 31) + this.rl.hashCode();
    }

    public String rl() {
        return this.f11554n;
    }

    public Annotation t(Class cls) {
        return (Annotation) this.rl.get(cls);
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f11554n + ", properties=" + this.rl.values() + "}";
    }
}
