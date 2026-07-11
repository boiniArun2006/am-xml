package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.config.m0;
import com.fyber.inneractive.sdk.config.p;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.ignite.l;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.o1;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.util.y;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.b1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class InneractiveAdManager implements r {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f53512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c f53513f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Context f53514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53516c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53517d;

    public enum GdprConsentSource {
        Internal,
        External
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void destroy() {
        l lVar;
        IAlog.a("InneractiveAdManager:destroy called", new Object[0]);
        if (d.f53546a.f53514a == null) {
            IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        d.f53546a.f53514a = null;
        IAConfigManager.removeListener(f53512e);
        f53512e = null;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        iAConfigManager.f53300z.f57061a = null;
        iAConfigManager.f53282h = false;
        try {
            com.fyber.inneractive.sdk.config.cellular.a aVar = iAConfigManager.f53274L;
            if (aVar != null && aVar.f53307a != null) {
                aVar.f53309c.clear();
                aVar.f53307a.a((com.fyber.inneractive.sdk.config.cellular.h) aVar);
                aVar.f53307a.a();
            }
        } catch (Throwable th) {
            IAlog.a("failed to destroy network watchdog", th, new Object[0]);
        }
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.f53270H;
        dVar.f56920d.clear();
        dVar.f56922f = null;
        com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager.f53266D;
        if (!TextUtils.isEmpty(hVar.f54022l) && (lVar = hVar.f54026p) != null) {
            lVar.destroy();
            hVar.f54026p = null;
        }
        l0.f57009a.a();
        b0 b0Var = z.f57062a;
        synchronized (b0Var) {
            if (b0Var.f56985c != null) {
                IAlog.a("%sremoving screen state receiver and destroying singleton", IAlog.a(b0Var));
                try {
                    b0Var.f56985c.unregisterReceiver(b0Var.f56986d);
                } catch (Exception unused) {
                }
                b0Var.f56985c = null;
                b0Var.f56986d = null;
                b0Var.f56983a.clear();
            }
        }
        com.fyber.inneractive.sdk.factories.d.f53553a.f53554a.clear();
        com.fyber.inneractive.sdk.factories.b.f53551a.f53552a.clear();
        com.fyber.inneractive.sdk.factories.h.f53555a.f53556a.clear();
        InneractiveAdSpotManager.destroy();
        n.f57013a.clear();
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.f53124h;
        com.fyber.inneractive.sdk.bidder.f fVar = bVar.f53128d;
        if (fVar != null) {
            try {
                o.f57018a.unregisterReceiver(fVar);
            } catch (Exception unused2) {
            }
        }
        bVar.f53128d = null;
        com.fyber.inneractive.sdk.config.cellular.a aVar2 = IAConfigManager.f53260M.f53274L;
        if (aVar2 != null) {
            try {
                aVar2.f53309c.remove(bVar);
            } catch (Throwable th2) {
                IAlog.a("failed to remove network observer", th2, new Object[0]);
            }
        }
        com.fyber.inneractive.sdk.nativead.b.f54217f.a();
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static void setGdprConsent(boolean z2) {
        setGdprConsent(z2, GdprConsentSource.Internal);
    }

    public static void setMediationName(String str) {
        IAConfigManager.f53260M.f53286l = str;
    }

    public static void a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (d.f53546a.f53514a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        w wVar = new w(t.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        if (!TextUtils.isEmpty(str)) {
            wVar.a("message", str);
        }
        wVar.a("init_status", fyberInitStatus.name());
        wVar.a((String) null);
    }

    public static void clearGdprConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar != null) {
            gVar.a();
        } else {
            IAlog.f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.f53260M.f53300z.f57061a = null;
    }

    public static void clearLgpdConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar != null) {
            gVar.b();
        } else {
            IAlog.f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar != null) {
            gVar.c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar == null) {
            IAlog.f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (o.f57018a == null) {
            IAlog.f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.f53342j = Boolean.TRUE;
        }
    }

    public static void currentAudienceIsAChild() {
        d.f53546a.f53516c = true;
    }

    public static String getAppId() {
        return IAConfigManager.f53260M.f53277c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return d.f53546a.f53515b;
    }

    public static Boolean getGdprConsent() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public static GdprConsentSource getGdprStatusSource() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar != null) {
            return gVar.f53338f;
        }
        IAlog.f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.f53260M.f53285k;
    }

    public static String getUserId() {
        return IAConfigManager.f53260M.f53265C.f53339g;
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.f53260M.f53284j;
    }

    public static String getVersion() {
        return "8.4.3";
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        String language;
        List<ResolveInfo> listQueryIntentServices;
        if (context == null || str == null) {
            IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            a(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? "appid" : "context").concat(" is null"));
            return;
        }
        String str2 = IAConfigManager.f53260M.f53277c;
        boolean z2 = (str2 == null || str2.equalsIgnoreCase(str)) ? false : true;
        if (d.f53546a.f53514a != null && !z2) {
            IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.f56976c.retainAll(Collections.singleton(IAlog.f56975b));
        int i2 = k.f53392a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (String str3 : property.split(",")) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str3).newInstance();
                    fMPLogger.initialize(context);
                    IAlog.f56976c.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
        o.f57018a = (Application) context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        boolean z3 = z2;
        IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            IAlog.a("Firing Event 999 for %s", string);
            w wVar = new w(u.IA_UNCAUGHT_EXCEPTION);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_name", string3);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string3);
            }
            try {
                jSONObject.put("description", string2);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "description", string2);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (Exception unused4) {
                IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
            }
            wVar.f54362f.put(jSONObject);
            wVar.a(string4);
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
        if (f53513f == null) {
            f53513f = new c();
        }
        c cVar = f53513f;
        cVar.f53544a = sharedPreferences;
        Thread.setDefaultUncaughtExceptionHandler(cVar);
        b0 b0Var = z.f57062a;
        Context applicationContext = context.getApplicationContext();
        b0Var.getClass();
        IAlog.a("%sinit called", IAlog.a(b0Var));
        b0Var.f56985c = applicationContext;
        b0Var.f56986d = new y(b0Var);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b0Var.f56985c.registerReceiver(b0Var.f56986d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(o.f57018a.getPackageName());
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<BroadcastReceiver> listAsList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new com.fyber.inneractive.sdk.nativead.e());
        for (BroadcastReceiver broadcastReceiver : listAsList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (Throwable unused5) {
                IAlog.f("%sCould not trigger receiver for %s", IAlog.a(com.fyber.inneractive.sdk.a.class), broadcastReceiver);
            }
        }
        if (com.fyber.inneractive.sdk.factories.d.f53553a.f53554a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (listAsList.size() == 0) {
            IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        a aVar = new a(context, onFyberMarketplaceInitializedListener);
        f53512e = aVar;
        IAConfigManager.addListener(aVar);
        if (z3) {
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            iAConfigManager.f53277c = str;
            HashMap map = iAConfigManager.f53275a;
            if (map != null) {
                map.clear();
            }
            HashMap map2 = iAConfigManager.f53276b;
            if (map2 != null) {
                map2.clear();
            }
            iAConfigManager.f53279e = null;
            iAConfigManager.f53278d = "";
            IAConfigManager.a();
        } else {
            Context applicationContext3 = context.getApplicationContext();
            IAConfigManager iAConfigManager2 = IAConfigManager.f53260M;
            if (!iAConfigManager2.f53282h) {
                iAConfigManager2.f53295u = new i(context, applicationContext3);
                s1 s1Var = new s1();
                iAConfigManager2.f53298x = s1Var;
                s1Var.f57035c = applicationContext3.getApplicationContext();
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new o1(s1Var));
                com.fyber.inneractive.sdk.network.l0 l0Var = iAConfigManager2.f53292r;
                if (!l0Var.f54278b) {
                    l0Var.f54278b = true;
                    for (int i3 = 0; i3 < 6; i3++) {
                        l0Var.f54280d.submit(l0Var.f54281e);
                    }
                }
                b1.f57073c.getClass();
                iAConfigManager2.f53265C = new com.fyber.inneractive.sdk.config.g();
                s sVar = new s(applicationContext3);
                iAConfigManager2.f53294t = sVar;
                iAConfigManager2.f53296v = new com.fyber.inneractive.sdk.config.t(sVar);
                iAConfigManager2.f53268F.a((Application) applicationContext3.getApplicationContext());
                iAConfigManager2.f53294t.f53467c.add(new x(iAConfigManager2));
                s sVar2 = iAConfigManager2.f53294t;
                sVar2.getClass();
                IAConfigManager.f53260M.f53292r.a(new v0(new p(sVar2), sVar2.f53465a, sVar2.f53469e));
                iAConfigManager2.f53299y = new com.fyber.inneractive.sdk.config.global.a();
                IAlog.a("Initializing config manager", new Object[0]);
                IAlog.a("Config manager: lib name = %s", "Android");
                IAlog.a("Config manager: app version = %s", "8.4.3");
                com.fyber.inneractive.sdk.config.w wVar2 = com.fyber.inneractive.sdk.config.u.f53482a;
                if (wVar2.f53489a == null) {
                    wVar2.f53489a = applicationContext3;
                    new Thread(new m0(applicationContext3, wVar2)).start();
                }
                if (!str.matches("[0-9]+")) {
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                    IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                    IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                }
                iAConfigManager2.f53280f = applicationContext3;
                iAConfigManager2.f53277c = str;
                iAConfigManager2.f53284j = new InneractiveUserConfig();
                iAConfigManager2.f53282h = true;
                x0 x0Var = iAConfigManager2.f53297w;
                x0Var.getClass();
                com.fyber.inneractive.sdk.config.e eVar = new com.fyber.inneractive.sdk.config.e(x0Var);
                x0Var.f53493b = eVar;
                eVar.a();
                x0Var.f53495d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                com.fyber.inneractive.sdk.cache.session.e eVar2 = new com.fyber.inneractive.sdk.cache.session.e();
                x0Var.f53492a = eVar2;
                com.fyber.inneractive.sdk.cache.session.c cVar2 = new com.fyber.inneractive.sdk.cache.session.c(eVar2);
                ThreadPoolExecutor threadPoolExecutor = com.fyber.inneractive.sdk.util.r.f57025a;
                threadPoolExecutor.execute(cVar2);
                iAConfigManager2.f53263A = new v0(new com.fyber.inneractive.sdk.config.b0(iAConfigManager2), iAConfigManager2.f53280f, new com.fyber.inneractive.sdk.config.f());
                threadPoolExecutor.execute(new d0(iAConfigManager2));
                try {
                    language = Locale.getDefault().getLanguage();
                    try {
                        IAlog.a("Available device language: %s", language);
                    } catch (Exception unused6) {
                    }
                } catch (Exception unused7) {
                    language = null;
                }
                iAConfigManager2.f53289o = language;
                com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager2.f53266D;
                hVar.f54011a = applicationContext3;
                Intent intent2 = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context2 = hVar.f54011a;
                hVar.f54022l = (context2 == null || (listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) == null || listQueryIntentServices.size() <= 0) ? null : listQueryIntentServices.get(0).serviceInfo.packageName;
                com.fyber.inneractive.sdk.config.cellular.a aVar2 = new com.fyber.inneractive.sdk.config.cellular.a(iAConfigManager2.f53280f);
                iAConfigManager2.f53274L = aVar2;
                com.fyber.inneractive.sdk.config.cellular.d dVar = aVar2.f53307a;
                if (dVar != null) {
                    try {
                        dVar.a(aVar2);
                    } catch (Throwable th) {
                        IAlog.a("failed to register network detector", th, new Object[0]);
                    }
                }
            }
        }
        d.f53546a.f53514a = context.getApplicationContext();
        IAConfigManager iAConfigManager3 = IAConfigManager.f53260M;
        iAConfigManager3.f53294t.f53467c.remove(d.f53546a);
        iAConfigManager3.f53294t.f53467c.add(d.f53546a);
    }

    public static boolean isCurrentUserAChild() {
        return d.f53546a.f53516c;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        d.f53546a.f53515b = str;
    }

    public static void setExtraData(String str, String str2) {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = IAConfigManager.f53260M.f53270H;
        dVar.getClass();
        if (!v.a(str)) {
            IAlog.a("%sCould not set extra data, key can't be null or empty", "UserExtraDataManager");
            return;
        }
        if (!v.a(str2)) {
            dVar.f56920d.remove(str.trim());
            IAlog.a("%sCleared extra data successfully for key: %s", "UserExtraDataManager", str);
        } else {
            String strTrim = str.trim();
            String strTrim2 = str2.trim();
            dVar.f56920d.put(strTrim, strTrim2);
            IAlog.a("%sSet extra data successfully for key: %s, value: %s", "UserExtraDataManager", strTrim, strTrim2);
        }
    }

    public static void setGdprConsent(boolean z2, GdprConsentSource gdprConsentSource) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar == null) {
            IAlog.f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f57018a == null) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f53333a = Boolean.valueOf(z2);
        if (!gVar.a(z2, "IAGDPRBool")) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
        gVar.f53338f = gdprConsentSource;
        if (gVar.a("IAGdprSource", gdprConsentSource.name())) {
            return;
        }
        IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setGdprConsentString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar == null) {
            IAlog.f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f57018a == null) {
            IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f53336d = str;
        if (gVar.a("IAGdprConsentData", str)) {
            return;
        }
        IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.f53260M.f53300z.f57061a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z2) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar == null) {
            IAlog.f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f57018a == null) {
            IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f53341i = Boolean.valueOf(z2);
        if (gVar.a(z2, "IALgpdConsentStatus")) {
            return;
        }
        IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setLogLevel(int i2) {
        IAlog.f56974a = i2;
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            iAConfigManager.f53287m = inneractiveMediationName;
            iAConfigManager.f53286l = inneractiveMediationName.getKey();
        }
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.f53260M.f53288n = str;
        }
    }

    public static void setMuteVideo(boolean z2) {
        IAConfigManager.f53260M.f53285k = z2;
    }

    public static void setUSPrivacyString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.f53260M.f53265C;
        if (gVar == null) {
            IAlog.f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f57018a == null) {
            IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f53340h = str;
        if (gVar.a("IACCPAConsentData", str)) {
            return;
        }
        IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
    }

    public static void setUseLocation(boolean z2) {
        IAConfigManager.f53260M.getClass();
    }

    public static void setUserId(String str) {
        if (o.f57018a != null) {
            IAConfigManager.f53260M.f53265C.a(str);
        } else {
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            IAlog.f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.f53260M.f53284j = inneractiveUserConfig;
        IAlog.a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z2) {
        IAConfigManager.f53260M.f53291q = z2;
        IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z2));
        if (com.fyber.inneractive.sdk.util.s.a() || z2) {
            return;
        }
        IAlog.f("************************************************************************************************************************", new Object[0]);
        IAlog.f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.f("***  The traffic will be Secured  ", new Object[0]);
        IAlog.f("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return d.f53546a.f53514a != null;
    }

    public Context getAppContext() {
        return this.f53514a;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public void onGlobalConfigChanged(s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        if (oVar == null || !oVar.a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new b());
    }
}
