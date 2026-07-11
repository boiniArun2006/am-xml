package io.grpc.internal;

import io.grpc.C;
import io.grpc.Pl;
import io.grpc.QJ;
import io.grpc.SPz;
import io.grpc.internal.V1;
import io.grpc.internal.l3D;
import io.grpc.internal.tI;
import io.grpc.n;
import io.grpc.w6;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class psW {
    public static final long HI;
    public static final JP.Ln Ik;
    public static final QJ.CN3 J2;
    public static final QJ.CN3 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final QJ.CN3 f68686O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final V1.Ml f68687S;
    public static final QJ.CN3 Uo;
    public static final t1.UGc WPU;
    public static final V1.Ml XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final io.grpc.w6 f68688Z;
    public static final t1.l3D az;
    public static final long ck;
    public static final QJ.CN3 gh;
    public static final QJ.CN3 mUb;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n.w6 f68690o;
    public static final QJ.CN3 qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final JP.Ln f68691r;
    public static final long ty;
    static final QJ.CN3 xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f68689n = Logger.getLogger(psW.class.getName());
    private static final Set rl = Collections.unmodifiableSet(EnumSet.of(SPz.n.OK, SPz.n.INVALID_ARGUMENT, SPz.n.NOT_FOUND, SPz.n.ALREADY_EXISTS, SPz.n.FAILED_PRECONDITION, SPz.n.ABORTED, SPz.n.OUT_OF_RANGE, SPz.n.DATA_LOSS));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Charset f68692t = Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    public static final QJ.CN3 nr = QJ.CN3.O("grpc-timeout", new Dsr());

    private static final class CN3 implements C.j {
        private CN3() {
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public byte[] n(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.QJ.aC
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public byte[] rl(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ CN3(j jVar) {
            this();
        }
    }

    static class Dsr implements QJ.Ml {
        @Override // io.grpc.QJ.Ml
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public String n(Long l2) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l2.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l2.longValue() < 100000000) {
                return l2 + com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j;
            }
            if (l2.longValue() < 100000000000L) {
                return timeUnit.toMicros(l2.longValue()) + "u";
            }
            if (l2.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l2.longValue()) + "m";
            }
            if (l2.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l2.longValue()) + "S";
            }
            if (l2.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l2.longValue()) + "M";
            }
            return timeUnit.toHours(l2.longValue()) + "H";
        }

        Dsr() {
        }

        @Override // io.grpc.QJ.Ml
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Long rl(String str) {
            boolean z2;
            boolean z3;
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            t1.Xo.O(z2, "empty timeout");
            if (str.length() <= 9) {
                z3 = true;
            } else {
                z3 = false;
            }
            t1.Xo.O(z3, "bad timeout format");
            long j2 = Long.parseLong(str.substring(0, str.length() - 1));
            char cCharAt = str.charAt(str.length() - 1);
            if (cCharAt != 'H') {
                if (cCharAt != 'M') {
                    if (cCharAt != 'S') {
                        if (cCharAt != 'u') {
                            if (cCharAt != 'm') {
                                if (cCharAt == 'n') {
                                    return Long.valueOf(j2);
                                }
                                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(cCharAt)));
                            }
                            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j2));
                        }
                        return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j2));
                    }
                    return Long.valueOf(TimeUnit.SECONDS.toNanos(j2));
                }
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j2));
            }
            return Long.valueOf(TimeUnit.HOURS.toNanos(j2));
        }
    }

    class Ml implements V1.Ml {
        @Override // io.grpc.internal.V1.Ml
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService n() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, psW.mUb("grpc-timer-%d", true));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }

        Ml() {
        }

        @Override // io.grpc.internal.V1.Ml
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void rl(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }
    }

    class Wre implements InterfaceC2171c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6.j f68693n;
        final /* synthetic */ InterfaceC2171c rl;

        Wre(w6.j jVar, InterfaceC2171c interfaceC2171c) {
            this.f68693n = jVar;
            this.rl = interfaceC2171c;
        }

        @Override // JP.Z
        public JP.afx nr() {
            return this.rl.nr();
        }

        @Override // io.grpc.internal.InterfaceC2171c
        public QJ t(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar, io.grpc.w6[] w6VarArr) {
            boolean z2;
            io.grpc.w6 w6VarN = this.f68693n.n(w6.n.n().rl(nVar).n(), qj);
            if (w6VarArr[w6VarArr.length - 1] == psW.f68688Z) {
                z2 = true;
            } else {
                z2 = false;
            }
            t1.Xo.S(z2, "lb tracer already assigned");
            w6VarArr[w6VarArr.length - 1] = w6VarN;
            return this.rl.t(dAz, qj, nVar, w6VarArr);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'O' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class fuX {
        public static final fuX E2;
        public static final fuX J2;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final fuX f68694N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final fuX f68695O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final fuX f68696S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final fuX f68697T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private static final /* synthetic */ fuX[] f68698U;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final fuX f68699X;
        public static final fuX Xw;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public static final fuX f68700Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final fuX f68701e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final fuX f68702g;
        private static final fuX[] jB;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final fuX f68703o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final fuX f68704r;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final fuX f68705v;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f68706n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final io.grpc.SPz f68707t;

        static {
            io.grpc.SPz sPz = io.grpc.SPz.f68186Z;
            fuX fux = new fuX("NO_ERROR", 0, 0, sPz);
            f68695O = fux;
            io.grpc.SPz sPz2 = io.grpc.SPz.f68187o;
            fuX fux2 = new fuX("PROTOCOL_ERROR", 1, 1, sPz2);
            J2 = fux2;
            fuX fux3 = new fuX("INTERNAL_ERROR", 2, 2, sPz2);
            f68704r = fux3;
            fuX fux4 = new fuX("FLOW_CONTROL_ERROR", 3, 3, sPz2);
            f68703o = fux4;
            fuX fux5 = new fuX("SETTINGS_TIMEOUT", 4, 4, sPz2);
            f68700Z = fux5;
            fuX fux6 = new fuX("STREAM_CLOSED", 5, 5, sPz2);
            f68696S = fux6;
            fuX fux7 = new fuX("FRAME_SIZE_ERROR", 6, 6, sPz2);
            f68702g = fux7;
            fuX fux8 = new fuX("REFUSED_STREAM", 7, 7, sPz);
            E2 = fux8;
            fuX fux9 = new fuX("CANCEL", 8, 8, io.grpc.SPz.J2);
            f68701e = fux9;
            fuX fux10 = new fuX("COMPRESSION_ERROR", 9, 9, sPz2);
            f68699X = fux10;
            fuX fux11 = new fuX("CONNECT_ERROR", 10, 10, sPz2);
            f68697T = fux11;
            fuX fux12 = new fuX("ENHANCE_YOUR_CALM", 11, 11, io.grpc.SPz.ty.Ik("Bandwidth exhausted"));
            f68694N = fux12;
            fuX fux13 = new fuX("INADEQUATE_SECURITY", 12, 12, io.grpc.SPz.qie.Ik("Permission denied as protocol is not secure enough to call"));
            f68705v = fux13;
            fuX fux14 = new fuX("HTTP_1_1_REQUIRED", 13, 13, io.grpc.SPz.Uo);
            Xw = fux14;
            f68698U = new fuX[]{fux, fux2, fux3, fux4, fux5, fux6, fux7, fux8, fux9, fux10, fux11, fux12, fux13, fux14};
            jB = n();
        }

        public static fuX t(long j2) {
            fuX[] fuxArr = jB;
            if (j2 >= fuxArr.length || j2 < 0) {
                return null;
            }
            return fuxArr[(int) j2];
        }

        public static fuX valueOf(String str) {
            return (fuX) Enum.valueOf(fuX.class, str);
        }

        public static fuX[] values() {
            return (fuX[]) f68698U.clone();
        }

        public io.grpc.SPz nr() {
            return this.f68707t;
        }

        public long rl() {
            return this.f68706n;
        }

        private fuX(String str, int i2, int i3, io.grpc.SPz sPz) {
            this.f68706n = i3;
            String str2 = "HTTP/2 error code: " + name();
            if (sPz.ty() != null) {
                str2 = str2 + " (" + sPz.ty() + ")";
            }
            this.f68707t = sPz.Ik(str2);
        }

        public static io.grpc.SPz J2(long j2) {
            fuX fuxT = t(j2);
            if (fuxT == null) {
                return io.grpc.SPz.KN(f68704r.nr().az().t()).Ik("Unrecognized HTTP/2 error code: " + j2);
            }
            return fuxT.nr();
        }

        private static fuX[] n() {
            fuX[] fuxArrValues = values();
            fuX[] fuxArr = new fuX[((int) fuxArrValues[fuxArrValues.length - 1].rl()) + 1];
            for (fuX fux : fuxArrValues) {
                fuxArr[(int) fux.rl()] = fux;
            }
            return fuxArr;
        }
    }

    class w6 implements V1.Ml {
        @Override // io.grpc.internal.V1.Ml
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Executor n() {
            return Executors.newCachedThreadPool(psW.mUb("grpc-default-executor-%d", true));
        }

        @Override // io.grpc.internal.V1.Ml
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void rl(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        public String toString() {
            return "grpc-default-executor";
        }

        w6() {
        }
    }

    public static boolean ty(String str) {
        char cCharAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';';
        }
        return false;
    }

    class I28 implements t1.UGc {
        I28() {
        }

        @Override // t1.UGc
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C2369c get() {
            return C2369c.t();
        }
    }

    class j implements JP.Ln {
        @Override // JP.Ln
        public JP.qf n(SocketAddress socketAddress) {
            return null;
        }

        j() {
        }
    }

    class n extends io.grpc.w6 {
        n() {
        }
    }

    static {
        QJ.Ml ml = io.grpc.QJ.f68177O;
        f68686O = QJ.CN3.O("grpc-encoding", ml);
        j jVar = null;
        J2 = io.grpc.C.rl("grpc-accept-encoding", new CN3(jVar));
        Uo = QJ.CN3.O("content-encoding", ml);
        KN = io.grpc.C.rl("accept-encoding", new CN3(jVar));
        xMQ = QJ.CN3.O("content-length", ml);
        mUb = QJ.CN3.O("content-type", ml);
        gh = QJ.CN3.O("te", ml);
        qie = QJ.CN3.O("user-agent", ml);
        az = t1.l3D.nr(',').KN();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ty = timeUnit.toNanos(20L);
        HI = TimeUnit.HOURS.toNanos(2L);
        ck = timeUnit.toNanos(20L);
        Ik = new qYU();
        f68691r = new j();
        f68690o = n.w6.rl("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f68688Z = new n();
        XQ = new w6();
        f68687S = new Ml();
        WPU = new I28();
    }

    public static io.grpc.SPz HI(io.grpc.SPz sPz) {
        t1.Xo.nr(sPz != null);
        if (!rl.contains(sPz.az())) {
            return sPz;
        }
        return io.grpc.SPz.f68187o.Ik("Inappropriate status code from control plane: " + sPz.az() + " " + sPz.ty()).ck(sPz.qie());
    }

    public static String KN(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.62.2");
        return sb.toString();
    }

    public static void O(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            f68689n.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean ck(io.grpc.n nVar) {
        return !Boolean.TRUE.equals(nVar.KN(f68690o));
    }

    public static ThreadFactory mUb(String str, boolean z2) {
        return new com.google.common.util.concurrent.Q().O(z2).J2(str).rl();
    }

    private static SPz.n qie(int i2) {
        if (i2 >= 100 && i2 < 200) {
            return SPz.n.INTERNAL;
        }
        if (i2 != 400) {
            if (i2 == 401) {
                return SPz.n.UNAUTHENTICATED;
            }
            if (i2 == 403) {
                return SPz.n.PERMISSION_DENIED;
            }
            if (i2 == 404) {
                return SPz.n.UNIMPLEMENTED;
            }
            if (i2 != 429) {
                if (i2 != 431) {
                    switch (i2) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return SPz.n.UNKNOWN;
                    }
                }
            }
            return SPz.n.UNAVAILABLE;
        }
        return SPz.n.INTERNAL;
    }

    public static URI rl(String str) {
        String str2;
        t1.Xo.ck(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid authority: " + str2, e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    public static String xMQ(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static io.grpc.w6[] J2(io.grpc.n nVar, io.grpc.QJ qj, int i2, boolean z2) {
        List listXMQ = nVar.xMQ();
        int size = listXMQ.size();
        io.grpc.w6[] w6VarArr = new io.grpc.w6[size + 1];
        w6.n nVarN = w6.n.n().rl(nVar).nr(i2).t(z2).n();
        for (int i3 = 0; i3 < listXMQ.size(); i3++) {
            w6VarArr[i3] = ((w6.j) listXMQ.get(i3)).n(nVarN, qj);
        }
        w6VarArr[size] = f68688Z;
        return w6VarArr;
    }

    public static boolean Uo(String str, boolean z2) {
        String property = System.getenv(str);
        if (property == null) {
            property = System.getProperty(str);
        }
        if (z2) {
            if (t1.s4.rl(property) || Boolean.parseBoolean(property)) {
                return true;
            }
            return false;
        }
        if (!t1.s4.rl(property) && Boolean.parseBoolean(property)) {
            return true;
        }
        return false;
    }

    public static io.grpc.SPz az(int i2) {
        return qie(i2).rl().Ik("HTTP status code " + i2);
    }

    static InterfaceC2171c gh(Pl.Wre wre, boolean z2) {
        InterfaceC2171c interfaceC2171cN;
        Pl.Dsr dsrT = wre.t();
        if (dsrT != null) {
            interfaceC2171cN = ((i) dsrT.O()).n();
        } else {
            interfaceC2171cN = null;
        }
        if (interfaceC2171cN != null) {
            w6.j jVarRl = wre.rl();
            if (jVarRl == null) {
                return interfaceC2171cN;
            }
            return new Wre(jVarRl, interfaceC2171cN);
        }
        if (!wre.n().HI()) {
            if (wre.nr()) {
                return new qf(HI(wre.n()), l3D.j.DROPPED);
            }
            if (!z2) {
                return new qf(HI(wre.n()), l3D.j.PROCESSED);
            }
        }
        return null;
    }

    static void nr(tI.j jVar) {
        while (true) {
            InputStream next = jVar.next();
            if (next != null) {
                O(next);
            } else {
                return;
            }
        }
    }

    public static String t(String str) {
        boolean z2;
        if (rl(str).getAuthority().indexOf(64) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        t1.Xo.gh(z2, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }
}
