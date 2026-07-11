package Z;

import Z.w6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX {
    public static final fuX nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f12271t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f12272n;
    private final w6 rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f12272n, fux.f12272n) && Intrinsics.areEqual(this.rl, fux.rl);
    }

    static {
        w6.n nVar = w6.n.f12274n;
        nr = new fuX(nVar, nVar);
    }

    public int hashCode() {
        return (this.f12272n.hashCode() * 31) + this.rl.hashCode();
    }

    public final w6 n() {
        return this.f12272n;
    }

    public final w6 nr() {
        return this.f12272n;
    }

    public final w6 rl() {
        return this.rl;
    }

    public final w6 t() {
        return this.rl;
    }

    public String toString() {
        return "Size(width=" + this.f12272n + ", height=" + this.rl + ')';
    }

    public fuX(w6 w6Var, w6 w6Var2) {
        this.f12272n = w6Var;
        this.rl = w6Var2;
    }
}
