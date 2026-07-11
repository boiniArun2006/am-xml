package VyM;

import FjR.Dsr;
import FjR.I28;
import FjR.Xo;
import VyM.w6;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f11415n;
    private final Dsr rl;

    public static final class j implements w6.j {
        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return j.class.hashCode();
        }

        @Override // VyM.w6.j
        public w6 n(Ml ml, Dsr dsr) {
            return new n(ml, dsr);
        }
    }

    @Override // VyM.w6
    public void n() {
        Dsr dsr = this.rl;
        if (dsr instanceof Xo) {
            this.f11415n.rl(((Xo) dsr).n());
        } else {
            if (!(dsr instanceof I28)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f11415n.nr(((I28) dsr).n());
        }
    }

    public n(Ml ml, Dsr dsr) {
        this.f11415n = ml;
        this.rl = dsr;
    }
}
