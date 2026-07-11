package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
final class ActivityRecreator {
    protected static final Method J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected static final Method f36209O;
    private static final Handler Uo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final Class f36210n;
    protected static final Method nr;
    protected static final Field rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final Field f36211t;

    private static final class LifecycleCheckCallbacks implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f36218O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f36219n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Activity f36222t;
        private boolean J2 = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f36221r = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f36220o = false;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f36222t == activity) {
                this.f36222t = null;
                this.f36221r = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f36221r || this.f36220o || this.J2 || !ActivityRecreator.KN(this.f36219n, this.f36218O, activity)) {
                return;
            }
            this.f36220o = true;
            this.f36219n = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f36222t == activity) {
                this.J2 = true;
            }
        }

        LifecycleCheckCallbacks(Activity activity) {
            this.f36222t = activity;
            this.f36218O = activity.hashCode();
        }
    }

    protected static boolean KN(Object obj, int i2, Activity activity) {
        try {
            final Object obj2 = f36211t.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                final Object obj3 = rl.get(activity);
                Uo.postAtFrontOfQueue(new Runnable() { // from class: androidx.core.app.ActivityRecreator.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Method method = ActivityRecreator.nr;
                            if (method != null) {
                                method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                            } else {
                                ActivityRecreator.f36209O.invoke(obj3, obj2, Boolean.FALSE);
                            }
                        } catch (RuntimeException e2) {
                            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                                throw e2;
                            }
                        } catch (Throwable th) {
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Method nr(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method t(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Class clsN = n();
        f36210n = clsN;
        rl = rl();
        f36211t = J2();
        nr = nr(clsN);
        f36209O = t(clsN);
        J2 = O(clsN);
    }

    private static Field J2() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean Uo() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    private static Class n() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field rl() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean xMQ(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (Uo() && J2 == null) {
            return false;
        }
        if (f36209O == null && nr == null) {
            return false;
        }
        try {
            final Object obj2 = f36211t.get(activity);
            if (obj2 == null || (obj = rl.get(activity)) == null) {
                return false;
            }
            final Application application = activity.getApplication();
            final LifecycleCheckCallbacks lifecycleCheckCallbacks = new LifecycleCheckCallbacks(activity);
            application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
            Handler handler = Uo;
            handler.post(new Runnable() { // from class: androidx.core.app.ActivityRecreator.1
                @Override // java.lang.Runnable
                public void run() {
                    lifecycleCheckCallbacks.f36219n = obj2;
                }
            });
            try {
                if (Uo()) {
                    Method method = J2;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    }
                });
                return true;
            } catch (Throwable th) {
                Uo.post(new Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    }
                });
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Method O(Class cls) {
        if (Uo() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
