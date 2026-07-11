package FQq;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f2568n;
    private final Throwable rl;

    public ci(Object obj) {
        this.f2568n = obj;
        this.rl = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        if (rl() != null && rl().equals(ciVar.rl())) {
            return true;
        }
        if (n() == null || ciVar.n() == null) {
            return false;
        }
        return n().toString().equals(n().toString());
    }

    public Throwable n() {
        return this.rl;
    }

    public Object rl() {
        return this.f2568n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{rl(), n()});
    }

    public ci(Throwable th) {
        this.rl = th;
        this.f2568n = null;
    }
}
