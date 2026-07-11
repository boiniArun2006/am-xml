package com.google.firebase.perf.application;

import O2.CN3;
import O2.aC;
import R0.Wre;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import jMi.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import oK9.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class j implements Application.ActivityLifecycleCallbacks {
    private static volatile j P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final yMa.j f60571U = yMa.j.O();
    private final com.google.firebase.perf.config.j E2;
    private final WeakHashMap J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Timer f60572N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WeakHashMap f60573O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final AtomicInteger f60574S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Timer f60575T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final boolean f60576X;
    private boolean Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Set f60577Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O2.j f60578e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f60579g;
    private boolean jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WeakHashMap f60580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f60581o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f60582r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WeakHashMap f60583t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private oK9.Ml f60584v;

    /* JADX INFO: renamed from: com.google.firebase.perf.application.j$j, reason: collision with other inner class name */
    public interface InterfaceC0810j {
        void n();
    }

    public interface n {
        void onUpdateAppState(oK9.Ml ml);
    }

    j(C c2, O2.j jVar) {
        this(c2, jVar, com.google.firebase.perf.config.j.Uo(), Uo());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f60580n.isEmpty()) {
                this.f60575T = this.f60578e.n();
                this.f60580n.put(activity, Boolean.TRUE);
                if (this.jB) {
                    Ik(oK9.Ml.FOREGROUND);
                    qie();
                    this.jB = false;
                } else {
                    ty(O2.w6.BACKGROUND_TRACE_NAME.toString(), this.f60572N, this.f60575T);
                    Ik(oK9.Ml.FOREGROUND);
                }
            } else {
                this.f60580n.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (KN() && this.E2.s7N()) {
                if (!this.f60583t.containsKey(activity)) {
                    HI(activity);
                }
                ((Ml) this.f60583t.get(activity)).t();
                Trace trace = new Trace(t(activity), this.f60579g, this.f60578e, this);
                trace.start();
                this.J2.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (KN()) {
                az(activity);
            }
            if (this.f60580n.containsKey(activity)) {
                this.f60580n.remove(activity);
                if (this.f60580n.isEmpty()) {
                    this.f60572N = this.f60578e.n();
                    ty(O2.w6.FOREGROUND_TRACE_NAME.toString(), this.f60575T, this.f60572N);
                    Ik(oK9.Ml.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void xMQ(Context context) {
        if (this.Xw) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.Xw = true;
        }
    }

    private void Ik(oK9.Ml ml) {
        this.f60584v = ml;
        synchronized (this.f60581o) {
            try {
                Iterator it = this.f60581o.iterator();
                while (it.hasNext()) {
                    n nVar = (n) ((WeakReference) it.next()).get();
                    if (nVar != null) {
                        nVar.onUpdateAppState(this.f60584v);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void az(Activity activity) {
        Trace trace = (Trace) this.J2.get(activity);
        if (trace == null) {
            return;
        }
        this.J2.remove(activity);
        CN3 cn3O = ((Ml) this.f60583t.get(activity)).O();
        if (!cn3O.nr()) {
            f60571U.gh("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            aC.n(trace, (Wre.j) cn3O.t());
            trace.stop();
        }
    }

    private void qie() {
        synchronized (this.f60577Z) {
            try {
                for (InterfaceC0810j interfaceC0810j : this.f60577Z) {
                    if (interfaceC0810j != null) {
                        interfaceC0810j.n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static j rl() {
        if (P5 == null) {
            synchronized (j.class) {
                try {
                    if (P5 == null) {
                        P5 = new j(C.gh(), new O2.j());
                    }
                } finally {
                }
            }
        }
        return P5;
    }

    public static String t(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private void ty(String str, Timer timer, Timer timer2) {
        if (this.E2.s7N()) {
            qz.n nVarGh = qz.rV9().o(str).Ik(timer.O()).r(timer.nr(timer2)).gh(SessionManager.getInstance().perfSession().n());
            int andSet = this.f60574S.getAndSet(0);
            synchronized (this.f60582r) {
                try {
                    nVarGh.az(this.f60582r);
                    if (andSet != 0) {
                        nVarGh.HI(O2.n.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f60582r.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f60579g.aYN((qz) nVarGh.build(), oK9.Ml.FOREGROUND_BACKGROUND);
        }
    }

    public boolean J2() {
        return this.jB;
    }

    protected boolean KN() {
        return this.f60576X;
    }

    public void O(int i2) {
        this.f60574S.addAndGet(i2);
    }

    public void ck(WeakReference weakReference) {
        synchronized (this.f60581o) {
            this.f60581o.remove(weakReference);
        }
    }

    public void gh(WeakReference weakReference) {
        synchronized (this.f60581o) {
            this.f60581o.add(weakReference);
        }
    }

    public void mUb(InterfaceC0810j interfaceC0810j) {
        synchronized (this.f60577Z) {
            this.f60577Z.add(interfaceC0810j);
        }
    }

    public oK9.Ml n() {
        return this.f60584v;
    }

    public void nr(String str, long j2) {
        synchronized (this.f60582r) {
            try {
                Long l2 = (Long) this.f60582r.get(str);
                if (l2 == null) {
                    this.f60582r.put(str, Long.valueOf(j2));
                } else {
                    this.f60582r.put(str, Long.valueOf(l2.longValue() + j2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f60583t.remove(activity);
        if (this.f60573O.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().Ro((FragmentManager.FragmentLifecycleCallbacks) this.f60573O.remove(activity));
        }
    }

    private void HI(Activity activity) {
        if (KN() && this.E2.s7N()) {
            Ml ml = new Ml(activity);
            this.f60583t.put(activity, ml);
            if (activity instanceof FragmentActivity) {
                w6 w6Var = new w6(this.f60578e, this.f60579g, this, ml);
                this.f60573O.put(activity, w6Var);
                ((FragmentActivity) activity).getSupportFragmentManager().o9(w6Var, true);
            }
        }
    }

    private static boolean Uo() {
        return Ml.n();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        HI(activity);
    }

    j(C c2, O2.j jVar, com.google.firebase.perf.config.j jVar2, boolean z2) {
        this.f60580n = new WeakHashMap();
        this.f60583t = new WeakHashMap();
        this.f60573O = new WeakHashMap();
        this.J2 = new WeakHashMap();
        this.f60582r = new HashMap();
        this.f60581o = new HashSet();
        this.f60577Z = new HashSet();
        this.f60574S = new AtomicInteger(0);
        this.f60584v = oK9.Ml.BACKGROUND;
        this.Xw = false;
        this.jB = true;
        this.f60579g = c2;
        this.f60578e = jVar;
        this.E2 = jVar2;
        this.f60576X = z2;
    }
}
