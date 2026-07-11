package com.safedk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.g;
import com.safedk.android.analytics.brandsafety.i;
import com.safedk.android.analytics.brandsafety.q;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.DeviceData;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.Api;
import com.safedk.android.utils.j;
import com.safedk.android.utils.l;
import com.safedk.android.utils.n;
import d8q.jqQ.QTafcm;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class SafeDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61203a = "com.safedk";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f61205c = "SafeDKMain";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61206d = "SafeDK";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f61207e = "https://config.safedk.com/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61208f = "com.safedk.AppID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f61209g = "com.safedk.ConfigPrefix";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f61210h = "com.safedk.APIPrefix";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f61211i = "com.safedk.DebugMode";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f61212j = "com.safedk.MaximumStatsSetSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f61213k = "com.safedk.AggregationThreshold";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final boolean f61215m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f61216n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f61217o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f61218q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f61222p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Context f61223s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f61224v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private DeviceData f61225w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Map<BrandSafetyUtils.AdType, b> f61226x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private j f61227y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicBoolean f61228z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<String> f61214l = Arrays.asList("com.android.vending", "com.amazon.venezia", "com.sec.android.app.samsungapps");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static SafeDK f61219r = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final d f61220t = new d();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final AtomicBoolean f61221u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final AtomicBoolean f61199A = new AtomicBoolean(false);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final AtomicBoolean f61200B = new AtomicBoolean(false);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static Boolean f61201C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static Boolean f61202D = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ExecutorService f61204b = Executors.newFixedThreadPool(2);

    public static String getSdkKey() {
        return "CP6wULIVzxoRdrEz130IlL7mRDBDktcW4qq0FhFvMkwPOoHmOdaAO3dQpT7kAA4MV8aUK7RLkNmWAzowzoVAtQ";
    }

    public static boolean a() {
        return f61218q;
    }

    public static boolean b() {
        return f61221u.get();
    }

    private SafeDK(Context context) {
        this.f61224v = null;
        this.f61226x = new HashMap();
        this.f61228z = new AtomicBoolean(false);
        Logger.d(f61205c, "SafeDK ctor started");
        this.f61223s = context;
        AppLovinBridge.init(context);
        Logger.d(f61205c, "LifecycleManager initialized : ", com.safedk.android.internal.b.getInstance());
        if (c()) {
            Logger.d(f61205c, "Before reading shared prefs");
            this.f61225w = new DeviceData(context, this.f61227y);
        }
    }

    public boolean c() {
        try {
            synchronized (f61202D) {
                if (!f61202D.booleanValue() && f61199A != null && !f61199A.get()) {
                    Logger.d(f61205c, "loading config from prefs");
                    this.f61227y = new j(this.f61223s.getSharedPreferences("SafeDKToggles", 0), false);
                }
                f61202D = true;
            }
        } catch (IllegalStateException e2) {
            Logger.d(f61205c, "IllegalStateException caught during loading of configuration from prefs, device may be locked", e2);
        } catch (Throwable th) {
            Logger.d(f61205c, "Exception during loading of configuration from prefs : ", th.getMessage(), th);
        }
        return f61202D.booleanValue();
    }

    private void ah() {
        try {
            ApplicationInfo applicationInfo = this.f61223s.getPackageManager().getApplicationInfo(this.f61223s.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                Logger.e(f61205c, "SafeDK meta data is missing from manifest file");
                return;
            }
            a(applicationInfo);
            b(applicationInfo);
            c(applicationInfo);
            d(applicationInfo);
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.d(f61205c, "Couldn't get application's meta data");
        }
    }

    private void a(ApplicationInfo applicationInfo) {
        try {
            try {
                PackageInfo packageInfo = this.f61223s.getPackageManager().getPackageInfo(this.f61223s.getPackageName(), 0);
                Logger.d(f61205c, "package is: ", packageInfo.packageName, ", Installer Package Name is ", this.f61223s.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f61218q = f61214l.contains(this.f61223s.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f61217o = (applicationInfo.flags & 2) != 0;
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendPath("apps").appendPath("cfg").appendPath(extractAppIdentifier(applicationInfo.metaData)).appendPath(String.valueOf(packageInfo.versionCode)).appendQueryParameter("store", String.valueOf(f61218q));
                if (f61218q) {
                    builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("versionName", packageInfo.versionName);
                }
                String string = builderAppendQueryParameter.build().toString();
                String strExtractUrlPrefix = extractUrlPrefix(applicationInfo.metaData);
                if (strExtractUrlPrefix == null || strExtractUrlPrefix.isEmpty()) {
                    Logger.d(f61205c, "no apiURL Value in manifest");
                } else {
                    Logger.d(f61205c, "apiURL Value from manifest is ", strExtractUrlPrefix, ". Setting new edge urls");
                    AppLovinBridge.receiveEdgeUrls(strExtractUrlPrefix, strExtractUrlPrefix);
                }
                f61216n = packageInfo.versionCode;
                String string2 = applicationInfo.metaData.getString(f61209g);
                if (string2 == null) {
                    String str = getDefaultConfig() + string;
                } else {
                    if (!string2.endsWith(File.separator)) {
                        string2 = string2 + File.separator;
                    }
                    if (string.startsWith(File.separator)) {
                        string = string.substring(1);
                    }
                    Logger.d(f61205c, "basePrefix != null, configUrl:", string2 + string);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Logger.d(f61205c, "Bad URL; won't update toggles");
            }
        } catch (Throwable th) {
            Logger.e(f61205c, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    private static String extractAppIdentifier(Bundle metaData) {
        return metaData.getString(f61208f);
    }

    private static String extractUrlPrefix(Bundle metaData) {
        return metaData.getString(f61210h, "https://edge.safedk.com");
    }

    private static String getDefaultConfig() {
        return f61207e;
    }

    public static String getProguardMD5() {
        return "";
    }

    private void b(ApplicationInfo applicationInfo) {
        boolean z2 = false;
        if (f61220t.G() && (applicationInfo.metaData.getBoolean(f61211i, false) || am())) {
            z2 = true;
        }
        Logger.setDebugMode(z2);
    }

    public boolean d() {
        try {
            ApplicationInfo applicationInfo = SafeDKApplication.getAppContext().getPackageManager().getApplicationInfo(this.f61223s.getPackageName(), 128);
            if (f61220t.G()) {
                return applicationInfo.metaData.getBoolean(f61211i, false) || am();
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }

    private void c(ApplicationInfo applicationInfo) {
        f61220t.a(applicationInfo.metaData.getInt(f61212j, 5000));
    }

    private void d(ApplicationInfo applicationInfo) {
        f61220t.b(applicationInfo.metaData.getInt(f61213k, 500));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        if (this.f61227y != null) {
            String string = UUID.randomUUID().toString();
            this.f61224v = string;
            this.f61227y.a(string);
        }
    }

    public static void a(final Context context, final Application application) {
        Logger.d(f61205c, "start started");
        l.a(f61204b, new Runnable() { // from class: com.safedk.android.SafeDK.1
            @Override // java.lang.Runnable
            public void run() {
                if (SafeDK.f61219r == null) {
                    SafeDK unused = SafeDK.f61219r = new SafeDK(context);
                    SafeDK.f61219r.an();
                    SafeDK.f61219r.a(false);
                    SafeDK.f61219r.b(true);
                } else {
                    Logger.d(SafeDK.f61205c, "SafeDK already started");
                }
                SafeDK.a(application);
            }
        });
    }

    public static void a(Application application) {
        if (getInstance() != null && getInstance().p() && Build.VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(com.safedk.android.internal.b.getInstance());
            Logger.d(f61205c, "registerActivityLifecycleCallbacks finished, application = ", application);
        }
    }

    private void aj() {
        try {
            if (!f61200B.get() && this.f61227y != null) {
                String strP = this.f61227y.p();
                Logger.d(f61205c, "setIsFirstSession Current safedk version : ", a.f61234a, " , stored version is ", strP);
                if (strP == null || !a.f61234a.equals(strP)) {
                    Logger.d(f61205c, "setIsFirstSession setting is_first_session to true");
                    this.f61222p = true;
                    this.f61227y.c(a.f61234a);
                }
                f61200B.set(true);
                return;
            }
            Logger.d(f61205c, "setIsFirstSession already executed, value is ", Boolean.valueOf(this.f61222p));
        } catch (Throwable th) {
            Logger.d(f61205c, "setIsFirstSession Exception : ", th.getMessage(), th);
        }
    }

    public boolean e() {
        return this.f61222p;
    }

    public static SafeDK getInstance() {
        return f61219r;
    }

    public int f() {
        return f61220t.a();
    }

    public void a(int i2) {
        f61220t.f63019K = i2;
    }

    public int g() {
        return f61220t.b();
    }

    public int h() {
        return f61220t.c();
    }

    public boolean i() {
        return f61220t.d();
    }

    private void ak() {
        synchronized (this.f61226x) {
            if (!this.f61226x.containsKey(BrandSafetyUtils.AdType.INTERSTITIAL)) {
                this.f61226x.put(BrandSafetyUtils.AdType.INTERSTITIAL, new InterstitialFinder());
            }
            if (!this.f61226x.containsKey(BrandSafetyUtils.AdType.BANNER) && q()) {
                this.f61226x.put(BrandSafetyUtils.AdType.BANNER, new BannerFinder(getInstance().Y()));
                if (Logger.getDebugMode()) {
                    try {
                        Class.forName("com.safedk.android.analytics.brandsafety.shakemenu.ShakeMenuManager");
                    } catch (ClassNotFoundException e2) {
                    } catch (Exception e3) {
                    }
                }
            }
            if (!this.f61226x.containsKey(BrandSafetyUtils.AdType.MREC) && q()) {
                this.f61226x.put(BrandSafetyUtils.AdType.MREC, new q(getInstance().Y()));
            }
            if (!this.f61226x.containsKey(BrandSafetyUtils.AdType.NATIVE)) {
                this.f61226x.put(BrandSafetyUtils.AdType.NATIVE, new NativeFinder(getInstance().Y()));
            }
        }
    }

    public void j() {
        f61199A.set(true);
        CreativeInfoManager.d();
        al();
        aj();
        Logger.d(f61205c, "Loading singletons");
        g.a();
        FileUploadManager.a();
        i.a();
        ak();
        this.f61228z.set(true);
    }

    public void k() {
        if (StatsCollector.b()) {
            synchronized (this.f61226x) {
                for (b bVar : this.f61226x.values()) {
                    if (bVar.d() > 0) {
                        bVar.e();
                    }
                }
            }
        }
    }

    public void a(boolean z2, boolean z3) {
        try {
            if (f61220t.G()) {
                Logger.i("SafeDK", "SafeDK Device ID: ", f61219r.f61224v, ", SafeDK version: ", getVersion(), ", isOnUiThread = ", Boolean.valueOf(n.c()));
            }
            if (f61219r == null) {
                Logger.d(f61205c, "instance is null, existing");
                return;
            }
            f61219r.b(false);
            if (!f61220t.G()) {
                Logger.d(f61205c, "SafeDK is disabled.");
                Logger.setDebugMode(false);
                com.safedk.android.internal.b.getInstance().clearBackgroundForegroundListeners();
                return;
            }
            ah();
            if (am()) {
                Logger.setDebugMode(true);
            }
            Logger.d(f61205c, GDEJgAYrPQHfw.wJLYqhgKMi, Boolean.valueOf(z2), ", isMaxProcess ", Boolean.valueOf(z3), ", isActive ", Boolean.valueOf(f61220t.G()), ", packageId = ", getInstance().m().getPackageName());
            if (f61220t.G() && z3 && !f61199A.get()) {
                f61199A.set(true);
                CreativeInfoManager.d();
                CreativeInfoManager.b();
                al();
                Logger.d(f61205c, "Will attempt to load events from storage");
                if (StatsCollector.c() != null) {
                    StatsCollector.c().d();
                }
                if (!z2) {
                    aj();
                }
                aj();
                Logger.d(f61205c, "Loading singletons");
                g.a();
                FileUploadManager.a();
                i.a();
                ak();
            }
            this.f61228z.set(true);
        } catch (Throwable th) {
            Logger.e(f61205c, "Exception handling configuration event", th);
        }
    }

    private static void al() {
        if (!f61221u.get()) {
            Logger.d(f61205c, "Starting reporter thread");
            StatsCollector.a(true);
            int I2 = f61220t.I();
            int iL = f61220t.L();
            StatsReporter.a();
            StatsCollector.c().a(I2, com.safedk.android.internal.b.getInstance().isInBackground(), iL, StatsReporter.b());
            StatsCollector.a(false);
            StatsCollector.b(getInstance().s());
            f61221u.set(true);
            Logger.d(f61205c, "Reporter thread started");
            return;
        }
        Logger.d(f61205c, "Reporter thread already initialized, skipping");
    }

    public void a(Bundle bundle, boolean z2) {
        Logger.d(f61205c, "Updating configuration");
        boolean zA = f61220t.a(bundle, true);
        if (zA) {
            a(bundle);
        }
        a(zA, z2);
    }

    private void a(Bundle bundle) {
        if (this.f61227y != null) {
            Logger.d(f61205c, "Writing to shared preferences: ", bundle.toString());
            this.f61227y.a(bundle);
        }
    }

    public static int l() {
        return f61216n;
    }

    public Context m() {
        return this.f61223s;
    }

    public boolean n() {
        return f61220t.H() || am();
    }

    public boolean o() {
        return f61217o;
    }

    public boolean p() {
        return f61220t.G();
    }

    public boolean q() {
        return f61220t.w();
    }

    public boolean r() {
        return f61220t.x();
    }

    public boolean s() {
        return !t() && f61220t.G();
    }

    public boolean t() {
        j jVar = this.f61227y;
        if (jVar == null) {
            return true;
        }
        return jVar.b();
    }

    private boolean am() {
        boolean z2 = true;
        try {
            Set<String> setP = f61220t.P();
            if (!setP.contains("*")) {
                if (!setP.contains(this.f61224v)) {
                    z2 = false;
                }
            }
            return z2;
        } catch (Throwable th) {
            Logger.e(f61205c, "Caught exception", th);
            new CrashReporter().caughtException(th);
            return false;
        }
    }

    public static boolean u() {
        return f61220t.K();
    }

    public List<String> v() {
        return f61220t.y();
    }

    public List<String> w() {
        return f61220t.z();
    }

    public DeviceData x() {
        return this.f61225w;
    }

    public Set<b> y() {
        return new HashSet(this.f61226x.values());
    }

    public com.safedk.android.analytics.brandsafety.a a(BrandSafetyUtils.AdType adType) {
        return this.f61226x.get(adType);
    }

    public InterstitialFinder z() {
        return (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
    }

    public BannerFinder A() {
        return (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
    }

    public q B() {
        return (q) a(BrandSafetyUtils.AdType.MREC);
    }

    public NativeFinder C() {
        return (NativeFinder) a(BrandSafetyUtils.AdType.NATIVE);
    }

    public int D() {
        return f61220t.e();
    }

    public int E() {
        return f61220t.f();
    }

    public float F() {
        return f61220t.g();
    }

    public float G() {
        return f61220t.h();
    }

    public float H() {
        return f61220t.i();
    }

    public boolean I() {
        return f61220t.j();
    }

    public int J() {
        return f61220t.k();
    }

    public long K() {
        return f61220t.l();
    }

    public int L() {
        return f61220t.m();
    }

    public int M() {
        return f61220t.n();
    }

    public int N() {
        return f61220t.p();
    }

    public boolean O() {
        return f61220t.q();
    }

    public boolean P() {
        return f61220t.o();
    }

    public boolean Q() {
        return f61220t.S();
    }

    public void a(final boolean z2) {
        try {
            l.a(f61204b, new Runnable() { // from class: com.safedk.android.SafeDK.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Logger.d(SafeDK.f61205c, "Reading configuration from shared preferences, isMaxProcess = ", Boolean.valueOf(z2));
                        if (SafeDK.this.f61227y != null) {
                            SafeDK.this.f61224v = SafeDK.this.f61227y.a();
                            if (SafeDK.this.f61224v == null) {
                                SafeDK.this.ai();
                            }
                            Bundle bundleE = SafeDK.this.f61227y.e();
                            Logger.d(SafeDK.f61205c, "configurationBundle loaded : ", bundleE.toString());
                            if (bundleE == null || bundleE.isEmpty()) {
                                Logger.d(SafeDK.f61205c, "Configuration bundle from storage is empty");
                            } else {
                                Logger.d(SafeDK.f61205c, "Parsing configuration from shared preferences");
                                SafeDK.f61220t.a(bundleE, false);
                            }
                            SafeDK.this.a(false, z2);
                        }
                    } catch (Throwable th) {
                        Logger.e(SafeDK.f61205c, th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f61205c, "Caught exception", th);
            new CrashReporter().caughtException(th);
        }
    }

    public void a(Activity activity) {
        Logger.d(f61205c, "Starting interstitial finder in activity ", activity.getClass().getName());
        synchronized (this.f61226x) {
            for (b bVar : this.f61226x.values()) {
                if (bVar != null) {
                    int i2 = AnonymousClass3.f61233a[bVar.a().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 || i2 == 3) {
                            bVar.b();
                        }
                    } else {
                        ((InterstitialFinder) bVar).c(activity);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.safedk.android.SafeDK$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61233a;

        static {
            int[] iArr = new int[BrandSafetyUtils.AdType.values().length];
            f61233a = iArr;
            try {
                iArr[BrandSafetyUtils.AdType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f61233a[BrandSafetyUtils.AdType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f61233a[BrandSafetyUtils.AdType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f61233a[BrandSafetyUtils.AdType.MREC.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public void b(Activity activity) {
        Logger.d(f61205c, "Stopping interstitial finder in activity ", activity.getClass().getName());
        synchronized (this.f61226x) {
            for (b bVar : this.f61226x.values()) {
                if (bVar != null) {
                    if (bVar.a() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                        ((InterstitialFinder) bVar).e(activity);
                    } else {
                        bVar.c();
                    }
                }
            }
        }
    }

    public void c(Activity activity) {
        Logger.d(f61205c, "Starting redirect monitoring in activity ", activity.getClass().getName());
        BannerFinder bannerFinder = (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
        if (bannerFinder != null) {
            bannerFinder.c(activity);
        }
    }

    public void a(String str) {
        synchronized (this.f61226x) {
            for (b bVar : this.f61226x.values()) {
                if (bVar != null) {
                    bVar.e(str);
                }
            }
        }
    }

    public void d(Activity activity) {
        if (p()) {
            Logger.d(f61205c, "onForegroundActivity ", activity.getClass().getName());
            if (getInstance().c() && this.f61225w == null) {
                Logger.d(f61205c, "Before reading shared prefs");
                this.f61225w = new DeviceData(this.f61223s, this.f61227y);
            }
        }
    }

    public void e(Activity activity) {
        if (p()) {
            Logger.d(f61205c, "onBackgroundActivity ", activity.getClass().getName());
        }
    }

    public String b(String str) {
        JSONObject jSONObject;
        String string = null;
        if (this.f61227y == null) {
            return null;
        }
        String str2 = QTafcm.doSiHo;
        Logger.d(str2, "getSdkVersion getSdkVersion: ", str);
        JSONObject jSONObjectJ = this.f61227y.j();
        if (jSONObjectJ != null) {
            Logger.d(str2, "getSdkVersion sdkVersionsJson=", jSONObjectJ.toString());
        }
        try {
            jSONObject = jSONObjectJ.getJSONObject(str);
        } catch (Throwable th) {
        }
        if (jSONObject == null) {
            Logger.d(str2, "getSdkVersion sdkData is null");
            return null;
        }
        Logger.d(str2, "getSdkVersion sdkData : ", jSONObject.toString());
        string = jSONObject.getString("sdk_version");
        Logger.d(str2, "getSdkVersion version : ", string);
        Logger.d(str2, "return sdk version: ", string);
        return string;
    }

    public JSONObject R() {
        j jVar = this.f61227y;
        if (jVar == null) {
            return null;
        }
        return jVar.j();
    }

    @Api
    public String getUserId() {
        return this.f61224v;
    }

    public static String getVersion() {
        return a.f61234a;
    }

    public static boolean S() {
        return a.f61234a.contains("rc");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2) {
        boolean zS = s();
        Logger.d(f61205c, "notifyMonitorUserActivityUpdate shouldMonitorUser is ", Boolean.valueOf(zS));
        CreativeInfoManager.a(zS);
        com.safedk.android.internal.b.setActiveMode(zS);
        i.a(zS);
        if (z2 && !s()) {
            synchronized (this.f61226x) {
                for (b bVar : this.f61226x.values()) {
                    if (bVar != null) {
                        bVar.a((String) null);
                    }
                }
                this.f61226x.clear();
            }
        }
    }

    public long T() {
        return f61220t.T();
    }

    public int U() {
        return f61220t.U();
    }

    public ArrayList<String> V() {
        return f61220t.V();
    }

    public float W() {
        return f61220t.r();
    }

    public float X() {
        return f61220t.s();
    }

    public int Y() {
        return f61220t.t();
    }

    public int Z() {
        return f61220t.u();
    }

    public int aa() {
        return f61220t.v();
    }

    public static boolean ab() {
        return f61201C.booleanValue();
    }

    public static void ac() {
        Logger.d(f61205c, "setMaxInitialized started");
        f61201C = true;
        if (!b()) {
            al();
        }
    }

    public static boolean ad() {
        d dVar;
        boolean z2 = f61219r != null && (dVar = f61220t) != null && dVar.G() && f61201C.booleanValue();
        if (!z2) {
            d dVar2 = f61220t;
            Logger.d(f61205c, "isSafeDKFullyInitialized returned false , instance = ", f61219r, ",config = ", dVar2, ", config.isActive() = ", Boolean.valueOf(dVar2.G()), ", SafeDK.isMaxInitialized = ", f61201C);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        for (BrandSafetyUtils.AdType adType : BrandSafetyUtils.AdType.values()) {
            c(adType.toString());
        }
        c("Files");
    }

    private void c(String str) {
        File dir = m().getDir("SafeDK_" + str, 0);
        if (dir.exists() && dir.isDirectory()) {
            File file = new File(ae() + str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File[] fileArrListFiles = dir.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    file2.renameTo(new File(file, file2.getName()));
                }
            }
            dir.delete();
        }
    }

    public String ae() {
        return m().getFilesDir() + File.separator + "safedk" + File.separator;
    }
}
