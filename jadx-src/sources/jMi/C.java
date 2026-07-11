package jMi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.application.j;
import com.google.firebase.perf.session.SessionManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import oK9.Dsr;
import oK9.qz;
import oK9.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class C implements j.n {
    private Context E2;
    private com.google.firebase.Wre J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private w6.n f69371N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private n f69373S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private com.google.firebase.perf.application.j f69374T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Ml f69375X;
    private String Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private oSp.n f69376Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.firebase.perf.config.j f69377e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f69379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private s9b.I28 f69380o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Li.I28 f69381r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f69383v;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final yMa.j f69370U = yMa.j.O();
    private static final C P5 = new C();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConcurrentLinkedQueue f69382t = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicBoolean f69372O = new AtomicBoolean(false);
    private boolean jB = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ExecutorService f69378g = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private void KN() {
        this.f69374T.gh(new WeakReference(P5));
        w6.n nVarS = oK9.w6.S();
        this.f69371N = nVarS;
        nVarS.ty(this.J2.ck().t()).gh(oK9.j.HI().xMQ(this.f69383v).mUb(Li.j.rl).gh(ck(this.E2)));
        this.f69372O.set(true);
        while (!this.f69382t.isEmpty()) {
            final w6 w6Var = (w6) this.f69382t.poll();
            if (w6Var != null) {
                this.f69378g.execute(new Runnable() { // from class: jMi.aC
                    @Override // java.lang.Runnable
                    public final void run() {
                        C.rl(this.f69398n, w6Var);
                    }
                });
            }
        }
    }

    private boolean Z(oK9.Dsr dsr) {
        if (!this.f69377e.s7N()) {
            f69370U.Uo("Performance collection is not enabled, dropping %s", ty(dsr));
            return false;
        }
        if (!dsr.az().r()) {
            f69370U.gh(GDEJgAYrPQHfw.fdtvxhzNZo, ty(dsr));
            return false;
        }
        if (!iWe.I28.rl(dsr, this.E2)) {
            f69370U.gh("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", ty(dsr));
            return false;
        }
        if (!this.f69375X.KN(dsr)) {
            Ik(dsr);
            f69370U.Uo("Event dropped due to device sampling - %s", ty(dsr));
            return false;
        }
        if (!this.f69375X.Uo(dsr)) {
            return true;
        }
        Ik(dsr);
        f69370U.Uo("Rate limited (per device) - %s", ty(dsr));
        return false;
    }

    private static String ck(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static C gh() {
        return P5;
    }

    private void iF() {
        if (this.f69381r == null && XQ()) {
            this.f69381r = Li.I28.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nY() {
        Context contextQie = this.J2.qie();
        this.E2 = contextQie;
        this.f69383v = contextQie.getPackageName();
        this.f69377e = com.google.firebase.perf.config.j.Uo();
        this.f69375X = new Ml(this.E2, new O2.Dsr(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f69374T = com.google.firebase.perf.application.j.rl();
        this.f69373S = new n(this.f69376Z, this.f69377e.n());
        KN();
    }

    private boolean o(oK9.aC aCVar) {
        Integer num = (Integer) this.f69379n.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = (Integer) this.f69379n.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = (Integer) this.f69379n.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (aCVar.nr() && iIntValue > 0) {
            this.f69379n.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (aCVar.rl() && iIntValue2 > 0) {
            this.f69379n.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!aCVar.n() || iIntValue3 <= 0) {
            f69370U.rl("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", ty(aCVar), num, num2, num3);
            return false;
        }
        this.f69379n.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    private static String qie(oK9.CN3 cn3) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(cn3.XQ()), Integer.valueOf(cn3.r()), Integer.valueOf(cn3.Ik()));
    }

    private void te() {
        String str;
        if (this.f69377e.s7N()) {
            if (!this.f69371N.xMQ() || this.jB) {
                try {
                    str = (String) Tasks.await(this.f69380o.getId(), 60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    f69370U.nr("Task to retrieve Installation Id is interrupted: %s", e2.getMessage());
                    str = null;
                } catch (ExecutionException e3) {
                    f69370U.nr("Unable to retrieve Installation Id: %s", e3.getMessage());
                    str = null;
                } catch (TimeoutException e4) {
                    f69370U.nr("Task to retrieve Installation Id is timed out: %s", e4.getMessage());
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    f69370U.mUb("Firebase Installation Id is empty, contact Firebase Support for debugging.");
                } else {
                    this.f69371N.qie(str);
                }
            }
        }
    }

    public void S(final oK9.CN3 cn3, final oK9.Ml ml) {
        this.f69378g.execute(new Runnable() { // from class: jMi.Wre
            @Override // java.lang.Runnable
            public final void run() {
                C.J2(this.f69396n, cn3, ml);
            }
        });
    }

    public void WPU(final oK9.fuX fux, final oK9.Ml ml) {
        this.f69378g.execute(new Runnable() { // from class: jMi.fuX
            @Override // java.lang.Runnable
            public final void run() {
                C.nr(this.f69401n, fux, ml);
            }
        });
    }

    public boolean XQ() {
        return this.f69372O.get();
    }

    public void aYN(final qz qzVar, final oK9.Ml ml) {
        this.f69378g.execute(new Runnable() { // from class: jMi.CN3
            @Override // java.lang.Runnable
            public final void run() {
                C.t(this.f69385n, qzVar, ml);
            }
        });
    }

    @Override // com.google.firebase.perf.application.j.n
    public void onUpdateAppState(oK9.Ml ml) {
        this.jB = ml == oK9.Ml.FOREGROUND;
        if (XQ()) {
            this.f69378g.execute(new Runnable() { // from class: jMi.I28
                @Override // java.lang.Runnable
                public final void run() {
                    C c2 = this.f69388n;
                    c2.f69375X.n(c2.jB);
                }
            });
        }
    }

    public void r(com.google.firebase.Wre wre, s9b.I28 i28, oSp.n nVar) {
        this.J2 = wre;
        this.Xw = wre.ck().O();
        this.f69380o = i28;
        this.f69376Z = nVar;
        this.f69378g.execute(new Runnable() { // from class: jMi.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                this.f69387n.nY();
            }
        });
    }

    private C() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f69379n = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private static String HI(qz qzVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", qzVar.e(), new DecimalFormat("#.####").format(qzVar.iF() / 1000.0d));
    }

    private void Ik(oK9.Dsr dsr) {
        if (dsr.nr()) {
            this.f69374T.nr(O2.n.f7262t.toString(), 1L);
        } else if (dsr.rl()) {
            this.f69374T.nr(O2.n.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    public static /* synthetic */ void J2(C c2, oK9.CN3 cn3, oK9.Ml ml) {
        c2.getClass();
        c2.g(oK9.Dsr.HI().mUb(cn3), ml);
    }

    private void Uo(oK9.Dsr dsr) {
        if (dsr.nr()) {
            f69370U.Uo("Logging %s. In a minute, visit the Firebase console to view your data: %s", ty(dsr), xMQ(dsr.O()));
        } else {
            f69370U.Uo("Logging %s", ty(dsr));
        }
        this.f69373S.rl(dsr);
    }

    private oK9.Dsr ViF(Dsr.n nVar, oK9.Ml ml) {
        te();
        w6.n nVarAz = this.f69371N.az(ml);
        if (nVar.nr() || nVar.rl()) {
            nVarAz = ((w6.n) nVarAz.mo187clone()).mUb(mUb());
        }
        return (oK9.Dsr) nVar.xMQ(nVarAz).build();
    }

    private static String az(oK9.fuX fux) {
        long jT2;
        String strValueOf;
        if (fux.jB()) {
            jT2 = fux.T();
        } else {
            jT2 = 0;
        }
        if (fux.v()) {
            strValueOf = String.valueOf(fux.te());
        } else {
            strValueOf = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", fux.nHg(), strValueOf, new DecimalFormat("#.####").format(jT2 / 1000.0d));
    }

    private void g(Dsr.n nVar, oK9.Ml ml) {
        if (!XQ()) {
            if (o(nVar)) {
                f69370U.rl("Transport is not initialized yet, %s will be queued for to be dispatched later", ty(nVar));
                this.f69382t.add(new w6(nVar, ml));
                return;
            }
            return;
        }
        oK9.Dsr dsrViF = ViF(nVar, ml);
        if (Z(dsrViF)) {
            Uo(dsrViF);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    private Map mUb() {
        iF();
        Li.I28 i28 = this.f69381r;
        if (i28 != null) {
            return i28.rl();
        }
        return Collections.EMPTY_MAP;
    }

    public static /* synthetic */ void nr(C c2, oK9.fuX fux, oK9.Ml ml) {
        c2.getClass();
        c2.g(oK9.Dsr.HI().gh(fux), ml);
    }

    public static /* synthetic */ void rl(C c2, w6 w6Var) {
        c2.getClass();
        c2.g(w6Var.f69405n, w6Var.rl);
    }

    public static /* synthetic */ void t(C c2, qz qzVar, oK9.Ml ml) {
        c2.getClass();
        c2.g(oK9.Dsr.HI().qie(qzVar), ml);
    }

    private static String ty(oK9.aC aCVar) {
        if (aCVar.nr()) {
            return HI(aCVar.O());
        }
        if (aCVar.rl()) {
            return az(aCVar.t());
        }
        if (aCVar.n()) {
            return qie(aCVar.J2());
        }
        return CreativeInfo.f62442f;
    }

    private String xMQ(qz qzVar) {
        String strE = qzVar.e();
        if (strE.startsWith("_st_")) {
            return yMa.n.t(this.Xw, this.f69383v, strE);
        }
        return yMa.n.n(this.Xw, this.f69383v, strE);
    }
}
