package KaW;

import JP.vd;
import io.grpc.internal.CN3;
import io.grpc.internal.FKk;
import io.grpc.internal.OU;
import io.grpc.internal.Pp;
import io.grpc.internal.Q;
import io.grpc.internal.V1;
import io.grpc.internal.fg;
import io.grpc.internal.oXP;
import io.grpc.internal.psW;
import io.grpc.internal.s4;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import wIE.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre extends io.grpc.Wre {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final FKk f5528S;
    private static final EnumSet WPU;
    private static final V1.Ml XQ;
    private SSLSocketFactory J2;
    private HostnameVerifier KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private SocketFactory f5532O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fg f5533n;
    private boolean ty;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f5531r = Logger.getLogger(Wre.class.getName());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final wIE.n f5530o = new n.C1248n(wIE.n.J2).Uo(wIE.j.EF, wIE.j.Zn, wIE.j.uG, wIE.j.nO, wIE.j.n7b, wIE.j.o9).mUb(wIE.C.TLS_1_2).KN(true).O();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f5529Z = TimeUnit.DAYS.toNanos(1000);
    private Pp.n rl = Pp.n();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FKk f5534t = f5528S;
    private FKk nr = oXP.t(psW.f68687S);
    private wIE.n xMQ = f5530o;
    private w6 mUb = w6.TLS;
    private long gh = Long.MAX_VALUE;
    private long qie = psW.ty;
    private int az = 65535;
    private int HI = 4194304;
    private int ck = Integer.MAX_VALUE;
    private final boolean Ik = false;
    private final boolean Uo = false;

    private final class I28 implements fg.w6 {
        private I28() {
        }

        /* synthetic */ I28(Wre wre, j jVar) {
            this();
        }

        @Override // io.grpc.internal.fg.w6
        public s4 n() {
            return Wre.this.J2();
        }
    }

    private final class Ml implements fg.n {
        private Ml() {
        }

        /* synthetic */ Ml(Wre wre, j jVar) {
            this();
        }

        @Override // io.grpc.internal.fg.n
        public int n() {
            return Wre.this.xMQ();
        }
    }

    /* JADX INFO: renamed from: KaW.Wre$Wre, reason: collision with other inner class name */
    static final class C0190Wre implements s4 {
        final int E2;
        final ScheduledExecutorService J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private final long f5537N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final FKk f5538O;
        private boolean P5;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final HostnameVerifier f5539S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private final io.grpc.internal.CN3 f5540T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        final boolean f5541U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private final long f5542X;
        private final boolean Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final SSLSocketFactory f5543Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f5544e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final wIE.n f5545g;
        final int jB;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final FKk f5546n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final SocketFactory f5547o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final Pp.n f5548r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Executor f5549t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final int f5550v;

        /* JADX INFO: renamed from: KaW.Wre$Wre$j */
        class j implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ CN3.n f5551n;

            j(CN3.n nVar) {
                this.f5551n = nVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5551n.n();
            }
        }

        /* synthetic */ C0190Wre(FKk fKk, FKk fKk2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, wIE.n nVar, int i2, boolean z2, long j2, long j3, int i3, boolean z3, int i5, Pp.n nVar2, boolean z4, j jVar) {
            this(fKk, fKk2, socketFactory, sSLSocketFactory, hostnameVerifier, nVar, i2, z2, j2, j3, i3, z3, i5, nVar2, z4);
        }

        private C0190Wre(FKk fKk, FKk fKk2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, wIE.n nVar, int i2, boolean z2, long j2, long j3, int i3, boolean z3, int i5, Pp.n nVar2, boolean z4) {
            this.f5546n = fKk;
            this.f5549t = (Executor) fKk.n();
            this.f5538O = fKk2;
            this.J2 = (ScheduledExecutorService) fKk2.n();
            this.f5547o = socketFactory;
            this.f5543Z = sSLSocketFactory;
            this.f5539S = hostnameVerifier;
            this.f5545g = nVar;
            this.E2 = i2;
            this.f5544e = z2;
            this.f5542X = j2;
            this.f5540T = new io.grpc.internal.CN3("keepalive time nanos", j2);
            this.f5537N = j3;
            this.f5550v = i3;
            this.Xw = z3;
            this.jB = i5;
            this.f5541U = z4;
            this.f5548r = (Pp.n) t1.Xo.ck(nVar2, "transportTracerFactory");
        }

        @Override // io.grpc.internal.s4
        public ScheduledExecutorService J() {
            return this.J2;
        }

        @Override // io.grpc.internal.s4, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.P5) {
                return;
            }
            this.P5 = true;
            this.f5546n.rl(this.f5549t);
            this.f5538O.rl(this.J2);
        }

        @Override // io.grpc.internal.s4
        public Q s7N(SocketAddress socketAddress, s4.j jVar, JP.Ml ml) {
            if (this.P5) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            CN3.n nVarNr = this.f5540T.nr();
            Dsr dsr = new Dsr(this, (InetSocketAddress) socketAddress, jVar.n(), jVar.nr(), jVar.rl(), jVar.t(), new j(nVarNr));
            if (this.f5544e) {
                dsr.p5(true, nVarNr.rl(), this.f5537N, this.Xw);
            }
            return dsr;
        }

        @Override // io.grpc.internal.s4
        public Collection tFV() {
            return Wre.mUb();
        }
    }

    class j implements V1.Ml {
        @Override // io.grpc.internal.V1.Ml
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Executor n() {
            return Executors.newCachedThreadPool(psW.mUb("grpc-okhttp-%d", true));
        }

        @Override // io.grpc.internal.V1.Ml
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void rl(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        j() {
        }
    }

    private enum w6 {
        TLS,
        PLAINTEXT
    }

    static /* synthetic */ class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f5553n;
        static final /* synthetic */ int[] rl;

        static {
            int[] iArr = new int[w6.values().length];
            rl = iArr;
            try {
                iArr[w6.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rl[w6.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[KaW.I28.values().length];
            f5553n = iArr2;
            try {
                iArr2[KaW.I28.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5553n[KaW.I28.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        j jVar = new j();
        XQ = jVar;
        f5528S = oXP.t(jVar);
        WPU = EnumSet.of(vd.MTLS, vd.CUSTOM_MANAGERS);
    }

    public static Wre KN(String str) {
        return new Wre(str);
    }

    static Collection mUb() {
        return Collections.singleton(InetSocketAddress.class);
    }

    C0190Wre J2() {
        return new C0190Wre(this.f5534t, this.nr, this.f5532O, Uo(), this.KN, this.xMQ, this.HI, this.gh != Long.MAX_VALUE, this.gh, this.qie, this.az, this.ty, this.ck, this.rl, false, null);
    }

    @Override // io.grpc.Wre
    protected io.grpc.z O() {
        return this.f5533n;
    }

    SSLSocketFactory Uo() {
        int i2 = n.rl[this.mUb.ordinal()];
        if (i2 == 1) {
            return null;
        }
        if (i2 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.mUb);
        }
        try {
            if (this.J2 == null) {
                this.J2 = SSLContext.getInstance("Default", wIE.fuX.O().Uo()).getSocketFactory();
            }
            return this.J2;
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("TLS Provider failure", e2);
        }
    }

    @Override // io.grpc.z
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Wre t(long j2, TimeUnit timeUnit) {
        t1.Xo.O(j2 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j2);
        this.gh = nanos;
        long jQie = OU.qie(nanos);
        this.gh = jQie;
        if (jQie >= f5529Z) {
            this.gh = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // io.grpc.z
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Wre nr() {
        t1.Xo.S(!this.Uo, "Cannot change security when using ChannelCredentials");
        this.mUb = w6.PLAINTEXT;
        return this;
    }

    int xMQ() {
        int i2 = n.rl[this.mUb.ordinal()];
        if (i2 == 1) {
            return 80;
        }
        if (i2 == 2) {
            return 443;
        }
        throw new AssertionError(this.mUb + " not handled");
    }

    private Wre(String str) {
        j jVar = null;
        this.f5533n = new fg(str, new I28(this, jVar), new Ml(this, jVar));
    }
}
