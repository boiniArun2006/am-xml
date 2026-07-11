package gX;

import gAe.SPz;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f67585n;
    private final Map nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f67586t;

    private static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f67587n;
        private final Class rl;

        private Ml(Class cls, Class cls2) {
            this.f67587n = cls;
            this.rl = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Ml)) {
                return false;
            }
            Ml ml = (Ml) obj;
            return ml.f67587n.equals(this.f67587n) && ml.rl.equals(this.rl);
        }

        public int hashCode() {
            return Objects.hash(this.f67587n, this.rl);
        }

        public String toString() {
            return this.f67587n.getSimpleName() + " with serialization type: " + this.rl.getSimpleName();
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Map f67588n;
        private final Map nr;
        private final Map rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Map f67589t;

        public n() {
            this.f67588n = new HashMap();
            this.rl = new HashMap();
            this.f67589t = new HashMap();
            this.nr = new HashMap();
        }

        public n J2(gX.n nVar) throws GeneralSecurityException {
            w6 w6Var = new w6(nVar.t(), nVar.rl());
            if (!this.rl.containsKey(w6Var)) {
                this.rl.put(w6Var, nVar);
                return this;
            }
            gX.n nVar2 = (gX.n) this.rl.get(w6Var);
            if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + w6Var);
        }

        public n KN(aC aCVar) throws GeneralSecurityException {
            w6 w6Var = new w6(aCVar.t(), aCVar.rl());
            if (!this.nr.containsKey(w6Var)) {
                this.nr.put(w6Var, aCVar);
                return this;
            }
            aC aCVar2 = (aC) this.nr.get(w6Var);
            if (aCVar2.equals(aCVar) && aCVar.equals(aCVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + w6Var);
        }

        QJ O() {
            return new QJ(this);
        }

        public n Uo(gX.w6 w6Var) throws GeneralSecurityException {
            Ml ml = new Ml(w6Var.rl(), w6Var.t());
            if (!this.f67588n.containsKey(ml)) {
                this.f67588n.put(ml, w6Var);
                return this;
            }
            gX.w6 w6Var2 = (gX.w6) this.f67588n.get(ml);
            if (w6Var2.equals(w6Var) && w6Var.equals(w6Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + ml);
        }

        public n xMQ(C c2) throws GeneralSecurityException {
            Ml ml = new Ml(c2.rl(), c2.t());
            if (!this.f67589t.containsKey(ml)) {
                this.f67589t.put(ml, c2);
                return this;
            }
            C c4 = (C) this.f67589t.get(ml);
            if (c4.equals(c2) && c2.equals(c4)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + ml);
        }

        public n(QJ qj) {
            this.f67588n = new HashMap(qj.f67585n);
            this.rl = new HashMap(qj.rl);
            this.f67589t = new HashMap(qj.f67586t);
            this.nr = new HashMap(qj.nr);
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Class f67590n;
        private final nri.j rl;

        private w6(Class cls, nri.j jVar) {
            this.f67590n = cls;
            this.rl = jVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return w6Var.f67590n.equals(this.f67590n) && w6Var.rl.equals(this.rl);
        }

        public int hashCode() {
            return Objects.hash(this.f67590n, this.rl);
        }

        public String toString() {
            return this.f67590n.getSimpleName() + ", object identifier: " + this.rl;
        }
    }

    private QJ(n nVar) {
        this.f67585n = new HashMap(nVar.f67588n);
        this.rl = new HashMap(nVar.rl);
        this.f67586t = new HashMap(nVar.f67589t);
        this.nr = new HashMap(nVar.nr);
    }

    public gAe.CN3 J2(z zVar, SPz sPz) throws GeneralSecurityException {
        w6 w6Var = new w6(zVar.getClass(), zVar.n());
        if (this.rl.containsKey(w6Var)) {
            return ((gX.n) this.rl.get(w6Var)).nr(zVar, sPz);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + w6Var + " available");
    }

    public boolean O(z zVar) {
        return this.rl.containsKey(new w6(zVar.getClass(), zVar.n()));
    }
}
