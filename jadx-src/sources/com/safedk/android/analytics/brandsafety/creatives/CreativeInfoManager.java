package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.android.volley.Response;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.exoplayer2.C;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.brandsafety.u;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKSource;
import com.safedk.android.internal.SafeDKSourceMBridge;
import com.safedk.android.internal.SafeDKSourceMintegral;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkDependency;
import com.safedk.android.utils.annotations.SDKDependancy;
import com.safedk.android.utils.n;
import ep.oxM.esLNYym;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class CreativeInfoManager {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f61913A = "ADMOB_BIDDING";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f61914B = "ADMOB_NATIVE_NETWORK";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f61915C = "GOOGLE_AD_MANAGER_DIRECT_SOLD";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f61916D = "MINTEGRAL_NETWORK";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f61917E = "MINTEGRAL_BIDDING";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f61918F = "MINTEGRAL_NATIVE_BIDDING";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f61919G = "FYBER_NETWORK";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f61920H = "FYBER_BIDDING";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String f61921I = "INNERACTIVE_BIDDING";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f61922J = "ADCOLONY_NETWORK";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String f61923K = "ADCOLONY_BIDDING";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String f61924L = "AMAZON_NETWORK";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f61925M = "AMAZON_BIDDING";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f61926N = "AMAZON_MARKETPLACE_NETWORK";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f61927O = "CHARTBOOST_NETWORK";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final String f61928P = "CHARTBOOST_BIDDING";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final String f61929Q = "GOOGLE_AD_MANAGER_NETWORK";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final String f61930R = "GOOGLE_AD_MANAGER_BIDDING";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f61931S = "GOOGLE_AD_MANAGER_NATIVE_NETWORK";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f61932T = "INMOBI_NETWORK";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f61933U = "INMOBI_BIDDING";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final String f61934V = "INMOBI_NATIVE_BIDDING";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String f61935W = "MAIO_NETWORK";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f61936X = "MAIO_BIDDING";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f61937Y = "MYTARGET_NETWORK";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f61938Z = "MYTARGET_BIDDING";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61939a = "mime-type";
    private static final String aA = "MOBILEFUSE_BIDDING";

    /* JADX INFO: renamed from: aB, reason: collision with root package name */
    private static final String f61940aB = "PUBMATIC_BIDDING";
    private static boolean aE = false;
    private static final String aa = "NEND_NETWORK";
    private static final String ab = "NEND_BIDDING";
    private static final String ac = "OGURY_NETWORK";
    private static final String ad = "OGURY_BIDDING";
    private static final String ae = "OGURY_PRESAGE";
    private static final String af = "TIKTOK_NETWORK";
    private static final String ag = "TIKTOK_BIDDING";
    private static final String ah = "TIKTOK_NATIVE_BIDDING";
    private static final String ai = "SMAATO_NETWORK";
    private static final String aj = "SMAATO_BIDDING";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f61943ak = "SNAP_NETWORK";
    private static final String al = "SNAP_BIDDING";
    private static final String am = "TAPJOY_NETWORK";
    private static final String an = "TAPJOY_BIDDING";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f61944ao = "VERIZON_NETWORK";
    private static final String ap = "VERIZON_BIDDING";
    private static final String aq = "YANDEX_NETWORK";
    private static final String ar = "YANDEX_BIDDING";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f61945as = "YANDEX_NATIVE_BIDDING";
    private static final String at = "LINE_NETWORK";
    private static final String au = "LINE_BIDDING";
    private static final String av = "VERVE_NETWORK";

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private static final String f61946aw = "VERVE_BIDDING";
    private static final String ax = "BIDMACHINE_BIDDING";
    private static final String ay = "MOLOCO_BIDDING";
    private static final String az = "MOLOCO_NATIVE_BIDDING";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61947b = "encoding";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61948c = "Content-Type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61950e = "APPLOVIN_NETWORK";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61951f = "APPLOVIN_EXCHANGE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f61952g = "APPLOVIN_DIRECTSOLD";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f61953h = "CUSTOM_NETWORK";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f61954i = "/mediate";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f61956k = "@!1:ad_fetch@!";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f61958m = "CreativeInfoManager";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f61959n = "timestamp";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f61960o = "urls";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f61964s = "IRONSOURCE_NETWORK";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f61965t = "IRONSOURCE_BIDDING";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f61966u = "VUNGLE_NETWORK";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f61967v = "VUNGLE_BIDDING";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f61968w = "VUNGLE_NATIVE_BIDDING";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f61969x = "UNITY_NETWORK";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f61970y = "UNITY_BIDDING";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f61971z = "ADMOB_NETWORK";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List<String> f61961p = new ArrayList();
    private static TreeMap<String, AdNetworkDiscovery> adNetworkDiscoveries = new TreeMap<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map<String, String> f61962q = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final HashSet<String> f61963r = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<String> f61949d = new LinkedHashSetWithItemLimit(10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List<String> f61955j = Arrays.asList("ms.applovin.com", "ms.applvn.com", "ms4.applovin.com", "ms4.applvn.com");

    /* JADX INFO: renamed from: aC, reason: collision with root package name */
    private static final AtomicBoolean f61941aC = new AtomicBoolean(false);

    /* JADX INFO: renamed from: aD, reason: collision with root package name */
    private static final ExecutorService f61942aD = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f61957l = false;

    public static HashSet<String> a() {
        return f61963r;
    }

    public static void a(String str, WebView webView, String str2) {
        AdNetworkDiscovery adNetworkDiscoveryJ = j(str);
        if (adNetworkDiscoveryJ != null && str2 != null && adNetworkDiscoveryJ.a(str2)) {
            String strA = BrandSafetyUtils.a((Object) webView);
            if (adNetworkDiscoveryJ.b(str2)) {
                Logger.d(f61958m, "handle mraid events : video begin for address = ", strA, ", sdk = ", str, ", url = ", str2);
                a(str, strA, false, "mraid-event");
            } else if (adNetworkDiscoveryJ.c(str2)) {
                Logger.d(f61958m, "handle mraid events : video end for address = ", strA, ", sdk = ", str, ", url = ", str2);
                a(str, strA, true, "mraid-event");
            } else if (adNetworkDiscoveryJ.d(str2)) {
                Logger.d(f61958m, Logger.FeatureTag.AD_CAPTURE, "handle mraid events : PP detection for address = ", strA, ", sdk = ", str);
                com.safedk.android.analytics.brandsafety.b.a(strA, l.f62662q, new l.a[0]);
                a(str, strA);
            }
        }
    }

    public static void a(String str, String str2) {
        List<CreativeInfo> listA;
        List<CreativeInfo> listA2;
        if (SafeDK.getInstance() == null) {
            return;
        }
        if (SafeDK.getInstance().z() == null) {
            listA = null;
        } else {
            listA = SafeDK.getInstance().z().a(str, str2);
        }
        if (SafeDK.getInstance().A() == null) {
            listA2 = null;
        } else {
            listA2 = SafeDK.getInstance().A().a(str, str2);
        }
        List<CreativeInfo> listA3 = SafeDK.getInstance().B() != null ? SafeDK.getInstance().B().a(str, str2) : null;
        if (listA != null && !listA.isEmpty()) {
            Logger.d(f61958m, "request no sampling by address, calling interstitial method, : address = ", str2);
            b(str, str2);
            return;
        }
        if (listA2 != null && !listA2.isEmpty()) {
            Logger.d(f61958m, "request no sampling by address, calling banner method, : address = ", str2);
            a(str, BrandSafetyUtils.AdType.BANNER, str2);
        } else if (listA3 != null && !listA3.isEmpty()) {
            Logger.d(f61958m, "request no sampling by address, calling MREC method, : address = ", str2);
            a(str, BrandSafetyUtils.AdType.MREC, str2);
        } else {
            Logger.d(f61958m, "request no sampling by address, WebView not found, : address = ", str2);
        }
    }

    public static void a(String str) {
        List<CreativeInfo> listB;
        List<CreativeInfo> listB2;
        List<CreativeInfo> listB3;
        if (SafeDK.getInstance() == null) {
            return;
        }
        if (SafeDK.getInstance().z() == null) {
            listB = null;
        } else {
            listB = SafeDK.getInstance().z().b(str);
        }
        if (SafeDK.getInstance().A() == null) {
            listB2 = null;
        } else {
            listB2 = SafeDK.getInstance().A().b(str);
        }
        if (SafeDK.getInstance().B() == null) {
            listB3 = null;
        } else {
            listB3 = SafeDK.getInstance().B().b(str);
        }
        if (listB != null && !listB.isEmpty()) {
            Logger.d(f61958m, "request no sampling by sdk , calling interstitial method");
            b(str, (String) null);
            return;
        }
        if (listB2 != null && !listB2.isEmpty()) {
            Logger.d(f61958m, "request no sampling by sdk, calling banner method");
            a(str, BrandSafetyUtils.AdType.BANNER, (String) null);
        } else if (listB3 != null && !listB3.isEmpty()) {
            Logger.d(f61958m, "request no sampling by sdk, calling MREC method");
            a(str, BrandSafetyUtils.AdType.MREC, (String) null);
        } else {
            Logger.d(f61958m, "request no sampling by sdk, View not found, : sdkPackageName = ", str);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.d(f61958m, "handle prefetch started, networkName=", str, ", url=", str2);
        String strC = c(str);
        if (strC == null) {
            return;
        }
        if (!i(str2) && !str2.equals("@!1:ad_fetch@!")) {
            return;
        }
        b bVarK = k(strC);
        if (bVarK != null) {
            if (bVarK.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN)) {
                b(strC, str2, str3, null, map, aVar, null);
                return;
            }
            return;
        }
        Logger.d(f61958m, "handle prefetch sdkPackage does not exist");
    }

    public static void a(String str, String str2, String str3) {
        AdNetworkDiscovery adNetworkDiscoveryJ = j(str);
        if (adNetworkDiscoveryJ != null) {
            Logger.d(f61958m, "onVideoKeyAndUrlPairCreated started, sdkPackageName = ", str, ", localFileCacheKey = ", str2, ", remoteUrl = ", str3);
            adNetworkDiscoveryJ.h(str2, str3);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<String> f62038a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f62039b;

        private a() {
        }
    }

    public static synchronized void b() {
        try {
        } finally {
        }
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            if (!f61941aC.get()) {
                Logger.d(f61958m, "initCreativeInfoManager started");
                c();
                CreativeInfoManagerInitializer.init(adNetworkDiscoveries);
                Logger.d(f61958m, "Number of adNetworkDiscoveries classes is ", Integer.valueOf(adNetworkDiscoveries.size()));
                f61941aC.set(true);
            } else {
                Logger.d(f61958m, "initCreativeInfoManager already executed, skipping");
            }
        }
    }

    private static void init() {
    }

    public static void c() {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        f61963r.add("APPLOVIN_NETWORK");
        f61963r.add("APPLOVIN_EXCHANGE");
        f61963r.add("APPLOVIN_DIRECTSOLD");
        f61963r.add(f61953h);
        f61962q.put("APPLOVIN_NETWORK", com.safedk.android.utils.h.f63161a);
        f61962q.put("APPLOVIN_EXCHANGE", com.safedk.android.utils.h.f63161a);
        f61962q.put("APPLOVIN_DIRECTSOLD", com.safedk.android.utils.h.f63161a);
        f61962q.put(f61964s, com.safedk.android.utils.h.f63166f);
        f61962q.put(f61965t, com.safedk.android.utils.h.f63166f);
        f61962q.put(f61966u, com.safedk.android.utils.h.f63164d);
        f61962q.put(f61967v, com.safedk.android.utils.h.f63164d);
        f61962q.put(f61968w, com.safedk.android.utils.h.f63164d);
        f61962q.put(f61969x, com.safedk.android.utils.h.f63171k);
        f61962q.put(f61970y, com.safedk.android.utils.h.f63171k);
        f61962q.put(f61971z, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61913A, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61914B, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61915C, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61916D, com.safedk.android.utils.h.f63175o);
        f61962q.put(f61917E, com.safedk.android.utils.h.f63175o);
        f61962q.put(f61918F, com.safedk.android.utils.h.f63175o);
        f61962q.put(f61919G, com.safedk.android.utils.h.f63176p);
        f61962q.put(f61920H, com.safedk.android.utils.h.f63176p);
        f61962q.put(f61921I, com.safedk.android.utils.h.f63176p);
        f61962q.put(f61922J, com.safedk.android.utils.h.f63162b);
        f61962q.put(f61923K, com.safedk.android.utils.h.f63162b);
        f61962q.put(f61927O, com.safedk.android.utils.h.f63163c);
        f61962q.put(f61928P, com.safedk.android.utils.h.f63163c);
        f61962q.put(f61929Q, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61930R, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61931S, com.safedk.android.utils.h.f63168h);
        f61962q.put(f61932T, com.safedk.android.utils.h.f63169i);
        f61962q.put(f61933U, com.safedk.android.utils.h.f63169i);
        f61962q.put(f61934V, com.safedk.android.utils.h.f63169i);
        f61962q.put(f61935W, com.safedk.android.utils.h.f63177q);
        f61962q.put(f61936X, com.safedk.android.utils.h.f63177q);
        f61962q.put(f61937Y, com.safedk.android.utils.h.f63178r);
        f61962q.put(f61938Z, com.safedk.android.utils.h.f63178r);
        f61962q.put(aa, com.safedk.android.utils.h.f63179s);
        f61962q.put(ab, com.safedk.android.utils.h.f63179s);
        f61962q.put(ac, com.safedk.android.utils.h.f63180t);
        f61962q.put(ad, com.safedk.android.utils.h.f63180t);
        f61962q.put(ae, com.safedk.android.utils.h.f63180t);
        f61962q.put(af, com.safedk.android.utils.h.f63181u);
        f61962q.put(ag, com.safedk.android.utils.h.f63181u);
        f61962q.put(ah, com.safedk.android.utils.h.f63181u);
        f61962q.put(ai, com.safedk.android.utils.h.f63182v);
        f61962q.put(aj, com.safedk.android.utils.h.f63182v);
        f61962q.put(f61943ak, com.safedk.android.utils.h.f63183w);
        f61962q.put(al, com.safedk.android.utils.h.f63183w);
        f61962q.put(am, com.safedk.android.utils.h.f63170j);
        f61962q.put(an, com.safedk.android.utils.h.f63170j);
        f61962q.put(f61944ao, com.safedk.android.utils.h.f63184x);
        f61962q.put(ap, com.safedk.android.utils.h.f63184x);
        f61962q.put(aq, com.safedk.android.utils.h.f63185y);
        f61962q.put(ar, com.safedk.android.utils.h.f63185y);
        f61962q.put(f61945as, com.safedk.android.utils.h.f63185y);
        f61962q.put(at, com.safedk.android.utils.h.f63186z);
        f61962q.put(au, com.safedk.android.utils.h.f63186z);
        f61962q.put(f61924L, com.safedk.android.utils.h.f63155A);
        f61962q.put(f61925M, com.safedk.android.utils.h.f63155A);
        f61962q.put(f61926N, com.safedk.android.utils.h.f63155A);
        f61962q.put(av, com.safedk.android.utils.h.f63157C);
        f61962q.put(f61946aw, com.safedk.android.utils.h.f63157C);
        f61962q.put(ax, com.safedk.android.utils.h.f63156B);
        f61962q.put(ay, com.safedk.android.utils.h.f63158D);
        f61962q.put(az, com.safedk.android.utils.h.f63158D);
        f61962q.put(aA, com.safedk.android.utils.h.f63159E);
        f61962q.put(f61940aB, com.safedk.android.utils.h.f63160F);
    }

    public static AdNetworkDiscovery.WebViewResourceMatchingMethod b(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery.b();
    }

    public static String c(String str) {
        String str2 = f61962q.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return null;
    }

    public static void a(boolean z2) {
        aE = z2;
        Logger.d(f61958m, "setting active mode to ", Boolean.valueOf(z2));
    }

    private static WebResourceResponse a(String str, WebView webView, String str2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Logger.d(f61958m, "on webView response helper - sdk= ", str, ",   webview=", webView, ",   url= ", str2, ",   webResourceRequest= ", webResourceRequest, ",    response= ", webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21 && TextUtils.isEmpty(str2) && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            str2 = webResourceRequest.getUrl().toString();
            Logger.d(f61958m, "on webView response helper - url updated to= ", str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            Logger.d(f61958m, "on webView response helper - calling follow webview response if needed, sdk= ", str, ",   url= ", str2);
            webResourceResponse = a(str, webView, str2, webResourceResponse);
        }
        if (webResourceRequest != null) {
            a(str, webView, webResourceRequest, str2);
        }
        AdNetworkDiscovery adNetworkDiscoveryJ = j(str);
        if (adNetworkDiscoveryJ != null) {
            adNetworkDiscoveryJ.b(webView, str2);
        }
        return webResourceResponse;
    }

    public static WebResourceResponse onWebViewResponse(String sdkPackageName, WebView webView, String url, WebResourceResponse response) {
        Logger.d(f61958m, "on webView response ", sdkPackageName, ", webview ", webView, ", url ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        if (!aE || !f61941aC.get()) {
            return response;
        }
        return a(sdkPackageName, webView, url, (WebResourceRequest) null, response);
    }

    public static WebResourceResponse onWebViewResponseWithHeaders(String sdkPackageName, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse response) {
        Logger.d(f61958m, "on webView response with headers ", sdkPackageName, ", webview ", webView, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        if (!aE || !f61941aC.get()) {
            return response;
        }
        return a(sdkPackageName, webView, (String) null, webResourceRequest, response);
    }

    public static void a(String str, WebView webView, WebResourceRequest webResourceRequest, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Logger.d(f61958m, "on webView response with headers impl - ", str, ", webview ", webView, esLNYym.PnrRPiqvc, str2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (webResourceRequest != null && webResourceRequest.getRequestHeaders() != null) {
                    if (!webResourceRequest.getRequestHeaders().isEmpty() && webResourceRequest.getRequestHeaders().containsKey(n.f63222c)) {
                        a(str, webView, str2, webResourceRequest.getRequestHeaders());
                        if (adNetworkDiscovery != null) {
                            AdNetworkDiscovery.WebViewResourceMatchingMethod webViewResourceMatchingMethodB = adNetworkDiscovery.b();
                            boolean zA = a(str, AdNetworkConfiguration.SHOULD_CALL_RESOURCE_LOADED_FROM_SHOULD_INTERCEPT_REQUEST, false);
                            if (webViewResourceMatchingMethodB == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO || zA) {
                                adNetworkDiscovery.a(str2, str2, webView);
                            }
                        }
                        if (adNetworkDiscovery != null && adNetworkDiscovery.d().b(AdNetworkConfiguration.SHOULD_SET_CI_AS_VIDEO_AD_ON_VIDEO_RESOURCE_LOAD)) {
                            String str3 = webResourceRequest.getRequestHeaders().get(n.f63222c);
                            if (n.s(str2) || (str3 != null && str3.contains("video"))) {
                                Logger.d(f61958m, "on webView response with headers impl - set active ad as video ad");
                                f(str, BrandSafetyUtils.a((Object) webView));
                            }
                        }
                    }
                } else {
                    Logger.d(f61958m, "on webView response with headers impl - web resource request is null");
                }
                return;
            }
            Logger.d(f61958m, "on webView response with headers impl - Android SDK version too low.");
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(f61958m, "on webView response with headers impl - exception: ", th);
            } catch (Throwable th2) {
            }
        }
    }

    private static void a(WebResourceResponse webResourceResponse, Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                map2.put(str, list.get(0));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(map2);
        }
    }

    private static WebResourceResponse a(String str, String str2, WebResourceResponse webResourceResponse, Bundle bundle) {
        WebResourceResponse webResourceResponse2;
        WebResourceResponse webResourceResponse3 = webResourceResponse;
        try {
            Logger.d(f61958m, "Wrapping input stream started, sdkPackageName = ", str, ", url = ", str2);
            if (webResourceResponse3 == null) {
                URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
                webResourceResponse2 = new WebResourceResponse(bundle.getString(f61939a, "text/javascript"), bundle.getString(f61947b, C.UTF8_NAME), new com.safedk.android.internal.f(str, str2, uRLConnectionOpenConnection.getInputStream(), null, false));
                try {
                    a(webResourceResponse2, uRLConnectionOpenConnection.getHeaderFields());
                } catch (IOException e2) {
                    e = e2;
                    webResourceResponse3 = webResourceResponse2;
                    Logger.e(f61958m, "Error wrapping input stream for URL: ", str2, e);
                    return webResourceResponse3;
                }
            } else {
                if (!(webResourceResponse.getData() instanceof com.safedk.android.internal.f)) {
                    webResourceResponse3.setData(new com.safedk.android.internal.f(str, str2, webResourceResponse.getData(), null, false));
                }
                webResourceResponse2 = webResourceResponse3;
            }
            Logger.d(f61958m, "Wrapping input stream in response: ", webResourceResponse2, ", MIME type: ", webResourceResponse2.getMimeType(), ", Encoding: ", webResourceResponse2.getEncoding());
            return webResourceResponse2;
        } catch (IOException e3) {
            e = e3;
        }
    }

    private static WebResourceResponse a(String str, WebView webView, String str2, WebResourceResponse webResourceResponse) {
        Logger.d(f61958m, "follow WebView response if needed started, sdkPackageName = ", str, ", webView = ", webView, ", URL = ", str2);
        try {
        } catch (Throwable th) {
            Logger.d(f61958m, "following webView response failed: ", th.getMessage(), th);
        }
        if (aE && f61941aC.get()) {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            Bundle bundle = new Bundle();
            if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle)) {
                Logger.d(f61958m, "follow webview response if needed for ", str, ", url ", str2);
                webResourceResponse = a(str, str2, webResourceResponse, bundle);
            }
            return webResourceResponse;
        }
        Logger.d(f61958m, "follow WebView response if needed SafeDK not initialized");
        return webResourceResponse;
    }

    public static InputStream a(String str, String str2, InputStream inputStream, Map<String, List<String>> map) {
        try {
            Logger.d(f61958m, "followInputStreamIfNeeded started for url ", str2);
            if (aE && f61941aC.get()) {
                if (a(str, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                    onResourceLoaded(str, null, str2);
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Bundle bundle = new Bundle();
                if (map.containsKey("Content-Type")) {
                    bundle.putStringArrayList("Content-Type", new ArrayList<>(map.get("Content-Type")));
                }
                boolean z2 = adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle);
                if (z2) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "should follow input stream? ";
                    objArr[1] = adNetworkDiscovery != null ? Boolean.valueOf(z2) : V8ValueNull.NULL;
                    Logger.d(f61958m, objArr);
                }
                if (adNetworkDiscovery != null && z2) {
                    boolean zI = adNetworkDiscovery.i(str2);
                    boolean zA = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
                    boolean zA2 = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
                    Logger.d(f61958m, "following input stream for url ", str2, ", enforce close value for sdk ", str, " is ", Boolean.valueOf(zA2), ", enforce close VIV value for sdk = ", Boolean.valueOf(zA));
                    return new com.safedk.android.internal.f(str, str2, inputStream, map, zA2 || (zA && zI));
                }
                return inputStream;
            }
            Logger.d(f61958m, "should follow input stream SafeDK not initialized");
            return inputStream;
        } catch (Throwable th) {
            try {
                Logger.e(f61958m, "Exception following input stream : ", th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return inputStream;
        }
    }

    @SDKDependancy(packageName = "okio")
    public static BufferedSource a(String str, String str2, BufferedSource bufferedSource, int i2) {
        try {
            if (aE && f61941aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(f61958m, "following source stream for url ", str2);
                    return SafeDKSource.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(f61958m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    @AdNetworkDependency(className = "com.mintegral.msdk.thrid.okio.BufferedSource")
    public static com.mintegral.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mintegral.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (aE && f61941aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(f61958m, "following source stream for url ", str2);
                    return SafeDKSourceMintegral.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(f61958m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    @AdNetworkDependency(className = "com.mbridge.msdk.thrid.okio.BufferedSource")
    public static com.mbridge.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mbridge.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (aE && f61941aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(f61958m, "following source stream for url ", str2);
                    return SafeDKSourceMBridge.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(f61958m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    public static OutputStream a(String str, String str2, OutputStream outputStream) {
        try {
            if (aE && f61941aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.g(str2)) {
                    Logger.d(f61958m, "following output stream for url ", str2);
                    return new com.safedk.android.internal.g(str, str2, outputStream);
                }
                return outputStream;
            }
            Logger.d(f61958m, "following output stream SafeDK not initialized");
            return outputStream;
        } catch (Throwable th) {
            try {
                Logger.e(f61958m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return outputStream;
        }
    }

    public static FileOutputStream a(String str, String str2, FileOutputStream fileOutputStream) {
        try {
            if (aE && f61941aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.g(str2)) {
                    Logger.d(f61958m, "follow output file stream if needed sdk = ", str, ", path = ", str2, ", stream ", fileOutputStream);
                    return new com.safedk.android.internal.e(str, str2, fileOutputStream);
                }
                return fileOutputStream;
            }
            Logger.d(f61958m, "following output stream for file SafeDK not initialized");
            return fileOutputStream;
        } catch (Throwable th) {
            try {
                Logger.e(f61958m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return fileOutputStream;
        }
    }

    public static boolean d(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return false;
        }
        return adNetworkDiscovery.a();
    }

    public static void viewOnMeasure(String sdkPackageName, View view, int width, int height) {
        AdNetworkDiscovery adNetworkDiscoveryJ = j(sdkPackageName);
        if (adNetworkDiscoveryJ != null) {
            adNetworkDiscoveryJ.a(view, width, height);
        }
    }

    public static void onResourceLoaded(final String sdkPackageName, final WebView webView, final String resource) {
        try {
            if ((!aE || !f61941aC.get()) && !f61957l) {
                return;
            }
            if (f61957l) {
                c(sdkPackageName, webView, resource);
            } else {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.c(sdkPackageName, webView, resource);
                    }
                });
            }
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            Logger.e(f61958m, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, WebView webView, String str2) {
        String strA;
        try {
            if (f61957l || (aE && f61941aC.get())) {
                String strZ = n.z(str2);
                if (webView == null) {
                    strA = null;
                } else {
                    strA = BrandSafetyUtils.a((Object) webView);
                    com.safedk.android.analytics.brandsafety.creatives.discoveries.l.a(str, strA, str2);
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(strZ, strA)) {
                    adNetworkDiscovery.a(strZ, strZ, webView);
                }
                a(str, webView, strZ, (Map<String, String>) null);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(f61958m, "resource loaded failed", th);
        }
    }

    private static void f(String str, String str2) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.d(f61958m, "set active ad in ad finder as video ad started, sdkPackageName = ", str, ", webViewAddress = ", str2);
        for (com.safedk.android.analytics.brandsafety.b bVar : SafeDK.getInstance().y()) {
            if (bVar != null) {
                List<CreativeInfo> listA = bVar.a(str, str2);
                if (listA != null && listA.size() > 0) {
                    for (CreativeInfo creativeInfo : listA) {
                        Logger.d(f61958m, "set active ad in ad finder as video ad, ci: ", creativeInfo.ac());
                        creativeInfo.f(true);
                    }
                } else {
                    Logger.d(f61958m, "set active ad in ad finder as video ad, ci list is null or empty. sdkPackageName = ", str, ", webViewAddress = ", str2);
                }
            }
        }
    }

    public static void onMaxAdViewCreated(MaxAdView maxAdView, MaxAdFormat adFormat, String adUnitId) {
        Logger.d(f61958m, "Max ad view created: ", maxAdView, " ad format: ", adFormat, " ad unit id: ", adUnitId);
        if (maxAdView != null && adFormat != null) {
            if (adFormat == MaxAdFormat.BANNER || adFormat == MaxAdFormat.LEADER || adFormat == MaxAdFormat.MREC) {
                BannerFinder.a(adUnitId, maxAdView, adFormat == MaxAdFormat.MREC ? BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.BANNER);
            }
        }
    }

    public static void a(MaxAdView maxAdView) {
        if (maxAdView != null) {
            String strE = n.e(com.safedk.android.utils.g.a("adUnitId='(.*?)'", 2), maxAdView.toString());
            if (strE != null) {
                Logger.d(f61958m, "Max ad view destroyed: ", maxAdView, " ad unit id: ", strE, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BannerFinder.a(strE, maxAdView);
            } else {
                Logger.d(f61958m, "Max ad view destroyed: ", maxAdView);
                BannerFinder.a(maxAdView);
            }
        }
    }

    public static void onMaxNativeAdLoaded(final MaxNativeAdView maxAdView, final MaxAd ad2) {
        if (n.c()) {
            f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.12
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.b(maxAdView, ad2);
                }
            });
        } else {
            b(maxAdView, ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (aE && f61941aC.get() && maxAd != null) {
            String adUnitId = maxAd.getAdUnitId();
            Bundle bundleA = com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a(maxAd);
            if (bundleA != null) {
                String string = bundleA.getString("eventId");
                String string2 = bundleA.getString("sdk");
                String string3 = bundleA.getString("bidResponse");
                Logger.d(f61958m, "Max native ad loaded: ", maxNativeAdView, " ad unit id: ", adUnitId, ", network: ", maxAd.getNetworkName(), ", isOnUiThread = ", Boolean.valueOf(n.c()));
                NativeFinder nativeFinderC = SafeDK.getInstance().C();
                if (nativeFinderC != null && maxNativeAdView != null) {
                    nativeFinderC.a(string, string2, maxNativeAdView);
                }
                b(string2, string3, maxNativeAdView);
            }
        }
    }

    public static void onMaxNativeAdCreated(MaxNativeAdView maxAdView) {
        NativeFinder nativeFinderC;
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.d(f61958m, "Max native ad created: ", maxAdView);
        if (maxAdView != null && (nativeFinderC = SafeDK.getInstance().C()) != null) {
            nativeFinderC.a(maxAdView);
        }
    }

    private static void a(String str, WebView webView, String str2, Map<String, String> map) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && f61941aC.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null) {
            Logger.d(f61958m, "handle resource attachment if necessary started sdk=", str, ", webview= ", webView, ", resource=", str2, ", headers=", map, ", matching method for ", str, " is ", adNetworkDiscovery.b().name());
            if (adNetworkDiscovery.p(str2)) {
                Logger.d(f61958m, "handle resource attachment if necessary. should stop collecting resources.  sdk=", str, ", webview= ", webView, ", resource=", str2);
                SafeDK.getInstance().z().s(str);
            } else if (webView != null) {
                g.a(str, webView, str2, map);
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map) {
        a(str, str2, str3, null, map, null);
    }

    public static void a(final String str, final String str2, final String str3, final byte[] bArr, final Map<String, List<String>> map, final String str4) {
        try {
            if ((!aE || !f61941aC.get()) && !f61957l) {
                return;
            }
            Logger.d(f61958m, "ad fetched package: ", str, " url: ", str2, " , content size=", Integer.valueOf(str3.length()));
            if (a(str, AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false)) {
                h.a(str3, e(str), str);
            }
            if (f61957l) {
                Logger.d(f61958m, "ad fetched executor service started ", str, " url: ", str2);
                b(str, str2, str3, bArr, map, null, str4);
            } else {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.16
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.b(str, str2, str3, bArr, map, null, str4);
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static String[] e(String str) {
        String strA = a(str, AdNetworkConfiguration.VAST_URL_QUERY_PARAMS_TO_IGNORE, (String) null);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA.split(",");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, String str3, byte[] bArr, Map<String, List<String>> map, c.a aVar, String str4) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                Logger.d(f61958m, "ad fetched Impl sdk: ", str, " url: ", str2, " , content size=", Integer.valueOf(str3.length()));
                long jNanoTime = System.nanoTime();
                List<CreativeInfo> listA = adNetworkDiscovery.a(str2, str3, bArr, map, aVar);
                int size = listA != null ? listA.size() : 0;
                if (size > 0) {
                    Logger.d(f61958m, "ad network discovery generate info sdk ", str, " took ", Long.valueOf((System.nanoTime() - jNanoTime) / 1000000), " ms, number of CIs: ", Integer.valueOf(size));
                    for (CreativeInfo creativeInfo : listA) {
                        if (creativeInfo.L()) {
                            Logger.d(f61958m, "ci is empty");
                        } else if (str4 != null) {
                            creativeInfo.u("isci=(" + str4 + ")");
                        }
                    }
                }
                return;
            }
            Logger.d(f61958m, "no discovery object found for SDK ", str);
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(f61958m, "Exception in ad fetch: ", th.getMessage(), th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final WebView webView, final String str3) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str3);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.a(webView);
            }
            if (aE && f61941aC.get()) {
                if (str2 == null) {
                    Logger.d(f61958m, "data loaded to webView is null for package: ", str3, " and webview: ", webView);
                    return;
                } else {
                    Logger.d(f61958m, "data loaded to webView ", webView, ", package: ", str3, ", baseUrl: ", str);
                    f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.17
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                AdNetworkDiscovery adNetworkDiscovery2 = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str3);
                                if (adNetworkDiscovery2 != null) {
                                    adNetworkDiscovery2.b(str, str2, webView);
                                }
                            } catch (Throwable th) {
                                new CrashReporter().caughtException(th);
                                Logger.d(CreativeInfoManager.f61958m, "Exception in data loaded to webView : ", th);
                            }
                        }
                    });
                    return;
                }
            }
            Logger.d(f61958m, "data loaded to webView SafeDK not initialized for package: ", str3, " and webview: ", webView);
        } catch (Throwable th) {
            try {
                Logger.d(f61958m, "Exception in data loaded to webView : ", th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final String str2, final String str3) {
        try {
            if (aE && f61941aC.get()) {
                Logger.d(f61958m, "File output stream completed ", str, " , ", str2);
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.18
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f61958m, "no discovery object for SDK ", str);
                            } else if (adNetworkDiscovery.d().b(AdNetworkConfiguration.FILE_WRITE_AS_NETWORK_READ)) {
                                CreativeInfoManager.b(str, str2, str3, null, null, null, null);
                            } else {
                                adNetworkDiscovery.d(str2, str3);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.f61958m, th.getMessage(), th);
                        }
                    }
                });
                return;
            }
            Logger.d(f61958m, "File output stream completed SafeDK not initialized");
        } catch (Throwable th) {
            try {
                Logger.e(f61958m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void c(final String str, final String str2, final String str3) {
        try {
            if (aE && f61941aC.get()) {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.19
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f61958m, "no discovery object for SDK ", str);
                                return;
                            }
                            String strE = adNetworkDiscovery.e(str2, str3);
                            if (strE != null) {
                                for (CreativeInfo creativeInfo : adNetworkDiscovery.s(strE)) {
                                    if (creativeInfo.M() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.M() == BrandSafetyUtils.AdType.BANNER || creativeInfo.M() == BrandSafetyUtils.AdType.MREC) {
                                        CreativeInfoManager.a(creativeInfo, CreativeInfo.f62449m);
                                        Logger.d(CreativeInfoManager.f61958m, "set CI in ad finder: ", creativeInfo);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.f61958m, th.getMessage(), th);
                        }
                    }
                });
                return;
            }
            Logger.d(f61958m, "handling output stream SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(f61958m, "Exception handling output stream : ", th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final BrandSafetyEvent.AdFormatType adFormatType, final Object obj) {
        try {
            if (aE && f61941aC.get()) {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.20
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f61958m, "handling shown ad by api, sdk: ", str, ", message: ", str2, ", ad format type: ", adFormatType, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.a(str2, str2, adFormatType, obj);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.d(CreativeInfoManager.f61958m, "handling shown ad by api failed", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.d(f61958m, "Exception handling shown ad by api :", th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static boolean a(CreativeInfo creativeInfo, String str) {
        return a(creativeInfo, str, (String) null, (String) null);
    }

    public static boolean a(CreativeInfo creativeInfo, String str, String str2) {
        return a(creativeInfo, str, str2, (String) null);
    }

    public static boolean a(CreativeInfo creativeInfo, String str, String str2, String str3) {
        boolean zA;
        if (!aE || !f61941aC.get()) {
            return false;
        }
        if (creativeInfo.Z() != null) {
            Logger.printFullVerboseLog(f61958m, "setting creative in ad finder - ci already have matching method. ci: ", creativeInfo);
            return false;
        }
        Logger.d(f61958m, "setting creative in ad finder, ci id =", creativeInfo.N(), ", ad type: ", creativeInfo.M());
        com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(creativeInfo.M());
        if (aVarA != null) {
            if (a(creativeInfo.S(), AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true)) {
                zA = aVarA.a(new o(creativeInfo, str, str2, str3));
            } else {
                zA = aVarA.a(new o(creativeInfo, str, str2));
            }
            Logger.d(f61958m, "setting creative in ad finder updating ci ", Boolean.valueOf(zA), ", matching method=", str, "_", str2, ", ad id=", creativeInfo.N(), ", ad type=", creativeInfo.M());
            return zA;
        }
        Logger.d(f61958m, "setting creative in ad finder - cannot update ad finder");
        return false;
    }

    public static void b(String str, String str2) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.d(f61958m, "request to stop take screenshots from current interstitial impression, package: ", str, ", address: ", str2);
        InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
        if (interstitialFinderZ == null) {
            Logger.d(f61958m, "interstitial finder is null, exiting");
        } else {
            interstitialFinderZ.a(str, str2, false);
        }
    }

    public static void a(String str, BrandSafetyUtils.AdType adType, String str2) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.d(f61958m, "request to stop take screenshots from current ", adType.name(), " impression received");
        BannerFinder bannerFinder = (BannerFinder) SafeDK.getInstance().a(adType);
        if (bannerFinder == null) {
            Logger.d(f61958m, adType.name(), " finder is null, exiting");
        } else if (str2 != null) {
            bannerFinder.p(str2);
        } else {
            bannerFinder.q(str);
        }
    }

    public static void a(final String str, final Object obj, final Object obj2) {
        try {
            if (aE && f61941aC.get()) {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.21
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f61958m, "Media player set data source event received ", obj, ", video file ", obj2);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f61958m, "no discovery object found for SDK ", str);
                            } else {
                                adNetworkDiscovery.b(obj, obj2);
                            }
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.e(CreativeInfoManager.f61958m, th.getMessage());
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
                return;
            }
            Logger.d(f61958m, "Media player set data source event SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final Object obj) {
        try {
            if (aE && f61941aC.get()) {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.22
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.f61958m, "media player start event ", obj);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.f61958m, "no discovery object found for SDK ", str);
                                return;
                            }
                            String strB = adNetworkDiscovery.b(obj);
                            if (strB != null) {
                                for (CreativeInfo creativeInfo : adNetworkDiscovery.s(strB)) {
                                    creativeInfo.a(obj);
                                    Logger.d(CreativeInfoManager.f61958m, "calling set creative in ad finder after media player start called. video url: ", creativeInfo.J());
                                    CreativeInfoManager.a(creativeInfo, CreativeInfo.f62447k);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.d(CreativeInfoManager.f61958m, "Media player start event error ", th);
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
                return;
            }
            Logger.d(f61958m, "media player start SafeDK not initialized");
        } catch (Throwable th) {
            Logger.d(f61958m, "Media player start event error ", th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final Object obj, final Object obj2) {
        try {
            if (aE && f61941aC.get()) {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.f61958m, "Ad Object ready Executor started ", str, " ad instance: ", obj, ", matching object: ", obj2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                        CreativeInfoManager.d(str, obj, obj2);
                    }
                });
                return;
            }
            Logger.d(f61958m, "Ad Object ready SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Object obj, Object obj2) {
        try {
            Logger.d(f61958m, "ad object ready impl ", obj);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(f61958m, "ad object ready impl no discovery object for SDK ", str);
            } else {
                adNetworkDiscovery.d(obj, obj2);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(f61958m, "ad object ready impl error ", th);
        }
    }

    public static void f(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().m(str);
        }
    }

    public static void g(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().n(str);
        }
    }

    public static void h(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().o(str);
        }
    }

    public static void onVideoCompleted(String sdkPackageName, Object source, String originatedBy) {
        if (source == null) {
            onVideoCompleted(sdkPackageName, originatedBy);
        } else {
            a(sdkPackageName, BrandSafetyUtils.a(source), true, originatedBy);
        }
    }

    public static void onVideoStart(String sdkPackageName, Object source, String originatedBy) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(sdkPackageName);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.d(source);
        }
        a(sdkPackageName, BrandSafetyUtils.a(source), false, originatedBy);
    }

    public static void onVideoCompleted(final String sdkPackageName, final String originatedBy) {
        if (n.c()) {
            f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.3
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.g(sdkPackageName, originatedBy);
                }
            });
        } else {
            g(sdkPackageName, originatedBy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(String str, String str2) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.d(f61958m, "video completed event sdk=", str, ", originated by= ", str2);
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().f(str, str2);
        }
    }

    public static void a(final String str, final String str2, final boolean z2, final String str3) {
        if (n.c()) {
            f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.4
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(str, str2, z2, str3);
                }
            });
        } else {
            c(str, str2, z2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, boolean z2, String str3) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Object[] objArr = new Object[8];
        objArr[0] = "video ";
        objArr[1] = z2 ? "completed" : "started";
        objArr[2] = " event sdk=";
        objArr[3] = str;
        objArr[4] = ", view address=";
        objArr[5] = str2;
        objArr[6] = ", originated by= ";
        objArr[7] = str3;
        Logger.d(f61958m, objArr);
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null) {
            for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(safeDK.z(), safeDK.B())) {
                if (aVar != null && aVar.a(str, str2, z2, str3)) {
                    return;
                }
            }
        }
        if (!z2) {
            Logger.d(f61958m, "video started event added to videoStartViewList, sdk=", str, ", view address=", str2);
            f61949d.add(str2);
        }
    }

    public static void onViewClicked(final String sdkPackageName, final View view) {
        Logger.d(f61958m, "View clicked event sdk=", sdkPackageName, ", view id = ", Integer.toString(view.getId(), 16));
        if (n.c()) {
            f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.5
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(sdkPackageName, view);
                }
            });
        } else {
            c(sdkPackageName, BrandSafetyUtils.a(view), true, "view-click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, View view) {
        try {
            Logger.d(f61958m, "View clicked event sdk=", str, ", view id = ", Integer.toString(view.getId(), 16), ", isOnUiThread = ", Boolean.valueOf(n.c()));
            if (aE && f61941aC.get()) {
                if (view == null) {
                    Logger.d(f61958m, "View clicked event sdk=", str, ", view=null, exiting.");
                    return;
                }
                AdNetworkDiscovery adNetworkDiscoveryJ = j(str);
                if (adNetworkDiscoveryJ != null) {
                    adNetworkDiscoveryJ.c(view);
                } else {
                    Logger.d(f61958m, "clicked from unsupported SDK: ", str);
                }
            }
        } catch (Throwable th) {
            Logger.e(f61958m, GDEJgAYrPQHfw.lmeOP, th);
        }
    }

    public static boolean onViewTouched(final String sdkPackageName, final View view, MotionEvent motionEvent) {
        try {
        } catch (Throwable th) {
            Logger.e(f61958m, "View touched event exception", th);
        }
        if (view == null) {
            Logger.d(f61958m, "View touched event sdk=", sdkPackageName, ", view=null, exiting.");
            return false;
        }
        if (aE && f61941aC.get()) {
            int action = motionEvent.getAction();
            Logger.d(f61958m, "View touched event sdk=", sdkPackageName, ", view id = ", Integer.toString(view.getId(), 16), ", motion event=", motionEvent.toString());
            if (action != 0 && action != 11) {
                Logger.d(f61958m, "View touched event sdk=", sdkPackageName, ", motion event=", Integer.valueOf(action), ". exiting.");
                return false;
            }
            if (n.c()) {
                f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.6
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.d(sdkPackageName, view);
                    }
                });
            } else {
                d(sdkPackageName, view);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, View view) {
        try {
            Logger.d(f61958m, "onViewTouchedImpl started, sdkPackageName = ", str, ", view = ", view);
            AdNetworkDiscovery adNetworkDiscoveryJ = j(str);
            if (adNetworkDiscoveryJ == null) {
                Logger.d(f61958m, "View touched event clicked from unsupported SDK: ", str);
            } else {
                adNetworkDiscoveryJ.d(view);
            }
        } catch (Throwable th) {
            Logger.e(f61958m, "View touched event exception", th);
        }
    }

    public static boolean i(String str) {
        if (n.a(str, f61955j) && str.contains(f61954i)) {
            return true;
        }
        return false;
    }

    public static synchronized void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        try {
        } catch (Throwable th) {
            Logger.e(f61958m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
        if (aE && f61941aC.get()) {
            f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.7
                @Override // java.lang.Runnable
                public void run() {
                    Logger.d(CreativeInfoManager.f61958m, "updating creative info details from Max, sdk=", str, ", placement id=", str2, ", creative id=", str3, ", ad format=", str5);
                    AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                    if (adNetworkDiscovery != null) {
                        adNetworkDiscovery.a(str2, str3, str4, str5);
                    } else {
                        Logger.d(CreativeInfoManager.f61958m, "no discovery object for SDK ", str);
                    }
                }
            });
            return;
        }
        Logger.d(f61958m, "updating creative info details SafeDK not initialized");
    }

    public static AdNetworkDiscovery j(String str) {
        if (!aE || !f61941aC.get() || str == null) {
            return null;
        }
        return adNetworkDiscoveries.get(str);
    }

    public static b k(String str) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && f61941aC.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null) {
            return adNetworkDiscovery.d();
        }
        return null;
    }

    public static boolean a(String str, AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && f61941aC.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().b(adNetworkConfiguration);
        }
        return z2;
    }

    public static long a(String str, AdNetworkConfiguration adNetworkConfiguration, long j2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && f61941aC.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().e(adNetworkConfiguration);
        }
        return j2;
    }

    public static String a(String str, AdNetworkConfiguration adNetworkConfiguration, String str2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && f61941aC.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().c(adNetworkConfiguration);
        }
        return str2;
    }

    public static float a(String str, AdNetworkConfiguration adNetworkConfiguration, float f3) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && f61941aC.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().d(adNetworkConfiguration);
        }
        return f3;
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, float f3) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                adNetworkDiscovery.d().a(adNetworkConfiguration, f3);
                Logger.d(f61958m, "Config bundle for sdk ", adNetworkDiscovery, " updated config item ", adNetworkDiscovery.f(), " to ", Float.valueOf(f3));
            }
        }
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, long j2) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                adNetworkDiscovery.d().a(adNetworkConfiguration, j2);
                Logger.d(f61958m, "Config bundle for sdk ", adNetworkDiscovery, " updated config item ", adNetworkDiscovery.f(), " to ", Long.valueOf(j2));
            }
        }
    }

    public static void d() {
        if (!aE || !f61941aC.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                Logger.d(f61958m, "Config item SDK ", adNetworkDiscovery.f(), " min image uniformity threshold is ", Float.valueOf(adNetworkDiscovery.d().d(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE)));
            }
        }
    }

    public static void onHandleInvocation(String packageName, Object target, String data) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        Logger.printFullVerboseLog(f61958m, "onHandleInvocation packageName = ", packageName, ", interface name: ", target, ", data is: ", data);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(packageName);
        if (adNetworkDiscovery == null) {
            Logger.d(f61958m, "onHandleInvocation: couldn't find discovery for package: ", packageName);
        } else {
            adNetworkDiscovery.a(data, target);
        }
    }

    public static void onWebviewInterfaceConstruction(final String packageName, final Object bridge) {
        if (n.c()) {
            f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.8
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.c(packageName, bridge);
                }
            });
        } else {
            c(packageName, bridge);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object obj) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        String strA = BrandSafetyUtils.a(obj);
        Logger.printFullVerboseLog(f61958m, "onWebviewInterfaceConstruction: packageName is: ", str, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", bridge address is: ", strA);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(f61958m, "onWebviewInterfaceConstruction: couldn't find discovery for package: ", str);
        } else {
            adNetworkDiscovery.w(strA);
        }
    }

    public static Set<String> e() {
        return adNetworkDiscoveries.keySet();
    }

    public static boolean l(String str) {
        SafeDK safeDK;
        return (!aE || !f61941aC.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.z() == null || safeDK.z().f61638I.a(str, false) == null) ? false : true;
    }

    public static boolean m(String str) {
        SafeDK safeDK;
        return (!aE || !f61941aC.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.z() == null || safeDK.z().f61638I.e(str) == null) ? false : true;
    }

    public static boolean n(String str) {
        SafeDK safeDK;
        if (!aE || !f61941aC.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.A() == null) {
            return false;
        }
        return safeDK.A().r(str);
    }

    public static void a(String str, String str2, BrandSafetyUtils.AdType adType, String str3) {
        if (!aE || !f61941aC.get()) {
            return;
        }
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.a(adType) != null) {
            Logger.d(f61958m, "sendMessageToAdInfo: sending message: ", str2, " to address: ", str);
            safeDK.a(adType).c(str, str2, str3);
        } else {
            Logger.d(f61958m, "sendMessageToAdInfo: NOT sending message: ", str2, " to address: ", str, "because ad finder not available");
        }
    }

    public static void onReceiveMessageFromExternal(final String sdkPackage, final Object object, final String data) {
        f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.9
            @Override // java.lang.Runnable
            public void run() {
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(sdkPackage);
                if (adNetworkDiscoveryJ != null) {
                    adNetworkDiscoveryJ.a(object, data);
                }
            }
        });
    }

    public static void onBindView(final String packageName, final Object controller, final View videoView) {
        f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.10
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(CreativeInfoManager.f61958m, "on bind view - controller: ", controller, " (", BrandSafetyUtils.a(controller), "), video view: ", videoView, " (", BrandSafetyUtils.a(videoView), ")");
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(packageName);
                if (adNetworkDiscoveryJ != null) {
                    CreativeInfoManager.a(adNetworkDiscoveryJ, adNetworkDiscoveryJ.c(controller, videoView), videoView);
                }
            }
        });
    }

    public static void c(final String str, final String str2) {
        f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.11
            @Override // java.lang.Runnable
            public void run() {
                String str3;
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                if (adNetworkDiscoveryJ != null && (str3 = str2) != null) {
                    adNetworkDiscoveryJ.e(str3);
                }
            }
        });
    }

    public static String d(String str, String str2) {
        AdNetworkDiscovery adNetworkDiscoveryJ = j(str);
        if (adNetworkDiscoveryJ != null) {
            return adNetworkDiscoveryJ.f(str2);
        }
        return null;
    }

    public static void onFeedbackPopup(String sdkPackageName) {
        com.safedk.android.analytics.brandsafety.n nVarR;
        Logger.d(f61958m, "on feedback popup started, sdkPackageName: ", sdkPackageName);
        InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
        if (interstitialFinderZ != null && (nVarR = interstitialFinderZ.r(sdkPackageName)) != null && nVarR.i() != null) {
            Logger.d(f61958m, Logger.FeatureTag.AD_CAPTURE, "on feedback popup : PP detection for sdk = ", sdkPackageName);
            nVarR.i().a(l.f62662q, new l.a[0]);
            interstitialFinderZ.a(nVarR, false);
        }
    }

    public static void onInitVFPData(String sdkPackageName, Object view) {
        Logger.d(f61958m, "on init VFP data, sdkPackageName: ", sdkPackageName, " and view: ", view);
        a(sdkPackageName, BrandSafetyUtils.a(view), false, "video-view");
    }

    public static void onAdReadyToPlay(final String sdkPackageName, final Object vastPlayer, final Object videoPlayerView) {
        f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.13
            @Override // java.lang.Runnable
            public void run() {
                String strA = BrandSafetyUtils.a(vastPlayer);
                String strA2 = BrandSafetyUtils.a(videoPlayerView);
                Logger.d(CreativeInfoManager.f61958m, "on ad ready to play - vast player is: ", vastPlayer, " and address is: ", strA);
                Logger.d(CreativeInfoManager.f61958m, "on ad ready to play - video player view is: ", videoPlayerView, " and address is: ", strA2);
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(sdkPackageName);
                if (adNetworkDiscoveryJ != null) {
                    adNetworkDiscoveryJ.c(vastPlayer, videoPlayerView);
                }
            }
        });
    }

    public static void onAdStarted(final String sdkPackageName, final Object vastPlayer) {
        f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.14
            @Override // java.lang.Runnable
            public void run() {
                Logger.d(CreativeInfoManager.f61958m, "on ad start - vast player is: ", vastPlayer, " and address is: ", BrandSafetyUtils.a(vastPlayer));
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(sdkPackageName);
                if (adNetworkDiscoveryJ != null) {
                    CreativeInfoManager.a(adNetworkDiscoveryJ, adNetworkDiscoveryJ.c(vastPlayer), (Object) null);
                }
            }
        });
    }

    public static void onVolleyStringRequestCtor(String sdkPackageName, String url, Response.Listener responseListener) {
        String strA = BrandSafetyUtils.a(responseListener);
        Logger.d(f61958m, "on volley string request ctor started with sdk: ", sdkPackageName, " url is: ", url, " and response listener: ", responseListener, " and address: ", strA);
        AdNetworkDiscovery adNetworkDiscoveryJ = j(sdkPackageName);
        if (adNetworkDiscoveryJ != null) {
            adNetworkDiscoveryJ.g(strA, url);
        }
    }

    public static void onVolleyGetResponse(final String sdkPackageName, final Response.Listener responseListener, final Object responseObj) {
        f61942aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.15
            @Override // java.lang.Runnable
            public void run() {
                String strA;
                String strX;
                Logger.d(CreativeInfoManager.f61958m, "on volley get response started with sdk: ", sdkPackageName, " instance is: ", responseListener, " and response object: ", responseObj);
                Object obj = responseObj;
                if ((obj instanceof String) && h.b((String) obj)) {
                    Logger.printFullVerboseLog(CreativeInfoManager.f61958m, "on volley get response - object is a vast string");
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(sdkPackageName);
                    if (adNetworkDiscoveryJ != null && (strX = adNetworkDiscoveryJ.x((strA = BrandSafetyUtils.a(responseListener)))) != null) {
                        Logger.d(CreativeInfoManager.f61958m, "on volley get response - for listener address: ", strA, " found url: ", strX);
                        adNetworkDiscoveryJ.a(strX, (String) responseObj, null, null, null);
                    }
                }
            }
        });
    }

    public static void onCronetClientGetResponse(String sdkPackageName, Object urlResponseInfo, byte[] byteStream) {
        String str;
        Logger.d(f61958m, "on cronet client get response - sdk: ", sdkPackageName, ", response info: ", urlResponseInfo);
        try {
            str = (String) urlResponseInfo.getClass().getMethod("getUrl", new Class[0]).invoke(urlResponseInfo, new Object[0]);
        } catch (Exception e2) {
            Logger.d(f61958m, "on cronet client get response - failed to get url or data: ", e2);
            str = null;
        }
        AdNetworkDiscovery adNetworkDiscoveryJ = j(sdkPackageName);
        if (byteStream != null && adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.a(str, (Bundle) null)) {
            adNetworkDiscoveryJ.a(str, new String(byteStream), byteStream, null, null);
        }
    }

    public static void a(AdNetworkDiscovery adNetworkDiscovery, CreativeInfo creativeInfo, Object obj) {
        if (creativeInfo == null) {
            return;
        }
        List<CreativeInfo> arrayList = null;
        if (creativeInfo.an()) {
            arrayList = adNetworkDiscovery.u(creativeInfo.N());
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            arrayList.add(creativeInfo);
        }
        for (CreativeInfo creativeInfo2 : arrayList) {
            if (obj != null) {
                creativeInfo2.a(obj);
            }
            a(creativeInfo2, CreativeInfo.f62450n);
        }
    }

    public static void a(String str, u uVar) {
        Logger.d(f61958m, "registerSafeDKSavePrefetchEventListener started , sdk = ", str);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.a(uVar);
            Logger.d(f61958m, "save prefetch event listener registered fpr Ad network discovery class ", str, ", discovery = ", adNetworkDiscovery.f());
        } else {
            Logger.d(f61958m, "save prefetch event listener cannot be registered, Ad network discovery class not found for ", str);
        }
    }

    public static void b(String str, u uVar) {
        Logger.d(f61958m, "registerSafeDKRewriteEventListener started , sdk = ", str);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.b(uVar);
            Logger.d(f61958m, "rewrite event listener registered for Ad network discovery class ", str, ", discovery = ", adNetworkDiscovery.f());
        } else {
            Logger.d(f61958m, "rewrite event listener cannot be registered, Ad network discovery class not found for ", str);
        }
    }
}
