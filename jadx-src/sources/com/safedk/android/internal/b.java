package com.safedk.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62948a = "LifecycleManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f62949b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f62950c = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f62951h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<WeakReference<Activity>> f62952d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<WeakReference<Activity>> f62953e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f62954f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62955g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<a> f62956i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f62957j = Executors.newScheduledThreadPool(1);

    private b() {
    }

    public ArrayList<WeakReference<Activity>> getAppActivities() {
        return this.f62953e;
    }

    public static synchronized b getInstance() {
        if (f62949b == null) {
            f62949b = new b();
            Logger.d(f62948a, "LifecycleManager created");
        }
        return f62949b;
    }

    public void AddActivity(Activity activity) {
        this.f62952d.add(new WeakReference<>(activity));
        if (!BrandSafetyUtils.d(activity.getClass())) {
            this.f62953e.add(new WeakReference<>(activity));
        }
    }

    public Activity getForegroundActivity() {
        Activity activity;
        Throwable th;
        Activity activity2 = null;
        try {
            if (this.f62952d.size() > 0) {
                try {
                    try {
                        synchronized (this.f62952d) {
                            try {
                                Activity activity3 = (Activity) ((WeakReference) this.f62952d.toArray()[this.f62952d.size() - 1]).get();
                                if (activity3 != null) {
                                    Logger.d(f62948a, "getForegroundActivity Foreground activity is ", activity3);
                                }
                                activity2 = activity3;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Logger.e(f62948a, "Exception in getForegroundActivity : ", th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                        return activity;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                Logger.d(f62948a, "No foreground activity found");
            }
            return activity2;
        } catch (Throwable th5) {
            activity = activity2;
            th = th5;
        }
    }

    public boolean isInBackground() {
        return this.f62955g;
    }

    public synchronized boolean isInterstitialActivity(Context activity) {
        if (this.f62954f == 0) {
            return false;
        }
        return this.f62954f == System.identityHashCode(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (f62951h) {
            Logger.d(f62948a, "onActivityCreated ", activity.toString());
            if (!BrandSafetyUtils.d(activity.getClass())) {
                this.f62953e.add(new WeakReference<>(activity));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (!f62951h) {
                return;
            }
            Logger.d(f62948a, "onActivityStarted ", activity.toString());
            synchronized (this.f62952d) {
                this.f62952d.add(new WeakReference<>(activity));
            }
            if (this.f62952d.size() == 1) {
                c();
            }
        } finally {
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder("{ ");
        synchronized (this.f62952d) {
            Iterator<WeakReference<Activity>> it = this.f62952d.iterator();
            while (it.hasNext()) {
                sb.append(it.next().get());
                sb.append(" ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        boolean z2;
        try {
            if (f62951h) {
                Logger.d(f62948a, "onActivityResumed ", activity.toString(), ", isActive=", Boolean.valueOf(f62951h), ", foregroundActivities=", a());
                if (BrandSafetyUtils.d(activity.getClass())) {
                    this.f62954f = System.identityHashCode(activity);
                    SafeDK.getInstance().a(activity);
                    z2 = true;
                } else {
                    SafeDK.getInstance().d(activity);
                    z2 = false;
                }
                if (!z2 || BrandSafetyUtils.c(activity.getClass())) {
                    SafeDK.getInstance().c(activity);
                } else if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().d(activity) == null) {
                    this.f62957j.schedule(new Runnable() { // from class: com.safedk.android.internal.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().d(activity) == null) {
                                SafeDK.getInstance().c(activity);
                            }
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
                if (BrandSafetyUtils.c(activity.getClass())) {
                    BrandSafetyUtils.b(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(f62948a, "onActivityResumed failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            if (f62951h) {
                Logger.d(f62948a, "onActivityPaused ", activity.toString());
                this.f62957j.execute(new Runnable() { // from class: com.safedk.android.internal.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        PersistentConcurrentHashMap.a();
                    }
                });
                if (BrandSafetyUtils.d(activity.getClass())) {
                    SafeDK.getInstance().b(activity);
                } else {
                    SafeDK.getInstance().e(activity);
                }
                if (BrandSafetyUtils.c(activity.getClass())) {
                    BrandSafetyUtils.c(activity);
                }
            }
        } catch (Throwable th) {
            Logger.e(f62948a, "onActivityPaused failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r5.remove(r1);
        r1.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void removeActivity(Activity activity, Collection<WeakReference<Activity>> collection) {
        Iterator<WeakReference<Activity>> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference<Activity> next = it.next();
            if (next.get() == activity) {
                break;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (f62951h) {
                Logger.d(f62948a, "onActivityStopped ", activity.toString());
                synchronized (this.f62952d) {
                    removeActivity(activity, this.f62952d);
                }
                Logger.d(f62948a, "onActivityStopped foregroundActivities=", a());
                if (this.f62952d.isEmpty()) {
                    b();
                    Logger.d(f62948a, "onActivityStopped, checking for redirect");
                    BrandSafetyUtils.g();
                }
            }
        } catch (Throwable th) {
            Logger.e(f62948a, "onActivityStopped failed", th);
            new CrashReporter().caughtException(th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (f62951h) {
            Logger.d(f62948a, "onActivitySaveInstanceState ", activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (f62951h) {
            Logger.d(f62948a, "onActivityDestroyed ", activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                SafeDK.getInstance().a(activity.toString());
            } else {
                removeActivity(activity, this.f62953e);
            }
        }
    }

    private void a(boolean z2) {
        this.f62955g = z2;
    }

    private void b() {
        Logger.d(f62948a, "Identified background");
        a(true);
        for (a aVar : this.f62956i) {
            Logger.d(f62948a, "notifyBackground to ", aVar.getClass().getCanonicalName());
            aVar.g();
        }
    }

    private void c() {
        Logger.d(f62948a, "Identified foreground");
        a(false);
        Iterator<a> it = this.f62956i.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public synchronized void registerBackgroundForegroundListener(a listener) {
        try {
            if (!f62951h) {
                return;
            }
            if (!this.f62956i.contains(listener) && !a(listener)) {
                Logger.d(f62948a, "Adding ", listener.getClass(), " to listen to BG FG events");
                this.f62956i.add(listener);
                if (isInBackground()) {
                    listener.g();
                } else {
                    listener.h();
                }
            }
        } finally {
        }
    }

    private boolean a(a aVar) {
        Logger.d(f62948a, "listenersContainsType started, listener is ", aVar.getClass());
        ArrayList arrayList = new ArrayList();
        if (this.f62956i != null) {
            Logger.d(f62948a, "listenersContainsType iteration listener is ", aVar.getClass());
            Iterator<a> it = this.f62956i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClass().getCanonicalName());
            }
        }
        return arrayList.contains(aVar.getClass().getCanonicalName());
    }

    public synchronized void clearBackgroundForegroundListeners() {
        Logger.d(f62948a, "Clearing Background Foreground listeners collection");
        this.f62956i = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static void setActiveMode(boolean enable) {
        f62951h = enable;
        Logger.d(f62948a, "setting active mode to ", Boolean.valueOf(enable));
    }
}
