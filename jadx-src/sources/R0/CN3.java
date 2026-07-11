package R0;

import O2.Pl;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import jMi.C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import oK9.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 extends com.google.firebase.perf.application.n implements Avf.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final yMa.j f8629g = yMa.j.O();
    private final fuX.n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final C f8630O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f8631S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f8632Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f8633n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8634o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final WeakReference f8635r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GaugeManager f8636t;

    private CN3(C c2) {
        this(c2, com.google.firebase.perf.application.j.rl(), GaugeManager.getInstance());
    }

    public CN3(C c2, com.google.firebase.perf.application.j jVar, GaugeManager gaugeManager) {
        super(jVar);
        this.J2 = fuX.P5();
        this.f8635r = new WeakReference(this);
        this.f8630O = c2;
        this.f8636t = gaugeManager;
        this.f8633n = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    private boolean KN() {
        return this.J2.ty();
    }

    private boolean Uo() {
        return this.J2.qie();
    }

    public static CN3 t(C c2) {
        return new CN3(c2);
    }

    public CN3 HI(String str) {
        if (str == null) {
            this.J2.mUb();
            return this;
        }
        if (xMQ(str)) {
            this.J2.Z(str);
            return this;
        }
        f8629g.mUb("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public CN3 Ik(long j2) {
        this.J2.S(j2);
        return this;
    }

    public boolean J2() {
        return this.J2.az();
    }

    public long O() {
        return this.J2.gh();
    }

    public CN3 XQ(String str) {
        this.f8634o = str;
        return this;
    }

    public CN3 Z(String str) {
        if (str != null) {
            this.J2.ViF(Pl.O(Pl.nr(str), 2000));
        }
        return this;
    }

    public CN3 az(long j2) {
        this.J2.o(j2);
        return this;
    }

    public CN3 ck(long j2) {
        this.J2.XQ(j2);
        return this;
    }

    public CN3 gh(int i2) {
        this.J2.Ik(i2);
        return this;
    }

    public CN3 mUb(String str) {
        fuX.Ml ml;
        if (str != null) {
            fuX.Ml ml2 = fuX.Ml.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    ml = fuX.Ml.OPTIONS;
                    break;
                case "GET":
                    ml = fuX.Ml.GET;
                    break;
                case "PUT":
                    ml = fuX.Ml.PUT;
                    break;
                case "HEAD":
                    ml = fuX.Ml.HEAD;
                    break;
                case "POST":
                    ml = fuX.Ml.POST;
                    break;
                case "PATCH":
                    ml = fuX.Ml.PATCH;
                    break;
                case "TRACE":
                    ml = fuX.Ml.TRACE;
                    break;
                case "CONNECT":
                    ml = fuX.Ml.CONNECT;
                    break;
                case "DELETE":
                    ml = fuX.Ml.DELETE;
                    break;
                default:
                    ml = fuX.Ml.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.J2.ck(ml);
        }
        return this;
    }

    @Override // Avf.j
    public void n(PerfSession perfSession) {
        if (perfSession == null) {
            f8629g.mUb("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!Uo() || KN()) {
                return;
            }
            this.f8633n.add(perfSession);
        }
    }

    List nr() {
        List listUnmodifiableList;
        synchronized (this.f8633n) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f8633n) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return listUnmodifiableList;
    }

    public CN3 o(long j2) {
        this.J2.aYN(j2);
        return this;
    }

    public CN3 qie() {
        this.J2.r(fuX.I28.GENERIC_CLIENT_ERROR);
        return this;
    }

    public CN3 r(long j2) {
        this.J2.WPU(j2);
        if (SessionManager.getInstance().perfSession().O()) {
            this.f8636t.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().nr());
        }
        return this;
    }

    private static boolean xMQ(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    public fuX rl() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f8635r);
        unregisterForAppState();
        oK9.C[] cArrRl = PerfSession.rl(nr());
        if (cArrRl != null) {
            this.J2.xMQ(Arrays.asList(cArrRl));
        }
        fuX fux = (fuX) this.J2.build();
        if (!nl4.Ml.t(this.f8634o)) {
            f8629g.n("Dropping network request from a 'User-Agent' that is not allowed");
            return fux;
        }
        if (!this.f8632Z) {
            this.f8630O.WPU(fux, getAppState());
            this.f8632Z = true;
            return fux;
        }
        if (this.f8631S) {
            f8629g.n("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return fux;
    }

    public CN3 ty(long j2) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f8635r);
        this.J2.HI(j2);
        n(perfSession);
        if (perfSession.O()) {
            this.f8636t.collectGaugeMetricOnce(perfSession.nr());
        }
        return this;
    }
}
