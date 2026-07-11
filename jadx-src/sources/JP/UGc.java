package JP;

import com.applovin.sdk.AppLovinEventParameters;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import t1.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc extends qf {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f4522O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SocketAddress f4523n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InetSocketAddress f4524t;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private SocketAddress f4525n;
        private String nr;
        private InetSocketAddress rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f4526t;

        private n() {
        }

        public n O(String str) {
            this.f4526t = str;
            return this;
        }

        public UGc n() {
            return new UGc(this.f4525n, this.rl, this.f4526t, this.nr);
        }

        public n nr(InetSocketAddress inetSocketAddress) {
            this.rl = (InetSocketAddress) t1.Xo.ck(inetSocketAddress, "targetAddress");
            return this;
        }

        public n rl(String str) {
            this.nr = str;
            return this;
        }

        public n t(SocketAddress socketAddress) {
            this.f4525n = (SocketAddress) t1.Xo.ck(socketAddress, "proxyAddress");
            return this;
        }
    }

    private UGc(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        t1.Xo.ck(socketAddress, "proxyAddress");
        t1.Xo.ck(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            t1.Xo.aYN(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f4523n = socketAddress;
        this.f4524t = inetSocketAddress;
        this.f4522O = str;
        this.J2 = str2;
    }

    public static n O() {
        return new n();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UGc)) {
            return false;
        }
        UGc uGc = (UGc) obj;
        return t1.C.n(this.f4523n, uGc.f4523n) && t1.C.n(this.f4524t, uGc.f4524t) && t1.C.n(this.f4522O, uGc.f4522O) && t1.C.n(this.J2, uGc.J2);
    }

    public int hashCode() {
        return t1.C.rl(this.f4523n, this.f4524t, this.f4522O, this.J2);
    }

    public String n() {
        return this.J2;
    }

    public String nr() {
        return this.f4522O;
    }

    public SocketAddress rl() {
        return this.f4523n;
    }

    public InetSocketAddress t() {
        return this.f4524t;
    }

    public String toString() {
        boolean z2;
        Dsr.n nVarNr = t1.Dsr.t(this).nr("proxyAddr", this.f4523n).nr("targetAddr", this.f4524t).nr(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, this.f4522O);
        if (this.J2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return nVarNr.O("hasPassword", z2).toString();
    }
}
