package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DetectTouchUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f61528a = "DetectTouchUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<String, v> f61529b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, v> f61530c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f61531d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f61532e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Timer f61533f = new Timer("RedirectSimulationTimer");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static TimerTask f61534g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ExecutorService f61535h = Executors.newSingleThreadExecutor();

    public static v a(String str) {
        Logger.d(f61528a, "getLastTouchEvent is latestTouchEventBySdkMap contains ", str, "? ", Boolean.valueOf(f61529b.containsKey(str)), ", map = ", f61529b);
        if (f61529b.containsKey(str) && f61529b.get(str) != null) {
            Logger.d(f61528a, "getLastTouchEvent returns ", f61529b.get(str));
            return f61529b.get(str);
        }
        return null;
    }

    public static v a(String str, String str2) {
        return f61530c.get(str + "_" + str2);
    }

    public static void activityOnTouch(String sdkPackageName, MotionEvent me) {
        try {
            if (me.getAction() == 0) {
                Logger.d(f61528a, "activity on touch started, sdk: ", sdkPackageName, ", motion event: ", me, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                if ((0 != me.getEventTime()) && me.getActionMasked() != 2) {
                    a(null, sdkPackageName, null);
                }
            }
        } catch (Throwable th) {
            Logger.d(f61528a, "error in activity on touch", th);
        }
    }

    public static void viewOnTouch(String sdkPackage, View view, MotionEvent me) {
        String str;
        String sdkPackage2 = sdkPackage;
        try {
            if (me.getAction() != 0) {
                return;
            }
            Logger.d(f61528a, "view on touch, started, sdkPackage = ", sdkPackage2, ", View = ", view, ", MotionEvent = ", me);
            if (sdkPackage2.equals(com.safedk.android.utils.h.f63161a) && (view instanceof MaxNativeAdView)) {
                String strB = NativeFinder.b((MaxNativeAdView) view);
                if (strB == null) {
                    strB = BannerFinder.a((MaxNativeAdView) view);
                }
                if (strB != null) {
                    sdkPackage2 = strB;
                    try {
                        Logger.d(f61528a, "view on touch, translate Max native ad view to sdk: ", sdkPackage2, ", view: ", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                    } catch (Throwable th) {
                        th = th;
                        Logger.d(f61528a, "error in view on touch", th);
                        return;
                    }
                } else {
                    Logger.d(f61528a, "view on touch, failed to translate Max native ad view to sdk, view: ", view);
                }
                str = null;
            } else {
                if (view instanceof WebView) {
                    Logger.d(f61528a, "web view on touch, sdk: ", sdkPackage2, ", view: ", view);
                } else if (view instanceof ViewGroup) {
                    Logger.d(f61528a, "view group on touch, sdk: ", sdkPackage2, ", view: ", view);
                } else {
                    if ((CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false) && view.getTag() != null && CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null) != null && view.getTag().equals(CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null))) || (CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null) != null && view.getTag() != null && com.safedk.android.utils.n.b(view.getTag().toString(), CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null)))) {
                        Object[] objArr = new Object[8];
                        objArr[0] = "view on touch, custom view : (";
                        objArr[1] = view.getClass().getName();
                        objArr[2] = ") on touch, sdk: ";
                        objArr[3] = sdkPackage2;
                        objArr[4] = ", view: ";
                        objArr[5] = view;
                        objArr[6] = ", tag : ";
                        objArr[7] = view.getTag() != null ? view.getTag() : "";
                        Logger.d(f61528a, objArr);
                        str = (String) view.getTag();
                        SafeDK.getInstance().z().a(sdkPackage2, view, System.currentTimeMillis());
                    } else {
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = "view on touch, sdk: ";
                        objArr2[1] = sdkPackage2;
                        objArr2[2] = ", view: ";
                        objArr2[3] = view;
                        objArr2[4] = ", tag : ";
                        objArr2[5] = view.getTag() != null ? view.getTag() : "";
                        Logger.d(f61528a, objArr2);
                    }
                }
                str = null;
            }
            a(view != null ? BrandSafetyUtils.a(view) : null, sdkPackage2, str);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(final String str, final String str2, final String str3) {
        if (com.safedk.android.utils.n.c()) {
            f61535h.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.c(str, str2, str3);
                }
            });
        } else {
            c(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, String str3) {
        String str4;
        if (!SafeDK.S() || (!f61532e && ((str4 = f61531d) == null || str == null || !str4.contains(str)))) {
            v vVar = new v(Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(System.currentTimeMillis()), str, str3);
            f61529b.put(str2, vVar);
            Logger.d(f61528a, "Set latest touch event, setting sdk: ", str2, ", details: ", vVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (str != null) {
                String str5 = str2 + "_" + str;
                f61530c.put(str5, vVar);
                Logger.d(f61528a, "Set latest touch event, setting key: ", str5, ", details: ", vVar);
                if (com.safedk.android.utils.h.f63175o.equals(str2)) {
                    BannerFinder.a(vVar);
                    return;
                }
                return;
            }
            return;
        }
        Logger.d(f61528a, "ignore touch event, sdk: ", str2, ", view address: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
    }

    public static void b(final String str) {
        if (com.safedk.android.utils.n.c()) {
            f61535h.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.e(str);
                }
            });
        } else {
            e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        if (SafeDK.S()) {
            TimerTask timerTask = f61534g;
            if (timerTask != null) {
                timerTask.cancel();
            }
            f61531d = str;
            Logger.d(f61528a, "set ignore next touch event: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            long jF = SafeDK.getInstance().f();
            TimerTask timerTask2 = new TimerTask() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    String unused = DetectTouchUtils.f61531d = null;
                    Logger.d(DetectTouchUtils.f61528a, "timeout ignore next touch event");
                }
            };
            f61534g = timerTask2;
            f61533f.schedule(timerTask2, jF);
        }
    }

    public static void a() {
        f61531d = null;
        Logger.d(f61528a, "reset ignore next touch event");
    }

    public static boolean b() {
        boolean z2 = !f61532e;
        f61532e = z2;
        Logger.d(f61528a, "toggle ignore touch events: ", Boolean.valueOf(z2));
        return f61532e;
    }

    public static void viewChangedByExternalLib(ViewGroup viewGroup, View view) {
        try {
            Logger.d(f61528a, "view on view group add view, started, viewGroup = ", viewGroup, ", view = ", view.getClass().getCanonicalName());
            Activity activityA = com.safedk.android.utils.o.a(viewGroup);
            if (activityA != null) {
                Logger.d(f61528a, "view on view group add view, started, activity = ", activityA);
                if (!BrandSafetyUtils.d(activityA.getClass()) || !view.getClass().getCanonicalName().toLowerCase().contains("com.braze.ui.inappmessage")) {
                    Logger.d(f61528a, "view on view group add view, activity = ", activityA, " is not an ad inter activity, skipping");
                } else if (SafeDK.getInstance() != null && SafeDK.getInstance().z() != null) {
                    String strA = BrandSafetyUtils.a((Class) activityA.getClass());
                    Logger.d(f61528a, "view on view group add view, activity = ", activityA, " is an ad inter activity and the newly added view is of an external lib. requestNoSampling will be invoked for sdk ", strA);
                    SafeDK.getInstance().z().a(strA, (String) null, false);
                }
            }
        } catch (Throwable th) {
            Logger.d(f61528a, "error in on view group add view", th);
        }
    }
}
