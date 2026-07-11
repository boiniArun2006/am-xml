package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class i implements com.safedk.android.internal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62547a = "ClickUrlsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f62548b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62549c = "https://play.google.com/store/apps/details?id=%s";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static i f62550d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f62551l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static AtomicBoolean f62552m = new AtomicBoolean();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ScheduledExecutorService f62553n = Executors.newScheduledThreadPool(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62554e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62555f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62556g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62557h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicBoolean f62559j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AtomicInteger f62560k = new AtomicInteger(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f62558i = new HashSet();

    private i() {
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
    }

    public static i a() {
        i iVar;
        synchronized (f62551l) {
            if (f62550d == null) {
                f62550d = new i();
            }
            iVar = f62550d;
        }
        return iVar;
    }

    public static void a(boolean z2) {
        synchronized (f62551l) {
            Logger.d(f62547a, "setActiveMode to ", Boolean.valueOf(z2));
            f62550d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, String str3, String str4) {
        if (this.f62554e == null && !this.f62558i.contains(str)) {
            Logger.d(f62547a, "logging url: ", str, ", fingerprint: ", str2, ", sdkUuid: ", str3, ", impressionId: ", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            this.f62554e = str;
            this.f62555f = str2;
            this.f62556g = str3;
            this.f62557h = str4;
            if (TextUtils.isEmpty(str2)) {
                this.f62555f = str;
            }
        }
    }

    public static String a(String str) {
        return String.format(Locale.ENGLISH, f62549c, str);
    }

    public synchronized String b() {
        return this.f62555f;
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        f62552m.set(true);
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        String str;
        String str2;
        String str3;
        String str4;
        Logger.d(f62547a, "onForeground started");
        f62552m.set(false);
        if (this.f62559j.get()) {
            if (this.f62560k.getAndIncrement() <= 2) {
                synchronized (f62550d) {
                    str = null;
                    if (this.f62554e == null) {
                        str2 = null;
                        str3 = null;
                        str4 = null;
                    } else {
                        str = this.f62554e;
                        str2 = this.f62555f;
                        str3 = this.f62556g;
                        str4 = this.f62557h;
                    }
                }
                c(str, str2, str3, str4);
            } else {
                Logger.d(f62547a, "Exhausted", 2, " attempts to resolve URL. Clearing the slot.");
                d();
            }
        }
    }

    private void d() {
        synchronized (f62550d) {
            if (this.f62554e != null) {
                String str = this.f62554e;
                this.f62554e = null;
                this.f62555f = null;
                this.f62558i.add(str);
                this.f62559j.set(false);
                this.f62560k.set(0);
            }
        }
    }

    public void a(final String str, final String str2, final String str3, final String str4) {
        Logger.d(f62547a, "resolve Url started, url = ", str, ", fingerprint = ", str2, ", sdkUuid: ", str3, ", impressionId: ", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str3);
        boolean zA = CreativeInfoManager.a(sdkPackageByPackageUUID, AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        Logger.d(f62547a, "resolve Url setting shouldDecode is ", Boolean.valueOf(zA), " for sdkPackageName ", sdkPackageByPackageUUID);
        final String strZ = zA ? com.safedk.android.utils.n.z(str) : str;
        if (com.safedk.android.utils.n.p(strZ)) {
            a(strZ, com.safedk.android.utils.n.q(strZ), str2, str3, str4, false);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i.f62552m.get()) {
                        i.this.b(strZ, str2, str3, str4);
                        i.this.f62559j.set(true);
                        Logger.d(i.f62547a, "server asked to resolve but currently in background.");
                        return;
                    }
                    i.this.c(str, str2, str3, str4);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, String str4) {
        Logger.d(f62547a, "resolveUrlInternal starting Url resolution. url = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final WebView webView = new WebView(SafeDK.getInstance().m());
        Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2
            @Override // java.lang.Runnable
            public void run() {
                if (atomicBoolean.get()) {
                    Logger.d(i.f62547a, "Url resolved. no timeout.");
                } else {
                    webView.post(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(i.f62547a, "Timeout resolving url");
                            webView.stopLoading();
                        }
                    });
                }
            }
        };
        AtomicLong atomicLong = new AtomicLong(0L);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new AnonymousClass3(str, atomicBoolean, str2, str3, str4));
        atomicLong.set(System.currentTimeMillis());
        webView.loadUrl(str);
        Logger.d(f62547a, "Starting resolution, timeout = ", Integer.valueOf(SafeDK.getInstance().M()));
        f62553n.schedule(runnable, SafeDK.getInstance().M(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: com.safedk.android.analytics.brandsafety.i$3, reason: invalid class name */
    class AnonymousClass3 extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AtomicInteger f62571a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f62573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f62574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f62575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f62576f;

        AnonymousClass3(String str, AtomicBoolean atomicBoolean, String str2, String str3, String str4) {
            this.f62572b = str;
            this.f62573c = atomicBoolean;
            this.f62574d = str2;
            this.f62575e = str3;
            this.f62576f = str4;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, final String url, Bitmap favicon) {
            final int iIncrementAndGet = this.f62571a.incrementAndGet();
            Logger.d(i.f62547a, "onPageStarted started. callbackCounter=", Integer.valueOf(iIncrementAndGet), ", url= ", url);
            if (!url.equals(this.f62572b)) {
                new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass3.this.f62571a.get() == iIncrementAndGet) {
                            Logger.d(i.f62547a, "onPageFinished never called, assuming last onPageStarted is the landing page.Landing page detected: ", url);
                            AnonymousClass3.this.f62573c.set(true);
                            i.this.a(AnonymousClass3.this.f62572b, url, AnonymousClass3.this.f62574d, AnonymousClass3.this.f62575e, AnonymousClass3.this.f62576f, true);
                            return;
                        }
                        Logger.d(i.f62547a, "onPageStarted resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=", Integer.valueOf(AnonymousClass3.this.f62571a.get()), ", callbackCounter=", Integer.valueOf(iIncrementAndGet));
                    }
                }, 60000L);
            }
            super.onPageStarted(view, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, final String url) {
            final int iIncrementAndGet = this.f62571a.incrementAndGet();
            new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass3.this.f62571a.get() == iIncrementAndGet) {
                        Logger.d(i.f62547a, "Landing page detected. is original url same as resolved ? ", Boolean.valueOf(AnonymousClass3.this.f62572b.equals(url)), " , url ", url);
                        AnonymousClass3.this.f62573c.set(true);
                        i.this.a(AnonymousClass3.this.f62572b, url, AnonymousClass3.this.f62574d, AnonymousClass3.this.f62575e, AnonymousClass3.this.f62576f, true);
                        return;
                    }
                    Logger.d(i.f62547a, "onPageFinished resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=", Integer.valueOf(AnonymousClass3.this.f62571a.get()), ", callbackCounter=", Integer.valueOf(iIncrementAndGet));
                }
            }, 5000L);
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            Logger.d(i.f62547a, "onRenderProcessGone for view = ", view.toString());
            this.f62573c.set(true);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, boolean z2) {
        try {
            Logger.d(f62547a, "reportResolvedUrlToServer started. originalUrl=", str, ", resolvedUrl=", str2, ", fingerprint=", str3, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            d();
            if (z2 && com.safedk.android.utils.n.p(str2)) {
                str2 = com.safedk.android.utils.n.q(str2);
            }
            Bundle bundle = new Bundle();
            bundle.putString(FileUploadManager.f61563a, str);
            bundle.putString(FileUploadManager.f61564b, str2);
            bundle.putString(FileUploadManager.f61565c, str3);
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("sdk_uuid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("impression_id", str5);
            }
            bundle.putString("package", SafeDK.getInstance().m().getPackageName());
            g.c(bundle);
        } catch (Throwable th) {
            Logger.d(f62547a, "Failed to report url resolve to server");
            new CrashReporter().caughtException(th);
        }
    }
}
