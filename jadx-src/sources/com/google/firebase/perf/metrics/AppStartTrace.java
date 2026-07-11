package com.google.firebase.perf.metrics;

import O2.I28;
import O2.fuX;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.view.Lifecycle;
import androidx.view.LifecycleObserver;
import androidx.view.OnLifecycleEvent;
import androidx.view.ProcessLifecycleOwner;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.google.firebase.Pl;
import com.google.firebase.Wre;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import jMi.C;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import oK9.Ml;
import oK9.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static ExecutorService f60618D;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static volatile AppStartTrace f60620J;
    private final Timer E2;
    private final com.google.firebase.perf.config.j J2;
    private PerfSession M7;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final O2.j f60624O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private WeakReference f60625S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private WeakReference f60629Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f60630e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Context f60633o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final qz.n f60634r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C f60635t;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final Timer f60619FX = new O2.j().n();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final long f60617B = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60632n = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f60631g = false;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Timer f60628X = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Timer f60626T = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Timer f60623N = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Timer f60636v = null;
    private Timer Xw = null;
    private Timer jB = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Timer f60627U = null;
    private Timer P5 = null;
    private boolean p5 = false;
    private int eF = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final n f60621E = new n();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f60622M = false;

    private final class n implements ViewTreeObserver.OnDrawListener {
        private n() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.mUb(AppStartTrace.this);
        }
    }

    public static class w6 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AppStartTrace f60638n;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f60638n.f60628X == null) {
                this.f60638n.p5 = true;
            }
        }

        public w6(AppStartTrace appStartTrace) {
            this.f60638n = appStartTrace;
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public synchronized void S(Context context) {
        try {
            if (this.f60632n) {
                return;
            }
            ProcessLifecycleOwner.qie().getLifecycleRegistry().n(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f60622M = this.f60622M || HI(applicationContext);
                this.f60632n = true;
                this.f60633o = applicationContext;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void WPU() {
        if (this.f60632n) {
            ProcessLifecycleOwner.qie().getLifecycleRegistry().nr(this);
            ((Application) this.f60633o).unregisterActivityLifecycleCallbacks(this);
            this.f60632n = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.p5 && this.f60628X == null) {
                this.f60622M = this.f60622M || HI(this.f60633o);
                this.f60629Z = new WeakReference(activity);
                this.f60628X = this.f60624O.n();
                if (ty().nr(this.f60628X) > f60617B) {
                    this.f60631g = true;
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.p5 && !this.f60631g) {
                boolean zKN = this.J2.KN();
                if (zKN && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f60621E);
                    I28.nr(viewFindViewById, new Runnable() { // from class: R0.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8642n.r();
                        }
                    });
                    fuX.n(viewFindViewById, new Runnable() { // from class: R0.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8643n.o();
                        }
                    }, new Runnable() { // from class: R0.w6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8644n.XQ();
                        }
                    });
                }
                if (this.f60623N != null) {
                    return;
                }
                this.f60625S = new WeakReference(activity);
                this.f60623N = this.f60624O.n();
                this.M7 = SessionManager.getInstance().perfSession();
                yMa.j.O().n("onResume(): " + activity.getClass().getName() + ": " + gh().nr(this.f60623N) + " microseconds");
                f60618D.execute(new Runnable() { // from class: R0.Ml
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8639n.ck();
                    }
                });
                if (!zKN) {
                    WPU();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.p5 && this.f60626T == null && !this.f60631g) {
            this.f60626T = this.f60624O.n();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public static boolean HI(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    private void Ik(final qz.n nVar) {
        if (this.jB == null || this.f60627U == null || this.P5 == null) {
            return;
        }
        f60618D.execute(new Runnable() { // from class: R0.I28
            @Override // java.lang.Runnable
            public final void run() {
                this.f8637n.f60635t.aYN((qz) nVar.build(), oK9.Ml.FOREGROUND_BACKGROUND);
            }
        });
        WPU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ() {
        if (this.f60627U != null) {
            return;
        }
        this.f60627U = this.f60624O.n();
        this.f60634r.qie((qz) qz.rV9().o("_experiment_preDrawFoQ").Ik(ty().O()).r(ty().nr(this.f60627U)).build());
        Ik(this.f60634r);
    }

    static AppStartTrace az(C c2, O2.j jVar) {
        if (f60620J == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f60620J == null) {
                        f60620J = new AppStartTrace(c2, jVar, com.google.firebase.perf.config.j.Uo(), new ThreadPoolExecutor(0, 1, 10 + f60617B, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f60620J;
    }

    private Timer gh() {
        Timer timer = this.f60630e;
        return timer != null ? timer : f60619FX;
    }

    static /* synthetic */ int mUb(AppStartTrace appStartTrace) {
        int i2 = appStartTrace.eF;
        appStartTrace.eF = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.jB != null) {
            return;
        }
        this.jB = this.f60624O.n();
        this.f60634r.Ik(ty().O()).r(ty().nr(this.jB));
        Ik(this.f60634r);
    }

    public static AppStartTrace qie() {
        return f60620J != null ? f60620J : az(C.gh(), new O2.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.P5 != null) {
            return;
        }
        this.P5 = this.f60624O.n();
        this.f60634r.qie((qz) qz.rV9().o("_experiment_onDrawFoQ").Ik(ty().O()).r(ty().nr(this.P5)).build());
        if (this.E2 != null) {
            this.f60634r.qie((qz) qz.rV9().o("_experiment_procStart_to_classLoad").Ik(ty().O()).r(ty().nr(gh())).build());
        }
        this.f60634r.ck("systemDeterminedForeground", this.f60622M ? "true" : V8ValueBoolean.FALSE);
        this.f60634r.HI("onDrawCount", this.eF);
        this.f60634r.gh(this.M7.n());
        Ik(this.f60634r);
    }

    private Timer ty() {
        Timer timer = this.E2;
        return timer != null ? timer : gh();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.p5 || this.f60631g || !this.J2.KN() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f60621E);
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.p5 || this.f60631g || this.Xw != null) {
            return;
        }
        this.Xw = this.f60624O.n();
        this.f60634r.qie((qz) qz.rV9().o("_experiment_firstBackgrounding").Ik(ty().O()).r(ty().nr(this.Xw)).build());
    }

    @Keep
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.p5 || this.f60631g || this.f60636v != null) {
            return;
        }
        this.f60636v = this.f60624O.n();
        this.f60634r.qie((qz) qz.rV9().o("_experiment_firstForegrounding").Ik(ty().O()).r(ty().nr(this.f60636v)).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppStartTrace(C c2, O2.j jVar, com.google.firebase.perf.config.j jVar2, ExecutorService executorService) {
        this.f60635t = c2;
        this.f60624O = jVar;
        this.J2 = jVar2;
        f60618D = executorService;
        this.f60634r = qz.rV9().o("_experiment_app_start_ttid");
        this.E2 = Timer.J2(Process.getStartElapsedRealtime());
        Pl pl = (Pl) Wre.az().mUb(Pl.class);
        this.f60630e = pl != null ? Timer.J2(pl.rl()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ck() {
        qz.n nVarR = qz.rV9().o(O2.w6.APP_START_TRACE_NAME.toString()).Ik(gh().O()).r(gh().nr(this.f60623N));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((qz) qz.rV9().o(O2.w6.ON_CREATE_TRACE_NAME.toString()).Ik(gh().O()).r(gh().nr(this.f60628X)).build());
        if (this.f60626T != null) {
            qz.n nVarRV9 = qz.rV9();
            nVarRV9.o(O2.w6.ON_START_TRACE_NAME.toString()).Ik(this.f60628X.O()).r(this.f60628X.nr(this.f60626T));
            arrayList.add((qz) nVarRV9.build());
            qz.n nVarRV92 = qz.rV9();
            nVarRV92.o(O2.w6.ON_RESUME_TRACE_NAME.toString()).Ik(this.f60626T.O()).r(this.f60626T.nr(this.f60623N));
            arrayList.add((qz) nVarRV92.build());
        }
        nVarR.mUb(arrayList).gh(this.M7.n());
        this.f60635t.aYN((qz) nVarR.build(), Ml.FOREGROUND_BACKGROUND);
    }
}
