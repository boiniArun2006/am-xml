package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1803m;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class k7 {

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class a extends AbstractC1772b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f48822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f48823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1802k f48824c;

        a(String str, com.applovin.impl.adview.a aVar, C1802k c1802k) {
            this.f48822a = str;
            this.f48823b = aVar;
            this.f48824c = c1802k;
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f48822a, null);
                t2.c(this.f48823b.e(), this.f48823b.g(), this.f48823b.i());
            }
        }

        @Override // com.applovin.impl.AbstractC1772b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                t2.a(this.f48823b.e(), this.f48823b.g(), this.f48823b.i());
                this.f48824c.e().b(this);
            }
        }
    }

    public static boolean a(Uri uri, Context context, C1802k c1802k) {
        return b(uri, null, context, c1802k);
    }

    public static boolean b(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, C1802k c1802k) {
        return a(uri, null, bVar, context, c1802k);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63161a);
        p0.startActivity(p1);
    }

    public static boolean a(Uri uri, String str, com.applovin.impl.sdk.ad.b bVar, Context context, C1802k c1802k) {
        boolean z2 = false;
        String strDefaultIfEmpty = null;
        if (uri == null) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return false;
        }
        try {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            strDefaultIfEmpty = StringUtils.defaultIfEmpty(str, a(intent, uri, bVar, context));
            intent.setPackage(strDefaultIfEmpty);
            c1802k.m0().pauseForClick();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            z2 = true;
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", uri.toString());
            mapHashMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, strDefaultIfEmpty);
            if (bVar != null) {
                mapHashMap.putAll(f2.a((AppLovinAdImpl) bVar));
                mapHashMap.putAll(f2.a(bVar));
            }
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) c1802k.A().N().get("ps_version"), mapHashMap);
            }
            c1802k.D().a("UriUtils", "openUri", th, mapHashMap);
        }
        if (!z2) {
            c1802k.m0().resumeForClick();
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent(z2 ? "com.applovin.external_redirect_success" : "com.applovin.external_redirect_failure"), CollectionUtils.map("url", uri));
        return z2;
    }

    public static void b(Uri uri, final com.applovin.impl.sdk.ad.b bVar, final C1802k c1802k) {
        final String queryParameter = uri.getQueryParameter("url");
        if (!StringUtils.isValidString(queryParameter)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("UriUtils", "Could not find resource URL to preload from query parameters");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), CollectionUtils.map(MRAIDPresenter.ERROR, "Invalid URL"));
            return;
        }
        if (bVar == null) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("UriUtils", "Cannot preload resource: ad is null");
            }
            Map map = CollectionUtils.map(MRAIDPresenter.ERROR, "Invalid ad reference");
            map.put("resource_url", queryParameter);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
            return;
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("UriUtils", "Attempting to preload resource: " + queryParameter);
        }
        c1802k.q0().a((AbstractRunnableC1782i5) new C1797r6(c1802k, false, "preloadResource", new Runnable() { // from class: com.applovin.impl.T
            @Override // java.lang.Runnable
            public final void run() {
                k7.a(c1802k, queryParameter, bVar);
            }
        }), d6.b.CACHING);
    }

    public static void c(Uri uri, com.applovin.impl.sdk.ad.b bVar, C1802k c1802k) {
        String strEmptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter(MRAIDPresenter.ERROR));
        String strEmptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String strEmptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", strEmptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", strEmptyIfNull2, mapHashMap);
        CollectionUtils.putStringIfValid("details", strEmptyIfNull3, mapHashMap);
        if (bVar != null) {
            mapHashMap.putAll(f2.a((AppLovinAdImpl) bVar));
            mapHashMap.putAll(f2.a(bVar));
        }
        c1802k.D().d(d2.Z0, mapHashMap);
    }

    private static String a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (!"market".equals(intent.getScheme()) && !"play.google.com".equals(uri.getHost())) {
            if ("https".equals(intent.getScheme()) && bVar != null) {
                if (bVar.c1()) {
                    String strJ = com.applovin.impl.sdk.l.J();
                    if (a(strJ, context)) {
                        return strJ;
                    }
                }
                for (String str : bVar.N()) {
                    if (a(str, context)) {
                        return str;
                    }
                }
            }
            return null;
        }
        if (Boolean.FALSE.equals(a(context))) {
            return "com.android.vending";
        }
        return null;
    }

    private static boolean a(String str, Context context) {
        return (TextUtils.isEmpty(str) || context.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    public static boolean a(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, C1802k c1802k) {
        com.applovin.impl.adview.b bVarF = aVar.f();
        String queryParameter = uri.getQueryParameter(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j);
        if (TextUtils.isEmpty(queryParameter)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("UriUtils", "Could not find url to load from query in original uri");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return;
        }
        a5 a5VarP0 = c1802k.p0();
        z4 z4Var = z4.f50999T;
        String queryParameter2 = (String) a5VarP0.a(z4Var, null);
        if (uri.getQueryParameterNames().contains("browser")) {
            queryParameter2 = uri.getQueryParameter("browser");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = null;
            }
            if (Boolean.parseBoolean(uri.getQueryParameter("retain_browser"))) {
                c1802k.p0().b(z4Var, queryParameter2);
            }
        }
        String queryParameter3 = uri.getQueryParameter("load_type");
        if (RedirectEvent.f62800h.equalsIgnoreCase(queryParameter3)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            a(queryParameter, queryParameter2, aVar, c1802k);
            return;
        }
        if (RedirectEvent.f62801i.equalsIgnoreCase(queryParameter3)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            AppLovinNetworkBridge.webviewLoadUrl(bVarF, queryParameter);
            String queryParameter4 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter4)) {
                bVarF.setBackgroundColor(Color.parseColor(queryParameter4));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter3)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            c1802k.e().a(new a(queryParameter, aVar, c1802k));
            Intent intent = new Intent(C1802k.o(), (Class<?>) AppLovinWebViewActivity.class);
            intent.putExtra("sdk_key", c1802k.i0());
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(C1802k.o(), intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter3)) {
            aVar.a(aVar.g(), aVar.i(), null, bVarF.getAndClearLastClickEvent());
            if (aVar.h() != null) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
                }
                c1802k.z().a(Uri.parse(queryParameter), aVar, c1802k.u0());
                return;
            }
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
            }
            a(queryParameter, queryParameter2, aVar, c1802k);
            return;
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, C1802k c1802k) {
        String queryParameter = uri.getQueryParameter(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j);
        if (URLUtil.isValidUrl(queryParameter)) {
            c1802k.f0().e(com.applovin.impl.sdk.network.d.b().d(StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1802k c1802k, String str, com.applovin.impl.sdk.ad.b bVar) {
        com.applovin.impl.sdk.ad.b bVar2;
        C1803m c1803mG;
        Context contextO;
        try {
            c1803mG = c1802k.G();
            contextO = C1802k.o();
            bVar2 = bVar;
        } catch (Throwable th) {
            th = th;
            bVar2 = bVar;
        }
        try {
            String strA = c1803mG.a(C1802k.o(), str, bVar.getCachePrefix(), bVar.S(), true, c1803mG.a(str, bVar2), null, f2.a((AppLovinAdImpl) bVar2));
            if (strA != null) {
                String string = Uri.fromFile(c1803mG.a(strA, contextO)).toString();
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("UriUtils", "Successfully cached resource at: " + string);
                }
                Map map = CollectionUtils.map("resource_url", str);
                map.put("cached_url", string);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_success"), map);
                return;
            }
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().k("UriUtils", "Failed to cache resource: " + str);
            }
            Map map2 = CollectionUtils.map(MRAIDPresenter.ERROR, "Failed to cache resource");
            map2.put("resource_url", str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map2);
        } catch (Throwable th2) {
            th = th2;
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("UriUtils", "Exception while caching resource", th);
            }
            Map map3 = CollectionUtils.map("url", str);
            map3.putAll(f2.a((AppLovinAdImpl) bVar2));
            map3.putAll(f2.a(bVar2));
            c1802k.D().a("UriUtils", "handlePreload", th, map3);
            Map map4 = CollectionUtils.map(MRAIDPresenter.ERROR, "Internal error while caching");
            map4.put("resource_url", str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map4);
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, C1802k c1802k) {
        Uri uri2;
        com.applovin.impl.sdk.ad.b bVar2;
        C1802k c1802k2;
        Throwable th;
        j7 j7Var = new j7();
        Context contextA = a(uri.getQueryParameter("context_source"), appLovinAdView, c1802k);
        Intent intent = null;
        try {
            j7Var.f(uri.getQueryParameter("identifier")).d(uri.getQueryParameter(FileUploadManager.f61572j)).a(uri.getQueryParameter("data"), uri.getQueryParameter(HrvQKfmFZJudBc.RRWQqRVRUjMaGKh)).b(uri.getQueryParameter("flags")).e(uri.getQueryParameter("extras")).a(uri.getQueryParameter("categories")).a(uri.getQueryParameter("clip_data_uri"), uri.getQueryParameter("clip_data_mime_type"), uri.getQueryParameter("clip_data_label")).h(uri.getQueryParameter("source_bounds")).b(uri.getQueryParameter("component"), uri.getQueryParameter("class_name"), uri.getQueryParameter("package")).g(uri.getQueryParameter("selector_action"));
            if (!(contextA instanceof Activity)) {
                j7Var.b(String.valueOf(268435456));
            }
            Intent intentC = Boolean.parseBoolean(uri.getQueryParameter("use_chooser")) ? j7Var.c(uri.getQueryParameter("chooser_title")) : j7Var.a();
            try {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("UriUtils", "Attempting to launch intent with configuration:\n" + a(intentC));
                }
                if (intentC.resolveActivity(contextA.getPackageManager()) != null) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(contextA, intentC);
                    c1802k.O();
                    if (C1804o.a()) {
                        c1802k.O().a("UriUtils", "Successfully launched intent");
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_success"), null);
                    c1802k.g().d(d2.a0, a(intentC, uri, bVar));
                    return;
                }
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().b("UriUtils", "No activity found to handle the intent");
                }
                uri2 = uri;
                bVar2 = bVar;
                c1802k2 = c1802k;
                try {
                    a("noActivityToHandleIntent", null, uri2, a(intentC, uri, bVar), bVar2, contextA, c1802k2);
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    intent = intentC;
                    c1802k2.O();
                    if (C1804o.a()) {
                        c1802k2.O().a("UriUtils", "Exception while launching intent", th);
                    }
                    a("intentLaunchException", th, uri2, a(intent, uri2, bVar2), bVar2, contextA, c1802k2);
                }
            } catch (Throwable th3) {
                th = th3;
                uri2 = uri;
                bVar2 = bVar;
                c1802k2 = c1802k;
            }
        } catch (Throwable th4) {
            uri2 = uri;
            bVar2 = bVar;
            c1802k2 = c1802k;
            th = th4;
        }
    }

    private static Context a(String str, AppLovinAdView appLovinAdView, C1802k c1802k) {
        if ("application".equalsIgnoreCase(str)) {
            return C1802k.o();
        }
        if ("activity".equalsIgnoreCase(str)) {
            Activity activityB = e8.b(appLovinAdView, c1802k);
            if (activityB != null) {
                return activityB;
            }
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().k("UriUtils", "Could not retrieve the activity context. Falling back to view context.");
            }
        }
        return appLovinAdView.getContext();
    }

    private static void a(String str, Throwable th, Uri uri, Map map, com.applovin.impl.sdk.ad.b bVar, Context context, C1802k c1802k) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_failure"), null);
        HashMap map2 = new HashMap(map);
        if (th != null) {
            c1802k.D().a("UriUtils", "launchCustomIntent", th, map);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
        }
        CollectionUtils.putStringIfValid("source", str, map2);
        c1802k.g().d(d2.b0, map2);
        a(uri, bVar, context, c1802k);
    }

    private static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, C1802k c1802k) {
        String queryParameter = uri.getQueryParameter("fallback_url");
        if (TextUtils.isEmpty(queryParameter)) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().b("UriUtils", "Could not find fallback URL to open from query parameters");
                return;
            }
            return;
        }
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("UriUtils", "Opening fallback URL: " + queryParameter);
        }
        b(Uri.parse(queryParameter), bVar, context, c1802k);
    }

    private static Map a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar) {
        Map mapA = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), mapA);
        CollectionUtils.putStringIfValid("details", a(intent), mapA);
        return mapA;
    }

    private static String a(Intent intent) {
        if (intent == null) {
            return "Intent not available";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb = new StringBuilder();
        sb.append("Identifier: ");
        sb.append(o0.i() ? intent.getIdentifier() : null);
        sb.append("\nAction: ");
        sb.append(intent.getAction());
        sb.append("\nData: ");
        sb.append(intent.getData());
        sb.append("\nType: ");
        sb.append(intent.getType());
        sb.append("\nFlags: ");
        sb.append(intent.getFlags());
        sb.append("\nExtras: ");
        sb.append(intent.getExtras());
        sb.append("\nCategories: ");
        sb.append(intent.getCategories());
        sb.append("\nClipData: ");
        sb.append(intent.getClipData());
        sb.append("\nSourceBounds: ");
        sb.append(intent.getSourceBounds());
        sb.append("\nComponent: ");
        sb.append(component != null ? component.flattenToString() : intent.getPackage());
        sb.append("\nSelector: ");
        sb.append(intent.getSelector());
        return sb.toString();
    }

    private static void a(String str, String str2, com.applovin.impl.adview.a aVar, C1802k c1802k) {
        a(Uri.parse(str), str2, aVar.g(), aVar.f().getContext(), c1802k);
        t2.b(aVar.e(), aVar.g(), aVar.i());
    }

    public static Boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
