package com.facebook;

import UiE.Dsr;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.Profile;
import com.facebook.appevents.Xo;
import com.facebook.internal.C1869z;
import com.facebook.internal.Lu;
import com.facebook.internal.Pl;
import com.facebook.internal.Z;
import com.facebook.internal.n;
import com.facebook.internal.vd;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class s4 {
    public static boolean Ik;
    public static volatile String J2;
    public static volatile Boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static volatile String f53002O;
    public static volatile String Uo;
    public static boolean aYN;
    public static Context az;
    public static boolean gh;
    public static volatile boolean mUb;
    public static Executor nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f53006o;
    public static com.facebook.internal.afx qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f53007r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s4 f53005n = new s4();
    public static final String rl = s4.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashSet f53008t = SetsKt.hashSetOf(Ew.DEVELOPER_ERRORS);
    public static AtomicLong xMQ = new AtomicLong(65536);
    public static int ty = 64206;
    public static final ReentrantLock HI = new ReentrantLock();
    public static String ck = com.facebook.internal.qf.n();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final AtomicBoolean f53004Z = new AtomicBoolean(false);
    public static volatile String XQ = "instagram.com";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static volatile String f53003S = "facebook.com";
    public static j WPU = new j() { // from class: com.facebook.o
        @Override // com.facebook.s4.j
        public final GraphRequest n(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.n nVar) {
            return s4.iF(accessToken, str, jSONObject, nVar);
        }
    };

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface j {
        GraphRequest n(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.n nVar);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public interface n {
        void onInitialized();
    }

    public static final void mUb() {
        aYN = true;
    }

    public static final synchronized boolean E2() {
        return aYN;
    }

    public static final void M7(boolean z2) {
        if (z2) {
            f53006o = true;
        }
    }

    public static final void N(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f53002O == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (StringsKt.startsWith$default(lowerCase, "fb", false, 2, (Object) null)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        f53002O = strSubstring;
                    } else {
                        f53002O = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (J2 == null) {
                J2 = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (Uo == null) {
                Uo = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (ty == 64206) {
                ty = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (KN == null) {
                KN = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void P5(boolean z2) {
        if (z2) {
            f53007r = true;
        }
    }

    public static final String S() {
        return "fb.gg";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean T(Ew behavior) {
        boolean z2;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        HashSet hashSet = f53008t;
        synchronized (hashSet) {
            if (fD()) {
                z2 = hashSet.contains(behavior);
            }
        }
        return z2;
    }

    public static final void U(boolean z2) {
        if (z2) {
            Ik = true;
        }
    }

    public static final String ViF() {
        return XQ;
    }

    public static final String WPU() {
        String str = rl;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{ck}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        vd.piY(str, str2);
        return ck;
    }

    public static final boolean X() {
        return gh;
    }

    public static final String XQ() {
        return f53003S;
    }

    public static final void Xw(boolean z2) {
        if (z2) {
            Ti.CN3.nr();
        }
    }

    public static final Executor Z() {
        ReentrantLock reentrantLock = HI;
        reentrantLock.lock();
        try {
            if (nr == null) {
                nr = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor = nr;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String aYN() {
        AccessToken accessTokenO = AccessToken.INSTANCE.O();
        return vd.e(accessTokenO != null ? accessTokenO.getGraphDomain() : null);
    }

    public static final File bzg() {
        Context context = az;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    public static final boolean e() {
        return f53004Z.get();
    }

    public static final boolean fD() {
        return mUb;
    }

    public static final GraphRequest iF(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.n nVar) {
        return GraphRequest.ty.g(accessToken, str, jSONObject, nVar);
    }

    public static final void jB(boolean z2) {
        if (z2) {
            com.facebook.appevents.Ln.n();
        }
    }

    public static final boolean nY(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Lu.qie();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final Void p5(n nVar) {
        Wre.J2.O().mUb();
        DAz.nr.n().nr();
        if (AccessToken.INSTANCE.Uo()) {
            Profile.Companion nVar2 = Profile.INSTANCE;
            if (nVar2.rl() == null) {
                nVar2.n();
            }
        }
        if (nVar != null) {
            nVar.onInitialized();
        }
        Xo.j jVar = com.facebook.appevents.Xo.rl;
        jVar.J2(qie(), f53002O);
        M.ty();
        Context applicationContext = qie().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext().applicationContext");
        jVar.Uo(applicationContext).n();
        return null;
    }

    public static final synchronized void rV9(Context applicationContext, final n nVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        AtomicBoolean atomicBoolean = f53004Z;
        if (atomicBoolean.get()) {
            if (nVar != null) {
                nVar.onInitialized();
            }
            return;
        }
        Lu.O(applicationContext, false);
        Lu.J2(applicationContext, false);
        Context applicationContext2 = applicationContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext.applicationContext");
        az = applicationContext2;
        com.facebook.appevents.Xo.rl.t(applicationContext);
        Context context = az;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        N(context);
        String str = f53002O;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = Uo;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (HI()) {
            mUb();
        }
        Context context3 = az;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context3 = null;
        }
        if ((context3 instanceof Application) && M.J2()) {
            Context context4 = az;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context4 = null;
            }
            UiE.CN3.nY((Application) context4, f53002O);
        } else {
            CKP.QJ.xMQ();
        }
        UiE.aC aCVarN = UiE.aC.rl.n();
        if (aCVarN != null) {
            Context context5 = az;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                context5 = null;
            }
            aCVarN.xMQ((Application) context5);
        }
        com.facebook.internal.UGc.KN();
        com.facebook.internal.nKK.aYN();
        n.j jVar = com.facebook.internal.n.rl;
        Context context6 = az;
        if (context6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        } else {
            context2 = context6;
        }
        jVar.n(context2);
        qie = new com.facebook.internal.afx(new Callable() { // from class: com.facebook.qz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s4.bzg();
            }
        });
        com.facebook.internal.Pl.n(Pl.n.Instrument, new Pl.j() { // from class: com.facebook.Pl
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                s4.Xw(z2);
            }
        });
        com.facebook.internal.Pl.n(Pl.n.AppEvents, new Pl.j() { // from class: com.facebook.Xo
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                s4.jB(z2);
            }
        });
        com.facebook.internal.Pl.n(Pl.n.ChromeCustomTabsPrefetching, new Pl.j() { // from class: com.facebook.eO
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                s4.U(z2);
            }
        });
        com.facebook.internal.Pl.n(Pl.n.IgnoreAppSwitchToLoggedOut, new Pl.j() { // from class: com.facebook.z
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                s4.P5(z2);
            }
        });
        com.facebook.internal.Pl.n(Pl.n.BypassAppSwitch, new Pl.j() { // from class: com.facebook.QJ
            @Override // com.facebook.internal.Pl.j
            public final void n(boolean z2) {
                s4.M7(z2);
            }
        });
        Z().execute(new FutureTask(new Callable(nVar) { // from class: com.facebook.l3D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s4.p5(null);
            }
        }));
    }

    public static final void s7N(Context context, final String applicationId) {
        if (VmF.j.nr(s4.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            if (!C1869z.nr("app_events_killswitch", az(), false)) {
                Z().execute(new Runnable() { // from class: com.facebook.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        s4.wTp(applicationContext, applicationId);
                    }
                });
            }
            if (com.facebook.internal.Pl.Uo(Pl.n.OnDeviceEventProcessing) && w1x.w6.nr()) {
                w1x.w6.Uo(applicationId, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            VmF.j.rl(th, s4.class);
        }
    }

    public static final String te() {
        return "18.0.3";
    }

    public static final synchronized void v(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        rV9(applicationContext, null);
    }

    public static final void wTp(Context applicationContext, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        f53005n.nHg(applicationContext, applicationId);
    }

    public static final boolean HI() {
        return M.O();
    }

    public static final int Ik() {
        Lu.qie();
        return ty;
    }

    public static final String az() {
        Lu.qie();
        String str = f53002O;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final boolean ck() {
        return M.J2();
    }

    public static final long g() {
        Lu.qie();
        return xMQ.get();
    }

    public static final boolean gh() {
        return M.nr();
    }

    private final void nHg(Context context, String str) {
        try {
            if (!VmF.j.nr(this)) {
                try {
                    com.facebook.internal.j jVarO = com.facebook.internal.j.J2.O(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String str2 = str + "ping";
                    long j2 = sharedPreferences.getLong(str2, 0L);
                    try {
                        JSONObject jSONObjectN = UiE.Dsr.n(Dsr.j.MOBILE_INSTALL_EVENT, jVarO, com.facebook.appevents.Xo.rl.t(context), nY(context), context);
                        String strQie = com.facebook.appevents.QJ.f52289t.qie();
                        if (strQie != null) {
                            jSONObjectN.put("install_referrer", strQie);
                        }
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str3 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
                        GraphRequest graphRequestN = WPU.n(null, str3, jSONObjectN, null);
                        if (j2 == 0 && graphRequestN.gh().rl() == null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putLong(str2, System.currentTimeMillis());
                            editorEdit.apply();
                            Z.j jVar = com.facebook.internal.Z.f52780O;
                            Ew ew = Ew.APP_EVENTS;
                            String TAG = rl;
                            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                            jVar.rl(ew, TAG, "MOBILE_APP_INSTALL has been logged");
                        }
                    } catch (JSONException e2) {
                        throw new FacebookException("An error occurred while publishing install.", e2);
                    }
                } catch (Exception e3) {
                    vd.z("Facebook-publish", e3);
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final boolean o() {
        return M.Uo();
    }

    public static final Context qie() {
        Lu.qie();
        Context context = az;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            return null;
        }
        return context;
    }

    public static final String r() {
        Lu.qie();
        String str = Uo;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final String ty() {
        Lu.qie();
        return J2;
    }
}
