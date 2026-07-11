package gX;

import gAe.Q;
import gAe.UGc;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f67582n;
    private final Map rl;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f67583n;
        private final Map rl;

        public n() {
            this.f67583n = new HashMap();
            this.rl = new HashMap();
        }

        public n O(Q q2) throws GeneralSecurityException {
            if (q2 == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class clsT = q2.t();
            if (!this.rl.containsKey(clsT)) {
                this.rl.put(clsT, q2);
                return this;
            }
            Q q3 = (Q) this.rl.get(clsT);
            if (q3.equals(q2) && q2.equals(q3)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsT);
        }

        public n nr(o oVar) throws GeneralSecurityException {
            if (oVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            w6 w6Var = new w6(oVar.t(), oVar.nr());
            if (!this.f67583n.containsKey(w6Var)) {
                this.f67583n.put(w6Var, oVar);
                return this;
            }
            o oVar2 = (o) this.f67583n.get(w6Var);
            if (oVar2.equals(oVar) && oVar.equals(oVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + w6Var);
        }

        Pl t() {
            return new Pl(this);
        }

        public n(Pl pl) {
            this.f67583n = new HashMap(pl.f67582n);
            this.rl = new HashMap(pl.rl);
        }
    }

    private static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f67584n;
        private final Class rl;

        private w6(Class cls, Class cls2) {
            this.f67584n = cls;
            this.rl = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return w6Var.f67584n.equals(this.f67584n) && w6Var.rl.equals(this.rl);
        }

        public int hashCode() {
            return Objects.hash(this.f67584n, this.rl);
        }

        public String toString() {
            return this.f67584n.getSimpleName() + " with primitive type: " + this.rl.getSimpleName();
        }
    }

    private Pl(n nVar) {
        this.f67582n = new HashMap(nVar.f67583n);
        this.rl = new HashMap(nVar.rl);
    }

    public Object O(UGc uGc, Class cls) throws GeneralSecurityException {
        if (!this.rl.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        Q q2 = (Q) this.rl.get(cls);
        if (uGc.Uo().equals(q2.n()) && q2.n().equals(uGc.Uo())) {
            return q2.rl(uGc);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public Object nr(gAe.CN3 cn3, Class cls) throws GeneralSecurityException {
        w6 w6Var = new w6(cn3.getClass(), cls);
        if (this.f67582n.containsKey(w6Var)) {
            return ((o) this.f67582n.get(w6Var)).n(cn3);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + w6Var + " available");
    }

    public Class t(Class cls) throws GeneralSecurityException {
        if (this.rl.containsKey(cls)) {
            return ((Q) this.rl.get(cls)).n();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }
}
