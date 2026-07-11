package gX;

import com.google.crypto.tink.internal.TinkBugException;
import gAe.SPz;
import gX.QJ;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {
    private static final Dsr rl = new Dsr();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f67575n = new AtomicReference(new QJ.n().O());

    public synchronized void J2(w6 w6Var) {
        this.f67575n.set(new QJ.n((QJ) this.f67575n.get()).Uo(w6Var).O());
    }

    public synchronized void KN(C c2) {
        this.f67575n.set(new QJ.n((QJ) this.f67575n.get()).xMQ(c2).O());
    }

    public synchronized void O(n nVar) {
        this.f67575n.set(new QJ.n((QJ) this.f67575n.get()).J2(nVar).O());
    }

    public synchronized void Uo(aC aCVar) {
        this.f67575n.set(new QJ.n((QJ) this.f67575n.get()).KN(aCVar).O());
    }

    public static Dsr n() {
        return rl;
    }

    public gAe.CN3 nr(Xo xo, SPz sPz) {
        if (sPz == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (rl(xo)) {
            return t(xo, sPz);
        }
        try {
            return new I28(xo, sPz);
        } catch (GeneralSecurityException e2) {
            throw new TinkBugException("Creating a LegacyProtoKey failed", e2);
        }
    }

    public boolean rl(z zVar) {
        return ((QJ) this.f67575n.get()).O(zVar);
    }

    public gAe.CN3 t(z zVar, SPz sPz) {
        return ((QJ) this.f67575n.get()).J2(zVar, sPz);
    }
}
