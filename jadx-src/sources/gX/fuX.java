package gX;

import gAe.Q;
import gAe.UGc;
import gX.Pl;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX {
    private static fuX rl = new fuX();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f67598n = new AtomicReference(new Pl.n().t());

    public synchronized void O(Q q2) {
        this.f67598n.set(new Pl.n((Pl) this.f67598n.get()).O(q2).t());
    }

    public synchronized void nr(o oVar) {
        this.f67598n.set(new Pl.n((Pl) this.f67598n.get()).nr(oVar).t());
    }

    public static fuX t() {
        return rl;
    }

    public Object J2(UGc uGc, Class cls) {
        return ((Pl) this.f67598n.get()).O(uGc, cls);
    }

    public Class n(Class cls) {
        return ((Pl) this.f67598n.get()).t(cls);
    }

    public Object rl(gAe.CN3 cn3, Class cls) {
        return ((Pl) this.f67598n.get()).nr(cn3, cls);
    }

    fuX() {
    }
}
