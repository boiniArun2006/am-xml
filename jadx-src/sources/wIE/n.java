package wIE;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {
    public static final n J2;
    public static final n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final wIE.j[] f74879O;
    public static final n Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f74880n;
    final boolean nr;
    private final String[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String[] f74881t;

    /* JADX INFO: renamed from: wIE.n$n, reason: collision with other inner class name */
    public static final class C1248n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f74882n;
        private boolean nr;
        private String[] rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String[] f74883t;

        public C1248n(boolean z2) {
            this.f74882n = z2;
        }

        public C1248n J2(String... strArr) {
            if (!this.f74882n) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.rl = null;
                return this;
            }
            this.rl = (String[]) strArr.clone();
            return this;
        }

        public C1248n KN(boolean z2) {
            if (!this.f74882n) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.nr = z2;
            return this;
        }

        public n O() {
            return new n(this);
        }

        public C1248n Uo(wIE.j... jVarArr) {
            if (!this.f74882n) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[jVarArr.length];
            for (int i2 = 0; i2 < jVarArr.length; i2++) {
                strArr[i2] = jVarArr[i2].f74878n;
            }
            this.rl = strArr;
            return this;
        }

        public C1248n mUb(C... cArr) {
            if (!this.f74882n) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (cArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[cArr.length];
            for (int i2 = 0; i2 < cArr.length; i2++) {
                strArr[i2] = cArr[i2].f74816n;
            }
            this.f74883t = strArr;
            return this;
        }

        public C1248n xMQ(String... strArr) {
            if (!this.f74882n) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f74883t = null;
                return this;
            }
            this.f74883t = (String[]) strArr.clone();
            return this;
        }

        public C1248n(n nVar) {
            this.f74882n = nVar.f74880n;
            this.rl = nVar.rl;
            this.f74883t = nVar.f74881t;
            this.nr = nVar.nr;
        }
    }

    static {
        wIE.j[] jVarArr = {wIE.j.Lp6, wIE.j.g6, wIE.j.Mh, wIE.j.EF, wIE.j.Zn, wIE.j.uG, wIE.j.nO, wIE.j.n7b, wIE.j.o9, wIE.j.VwL, wIE.j.mI, wIE.j.eWT, wIE.j.ul, wIE.j.f74850GR, wIE.j.dR0, wIE.j.f74867g};
        f74879O = jVarArr;
        C1248n c1248nUo = new C1248n(true).Uo(jVarArr);
        C c2 = C.TLS_1_3;
        C c4 = C.TLS_1_2;
        n nVarO = c1248nUo.mUb(c2, c4).KN(true).O();
        J2 = nVarO;
        Uo = new C1248n(nVarO).mUb(c2, c4, C.TLS_1_1, C.TLS_1_0).KN(true).O();
        KN = new C1248n(false).O();
    }

    private n(C1248n c1248n) {
        this.f74880n = c1248n.f74882n;
        this.rl = c1248n.rl;
        this.f74881t = c1248n.f74883t;
        this.nr = c1248n.nr;
    }

    private n O(SSLSocket sSLSocket, boolean z2) {
        String[] enabledCipherSuites;
        if (this.rl != null) {
            enabledCipherSuites = (String[]) o.t(String.class, this.rl, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z2 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new C1248n(this).J2(enabledCipherSuites).xMQ((String[]) o.t(String.class, this.f74881t, sSLSocket.getEnabledProtocols())).O();
    }

    public boolean J2() {
        return this.nr;
    }

    public List Uo() {
        C[] cArr = new C[this.f74881t.length];
        int i2 = 0;
        while (true) {
            String[] strArr = this.f74881t;
            if (i2 >= strArr.length) {
                return o.n(cArr);
            }
            cArr[i2] = C.n(strArr[i2]);
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        n nVar = (n) obj;
        boolean z2 = this.f74880n;
        if (z2 != nVar.f74880n) {
            return false;
        }
        return !z2 || (Arrays.equals(this.rl, nVar.rl) && Arrays.equals(this.f74881t, nVar.f74881t) && this.nr == nVar.nr);
    }

    public int hashCode() {
        if (this.f74880n) {
            return ((((527 + Arrays.hashCode(this.rl)) * 31) + Arrays.hashCode(this.f74881t)) * 31) + (!this.nr ? 1 : 0);
        }
        return 17;
    }

    public List nr() {
        String[] strArr = this.rl;
        if (strArr == null) {
            return null;
        }
        wIE.j[] jVarArr = new wIE.j[strArr.length];
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.rl;
            if (i2 >= strArr2.length) {
                return o.n(jVarArr);
            }
            jVarArr[i2] = wIE.j.n(strArr2[i2]);
            i2++;
        }
    }

    public String toString() {
        if (!this.f74880n) {
            return "ConnectionSpec()";
        }
        List listNr = nr();
        return "ConnectionSpec(cipherSuites=" + (listNr == null ? "[use default]" : listNr.toString()) + ", tlsVersions=" + Uo() + ", supportsTlsExtensions=" + this.nr + ")";
    }

    public void t(SSLSocket sSLSocket, boolean z2) {
        n nVarO = O(sSLSocket, z2);
        sSLSocket.setEnabledProtocols(nVarO.f74881t);
        String[] strArr = nVarO.rl;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }
}
