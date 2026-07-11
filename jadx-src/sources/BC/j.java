package BC;

import com.google.firebase.Timestamp;
import java.util.Collections;
import java.util.List;
import pUk.SPz;
import uB.C2398j;
import uB.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f403n;

    protected abstract s4 t(s4 s4Var);

    /* JADX INFO: renamed from: BC.j$j, reason: collision with other inner class name */
    public static class C0010j extends j {
        public C0010j(List list) {
            super(list);
        }

        @Override // BC.j
        protected s4 t(s4 s4Var) {
            C2398j.n nVarNr = j.nr(s4Var);
            for (s4 s4Var2 : O()) {
                int i2 = 0;
                while (i2 < nVarNr.qie()) {
                    if (SPz.r(nVarNr.gh(i2), s4Var2)) {
                        nVarNr.az(i2);
                    } else {
                        i2++;
                    }
                }
            }
            return (s4) s4.X().xMQ(nVarNr).build();
        }
    }

    public static class n extends j {
        public n(List list) {
            super(list);
        }

        @Override // BC.j
        protected s4 t(s4 s4Var) {
            C2398j.n nVarNr = j.nr(s4Var);
            for (s4 s4Var2 : O()) {
                if (!SPz.Ik(nVarNr, s4Var2)) {
                    nVarNr.mUb(s4Var2);
                }
            }
            return (s4) s4.X().xMQ(nVarNr).build();
        }
    }

    public List O() {
        return this.f403n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f403n.equals(((j) obj).f403n);
    }

    j(List list) {
        this.f403n = Collections.unmodifiableList(list);
    }

    static C2398j.n nr(s4 s4Var) {
        if (SPz.XQ(s4Var)) {
            return (C2398j.n) s4Var.Z().toBuilder();
        }
        return C2398j.r();
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f403n.hashCode();
    }

    @Override // BC.eO
    public s4 n(s4 s4Var, s4 s4Var2) {
        return t(s4Var);
    }

    @Override // BC.eO
    public s4 rl(s4 s4Var, Timestamp timestamp) {
        return t(s4Var);
    }
}
