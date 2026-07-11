package gAe;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import uBO.Ln;
import uBO.Z;
import uBO.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Z.n f67152n;

    private synchronized Z.w6 J2(g9s g9sVar) {
        return t(r.gh(g9sVar), g9sVar.M7());
    }

    private synchronized boolean O(int i2) {
        Iterator it = this.f67152n.ck().iterator();
        while (it.hasNext()) {
            if (((Z.w6) it.next()).p5() == i2) {
                return true;
            }
        }
        return false;
    }

    private synchronized int Uo() {
        int iT;
        iT = gX.l3D.t();
        while (O(iT)) {
            iT = gX.l3D.t();
        }
        return iT;
    }

    private synchronized Z.w6 t(uBO.SPz sPz, Ln ln2) {
        int iUo;
        iUo = Uo();
        if (ln2 == Ln.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (Z.w6) Z.w6.FX().az(sPz).ty(iUo).ck(uBO.ci.ENABLED).HI(ln2).t();
    }

    public synchronized Xo KN(int i2) {
        for (int i3 = 0; i3 < this.f67152n.HI(); i3++) {
            Z.w6 w6VarTy = this.f67152n.ty(i3);
            if (w6VarTy.p5() == i2) {
                if (!w6VarTy.E().equals(uBO.ci.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i2);
                }
                this.f67152n.Ik(i2);
            }
        }
        throw new GeneralSecurityException("key not found: " + i2);
        return this;
    }

    public synchronized Xo n(o oVar) {
        rl(oVar.rl(), false);
        return this;
    }

    public synchronized Pl nr() {
        return Pl.O((Z) this.f67152n.t());
    }

    public synchronized int rl(g9s g9sVar, boolean z2) {
        Z.w6 w6VarJ2;
        try {
            w6VarJ2 = J2(g9sVar);
            this.f67152n.az(w6VarJ2);
            if (z2) {
                this.f67152n.Ik(w6VarJ2.p5());
            }
        } catch (Throwable th) {
            throw th;
        }
        return w6VarJ2.p5();
    }

    public static Xo mUb(Pl pl) {
        return new Xo((Z.n) pl.KN().rV9());
    }

    public static Xo xMQ() {
        return new Xo(Z.M());
    }

    private Xo(Z.n nVar) {
        this.f67152n = nVar;
    }
}
