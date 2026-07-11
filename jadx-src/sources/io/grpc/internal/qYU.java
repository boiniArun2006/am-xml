package io.grpc.internal;

import JP.UGc;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class qYU implements JP.Ln {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t1.UGc f68709n;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InetSocketAddress f68710t;
    private static final Logger nr = Logger.getLogger(qYU.class.getName());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final w6 f68708O = new j();
    private static final t1.UGc J2 = new n();

    class j implements w6 {
        @Override // io.grpc.internal.qYU.w6
        public PasswordAuthentication n(String str, InetAddress inetAddress, int i2, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i2, "");
            } catch (MalformedURLException unused) {
                qYU.nr.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i2, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }

        j() {
        }
    }

    interface w6 {
        PasswordAuthentication n(String str, InetAddress inetAddress, int i2, String str2, String str3, String str4);
    }

    public qYU() {
        this(J2, f68708O, System.getenv("GRPC_PROXY_EXP"));
    }

    private JP.qf t(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, psW.xMQ(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.f68709n.get();
                if (proxySelector == null) {
                    nr.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    nr.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication passwordAuthenticationN = this.rl.n(psW.xMQ(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                UGc.n nVarT = JP.UGc.O().nr(inetSocketAddress).t(inetSocketAddress2);
                if (passwordAuthenticationN == null) {
                    return nVarT.n();
                }
                return nVarT.O(passwordAuthenticationN.getUserName()).rl(passwordAuthenticationN.getPassword() != null ? new String(passwordAuthenticationN.getPassword()) : null).n();
            } catch (URISyntaxException e2) {
                nr.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                return null;
            }
        } catch (Throwable th) {
            nr.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    class n implements t1.UGc {
        n() {
        }

        @Override // t1.UGc
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    qYU(t1.UGc uGc, w6 w6Var, String str) {
        this.f68709n = (t1.UGc) t1.Xo.HI(uGc);
        this.rl = (w6) t1.Xo.HI(w6Var);
        if (str != null) {
            this.f68710t = nr(str);
        } else {
            this.f68710t = null;
        }
    }

    private static InetSocketAddress nr(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":", 2);
        int i2 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        nr.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(strArrSplit[0], i2);
    }

    @Override // JP.Ln
    public JP.qf n(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f68710t != null ? JP.UGc.O().t(this.f68710t).nr((InetSocketAddress) socketAddress).n() : t((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
