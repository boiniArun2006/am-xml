package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.FyberCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.e;
import com.safedk.android.utils.g;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class FyberDiscovery extends d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f62076S = "rewarded";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f62077T = "interstitial";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f62078U = "banner";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final String f62079V = "mrec";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String f62080W = "v";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f62081X = "vast-vpaid";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f62082Y = "cached-ad";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f62083Z = ".fyber.com/ad";
    private static final String aa = ".inner-active.mobi/impression";
    private static final String ab = "s";
    private static final String ac = "crid";
    private static final String ad = "cid";
    private static final String ae = "network";
    private static final String af = "sessionId";
    private static final String ag = "mraid://open";
    private static final String ah = "url";
    private static final String ai = "mraid://expand";
    private static final String al = "fyMraidVideoAd";
    private static final String am = "fyMraidVideoAdCompleted";
    private static final String an = "adm";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f62085ao = "scar-admob";
    private static final int au = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62088b = "wv.inner-active.mobi/simpleM2M/clientRequestEnhancedXmlAd";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62089c = "com.fyber.inneractive.sdk";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62090d = "com.fyber.inneractive.sdk.player.ui";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62091e = "<tns:Response";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f62092f = "FyberDiscovery";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62093g = "X-IA-Ad-Unit-Display-Type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f62094h = "X-IA-Creative-ID";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62095i = "X-IA-Ad-Unit-ID";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f62096j = "X-IA-AdNetwork";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f62097k = "X-IA-Adomain";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f62098l = "X-IA-sdkClickUrl";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f62099m = "X-IA-Session";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f62100n = "X-IA-Campaign-ID";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f62101o = "X-IA-sdkImpressionUrl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f62102p = "spotid";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62103q = "vast";
    private ConcurrentHashMap<String, CreativeInfo> ap;
    private final ConcurrentHashMap<String, CreativeInfo> at;
    private OnGlobalImpressionDataListener ay;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f62084ak = "fymraidvideo://";
    private static final String[] aj = {"mraid://close", "mraid://usecustomclose", "mraid://setOrientationProperties", "iaadfinishedloading://", f62084ak, "fmpendcard://"};
    private static final ConcurrentHashMap<String, String> aq = new ConcurrentHashMap<>();
    private static HashMap<Integer, String> ar = new HashMap<>();

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String[] f62086as = {"adTime", "countingMethod"};
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> av = new LimitedConcurrentHashMap<>(15);

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, String> f62087aw = new LimitedConcurrentHashMap<>(15);
    private static AtomicBoolean ax = new AtomicBoolean(false);

    /* JADX WARN: Illegal instructions before constructor call */
    public FyberDiscovery() {
        String str = obbPUqyhtS.ZGt;
        super(h.f63176p, str);
        this.ap = new ConcurrentHashMap<>();
        this.at = new ConcurrentHashMap<>();
        this.ay = new FyberOnGlobalImpressionDataListener();
        try {
            this.f62226C.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, false);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
            this.f62226C.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, true);
            this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, true);
            this.f62226C.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
            this.f62226C.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
            this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
            this.f62226C.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        } catch (Throwable th) {
            Logger.e(str, "exception in ctor", th);
        }
    }

    private static void h() {
        if (ar.isEmpty()) {
            ar.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_webview_vast_endcard", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_webview_vast_endcard");
            ar.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_webview_vast_vpaid", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_webview_vast_vpaid");
            ar.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_vast_endcard_html", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_vast_endcard_html");
            ar.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_webview_mraid", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_webview_mraid");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public HashMap<Integer, String> g() {
        return ar;
    }

    public static void a(boolean z2) {
        ax.set(z2);
        Logger.d(f62092f, "on global impression data listener is set to ", Boolean.valueOf(z2));
        h();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) {
        Object[] objArr = new Object[6];
        objArr[0] = "generate info url = ";
        objArr[1] = str;
        objArr[2] = " , headers = ";
        objArr[3] = map != null ? map.toString() : V8ValueNull.NULL;
        objArr[4] = ", buffer size = ";
        objArr[5] = str2 == null ? "0" : Integer.valueOf(str2.length());
        Logger.d(f62092f, objArr);
        if (TextUtils.isEmpty(str)) {
            Logger.d(f62092f, "generate info url is empty, exiting");
            return null;
        }
        if (str.contains(f62088b)) {
            return a(str, str2, map);
        }
        if (str.contains(f62082Y) && str.contains(f62083Z)) {
            String strD = k.d(str, af);
            if (TextUtils.isEmpty(strD)) {
                Logger.d(f62092f, "generate info session id is empty, exiting");
                return null;
            }
            if (str2 != null) {
                String strA = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                Logger.d(f62092f, "generate info content hash: ", strA);
                aq.put(strA, strD);
                CreativeInfo creativeInfo = this.ap.get(strD);
                if (creativeInfo != null) {
                    a(str2, creativeInfo, true);
                } else {
                    Logger.d(f62092f, "generate info no CI for ad content with session ID: ", strD);
                }
            }
        } else if (aVar != null) {
            return a(str2, aVar);
        }
        return null;
    }

    private List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map) {
        BrandSafetyUtils.AdType adType;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str3;
        ArrayList arrayList = new ArrayList();
        try {
            k();
            Logger.d(f62092f, "generate info handle prefetch start");
            String strA = a(map, f62093g);
            String strD = null;
            if (strA != null) {
                Logger.d(f62092f, "generate info ad type is ", strA);
                if (strA.equals("interstitial")) {
                    BrandSafetyEvent.AdFormatType adFormatType2 = BrandSafetyEvent.AdFormatType.INTER;
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    adFormatType = adFormatType2;
                } else if (strA.equals("rewarded")) {
                    BrandSafetyEvent.AdFormatType adFormatType3 = BrandSafetyEvent.AdFormatType.REWARD;
                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    adFormatType = adFormatType3;
                } else if (strA.equals("banner")) {
                    BrandSafetyEvent.AdFormatType adFormatType4 = BrandSafetyEvent.AdFormatType.BANNER;
                    adType = BrandSafetyUtils.AdType.BANNER;
                    adFormatType = adFormatType4;
                } else if (strA.contains("mrec")) {
                    BrandSafetyEvent.AdFormatType adFormatType5 = BrandSafetyEvent.AdFormatType.MREC;
                    adType = BrandSafetyUtils.AdType.MREC;
                    adFormatType = adFormatType5;
                } else {
                    Logger.d(f62092f, "generate info ad type is ", strA, ", skipping");
                    return null;
                }
                if (str != null && str.contains(f62088b) && ((strD = k.d(str, f62102p)) != null || this.f62229G != null)) {
                    Logger.d(f62092f, "generate info spot id: ", strD, " ,sdk version: ", this.f62229G);
                }
                String str4 = strD;
                String strA2 = a(map, f62095i);
                String strA3 = a(map, f62094h);
                if (strA3 != null) {
                    str3 = strA3;
                } else {
                    Logger.d(f62092f, "generate info creative id is null, using ad id for it's value");
                    str3 = strA2;
                }
                String strA4 = a(map, f62100n);
                String strA5 = a(map, f62098l);
                String strA6 = a(map, f62096j);
                String strA7 = a(map, f62097k);
                String strA8 = a(map, f62099m);
                Logger.d(f62092f, "generate info session id: ", strA8);
                String strA9 = a(map, f62101o);
                Logger.d(f62092f, "generate info sdk impression url: ", strA9);
                String strE = E(k.l(str2));
                if (str2 != null) {
                    String strA10 = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                    Logger.d(f62092f, "generate info content hash: ", strA10);
                    aq.put(strA10, strA8);
                }
                FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(strA8, str3, strA4, strE, null, adFormatType, adType, str4, this.f62229G, strA6, strA7, strA5, null);
                arrayList.add(fyberCreativeInfo);
                if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    synchronized (this.ap) {
                        this.ap.put(strA8, fyberCreativeInfo);
                    }
                    Logger.d(f62092f, "generate info added CI to list by session id: ", strA8, ",  CI list: ", this.ap);
                }
                String strM = M(strA9);
                synchronized (this.at) {
                    this.at.put(strM, fyberCreativeInfo);
                }
                Logger.d(f62092f, "generate info added CI to list by sdk impression url: ", strM, ",  CI list: ", this.at);
                a(str2, (CreativeInfo) fyberCreativeInfo, false);
            } else {
                Logger.d(f62092f, "generate info ad type is null, skipping");
                return null;
            }
        } catch (Throwable th) {
            Logger.d(f62092f, "Error in generate info : ", th.getMessage(), th);
        }
        return arrayList;
    }

    private List<CreativeInfo> a(String str, c.a aVar) {
        BrandSafetyUtils.AdType adType;
        String str2;
        String str3;
        BrandSafetyUtils.AdType adType2;
        Logger.d(f62092f, "generate info handle bidding start");
        ArrayList arrayList = new ArrayList();
        BrandSafetyEvent.AdFormatType adFormatType = null;
        if (str != null) {
            ArrayList<String> arrayListF = n.f(new String(Base64.decode(str, 0)));
            for (String str4 : arrayListF) {
                if (str4.contains(aa)) {
                    String strD = k.d(str4, "s");
                    String str5 = aVar != null ? aVar.f62189d : null;
                    String strD2 = k.d(str4, "network");
                    Logger.d(f62092f, "sessionId=", strD, " creativeId=", str5, " adNetwork=", strD2);
                    if (aVar == null) {
                        adType = null;
                        str2 = null;
                        str3 = null;
                    } else {
                        if (aVar.f62187b == BrandSafetyEvent.AdFormatType.INTER) {
                            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.f62187b == BrandSafetyEvent.AdFormatType.REWARD) {
                            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.f62187b == BrandSafetyEvent.AdFormatType.BANNER || aVar.f62187b == BrandSafetyEvent.AdFormatType.LEADER) {
                            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                            adType2 = BrandSafetyUtils.AdType.BANNER;
                        } else if (aVar.f62187b == BrandSafetyEvent.AdFormatType.MREC) {
                            adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                            adType2 = BrandSafetyUtils.AdType.MREC;
                        } else {
                            Logger.d(f62092f, "generate info max params ad format is ", aVar.f62187b, ", skipping");
                            return null;
                        }
                        String str6 = aVar.f62186a;
                        str2 = aVar.f62188c;
                        adType = adType2;
                        str3 = str6;
                    }
                    Logger.d(f62092f, "ad format type=", adFormatType, " ad type=", adType);
                    FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(strD, str5, null, null, null, adFormatType, adType, str2, this.f62229G, strD2, null, null, str3);
                    fyberCreativeInfo.b((List<String>) arrayListF);
                    arrayList.add(fyberCreativeInfo);
                    synchronized (this.ap) {
                        this.ap.put(strD, fyberCreativeInfo);
                    }
                    Logger.d(f62092f, "generate info added CI to list by session id: ", strD, ", CI list: ", this.ap);
                    String strM = M(str4);
                    synchronized (this.at) {
                        this.at.put(strM, fyberCreativeInfo);
                    }
                    Logger.d(f62092f, "generate info added CI to list by sdk impression url: ", str4, ", CI list: ", this.at);
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void b(String str, CreativeInfo creativeInfo) {
        creativeInfo.a(f62085ao, "/");
        String strG = k.g(str);
        Logger.printFullVerboseLog(f62092f, "decoded prefetch content is: ", strG);
        ArrayList<String> arrayListF = n.f(strG);
        Iterator<String> it = arrayListF.iterator();
        while (it.hasNext()) {
            Logger.printFullVerboseLog(f62092f, "DV360 handle - found url: ", it.next());
        }
        creativeInfo.b((List<String>) arrayListF);
    }

    private void a(String str, CreativeInfo creativeInfo, boolean z2) {
        Logger.d(f62092f, "generate info ad content start");
        if (n.n(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(an)) {
                    b(jSONObject.getString(an), creativeInfo);
                    return;
                }
            } catch (JSONException e2) {
                Logger.d(f62092f, "generate info ad content - exception when creating JSON object", e2);
            }
            Logger.d(f62092f, "generate info unknown content type");
            return;
        }
        if (z2) {
            String strA = n.a(g.a("<tns:AdNetwork Value=\"(.*?)\" />", 2), str, 1);
            if (!TextUtils.isEmpty(strA)) {
                Logger.d(f62092f, "generate info bidding - found buyer id: ", strA);
                creativeInfo.m(strA);
            } else {
                Logger.d(f62092f, "generate info bidding - did NOT find buyer id, using the old version from prefetch: ", creativeInfo.R());
            }
        }
        Pattern patternA = g.a("<tns:Ad>([\\s\\S]*?)</tns:Ad>", 2);
        String strA2 = n.a(patternA, str, 1);
        if (strA2 != null) {
            if (n.a(com.safedk.android.analytics.brandsafety.creatives.h.j(), strA2, 1) != null) {
                Logger.printFullVerboseLog(f62092f, "generate info vast ad content: ", strA2);
                d(creativeInfo, strA2);
                creativeInfo.e("vast");
            } else {
                Logger.printFullVerboseLog(f62092f, "generate info processing mraid ad: ", strA2);
                c(n.a(patternA, str, 1), creativeInfo);
                creativeInfo.e(CreativeInfo.f62459w);
            }
        }
    }

    private void k() {
        if (ax.get()) {
            return;
        }
        if (InneractiveAdManager.wasInitialized()) {
            InneractiveAdManager.setImpressionDataListener(this.ay);
            Logger.d(f62092f, "on global impression data listener has been set by SafeDK");
            ax.set(true);
            return;
        }
        Logger.d(f62092f, "initialize on global impression listener - Fyber Sdk is not initialized yet");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0069
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo a(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 2
            java.lang.String r4 = "FyberDiscovery"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "match info ad instance: "
            r5[r2] = r6     // Catch: java.lang.Throwable -> L6d
            r5[r1] = r9     // Catch: java.lang.Throwable -> L6d
            com.safedk.android.utils.Logger.d(r4, r5)     // Catch: java.lang.Throwable -> L6d
            boolean r4 = r9 instanceof com.fyber.inneractive.sdk.external.ImpressionData     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L1e
            com.fyber.inneractive.sdk.external.ImpressionData r9 = (com.fyber.inneractive.sdk.external.ImpressionData) r9     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.getImpressionId()     // Catch: java.lang.Throwable -> L6d
            goto L26
        L1e:
            boolean r4 = r9 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L25
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L6d
            goto L26
        L25:
            r9 = r0
        L26:
            if (r9 == 0) goto L6c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r4 = r8.ap     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r5 = r8.ap     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r5.remove(r9)     // Catch: java.lang.Throwable -> L69
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r5 = (com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo) r5     // Catch: java.lang.Throwable -> L69
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L4e
            java.lang.String r0 = "FyberDiscovery"
            com.safedk.android.utils.Logger$FeatureTag r4 = com.safedk.android.utils.Logger.FeatureTag.CI_MATCHING     // Catch: java.lang.Throwable -> L63
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L63
            java.lang.String r7 = "match info ad instance - CI MATCH FOUND! by key: "
            r6[r2] = r7     // Catch: java.lang.Throwable -> L63
            r6[r1] = r9     // Catch: java.lang.Throwable -> L63
            java.lang.String r9 = ", CI : "
            r6[r3] = r9     // Catch: java.lang.Throwable -> L63
            r9 = 3
            r6[r9] = r5     // Catch: java.lang.Throwable -> L63
            com.safedk.android.utils.Logger.printFullVerboseLog(r0, r4, r6)     // Catch: java.lang.Throwable -> L63
            goto L61
        L4e:
            java.lang.String r9 = "FyberDiscovery"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "match info ad instance - cannot find key in: "
            r0[r2] = r4     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r4 = r8.ap     // Catch: java.lang.Throwable -> L63
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L63
            r0[r1] = r4     // Catch: java.lang.Throwable -> L63
            com.safedk.android.utils.Logger.d(r9, r0)     // Catch: java.lang.Throwable -> L63
        L61:
            r0 = r5
            goto L6c
        L63:
            r9 = move-exception
            r0 = r5
            goto L6e
        L66:
            r9 = move-exception
            r0 = r5
            goto L6a
        L69:
            r9 = move-exception
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L6d
        L6c:
            goto L7b
        L6d:
            r9 = move-exception
        L6e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Exception in match info ad instance: "
            r3[r2] = r4
            r3[r1] = r9
            java.lang.String r9 = "FyberDiscovery"
            com.safedk.android.utils.Logger.d(r9, r3)
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery.a(java.lang.Object):com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo");
    }

    private CreativeInfo c(String str, CreativeInfo creativeInfo) {
        Logger.d(f62092f, "update Html CI started: ", creativeInfo.ac());
        ArrayList arrayList = new ArrayList();
        List<String> listB = n.b(g.a("\"(https?:\\/\\/.*?\\.(?:js|css|png|jpg|mp4|webm))\"", 2), str, 1);
        if (listB != null && listB.size() > 0) {
            Iterator<String> it = listB.iterator();
            while (it.hasNext()) {
                String strG = k.g(it.next());
                Logger.d(f62092f, "update Html CI - resource url: ", strG);
                arrayList.add(strG);
            }
        }
        Iterator<String> it2 = n.f(str).iterator();
        while (it2.hasNext()) {
            String strG2 = k.g(it2.next());
            Logger.d(f62092f, "update Html CI - extract urls from source new url: ", strG2);
            arrayList.add(strG2);
        }
        creativeInfo.b((List<String>) arrayList);
        Logger.d(f62092f, "update Html CI updated: ", creativeInfo.ac());
        return creativeInfo;
    }

    public CreativeInfo d(CreativeInfo creativeInfo, String str) {
        C("parse vast prefetch start");
        a(creativeInfo, (String) null, str, false);
        creativeInfo.b(true);
        if (creativeInfo.g()) {
            ((FyberCreativeInfo) creativeInfo).e(f62081X);
        }
        Logger.d(f62092f, "parse vast prefetch - CI updated : ", creativeInfo.ac());
        C("parse vast prefetch return");
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        Object[] objArr = new Object[6];
        objArr[0] = "get ad ID from resource: source is: ";
        objArr[1] = str2;
        objArr[2] = ", and value is: ";
        objArr[3] = str;
        objArr[4] = ", webViewRef is: ";
        objArr[5] = weakReference == null ? V8ValueNull.NULL : weakReference.get();
        Logger.d(f62092f, objArr);
        if (str2 == null) {
            return null;
        }
        String strM = M(str2);
        Logger.d(f62092f, "get ad ID from resource: cleanSource: ", strM, ", creativeInfosBySdkImpressionUrl keys are: ", this.at.keySet());
        if (n.a((Reference<?>) weakReference)) {
            av.put(strM, weakReference);
            Logger.d(f62092f, QiDPjiOCZHDS.ySUnI, strM);
        } else {
            Logger.d(f62092f, "get ad ID from resource: webview is not alive, not adding to map");
        }
        CreativeInfo creativeInfo = this.at.get(strM);
        if (creativeInfo != null) {
            String strN = creativeInfo.N();
            Logger.d(f62092f, "get ad ID from resource: found ci in map with ad id: ", strN);
            f62087aw.put(strN, strM);
            Logger.d(f62092f, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: added ad id: ", strN, " to adIdToSource map");
            return strN;
        }
        Logger.d(f62092f, "get ad ID from resource: could not find ci in map!");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean m(String str) {
        if (!f62087aw.containsKey(str)) {
            Logger.d(f62092f, "try reverse matching with ad id - ad id ", str, " is not in the adIdToSource keys: ", f62087aw.keySet());
            return false;
        }
        return a(f62087aw.get(str), h.f63176p, av, this.at, d.f62219t);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void n(String str) {
        String strRemove = f62087aw.remove(str);
        Logger.d(f62092f, "clean resources started with ad id: ", str, ", and source is: ", strRemove);
        if (strRemove != null) {
            av.remove(strRemove);
        }
    }

    public String B(String str) {
        return n.a(g.a("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2), str, 1);
    }

    private String a(Map<String, List<String>> map, String str) {
        List<String> list;
        if (map != null && map.keySet().toString().toLowerCase().contains(str.toLowerCase())) {
            if (map.get(str) != null) {
                list = map.get(str);
            } else if (map.get(str.toLowerCase()) == null) {
                list = null;
            } else {
                list = map.get(str.toLowerCase());
            }
            if (list != null && list.size() > 0) {
                Logger.d(f62092f, "get value from headers key '", str, "', value '", list.get(0), "'");
                return list.get(0);
            }
            Logger.d(f62092f, "header '", str, "' not found");
        } else {
            Logger.d(f62092f, "header '", str, "' not found");
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean A(String str) {
        return ((this.f62228E.contains(str) || this.f62228E.contains(I(str)) || this.f62228E.contains(str.replace("+", " "))) && !G(str)) || this.at.containsKey(M(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z2 = str.contains(f62088b) || (str.contains(f62082Y) && str.contains(f62083Z)) || this.f62227D.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(str)) || this.f62227D.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(I(str))) || this.f62227D.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(str.replace("+", " ")));
        if (z2) {
            Logger.d(f62092f, "should follow input stream started, url=", str, ", result=", Boolean.valueOf(z2));
        }
        D(str);
        return z2;
    }

    private void C(String str) {
        try {
            Logger.d(f62092f, "print CI collection (", str, ")==========   by session ID (", Integer.valueOf(this.ap.size()), " items) ==============");
            synchronized (this.ap) {
                for (String str2 : this.ap.keySet()) {
                    Logger.d(f62092f, "print CI collection key=", str2);
                    e(this.ap.get(str2), str);
                }
            }
        } catch (Throwable th) {
            Logger.e(f62092f, "Exception in print CI collection", th);
            if (this.ap == null) {
                Logger.d(f62092f, "print CI collection list was null, initializing");
                this.ap = new ConcurrentHashMap<>();
            }
        }
    }

    private void e(CreativeInfo creativeInfo, String str) {
        if (creativeInfo == null) {
            Logger.d(f62092f, "print CI collection - CI is null");
            return;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "print CI collection ";
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = "\n, CI : ";
        objArr[3] = creativeInfo.ac();
        Logger.printFullVerboseLog(f62092f, objArr);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public class FyberOnGlobalImpressionDataListener implements OnGlobalImpressionDataListener {
        public FyberOnGlobalImpressionDataListener() {
        }

        @Override // com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener
        public void onImpression(String s2, String s1, ImpressionData impressionData) {
            Logger.d(FyberDiscovery.f62092f, "on impression started, string1: ", s2, ", string2: ", s1, ", impression data: ", impressionData.toString());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    private String M(String str) {
        for (String str2 : f62086as) {
            str = k.f(str, str2);
        }
        return H(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(View view) {
        j(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        j(view);
    }

    private void j(View view) {
        Context contextM = SafeDK.getInstance().m();
        int identifier = contextM.getResources().getIdentifier("ia_tv_skip", "id", contextM.getPackageName());
        int identifier2 = contextM.getResources().getIdentifier("ia_iv_close_button", "id", contextM.getPackageName());
        Logger.d(f62092f, "handle on view click - ia_tv_skip resId=", Integer.valueOf(identifier), ", ia_iv_close_button resId=", Integer.valueOf(identifier2));
        if (view.getId() == identifier || view.getId() == identifier2) {
            Logger.d(f62092f, "handle on view click - view type is =", view.getClass().getName());
            if (view instanceof TextView) {
                Logger.d(f62092f, "handle on view click - clicked the 'skip' TextView, calling CI manager on video completed");
                CreativeInfoManager.onVideoCompleted(h.f63176p, "view-click");
                return;
            } else {
                Logger.d(f62092f, "handle on view click - clicked view is not of type 'TextView'. exiting function");
                return;
            }
        }
        Logger.d(f62092f, "handle on view click - clicked view is not the 'skip' or 'close' TextView.");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!super.e(view) && (!(view instanceof ViewGroup) || !view.getClass().getName().startsWith(f62090d))) {
            return false;
        }
        Logger.d(f62092f, "is ad view: ", view.getClass().getName(), " is a Fyber ViewGroup ");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(f62089c);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith(f62091e)) {
                String strA = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                String strRemove = aq.remove(strA);
                Logger.d(f62092f, "extract ad info found, hash: ", strA, ", sessionId: ", strRemove);
                return strRemove;
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str) {
        return super.a(str) || str.startsWith(f62084ak);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return super.b(str) || str.endsWith(al);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean c(String str) {
        return super.c(str) || str.endsWith(am);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(String str) {
        return super.d(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String l(String str) {
        if (str != null && (str.contains(ag) || str.contains(ai))) {
            return k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType k(String str) {
        if (str != null) {
            if (str.contains(ag)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(ai)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : aj) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        if (!(view instanceof TextureView) || !view.getClass().getName().contains(f62090d)) {
            return false;
        }
        Logger.d(f62092f, "native video player identified, view: ", view);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        if ((view instanceof TextureView) && view.getClass().getName().contains(f62090d) && view.isShown()) {
            return false;
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z2 = true;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            z2 = z2 && b(viewGroup.getChildAt(i2));
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        e.a(this.at, "FyberDiscovery:creativeInfosBySdkImpressionUrl");
        e.a(this.ap, "FyberDiscovery:creativeInfosBySessionId");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        if (creativeInfo != null && creativeInfo.h() != null && creativeInfo.h().contains(f62085ao) && (adNetworkDiscoveryJ = CreativeInfoManager.j(h.f63168h)) != null) {
            return adNetworkDiscoveryJ.a(creativeInfo);
        }
        return super.a(creativeInfo);
    }
}
