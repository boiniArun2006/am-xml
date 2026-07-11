package JP;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Q {
    private static final Logger J2 = Logger.getLogger(Q.class.getName());
    private static final Q Uo = new Q();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentNavigableMap f4514n = new ConcurrentSkipListMap();
    private final ConcurrentNavigableMap rl = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConcurrentMap f4515t = new ConcurrentHashMap();
    private final ConcurrentMap nr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ConcurrentMap f4513O = new ConcurrentHashMap();

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final w6 f4516n;

        public n(w6 w6Var) {
            this.f4516n = (w6) t1.Xo.HI(w6Var);
        }
    }

    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f4517n;
        public final Certificate rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Certificate f4518t;

        public w6(SSLSession sSLSession) {
            Certificate certificate;
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate2 = null;
            if (localCertificates != null) {
                certificate = localCertificates[0];
            } else {
                certificate = null;
            }
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate2 = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e2) {
                Q.J2.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e2);
            }
            this.f4517n = cipherSuite;
            this.rl = certificate;
            this.f4518t = certificate2;
        }
    }

    public static Q Uo() {
        return Uo;
    }

    public void O(g9s g9sVar) {
        rl(this.f4515t, g9sVar);
    }

    public void gh(g9s g9sVar) {
        KN(this.f4515t, g9sVar);
    }

    public void mUb(g9s g9sVar) {
        KN(this.rl, g9sVar);
    }

    public void nr(g9s g9sVar) {
        rl(this.rl, g9sVar);
    }

    public void t(g9s g9sVar) {
        rl(this.nr, g9sVar);
    }

    public void xMQ(g9s g9sVar) {
        KN(this.nr, g9sVar);
    }

    public static long J2(Z z2) {
        return z2.nr().nr();
    }

    private static void KN(Map map, g9s g9sVar) {
    }

    private static void rl(Map map, g9s g9sVar) {
    }
}
