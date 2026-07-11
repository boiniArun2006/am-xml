package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import ScC.FuwU.XIvb;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.f;
import com.safedk.android.analytics.brandsafety.creatives.h;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.brandsafety.u;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.e;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import ep.oxM.esLNYym;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class d implements AdNetworkDiscovery {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f62207A = "@!1:ad_fetch@!";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f62208B = "<title>Unity Ads WebView</title>";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected static final String f62209F = "extra_url";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62210b = "BaseDiscovery";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f62211c = "Liftoff.init";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f62212d = "LiftoffOuterEnv.init";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f62213e = "privacyButtonClick";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f62215j = 30;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f62217r = "com.applovin.mediation.nativeAds.MaxNativeAdView";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f62218s = "onDataLoadedToWebView";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f62219t = "onResourceLoaded";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f62220u = "https://";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f62221v = "http://";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final String f62222w = "mraid://tpat?event";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final String f62223x = "checkpoint.0";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final String f62224y = "checkpoint.100";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final String f62225z = "video.close";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected b f62226C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected ConcurrentHashMap<com.safedk.android.analytics.brandsafety.creatives.i, CreativeInfo> f62227D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected Set<String> f62228E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected String f62229G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected Map<String, CreativeInfo> f62230H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected Map<String, List<CreativeInfo>> f62231I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected Map<Integer, CreativeInfo> f62232J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected Map<String, CreativeInfo> f62233K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected Map<String, String> f62234L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected final ScheduledExecutorService f62235M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected final Map<com.safedk.android.analytics.brandsafety.creatives.i, ScheduledFuture<?>> f62236N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final Map<com.safedk.android.analytics.brandsafety.d, WeakReference<View>> f62237O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected final Map<String, WeakReference<WebView>> f62238P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected Set<String> f62239Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected String f62240R;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Set<String>> f62241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u f62242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u f62243i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f62244l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, ArrayList<String>> f62214f = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map<String, WeakReference<WebView>> f62216k = new LimitedConcurrentHashMap(30);

    protected abstract boolean A(String str);

    protected abstract String a(String str, CreativeInfo creativeInfo);

    protected abstract List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException;

    protected abstract boolean b(String str, Bundle bundle);

    private void h() {
        b bVar = new b();
        this.f62226C = bVar;
        bVar.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, true);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false);
        this.f62226C.a(AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.15f);
        this.f62226C.a(AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.15f);
        this.f62226C.a(AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.15f);
        this.f62226C.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.15f);
        this.f62226C.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false);
        this.f62226C.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
        this.f62226C.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false);
        this.f62226C.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, false);
        this.f62226C.b(AdNetworkConfiguration.f61901t, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_SET_CI_AS_VIDEO_AD_ON_VIDEO_RESOURCE_LOAD, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
        this.f62226C.b(AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false);
        this.f62226C.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, false);
        this.f62226C.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false);
        this.f62226C.b(AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false);
        this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, false);
        this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, false);
        this.f62226C.b(AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        this.f62226C.b(AdNetworkConfiguration.SDK_CUSTOM_VIEW_TYPE_NAME, (String) null);
        this.f62226C.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H());
        String str = this.f62244l;
        Logger.d(str, "SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE setting set for ", str, ", value = ", Float.valueOf(SafeDK.getInstance().H()));
        this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
        this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        this.f62226C.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, com.safedk.android.internal.d.f62973N);
        this.f62226C.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true);
        this.f62226C.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_THRESHOLD, SafeDK.getInstance().U());
        this.f62226C.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false);
        this.f62226C.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.f62226C.a(AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
        this.f62226C.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false);
        this.f62226C.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false);
        this.f62226C.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false);
        this.f62226C.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, com.safedk.android.internal.d.f62973N);
        this.f62226C.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 600000L);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true);
        this.f62226C.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        this.f62226C.b(AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
        this.f62226C.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false);
        this.f62226C.b(AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false);
        this.f62226C.b(AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        this.f62226C.b(AdNetworkConfiguration.AVOID_MATCHING_CI_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false);
        this.f62226C.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_BANNERS, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, false);
        this.f62226C.b(AdNetworkConfiguration.CLEAR_FULLSCREEN_PENDING_CANDIDATES_ON_DID_FAIL_DISPLAY, false);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false);
        this.f62226C.b(AdNetworkConfiguration.STORE_DECODED_QUESTION_MARK_IN_VIV_URL_LIST, false);
        this.f62226C.a(AdNetworkConfiguration.MREC_SCREENSHOT_TAKING_DELAY, 0L);
        this.f62226C.b(AdNetworkConfiguration.VAST_URL_QUERY_PARAMS_TO_IGNORE, (String) null);
        this.f62226C.b(AdNetworkConfiguration.DOWNLOAD_INNER_VAST_URL_IF_NOT_LOADED, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_CAPTURE_SURFACE_VIEW_WHEN_USING_PIXELCOPY, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_CALL_RESOURCE_LOADED_FROM_SHOULD_INTERCEPT_REQUEST, false);
        this.f62226C.b(AdNetworkConfiguration.PRINT_WEB_VIEW_CONTENTS_ON_HTML_LOAD, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_ADD_BYTE_ARRAY_AS_PARAM_ON_AD_FETCHED, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_DECODE_BASE64_PREFECT_RECEIVED_BY_APPLOVIN, false);
        this.f62226C.b(AdNetworkConfiguration.INJECT_SCRIPTS_IF_URL_IS_NULL, false);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_REPORT_VAST_ID_AS_CREATIVE_ID, false);
        this.f62226C.b(AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false);
        this.f62226C.b(AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null);
        this.f62226C.b(AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(CreativeInfo creativeInfo) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Bundle bundle) {
        String strA = n.A(str);
        D(str);
        boolean z2 = b(new com.safedk.android.analytics.brandsafety.creatives.i(strA)) || b(new com.safedk.android.analytics.brandsafety.creatives.i(str));
        boolean z3 = z2 || l.a(str) || b(str, bundle);
        if (z3) {
            Logger.d(this.f62244l, "should follow input stream ? ", Boolean.valueOf(z3), ", vast? ", Boolean.valueOf(z2), ", url=", str);
        }
        return z3;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str, String str2) {
        D(str);
        boolean zContains = this.f62228E.contains(str);
        boolean z2 = zContains || A(str);
        Logger.d(this.f62244l, "should follow get url? ", Boolean.valueOf(z2), ", vast media? ", Boolean.valueOf(zContains), " url=", str, " webviewAddress=", str2);
        return z2;
    }

    protected void D(String str) {
        Set<String> setB = b(str, c());
        if (setB != null && setB.size() > 0) {
            str = a(str, setB);
            Logger.d(this.f62244l, "trigger video completed event - event url without query params=", str);
        }
        if (this.f62239Q.remove(str)) {
            Logger.d(this.f62244l, "Video completed event sdk=", this.f62240R, ", source ", str);
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK != null && safeDK.z() != null) {
                safeDK.z().f(this.f62240R, "url-event");
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(u uVar) {
        this.f62242h = uVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(u uVar) {
        this.f62243i = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CreativeInfo> a(String str, String str2, byte[] bArr, Map<String, List<String>> map, c.a aVar) {
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    CreativeInfo creativeInfoB = B(str);
                    if (creativeInfoB == null) {
                        String strI = I(str);
                        Logger.printFullVerboseLog(this.f62244l, "decoded URL: ", strI);
                        CreativeInfo creativeInfoB2 = B(strI);
                        if (creativeInfoB2 == null) {
                            String strReplace = strI.replace("(%20|+)", " ");
                            if (!strReplace.equals(strI)) {
                                Logger.d(this.f62244l, "decoded URL with spaces: ", strReplace);
                                creativeInfoB = B(strReplace);
                            } else {
                                creativeInfoB = creativeInfoB2;
                            }
                        }
                    }
                    if (creativeInfoB != null) {
                        a(creativeInfoB, str, str2, true);
                        Logger.d(this.f62244l, "vast processing was done in base.");
                        creativeInfoB.j(false);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(creativeInfoB);
                        c(creativeInfoB);
                        return arrayList;
                    }
                    l.b(this.f62240R, str, str2);
                    List<CreativeInfo> listA = a(str, str2, map, aVar, bArr);
                    if ((listA == null || listA.isEmpty()) && h.b(str2)) {
                        this.f62234L.put(str, str2);
                        this.f62234L.put(I(str), str2);
                    }
                    if (listA != null && !listA.isEmpty()) {
                        for (CreativeInfo creativeInfo : listA) {
                            Logger.d(this.f62244l, Logger.FeatureTag.PREFETCH, "ci saved id=", creativeInfo.N(), ", is multi ad? ", Boolean.valueOf(creativeInfo.an()), ", video url=", creativeInfo.J());
                            if (d(creativeInfo)) {
                                m(creativeInfo.N());
                            }
                            if (this.f62242h != null) {
                                Logger.d(this.f62244l, "Calling event listener onPrefetchReceived for ", this.f62240R);
                                this.f62242h.a(this.f62240R, str2, creativeInfo.n() != null ? creativeInfo.n() : creativeInfo.N());
                            }
                        }
                        i();
                    }
                    return listA;
                }
            } catch (Throwable th) {
                Logger.d(this.f62244l, "generate info error parsing. msg: ", th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f(String str) {
        if (this.f62243i != null && z(str)) {
            Logger.d(this.f62244l, "Calling event listener shouldOverridePrefetch for ", this.f62240R);
            return this.f62243i.a(this.f62240R);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean z(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(CreativeInfo creativeInfo) {
        HashSet<String> hashSetU = creativeInfo.u();
        Logger.printFullVerboseLog(this.f62244l, "handle previously saved vast ad tag uri - ci VastAdTagUri list= ", hashSetU);
        if (hashSetU != null) {
            int size = hashSetU.size();
            for (String str : hashSetU) {
                String strRemove = this.f62234L.remove(str);
                if (strRemove == null) {
                    strRemove = this.f62234L.remove(I(str));
                }
                Logger.d(this.f62244l, "handle previously saved vast ad tag uri - vastAdTagUriValue found?=", strRemove);
                if (strRemove != null) {
                    Logger.d(this.f62244l, "handle previously saved vast ad tag uri - vastAdTagUriValue found, updating vast ci");
                    a(creativeInfo, str, strRemove, true);
                }
            }
            if (size < hashSetU.size()) {
                c(creativeInfo);
            }
        }
    }

    private CreativeInfo B(String str) {
        CreativeInfo creativeInfoRemove;
        com.safedk.android.analytics.brandsafety.creatives.i iVarC = c(new com.safedk.android.analytics.brandsafety.creatives.i(str));
        if (!this.f62227D.containsKey(iVarC)) {
            return null;
        }
        Logger.d(this.f62244l, "vasts redirect url found: ", str);
        synchronized (this.f62227D) {
            creativeInfoRemove = this.f62227D.remove(iVarC);
        }
        a(iVarC);
        ScheduledFuture<?> scheduledFutureRemove = this.f62236N.remove(iVarC);
        if (scheduledFutureRemove != null) {
            Logger.d(this.f62244l, "canceling vast ad url timer. url: ", iVarC);
            scheduledFutureRemove.cancel(true);
            return creativeInfoRemove;
        }
        return creativeInfoRemove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, BrandSafetyUtils.AdType adType) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        return c(str, str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Pair<String, List<String>> a(Set<String> set) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int h(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String e(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!BannerFinder.c(view)) {
            return false;
        }
        Logger.d(this.f62244l, "is ad view: ", view.getClass().getName(), " is an instance of a Max native ad view", ", isOnUiThread = ", Boolean.valueOf(n.c()));
        return true;
    }

    public static String E(String str) {
        String strA;
        String strA2 = null;
        try {
            if (str.contains(f62211c) && (strA2 = a(g.a("pinpoint_url\\\":\\\"([^\\\"]+)\""), str)) == null) {
                strA2 = a(g.a("click_config\\\":\\{\\\"clickthrough_url\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\""), str);
            }
            if (str.contains(f62212d) && (strA2 = a(g.a("\\{\\\"clickURLs\\\":\\{\\\"clickthroughURL\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\""), str)) != null) {
                Logger.d(f62210b, f62212d, " url found : ", strA2);
            }
            strA = n.z(strA2);
        } catch (Throwable th) {
            Logger.d(f62210b, "Exception while getting click_url from dsp ad : ", th.getMessage(), th);
            strA = strA2;
        }
        if (strA == null || strA.isEmpty()) {
            strA = a(g.a("OMG\\s+=\\s+.+\"clickUrl\".+?\"(.+?)\""), str);
        }
        return n.z(strA);
    }

    protected String F(String str) {
        if (!str.contains(f62211c)) {
            return null;
        }
        String strA = a(g.a("bidBundle\\\":\\\"([^\\\"]+)\\\""), str);
        Logger.d(this.f62244l, "packageName updated : ", strA);
        return strA;
    }

    protected static String a(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                Logger.d(f62210b, "extract substring via pattern found pattern=", pattern, " , value = ", matcher.group(1));
                return matcher.group(1);
            }
            return null;
        } catch (Throwable th) {
            Logger.d(f62210b, "Exception while extracting with regex : ", th.getMessage(), ", pattern : ", pattern, th);
            return null;
        }
    }

    protected boolean a(CreativeInfo creativeInfo, h.a aVar, String str) {
        return a(creativeInfo, aVar, str, (String) null);
    }

    protected boolean a(final CreativeInfo creativeInfo, final h.a aVar, String str, String str2) {
        if (aVar == null || creativeInfo == null) {
            return false;
        }
        Logger.printFullVerboseLog(this.f62244l, "updating vast, url : ", str, ", CI: ", creativeInfo.ac(), ", vast ad info: ", aVar);
        if (str2 == null) {
            creativeInfo.a(com.safedk.android.analytics.brandsafety.l.f62621B, new l.a[0]);
        } else {
            creativeInfo.a(com.safedk.android.analytics.brandsafety.l.f62621B, new l.a("typ", str2));
        }
        boolean z2 = !creativeInfo.B();
        creativeInfo.c(true);
        if (z2) {
            String strC = aVar.c();
            if (strC != null) {
                creativeInfo.l(strC);
                if (this.f62226C.b(AdNetworkConfiguration.SHOULD_REPORT_VAST_ID_AS_CREATIVE_ID)) {
                    creativeInfo.k(strC);
                }
            }
            String strD = aVar.d();
            if (strD != null) {
                creativeInfo.o(strD);
            }
            List<String> listI = aVar.i();
            if (listI != null) {
                for (String str3 : listI) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.S(), str3)) {
                        Logger.d(this.f62244l, GDEJgAYrPQHfw.NYJCvCinqG, str3);
                        creativeInfo.x(str3);
                    }
                }
            } else {
                Logger.d(this.f62244l, "impression list is empty");
            }
            List<String> listP = aVar.p();
            if (listP != null) {
                for (String str4 : listP) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.S(), str4)) {
                        Logger.d(this.f62244l, "adding video tracking event url to dsp domains : ", str4);
                        creativeInfo.x(str4);
                    }
                    c(creativeInfo, str4);
                }
            } else {
                Logger.d(this.f62244l, "No video tracking events");
            }
            List<String> listQ = aVar.q();
            if (listQ != null) {
                for (String str5 : listQ) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.S(), str5)) {
                        Logger.d(this.f62244l, "adding click tracking url to dsp domains : ", str5);
                        creativeInfo.x(str5);
                    }
                }
            } else {
                Logger.d(this.f62244l, "no click tracking urls");
            }
            List<String> listR = aVar.r();
            if (listR != null) {
                for (String str6 : listR) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.S(), str6)) {
                        Logger.d(this.f62244l, "adding companion click tracking url to dsp domains : ", str6);
                        creativeInfo.x(str6);
                    }
                }
            } else {
                Logger.d(this.f62244l, "no companion click tracking urls");
            }
        }
        String strE = aVar.e();
        if (strE != null) {
            String strReplace = strE.replace("+", "%2B");
            String strA = n.A(strE);
            String strA2 = n.A(strReplace);
            Logger.printFullVerboseLog(this.f62244l, "following vast uri: ", strA);
            Logger.printFullVerboseLog(this.f62244l, XIvb.hEeSpRGAkO, strA2);
            f fVar = new f(strE);
            final f fVar2 = new f(strA);
            f fVar3 = new f(strA2);
            synchronized (this.f62227D) {
                this.f62227D.put(fVar, creativeInfo);
                this.f62227D.put(fVar2, creativeInfo);
                this.f62227D.put(fVar3, creativeInfo);
            }
            h.f62389p.remove(fVar);
            h.f62389p.remove(fVar2);
            h.f62389p.remove(fVar3);
            a(str, (com.safedk.android.analytics.brandsafety.creatives.i) fVar);
            a(str, (com.safedk.android.analytics.brandsafety.creatives.i) fVar2);
            a(str, (com.safedk.android.analytics.brandsafety.creatives.i) fVar3);
            Logger.d(this.f62244l, "adding vast ad url to list. url: ", fVar2, ", ci: ", creativeInfo.ac());
            creativeInfo.C(strE);
            if (!z2 && this.f62226C.b(AdNetworkConfiguration.DOWNLOAD_INNER_VAST_URL_IF_NOT_LOADED)) {
                Logger.d(this.f62244l, "adding vast ad url timer. url: ", fVar2);
                this.f62236N.put(fVar2, this.f62235M.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(d.this.f62244l, "timeout of vast ad url timer. url: ", fVar2);
                        String strE2 = aVar.e();
                        String strL = d.this.L(strE2);
                        Logger.printFullVerboseLog(d.this.f62244l, "get vast info - ad tag uri content: ", strL);
                        if (!TextUtils.isEmpty(strL)) {
                            d.this.a(creativeInfo, h.b(strL, true, d.this.f62240R), strE2, "manual");
                        }
                    }
                }, 5L, TimeUnit.SECONDS));
            }
        } else {
            String strA3 = aVar.a();
            String strB = aVar.b();
            if (strA3 != null) {
                creativeInfo.a(strA3, true);
                Logger.d(this.f62244l, "will update click url: ", strA3);
            } else {
                Logger.d(this.f62244l, "click url is empty");
            }
            if (strB != null && !aVar.s()) {
                creativeInfo.p(strB);
                Logger.d(this.f62244l, "will update video url : ", strB);
                if (n.i(strB)) {
                    String strJ = n.j(strB);
                    Logger.d(this.f62244l, "google video added : ", strJ);
                    this.f62228E.add(strJ);
                } else {
                    Logger.d(this.f62244l, "video added : ", strB);
                    a(strB, creativeInfo);
                    this.f62228E.add(strB);
                }
            } else {
                Logger.d(this.f62244l, "video url is empty");
            }
            List<String> listJ = aVar.j();
            Logger.d(this.f62244l, "vast prefetchResourceUrls : ", listJ);
            if (listJ != null) {
                for (String str7 : listJ) {
                    Logger.d(this.f62244l, "vast prefetchResourceUrls item : ", listJ);
                    String strA4 = a(str7, creativeInfo);
                    if (strA4 != null) {
                        Logger.d(this.f62244l, "will add follow url : ", strA4);
                        this.f62228E.add(strA4);
                    }
                }
                creativeInfo.b(listJ);
            } else {
                Logger.d(this.f62244l, "no prefetch resource urls");
            }
            List<String> listK = aVar.k();
            creativeInfo.c(listK);
            Logger.d(this.f62244l, "added static resource : ", listK);
            List<String> listL = aVar.l();
            creativeInfo.c(listL);
            Logger.d(this.f62244l, "added script resource : ", listL);
            List<String> listM = aVar.m();
            creativeInfo.c(listM);
            Logger.d(this.f62244l, "added html resource : ", listM);
            a(creativeInfo, aVar.n());
            if (aVar.s()) {
                creativeInfo.ae();
                Logger.d(this.f62244l, "set params ", aVar.f());
                creativeInfo.F(aVar.f());
            }
            List<String> listP2 = aVar.p();
            if (listP2 != null) {
                Iterator<String> it = listP2.iterator();
                while (it.hasNext()) {
                    c(creativeInfo, it.next());
                }
            }
            List<String> listH = aVar.h();
            if (listH != null) {
                Logger.d(this.f62244l, "vast media list contains ", listH.toString());
                for (String str8 : listH) {
                    Logger.d(this.f62244l, "vast media list item : ", str8);
                    String strA5 = a(str8, creativeInfo);
                    if (strA5 != null) {
                        Logger.d(this.f62244l, "will add followUrl : ", strA5);
                        this.f62228E.add(strA5);
                    }
                }
                creativeInfo.c(listH);
            } else {
                Logger.d(this.f62244l, "no prefetch resource urls");
            }
            Logger.printFullVerboseLog(this.f62244l, "updated vast CI = ", creativeInfo.ac());
        }
        return true;
    }

    protected void a(String str, com.safedk.android.analytics.brandsafety.creatives.i iVar) {
    }

    protected void a(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
    }

    protected String a(String str, Set<String> set) {
        if (set != null && set.size() > 0) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                str = k.f(str, it.next());
            }
        }
        return str;
    }

    private static String i(String str, String str2) {
        return str.replaceAll("([?&;]+)(" + str2 + "=.*?)(&|$|;)", "$1");
    }

    protected Set<String> b(String str, Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        Map<String, String> mapA = k.a(str, false);
        if (mapA != null) {
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                if (set.contains(entry.getValue())) {
                    Logger.d(this.f62244l, "identified macro : ", entry.getValue());
                    hashSet.add(entry.getKey());
                }
            }
        }
        if (hashSet.size() > 0) {
            Logger.d(this.f62244l, "query params to ignore are ", hashSet);
        }
        return hashSet;
    }

    protected h.a a(CreativeInfo creativeInfo, String str, String str2, boolean z2) {
        boolean zB = CreativeInfoManager.f61957l ? true : CreativeInfoManager.k(creativeInfo.S()).b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST);
        Logger.d(this.f62244l, "sdk ", creativeInfo.S(), " config item SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST is ", Boolean.valueOf(zB));
        h.a aVarB = h.b(str2, zB, creativeInfo.S());
        a(creativeInfo, aVarB, str);
        return aVarB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return com.safedk.android.utils.a.f63131b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public b d() {
        return this.f62226C;
    }

    protected d(String str, String str2) {
        this.f62227D = null;
        this.f62228E = new HashSet();
        this.f62234L = new HashMap();
        this.f62241g = new HashMap();
        this.f62235M = Executors.newScheduledThreadPool(1);
        this.f62236N = new HashMap();
        this.f62237O = new HashMap();
        this.f62242h = null;
        this.f62243i = null;
        this.f62238P = new LimitedConcurrentHashMap(30);
        this.f62239Q = new HashSet();
        this.f62240R = str;
        String sdkVersionByPackage = SdksMapping.getSdkVersionByPackage(str);
        Logger.d(this.f62244l, "package version updated, package : ", str, ", version : ", sdkVersionByPackage);
        this.f62229G = sdkVersionByPackage;
        this.f62244l = str2;
        try {
            boolean zContains = SafeDK.getInstance().V().contains(str);
            Logger.d(this.f62244l, "Discovery ctor started, packageName : ", str, ", Require data persistence = ", Boolean.valueOf(zContains));
            if (zContains) {
                PersistentConcurrentHashMap persistentConcurrentHashMap = new PersistentConcurrentHashMap(this.f62244l + "_vastAdTagUriUrlsToFollow");
                this.f62227D = persistentConcurrentHashMap;
                Logger.d(this.f62244l, "vast ad tag uri to follow loaded, key set=", persistentConcurrentHashMap.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap2 = new PersistentConcurrentHashMap(this.f62244l + "_adIdToCreatives");
                this.f62230H = persistentConcurrentHashMap2;
                Logger.d(this.f62244l, "ad id to creatives loaded, key set=", persistentConcurrentHashMap2.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap3 = new PersistentConcurrentHashMap(this.f62244l + "_multiAdCreatives");
                this.f62231I = persistentConcurrentHashMap3;
                Logger.d(this.f62244l, "multi ad creatives loaded, key set=", persistentConcurrentHashMap3.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap4 = new PersistentConcurrentHashMap(this.f62244l + "_contentHashCodeToCreatives");
                this.f62232J = persistentConcurrentHashMap4;
                Logger.d(this.f62244l, esLNYym.VyAhGS, persistentConcurrentHashMap4.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap5 = new PersistentConcurrentHashMap(this.f62244l + "_webviewAddressToCreatives");
                this.f62233K = persistentConcurrentHashMap5;
                Logger.d(this.f62244l, "webview address to creatives loaded, key set=", persistentConcurrentHashMap5.keySet());
            } else {
                this.f62227D = new ConcurrentHashMap<>();
                Logger.d(this.f62244l, "vast ad tag uri to follow loaded (no persistence)");
                this.f62230H = new ConcurrentHashMap();
                Logger.d(this.f62244l, "ad id to creatives loaded (no persistence)");
                this.f62231I = new ConcurrentHashMap();
                Logger.d(this.f62244l, "multi ad creatives loaded (no persistence)");
                this.f62232J = new ConcurrentHashMap();
                Logger.d(this.f62244l, "content hash code to creatives loaded (no persistence)");
                this.f62233K = new ConcurrentHashMap();
                Logger.d(this.f62244l, "webview address to creatives loaded (no persistence)");
            }
        } catch (InvalidParameterException e2) {
            Logger.e(this.f62244l, "error initializing caching will not be available", e2);
        }
        h();
    }

    private d() {
        this.f62227D = null;
        this.f62228E = new HashSet();
        this.f62234L = new HashMap();
        this.f62241g = new HashMap();
        this.f62235M = Executors.newScheduledThreadPool(1);
        this.f62236N = new HashMap();
        this.f62237O = new HashMap();
        this.f62242h = null;
        this.f62243i = null;
        this.f62238P = new LimitedConcurrentHashMap(30);
        this.f62239Q = new HashSet();
    }

    protected boolean G(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".mp4") || lowerCase.endsWith(".webm") || lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(obbPUqyhtS.cfSIvamElwGQhvT);
    }

    public static String H(String str) {
        return k.g(n.z(str));
    }

    public static String I(String str) {
        return k.g(n.A(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean i(String str) {
        if (b(new com.safedk.android.analytics.brandsafety.creatives.i(str))) {
            return true;
        }
        return b(new com.safedk.android.analytics.brandsafety.creatives.i(I(str)));
    }

    public boolean b(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        com.safedk.android.analytics.brandsafety.creatives.i iVarC = c(iVar);
        boolean z2 = this.f62227D.containsKey(iVarC) || h.f62389p.contains(iVarC);
        if (z2) {
            Logger.d(this.f62244l, "is VIV Url result is true for url ", iVarC);
        }
        return z2;
    }

    private com.safedk.android.analytics.brandsafety.creatives.i c(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        String[] strArrE = CreativeInfoManager.e(this.f62240R);
        if (strArrE != null && strArrE.length > 0) {
            String strA = k.a(iVar.toString(), strArrE);
            if (!strA.equals(iVar.toString())) {
                Logger.printFullVerboseLog(this.f62244l, "removeVastAdTagUriQueryParamsIfNecessary , query params removed (", Arrays.toString(strArrE), ") in url ", iVar.toString());
                return new com.safedk.android.analytics.brandsafety.creatives.i(strA);
            }
        }
        return iVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f62209F);
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean j(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(View view, BrandSafetyUtils.AdType adType) {
        String strA = null;
        if (e(view)) {
            String name = view.getClass().getName();
            Logger.d(this.f62244l, "get ad ID from view started, ad view: ", view);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList<String> arrayList = f62214f.get(name);
            if (arrayList != null) {
                Logger.d(this.f62244l, "get ad ID from view, found previous traversal path of ", name, ": ", arrayList);
                strA = a(adType, arrayList, view);
            }
            if (strA == null) {
                HashSet hashSet = new HashSet();
                ArrayList<String> arrayList2 = new ArrayList<>();
                String strA2 = a(adType, view, arrayList2, hashSet);
                if (strA2 != null) {
                    f62214f.put(name, arrayList2);
                    Logger.printFullVerboseLog(this.f62244l, "get ad ID from view, saving traversal path of ", name, " for later use: ", arrayList2);
                }
                strA = strA2;
            }
            Logger.d(this.f62244l, "get ad ID from view - travel time ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), " ms");
        }
        if (strA != null) {
            Logger.d(this.f62244l, Logger.FeatureTag.CI_MATCHING, "get ad ID from view - ad ID: ", strA);
        }
        return strA;
    }

    protected List<String> j() {
        return null;
    }

    protected String a(BrandSafetyUtils.AdType adType, Object obj, List<String> list, Set<Object> set) {
        List<String> listJ = j();
        if (listJ == null || listJ.size() == 0 || obj == null || set.contains(obj)) {
            return null;
        }
        set.add(obj);
        Class<?> superclass = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        boolean zA = CreativeInfoManager.a(this.f62240R, AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        while (true) {
            arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
            superclass = superclass.getSuperclass();
            if (superclass == null || (!a(superclass.getName(), listJ) && !zA)) {
                break;
            }
        }
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 == null) {
                    continue;
                } else if (a(obj2.getClass().getName(), listJ)) {
                    list.add(field.getName());
                    String strA = a(adType, obj2, list, set);
                    if (strA == null) {
                        list.remove(list.size() - 1);
                    } else {
                        return strA;
                    }
                } else {
                    String strA2 = a(adType, obj2, field.getName());
                    if (strA2 != null) {
                        Logger.d(this.f62244l, "extract ad info (base), adId =  ", strA2);
                        list.add(field.getName());
                        return strA2;
                    }
                    continue;
                }
            } catch (Throwable th) {
                Logger.d(this.f62244l, "Exception in extract ad info : ", th.getClass().getName(), ", ", th.getMessage());
            }
        }
        return null;
    }

    private boolean a(String str, List<String> list) {
        if (list != null && list.size() > 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private String a(BrandSafetyUtils.AdType adType, ArrayList<String> arrayList, Object obj) {
        boolean zA;
        List<String> listJ;
        try {
            zA = CreativeInfoManager.a(this.f62240R, AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
            listJ = j();
        } catch (Throwable th) {
            Logger.e(this.f62244l, "extract ad info exception: ", th.getMessage(), th);
        }
        if (listJ != null && listJ.size() != 0 && arrayList != null && obj != null) {
            Logger.d(this.f62244l, "extract ad info using saved traversal path: ", arrayList);
            Field field = null;
            for (String str : arrayList) {
                if (obj == null) {
                    return null;
                }
                Class<?> superclass = obj.getClass();
                Field declaredField = null;
                while (true) {
                    try {
                        declaredField = superclass.getDeclaredField(str);
                    } catch (NoSuchFieldException e2) {
                        superclass = superclass.getSuperclass();
                    }
                    if (declaredField != null || superclass == null || (!a(superclass.getName(), listJ) && !zA)) {
                        break;
                    }
                }
                if (declaredField == null) {
                    Logger.d(this.f62244l, "extract ad info using saved traversal path, field not found");
                    return null;
                }
                declaredField.setAccessible(true);
                obj = declaredField.get(obj);
                field = declaredField;
            }
            if (obj != null && field != null) {
                return a(adType, obj, field.getName());
            }
            return null;
        }
        return null;
    }

    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return this.f62244l;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<WebView> a(List<WeakReference<WebView>> list, String str) {
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public void i() {
        Logger.d(this.f62244l, "base clear old CIs started");
        e.a(this.f62227D, this.f62244l + ":vastAdTagUriUrlsToFollow");
        e.a(this.f62230H, this.f62244l + ":adIdToCreatives");
        e.a(this.f62231I, this.f62244l + ":multiAdCreatives");
        e.a(this.f62232J, this.f62244l + ":contentHashCodeToCreatives");
        e.a(this.f62233K, this.f62244l + ":webviewAddressToCreatives");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str) {
        return str.startsWith(f62222w);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return str.endsWith("checkpoint.0");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean c(String str) {
        return str.endsWith("checkpoint.100") || str.endsWith("video.close");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(String str) {
        return str.endsWith(f62213e);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType k(String str) {
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String l(String str) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.e eVar, List<String> list, String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType f(View view) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return SafeDK.getInstance().D();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Object obj) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean m(String str) {
        return false;
    }

    public boolean a(String str, String str2, ConcurrentHashMap<String, WeakReference<WebView>> concurrentHashMap, ConcurrentHashMap<String, CreativeInfo> concurrentHashMap2, String str3) {
        try {
            Logger.printFullVerboseLog(this.f62244l, "try reverse matching: source: ", str);
            Logger.printFullVerboseLog(this.f62244l, "try reverse matching: dataToWebviewRef keys: ", concurrentHashMap.keySet());
        } catch (Throwable th) {
            Logger.printFullVerboseLog(this.f62244l, "try reverse matching encountered exception: ", th);
        }
        if (str != null && concurrentHashMap.containsKey(str)) {
            WeakReference<WebView> weakReference = concurrentHashMap.get(str);
            if (!n.a((Reference<?>) weakReference)) {
                Logger.d(this.f62244l, "try reverse matching: webViewRef is null or points to null - webviewRef: ", weakReference);
                return false;
            }
            Logger.printFullVerboseLog(this.f62244l, "try reverse matching: keyToCIsMap keys: ", concurrentHashMap2.keySet());
            WebView webView = weakReference.get();
            if (concurrentHashMap2.containsKey(str)) {
                CreativeInfo creativeInfo = concurrentHashMap2.get(str);
                if (creativeInfo != null) {
                    String strN = creativeInfo.N();
                    if ((str3.equals(f62218s) && c(webView, strN)) || (str3.equals(f62219t) && !a(webView, strN).isEmpty())) {
                        Logger.d(this.f62244l, Logger.FeatureTag.CI_MATCHING, "try reverse matching: found a match using reverse! adId=", strN);
                        return true;
                    }
                }
            } else {
                Logger.d(this.f62244l, "try reverse matching: keyToCIsMap does not contain source");
                Logger.printFullVerboseLog(this.f62244l, "try reverse matching: keyToCIsMap keys are: ", concurrentHashMap2.keySet());
            }
            return false;
        }
        Logger.d(this.f62244l, "try reverse matching: source is null or not in sourceToWebviewRef");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void n(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public View g(View view) {
        return null;
    }

    public boolean h(View view) {
        if (view == null || !view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        Logger.d(this.f62244l, "native video player identified, view: ", view);
        return true;
    }

    public boolean i(View view) {
        if (view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z2 = true;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            z2 = z2 && i(viewGroup.getChildAt(i2));
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
    }

    protected WebView J(String str) {
        WeakReference<WebView> weakReferenceK = this.f62238P.get(str);
        if (weakReferenceK == null && (weakReferenceK = K(str)) != null && weakReferenceK.get() != null) {
            this.f62238P.put(str, weakReferenceK);
        }
        if (weakReferenceK != null && weakReferenceK.get() == null) {
            this.f62238P.remove(str);
        }
        if (weakReferenceK != null) {
            return weakReferenceK.get();
        }
        return null;
    }

    public static void b(WebView webView, Object obj) {
        f62216k.put(BrandSafetyUtils.a(obj), new WeakReference<>(webView));
    }

    public static WeakReference<WebView> K(String str) {
        return f62216k.remove(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<View> a(com.safedk.android.analytics.brandsafety.d dVar) {
        return this.f62237O.get(dVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list) {
        for (WeakReference<View> weakReference : list) {
            if (weakReference != null && weakReference.get() != null && (weakReference.get() instanceof MaxNativeAdView)) {
                Logger.d(this.f62244l, "save screenshot view - saving view= ", weakReference.get(), ", with key= ", dVar);
                this.f62237O.put(dVar, new WeakReference<>(weakReference.get()));
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(View view, int i2, int i3) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo c(Object obj, Object obj2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean p(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void f(String str, String str2) {
        Set<String> hashSet = this.f62241g.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f62241g.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WebView webView, String str) {
        String strA = BrandSafetyUtils.a((Object) webView);
        List<CreativeInfo> listS = s(str);
        Logger.d(this.f62244l, "adIdFoundOnResource - ad id: ", str, " ci: ", listS);
        if (this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS)) {
            f(str, strA);
        }
        if (listS.isEmpty()) {
            Logger.d(this.f62244l, "adIdFoundOnResource - ci list is empty, exiting");
            return listS;
        }
        for (CreativeInfo creativeInfo : listS) {
            Logger.printFullVerboseLog(this.f62244l, "Ad identified, ci : ", creativeInfo.ac());
            BrandSafetyUtils.AdType adTypeM = creativeInfo.M();
            creativeInfo.a((Object) webView);
            if (adTypeM == BrandSafetyUtils.AdType.INTERSTITIAL || adTypeM == BrandSafetyUtils.AdType.BANNER || adTypeM == BrandSafetyUtils.AdType.MREC) {
                Logger.printFullVerboseLog(this.f62244l, "Ad identified, setting creative in ad finder, adType=", adTypeM, ", click url=", creativeInfo.O());
                CreativeInfoManager.a(creativeInfo, CreativeInfo.f62448l);
                creativeInfo.b(this.f62232J);
            } else if (strA != null) {
                Logger.d(this.f62244l, "Linking ad id ", str, " to web view ", strA);
                synchronized (this.f62233K) {
                    this.f62233K.put(strA, creativeInfo);
                }
            } else {
                continue;
            }
        }
        n(str);
        return listS;
    }

    protected boolean c(WebView webView, String str) {
        String strA = BrandSafetyUtils.a((Object) webView);
        List<CreativeInfo> listS = s(str);
        Logger.d(this.f62244l, Logger.FeatureTag.CI_MATCHING, "ad ID found on data loaded - ad id: ", str, " ci: ", listS);
        if (listS.isEmpty()) {
            Logger.d(this.f62244l, "ad ID found on data loaded - ci list is empty, exiting");
            return false;
        }
        for (CreativeInfo creativeInfo : listS) {
            if (creativeInfo.M() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.M() == BrandSafetyUtils.AdType.BANNER || creativeInfo.M() == BrandSafetyUtils.AdType.MREC) {
                creativeInfo.b(this.f62232J);
                creativeInfo.a((Object) webView);
                CreativeInfoManager.a(creativeInfo, CreativeInfo.f62448l);
                if (creativeInfo.M() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    SafeDKWebAppInterface.a(strA);
                }
            }
        }
        n(str);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, com.safedk.android.analytics.brandsafety.e eVar) {
        if (eVar.x() != null) {
            Iterator<String> it = this.f62241g.keySet().iterator();
            while (it.hasNext()) {
                Set<String> set = this.f62241g.get(it.next());
                if (set != null && set.contains(str)) {
                    Iterator<String> it2 = eVar.x().iterator();
                    while (it2.hasNext()) {
                        if (set.contains(it2.next())) {
                            Logger.d(this.f62244l, "should verify matching multiple webViews: found multiple webview addresses for one banner. webViewAddresses: ", set, ", views hierarchy: ", eVar.x());
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> q(String str) {
        if (str != null) {
            Iterator<String> it = this.f62241g.keySet().iterator();
            while (it.hasNext()) {
                Set<String> set = this.f62241g.get(it.next());
                if (set != null && set.contains(str)) {
                    Logger.d(this.f62244l, "getAllWebViewsForBanner: found multiple webviews. webviewAddress= ", str, ", addresses= ", set);
                    return set;
                }
            }
        }
        return new HashSet();
    }

    private void e(CreativeInfo creativeInfo) {
        a(creativeInfo, creativeInfo.N());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(CreativeInfo creativeInfo, String str) {
        List<CreativeInfo> arrayList = this.f62231I.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            synchronized (this.f62231I) {
                this.f62231I.put(str, arrayList);
            }
        }
        Logger.d(this.f62244l, "storing creative info to multi ad CI list: ", creativeInfo.ac());
        synchronized (arrayList) {
            arrayList.add(creativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(CreativeInfo creativeInfo) {
        if (creativeInfo == null || creativeInfo.N() == null) {
            Logger.d(this.f62244l, "store Creative Info creative info is null or CIs ID is null, cannot store it.");
            return false;
        }
        synchronized (this.f62230H) {
            if (creativeInfo.an()) {
                e(creativeInfo);
                if (this.f62230H.containsKey(creativeInfo.N())) {
                    return false;
                }
            }
            if (this.f62230H.containsKey(creativeInfo.N())) {
                Logger.printFullVerboseLog(this.f62244l, "store creative info, ad key exists : ", creativeInfo.N());
            }
            this.f62230H.put(creativeInfo.N(), creativeInfo);
            Logger.printFullVerboseLog(this.f62244l, "store creative info, CI stored, ID: ", creativeInfo.N());
            if (!creativeInfo.a(this.f62232J)) {
                Logger.d(this.f62244l, "store creative info, creative info content hashcode is null, cannot store it.");
            } else {
                Logger.d(this.f62244l, "store creative info, storing creative info with hashcode: ", Integer.valueOf(creativeInfo.U()), ", CI: ", creativeInfo.ac());
            }
            return true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> s(String str) {
        CreativeInfo creativeInfo;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f62230H) {
            Logger.printFullVerboseLog(this.f62244l, "get CIs by ad id keys : ", this.f62230H.keySet());
            creativeInfo = this.f62230H.get(str);
        }
        if (creativeInfo != null) {
            if (this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                Logger.d(this.f62244l, "get CIs by ad id, reset expiration time as network support prefetch reuse. ci id = ", creativeInfo.N());
                creativeInfo.ah();
            } else {
                Logger.d(this.f62244l, "get CIs by ad id retrieved ci for ", str, ", ci : ", creativeInfo.ac());
            }
            Logger.d(this.f62244l, "get CIs by ad id, ci: ", creativeInfo.ac(), ", is multiple ad: ", Boolean.valueOf(creativeInfo.an()));
            List<CreativeInfo> listT = t(str);
            if (listT == null || listT.isEmpty()) {
                arrayList.add(creativeInfo);
            } else {
                arrayList.addAll(listT);
                Iterator<CreativeInfo> it = listT.iterator();
                while (it.hasNext()) {
                    it.next().ao();
                }
            }
        }
        Logger.d(this.f62244l, "get CIs by ad id, number of CIs: ", Integer.valueOf(arrayList.size()), ", ad id: ", str);
        return arrayList;
    }

    protected void b(CreativeInfo creativeInfo, String str) {
        Iterator<CreativeInfo> it = s(creativeInfo.N()).iterator();
        while (it.hasNext()) {
            it.next().t(str);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> t(String str) {
        return this.f62231I.get(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(int i2) {
        CreativeInfo creativeInfoRemove;
        List<CreativeInfo> listRemove;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f62232J) {
            creativeInfoRemove = this.f62232J.remove(Integer.valueOf(i2));
        }
        if (creativeInfoRemove != null) {
            arrayList.add(creativeInfoRemove);
            if (creativeInfoRemove.an()) {
                synchronized (this.f62231I) {
                    listRemove = this.f62231I.remove(creativeInfoRemove.N());
                }
                if (listRemove != null) {
                    arrayList.addAll(listRemove);
                }
            }
        }
        Logger.d(this.f62244l, "get CIs by hash code, number of CIs: ", Integer.valueOf(arrayList.size()), ", hash code: ", Integer.valueOf(i2));
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> u(String str) {
        List<CreativeInfo> listRemove;
        if (str == null) {
            return null;
        }
        synchronized (this.f62231I) {
            listRemove = this.f62231I.remove(str);
        }
        return listRemove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, WebView webView) {
        String strA = a(str, str2, new WeakReference<>(webView));
        if (strA != null) {
            return a(webView, strA);
        }
        return new ArrayList();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, BrandSafetyEvent.AdFormatType adFormatType, Object obj) {
        String strC = c(str2, str2);
        if (strC != null) {
            Logger.printFullVerboseLog(this.f62244l, "handling shown ad by api, format: ", adFormatType, ", ad id: ", strC);
            if (adFormatType == BrandSafetyEvent.AdFormatType.INTER || adFormatType == BrandSafetyEvent.AdFormatType.NATIVE) {
                for (CreativeInfo creativeInfo : s(strC)) {
                    creativeInfo.a(obj);
                    CreativeInfoManager.a(creativeInfo, CreativeInfo.f62449m);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(Object obj, Object obj2) {
        CreativeInfo creativeInfoA = a(obj);
        if (creativeInfoA != null) {
            Logger.d(this.f62244l, Logger.FeatureTag.CI_MATCHING, "ad object ready impl, calling set creative in ad finder with ", creativeInfoA);
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(this.f62240R);
            if (adNetworkDiscoveryJ != null) {
                CreativeInfoManager.a(adNetworkDiscoveryJ, creativeInfoA, obj2);
            }
            if ((BrandSafetyUtils.AdType.NATIVE.equals(creativeInfoA.M()) && obj2 == null) ? false : true) {
                r(creativeInfoA.N());
                return;
            }
            return;
        }
        Logger.d(this.f62244l, "ad object ready impl, no CI returned.");
        a(obj, obj2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(WebView webView, String str, String str2) {
        return str2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(String str, String str2, WebView webView) {
        String strM = k.m(str2);
        Logger.d(this.f62244l, "data loaded to webView: ", webView, ", package: ", this.f62240R);
        String strA = a(strM, str, new WeakReference<>(webView));
        Logger.d(this.f62244l, "data loaded to webView ad id ", strA);
        String strA2 = BrandSafetyUtils.a((Object) webView);
        if (strA != null) {
            c(webView, strA);
            return;
        }
        int iH = h(str2);
        Logger.d(this.f62244l, "Trying to match by hashcode: ", Integer.valueOf(iH));
        List<CreativeInfo> listA = a(iH);
        if (!listA.isEmpty()) {
            Logger.d(this.f62244l, Logger.FeatureTag.CI_MATCHING, "match found by hashcode: ", Integer.valueOf(iH));
        }
        for (CreativeInfo creativeInfo : listA) {
            Iterator<String> it = n.h(str2).iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.S(), webView, it.next(), (Map<String, String>) null);
            }
            creativeInfo.a((Object) webView);
            if (!this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                synchronized (this.f62230H) {
                    this.f62230H.remove(creativeInfo.N());
                }
            }
            if (creativeInfo.M() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                SafeDKWebAppInterface.a(strA2);
            }
            if (TextUtils.isEmpty(strA2)) {
                Logger.d(this.f62244l, "webView address is empty - can't link creative info to webview");
            }
            Logger.d(this.f62244l, "linking ", Integer.valueOf(creativeInfo.U()), " to web view ", strA2);
            synchronized (this.f62233K) {
                this.f62233K.put(strA2, creativeInfo);
            }
            if (creativeInfo.M() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.M() == BrandSafetyUtils.AdType.BANNER || creativeInfo.M() == BrandSafetyUtils.AdType.MREC) {
                CreativeInfoManager.a(creativeInfo, CreativeInfo.f62446j, (String) null, String.valueOf(creativeInfo.U()));
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void r(String str) {
        CreativeInfo creativeInfoRemove;
        Logger.d(this.f62244l, "remove CIs by ad id, started, ci id = ", str);
        if (str == null) {
            return;
        }
        synchronized (this.f62230H) {
            if (this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                creativeInfoRemove = this.f62230H.get(str);
                if (creativeInfoRemove != null) {
                    Logger.d(this.f62244l, "remove CIs by ad id, reset expiration time as network support prefetch reuse. ci id = ", creativeInfoRemove.N(), ", ad type = ", creativeInfoRemove.M());
                    List<CreativeInfo> arrayList = this.f62231I.get(str);
                    if (arrayList == null || arrayList.isEmpty()) {
                        arrayList = new ArrayList<>();
                        arrayList.add(creativeInfoRemove);
                    }
                    for (CreativeInfo creativeInfo : arrayList) {
                        creativeInfo.ah();
                        creativeInfo.a(false);
                        creativeInfo.a((Boolean) false);
                    }
                }
            } else {
                creativeInfoRemove = this.f62230H.remove(str);
                if (creativeInfoRemove != null) {
                    Logger.d(this.f62244l, "remove CIs by ad id, ci removed. ci id = ", creativeInfoRemove.N(), ", ad type = ", creativeInfoRemove.M());
                } else {
                    Logger.d(this.f62244l, "remove CIs by ad id, ci not found, id = ", str);
                }
                this.f62231I.remove(str);
            }
        }
        if (creativeInfoRemove != null) {
            creativeInfoRemove.b(this.f62232J);
            creativeInfoRemove.c(this.f62233K);
        }
    }

    protected static boolean a(String str, CreativeInfo creativeInfo, Map<Integer, Set<CreativeInfo>> map) {
        Iterator<Map.Entry<Integer, Set<CreativeInfo>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Set<CreativeInfo>> next = it.next();
            if (next.getValue() != null && next.getValue().contains(creativeInfo)) {
                Logger.d(str, "is matched by media player - removing ci id= ", creativeInfo.N(), ",   video url= ", next.getKey());
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected void c(CreativeInfo creativeInfo, String str) {
    }

    protected void a(CreativeInfo creativeInfo, List<String> list) {
    }

    protected static void b(String str, CreativeInfo creativeInfo, Map<String, CreativeInfo> map) {
        Iterator<Map.Entry<String, CreativeInfo>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, CreativeInfo> next = it.next();
            if (next.getValue() == creativeInfo) {
                Logger.d(str, "remove ci from collection - key to remove: ", next.getKey(), ",    ci to remove: ", creativeInfo.ac());
                it.remove();
            }
        }
    }

    protected static void c(String str, CreativeInfo creativeInfo, Map<?, Set<CreativeInfo>> map) {
        Iterator<Map.Entry<?, Set<CreativeInfo>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, Set<CreativeInfo>> next = it.next();
            if (next.getValue() != null && next.getValue().contains(creativeInfo)) {
                Logger.d(str, "remove ci from collection set - key to remove: ", next.getKey(), ",    ci to remove: ", creativeInfo.ac());
                it.remove();
            }
        }
    }

    protected String L(String str) {
        BufferedReader bufferedReader;
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStreamOpenStream = null;
        try {
            Logger.d(this.f62244l, "downloadUrl fetching ", str);
            inputStreamOpenStream = new URL(str).openStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream));
        } catch (Throwable th) {
            try {
                Logger.d(this.f62244l, "Exception in downloadUrl : ", th.getMessage(), th);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } catch (Throwable th2) {
                Logger.d(this.f62244l, "Exception in downloadUrl inner : ", th.getMessage(), th);
            }
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuffer.append(line);
            return stringBuffer.toString();
        }
        inputStreamOpenStream.close();
        return stringBuffer.toString();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(WebView webView, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public HashMap<Integer, String> g() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String v(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void w(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo c(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void g(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String x(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void h(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(SimpleConcurrentHashSet<String> simpleConcurrentHashSet) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void y(String str) {
        try {
            l.c(str);
        } catch (Exception e2) {
            Logger.d(this.f62244l, "interceptXmlHttpRequest - encountered exception= ", e2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(Object obj) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WeakReference<WebView> weakReference, String str) {
    }
}
