package Szt;

import FSZ.qz;
import Hh.Dsr;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final lN.Ml f10120n;
    private final qz rl;
    private final LinkedHashSet nr = new LinkedHashSet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qz.n f10121t = new j();

    class j implements qz.n {
        j() {
        }

        @Override // FSZ.qz.n
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void n(lN.Ml ml, boolean z2) {
            w6.this.J2(ml, z2);
        }
    }

    static class n implements lN.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final lN.Ml f10123n;
        private final int rl;

        @Override // lN.Ml
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (this.rl == nVar.rl && this.f10123n.equals(nVar.f10123n)) {
                    return true;
                }
            }
            return false;
        }

        @Override // lN.Ml
        public String n() {
            return null;
        }

        @Override // lN.Ml
        public boolean rl() {
            return false;
        }

        @Override // lN.Ml
        public int hashCode() {
            return (this.f10123n.hashCode() * 1013) + this.rl;
        }

        public n(lN.Ml ml, int i2) {
            this.f10123n = ml;
            this.rl = i2;
        }

        public String toString() {
            return Dsr.rl(this).rl("imageCacheKey", this.f10123n).n("frameIndex", this.rl).toString();
        }
    }

    private synchronized lN.Ml Uo() {
        lN.Ml ml;
        Iterator it = this.nr.iterator();
        if (it.hasNext()) {
            ml = (lN.Ml) it.next();
            it.remove();
        } else {
            ml = null;
        }
        return ml;
    }

    public synchronized void J2(lN.Ml ml, boolean z2) {
        try {
            if (z2) {
                this.nr.add(ml);
            } else {
                this.nr.remove(ml);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private n O(int i2) {
        return new n(this.f10120n, i2);
    }

    public Pj0.j n(int i2, Pj0.j jVar) {
        return this.rl.t(O(i2), jVar, this.f10121t);
    }

    public boolean rl(int i2) {
        return this.rl.contains(O(i2));
    }

    public Pj0.j t(int i2) {
        return this.rl.get(O(i2));
    }

    public w6(lN.Ml ml, qz qzVar) {
        this.f10120n = ml;
        this.rl = qzVar;
    }

    public Pj0.j nr() {
        Pj0.j jVarNr;
        do {
            lN.Ml mlUo = Uo();
            if (mlUo == null) {
                return null;
            }
            jVarNr = this.rl.nr(mlUo);
        } while (jVarNr == null);
        return jVarNr;
    }
}
