package KaW;

import androidx.core.database.sqlite.cL.PtsLKY;
import com.safedk.android.analytics.AppLovinBridge;
import io.grpc.internal.psW;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import wIE.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final wIE.fuX f5489n;
    private static final Logger rl = Logger.getLogger(C.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final wIE.fuX f5488t = wIE.fuX.O();
    private static C nr = nr(C.class.getClassLoader());

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class j extends C {
        private static final Method HI;
        private static final Constructor Ik;
        private static final wIE.CN3 J2;
        private static final wIE.CN3 KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final wIE.CN3 f5490O;
        private static final wIE.CN3 Uo;
        private static final Method az;
        private static final Method ck;
        private static final Method gh;
        private static final wIE.CN3 mUb;
        private static final Method qie;
        private static final Method ty;
        private static final wIE.CN3 xMQ;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f5490O = new wIE.CN3(null, "setUseSessionTickets", cls2);
            J2 = new wIE.CN3(null, "setHostname", String.class);
            Uo = new wIE.CN3(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            KN = new wIE.CN3(null, "setAlpnProtocols", byte[].class);
            xMQ = new wIE.CN3(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            mUb = new wIE.CN3(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method3 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                    try {
                        method2 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                        try {
                            cls = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        } catch (ClassNotFoundException e2) {
                            e = e2;
                            method4 = null;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e4) {
                        e = e4;
                        method2 = null;
                        method4 = null;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        method2 = null;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    C.rl.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    az = method;
                    ty = method3;
                    HI = method2;
                    gh = method4;
                    qie = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    ck = method6;
                    Ik = constructor;
                } catch (NoSuchMethodException e7) {
                    e = e7;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    C.rl.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    az = method;
                    ty = method3;
                    HI = method2;
                    gh = method4;
                    qie = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    ck = method6;
                    Ik = constructor;
                }
            } catch (ClassNotFoundException e8) {
                e = e8;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e9) {
                e = e9;
                method = null;
                method2 = null;
            }
            try {
                method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
            } catch (ClassNotFoundException e10) {
                e = e10;
                C.rl.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
            } catch (NoSuchMethodException e11) {
                e = e11;
                C.rl.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
            }
            az = method;
            ty = method3;
            HI = method2;
            gh = method4;
            qie = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            } catch (ClassNotFoundException e12) {
                e = e12;
                method6 = null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                method6 = null;
            }
            try {
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e14) {
                e = e14;
                C.rl.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            } catch (NoSuchMethodException e15) {
                e = e15;
                C.rl.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
            ck = method6;
            Ik = constructor;
        }

        @Override // KaW.C
        public String J2(SSLSocket sSLSocket) {
            Method method = HI;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e3);
                    }
                    C.rl.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f5489n.xMQ() == fuX.EnumC1247fuX.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) Uo.J2(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, wIE.o.rl);
                    }
                } catch (Exception e4) {
                    C.rl.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
                }
            }
            if (this.f5489n.xMQ() == fuX.EnumC1247fuX.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) xMQ.J2(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, wIE.o.rl);
                }
                return null;
            } catch (Exception e5) {
                C.rl.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                return null;
            }
        }

        j(wIE.fuX fux) {
            super(fux);
        }

        @Override // KaW.C
        public String KN(SSLSocket sSLSocket, String str, List list) {
            String strJ2 = J2(sSLSocket);
            if (strJ2 == null) {
                return super.KN(sSLSocket, str, list);
            }
            return strJ2;
        }

        @Override // KaW.C
        protected void t(SSLSocket sSLSocket, String str, List list) {
            Constructor constructor;
            boolean z2;
            Method method;
            String[] strArrXMQ = C.xMQ(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (C.Uo(str)) {
                            Method method2 = gh;
                            if (method2 != null && ((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                qie.invoke(null, sSLSocket, Boolean.TRUE);
                            } else {
                                f5490O.O(sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = ck;
                            if (method3 != null && (constructor = Ik) != null) {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            } else {
                                J2.O(sSLSocket, str);
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                } catch (InstantiationException e4) {
                    throw new RuntimeException(e4);
                }
            }
            Method method4 = HI;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, new Object[0]);
                    az.invoke(sSLParameters, strArrXMQ);
                    z2 = true;
                } catch (InvocationTargetException e5) {
                    if (e5.getTargetException() instanceof UnsupportedOperationException) {
                        C.rl.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                        z2 = false;
                    } else {
                        throw e5;
                    }
                }
            } else {
                z2 = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (!z2 || (method = ty) == null || !Arrays.equals(strArrXMQ, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
                Object[] objArr = {wIE.fuX.rl(list)};
                if (this.f5489n.xMQ() == fuX.EnumC1247fuX.ALPN_AND_NPN) {
                    KN.J2(sSLSocket, objArr);
                }
                if (this.f5489n.xMQ() != fuX.EnumC1247fuX.NONE) {
                    mUb.J2(sSLSocket, objArr);
                    return;
                }
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
        }
    }

    public static C O() {
        return nr;
    }

    static boolean Uo(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            psW.t(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    static C nr(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e2) {
            rl.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e2);
            try {
                classLoader.loadClass(PtsLKY.TiPzRxCcp);
            } catch (ClassNotFoundException e3) {
                rl.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e3);
                return new C(f5488t);
            }
        }
        return new j(f5488t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] xMQ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((wIE.Dsr) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String J2(SSLSocket sSLSocket) {
        return this.f5489n.KN(sSLSocket);
    }

    public String KN(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            t(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strJ2 = J2(sSLSocket);
            if (strJ2 != null) {
                return strJ2;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f5489n.n(sSLSocket);
        }
    }

    protected void t(SSLSocket sSLSocket, String str, List list) {
        this.f5489n.t(sSLSocket, str, list);
    }

    C(wIE.fuX fux) {
        this.f5489n = (wIE.fuX) t1.Xo.ck(fux, AppLovinBridge.f61288f);
    }
}
