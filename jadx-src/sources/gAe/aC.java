package gAe;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class aC {
    private static final Logger rl = Logger.getLogger(aC.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentMap f67153n;

    class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ gX.Ml f67154n;

        j(gX.Ml ml) {
            this.f67154n = ml;
        }

        @Override // gAe.aC.n
        public Class n() {
            return this.f67154n.getClass();
        }

        @Override // gAe.aC.n
        public fuX nr() {
            gX.Ml ml = this.f67154n;
            return new Dsr(ml, ml.rl());
        }

        @Override // gAe.aC.n
        public Set rl() {
            return this.f67154n.xMQ();
        }

        @Override // gAe.aC.n
        public fuX t(Class cls) throws GeneralSecurityException {
            try {
                return new Dsr(this.f67154n, cls);
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException("Primitive type not supported", e2);
            }
        }
    }

    private interface n {
        Class n();

        fuX nr();

        Set rl();

        fuX t(Class cls);
    }

    aC(aC aCVar) {
        this.f67153n = new ConcurrentHashMap(aCVar.f67153n);
    }

    private synchronized void KN(n nVar, boolean z2) {
        try {
            String strRl = nVar.nr().rl();
            n nVar2 = (n) this.f67153n.get(strRl);
            if (nVar2 != null && !nVar2.n().equals(nVar.n())) {
                rl.warning("Attempted overwrite of a registered key manager for key type " + strRl);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strRl, nVar2.n().getName(), nVar.n().getName()));
            }
            if (z2) {
                this.f67153n.put(strRl, nVar);
            } else {
                this.f67153n.putIfAbsent(strRl, nVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized n nr(String str) {
        if (!this.f67153n.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (n) this.f67153n.get(str);
    }

    synchronized void Uo(gX.Ml ml) {
        if (!ml.n().n()) {
            throw new GeneralSecurityException("failed to register key manager " + ml.getClass() + " as it is not FIPS compatible.");
        }
        KN(rl(ml), false);
    }

    private static n rl(gX.Ml ml) {
        return new j(ml);
    }

    private static String xMQ(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z2) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z2 = false;
        }
        return sb.toString();
    }

    boolean mUb(String str) {
        return this.f67153n.containsKey(str);
    }

    aC() {
        this.f67153n = new ConcurrentHashMap();
    }

    private fuX O(String str, Class cls) throws GeneralSecurityException {
        n nVarNr = nr(str);
        if (cls == null) {
            return nVarNr.nr();
        }
        if (nVarNr.rl().contains(cls)) {
            return nVarNr.t(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + nVarNr.n() + ", supported primitives: " + xMQ(nVarNr.rl()));
    }

    private static Object n(Object obj) {
        obj.getClass();
        return obj;
    }

    fuX J2(String str) {
        return nr(str).nr();
    }

    fuX t(String str, Class cls) {
        return O(str, (Class) n(cls));
    }
}
