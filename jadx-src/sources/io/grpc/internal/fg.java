package io.grpc.internal;

import io.grpc.internal.DAz;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fg extends io.grpc.z {
    private static final Method rV9;
    private boolean E2;
    long HI;
    int Ik;
    final String J2;
    private final SocketAddress KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final List f68478O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f68479S;
    final JP.j Uo;
    JP.Ln ViF;
    Map WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final n f68480X;
    JP.Q XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f68481Z;
    boolean aYN;
    JP.QJ az;
    int ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w6 f68482e;
    private boolean fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f68483g;
    String gh;
    private boolean iF;
    String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    FKk f68484n;
    private boolean nY;
    io.grpc.UGc nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f68485o;
    boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f68486r;
    FKk rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f68487t;
    private boolean te;
    JP.o ty;
    String xMQ;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final Logger f68476T = Logger.getLogger(fg.class.getName());

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    static final long f68475N = TimeUnit.MINUTES.toMillis(30);
    static final long nHg = TimeUnit.SECONDS.toMillis(1);
    private static final FKk s7N = oXP.t(psW.XQ);
    private static final JP.QJ wTp = JP.QJ.t();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final JP.o f68477v = JP.o.n();

    private static final class Ml implements n {
        private Ml() {
        }

        @Override // io.grpc.internal.fg.n
        public int n() {
            return 443;
        }
    }

    public interface n {
        int n();
    }

    public interface w6 {
        s4 n();
    }

    public fg(String str, w6 w6Var, n nVar) {
        this(str, null, null, w6Var, nVar);
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        } catch (NoSuchMethodException e3) {
            f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            declaredMethod = null;
        }
        rV9 = declaredMethod;
    }

    public fg(String str, JP.w6 w6Var, JP.j jVar, w6 w6Var2, n nVar) {
        FKk fKk = s7N;
        this.f68484n = fKk;
        this.rl = fKk;
        this.f68487t = new ArrayList();
        this.nr = io.grpc.UGc.rl();
        this.f68478O = new ArrayList();
        this.gh = "pick_first";
        this.az = wTp;
        this.ty = f68477v;
        this.HI = f68475N;
        this.ck = 5;
        this.Ik = 5;
        this.f68486r = 16777216L;
        this.f68485o = 1048576L;
        this.f68481Z = true;
        this.XQ = JP.Q.Uo();
        this.aYN = true;
        this.nY = true;
        this.f68483g = true;
        this.te = true;
        this.iF = false;
        this.fD = true;
        this.E2 = true;
        this.J2 = (String) t1.Xo.ck(str, "target");
        this.Uo = jVar;
        this.f68482e = (w6) t1.Xo.ck(w6Var2, "clientTransportFactoryBuilder");
        this.KN = null;
        if (nVar != null) {
            this.f68480X = nVar;
        } else {
            this.f68480X = new Ml();
        }
    }

    List J2() {
        boolean z2;
        Method method;
        ArrayList arrayList = new ArrayList(this.f68487t);
        List listN = JP.ci.n();
        if (listN != null) {
            arrayList.addAll(listN);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && this.nY && (method = rV9) != null) {
            try {
                android.support.v4.media.j.n(method.invoke(null, Boolean.valueOf(this.f68483g), Boolean.valueOf(this.te), Boolean.valueOf(this.iF), Boolean.valueOf(this.fD)));
            } catch (IllegalAccessException e2) {
                f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            } catch (InvocationTargetException e3) {
                f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            }
        }
        if (!z2 && this.E2) {
            try {
                android.support.v4.media.j.n(Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]));
            } catch (ClassNotFoundException e4) {
                f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            } catch (IllegalAccessException e5) {
                f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (NoSuchMethodException e6) {
                f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (InvocationTargetException e7) {
                f68476T.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            }
        }
        return arrayList;
    }

    int O() {
        return this.f68480X.n();
    }

    @Override // io.grpc.z
    public JP.nKK n() {
        return new KH(new gnv(this, this.f68482e.n(), new DAz.j(), oXP.t(psW.XQ), psW.WPU, J2(), Pmq.f68358n));
    }
}
