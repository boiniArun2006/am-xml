package gAe;

import com.google.crypto.tink.shaded.protobuf.rv6;
import gX.Ml;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import uBO.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f67165n = Logger.getLogger(r.class.getName());
    private static final AtomicReference rl = new AtomicReference(new aC());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ConcurrentMap f67166t = new ConcurrentHashMap();
    private static final ConcurrentMap nr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final ConcurrentMap f67164O = new ConcurrentHashMap();
    private static final ConcurrentMap J2 = new ConcurrentHashMap();

    class j implements n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ gX.Ml f67167n;

        j(gX.Ml ml) {
            this.f67167n = ml;
        }
    }

    private interface n {
    }

    public static fuX KN(String str) {
        return ((aC) rl.get()).J2(str);
    }

    public static Object O(String str, com.google.crypto.tink.shaded.protobuf.fuX fux, Class cls) {
        return ((aC) rl.get()).t(str, cls).t(fux);
    }

    public static synchronized uBO.SPz gh(g9s g9sVar) {
        fuX fuxKN;
        fuxKN = KN(g9sVar.p5());
        if (!((Boolean) nr.get(g9sVar.p5())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + g9sVar.p5());
        }
        return fuxKN.n(g9sVar.eF());
    }

    public static synchronized rv6 mUb(g9s g9sVar) {
        fuX fuxKN;
        fuxKN = KN(g9sVar.p5());
        if (!((Boolean) nr.get(g9sVar.p5())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + g9sVar.p5());
        }
        return fuxKN.nr(g9sVar.eF());
    }

    private static n n(gX.Ml ml) {
        return new j(ml);
    }

    public static synchronized void qie(gX.Ml ml, boolean z2) {
        try {
            if (ml == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = rl;
            aC aCVar = new aC((aC) atomicReference.get());
            aCVar.Uo(ml);
            String strNr = ml.nr();
            rl(strNr, z2 ? ml.J2().t() : Collections.EMPTY_MAP, z2);
            if (!((aC) atomicReference.get()).mUb(strNr)) {
                f67166t.put(strNr, n(ml));
                if (z2) {
                    az(strNr, ml.J2().t());
                }
            }
            nr.put(strNr, Boolean.valueOf(z2));
            atomicReference.set(aCVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized void rl(String str, Map map, boolean z2) {
        if (z2) {
            try {
                ConcurrentMap concurrentMap = nr;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z2) {
            if (((aC) rl.get()).mUb(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!J2.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (J2.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static synchronized void ty(Q q2) {
        gX.fuX.t().O(q2);
    }

    static synchronized Map xMQ() {
        return Collections.unmodifiableMap(J2);
    }

    public static Object HI(UGc uGc, Class cls) {
        return gX.fuX.t().J2(uGc, cls);
    }

    public static Object J2(String str, byte[] bArr, Class cls) {
        return O(str, com.google.crypto.tink.shaded.protobuf.fuX.J2(bArr), cls);
    }

    public static Object Uo(uBO.SPz sPz, Class cls) {
        return O(sPz.p5(), sPz.eF(), cls);
    }

    private static void az(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            J2.put((String) entry.getKey(), o.n(str, ((rv6) ((Ml.j.C0947j) entry.getValue()).f67581n).toByteArray(), ((Ml.j.C0947j) entry.getValue()).rl));
        }
    }

    public static Class nr(Class cls) {
        try {
            return gX.fuX.t().n(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    static Object t(CN3 cn3, Class cls) {
        return gX.fuX.t().rl(cn3, cls);
    }
}
