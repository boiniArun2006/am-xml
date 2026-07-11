package KaW;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final List f5557n = Collections.unmodifiableList(Arrays.asList(wIE.Dsr.HTTP_2));

    static String n(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket rl(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i2, wIE.n nVar) throws SSLPeerUnverifiedException {
        t1.Xo.ck(sSLSocketFactory, "sslSocketFactory");
        t1.Xo.ck(socket, "socket");
        t1.Xo.ck(nVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i2, true);
        nVar.t(sSLSocket, false);
        String strKN = C.O().KN(sSLSocket, str, nVar.J2() ? f5557n : null);
        List list = f5557n;
        t1.Xo.aYN(list.contains(wIE.Dsr.n(strKN)), "Only " + list + " are supported, but negotiated protocol is %s", strKN);
        if (hostnameVerifier == null) {
            hostnameVerifier = wIE.Wre.f74829n;
        }
        if (hostnameVerifier.verify(n(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
