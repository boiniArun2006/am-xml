package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static SerialExecutor f13606n = new SerialExecutor(new ThreadPerTaskExecutor());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f13609t = -100;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static LocaleListCompat f13602O = null;
    private static LocaleListCompat J2 = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Boolean f13608r = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f13607o = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final ArraySet f13604Z = new ArraySet();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Object f13603S = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f13605g = new Object();

    @RequiresApi
    static class Api33Impl {
        @DoNotInline
        static LocaleList n(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        static void rl(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NightMode {
    }

    static class SerialExecutor implements Executor {
        Runnable J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final Executor f13610O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f13611n = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Queue f13612t = new ArrayDeque();

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f13611n) {
                try {
                    this.f13612t.add(new Runnable() { // from class: androidx.appcompat.app.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppCompatDelegate.SerialExecutor.n(this.f13714n, runnable);
                        }
                    });
                    if (this.J2 == null) {
                        rl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        protected void rl() {
            synchronized (this.f13611n) {
                try {
                    Runnable runnable = (Runnable) this.f13612t.poll();
                    this.J2 = runnable;
                    if (runnable != null) {
                        this.f13610O.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        SerialExecutor(Executor executor) {
            this.f13610O = executor;
        }

        public static /* synthetic */ void n(SerialExecutor serialExecutor, Runnable runnable) {
            serialExecutor.getClass();
            try {
                runnable.run();
            } finally {
                serialExecutor.rl();
            }
        }
    }

    static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }

        ThreadPerTaskExecutor() {
        }
    }

    public int HI() {
        return -100;
    }

    public abstract MenuInflater Ik();

    public void J2(Context context) {
    }

    public abstract void N(View view);

    public abstract void O(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void T(int i2);

    public abstract void ViF();

    public abstract void WPU(Configuration configuration);

    public abstract boolean X(int i2);

    public abstract void XQ();

    public abstract void Z();

    public abstract void aYN(Bundle bundle);

    public abstract ActionMode bzg(ActionMode.Callback callback);

    public abstract void fD();

    public abstract void g();

    public abstract void iF();

    public abstract View mUb(int i2);

    public abstract void nHg(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void nY(Bundle bundle);

    public abstract ActionBar o();

    public Context qie() {
        return null;
    }

    public abstract void rV9(CharSequence charSequence);

    public void s7N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void te(Bundle bundle);

    public abstract ActionBarDrawerToggle.Delegate ty();

    public void v(int i2) {
    }

    public abstract void wTp(Toolbar toolbar);

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static LocaleList n(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static void E2(AppCompatDelegate appCompatDelegate) {
        synchronized (f13603S) {
            e(appCompatDelegate);
        }
    }

    public static AppCompatDelegate KN(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    static boolean S(Context context) {
        if (f13608r == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.n(context).metaData;
                if (bundle != null) {
                    f13608r = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f13608r = Boolean.FALSE;
            }
        }
        return f13608r.booleanValue();
    }

    static void Xw(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (gh().Uo()) {
                    String strRl = AppLocalesStorageHelper.rl(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        Api33Impl.rl(systemService, Api24Impl.n(strRl));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static int az() {
        return f13609t;
    }

    static Object ck() {
        Context contextQie;
        Iterator it = f13604Z.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) it.next()).get();
            if (appCompatDelegate != null && (contextQie = appCompatDelegate.qie()) != null) {
                return contextQie.getSystemService("locale");
            }
        }
        return null;
    }

    private static void e(AppCompatDelegate appCompatDelegate) {
        synchronized (f13603S) {
            try {
                Iterator it = f13604Z.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) it.next()).get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static LocaleListCompat gh() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objCk = ck();
            if (objCk != null) {
                return LocaleListCompat.gh(Api33Impl.n(objCk));
            }
        } else {
            LocaleListCompat localeListCompat = f13602O;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.O();
    }

    static void nr(AppCompatDelegate appCompatDelegate) {
        synchronized (f13603S) {
            e(appCompatDelegate);
            f13604Z.add(new WeakReference(appCompatDelegate));
        }
    }

    static LocaleListCompat r() {
        return f13602O;
    }

    public static AppCompatDelegate xMQ(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    AppCompatDelegate() {
    }

    static void jB(final Context context) {
        if (S(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!f13607o) {
                    f13606n.execute(new Runnable() { // from class: androidx.appcompat.app.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppCompatDelegate.t(context);
                        }
                    });
                    return;
                }
                return;
            }
            synchronized (f13605g) {
                try {
                    LocaleListCompat localeListCompat = f13602O;
                    if (localeListCompat == null) {
                        if (J2 == null) {
                            J2 = LocaleListCompat.t(AppLocalesStorageHelper.rl(context));
                        }
                        if (J2.Uo()) {
                        } else {
                            f13602O = J2;
                        }
                    } else if (!localeListCompat.equals(J2)) {
                        LocaleListCompat localeListCompat2 = f13602O;
                        J2 = localeListCompat2;
                        AppLocalesStorageHelper.n(context, localeListCompat2.xMQ());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void t(Context context) {
        Xw(context);
        f13607o = true;
    }

    public Context Uo(Context context) {
        J2(context);
        return context;
    }
}
