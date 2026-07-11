package UiE;

import CKP.l3D;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.Ew;
import com.facebook.internal.Pl;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.Z;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 {
    private static final Object J2;
    private static volatile Pl KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static volatile ScheduledFuture f10796O;
    private static final AtomicInteger Uo;
    private static WeakReference az;
    private static long gh;
    private static String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f10797n = new CN3();
    private static final ScheduledExecutorService nr;
    private static int qie;
    private static final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ScheduledExecutorService f10798t;
    private static String ty;
    private static final AtomicBoolean xMQ;

    public static final class j implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivityCreated");
            fuX.n();
            CN3.Ik(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivityDestroyed");
            CN3.f10797n.o(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivityPaused");
            fuX.n();
            CN3.f10797n.Z(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivityResumed");
            fuX.n();
            CN3.WPU(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CN3.qie++;
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Z.f52780O.rl(Ew.APP_EVENTS, CN3.rl, "onActivityStopped");
            com.facebook.appevents.Xo.rl.KN();
            CN3.qie--;
        }

        j() {
        }
    }

    static {
        String canonicalName = CN3.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        rl = canonicalName;
        f10798t = Executors.newSingleThreadScheduledExecutor();
        nr = Executors.newSingleThreadScheduledExecutor();
        J2 = new Object();
        Uo = new AtomicInteger(0);
        xMQ = new AtomicBoolean(false);
    }

    public static final void Ik(Activity activity) {
        f10798t.execute(new Runnable() { // from class: UiE.I28
            @Override // java.lang.Runnable
            public final void run() {
                CN3.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(long j2, String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (KN == null) {
            KN = new Pl(Long.valueOf(j2), null, null, 4, null);
        }
        if (Uo.get() <= 0) {
            Xo.nr(activityName, KN, mUb);
            Pl.Uo.n();
            KN = null;
        }
        synchronized (J2) {
            f10796O = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ViF(long j2, String activityName, Context appContext) {
        Pl pl;
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        Pl pl3 = KN;
        Long lO = pl3 != null ? pl3.O() : null;
        if (KN == null) {
            KN = new Pl(Long.valueOf(j2), null, null, 4, null);
            String str = mUb;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            Xo.rl(activityName, null, str, appContext);
        } else if (lO != null) {
            long jLongValue = j2 - lO.longValue();
            if (jLongValue > f10797n.HI() * 1000) {
                Xo.nr(activityName, KN, mUb);
                String str2 = mUb;
                Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                Xo.rl(activityName, null, str2, appContext);
                KN = new Pl(Long.valueOf(j2), null, null, 4, null);
            } else if (jLongValue > 1000 && (pl = KN) != null) {
                pl.KN();
            }
        }
        Pl pl4 = KN;
        if (pl4 != null) {
            pl4.gh(Long.valueOf(j2));
        }
        Pl pl5 = KN;
        if (pl5 != null) {
            pl5.az();
        }
    }

    public static final void WPU(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        az = new WeakReference(activity);
        Uo.incrementAndGet();
        f10797n.qie();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        gh = jCurrentTimeMillis;
        final String strXQ = vd.XQ(activity);
        bZx.I28.qie(activity);
        Vk7.n.nr(activity);
        aP.I28.KN(activity);
        String str = ty;
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "ProxyBillingActivity", false, 2, (Object) null) && !Intrinsics.areEqual(strXQ, "ProxyBillingActivity")) {
            nr.execute(new Runnable() { // from class: UiE.n
                @Override // java.lang.Runnable
                public final void run() {
                    CN3.aYN();
                }
            });
        }
        final Context applicationContext = activity.getApplicationContext();
        f10798t.execute(new Runnable() { // from class: UiE.w6
            @Override // java.lang.Runnable
            public final void run() {
                CN3.ViF(jCurrentTimeMillis, strXQ, applicationContext);
            }
        });
        ty = strXQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(final long j2, final String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (KN == null) {
            KN = new Pl(Long.valueOf(j2), null, null, 4, null);
        }
        Pl pl = KN;
        if (pl != null) {
            pl.gh(Long.valueOf(j2));
        }
        if (Uo.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: UiE.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    CN3.S(j2, activityName);
                }
            };
            synchronized (J2) {
                f10796O = f10798t.schedule(runnable, f10797n.HI(), TimeUnit.SECONDS);
                Unit unit = Unit.INSTANCE;
            }
        }
        long j3 = gh;
        C.xMQ(activityName, j3 > 0 ? (j2 - j3) / ((long) 1000) : 0L);
        Pl pl3 = KN;
        if (pl3 != null) {
            pl3.az();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(Activity activity) {
        AtomicInteger atomicInteger = Uo;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(rl, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        qie();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strXQ = vd.XQ(activity);
        bZx.I28.gh(activity);
        f10798t.execute(new Runnable() { // from class: UiE.Ml
            @Override // java.lang.Runnable
            public final void run() {
                CN3.XQ(jCurrentTimeMillis, strXQ);
            }
        });
    }

    public static final Activity az() {
        WeakReference weakReference = az;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final boolean ck() {
        return qie == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z2) {
        if (z2) {
            bZx.I28.J2();
        } else {
            bZx.I28.O();
        }
    }

    public static final void nY(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (xMQ.compareAndSet(false, true)) {
            com.facebook.internal.Pl.n(Pl.n.CodelessEvents, new Pl.j() { // from class: UiE.j
                @Override // com.facebook.internal.Pl.j
                public final void n(boolean z2) {
                    CN3.g(z2);
                }
            });
            mUb = str;
            application.registerActivityLifecycleCallbacks(new j());
        }
    }

    private final void qie() {
        ScheduledFuture scheduledFuture;
        synchronized (J2) {
            try {
                if (f10796O != null && (scheduledFuture = f10796O) != null) {
                    scheduledFuture.cancel(false);
                }
                f10796O = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() {
        if (KN == null) {
            KN = Pl.Uo.rl();
        }
    }

    public static final UUID ty() {
        Pl pl;
        if (KN == null || (pl = KN) == null) {
            return null;
        }
        return pl.nr();
    }

    private CN3() {
    }

    private final int HI() {
        QJ qjJ2 = UGc.J2(s4.az());
        if (qjJ2 == null) {
            return o.n();
        }
        return qjJ2.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aYN() {
        l3D.KN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Activity activity) {
        bZx.I28.mUb(activity);
    }
}
