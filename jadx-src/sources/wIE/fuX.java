package wIE;

import androidx.core.database.sqlite.cL.PtsLKY;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Provider f74833n;
    public static final Logger rl = Logger.getLogger(fuX.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f74832t = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    private static final fuX nr = nr();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class CN3 implements InvocationHandler {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private String f74834O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f74835n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f74836t;

        public CN3(List list) {
            this.f74835n = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = o.f74884n;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f74836t = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f74835n;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f74835n.contains(list.get(i2))) {
                            String str = (String) list.get(i2);
                            this.f74834O = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f74835n.get(0);
                    this.f74834O = str2;
                    return str2;
                }
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.f74834O = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class I28 extends fuX {
        private final Method J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Method f74837O;

        /* synthetic */ I28(Provider provider, Method method, Method method2, j jVar) {
            this(provider, method, method2);
        }

        private I28(Provider provider, Method method, Method method2) {
            super(provider);
            this.f74837O = method;
            this.J2 = method2;
        }

        @Override // wIE.fuX
        public String KN(SSLSocket sSLSocket) {
            try {
                return (String) this.J2.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // wIE.fuX
        public EnumC1247fuX xMQ() {
            return EnumC1247fuX.ALPN_AND_NPN;
        }

        @Override // wIE.fuX
        public void t(SSLSocket sSLSocket, String str, List list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Dsr dsr = (Dsr) it.next();
                if (dsr != Dsr.HTTP_1_0) {
                    arrayList.add(dsr.toString());
                }
            }
            try {
                this.f74837O.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class Ml extends fuX {
        private final wIE.CN3 J2;
        private final Method KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final wIE.CN3 f74838O;
        private final Method Uo;
        private final EnumC1247fuX gh;
        private final wIE.CN3 mUb;
        private final wIE.CN3 xMQ;

        @Override // wIE.fuX
        public String KN(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.xMQ.Uo(sSLSocket) && (bArr = (byte[]) this.xMQ.J2(sSLSocket, new Object[0])) != null) {
                return new String(bArr, o.rl);
            }
            return null;
        }

        @Override // wIE.fuX
        public void t(SSLSocket sSLSocket, String str, List list) {
            if (str != null) {
                this.f74838O.O(sSLSocket, Boolean.TRUE);
                this.J2.O(sSLSocket, str);
            }
            if (this.mUb.Uo(sSLSocket)) {
                this.mUb.J2(sSLSocket, fuX.rl(list));
            }
        }

        @Override // wIE.fuX
        public EnumC1247fuX xMQ() {
            return this.gh;
        }

        public Ml(wIE.CN3 cn3, wIE.CN3 cn32, Method method, Method method2, wIE.CN3 cn33, wIE.CN3 cn34, Provider provider, EnumC1247fuX enumC1247fuX) {
            super(provider);
            this.f74838O = cn3;
            this.J2 = cn32;
            this.Uo = method;
            this.KN = method2;
            this.xMQ = cn33;
            this.mUb = cn34;
            this.gh = enumC1247fuX;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class Wre extends fuX {
        private final Method J2;
        private final Class KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Method f74839O;
        private final Method Uo;
        private final Class xMQ;

        @Override // wIE.fuX
        public String KN(SSLSocket sSLSocket) {
            try {
                CN3 cn3 = (CN3) Proxy.getInvocationHandler(this.J2.invoke(null, sSLSocket));
                if (!cn3.f74836t && cn3.f74834O == null) {
                    fuX.rl.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (cn3.f74836t) {
                    return null;
                }
                return cn3.f74834O;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // wIE.fuX
        public void n(SSLSocket sSLSocket) {
            try {
                this.Uo.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e2) {
                fuX.rl.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e2);
            }
        }

        @Override // wIE.fuX
        public void t(SSLSocket sSLSocket, String str, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Dsr dsr = (Dsr) list.get(i2);
                if (dsr != Dsr.HTTP_1_0) {
                    arrayList.add(dsr.toString());
                }
            }
            try {
                this.f74839O.invoke(null, sSLSocket, Proxy.newProxyInstance(fuX.class.getClassLoader(), new Class[]{this.KN, this.xMQ}, new CN3(arrayList)));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }

        @Override // wIE.fuX
        public EnumC1247fuX xMQ() {
            return EnumC1247fuX.ALPN_AND_NPN;
        }

        public Wre(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.f74839O = method;
            this.J2 = method2;
            this.Uo = method3;
            this.KN = cls;
            this.xMQ = cls2;
        }
    }

    /* JADX INFO: renamed from: wIE.fuX$fuX, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public enum EnumC1247fuX {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class n implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }

        n() {
        }
    }

    public String KN(SSLSocket sSLSocket) {
        return null;
    }

    public void n(SSLSocket sSLSocket) {
    }

    public void t(SSLSocket sSLSocket, String str, List list) {
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class j implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }

        j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    class w6 implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }

        w6() {
        }
    }

    public static fuX O() {
        return nr;
    }

    private static boolean gh() {
        try {
            fuX.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e2) {
            rl.log(Level.FINE, "Can't find class", (Throwable) e2);
            return false;
        }
    }

    private static boolean mUb() {
        try {
            fuX.class.getClassLoader().loadClass(PtsLKY.OAglFBP);
            return true;
        } catch (ClassNotFoundException e2) {
            rl.log(Level.FINE, "Can't find class", (Throwable) e2);
            return false;
        }
    }

    private static fuX nr() throws NoSuchMethodException {
        Method method;
        Method method2;
        Provider providerJ2 = J2();
        j jVar = null;
        if (providerJ2 != null) {
            wIE.CN3 cn3 = new wIE.CN3(null, "setUseSessionTickets", Boolean.TYPE);
            wIE.CN3 cn32 = new wIE.CN3(null, "setHostname", String.class);
            wIE.CN3 cn33 = new wIE.CN3(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            wIE.CN3 cn34 = new wIE.CN3(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            Method method3 = method;
            EnumC1247fuX enumC1247fuX = (providerJ2.getName().equals("GmsCore_OpenSSL") || providerJ2.getName().equals("Conscrypt") || providerJ2.getName().equals("Ssl_Guard") || gh()) ? EnumC1247fuX.ALPN_AND_NPN : mUb() ? EnumC1247fuX.NPN : EnumC1247fuX.NONE;
            return new Ml(cn3, cn32, method3, method2, cn33, cn34, providerJ2, enumC1247fuX);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new j())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                    return new I28(provider, (Method) AccessController.doPrivileged(new n()), (Method) AccessController.doPrivileged(new w6()), jVar);
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new Wre(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                return new fuX(provider);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] rl(List list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Dsr dsr = (Dsr) list.get(i2);
            if (dsr != Dsr.HTTP_1_0) {
                buffer.writeByte(dsr.toString().length());
                buffer.writeUtf8(dsr.toString());
            }
        }
        return buffer.readByteArray();
    }

    public Provider Uo() {
        return this.f74833n;
    }

    public EnumC1247fuX xMQ() {
        return EnumC1247fuX.NONE;
    }

    public fuX(Provider provider) {
        this.f74833n = provider;
    }

    private static Provider J2() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f74832t) {
                if (str.equals(provider.getClass().getName())) {
                    rl.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        rl.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }
}
