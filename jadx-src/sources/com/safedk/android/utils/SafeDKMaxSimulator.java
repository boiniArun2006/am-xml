package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class SafeDKMaxSimulator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63128a = "SafeDKMaxSimulator";

    public static void setRedirectSimulationMode(String targetUrl, String webviewString) {
        Logger.d(f63128a, "set redirect simulation mode, ignore next touch event and intent, targetUrl: ", targetUrl, ", webview: ", webviewString);
        DetectTouchUtils.b(webviewString);
        BrandSafetyUtils.t(targetUrl);
    }

    public static void resetRedirectSimulationMode() {
        Logger.d(f63128a, "reset redirect simulation mode");
        DetectTouchUtils.a();
        BrandSafetyUtils.i();
    }

    public static boolean toggleIgnoreTouchEvents() {
        Logger.d(f63128a, "toggle ignore touch events");
        return DetectTouchUtils.b();
    }
}
