package KaW;

import ISg.n;
import JP.DAz;
import JP.Q;
import JP.afx;
import JP.lej;
import KaW.QJ;
import KaW.Wre;
import KaW.aC;
import KaW.fuX;
import KaW.n;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.internal.SafeDKWebAppInterface;
import dY.C1956j;
import dY.C1957n;
import io.grpc.SPz;
import io.grpc.StatusException;
import io.grpc.internal.C2173m;
import io.grpc.internal.DC;
import io.grpc.internal.InterfaceC2171c;
import io.grpc.internal.K;
import io.grpc.internal.OU;
import io.grpc.internal.Pp;
import io.grpc.internal.Q;
import io.grpc.internal.h6y;
import io.grpc.internal.iF;
import io.grpc.internal.l3D;
import io.grpc.internal.o7q;
import io.grpc.internal.psW;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import okio.Timeout;
import t1.C2369c;
import t1.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class Dsr implements Q, n.j, QJ.Ml {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Map f5491E = U();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Logger f5492M = Logger.getLogger(Dsr.class.getName());
    private int E2;
    private final Executor HI;
    private final ScheduledExecutorService Ik;
    private final int J2;
    private o7q.j KN;
    int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f5493N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final UGc f5494O;
    final JP.UGc P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private SPz f5495S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private OU f5496T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Q.n f5497U;
    private final ISg.aC Uo;
    private boolean ViF;
    private boolean WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final wIE.n f5498X;
    private io.grpc.j XQ;
    private final Pp Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private I28 f5499Z;
    private C2173m aYN;
    private int az;
    private final boolean bzg;
    private final DC ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque f5500e;
    com.google.common.util.concurrent.UGc eF;
    private Socket fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SocketFactory f5501g;
    private final Object gh;
    private HostnameVerifier iF;
    private final iF jB;
    private QJ mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InetSocketAddress f5502n;
    private long nHg;
    private boolean nY;
    private final Random nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5503o;
    Runnable p5;
    private final afx qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f5504r;
    private final int rV9;
    private final String rl;
    private long s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f5505t;
    private SSLSocketFactory te;
    private final Map ty;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f5506v;
    private boolean wTp;
    private KaW.n xMQ;

    class I28 implements n.j, Runnable {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ISg.n f5509t;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final aC f5508n = new aC(Level.FINE, Dsr.class);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f5507O = true;

        @Override // ISg.n.j
        public void ackSettings() {
        }

        @Override // ISg.n.j
        public void ping(boolean z2, int i2, int i3) {
            C2173m c2173m;
            long j2 = (((long) i2) << 32) | (((long) i3) & 4294967295L);
            this.f5508n.O(aC.j.INBOUND, j2);
            if (!z2) {
                synchronized (Dsr.this.gh) {
                    Dsr.this.xMQ.ping(true, i2, i3);
                }
                return;
            }
            synchronized (Dsr.this.gh) {
                try {
                    c2173m = null;
                    if (Dsr.this.aYN == null) {
                        Dsr.f5492M.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (Dsr.this.aYN.KN() == j2) {
                        C2173m c2173m2 = Dsr.this.aYN;
                        Dsr.this.aYN = null;
                        c2173m = c2173m2;
                    } else {
                        Dsr.f5492M.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(Dsr.this.aYN.KN()), Long.valueOf(j2)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c2173m != null) {
                c2173m.nr();
            }
        }

        @Override // ISg.n.j
        public void priority(int i2, int i3, int i5, boolean z2) {
        }

        I28(ISg.n nVar) {
            this.f5509t = nVar;
        }

        private int n(List list) {
            long size = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                ISg.Ml ml = (ISg.Ml) list.get(i2);
                size += (long) (ml.f4267n.size() + 32 + ml.rl.size());
            }
            return (int) Math.min(size, 2147483647L);
        }

        @Override // ISg.n.j
        public void KN(int i2, ISg.j jVar) {
            this.f5508n.KN(aC.j.INBOUND, i2, jVar);
            SPz sPzO = Dsr.pJg(jVar).O("Rst Stream");
            boolean z2 = sPzO.az() == SPz.n.CANCELLED || sPzO.az() == SPz.n.DEADLINE_EXCEEDED;
            synchronized (Dsr.this.gh) {
                try {
                    fuX fux = (fuX) Dsr.this.ty.get(Integer.valueOf(i2));
                    if (fux != null) {
                        L3.w6.nr("OkHttpClientTransport$ClientFrameHandler.rstStream", fux.ViF().k());
                        Dsr.this.eF(i2, sPzO, jVar == ISg.j.REFUSED_STREAM ? l3D.j.REFUSED : l3D.j.PROCESSED, z2, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ISg.n.j
        public void gh(boolean z2, int i2, BufferedSource bufferedSource, int i3, int i5) throws IOException {
            this.f5508n.rl(aC.j.INBOUND, i2, bufferedSource.getBuffer(), i3, z2);
            fuX fuxB = Dsr.this.B(i2);
            if (fuxB != null) {
                long j2 = i3;
                bufferedSource.require(j2);
                Buffer buffer = new Buffer();
                buffer.write(bufferedSource.getBuffer(), j2);
                L3.w6.nr("OkHttpClientTransport$ClientFrameHandler.data", fuxB.ViF().k());
                synchronized (Dsr.this.gh) {
                    fuxB.ViF().dR0(buffer, z2, i5 - i3);
                }
            } else {
                if (!Dsr.this.a(i2)) {
                    Dsr.this.Nxk(ISg.j.PROTOCOL_ERROR, "Received data for unknown stream: " + i2);
                    return;
                }
                synchronized (Dsr.this.gh) {
                    Dsr.this.xMQ.KN(i2, ISg.j.STREAM_CLOSED);
                }
                bufferedSource.skip(i3);
            }
            Dsr.E2(Dsr.this, i5);
            if (Dsr.this.f5503o >= Dsr.this.J2 * 0.5f) {
                synchronized (Dsr.this.gh) {
                    Dsr.this.xMQ.windowUpdate(0, Dsr.this.f5503o);
                }
                Dsr.this.f5503o = 0;
            }
        }

        @Override // ISg.n.j
        public void mUb(int i2, ISg.j jVar, ByteString byteString) {
            this.f5508n.t(aC.j.INBOUND, i2, jVar, byteString);
            if (jVar == ISg.j.ENHANCE_YOUR_CALM) {
                String strUtf8 = byteString.utf8();
                Dsr.f5492M.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strUtf8));
                if ("too_many_pings".equals(strUtf8)) {
                    Dsr.this.f5506v.run();
                }
            }
            SPz sPzO = psW.fuX.J2(jVar.f4293n).O("Received Goaway");
            if (byteString.size() > 0) {
                sPzO = sPzO.O(byteString.utf8());
            }
            Dsr.this.piY(i2, null, sPzO);
        }

        @Override // ISg.n.j
        public void pushPromise(int i2, int i3, List list) {
            this.f5508n.Uo(aC.j.INBOUND, i2, i3, list);
            synchronized (Dsr.this.gh) {
                Dsr.this.xMQ.KN(i2, ISg.j.PROTOCOL_ERROR);
            }
        }

        @Override // ISg.n.j
        public void qie(boolean z2, boolean z3, int i2, int i3, List list, ISg.I28 i28) {
            SPz sPzIk;
            boolean z4;
            int iN;
            this.f5508n.nr(aC.j.INBOUND, i2, list, z3);
            if (Dsr.this.rV9 == Integer.MAX_VALUE || (iN = n(list)) <= Dsr.this.rV9) {
                sPzIk = null;
            } else {
                sPzIk = SPz.ty.Ik(String.format(Locale.US, "Response %s metadata larger than %d: %d", z3 ? "trailer" : "header", Integer.valueOf(Dsr.this.rV9), Integer.valueOf(iN)));
            }
            synchronized (Dsr.this.gh) {
                try {
                    fuX fux = (fuX) Dsr.this.ty.get(Integer.valueOf(i2));
                    z4 = false;
                    if (fux == null) {
                        if (Dsr.this.a(i2)) {
                            Dsr.this.xMQ.KN(i2, ISg.j.STREAM_CLOSED);
                        } else {
                            z4 = true;
                        }
                    } else if (sPzIk == null) {
                        L3.w6.nr("OkHttpClientTransport$ClientFrameHandler.headers", fux.ViF().k());
                        fux.ViF().z(list, z3);
                    } else {
                        if (!z3) {
                            Dsr.this.xMQ.KN(i2, ISg.j.CANCEL);
                        }
                        fux.ViF().rV9(sPzIk, false, new io.grpc.QJ());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                Dsr.this.Nxk(ISg.j.PROTOCOL_ERROR, "Received header for unknown stream: " + i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // ISg.n.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void windowUpdate(int i2, long j2) {
            boolean z2;
            this.f5508n.gh(aC.j.INBOUND, i2, j2);
            if (j2 == 0) {
                if (i2 == 0) {
                    Dsr.this.Nxk(ISg.j.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    Dsr.this.eF(i2, SPz.f68187o.Ik("Received 0 flow control window increment."), l3D.j.PROCESSED, false, ISg.j.PROTOCOL_ERROR, null);
                    return;
                }
            }
            synchronized (Dsr.this.gh) {
                try {
                    if (i2 == 0) {
                        Dsr.this.mUb.Uo(null, (int) j2);
                        return;
                    }
                    fuX fux = (fuX) Dsr.this.ty.get(Integer.valueOf(i2));
                    if (fux == null) {
                        z2 = Dsr.this.a(i2) ? false : true;
                        if (z2) {
                            return;
                        }
                        Dsr.this.Nxk(ISg.j.PROTOCOL_ERROR, "Received window_update for unknown stream: " + i2);
                        return;
                    }
                    Dsr.this.mUb.Uo(fux.ViF().D(), (int) j2);
                    if (z2) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ISg.n.j
        public void xMQ(boolean z2, ISg.Dsr dsr) {
            boolean zJ2;
            this.f5508n.xMQ(aC.j.INBOUND, dsr);
            synchronized (Dsr.this.gh) {
                try {
                    if (Pl.rl(dsr, 4)) {
                        Dsr.this.E2 = Pl.n(dsr, 4);
                    }
                    if (Pl.rl(dsr, 7)) {
                        zJ2 = Dsr.this.mUb.J2(Pl.n(dsr, 7));
                    } else {
                        zJ2 = false;
                    }
                    if (this.f5507O) {
                        Dsr dsr2 = Dsr.this;
                        dsr2.XQ = dsr2.KN.nr(Dsr.this.XQ);
                        Dsr.this.KN.rl();
                        this.f5507O = false;
                    }
                    Dsr.this.xMQ.N(dsr);
                    if (zJ2) {
                        Dsr.this.mUb.KN();
                    }
                    Dsr.this.ijL();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SPz sPzIk;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f5509t.rV9(this)) {
                try {
                    if (Dsr.this.f5496T != null) {
                        Dsr.this.f5496T.az();
                    }
                } catch (Throwable th) {
                    try {
                        Dsr.this.piY(0, ISg.j.PROTOCOL_ERROR, SPz.f68187o.Ik("error in frame handler").ck(th));
                        try {
                            this.f5509t.close();
                        } catch (IOException e2) {
                            e = e2;
                            Dsr.f5492M.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e3) {
                            if (!"bio == null".equals(e3.getMessage())) {
                                throw e3;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f5509t.close();
                        } catch (IOException e4) {
                            Dsr.f5492M.log(Level.INFO, "Exception closing frame reader", (Throwable) e4);
                        } catch (RuntimeException e5) {
                            if (!"bio == null".equals(e5.getMessage())) {
                                throw e5;
                            }
                        }
                        Dsr.this.KN.O();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (Dsr.this.gh) {
                sPzIk = Dsr.this.f5495S;
            }
            if (sPzIk == null) {
                sPzIk = SPz.f68186Z.Ik("End of stream or IOException");
            }
            Dsr.this.piY(0, ISg.j.INTERNAL_ERROR, sPzIk);
            try {
                this.f5509t.close();
            } catch (IOException e6) {
                e = e6;
                Dsr.f5492M.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e7) {
                if (!"bio == null".equals(e7.getMessage())) {
                    throw e7;
                }
            }
            Dsr.this.KN.O();
            Thread.currentThread().setName(name);
        }
    }

    class Ml implements Runnable {
        Ml() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = Dsr.this.p5;
            if (runnable != null) {
                runnable.run();
            }
            Dsr.this.HI.execute(Dsr.this.f5499Z);
            synchronized (Dsr.this.gh) {
                Dsr.this.E2 = Integer.MAX_VALUE;
                Dsr.this.ijL();
            }
            com.google.common.util.concurrent.UGc uGc = Dsr.this.eF;
            if (uGc != null) {
                uGc.g(null);
            }
        }
    }

    class j extends iF {
        j() {
        }

        @Override // io.grpc.internal.iF
        protected void rl() {
            Dsr.this.KN.t(true);
        }

        @Override // io.grpc.internal.iF
        protected void t() {
            Dsr.this.KN.t(false);
        }
    }

    class n implements Pp.w6 {
        n() {
        }
    }

    class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f5513n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ KaW.j f5514t;

        class j implements Source {
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            j() {
            }

            @Override // okio.Source
            public long read(Buffer buffer, long j2) {
                return -1L;
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: timeout */
            public Timeout getTimeout() {
                return Timeout.NONE;
            }
        }

        w6(CountDownLatch countDownLatch, KaW.j jVar) {
            this.f5513n = countDownLatch;
            this.f5514t = jVar;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public void run() {
            Dsr dsr;
            I28 i28;
            Socket socketM7;
            SSLSession session;
            Socket socket;
            try {
                this.f5513n.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(new j());
            try {
                try {
                    Dsr dsr2 = Dsr.this;
                    JP.UGc uGc = dsr2.P5;
                    if (uGc == null) {
                        socketM7 = dsr2.f5501g.createSocket(Dsr.this.f5502n.getAddress(), Dsr.this.f5502n.getPort());
                    } else {
                        if (!(uGc.rl() instanceof InetSocketAddress)) {
                            throw SPz.f68187o.Ik("Unsupported SocketAddress implementation " + Dsr.this.P5.rl().getClass()).t();
                        }
                        Dsr dsr3 = Dsr.this;
                        socketM7 = dsr3.M7(dsr3.P5.t(), (InetSocketAddress) Dsr.this.P5.rl(), Dsr.this.P5.nr(), Dsr.this.P5.n());
                    }
                    Socket socket2 = socketM7;
                    if (Dsr.this.te != null) {
                        SSLSocket sSLSocketRl = Xo.rl(Dsr.this.te, Dsr.this.iF, socket2, Dsr.this.E(), Dsr.this.M(), Dsr.this.f5498X);
                        session = sSLSocketRl.getSession();
                        socket = sSLSocketRl;
                    } else {
                        session = null;
                        socket = socket2;
                    }
                    socket.setTcpNoDelay(true);
                    BufferedSource bufferedSourceBuffer2 = Okio.buffer(Okio.source(socket));
                    this.f5514t.M(Okio.sink(socket), socket);
                    Dsr dsr4 = Dsr.this;
                    dsr4.XQ = dsr4.XQ.nr().nr(io.grpc.fuX.f68231n, socket.getRemoteSocketAddress()).nr(io.grpc.fuX.rl, socket.getLocalSocketAddress()).nr(io.grpc.fuX.f68232t, session).nr(K.f68287n, session == null ? lej.NONE : lej.PRIVACY_AND_INTEGRITY).n();
                    Dsr dsr5 = Dsr.this;
                    dsr5.f5499Z = dsr5.new I28(dsr5.Uo.n(bufferedSourceBuffer2, true));
                    synchronized (Dsr.this.gh) {
                        try {
                            Dsr.this.fD = (Socket) t1.Xo.ck(socket, "socket");
                            if (session != null) {
                                Dsr.this.f5497U = new Q.n(new Q.w6(session));
                            }
                        } finally {
                        }
                    }
                } catch (StatusException e2) {
                    Dsr.this.piY(0, ISg.j.INTERNAL_ERROR, e2.n());
                    dsr = Dsr.this;
                    i28 = dsr.new I28(dsr.Uo.n(bufferedSourceBuffer, true));
                    dsr.f5499Z = i28;
                } catch (Exception e3) {
                    Dsr.this.KN(e3);
                    dsr = Dsr.this;
                    i28 = dsr.new I28(dsr.Uo.n(bufferedSourceBuffer, true));
                    dsr.f5499Z = i28;
                }
            } catch (Throwable th) {
                Dsr dsr6 = Dsr.this;
                dsr6.f5499Z = dsr6.new I28(dsr6.Uo.n(bufferedSourceBuffer, true));
                throw th;
            }
        }
    }

    public Dsr(Wre.C0190Wre c0190Wre, InetSocketAddress inetSocketAddress, String str, String str2, io.grpc.j jVar, JP.UGc uGc, Runnable runnable) {
        this(c0190Wre, inetSocketAddress, str, str2, jVar, psW.WPU, new ISg.CN3(), uGc, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ijL() {
        boolean z2 = false;
        while (!this.f5500e.isEmpty() && this.ty.size() < this.E2) {
            m((fuX) this.f5500e.poll());
            z2 = true;
        }
        return z2;
    }

    private Dsr(Wre.C0190Wre c0190Wre, InetSocketAddress inetSocketAddress, String str, String str2, io.grpc.j jVar, UGc uGc, ISg.aC aCVar, JP.UGc uGc2, Runnable runnable) {
        this.nr = new Random();
        this.gh = new Object();
        this.ty = new HashMap();
        this.E2 = 0;
        this.f5500e = new LinkedList();
        this.jB = new j();
        this.M7 = 30000;
        this.f5502n = (InetSocketAddress) t1.Xo.ck(inetSocketAddress, SafeDKWebAppInterface.f62924j);
        this.rl = str;
        this.f5504r = c0190Wre.E2;
        this.J2 = c0190Wre.f5550v;
        this.HI = (Executor) t1.Xo.ck(c0190Wre.f5549t, "executor");
        this.ck = new DC(c0190Wre.f5549t);
        this.Ik = (ScheduledExecutorService) t1.Xo.ck(c0190Wre.J2, "scheduledExecutorService");
        this.az = 3;
        SocketFactory socketFactory = c0190Wre.f5547o;
        this.f5501g = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.te = c0190Wre.f5543Z;
        this.iF = c0190Wre.f5539S;
        this.f5498X = (wIE.n) t1.Xo.ck(c0190Wre.f5545g, "connectionSpec");
        this.f5494O = (UGc) t1.Xo.ck(uGc, "stopwatchFactory");
        this.Uo = (ISg.aC) t1.Xo.ck(aCVar, "variant");
        this.f5505t = psW.KN("okhttp", str2);
        this.P5 = uGc2;
        this.f5506v = (Runnable) t1.Xo.ck(runnable, "tooManyPingsRunnable");
        this.rV9 = c0190Wre.jB;
        this.Xw = c0190Wre.f5548r.n();
        this.qie = afx.n(getClass(), inetSocketAddress.toString());
        this.XQ = io.grpc.j.t().nr(K.rl, jVar).n();
        this.bzg = c0190Wre.f5541U;
        J();
    }

    static /* synthetic */ int E2(Dsr dsr, int i2) {
        int i3 = dsr.f5503o + i2;
        dsr.f5503o = i3;
        return i3;
    }

    private Throwable FX() {
        synchronized (this.gh) {
            try {
                SPz sPz = this.f5495S;
                if (sPz != null) {
                    return sPz.t();
                }
                return SPz.f68186Z.Ik("Connection closed").t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void I(fuX fux) {
        if (this.nY && this.f5500e.isEmpty() && this.ty.isEmpty()) {
            this.nY = false;
            OU ou2 = this.f5496T;
            if (ou2 != null) {
                ou2.HI();
            }
        }
        if (fux.aYN()) {
            this.jB.O(fux, false);
        }
    }

    private void J() {
        synchronized (this.gh) {
            this.Xw.Uo(new n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket M7(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.f5501g.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.f5501g.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.M7);
            Source source = Okio.source(socketCreateSocket);
            BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(socketCreateSocket));
            C1957n c1957nP5 = P5(inetSocketAddress, str, str2);
            C1956j c1956jRl = c1957nP5.rl();
            bufferedSinkBuffer.writeUtf8(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", c1956jRl.t(), Integer.valueOf(c1956jRl.J2()))).writeUtf8("\r\n");
            int iRl = c1957nP5.n().rl();
            for (int i2 = 0; i2 < iRl; i2++) {
                bufferedSinkBuffer.writeUtf8(c1957nP5.n().n(i2)).writeUtf8(": ").writeUtf8(c1957nP5.n().t(i2)).writeUtf8("\r\n");
            }
            bufferedSinkBuffer.writeUtf8("\r\n");
            bufferedSinkBuffer.flush();
            wIE.aC aCVarN = wIE.aC.n(Y(source));
            while (!Y(source).equals("")) {
            }
            int i3 = aCVarN.rl;
            if (i3 >= 200 && i3 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            Buffer buffer = new Buffer();
            try {
                socketCreateSocket.shutdownOutput();
                source.read(buffer, 1024L);
            } catch (IOException e2) {
                buffer.writeUtf8("Unable to read body: " + e2.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw SPz.f68186Z.Ik(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(aCVarN.rl), aCVarN.f74831t, buffer.readUtf8())).t();
        } catch (IOException e3) {
            if (socketCreateSocket != null) {
                psW.O(socketCreateSocket);
            }
            throw SPz.f68186Z.Ik("Failed trying to connect with proxy").ck(e3).t();
        }
    }

    private C1957n P5(InetSocketAddress inetSocketAddress, String str, String str2) {
        C1956j c1956jN = new C1956j.n().gh("https").KN(inetSocketAddress.getHostName()).mUb(inetSocketAddress.getPort()).n();
        C1957n.C0842n c0842nNr = new C1957n.C0842n().O(c1956jN).nr("Host", c1956jN.t() + ":" + c1956jN.J2()).nr("User-Agent", this.f5505t);
        if (str != null && str2 != null) {
            c0842nNr.nr("Proxy-Authorization", wIE.w6.n(str, str2));
        }
        return c0842nNr.t();
    }

    private static Map U() {
        EnumMap enumMap = new EnumMap(ISg.j.class);
        ISg.j jVar = ISg.j.NO_ERROR;
        SPz sPz = SPz.f68187o;
        enumMap.put(jVar, sPz.Ik("No error: A GRPC status of OK should have been sent"));
        enumMap.put(ISg.j.PROTOCOL_ERROR, sPz.Ik("Protocol error"));
        enumMap.put(ISg.j.INTERNAL_ERROR, sPz.Ik("Internal error"));
        enumMap.put(ISg.j.FLOW_CONTROL_ERROR, sPz.Ik("Flow control error"));
        enumMap.put(ISg.j.STREAM_CLOSED, sPz.Ik("Stream closed"));
        enumMap.put(ISg.j.FRAME_TOO_LARGE, sPz.Ik("Frame too large"));
        enumMap.put(ISg.j.REFUSED_STREAM, SPz.f68186Z.Ik("Refused stream"));
        enumMap.put(ISg.j.CANCEL, SPz.J2.Ik("Cancelled"));
        enumMap.put(ISg.j.COMPRESSION_ERROR, sPz.Ik("Compression error"));
        enumMap.put(ISg.j.CONNECT_ERROR, sPz.Ik("Connect error"));
        enumMap.put(ISg.j.ENHANCE_YOUR_CALM, SPz.ty.Ik("Enhance your calm"));
        enumMap.put(ISg.j.INADEQUATE_SECURITY, SPz.qie.Ik("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private static String Y(Source source) throws EOFException {
        Buffer buffer = new Buffer();
        while (source.read(buffer, 1L) != -1) {
            if (buffer.getByte(buffer.size() - 1) == 10) {
                return buffer.readUtf8LineStrict();
            }
        }
        throw new EOFException("\\n not found: " + buffer.readByteString().hex());
    }

    private void dR0() {
        synchronized (this.gh) {
            try {
                this.xMQ.connectionPreface();
                ISg.Dsr dsr = new ISg.Dsr();
                Pl.t(dsr, 7, this.J2);
                this.xMQ.VwL(dsr);
                if (this.J2 > 65535) {
                    this.xMQ.windowUpdate(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void eTf() {
        if (this.f5495S == null || !this.ty.isEmpty() || !this.f5500e.isEmpty() || this.ViF) {
            return;
        }
        this.ViF = true;
        OU ou2 = this.f5496T;
        if (ou2 != null) {
            ou2.Ik();
        }
        C2173m c2173m = this.aYN;
        if (c2173m != null) {
            c2173m.J2(FX());
            this.aYN = null;
        }
        if (!this.WPU) {
            this.WPU = true;
            this.xMQ.QZ6(0, ISg.j.NO_ERROR, new byte[0]);
        }
        this.xMQ.close();
    }

    static SPz pJg(ISg.j jVar) {
        SPz sPz = (SPz) f5491E.get(jVar);
        if (sPz != null) {
            return sPz;
        }
        return SPz.Uo.Ik("Unknown http2 error code: " + jVar.f4293n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void piY(int i2, ISg.j jVar, SPz sPz) {
        synchronized (this.gh) {
            try {
                if (this.f5495S == null) {
                    this.f5495S = sPz;
                    this.KN.n(sPz);
                }
                if (jVar != null && !this.WPU) {
                    this.WPU = true;
                    this.xMQ.QZ6(0, jVar, new byte[0]);
                }
                Iterator it = this.ty.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i2) {
                        it.remove();
                        ((fuX) entry.getValue()).ViF().v(sPz, l3D.j.REFUSED, false, new io.grpc.QJ());
                        I((fuX) entry.getValue());
                    }
                }
                for (fuX fux : this.f5500e) {
                    fux.ViF().v(sPz, l3D.j.MISCARRIED, true, new io.grpc.QJ());
                    I(fux);
                }
                this.f5500e.clear();
                eTf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void z(fuX fux) {
        if (!this.nY) {
            this.nY = true;
            OU ou2 = this.f5496T;
            if (ou2 != null) {
                ou2.ty();
            }
        }
        if (fux.aYN()) {
            this.jB.O(fux, true);
        }
    }

    fuX B(int i2) {
        fuX fux;
        synchronized (this.gh) {
            fux = (fuX) this.ty.get(Integer.valueOf(i2));
        }
        return fux;
    }

    boolean D() {
        return this.te == null;
    }

    String E() {
        URI uriRl = psW.rl(this.rl);
        return uriRl.getHost() != null ? uriRl.getHost() : this.rl;
    }

    @Override // io.grpc.internal.InterfaceC2171c
    /* JADX INFO: renamed from: GR, reason: merged with bridge method [inline-methods] */
    public fuX t(DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
        fuX fux;
        t1.Xo.ck(dAz, "method");
        t1.Xo.ck(qj, "headers");
        h6y h6yVarKN = h6y.KN(w6VarArr, xMQ(), qj);
        synchronized (this.gh) {
            fux = new fuX(dAz, qj, this.xMQ, this, this.mUb, this.gh, this.f5504r, this.J2, this.rl, this.f5505t, h6yVarKN, this.Xw, nVar, this.bzg);
        }
        return fux;
    }

    @Override // io.grpc.internal.o7q
    public void J2(SPz sPz) {
        synchronized (this.gh) {
            try {
                if (this.f5495S != null) {
                    return;
                }
                this.f5495S = sPz;
                this.KN.n(sPz);
                eTf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // KaW.n.j
    public void KN(Throwable th) {
        t1.Xo.ck(th, "failureCause");
        piY(0, ISg.j.INTERNAL_ERROR, SPz.f68186Z.ck(th));
    }

    int M() {
        URI uriRl = psW.rl(this.rl);
        return uriRl.getPort() != -1 ? uriRl.getPort() : this.f5502n.getPort();
    }

    @Override // io.grpc.internal.InterfaceC2171c
    public void O(InterfaceC2171c.j jVar, Executor executor) {
        long jNextLong;
        synchronized (this.gh) {
            try {
                boolean z2 = true;
                t1.Xo.XQ(this.xMQ != null);
                if (this.ViF) {
                    C2173m.Uo(jVar, executor, FX());
                    return;
                }
                C2173m c2173m = this.aYN;
                if (c2173m != null) {
                    jNextLong = 0;
                    z2 = false;
                } else {
                    jNextLong = this.nr.nextLong();
                    C2369c c2369c = (C2369c) this.f5494O.get();
                    c2369c.Uo();
                    C2173m c2173m2 = new C2173m(jNextLong, c2369c);
                    this.aYN = c2173m2;
                    this.Xw.rl();
                    c2173m = c2173m2;
                }
                if (z2) {
                    this.xMQ.ping(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                c2173m.n(jVar, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.o7q
    public Runnable Uo(o7q.j jVar) {
        this.KN = (o7q.j) t1.Xo.ck(jVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f5493N) {
            OU ou2 = new OU(new OU.w6(this), this.Ik, this.nHg, this.s7N, this.wTp);
            this.f5496T = ou2;
            ou2.ck();
        }
        KaW.j jVarA = KaW.j.a(this.ck, this, 10000);
        ISg.w6 w6VarFX = jVarA.FX(this.Uo.rl(Okio.buffer(jVarA), true));
        synchronized (this.gh) {
            KaW.n nVar = new KaW.n(this, w6VarFX);
            this.xMQ = nVar;
            this.mUb = new QJ(this, nVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.ck.execute(new w6(countDownLatch, jVarA));
        try {
            dR0();
            countDownLatch.countDown();
            this.ck.execute(new Ml());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean a(int i2) {
        boolean z2;
        synchronized (this.gh) {
            if (i2 < this.az) {
                z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    void eF(int i2, SPz sPz, l3D.j jVar, boolean z2, ISg.j jVar2, io.grpc.QJ qj) {
        synchronized (this.gh) {
            try {
                fuX fux = (fuX) this.ty.remove(Integer.valueOf(i2));
                if (fux != null) {
                    if (jVar2 != null) {
                        this.xMQ.KN(i2, ISg.j.CANCEL);
                    }
                    if (sPz != null) {
                        fuX.n nVarV = fux.ViF();
                        if (qj == null) {
                            qj = new io.grpc.QJ();
                        }
                        nVarV.v(sPz, jVar, z2, qj);
                    }
                    if (!ijL()) {
                        eTf();
                        I(fux);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k(fuX fux) {
        this.f5500e.remove(fux);
        I(fux);
    }

    @Override // KaW.QJ.Ml
    public QJ.w6[] n() {
        QJ.w6[] w6VarArr;
        synchronized (this.gh) {
            try {
                w6VarArr = new QJ.w6[this.ty.size()];
                Iterator it = this.ty.values().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    w6VarArr[i2] = ((fuX) it.next()).ViF().D();
                    i2++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w6VarArr;
    }

    @Override // JP.Z
    public afx nr() {
        return this.qie;
    }

    void p5(boolean z2, long j2, long j3, boolean z3) {
        this.f5493N = z2;
        this.nHg = j2;
        this.s7N = j3;
        this.wTp = z3;
    }

    @Override // io.grpc.internal.Q
    public io.grpc.j xMQ() {
        return this.XQ;
    }

    void xg(fuX fux) {
        if (this.f5495S != null) {
            fux.ViF().v(this.f5495S, l3D.j.MISCARRIED, true, new io.grpc.QJ());
        } else if (this.ty.size() < this.E2) {
            m(fux);
        } else {
            this.f5500e.add(fux);
            z(fux);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Nxk(ISg.j jVar, String str) {
        piY(0, jVar, pJg(jVar).O(str));
    }

    private void m(fuX fux) {
        boolean z2;
        if (fux.ViF().a() == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        t1.Xo.S(z2, "StreamId already assigned");
        this.ty.put(Integer.valueOf(this.az), fux);
        z(fux);
        fux.ViF().Nxk(this.az);
        if ((fux.wTp() != DAz.Ml.UNARY && fux.wTp() != DAz.Ml.SERVER_STREAMING) || fux.rV9()) {
            this.xMQ.flush();
        }
        int i2 = this.az;
        if (i2 >= 2147483645) {
            this.az = Integer.MAX_VALUE;
            piY(Integer.MAX_VALUE, ISg.j.NO_ERROR, SPz.f68186Z.Ik("Stream ids exhausted"));
        } else {
            this.az = i2 + 2;
        }
    }

    @Override // io.grpc.internal.o7q
    public void rl(SPz sPz) {
        J2(sPz);
        synchronized (this.gh) {
            try {
                Iterator it = this.ty.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((fuX) entry.getValue()).ViF().rV9(sPz, false, new io.grpc.QJ());
                    I((fuX) entry.getValue());
                }
                for (fuX fux : this.f5500e) {
                    fux.ViF().v(sPz, l3D.j.MISCARRIED, true, new io.grpc.QJ());
                    I(fux);
                }
                this.f5500e.clear();
                eTf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return t1.Dsr.t(this).t("logId", this.qie.nr()).nr(SafeDKWebAppInterface.f62924j, this.f5502n).toString();
    }
}
