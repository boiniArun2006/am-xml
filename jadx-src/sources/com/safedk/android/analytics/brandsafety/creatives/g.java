package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.webkit.WebView;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62371a = "ResourceUrlFilter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62372b = "attribution.urls";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62373c = "general_exclusion_list";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62374d = "general_inclusion_list";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62375e = "http";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f62379i = 1.1f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f62380j = 1.3f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f62381k = "BannerView";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f62382l = 6.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f62383m = 8.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f62385o = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String[]> f62378h = b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final LinkedHashSet<String> f62384n = new LinkedHashSet<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f62376f = 691155085;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f62377g = 2105362402;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final ConcurrentHashMap<String, a> f62386p = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, String[]> a() {
        return f62378h;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SimpleConcurrentHashSet<String> f62387a = new SimpleConcurrentHashSet<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SimpleConcurrentHashSet<String> f62388b = new SimpleConcurrentHashSet<>();

        a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            synchronized (this.f62388b) {
                sb.append("networkResources=");
                sb.append(this.f62388b != null ? this.f62388b.toString() : V8ValueNull.NULL);
            }
            synchronized (this.f62387a) {
                sb.append(", webpageResources=");
                sb.append(this.f62387a != null ? this.f62387a.toString() : V8ValueNull.NULL);
            }
            return sb.toString();
        }
    }

    private static ConcurrentHashMap<String, String[]> b() {
        ConcurrentHashMap<String, String[]> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(com.safedk.android.utils.h.f63161a, new String[]{".applovin.com", ".applvn.com", ".appl.vn", ".axon.ai"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63166f, new String[]{".supersonicads.com", ".supersonic.com", "streamrail.com", "streamrail.net", "simharif.com", "atom-data.io", "supersonicads-a.akamaihd.net", ".ssacdn.com", ".isprog.com", "unity3d.com", "ironsrc.mobi"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63164d, new String[]{".vungle.com", ".liftoff.com", ".liftoff.io", ".chinaliftoff.io", "liftoff-creatives.io"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63171k, new String[]{".unity3d.com"});
        concurrentHashMap.put("com.facebook.ads", new String[]{".facebook.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63168h, new String[]{".doubleclick.net", ".google.com", ".googlesyndication.com", ".googleadservices.com", ".googleapis.com", ".youtube.com", ".googleusercontent.com", ".gstatic.com", ".googlevideo.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63175o, new String[]{"rayjump.com", "mobvista.com", "mintegral.com", "mindworks-creative.com", "mtgglobals.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63162b, new String[]{"adcolony.com", "adccache.cn", "adtilt.com", "admarvel.com"});
        concurrentHashMap.put(f62372b, new String[]{"play.google.com", ".appsflyer.com", ".adjust.com", ".singular.net", ".tenjin.io", ".kochava.com", ".tune.com", ".partytrack.it", ".tapstream.com", ".apsalar.com", ".adj.st", ".singular.com", ".sng.link", ".tenjin.com", ".doubleverify.com", ".onelink.me", ".moatads.com", ".moatpixel.com", ".adsafeprotected.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63176p, new String[]{".inner-active.mobi", ".inner-active.com", "w3.org"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63169i, new String[]{"inmobicdn.net", "inmobi.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63181u, new String[]{"pangle.io", "byteoversea.com", "tiktokcdn.com", "ipstatp.com", "pglstatp.com", "snssdk.com", "pangolin-sdk-toutiao.com", "toutiao.com", "ibytedtos.com", "tiktokpangle-cdn-us.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63186z, new String[]{"fivecdm.io", "fivecdm.com", "line.me"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63182v, new String[]{"smaato.net"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63158D, new String[]{"moloco.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63156B, new String[]{"bidmachine.io", "bm-ads.io", "lazybumblebee.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63157C, new String[]{"pubnative.net"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63159E, new String[]{"mobilefuse.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63163c, new String[]{"chartboost.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63160F, new String[]{"pubmatic.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63155A, new String[]{"amazon-adsystem.com", "media-amazon.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.f63185y, new String[]{"yandex.net", "yandex.ru", "yandexadexchange.net"});
        concurrentHashMap.put(f62373c, new String[]{"outcome-cdn.supersonicads.com/", "click-haproxy.supersonicads.com/", "supersonicads.com/pixel", "supersonicads.com/endcardclick", "supersonicads.com/videoimpression", "supersonicads.com/isendcardclick", "supersonicads.com/isvideoimpression", "k.isprog.com", "events.isprog.com", ".simharif.com", "csi.gstatic.com/csi", "googleads.g.doubleclick.net/pagead/conversion", ".applovin.com/imp", ".applovin.com/click", ".applovin.com/interact", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62176i, ".applvn.com/imp", ".applvn.com/click", ".applvn.com/interact", ".applvn.com/redirect", "event.inner-active.mobi", "events.inner-active.mobi"});
        concurrentHashMap.put(f62374d, new String[]{"gstatic.com", "googleusercontent.com", "tpc.googlesyndication.com", "/simgad/", "pglstatp.com", "ipstatp.com", "pglstatp-toutiao.com", "pstatp.com", "googleadsserving.cn", "ggpht.com", "ibyteimg.com"});
        return concurrentHashMap;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (!a(SdksMapping.getMainSdkPackage(str2), str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        boolean z2;
        String[] strArr;
        int i2 = 0;
        if (!str2.startsWith(f62375e)) {
            return false;
        }
        String strC = k.c(str2);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (!TextUtils.isEmpty(mainSdkPackage) && (strArr = f62378h.get(mainSdkPackage)) != null) {
            for (String str3 : strArr) {
                if (strC.contains(str3)) {
                    Logger.d(f62371a, "isDspUrlTracking filtering out ", str2);
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        String[] strArr2 = f62378h.get(f62372b);
        if (strArr2 != null) {
            int length = strArr2.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (!strC.contains(strArr2[i2])) {
                    i2++;
                } else {
                    z2 = true;
                    break;
                }
            }
        }
        return !z2;
    }

    private static void a(String str, String str2, String str3, Map<String, String> map, List<com.safedk.android.analytics.brandsafety.k> list, boolean z2) {
        char c2 = 2;
        if (z2 || a(str, str3, map)) {
            String strY = n.y(str3);
            for (com.safedk.android.analytics.brandsafety.k kVar : list) {
                if (kVar != null) {
                    if (kVar.j() != null && kVar.j().m()) {
                        Logger.FeatureTag featureTag = Logger.FeatureTag.NW_RESOURCES;
                        Object[] objArr = new Object[10];
                        objArr[0] = "add resource to impression if needed, skip resource for ";
                        objArr[1] = str2;
                        objArr[c2] = ", type: ";
                        objArr[3] = kVar.f62604j;
                        objArr[4] = ", package: ";
                        objArr[5] = str;
                        objArr[6] = ", impression id: ";
                        objArr[7] = kVar.k();
                        objArr[8] = ", resource: ";
                        objArr[9] = strY;
                        Logger.d(f62371a, featureTag, objArr);
                    } else {
                        kVar.b(strY);
                        Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "add resource to impression if needed, added resource for ", str2, ", type: ", kVar.f62604j, ", package: ", str, ", impression id: ", kVar.k(), ", resource: ", strY);
                    }
                }
                c2 = 2;
            }
            return;
        }
        if (a(str, str3)) {
            Logger.d(f62371a, "add resource to impression if needed, WebView resource discarded (should not be added to dsp domains). resource = ", str3);
        }
    }

    private static a a(String str) {
        a aVar;
        synchronized (f62386p) {
            aVar = f62386p.get(str);
            if (aVar == null) {
                aVar = new a();
                f62386p.put(str, aVar);
            }
        }
        return aVar;
    }

    private static boolean b(String str, String str2) {
        for (com.safedk.android.analytics.brandsafety.b bVar : SafeDK.getInstance().y()) {
            if (bVar != null) {
                List<CreativeInfo> listA = bVar.a(str, str2);
                if (n.a((Collection<?>) listA)) {
                    continue;
                } else {
                    Iterator<CreativeInfo> it = listA.iterator();
                    while (it.hasNext()) {
                        if (it.next().m()) {
                            Logger.d(f62371a, Logger.FeatureTag.RESOURCES, "should stop collecting resource for CI returned true with webViewAddress ", str2, " is set to not collect resources");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, boolean z2) {
        if (z2 || a(str, str3, map)) {
            a aVarA = a(str2);
            String strY = n.y(str3);
            if (!b(str, str2)) {
                Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "add resource to collection, added resource for ", str2, ", package: ", str, ", resource: ", strY);
                synchronized (aVarA.f62388b) {
                    aVarA.f62388b.a(strY);
                }
                return;
            }
            Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "did not add resource to collection, webViewAddress = ", str2, ", ci stopCollectingResources is true  for at least one CI , resource = ", strY);
            return;
        }
        if (a(str, str3)) {
            Logger.d(f62371a, "add resource to collection, WebView resource discarded (should not be added to dsp domains). resource = ", str3);
        }
    }

    private static void a(String str, com.safedk.android.analytics.brandsafety.k kVar, WeakReference<WebView> weakReference, List<String> list, boolean z2) {
        ArrayList arrayList;
        WebView webView;
        String strA;
        try {
            arrayList = new ArrayList();
            for (String str2 : list) {
                if (z2 || a(str, str2, (Map<String, String>) null)) {
                    arrayList.add(n.y(str2));
                }
            }
        } catch (Throwable th) {
            Logger.e(f62371a, "Exception: ", th.getMessage(), th);
        }
        if (!arrayList.isEmpty()) {
            if (kVar != null) {
                if (kVar.f62616v) {
                    synchronized (kVar.f62610p) {
                        kVar.f62610p.a(arrayList);
                        Logger.d(f62371a, Logger.FeatureTag.JS_RESOURCES, "adding ", Integer.valueOf(arrayList.size()), " expanded webpage resources, type: ", kVar.f62604j, ", package: ", str, ", impression id: ", kVar.k());
                    }
                    return;
                } else {
                    synchronized (kVar.f62608n) {
                        kVar.f62608n.a(arrayList);
                        Logger.d(f62371a, Logger.FeatureTag.JS_RESOURCES, "adding ", Integer.valueOf(arrayList.size()), " webpage resources, type: ", kVar.f62604j, ", package: ", str, ", impression id: ", kVar.k());
                    }
                    return;
                }
            }
            if (weakReference != null && weakReference.get() != null && (webView = weakReference.get()) != null && (strA = BrandSafetyUtils.a((Object) webView)) != null) {
                a aVarA = a(strA);
                synchronized (aVarA.f62387a) {
                    aVarA.f62387a.a(arrayList);
                }
                return;
            }
            return;
            Logger.e(f62371a, "Exception: ", th.getMessage(), th);
        }
    }

    private static void a(String str, WebView webView, String str2, Map<String, String> map, com.safedk.android.analytics.brandsafety.a aVar) {
        boolean zA;
        try {
            zA = a(str, str2, map);
        } catch (Throwable th) {
            Logger.e(f62371a, "Exception: ", th.getMessage(), th);
        }
        if (zA && zA) {
            String strA = BrandSafetyUtils.a((Object) webView);
            Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "add resource to collection started, current resource: ", str2, " for ", strA, " is resource: ", Boolean.valueOf(zA));
            String strY = n.y(str2);
            if (!b(str, strA)) {
                com.safedk.android.analytics.brandsafety.c cVarC = null;
                if (aVar != null) {
                    cVarC = aVar.c(strA);
                }
                if (cVarC != null) {
                    com.safedk.android.analytics.brandsafety.k kVarI = cVarC.i();
                    if (kVarI != null) {
                        if (kVarI.f62616v) {
                            Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "add expanded resource to collection, added resource ", strY, " into ", strA);
                            synchronized (kVarI.f62611q) {
                                kVarI.f62611q.a(strY);
                            }
                        } else {
                            synchronized (kVarI.f62609o) {
                                kVarI.f62609o.a(strY);
                            }
                        }
                    }
                    return;
                }
                a aVarA = a(strA);
                synchronized (aVarA.f62388b) {
                    aVarA.f62388b.a(strY);
                }
                return;
                Logger.e(f62371a, "Exception: ", th.getMessage(), th);
            }
        }
    }

    private static void a(String str, com.safedk.android.analytics.brandsafety.k kVar, WeakReference<WebView> weakReference, List<String> list) {
        if (kVar != null) {
            try {
                synchronized (kVar.f62612r) {
                    kVar.f62612r.a(list);
                    Logger.d(f62371a, Logger.FeatureTag.JS_RESOURCES, "adding ", Integer.valueOf(list.size()), " hidden webpage resources, type: ", kVar.f62604j, ", package: ", str, ", impression id: ", kVar.k());
                }
            } catch (Throwable th) {
                Logger.e(f62371a, "Exception: ", th.getMessage(), th);
            }
        }
    }

    public static void a(List<WeakReference<WebView>> list, com.safedk.android.analytics.brandsafety.c cVar) {
        String strA;
        a aVarA;
        List<com.safedk.android.analytics.brandsafety.k> listG;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (WeakReference<WebView> weakReference : list) {
                        if (n.a((Reference<?>) weakReference) && (strA = BrandSafetyUtils.a((Object) weakReference.get())) != null && (aVarA = a(strA)) != null) {
                            if (CreativeInfoManager.a(cVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                                listG = new ArrayList<>();
                                listG.add(cVar.i());
                            } else {
                                listG = cVar.g();
                            }
                            f62386p.remove(strA);
                            SimpleConcurrentHashSet<String> simpleConcurrentHashSet = aVarA.f62388b;
                            SimpleConcurrentHashSet<String> simpleConcurrentHashSet2 = aVarA.f62387a;
                            for (com.safedk.android.analytics.brandsafety.k kVar : listG) {
                                if (kVar != null) {
                                    Logger.d(f62371a, "propagateWebviewResourcesToImpression, webview: ", strA, ", view address: ", kVar.b());
                                    if (simpleConcurrentHashSet != null && !simpleConcurrentHashSet.isEmpty()) {
                                        Logger.FeatureTag featureTag = Logger.FeatureTag.NW_RESOURCES;
                                        Object[] objArr = new Object[2];
                                        objArr[0] = "propagate network resources, shouldStopCollectingResources=";
                                        objArr[1] = kVar.j() != null ? Boolean.valueOf(kVar.j().m()) : null;
                                        Logger.d(f62371a, featureTag, objArr);
                                        if (kVar.j() != null && kVar.j().m()) {
                                            Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "propagate network resources, skip ", Integer.valueOf(simpleConcurrentHashSet.size()), " resources for ", strA, ", type: ", kVar.f62604j, ", package: ", cVar.c(), ", impression id: ", kVar.k());
                                        } else {
                                            Logger.d(f62371a, Logger.FeatureTag.NW_RESOURCES, "propagate network resources, adding ", Integer.valueOf(simpleConcurrentHashSet.size()), " resources to collection for ", strA, ", type: ", kVar.f62604j, ", package: ", cVar.c(), ", impression id: ", kVar.k());
                                            synchronized (kVar.f62609o) {
                                                kVar.f62609o.putAll(simpleConcurrentHashSet);
                                            }
                                        }
                                    }
                                    if (simpleConcurrentHashSet2 != null && !simpleConcurrentHashSet2.isEmpty()) {
                                        if (kVar.j() != null && kVar.j().m()) {
                                            Logger.d(f62371a, Logger.FeatureTag.JS_RESOURCES, "propagate webpage resources, skip ", Integer.valueOf(simpleConcurrentHashSet2.size()), " resources for ", strA, ", type: ", kVar.f62604j, ", package: ", cVar.c(), ", impression id: ", kVar.k());
                                        } else {
                                            Logger.d(f62371a, Logger.FeatureTag.JS_RESOURCES, "propagate webpage resources, adding ", Integer.valueOf(simpleConcurrentHashSet2.size()), " resources to collection for ", strA, ", type: ", kVar.f62604j, ", package: ", cVar.c(), ", impression id: ", kVar.k());
                                            synchronized (kVar.f62608n) {
                                                kVar.f62608n.putAll(simpleConcurrentHashSet2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(f62371a, "caught exception: ", th);
            }
        }
    }

    public static void a(List<WeakReference<WebView>> list) {
        String strA;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (WeakReference<WebView> weakReference : list) {
                        if (weakReference.get() != null && (strA = BrandSafetyUtils.a((Object) weakReference.get())) != null) {
                            f62386p.remove(strA);
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(f62371a, "caught exception: ", th);
            }
        }
    }

    public static void a(String str, String str2, WeakReference<WebView> weakReference, String str3, List<String> list, boolean z2, Boolean bool, Boolean bool2, List<String> list2) {
        String mainSdkPackage;
        boolean z3;
        List<com.safedk.android.analytics.brandsafety.k> listG;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        if (SafeDK.getInstance() == null || !SafeDK.ab() || (mainSdkPackage = SdksMapping.getMainSdkPackage(str)) == null) {
            return;
        }
        com.safedk.android.analytics.brandsafety.c cVarK = null;
        if (!TextUtils.isEmpty(str3)) {
            cVarK = BrandSafetyUtils.j(str3);
        }
        char c2 = 2;
        if (cVarK == null) {
            Logger.d(f62371a, "no info object found by event id: ", str3);
            cVarK = BrandSafetyUtils.k(str2);
            z3 = true;
        } else {
            z3 = false;
        }
        if (cVarK != null) {
            String strW = cVarK.w();
            if (CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                listG = new ArrayList<>();
                listG.add(cVarK.i());
            } else {
                listG = cVarK.g();
            }
            for (com.safedk.android.analytics.brandsafety.k kVar : listG) {
                if (kVar != null) {
                    Object[] objArr = new Object[4];
                    objArr[0] = "handleResourcesCollected, webview: ";
                    objArr[1] = str2;
                    objArr[c2] = ", view address: ";
                    objArr[3] = kVar.b();
                    Logger.d(f62371a, objArr);
                    if (z3) {
                        kVar.f62617w = 1;
                    }
                    if (strW == null || !strW.equals(str3)) {
                        Logger.d(f62371a, "event ids don't match. current = ", strW, " js: ", str3);
                        kVar.f62617w += 2;
                    } else {
                        if (bool != null) {
                            if (kVar.f62607m == null) {
                                zBooleanValue2 = bool.booleanValue();
                            } else {
                                zBooleanValue2 = kVar.f62607m.booleanValue() || bool.booleanValue();
                            }
                            kVar.f62607m = Boolean.valueOf(zBooleanValue2);
                        }
                        if (bool2 != null) {
                            if (kVar.f62618x == null) {
                                zBooleanValue = bool2.booleanValue();
                            } else {
                                zBooleanValue = kVar.f62618x.booleanValue() || bool2.booleanValue();
                            }
                            kVar.f62618x = Boolean.valueOf(zBooleanValue);
                        }
                        if (kVar.j() != null && kVar.j().m()) {
                            Logger.FeatureTag featureTag = Logger.FeatureTag.NW_RESOURCES;
                            Object[] objArr2 = new Object[10];
                            objArr2[0] = "handle resources collected, skip resource for ";
                            objArr2[1] = str2;
                            objArr2[c2] = ", type: ";
                            objArr2[3] = kVar.f62604j;
                            objArr2[4] = ", package: ";
                            objArr2[5] = mainSdkPackage;
                            objArr2[6] = ", impression id: ";
                            objArr2[7] = kVar.k();
                            objArr2[8] = ", resources: ";
                            objArr2[9] = Boolean.valueOf(z2);
                            Logger.printFullVerboseLog(f62371a, featureTag, objArr2);
                        } else {
                            if (list != null) {
                                a(mainSdkPackage, kVar, weakReference, list, z2);
                            }
                            if (list2 != null) {
                                a(mainSdkPackage, kVar, weakReference, list2);
                            }
                        }
                    }
                    c2 = 2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x017f, code lost:
    
        if (r24.startsWith("text:") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0185, code lost:
    
        if (com.safedk.android.utils.a.a(r4) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0187, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.g.f62371a, "handle resource url, sdk ", r4, " does not support banner monitoring, skipping text resources");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0198, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0199, code lost:
    
        r7 = com.safedk.android.analytics.brandsafety.b.a(r4, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x019d, code lost:
    
        if (r12 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a3, code lost:
    
        if (r12.isEmpty() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a5, code lost:
    
        r0 = com.safedk.android.internal.b.getInstance().isInterstitialActivity(r23.getContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b5, code lost:
    
        if (r24.startsWith("text:") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b9, code lost:
    
        if (r15 == com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType.INTERSTITIAL) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01bd, code lost:
    
        if (r7 != com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType.INTERSTITIAL) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01bf, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.g.f62371a, "handle resource url, skipping text resource for interstitial ", r4, " on webview ", r1, ", resource ", r24, ", interstitial activity = ", java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e5, code lost:
    
        a(r4, r1, r24, r25, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f0, code lost:
    
        a(r4, r1, r24, r25, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(String str, WebView webView, String str2, Map<String, String> map) {
        if (webView == null || !SafeDK.ab()) {
            return;
        }
        String strA = BrandSafetyUtils.a((Object) webView);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        boolean zA = CreativeInfoManager.a(mainSdkPackage, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        Logger.d(f62371a, "handle resource url ", mainSdkPackage, " on webview ", strA, ", resource ", str2, ", headers = ", map, ", supportsMrecMonitoring = ", Boolean.valueOf(zA), ", webview = ", webView, ", getMaxAdViewFromChildView : ", n.c(webView), ", isMrecWebView = ", Boolean.valueOf(n.a(webView)));
        if (!zA && (n.b(webView.getWidth(), webView.getHeight()) || n.a(webView))) {
            Logger.d(f62371a, "handle resource url - ignoring url ", str2, ",  supportsMrecMonitoring = ", Boolean.valueOf(zA), ", webview = ", webView, ", isMrecWebView =  ", Boolean.valueOf(n.a(webView)), " , isMrecRatio = ", Boolean.valueOf(n.b(webView.getWidth(), webView.getHeight())));
            b(Arrays.asList(strA));
            return;
        }
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
        BrandSafetyUtils.AdType adType = null;
        List<com.safedk.android.analytics.brandsafety.k> listH = null;
        BrandSafetyUtils.AdType adType2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.safedk.android.analytics.brandsafety.b next = it.next();
            if (next != null) {
                com.safedk.android.analytics.brandsafety.c cVarC = next.c(strA);
                if (adType == null && cVarC != null) {
                    adType = cVarC.f61834p;
                }
                if (next.b(mainSdkPackage, strA, str2)) {
                    Logger.d(f62371a, "handle resource url - skip redirect URL and stop collecting resources: ", str2, " for ", strA, ", type=", next.a());
                    return;
                }
                if (cVarC == null) {
                    cVarC = next.d(strA);
                }
                if (cVarC != null) {
                    listH = cVarC.h();
                    adType2 = cVarC.f61834p;
                }
                if (listH != null && !listH.isEmpty()) {
                    Logger.d(f62371a, "handle resource url found ", Integer.valueOf(listH.size()), " ", adType2, " impressions for webview ", strA);
                    break;
                }
            }
        }
    }

    public static void b(List<String> list) {
        a aVarRemove;
        if (list != null) {
            synchronized (list) {
                for (String str : list) {
                    if (str != null && (aVarRemove = f62386p.remove(str)) != null) {
                        Logger.d(f62371a, "clearing for ", str, " succeeded, ", Integer.valueOf(aVarRemove.f62387a.size()), " webpageResources removed, ", Integer.valueOf(aVarRemove.f62388b.size()), " networkResourcess removed");
                    }
                }
            }
        }
    }

    public static void a(String str, String str2, com.safedk.android.analytics.brandsafety.k kVar) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        if (str2 != null && kVar != null && (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) != null) {
            adNetworkDiscoveryJ.q(str2).add(str2);
        }
    }

    public static void a(String str, WebView webView, String str2, String str3, Map<String, String> map) {
        if (webView == null) {
            return;
        }
        String strA = BrandSafetyUtils.a((Object) webView);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        boolean zA = CreativeInfoManager.a(mainSdkPackage, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        String str4 = qUrazMnwDskFs.IeyvTLRBvcr;
        Logger.d(f62371a, "handle resource url ", mainSdkPackage, " on webview ", strA, ", context: ", webView.getContext(), " resource: ", str2, " size: ", Integer.valueOf(webView.getWidth()), ",", Integer.valueOf(webView.getHeight()), ", webView id: ", Integer.toHexString(webView.getId()), ", headers: ", map, ", supportsMrecMonitoring = ", Boolean.valueOf(zA), str4, webView, ", getMaxAdViewFromChildView : ", n.c(webView), ", isMrecWebView = ", Boolean.valueOf(n.a(webView)));
        if (!zA && (n.b(webView.getWidth(), webView.getHeight()) || n.a(webView))) {
            Logger.d(f62371a, "handle resource url - ignoring url ", str2, ",  supportsMrecMonitoring = ", Boolean.valueOf(zA), str4, webView, ", isMrecWebView =  ", Boolean.valueOf(n.a(webView)), " , isMrecRatio = ", Boolean.valueOf(n.b(webView.getWidth(), webView.getHeight())));
            b(Arrays.asList(strA));
            return;
        }
        if (map != null) {
            Logger.d(f62371a, "handle resource url - headers: ", map);
        }
        boolean zIsInterstitialActivity = com.safedk.android.internal.b.getInstance().isInterstitialActivity(webView.getContext());
        BrandSafetyUtils.AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(mainSdkPackage, webView);
        Logger.d(f62371a, "handle resource url - interstitial activity: ", Boolean.valueOf(zIsInterstitialActivity), " adType: ", adTypeA);
        if (!zIsInterstitialActivity && (adTypeA == BrandSafetyUtils.AdType.MREC || adTypeA == BrandSafetyUtils.AdType.BANNER)) {
            if (!com.safedk.android.utils.a.a(mainSdkPackage)) {
                Logger.d(f62371a, "Sdk ", mainSdkPackage, " does not support banner monitoring, skipping");
                return;
            }
            if (com.safedk.android.utils.h.f63171k.equals(mainSdkPackage) && webView.getContext().toString().contains("UnityPlayerActivity")) {
                return;
            }
            if (!com.safedk.android.utils.h.f63176p.equals(mainSdkPackage)) {
                Logger.d(f62371a, strA, " will be added to Webview address list");
                f62384n.add(strA);
            } else {
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
                if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.g().containsKey(Integer.valueOf(webView.getId()))) {
                    return;
                }
            }
            boolean zA2 = a(webView);
            Logger.d(f62371a, "webview context: ", webView.getContext(), " size: ", Integer.valueOf(webView.getWidth()), ",", Integer.valueOf(webView.getHeight()), ", interstitial: ", Boolean.valueOf(zA2));
            if (!zA2) {
                Logger.d(f62371a, "handle resource url - no interstitial, skipping");
                return;
            }
        }
        if (a(mainSdkPackage, str2, map)) {
            com.safedk.android.analytics.brandsafety.a aVarA = null;
            if (adTypeA != null) {
                aVarA = SafeDK.getInstance().a(adTypeA);
            }
            a(mainSdkPackage, webView, str2, map, aVarA);
        }
    }

    public static boolean a(String str, String str2, Map<String, String> map) {
        return n.a(str2, map) || c(str, str2);
    }

    private static boolean c(String str, String str2) {
        if (!SdksMapping.getMainSdkPackage(str).equals(com.safedk.android.utils.h.f63171k)) {
            return false;
        }
        boolean zA = AdMobCreativeInfo.a(str2);
        if (zA) {
            Logger.d(f62371a, "admob known domain url = ", str2);
        }
        return zA;
    }

    public static boolean a(WebView webView) {
        try {
            float width = webView.getWidth();
            float height = webView.getHeight();
            if (height > 0.0f) {
                float f3 = width / height;
                Logger.d(f62371a, "interstitial webView proportions : ", Float.valueOf(f3));
                return (((f3 > f62379i ? 1 : (f3 == f62379i ? 0 : -1)) >= 0 && (f3 > f62380j ? 1 : (f3 == f62380j ? 0 : -1)) <= 0) || ((f3 > f62382l ? 1 : (f3 == f62382l ? 0 : -1)) >= 0 && (f3 > 8.0f ? 1 : (f3 == 8.0f ? 0 : -1)) <= 0)) ? false : true;
            }
        } catch (Throwable th) {
            Logger.d(f62371a, "Exception in interstitial webView proportions : ", th.getMessage(), th);
        }
        return true;
    }
}
