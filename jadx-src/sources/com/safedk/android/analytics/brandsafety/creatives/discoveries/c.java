package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.brandsafety.creatives.infos.AppLovinCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class c extends d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f62148S = "AppLovinDiscovery";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f62149T = "json_v3!";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f62150U = "ad_size";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final String f62151V = "ad_format";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String f62152W = "REWARD";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f62153X = "ad_type";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f62154Y = "REGULAR";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f62155Z = "VIDEOA";

    /* JADX INFO: renamed from: aB, reason: collision with root package name */
    private static final String f62156aB = "server_parameters";

    /* JADX INFO: renamed from: aC, reason: collision with root package name */
    private static final String f62157aC = "ortb_response";

    /* JADX INFO: renamed from: aD, reason: collision with root package name */
    private static final String f62158aD = "version";
    private static final String aE = "value";

    /* JADX INFO: renamed from: aF, reason: collision with root package name */
    private static final String f62159aF = "native";
    private static final String aG = "link";
    private static final String aH = "assets";
    private static final String aI = "title";
    private static final String aJ = "text";
    private static final String aK = "img";

    /* JADX INFO: renamed from: aL, reason: collision with root package name */
    private static final String f62160aL = "id";
    private static final String aM = "type";
    private static final String aN = "url";

    /* JADX INFO: renamed from: aO, reason: collision with root package name */
    private static final String f62161aO = "w";

    /* JADX INFO: renamed from: aP, reason: collision with root package name */
    private static final String f62162aP = "h";
    private static final String aQ = "video";
    private static final String aR = "vasttag";
    private static final String aS = "data";

    /* JADX INFO: renamed from: aT, reason: collision with root package name */
    private static final String f62163aT = "fallback";
    private static final String aU = "clicktrackers";
    private static final String aV = "imptrackers";
    private static final String aW = "eventtrackers";
    private static final String aX = "click_tracking_urls";
    private static final String aY = "manual";
    private static final String aZ = "ad_info";
    private static final String aa = "zone_id";
    private static final String ab = "event_id";
    private static final String ac = "clcodes";
    private static final String ad = "dsp_name";
    private static final String ae = "is_js_tag_ad";
    private static final String af = "html";
    private static final String ag = "html_template";
    private static final String ah = "status";
    private static final String ai = "ads";
    private static final String aj = "click_url";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f62164ak = "&listing=";
    private static final String al = "video";
    private static final String am = "ad_id";
    private static final String an = "clcode";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f62165ao = "bid_response";
    private static final String ap = "creative_id";
    private static final String aq = "adomain";
    private static final String ar = "third_party_ad_placement_id";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f62166as = "xml";
    private static final String at = "stream_url";
    private static final String au = "network_name";
    private static final String av = "HOSTED_HTML_UNIVERSAL_VIDEO";

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private static final String f62167aw = "HOSTED_HTML_UNIVERSAL_REWARD";
    private static final String ax = "HOSTED_HTML_UNIVERSAL";
    private static final String ay = "res1.applovin.com";
    private static final String az = "/collage";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62168b = "video";

    /* JADX INFO: renamed from: bA, reason: collision with root package name */
    private static final String f62169bA = "productCatalogBannerImageUrl";
    private static final String bB = "imageUrl";
    private static MessageDigest bE = null;
    private static final String ba = "ad_unit_id";
    private static final String bb = "name";
    private static final int bc = 200;
    private static final String be = "event_type=skip";
    private static final String bf = "exchange=APPLOVIN";
    private static String bg = null;
    private static final int bh = 15;
    private static final String bo = "&current_retry_attempt=";
    private static final String bp = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.SafeDKWebAppInterface.logMessage===\"function\"){window.SafeDKWebAppInterface.logMessage(message)}else{console.log(\"SafeDKWebApInterface log object missing\")}}catch(error){}};var isElementOnTop=function(element){var rect=element.getBoundingClientRect();var x=rect.left+rect.width/2;var y=rect.top+rect.height/2;var topElement=document.elementFromPoint(x,y);var result=element===topElement||element.contains(topElement);log(\"is element on top: \"+result);return result};var addObservers=function(){try{var isContainerExpanded=false;var privacyElements=[];var isContainerExpanded=false;var elementBigAd=document.getElementById(\"al_bigAdInfo\");if(elementBigAd){privacyElements.push(elementBigAd)}var elementOutput=document.getElementById(\"al_optout_container_expanded\");if(elementOutput){privacyElements.push(elementOutput);isContainerExpanded=true}var backgroundElements=document.querySelectorAll('div[class^=\"_background_\"]');if(backgroundElements.length>0){for(var i=0;i<backgroundElements.length;i++){privacyElements.push(backgroundElements[i])}}for(var j=0;j<privacyElements.length;j++){var privacyElement=privacyElements[j];if(privacyElement&&privacyElement.style){var displayState=privacyElement.style.display;var visibility=getComputedStyle(privacyElement).visibility;var isVisible=visibility==\"visible\";if(isContainerExpanded&&isVisible){isVisible=privacyElement.offsetWidth!=0&&privacyElement.offsetHeight!=0}var privacyElementText=privacyElement.textContent.trim();var isInstallText=privacyElementText!=null&&privacyElementText.toLowerCase().includes(\"install\");var isSingleWord=privacyElementText.trim().split(/\\s+/).length===1;if((!isSingleWord||!isInstallText)&&(displayState!=\"none\"&&displayState!=\"\"||isVisible)){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyElement.safedkPrivacyDialogObserver!=true){privacyElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":var isVisible=getComputedStyle(mutation.target).visibility==\"visible\";if(mutation.target.id==\"al_optout_container_expanded\"){isVisible=mutation.target.offsetWidth!=0&&mutation.target.offsetHeight!=0}var composedStyle=getComputedStyle(mutation.target).display;var privacyElementText=privacyElement.textContent.trim();var isInstallText=privacyElementText!=null&&privacyElementText.toLowerCase().includes(\"install\");var isSingleWord=privacyElementText.trim().split(/\\s+/).length===1;if((!isSingleWord||!isInstallText)&&(isVisible||composedStyle==\"block\"||composedStyle!=\"none\"&&displayState!=\"\")){if(typeof window.SafeDKWebAppInterface.requestNoSampling===\"function\"){window.SafeDKWebAppInterface.requestNoSampling(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\",\"class\"]};observer.observe(privacyElement,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}}}}}}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}};addObservers();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addObservers()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.SafeDKWebAppInterface.postMessage===\"function\"){window.SafeDKWebAppInterface.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface SafeDKWebAppInterface object missing\")}}})();\n";
    private static final String bq = "{PLACEMENT}";
    private static final String br = "(\\/)([A-Za-z0-9]{8}_)([^'\"\\?]*?['\"\\?])";
    private static final String bs = "(ad[-_A-Za-z_\\/]+[0-9]*[_\\/])(index\\.js)";
    private static final String bt = "(?:file|http[s]?):\\/{2,3}.*?([^\\/'\\\"\\?]*)(['\\\"\\?])";
    private static final String bu = "[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}";
    private static final String bv = "(<head>\\s*)(<script.*?</script>)";
    private static final String bw = "open";
    private static final String bx = "redirectUrl";
    private static final String by = "endcard";
    private static final String bz = "productCatalog";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62170c = "playable";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62171d = "metaData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62172e = "creativeSetId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62173f = "ah_parameters";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62174g = "ad.package_name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62175h = "template";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62176i = ".applovin.com/redirect";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62177j = "n";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62178k = "applovin://com.applovin.sdk/adservice/expand_ad";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62179l = "SSP_MRAID";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62181n = "APPLOVIN_EXCHANGE";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f62182o = "APPLOVIN_NETWORK";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f62183p = "APPLOVIN_DIRECTSOLD";
    private final ConcurrentHashMap<String, CreativeInfo> bk;
    private final ConcurrentHashMap<String, CreativeInfo> bl;
    private final Map<String, a> bm;
    private final LimitedConcurrentHashMap<String, String> bn;
    private static final String[] aA = {"jpeg", "jpg", "png", "gif", "raw"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f62180m = {"applovin://com.applovin.sdk/webview_event"};
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> bi = new LimitedConcurrentHashMap<>(15);
    private static final LimitedConcurrentHashMap<String, String> bj = new LimitedConcurrentHashMap<>(15);
    private static final List<String> bC = Arrays.asList("a.applovin.com/4.0/ad", "a.applvn.com/4.0/ad", "a4.applovin.com/4.0/ad", "a4.applvn.com/4.0/ad");
    private static boolean bD = false;
    private static final String bd = "BANNER_NATIVE";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static List<String> f62184q = Arrays.asList("BANNER_GRAPHIC_BLANK_UNIFIED", "BANNER_STOREKIT", bd, "BANNER_STOREASSETS");

    static {
        try {
            bE = MessageDigest.getInstance("SHA-256");
        } catch (Throwable th) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f62193a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f62194b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f62195c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f62196d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f62197e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f62198f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f62199g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f62200h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f62201i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f62202j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f62203k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f62204l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f62205m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f62206n = -1;

        private b() {
        }
    }

    public static void h() {
        bD = true;
    }

    public c() {
        super(h.f63161a, f62148S);
        this.bk = new ConcurrentHashMap<>();
        this.bl = new ConcurrentHashMap<>();
        this.bm = new HashMap();
        this.bn = new LimitedConcurrentHashMap<>(15);
        bg = n.a();
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, true);
        this.f62226C.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, bp);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, true);
        this.f62226C.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, true);
        this.f62226C.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, "APPLOVIN_EXCHANGE");
        this.f62226C.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "APPLOVIN_NETWORK_&_APPLOVIN_DIRECTSOLD");
        this.f62226C.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 4800000L);
        this.f62226C.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 4800000L);
        AsyncTask.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.c.1
            @Override // java.lang.Runnable
            public void run() {
                com.safedk.android.analytics.brandsafety.creatives.h.b("<vast><ad id=\"stam\"></ad></vast>", false, "");
            }
        });
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, byte[] bArr, Map<String, List<String>> map, a aVar) {
        String strSubstring;
        int iIndexOf = str.indexOf(bo);
        if (iIndexOf <= -1) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iIndexOf);
        }
        return super.a(strSubstring, str2, bArr, map, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d A[Catch: all -> 0x0483, TryCatch #2 {all -> 0x0483, blocks: (B:129:0x030b, B:132:0x031d, B:134:0x0325, B:135:0x0327, B:136:0x035e, B:138:0x0364, B:140:0x0385, B:143:0x0392, B:145:0x039a, B:97:0x025a, B:99:0x0262, B:101:0x0277, B:104:0x027f, B:106:0x0283, B:108:0x028f, B:111:0x029c, B:113:0x02a8, B:128:0x02fa, B:114:0x02ad, B:116:0x02b9, B:117:0x02be, B:119:0x02ca, B:120:0x02cf, B:122:0x02db, B:123:0x02e0, B:125:0x02ec, B:126:0x02f1, B:103:0x027d), top: B:195:0x025a }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0451  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List<com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo>] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, a aVar, byte[] bArr) throws JSONException {
        String string;
        ArrayList arrayList;
        BrandSafetyUtils.AdType adType;
        BrandSafetyEvent.AdFormatType adFormatType;
        String string2;
        String strB;
        BrandSafetyEvent.AdFormatType adFormatType2;
        String strOptString;
        String str3;
        a aVarRemove;
        BrandSafetyUtils.AdType adType2;
        BrandSafetyEvent.AdFormatType adFormatType3;
        BrandSafetyUtils.AdType adType3;
        String str4;
        String str5;
        String str6;
        int i2;
        ArrayList arrayList2;
        CreativeInfo creativeInfoA;
        a aVar2;
        ?? r11 = aVar;
        int i3 = "ads";
        Logger.d(f62148S, "generate info, url: ", str);
        ArrayList arrayList3 = new ArrayList();
        try {
        } catch (Throwable th) {
            th = th;
            r11 = arrayList3;
        }
        if (!n.l(str2)) {
            return new ArrayList();
        }
        JSONObject jSONObject = new JSONObject(str2);
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!jSONObject.has("ads")) {
            return new ArrayList();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            if (jSONArray.length() == 0 || jSONObject.getInt("status") != 200) {
                return null;
            }
            String strOptString2 = jSONObject.optString(an);
            Logger.d(f62148S, "adId = ", strOptString2);
            if (TextUtils.isEmpty(strOptString2) && !bD) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ac);
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    string = jSONArrayOptJSONArray.getString(0);
                } else {
                    String strOptString3 = jSONObject.optString("ad_format", null);
                    String strOptString4 = jSONObject.optString("event_id");
                    if (strOptString3 != null) {
                        try {
                            aVar2 = new a(this, strOptString4, BrandSafetyEvent.AdFormatType.valueOf(strOptString3));
                        } catch (IllegalArgumentException e2) {
                            Logger.d(f62148S, "generate info, Max prefetch parameters: unsupported ad format=", strOptString3);
                            return null;
                        }
                    } else {
                        aVar2 = new a(strOptString4);
                    }
                    Logger.d(f62148S, "generate info, Max prefetch parameters: eventId=", aVar2.f62186a, ", adFormat=", aVar2.f62187b);
                    a(str, map, jSONArray, aVar2);
                    return null;
                }
            } else {
                string = strOptString2;
            }
            ArrayList arrayList4 = arrayList3;
            JSONArray jSONArray2 = jSONArray;
            String str7 = string;
            try {
                if (jSONObject.has(f62150U)) {
                    String string3 = jSONObject.getString(f62150U);
                    Logger.d(f62148S, "generate info, json ad_size is ", string3);
                    if (BrandSafetyUtils.f61447m.equals(string3) || BrandSafetyUtils.f61448n.equals(string3)) {
                        adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                        adType = BrandSafetyUtils.AdType.BANNER;
                    } else if (BrandSafetyUtils.f61449o.equals(string3)) {
                        adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                        adType = BrandSafetyUtils.AdType.MREC;
                    } else if ("NATIVE".equals(string3)) {
                        adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
                        adType = BrandSafetyUtils.AdType.NATIVE;
                    } else {
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        adFormatType = null;
                    }
                    Object[] objArr = new Object[6];
                    objArr[0] = "generate info, json ad_size : ad format = ";
                    objArr[1] = adFormatType;
                    objArr[2] = ", ad type = ";
                    objArr[3] = adType;
                    objArr[4] = QiDPjiOCZHDS.kjFFDi;
                    objArr[5] = jSONObject.has("ad_format") ? jSONObject.get("ad_format") : "NA";
                    Logger.d(f62148S, objArr);
                } else {
                    if (jSONObject.has("ad_format")) {
                        String string4 = jSONObject.getString("ad_format");
                        Logger.d(f62148S, "generate info, json ad_format is ", string4);
                        if (string4.equals(BrandSafetyUtils.f61447m) || string4.equals(BrandSafetyUtils.f61448n)) {
                            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                            adType = BrandSafetyUtils.AdType.BANNER;
                        } else if (string4.equals(BrandSafetyUtils.f61449o)) {
                            adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                            adType = BrandSafetyUtils.AdType.MREC;
                        } else if (string4.equals("NATIVE")) {
                            adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
                            adType = BrandSafetyUtils.AdType.NATIVE;
                        } else if (string4.equals(BrandSafetyUtils.f61444j)) {
                            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (string4.equals(f62152W)) {
                            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (!string4.equals(BrandSafetyUtils.f61446l)) {
                            adFormatType = null;
                            adType = null;
                        } else {
                            adFormatType = BrandSafetyEvent.AdFormatType.APPOPEN;
                            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        }
                        Logger.d(f62148S, "generate info, prefetch parameters adFormat: ", adFormatType);
                    } else {
                        Logger.d(f62148S, "generate info, json ad_format has no value, setting ad type to default : INTERSTITIAL ");
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                        adFormatType = null;
                    }
                    Logger.d(f62148S, "generate info, json ad_format result : ad format = ", adFormatType, " , ad type = ", adType.name());
                }
                if (!jSONObject.has(f62153X)) {
                    string2 = null;
                } else {
                    string2 = jSONObject.getString(f62153X);
                }
                strB = b(jSONObject);
                adFormatType2 = adFormatType;
                Logger.d(f62148S, "generate info, placementId = ", strB);
                strOptString = jSONObject.optString("event_id", null);
                Logger.d(f62148S, "generate info, eventId = ", strOptString);
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r11 = strB;
                }
            } catch (Throwable th4) {
                th = th4;
                arrayList = arrayList4;
            }
            if (aVar != null) {
                Logger.d(f62148S, "generate info, got MAX prefetch parameters: ", aVar);
                adFormatType3 = aVar.f62187b;
                str3 = str7;
                adType3 = adType;
                str4 = strB;
                str5 = aVar.f62186a;
            } else {
                str3 = str7;
                try {
                    aVarRemove = this.bm.remove(str3);
                } catch (Throwable th5) {
                    th = th5;
                    arrayList = arrayList4;
                    r11 = arrayList;
                }
                if (aVarRemove == null) {
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = "generate info, no MAX prefetch parameters found for adId: ";
                    objArr2[1] = str3;
                    objArr2[2] = ", eventId: ";
                    objArr2[3] = strOptString;
                    Logger.d(f62148S, objArr2);
                    return arrayList4;
                }
                BrandSafetyUtils.AdType adType4 = adType;
                Logger.d(f62148S, "generate info, find MAX prefetch parameters: ", aVarRemove);
                String str8 = aVarRemove.f62186a;
                if (strB != null) {
                    boolean zIsEmpty = strB.isEmpty();
                    String str9 = strB;
                    if (zIsEmpty) {
                        str9 = aVarRemove.f62188c;
                    }
                    if (aVarRemove.f62187b != null) {
                        if (aVarRemove.f62187b.name().equals(BrandSafetyUtils.f61447m) || aVarRemove.f62187b.name().equals(BrandSafetyUtils.f61448n)) {
                            adFormatType3 = BrandSafetyEvent.AdFormatType.BANNER;
                            adType2 = BrandSafetyUtils.AdType.BANNER;
                        } else if (aVarRemove.f62187b.name().equals(BrandSafetyUtils.f61449o)) {
                            adFormatType3 = BrandSafetyEvent.AdFormatType.MREC;
                            adType2 = BrandSafetyUtils.AdType.MREC;
                        } else if (aVarRemove.f62187b.name().equals("NATIVE")) {
                            adFormatType3 = BrandSafetyEvent.AdFormatType.NATIVE;
                            adType2 = BrandSafetyUtils.AdType.NATIVE;
                        } else if (aVarRemove.f62187b.name().equals(BrandSafetyUtils.f61444j)) {
                            adFormatType3 = BrandSafetyEvent.AdFormatType.INTER;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVarRemove.f62187b.name().equals(f62152W)) {
                            adFormatType3 = BrandSafetyEvent.AdFormatType.REWARD;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVarRemove.f62187b.name().equals(BrandSafetyUtils.f61446l)) {
                            adFormatType3 = BrandSafetyEvent.AdFormatType.APPOPEN;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        }
                        Logger.d(f62148S, "generate info, MAX prefetch parameters adFormat: ", adFormatType3);
                        adType3 = adType2;
                        str4 = str9;
                        str5 = str8;
                    } else {
                        adType2 = adType4;
                        adFormatType3 = adFormatType2;
                        Logger.d(f62148S, "generate info, MAX prefetch parameters adFormat: ", adFormatType3);
                        adType3 = adType2;
                        str4 = str9;
                        str5 = str8;
                    }
                }
                Object[] objArr3 = new Object[i3];
                objArr3[0] = "generate info, exception parsing prefetch: ";
                objArr3[1] = th.getMessage();
                objArr3[2] = th;
                Logger.d(f62148S, objArr3);
                return r11;
            }
            Logger.d(f62148S, "generate info, adTypeJson = ", string2);
            if (adFormatType3 == null && string2 != null && string2.equals(f62155Z)) {
                adFormatType3 = BrandSafetyEvent.AdFormatType.REWARD;
            }
            Logger.d(f62148S, "generate info, ad format = ", adFormatType3);
            String strOptString5 = jSONObject.optString("dsp_name");
            Logger.d(f62148S, "generate info, dsp name = ", strOptString5);
            Logger.d(f62148S, "generate info, network name = ", jSONObject.optString("network_name"));
            int i5 = 0;
            arrayList4 = arrayList4;
            while (i5 < jSONArray2.length()) {
                JSONArray jSONArray3 = jSONArray2;
                JSONObject jSONObject2 = jSONArray3.getJSONObject(i5);
                Logger.printFullVerboseLog(f62148S, "generate info, json object is ", jSONObject2.toString());
                if (jSONObject2.has("html") || jSONObject2.has(ag)) {
                    jSONArray2 = jSONArray3;
                    String str10 = str5;
                    str6 = str5;
                    ArrayList arrayList5 = arrayList4;
                    i2 = i5;
                    try {
                        creativeInfoA = a(str3, adType3, adFormatType3, str4, str10, strOptString5, jSONObject2, str);
                        arrayList2 = arrayList5;
                        if (creativeInfoA != null) {
                            if (aVar != null) {
                                if (aVar.f62190e != null) {
                                    creativeInfoA.i(aVar.f62190e);
                                    Logger.d(f62148S, "generate info, setting adDomain : ", aVar.f62190e);
                                }
                                if (aVar.f62191f != null && creativeInfoA.M() == BrandSafetyUtils.AdType.NATIVE) {
                                    String strH = creativeInfoA.h();
                                    if (TextUtils.isEmpty(strH)) {
                                        creativeInfoA.e(aVar.f62191f);
                                    } else {
                                        creativeInfoA.e(strH + "/" + aVar.f62191f);
                                    }
                                    Logger.d(f62148S, "generate info, setting native template: ", aVar.f62191f);
                                }
                            }
                            e(creativeInfoA);
                            arrayList2.add(creativeInfoA);
                            Logger.printFullVerboseLog(f62148S, "generate info, added CI: ", creativeInfoA);
                        }
                        i5 = i2 + 1;
                        arrayList4 = arrayList2;
                        str5 = str6;
                    } catch (Throwable th6) {
                        th = th6;
                        r11 = arrayList5;
                    }
                } else {
                    if (!jSONObject2.has(f62157aC)) {
                        jSONArray2 = jSONArray3;
                        str6 = str5;
                        creativeInfoA = null;
                        arrayList2 = arrayList4;
                        i2 = i5;
                    } else {
                        jSONArray2 = jSONArray3;
                        creativeInfoA = a(str3, adType3, adFormatType3, str4, strOptString5, str5, jSONObject2);
                        str6 = str5;
                        arrayList2 = arrayList4;
                        i2 = i5;
                    }
                    if (creativeInfoA != null) {
                    }
                    i5 = i2 + 1;
                    arrayList4 = arrayList2;
                    str5 = str6;
                }
            }
            return arrayList4;
        } catch (JSONException e3) {
            Logger.d(f62148S, "Cannot parse json, skipping.");
            return new ArrayList();
        }
        i3 = 3;
        Object[] objArr32 = new Object[i3];
        objArr32[0] = "generate info, exception parsing prefetch: ";
        objArr32[1] = th.getMessage();
        objArr32[2] = th;
        Logger.d(f62148S, objArr32);
        return r11;
    }

    private void e(CreativeInfo creativeInfo) {
        int i2;
        HashSet<String> hashSetR = creativeInfo.r();
        if (hashSetR == null) {
            i2 = 0;
        } else {
            i2 = 0;
            for (String str : hashSetR) {
                if (str.contains(ay)) {
                    for (String str2 : aA) {
                        if (str.endsWith(str2)) {
                            i2++;
                        }
                    }
                }
            }
        }
        Logger.d(f62148S, "set e-commerce collage ad - counter= ", Integer.valueOf(i2));
        if (i2 >= 3) {
            creativeInfo.d(true);
            creativeInfo.f(az);
        }
    }

    private String a(JSONObject jSONObject, String str, String str2, String str3) {
        String strReplace = null;
        if (!(str2 != null && str2.startsWith(f62179l))) {
            String strOptString = jSONObject.optString("click_url", null);
            if (strOptString != null && strOptString.startsWith(f62164ak)) {
                Logger.d(f62148S, "extract clickUrl - clickUrl extraction from json is invalid, will be set to null. clickUrl= ", strOptString);
            } else {
                strReplace = strOptString;
            }
            if (strReplace == null && !TextUtils.isEmpty(str)) {
                strReplace = E(str);
                if (strReplace == null) {
                    strReplace = a(g.a("(market:[^'\"]+)['\"]"), str);
                }
                if (strReplace == null) {
                    strReplace = a(g.a("clickUrl: '([^']+)'"), str);
                }
                if (strReplace == null && (strReplace = a(g.a("\"URL over\"[ ]href=\"(.*?)\"", 2), str)) != null && strReplace.startsWith("javascript:")) {
                    strReplace = i(strReplace, str);
                }
                if (strReplace == null && str3 != null && f62184q.contains(str3.trim().split(" ")[0])) {
                    strReplace = a(e.f(), str);
                    Logger.d(f62148S, "extract clickUrl - clickUrl ad, ", str3, " = ", strReplace);
                }
            }
            if (strReplace == null && !TextUtils.isEmpty(str)) {
                Logger.d(f62148S, "extract clickUrl - click_url attempting extracting Mraid click url on html ", str);
                Matcher matcher = g.a("trackingUrl = (\\'|\\\\\\\"|\\\")(.*?)(\\'|\\\\\\\"|\\\")(;| \\+)", 2).matcher(str);
                if (matcher.find() && matcher.group(2) != null) {
                    try {
                        strReplace = matcher.group(2).replace("\\/", "/");
                        Logger.d(f62148S, "extract clickUrl - click_url extracting via Mraid click url regex : ", strReplace);
                    } catch (Throwable th) {
                        Logger.d(f62148S, "Exception extracting Mraid click url : ", th.getMessage(), th);
                    }
                }
            }
            Logger.d(f62148S, "extract clickUrl - downstream struct: ", str2, " click url is: ", strReplace);
            return strReplace;
        }
        Logger.d(f62148S, "extract clickUrl - SSP Mraid - not extracting click url from prefetch");
        return null;
    }

    public static Pattern B(String str) {
        return g.a("function\\s+" + str + ".*?\\{.*?targetUrl\\s*=\\s*\\\\?\\\"(.*?)\\\\?\\\"", 32);
    }

    private String i(String str, String str2) {
        Logger.d(f62148S, "resolve click url started with click url: ", str);
        String strSubstring = str.substring("javascript:".length());
        if (strSubstring.endsWith(";")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        if (strSubstring.endsWith("()")) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
        }
        Matcher matcher = B(strSubstring).matcher(str2);
        if (matcher.find() && matcher.group(1) != null) {
            try {
                str = matcher.group(1);
                Logger.d(f62148S, "resolve click url - click_url extracting via target url regex : ", str);
                return str;
            } catch (Throwable th) {
                Logger.d(f62148S, "Exception extracting resolve click url: ", th.getMessage(), th);
                return str;
            }
        }
        return str;
    }

    private void b(String str, CreativeInfo creativeInfo) {
        try {
            Matcher matcher = g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)script\\s+type=\"application/json\"\\s+id=\"ad-context\"(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)(.*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)/script").matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                String strTrim = matcher.group(1).trim();
                Logger.d(f62148S, strTrim);
                JSONObject jSONObject = new JSONObject(strTrim);
                if (jSONObject.has("open")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("open");
                    if (jSONObject2.has(bx)) {
                        String string = jSONObject2.getString(bx);
                        Logger.d(f62148S, "extract applovin catalog data - found redirect url: ", string);
                        if (TextUtils.isEmpty(creativeInfo.O())) {
                            creativeInfo.a(string, true);
                        }
                    }
                }
                if (jSONObject.has(by)) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(by);
                    if (jSONObject3.has(bz)) {
                        JSONArray jSONArray = jSONObject3.getJSONArray(bz);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String string2 = jSONArray.getJSONObject(i2).getString(bB);
                            Logger.d(f62148S, "extract applovin catalog data - found image url: ", string2);
                            creativeInfo.y(string2);
                        }
                    }
                    if (jSONObject3.has(f62169bA)) {
                        String string3 = jSONObject3.getString(f62169bA);
                        Logger.d(f62148S, "extract applovin catalog data - found product catalog: ", string3);
                        creativeInfo.y(string3);
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d(f62148S, "extract applovin catalog data - exception occurred: ", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, JSONObject jSONObject, String str5) throws JSONException {
        String str6;
        String str7;
        String strOptString;
        String str8;
        String string;
        boolean z2;
        String str9;
        String strA;
        String strOptString2;
        boolean z3;
        int i2;
        ?? r7;
        int i3;
        String strOptString3 = jSONObject.optString("html");
        ArrayList<String> arrayListM = null;
        if (adType == BrandSafetyUtils.AdType.BANNER || adType == BrandSafetyUtils.AdType.MREC) {
            String strC = C(strOptString3);
            String strA2 = a(e.h(), strOptString3);
            Logger.printFullVerboseLog(f62148S, "parse ad, prefetch bannerType = ", strA2, ", html hash = ", strC, ", content = ", strOptString3);
            str6 = strC;
            str7 = strA2;
        } else {
            str7 = null;
            str6 = null;
        }
        if (!TextUtils.isEmpty(strOptString3)) {
            strOptString = strOptString3;
        } else {
            strOptString = jSONObject.optString(ag);
        }
        String strOptString4 = jSONObject.optString(at);
        String strOptString5 = jSONObject.optString("video");
        if (strOptString5.isEmpty()) {
            strOptString5 = a(e.g(), strOptString);
        }
        String strA3 = a(g.a("<script .*id=\"ad-context\">(.*?)</script>"), strOptString);
        if (strA3 != null && k.n(strA3)) {
            JSONObject jSONObject2 = new JSONObject(strA3);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("video");
            if (jSONObjectOptJSONObject != null && TextUtils.isEmpty(strOptString5)) {
                strOptString5 = jSONObjectOptJSONObject.optString("url");
            }
            boolean zHas = jSONObject2.has("playable");
            if (jSONObject2.has(f62171d) && jSONObject2.getJSONObject(f62171d).has(f62172e)) {
                string = jSONObject2.getJSONObject(f62171d).getString(f62172e);
            } else {
                string = null;
            }
            Logger.d(f62148S, "parse ad, new template, video: ", strOptString5, ", is playable? ", Boolean.valueOf(zHas), ", creativeId: ", string);
            str8 = strOptString5;
            z2 = zHas;
        } else {
            str8 = strOptString5;
            string = null;
            z2 = false;
        }
        String strA4 = a(e.h(), strOptString);
        if (strA4 != null) {
            str9 = strA4.trim() + "/";
        } else if (!z2) {
            str9 = strA4;
        } else {
            str9 = "playable/";
        }
        boolean z4 = (TextUtils.isEmpty(str8) && TextUtils.isEmpty(strOptString4)) ? false : true;
        String strA5 = a(jSONObject, strOptString, str9, str7);
        String strF = F(strOptString);
        if (!TextUtils.isEmpty(strF)) {
            strA = strF;
        } else {
            strA = a(jSONObject);
        }
        if (string != null) {
            strOptString2 = string;
        } else {
            strOptString2 = jSONObject.optString("ad_id");
        }
        if (jSONObject.has("network_name") && jSONObject.getString("network_name").equals(CreativeInfoManager.f61953h) && jSONObject.has(ae)) {
            boolean zOptBoolean = jSONObject.optBoolean(ae);
            Logger.d(f62148S, "parse ad, field ", ae, " value is ", Boolean.valueOf(zOptBoolean));
            z3 = zOptBoolean;
        } else {
            z3 = false;
        }
        String str10 = strOptString;
        String str11 = str8;
        String str12 = str7;
        String str13 = str6;
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, strOptString2, strA5, str11, adFormatType, str2, bg, str9, str4, str3, strA, z4, z2, z3);
        b(str10, (CreativeInfo) appLovinCreativeInfo);
        if (this.bn.containsKey(str5)) {
            String strRemove = this.bn.remove(str5);
            i2 = 4;
            r7 = 1;
            i3 = 2;
            Logger.d(f62148S, "parse ad - found ad unit id: ", strRemove, ", urlToAdUnitId contains the key url: ", str5);
            appLovinCreativeInfo.g(strRemove);
        } else {
            i2 = 4;
            r7 = 1;
            i3 = 2;
            Logger.printFullVerboseLog(f62148S, "parse ad - urlToAdUnitId contains the key url: ", str5, " the keys are: ", this.bn.keySet());
        }
        Object[] objArr = new Object[i2];
        objArr[0] = "parse ad, adding CI id: ";
        objArr[r7] = str;
        objArr[i3] = ", CI: ";
        objArr[3] = appLovinCreativeInfo;
        Logger.d(f62148S, objArr);
        if (adType.equals(BrandSafetyUtils.AdType.BANNER) || adType.equals(BrandSafetyUtils.AdType.MREC)) {
            String str14 = str2 + "_" + str3 + "_" + h.f63161a;
            synchronized (this.bk) {
                this.bk.put(str14, appLovinCreativeInfo);
                if (str13 != null) {
                    bj.put(str, str13);
                    this.bk.put(str13, appLovinCreativeInfo);
                }
            }
        }
        String strOptString6 = jSONObject.optString(f62166as);
        if (!TextUtils.isEmpty(strOptString6)) {
            a(appLovinCreativeInfo, str5, strOptString6, (boolean) r7);
        }
        appLovinCreativeInfo.b((List<String>) n.f(str10));
        if (!TextUtils.isEmpty(str10)) {
            appLovinCreativeInfo.a(str.hashCode());
        }
        if (n.a(str5, bC) || (str12 != null && str12.contains(bd))) {
            arrayListM = M(str10);
        }
        if (arrayListM != null && arrayListM.size() > 0) {
            for (String str15 : arrayListM) {
                Object[] objArr2 = new Object[i3];
                objArr2[0] = "parse ad, json object text ";
                objArr2[r7] = str15;
                Logger.d(f62148S, objArr2);
                appLovinCreativeInfo.z(str15);
            }
        }
        return appLovinCreativeInfo;
    }

    private String b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("zone_id")) {
            String string = jSONObject.getString("zone_id");
            Logger.d(f62148S, "generate info - found placement id in zone id - ", string);
            return string;
        }
        return "";
    }

    private CreativeInfo a(String str, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, JSONObject jSONObject) throws JSONException {
        String str5;
        String strOptString = jSONObject.optString("ad_id");
        JSONObject jSONObject2 = jSONObject.getJSONObject(f62157aC);
        String strOptString2 = jSONObject2.optString(wDgKoYAES.NZPJtqKFZbThabL);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
        int i2 = 2;
        char c2 = 0;
        int i3 = 1;
        Logger.d(f62148S, "parse native ad, rendering native ad for oRTB version: ", strOptString2);
        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("native");
        if (jSONObjectOptJSONObject != null) {
            jSONObject3 = jSONObjectOptJSONObject;
        } else {
            Logger.d(f62148S, "parse native ad, no native object, continue...");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(aG);
        JSONArray jSONArray = jSONObject3.getJSONArray(aH);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        String strOptString3 = null;
        while (i5 < jSONArray.length()) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i5);
            if (jSONObject4.has(aI)) {
                JSONObject jSONObjectOptJSONObject3 = jSONObject4.optJSONObject(aI);
                if (jSONObjectOptJSONObject3 != null) {
                    String strOptString4 = jSONObjectOptJSONObject3.optString("text");
                    if (!strOptString4.isEmpty()) {
                        arrayList.add(CreativeInfo.aM + strOptString4);
                        Object[] objArr = new Object[i2];
                        objArr[c2] = "parse native ad, processed title: ";
                        objArr[i3] = strOptString4;
                        Logger.d(f62148S, objArr);
                    }
                }
            } else if (jSONObject4.has(aG)) {
                jSONObjectOptJSONObject2 = jSONObject4.optJSONObject(aG);
            } else if (jSONObject4.has("img")) {
                int iOptInt = jSONObject4.optInt("id", -1);
                JSONObject jSONObjectOptJSONObject4 = jSONObject4.optJSONObject("img");
                if (jSONObjectOptJSONObject4 != null) {
                    int iOptInt2 = jSONObjectOptJSONObject4.optInt("type", -1);
                    String strOptString5 = jSONObjectOptJSONObject4.optString("url");
                    if (!strOptString5.isEmpty()) {
                        if (3 == iOptInt || iOptInt2 == i3) {
                            arrayList.add(CreativeInfo.f62432aO + strOptString5);
                            Logger.d(f62148S, "parse native ad, processed icon URL: ", strOptString5);
                        } else if (2 == iOptInt || iOptInt2 == 3) {
                            arrayList.add(CreativeInfo.aN + strOptString5);
                            Logger.d(f62148S, "parse native ad, processed main image URL: ", strOptString5);
                        } else {
                            Logger.d(f62148S, "parse native ad, unrecognized image: ", jSONObject4);
                            int iOptInt3 = jSONObjectOptJSONObject4.optInt(f62161aO, -1);
                            int iOptInt4 = jSONObjectOptJSONObject4.optInt("h", -1);
                            if (iOptInt3 <= 0 || iOptInt4 <= 0) {
                                Logger.d(f62148S, "parse native ad, skipping...");
                            } else if (iOptInt3 / iOptInt4 > 1.0d) {
                                Logger.d(f62148S, "parse native ad, inferring main image from ", Integer.valueOf(iOptInt3), "x", Integer.valueOf(iOptInt4), ", processed main image URL: ", strOptString5);
                                arrayList.add(CreativeInfo.aN + strOptString5);
                            } else {
                                Logger.d(f62148S, "parse native ad, inferring icon image from ", Integer.valueOf(iOptInt3), "x", Integer.valueOf(iOptInt4), ", processed icon URL: ", strOptString5);
                                arrayList.add(CreativeInfo.f62432aO + strOptString5);
                            }
                        }
                    }
                }
            } else if (jSONObject4.has("video")) {
                JSONObject jSONObjectOptJSONObject5 = jSONObject4.optJSONObject("video");
                if (jSONObjectOptJSONObject5 != null) {
                    strOptString3 = jSONObjectOptJSONObject5.optString(aR);
                    Logger.d(f62148S, "parse native ad, processed VAST video: ", strOptString3);
                }
            } else if (jSONObject4.has("data")) {
                int iOptInt5 = jSONObject4.optInt("id", -1);
                JSONObject jSONObjectOptJSONObject6 = jSONObject4.optJSONObject("data");
                if (jSONObjectOptJSONObject6 != null) {
                    int iOptInt6 = jSONObjectOptJSONObject6.optInt("type", -1);
                    String strOptString6 = jSONObjectOptJSONObject6.optString("value");
                    if (!strOptString6.isEmpty()) {
                        if (iOptInt5 == 8 || iOptInt6 == 1) {
                            arrayList.add(CreativeInfo.aS + strOptString6);
                            Logger.d(f62148S, "parse native ad, processed advertiser: ", strOptString6);
                        } else if (iOptInt5 == 4 || iOptInt6 == 2) {
                            arrayList.add(CreativeInfo.f62433aP + strOptString6);
                            Logger.d(f62148S, "parse native ad, processed body: ", strOptString6);
                        } else if (iOptInt5 == 5 || iOptInt6 == 12) {
                            arrayList.add(CreativeInfo.aQ + strOptString6);
                            Logger.d(f62148S, "parse native ad, processed cta: ", strOptString6);
                        } else if (iOptInt5 == 6 || iOptInt6 == -1) {
                            arrayList.add(CreativeInfo.aR + strOptString6);
                            Logger.d(f62148S, "parse native ad, processed star rating: ", strOptString6);
                        } else {
                            Logger.d(f62148S, "parse native ad, skipping unsupported data: ", jSONObject4);
                        }
                    }
                }
            } else {
                Logger.d(f62148S, "parse native ad, unsupported asset object: ", jSONObject4);
            }
            i5++;
            i3 = 1;
            c2 = 0;
            i2 = 2;
        }
        ArrayList arrayList2 = new ArrayList();
        if (jSONObjectOptJSONObject2 == null) {
            str5 = null;
        } else {
            String strOptString7 = jSONObjectOptJSONObject2.optString("url");
            Logger.d(f62148S, "parse native ad, processed click destination URL: ", strOptString7);
            Logger.d(f62148S, "parse native ad, processed click destination backup URL: ", jSONObjectOptJSONObject2.optString(f62163aT));
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(aU);
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList2.add(jSONArrayOptJSONArray.optString(i7));
                }
                Logger.d(f62148S, "parse native ad, processed click trackers: ", arrayList2);
            }
            str5 = strOptString7;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(aV);
        if (jSONArrayOptJSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i8));
            }
            Logger.d(f62148S, "parse native ad, processed imp trackers: ", arrayList2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray(aW);
        if (jSONArrayOptJSONArray3 != null) {
            for (int i9 = 0; i9 < jSONArrayOptJSONArray3.length(); i9++) {
                if (jSONArrayOptJSONArray3.get(i9) instanceof JSONObject) {
                    JSONObject jSONObject5 = jSONArrayOptJSONArray3.getJSONObject(i9);
                    if (jSONObject5.has("url")) {
                        arrayList2.add(jSONObject5.getString("url"));
                    }
                } else {
                    arrayList2.add(jSONArrayOptJSONArray3.getString(i9));
                }
            }
            Logger.d(f62148S, "parse native ad, processed event trackers: ", arrayList2);
        }
        if (jSONObject.has(aX)) {
            arrayList2.add(jSONObject.getString(aX));
            Logger.d(f62148S, "parse native ad, processed click tracking URLs: ", arrayList2);
        }
        String str6 = strOptString3;
        AppLovinCreativeInfo appLovinCreativeInfo = new AppLovinCreativeInfo(adType, str, strOptString, str5, null, adFormatType, str2, bg, null, str3, str4, null, false, false, false);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            appLovinCreativeInfo.A((String) it.next());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            appLovinCreativeInfo.x((String) it2.next());
        }
        if (!TextUtils.isEmpty(str6)) {
            a((CreativeInfo) appLovinCreativeInfo, (String) null, str6, false);
            appLovinCreativeInfo.e(CreativeInfo.f62454r);
        }
        Logger.d(f62148S, "parse native ad, new CI detected, ad ID: ", appLovinCreativeInfo.N(), ", event ID: ", appLovinCreativeInfo.n(), ", CI: ", appLovinCreativeInfo);
        synchronized (this.bl) {
            this.bl.put(str, appLovinCreativeInfo);
        }
        return appLovinCreativeInfo;
    }

    private String C(String str) {
        return n.a(bE.digest(n.a(str, g.a("(src\\s*=\\s*['\\\"].*?\\/)([A-Za-z0-9]{8}_)(.*?['\\\"\\?])|(url\\(.*?\\/)([A-Za-z0-9]{8}_)(.*?[)\\?])", 2), 2, "").replace(bq, "").replaceAll(br, "$1$3").replaceAll(bs, "$2").replaceAll(bt, "$1$2").replaceAll(bu, "").replaceAll(bv, "$1").getBytes(Charset.defaultCharset())));
    }

    private ArrayList<String> M(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        String strA = a(g.a("<span class=\"banner-title\">(.*?)</span>"), str);
        String strA2 = a(g.a("<span class=\"banner-description\">(.*?)</span>"), str);
        Logger.d(f62148S, "found ad text: title=", strA, ", description=", strA2);
        arrayList.add(strA);
        arrayList.add(strA2);
        return arrayList;
    }

    private void a(String str, Map<String, List<String>> map, JSONArray jSONArray, a aVar) throws JSONException {
        String str2;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String strOptString = jSONObject.optString("name");
            String strOptString2 = jSONObject.optString(f62165ao, null);
            String strOptString3 = jSONObject.optString("creative_id", null);
            String strOptString4 = jSONObject.optString("third_party_ad_placement_id");
            String strOptString5 = jSONObject.optString(aq, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f62156aB);
            if (jSONObjectOptJSONObject == null) {
                str2 = aY;
            } else {
                String strOptString6 = jSONObjectOptJSONObject.optString(f62175h);
                if (!TextUtils.isEmpty(strOptString6)) {
                    str2 = strOptString6;
                } else {
                    str2 = aY;
                }
            }
            Logger.d(f62148S, "parse Max prefetch response started url=", str, " ,max params = ", aVar.toString());
            a aVar2 = new a(aVar.f62186a, aVar.f62187b, strOptString4, strOptString3, strOptString5, str2);
            if (CreativeInfoManager.a().contains(strOptString)) {
                String strN = N(strOptString2);
                if (strN != null) {
                    Logger.d(f62148S, "parse Max prefetch response ", strOptString, " ", aVar2.f62187b, " base64 bid response is ", strOptString2);
                    CreativeInfoManager.a(strOptString, str, strN, map, aVar2);
                } else {
                    Logger.d(f62148S, "parse Max prefetch response ", strOptString, " bidder ", aVar2.f62187b, ", bid response is clcode ", strOptString2);
                    this.bm.put(strOptString2, aVar2);
                }
            } else if (strOptString2 == null) {
                Logger.d(f62148S, "parse Max prefetch response ", strOptString, " ", aVar2.f62187b, " bid response empty.");
            } else {
                if (CreativeInfoManager.a(CreativeInfoManager.c(strOptString), AdNetworkConfiguration.SHOULD_DECODE_BASE64_PREFECT_RECEIVED_BY_APPLOVIN, false)) {
                    try {
                        strOptString2 = new String(Base64.decode(strOptString2, 0));
                    } catch (Throwable th) {
                        Logger.d(f62148S, "Exception decoding payload : ", th.getMessage(), th);
                    }
                }
                Logger.d(f62148S, "parse Max prefetch response ", strOptString, " ", aVar2.f62187b, " bid response is ", strOptString2);
                CreativeInfoManager.a(strOptString, str, strOptString2, map, aVar2);
            }
        }
    }

    private static String N(String str) {
        if (str != null) {
            String[] strArrSplit = str.split("!");
            if (strArrSplit.length == 2) {
                return new String(Base64.decode(strArrSplit[1], 0));
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean A(String str) {
        Logger.d(f62148S, "should follow get url: ", str);
        return str.contains("4.0/ad");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z2;
        int iIndexOf = str.indexOf(bo);
        if (iIndexOf <= -1) {
            z2 = false;
        } else {
            str = I(str.substring(0, iIndexOf));
            if (!this.f62227D.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(str))) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        boolean z3 = z2 || str.contains("4.0/ad") || CreativeInfoManager.i(str);
        if (z3) {
            Logger.d(f62148S, "should follow input stream: ", str);
        }
        return z3;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    private String O(String str) {
        Logger.d(f62148S, "get ad ID from resource: url is an html doc");
        Matcher matcher = g.a("window.al_clcode\\s*=\\s*'(.*?)'").matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            String strGroup = matcher.group(1);
            Logger.d(f62148S, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: found ad id using applovin window clcode pattern in html, adId = ", strGroup);
            return strGroup;
        }
        Matcher matcher2 = g.a("\"clcode\"\\s*:\\s*\"(.*?)\"").matcher(str);
        if (matcher2.find() && matcher2.groupCount() >= 1) {
            String strGroup2 = matcher2.group(1);
            Logger.d(f62148S, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: found ad id using applovin json clcode pattern in html, adId = ", strGroup2);
            return strGroup2;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String strO;
        Logger.printFullVerboseLog(f62148S, "get ad ID from resource started, url: ", str2, ", value: ", str);
        if (str2 != null) {
            try {
                if (k.k(str2)) {
                    String strO2 = O(str2);
                    if (strO2 != null) {
                        return strO2;
                    }
                } else {
                    String[] strArrSplit = str2.split("clcode=");
                    if (strArrSplit.length > 1) {
                        String[] strArrSplit2 = strArrSplit[1].split("\"|\\&|&");
                        if (strArrSplit2.length > 0) {
                            String str3 = strArrSplit2[0];
                            Logger.d(f62148S, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: CI MATCH, adId = ", str3);
                            return str3;
                        }
                    } else {
                        Logger.d(f62148S, "get ad ID from resource: cant split string by clcode, url: ", str2);
                    }
                }
                if (str != null && !str.equals(str2) && k.k(str) && (strO = O(str)) != null) {
                    return strO;
                }
            } catch (Exception e2) {
                Logger.d(f62148S, "get ad ID from resource: cant extract ad id from: ", str2, e2);
            }
        } else if (str != null) {
            return strO;
        }
        if (k.k(str)) {
            String strC = C(str);
            Logger.d(f62148S, "get ad ID from resource: the banner hash is: ", strC);
            if (bi.containsKey(strC)) {
                Logger.d(f62148S, "get ad ID from resource: bannerHtmlHash already in sourceToWebviewRef map - bannerHtmlHash=", strC);
            }
            if (n.a((Reference<?>) weakReference)) {
                bi.put(strC, weakReference);
            } else {
                Logger.d(f62148S, "get ad id from resource - webview is null, not storing bannerHtmlHash in sourceToWebviewRef");
            }
            if (this.bk.containsKey(strC)) {
                CreativeInfo creativeInfo = this.bk.get(strC);
                if (creativeInfo != null) {
                    String strN = creativeInfo.N();
                    Logger.d(f62148S, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: CI MATCH! : id = ", strN, ", ci : ", creativeInfo.ac());
                    if (bj.containsKey(strN)) {
                        Logger.d(f62148S, "get ad ID from resource: ad id already in adIdToSource map - adId=", strN);
                    }
                    bj.put(strN, strC);
                    return strN;
                }
                Logger.d(f62148S, "get ad ID from resource: failed to mach by html hash. will try to extract ad id...");
                String strA = a(g.a("\\\"clcode\\\":\\\"(\\S*?)\\\""), str);
                if (strA != null) {
                    Logger.d(f62148S, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: CI MATCH! : id = ", strA);
                    return strA;
                }
                Logger.d(f62148S, "get ad ID from resource: NO MATCH, can't extract clcode from html");
                return null;
            }
            Logger.d(f62148S, "get ad ID from resource: NO MATCH, putting the banner hash into the sourceToWebviewRef");
            return null;
        }
        Logger.d(f62148S, "get ad ID from resource: NO MATCH, putting the value into sourceToWebviewRef");
        if (n.a((Reference<?>) weakReference)) {
            bi.put(str, weakReference);
            return null;
        }
        Logger.d(f62148S, "get ad id from resource - webview is null, not storing value in sourceToWebviewRef");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int h(String str) {
        String strC = c(str, str);
        if (strC == null) {
            return 0;
        }
        Logger.d(f62148S, String.format("ad id %s, hash code: %s, from webview html: %s, ", strC, Integer.valueOf(strC.hashCode()), str));
        return strC.hashCode();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f62186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BrandSafetyEvent.AdFormatType f62187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f62188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f62189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f62190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f62191f;

        public a(String str, BrandSafetyEvent.AdFormatType adFormatType, String str2, String str3, String str4, String str5) {
            this.f62186a = str;
            this.f62187b = adFormatType;
            this.f62188c = str2;
            this.f62189d = str3;
            this.f62190e = str4;
            this.f62191f = str5;
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType, String str2) {
            this(str, adFormatType, str2, null, null, null);
        }

        public a(c cVar, String str, BrandSafetyEvent.AdFormatType adFormatType) {
            this(str, adFormatType, null, null, null, null);
        }

        public a(String str) {
            this.f62186a = str;
        }

        public String toString() {
            return "{eventId=" + this.f62186a + ", adFormat=" + this.f62187b + ", placementId=" + this.f62188c + ", creativeId=" + this.f62189d + ", adDomain=" + this.f62190e + '}';
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        CreativeInfo value = null;
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (str.startsWith(f62149T)) {
            String strN = N(str);
            if (strN != null) {
                try {
                    String strOptString = new JSONObject(strN).optString(an);
                    if (TextUtils.isEmpty(strOptString)) {
                        return null;
                    }
                    CreativeInfo creativeInfo = this.bl.get(strOptString);
                    if (creativeInfo != null) {
                        try {
                            Logger.d(f62148S, "match info found, native CI: ", creativeInfo.ac());
                        } catch (JSONException e2) {
                            value = creativeInfo;
                        }
                    }
                    return creativeInfo;
                } catch (JSONException e3) {
                }
                Logger.d(f62148S, "match info: failed to parse bid response");
                return value;
            }
            Logger.d(f62148S, "match info: failed to decode bid response");
            return null;
        }
        if (this.bk.containsKey(str)) {
            Logger.d(f62148S, "match info started, complex key = ", str, " , banner CIs key set = ", this.bk.keySet());
            CreativeInfo creativeInfo2 = this.bk.get(str);
            if (creativeInfo2 != null) {
                Logger.d(f62148S, "match info found, banner CI: ", creativeInfo2.ac());
                return creativeInfo2;
            }
            return creativeInfo2;
        }
        Iterator<Map.Entry<String, CreativeInfo>> it = this.bl.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, CreativeInfo> next = it.next();
            if (str.equals(next.getValue().n()) && (value = next.getValue()) != null) {
                Logger.d(f62148S, "match info found, native CI: ", value.ac());
                it.remove();
            }
        }
        return value;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.bk, "AppLovinDiscovery:bannerCreativeInfos");
        com.safedk.android.utils.e.a(this.bl, "AppLovinDiscovery:nativeCreativeInfos");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return h(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return i(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType k(String str) {
        if (str != null) {
            if (str.contains(f62176i)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(f62178k)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : f62180m) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String l(String str) {
        if (str != null) {
            if (str.contains(f62176i)) {
                return k.d(str, f62177j);
            }
            if (str.contains(f62178k)) {
                return null;
            }
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType f(View view) {
        if (view instanceof AppLovinAdView) {
            AppLovinAdSize size = ((AppLovinAdView) view).getSize();
            if (size.equals(AppLovinAdSize.BANNER) || size.equals(AppLovinAdSize.LEADER)) {
                return BrandSafetyUtils.AdType.BANNER;
            }
            if (size.equals(AppLovinAdSize.MREC)) {
                return BrandSafetyUtils.AdType.MREC;
            }
            if (size.equals(AppLovinAdSize.INTERSTITIAL)) {
                return BrandSafetyUtils.AdType.INTERSTITIAL;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static Bundle a(MaxAd maxAd) {
        Class<?> superclass = maxAd.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        do {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                break;
            }
        } while (superclass.getName().startsWith(h.f63161a));
        String string = null;
        String strC = null;
        String string2 = null;
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj = field.get(maxAd);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("event_id")) {
                        string = jSONObject.getString("event_id");
                    }
                    if (jSONObject.has(f62165ao)) {
                        strC = CreativeInfoManager.c(jSONObject.getString("name"));
                        string2 = jSONObject.getString(f62165ao);
                    } else if (jSONObject.has("name")) {
                        String strOptString = jSONObject.optString("name");
                        if (!TextUtils.isEmpty(strOptString)) {
                            String strC2 = CreativeInfoManager.c(strOptString);
                            if (CreativeInfoManager.a(strC2, AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false)) {
                                string2 = "";
                                strC = strC2;
                            }
                        }
                    }
                }
                if (string != null && strC != null && string2 != null) {
                    Logger.d(f62148S, "extract data from Max ad, event ID: ", string, ", sdk: ", strC, ", bid response: ", string2);
                    Bundle bundle = new Bundle();
                    bundle.putString("eventId", string);
                    bundle.putString("sdk", strC);
                    bundle.putString("bidResponse", string2);
                    return bundle;
                }
            } catch (IllegalAccessException e2) {
                Logger.e(f62148S, "extract data from Max ad exception: ", e2.getMessage(), e2);
            } catch (Throwable th) {
                Logger.e(f62148S, "extract data from Max ad exception: ", th.getMessage(), th);
            }
        }
        return null;
    }

    protected String a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.getJSONObject(f62173f).getString(f62174g);
        } catch (JSONException e2) {
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        Iterator<String> it = CreativeInfoManager.f61955j.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        if (!g(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            if (k.n(str2)) {
                JSONObject jSONObject = new JSONObject(str2);
                Logger.printFullVerboseLog(f62148S, "handle on request sent - parsing json. url: ", str, ", content: ", str2);
                if (jSONObject.has(aZ)) {
                    Logger.d(f62148S, "handle on request sent - applovin request json has ad info");
                    JSONObject jSONObject2 = jSONObject.getJSONObject(aZ);
                    if (jSONObject2.has("ad_unit_id")) {
                        String string = jSONObject2.getString("ad_unit_id");
                        Logger.d(f62148S, "handle on request sent - found ad unit id ", string, " inside the request");
                        this.bn.put(str, string);
                        return null;
                    }
                }
            } else {
                Logger.d(f62148S, "handle on request sent - content is not json. content = ", str2);
            }
        } catch (Throwable th) {
            Logger.printFullVerboseLog(f62148S, "handle on request sent - exception occurred: ", th.getMessage());
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean m(String str) {
        if (!bj.containsKey(str)) {
            Logger.d(f62148S, "try reverse matching with ad id - ad id ", str, " is not in the ad id to source keys: ", bj.keySet());
            return false;
        }
        return a(bj.get(str), h.f63161a, bi, this.bk, d.f62218s);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void n(String str) {
        String strRemove = bj.remove(str);
        Logger.d(f62148S, "clean resources started with ad id: ", str, ", and source is: ", strRemove);
        if (strRemove != null) {
            bi.remove(strRemove);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str) {
        try {
            Logger.d(f62148S, "on json object detected started ", ", isOnUiThread = ", Boolean.valueOf(n.c()));
            if (str.contains("\"ads\"")) {
                CreativeInfoManager.a(this.f62240R, "@!1:ad_fetch@!", str, (Map<String, List<String>>) null);
            }
        } catch (Throwable th) {
            Logger.e(f62148S, "Exception in json object detected", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && str.contains(bf) && str.contains(be)) {
            Logger.d(f62148S, "handle webview response - webview= ", webView, ", calling setOnEndcardDisplayed");
            CreativeInfoManager.a(this.f62240R, BrandSafetyUtils.a((Object) webView), true, "url");
            CreativeInfoManager.f(this.f62240R);
        }
    }
}
