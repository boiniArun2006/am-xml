package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f49493a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f49496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f49497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f49498f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f49494b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f49495c = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f49499g = new AtomicBoolean();

    public static void a(final C1802k c1802k) {
        if (f49495c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.DT
            @Override // java.lang.Runnable
            public final void run() {
                n8.d(c1802k);
            }
        });
    }

    public static String b() {
        return f49498f;
    }

    public static String c() {
        return f49497e;
    }

    public static int d() {
        return f49496d;
    }

    static {
        C1802k c1802k = C1802k.C0;
        if (c1802k != null && ((Boolean) c1802k.a(x4.d4)).booleanValue() && e()) {
            f49493a = (String) a5.a(z4.f50992M, "", C1802k.o());
        } else {
            f49493a = "";
            a5.b(z4.f50992M, (Object) null, C1802k.o());
        }
    }

    public static void b(C1802k c1802k) {
        if (f49499g.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoC = c(c1802k);
        if (packageInfoC != null) {
            f49496d = packageInfoC.versionCode;
            f49497e = packageInfoC.versionName;
            f49498f = packageInfoC.packageName;
        } else {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(C1802k c1802k) {
        PackageManager packageManager = C1802k.o().getPackageManager();
        if (o0.g()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = c1802k.c(x4.o4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(C1802k c1802k) {
        try {
            synchronized (f49494b) {
                try {
                    String defaultUserAgent = WebSettings.getDefaultUserAgent(C1802k.o());
                    if (!TextUtils.isEmpty(defaultUserAgent)) {
                        f49493a = defaultUserAgent;
                        a5.b(z4.f50992M, f49493a, C1802k.o());
                    } else {
                        c1802k.O();
                        if (C1804o.a()) {
                            c1802k.O().b("WebViewDataCollector", "Collected invalid user agent");
                        }
                        c1802k.D().a(d2.b1, "collectedInvalidUserAgent");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            c1802k.D().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    private static boolean e() {
        boolean zIsValidString;
        synchronized (f49494b) {
            zIsValidString = StringUtils.isValidString((String) a5.a(z4.f50992M, "", C1802k.o()));
        }
        return zIsValidString;
    }

    public static String a() {
        String str;
        synchronized (f49494b) {
            str = f49493a;
        }
        return str;
    }
}
