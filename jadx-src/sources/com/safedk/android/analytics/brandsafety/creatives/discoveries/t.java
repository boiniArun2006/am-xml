package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import aT.dE.JLZo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.alightcreative.time.Kw.znsSxz;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VungleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.e;
import com.safedk.android.utils.g;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class t extends d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f62316S = "creative_id";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f62317T = "callToActionDest";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f62318U = "callToActionUrl";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final String f62319V = "info";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String f62320W = "impression auctioned but unsold";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f62321X = "request is rejected by filter";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f62322Y = "url";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f62323Z = "ORIGINAL_VIDEO_URL";
    private static final String aA = "EC_CTA_URL";

    /* JADX INFO: renamed from: aB, reason: collision with root package name */
    private static final String f62324aB = "https://privacy.vungle.com/";

    /* JADX INFO: renamed from: aC, reason: collision with root package name */
    private static final String f62325aC = "vungle.com";

    /* JADX INFO: renamed from: aD, reason: collision with root package name */
    private static final String f62326aD = "adunit";
    private static final String aE = "AD_SOURCE";

    /* JADX INFO: renamed from: aF, reason: collision with root package name */
    private static final String f62327aF = "ADVERTISER_DOMAIN";
    private static final String aG = "ads";
    private static final String aH = "APP_NAME";
    private static final String aI = "APP_DESCRIPTION";
    private static final String aJ = "CTA_BUTTON_TEXT";
    private static final String aK = "MAIN_IMAGE";

    /* JADX INFO: renamed from: aL, reason: collision with root package name */
    private static final String f62328aL = "APP_ICON";
    private static final String aM = "vungle_playable";
    private static final String aN = "MAIN_STREAM";

    /* JADX INFO: renamed from: aO, reason: collision with root package name */
    private static final String f62329aO = "STREAM_CHUNK_0";

    /* JADX INFO: renamed from: aP, reason: collision with root package name */
    private static final String f62330aP = "STREAM_CHUNK_1";
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> aQ = null;
    private static PersistentConcurrentHashMap<Integer, VungleCreativeInfo> aR = null;
    private static PersistentConcurrentHashMap<String, VungleCreativeInfo> aS = null;

    /* JADX INFO: renamed from: aT, reason: collision with root package name */
    private static PersistentConcurrentHashMap<String, Boolean> f62331aT = null;
    private static final Map<String, WeakReference<Object>> aU = new HashMap();
    private static final long aV = 259200000;
    private static final String aa = "showCloseIncentivized";
    private static final int ab = 9999;
    private static final String ac = "placement_reference_id";
    private static final String ad = "cacheable_replacements";
    private static final String ae = "MAIN_VIDEO";
    private static final String af = "postBundle";
    private static final String ag = "templateURL";
    private static final String ah = "template_type";
    private static final String ai = "expiry";
    private static final String aj = "adType";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f62332ak = "ad_type";
    private static final String al = "banner";
    private static final String am = "mrec";
    private static final String an = "native";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f62333ao = "fullscreen";
    private static final String ap = "placements";
    private static final String aq = "reference_id";
    private static final String ar = "is_incentivized";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private static final String f62334as = "tpat";
    private static final String at = "templateSettings";
    private static final String au = "template_settings";
    private static final String av = "normal_replacements";

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private static final String f62335aw = "clickUrl";
    private static final String ax = "ad_market_id";
    private static final String ay = "APP_STORE_ID";
    private static final String az = "CTA_BUTTON_URL";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62336b = "MAIN_VIDEO.mp4";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62337c = "ad_markup";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62338d = "com.vungle.warren.BuildConfig";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62339e = "VERSION_NAME";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62340f = "ADM_HTML";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62341g = "EC_HTML";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62342h = "adx.ads.vungle.com/api/v";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62343i = "api.vungle.com/api/v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62344j = "adx-stage.ads.vungle.com/api/v";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62345k = "api.vungle.com/config";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62346l = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{console.log(\"log Vungle privacy policy sdkId : \"+sdkId+\",address = \"+address+\", msg : \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"Vungle-Liftoff detect privacy ,address \"+address+\", message : \"+message)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkDebug object missing\")}}catch(error){console.log(\"log : \"+error)}};log(\"script started sdkId = \"+sdkId+\", address = \"+address);var dialogboxElement=null;var addPrivacyObservers=function(){try{log(\"addPrivacyObservers started, trying with DIALOGBOX\");dialogboxElement=document.getElementById(\"DIALOGBOX\");if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-dialog\");dialogboxElement=document.getElementById(\"privacy-dialog\")}if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-popup\");dialogboxElement=document.getElementById(\"privacy-popup\")}log(\"addPrivacyObservers privacy-popup : \"+dialogboxElement);if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-page\");dialogboxElement=document.getElementById(\"privacy-page\")}log(\"privacy-popup : \"+dialogboxElement);if(!dialogboxElement){log(\"addPrivacyObservers trying again with privacy-popup by class \");var elements=document.querySelectorAll(\"div#privacy-popup\");if(elements&&elements.length>0){log(\"found by class : \"+JSON.stringify(elements[0]));dialogboxElement=elements[0]}}log(\"dialogboxElement = \"+dialogboxElement);try{log(\"dialogboxElement (json) = \"+JSON.stringify(dialogboxElement))}catch(error){log(\"dialogboxElement error \"+error)}if(dialogboxElement&&dialogboxElement.hasAttribute(\"id\")){log(\"dialogboxElement.id ? \"+dialogboxElement.id)}if(dialogboxElement&&dialogboxElement.hasAttribute(\"aria-hidden\")){log(\"dialogboxElement.aria-hidden ? \"+dialogboxElement.getAttribute(\"aria-hidden\"))}if(dialogboxElement&&(dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\")){log(\"addPrivacyObservers found element \"+JSON.stringify(dialogboxElement));var element_style_visibility=dialogboxElement.style&&dialogboxElement.style.visibility||dialogboxElement&&dialogboxElement.hasAttribute(\"id\")&&dialogboxElement.id==\"privacy-popup\"&&dialogboxElement.classList.contains(\"ytoTpW_show\");if(element_style_visibility){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}log(\"addPrivacyObservers element is visible\")}else{log(\"addPrivacyObservers element is not visible\");{dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":log(\"addPrivacyObservers Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");if(getComputedStyle(mutation.target).visibility==\"visible\"||mutation.target.classList.contains(\"ytoTpW_show\")){log(\"privacy dialog is visible \");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}}}}else{var privacyPageElement=document.getElementById(\"privacy-page\");if(privacyPageElement){var privacyPageParentElement=privacyPageElement.parentElement;if(privacyPageParentElement){var computedStyle=getComputedStyle(privacyPageParentElement);if(computedStyle){var displayState=computedStyle.display;if(displayState!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{{privacyPageParentElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(mutation.target.style.display!=\"none\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}break}})});var config={attributes:true,attributeOldValue:true,childList:true,subtree:true};observer.observe(privacyPageParentElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}}}}}}}}}catch(error){log(\"caught exception with error = \"+error+\", stack : \"+error.stack);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}return dialogboxElement};var addAdClosureObservers=function(){try{log(\"addAdClosureObservers trying with incentivized-dialog\");var dialogboxElement=document.getElementById(\"incentivized-dialog\");if(dialogboxElement&&dialogboxElement.style&&dialogboxElement.style.visibility){log(\"addAdClosureObservers found element : \"+dialogboxElement);var element_style_visibility=dialogboxElement.style.visibility;if(element_style_visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp object missing\")}log(\"addAdClosureObservers element is visible\")}else{log(\"addAdClosureObservers element is not visible\");if(dialogboxElement.safedkPrivacyDialogObserver!=true){dialogboxElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}log(\"addAdClosureObservers Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(dialogboxElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}log(\"addAdClosureObservers Error : \"+\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSamplingExc object missing\")}}};var monitorNotifications=function(){try{var divIds=[\"ad-notification-modal\",\"gdpr-notification-view\"];for(var divId of divIds){var element=document.getElementById(divId);if(element){var className=element.className;if(element.className.endsWith(\"show\")){log(\"element.className = \"+element.className);if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}else{if(element.safedkVisibilityObserver!=true){element.safedkVisibilityObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){if(mutation.type==\"attributes\"){if(mutation.target.className.endsWith(\"show\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"class\"]};observer.observe(element,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}};var counter=0;setTimeout(()=>{if(!dialogboxElement&&counter<4){counter++;log(\"calling addPrivacyObservers() \"+counter);addPrivacyObservers()}},500);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){for(const mutation of mutations){if(mutation.type===\"childList\"){}else if(mutation.type===\"attributes\"){log(mutation.attributeName+\" attribute was modified to \"+mutation.target.getAttribute(mutation.attributeName))}}mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];log(\"node iteration \"+i+\" : \"+JSON.stringify(node));if(node&&node.nodeName!=\"#text\"){addPrivacyObservers();addAdClosureObservers();monitorNotifications()}}})});var config={attributes:true,childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(\"address = \"+address+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface Vungle pp safedkNoSampling object missing\")}}})();\n";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62347m = "mraid://";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62348n = "url";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f62349o = "VungleDiscovery";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f62350p = "id";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62351q = "campaign";

    public t() {
        super(h.f63164d, f62349o);
        try {
            PersistentConcurrentHashMap<String, VungleCreativeInfo> persistentConcurrentHashMap = new PersistentConcurrentHashMap<>("VungleDiscoverycreativeToIdMap");
            aQ = persistentConcurrentHashMap;
            Logger.d(f62349o, "CI to ID map loaded, key set: ", persistentConcurrentHashMap.keySet());
            PersistentConcurrentHashMap<Integer, VungleCreativeInfo> persistentConcurrentHashMap2 = new PersistentConcurrentHashMap<>("VungleDiscoverymediaPlayerIdToCreativeInfo");
            aR = persistentConcurrentHashMap2;
            Logger.d(f62349o, "media player to CI loaded, key set: ", persistentConcurrentHashMap2.keySet());
            PersistentConcurrentHashMap<String, VungleCreativeInfo> persistentConcurrentHashMap3 = new PersistentConcurrentHashMap<>("VungleDiscoveryadToIdMap");
            aS = persistentConcurrentHashMap3;
            Logger.d(f62349o, "ad to ID map loaded, key set: ", persistentConcurrentHashMap3.keySet());
            PersistentConcurrentHashMap<String, Boolean> persistentConcurrentHashMap4 = new PersistentConcurrentHashMap<>("VungleDiscoveryplacementData");
            f62331aT = persistentConcurrentHashMap4;
            Logger.d(f62349o, "placement data loaded, key set: ", persistentConcurrentHashMap4.keySet());
        } catch (InvalidParameterException e2) {
            Logger.e(f62349o, "Error initializing ", f62349o, ", caching will not be available", e2);
        }
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.f62226C.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, f62346l);
        this.f62226C.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, aV);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.f62226C.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.f62226C.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, true);
        this.f62226C.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.f62226C.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        CreativeInfo creativeInfoA;
        Object[] objArr = new Object[6];
        objArr[0] = "generate info started, url: ";
        objArr[1] = str;
        objArr[2] = ", buffer size: ";
        objArr[3] = str2 == null ? "0" : Integer.valueOf(str2.length());
        objArr[4] = ", maxParams: ";
        objArr[5] = aVar;
        Logger.d(f62349o, objArr);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (str.contains(f62345k)) {
                B(str2);
                return null;
            }
            if (CreativeInfoManager.i(str) || str.equals("@!1:ad_fetch@!")) {
                Logger.d(f62349o, "Url is a mediation url");
                if (jSONObject.has(f62326aD)) {
                    Logger.d(f62349o, "content contains an AdUnit field");
                    String strA = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(f62326aD), 0));
                    Logger.printFullVerboseLog(f62349o, "decodedAdUnitContent = ", strA);
                    if (n.n(strA)) {
                        jSONObject = new JSONObject(strA);
                        Logger.d(JLZo.UdsaGqAoSvNB, "decodedAdUnitContent new JSONObject created");
                    }
                }
            }
            boolean z2 = aVar != null && aVar.f62187b == BrandSafetyEvent.AdFormatType.NATIVE;
            if (jSONObject.has("id")) {
                CreativeInfo creativeInfoA2 = a(jSONObject, (String) null, z2, aVar);
                if (creativeInfoA2 != null) {
                    if (!creativeInfoA2.M().equals(BrandSafetyUtils.AdType.NATIVE)) {
                        arrayList.add(creativeInfoA2);
                        synchronized (aQ) {
                            aQ.put(creativeInfoA2.P(), (VungleCreativeInfo) creativeInfoA2);
                            Logger.d(f62349o, "ci to ID map key added ", creativeInfoA2.P(), ", key set: ", aQ.keySet());
                        }
                        creativeInfoA2.h(aVar.f62186a);
                    } else {
                        Logger.d(f62349o, "ci is a native ad, skipping: ", creativeInfoA2.ac());
                    }
                    arrayList.add(creativeInfoA2);
                    synchronized (aQ) {
                        aQ.put(creativeInfoA2.P(), (VungleCreativeInfo) creativeInfoA2);
                        Logger.d(f62349o, "ci to ID map key added ", creativeInfoA2.P(), ", key set: ", aQ.keySet());
                    }
                }
            } else if (jSONObject.has("ads")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ads");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(f62337c);
                    String string = jSONObject2.getString(ac);
                    if (b(jSONObject2) && (creativeInfoA = a(jSONObject3, string, z2, aVar)) != null) {
                        arrayList.add(creativeInfoA);
                        synchronized (aQ) {
                            aQ.put(creativeInfoA.P(), (VungleCreativeInfo) creativeInfoA);
                            Logger.d(f62349o, "ci to ID map key added ", creativeInfoA.P(), ", key set: ", aQ.keySet());
                        }
                        if (z2) {
                            creativeInfoA.h(aVar.f62186a);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(f62349o, "Exception parsing prefetch : ", th.getMessage(), th);
        }
        return arrayList;
    }

    private void B(String str) throws JSONException {
        Logger.printFullVerboseLog(f62349o, "process placements started, buffer = ", str);
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(ap)) {
            JSONArray jSONArray = jSONObject.getJSONArray(ap);
            for (int i2 = 0; i2 < jSONArray.length() - 1; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has(aq) && jSONObject2.has(ar)) {
                    f62331aT.put(jSONObject2.getString(aq), Boolean.valueOf(jSONObject2.getBoolean(ar)));
                    Logger.d(f62349o, "process placements added ", jSONObject2.getString(aq), " : ", Boolean.valueOf(jSONObject2.getBoolean(ar)));
                } else {
                    Logger.d(f62349o, "process placements placement does not contains ref_id/is_incentivized data : ", jSONObject2);
                }
            }
            return;
        }
        Logger.d(f62349o, "process placements no placements array");
    }

    private void d(CreativeInfo creativeInfo, String str) {
        try {
            Matcher matcher = g.a("externalHtmlURL:\\s*\"([^\"]+)\"").matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                String strTrim = matcher.group(1).trim();
                Logger.d(f62349o, "found vungle endcard url: ", strTrim);
                creativeInfo.H(strTrim);
            }
        } catch (Throwable th) {
            Logger.d(f62349o, "extract vungle endcard url - exception occurred: ", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        Logger.d(f62349o, "match info - started. ad instance= ", obj);
        if (obj instanceof String) {
            String strA = (String) obj;
            if (n.n(strA)) {
                try {
                    strA = a(new JSONObject(strA));
                } catch (JSONException e2) {
                    Logger.d(f62349o, "match info - exception: ", e2);
                }
            }
            Logger.d(f62349o, "match info - started. ad id found= ", strA);
            if (!TextUtils.isEmpty(strA)) {
                VungleCreativeInfo vungleCreativeInfo = aS.get(strA);
                Logger.d(f62349o, "match info - FOUND by ad id= ", obj, ",    ci= ", vungleCreativeInfo);
                return vungleCreativeInfo;
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean m(String str) {
        VungleCreativeInfo vungleCreativeInfo = aS.get(str);
        WeakReference<Object> weakReferenceRemove = aU.remove(str);
        if (vungleCreativeInfo != null && vungleCreativeInfo.M() == BrandSafetyUtils.AdType.NATIVE && weakReferenceRemove != null) {
            Logger.d(f62349o, Logger.FeatureTag.CI_MATCHING, "try reverse matching - value= ", str, ",   matching ref= ", weakReferenceRemove, ",    ci= ", vungleCreativeInfo.ac());
            CreativeInfoManager.b(h.f63164d, str, weakReferenceRemove.get());
        }
        return false;
    }

    private String a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.has(f62326aD)) {
                String strA = com.safedk.android.utils.c.a(Base64.decode(jSONObject.getString(f62326aD), 0));
                if (n.n(strA) && (jSONArrayOptJSONArray = new JSONObject(strA).optJSONArray("ads")) != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.getJSONObject(0).optJSONObject(f62337c)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    Logger.d(f62349o, "get ad id from prefetch - ad id found= ", strOptString);
                    return strOptString;
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62349o, "get ad id from prefetch - exception: ", e2);
        }
        Logger.d(f62349o, "get ad id from prefetch - could not find ad id");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
        Logger.d(f62349o, "save matching object for reverse matching - matching object= ", obj2);
        if (obj instanceof String) {
            String str = (String) obj;
            if (n.n(str)) {
                try {
                    String strA = a(new JSONObject(str));
                    if (!TextUtils.isEmpty(strA) && obj2 != null) {
                        aU.put(strA, new WeakReference<>(obj2));
                        Logger.d(f62349o, Logger.FeatureTag.CI_MATCHING, "save matching object for reverse matching - saving ad id= ", strA, ",     matching object= ", obj2);
                    }
                } catch (JSONException e2) {
                    Logger.d(f62349o, "match info - exception: ", e2);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        String strC = C(str2);
        if (strC == null) {
            strC = C(str);
        }
        if (strC != null) {
            Logger.d(f62349o, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource returned ad ID: ", strC);
            return strC;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int h(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        try {
            Logger.d(f62349o, "handle media player set data source call, media player: ", obj, ", video file: ", obj2);
            Uri uri = (Uri) obj2;
            Logger.d(f62349o, "handle media player set data source call, uri: ", uri.toString());
            VungleCreativeInfo vungleCreativeInfoA = a(new File(uri.getPath()));
            if (vungleCreativeInfoA != null && !aR.containsKey(Integer.valueOf(System.identityHashCode(obj)))) {
                Logger.d(f62349o, "handle media player set data source call, adding CI to map");
                synchronized (aR) {
                    aR.put(Integer.valueOf(System.identityHashCode(obj)), vungleCreativeInfoA);
                }
            }
        } catch (Exception e2) {
            Logger.e(f62349o, "exception when trying to add mediaPlayer id and VungleCreativeInfo ", e2.getMessage());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String b(Object obj) {
        VungleCreativeInfo vungleCreativeInfoRemove;
        VungleCreativeInfo vungleCreativeInfoRemove2;
        try {
            Logger.d(f62349o, "get CI after media player start call, media player: ", obj);
            synchronized (aR) {
                vungleCreativeInfoRemove = aR.remove(Integer.valueOf(System.identityHashCode(obj)));
            }
            if (vungleCreativeInfoRemove != null) {
                synchronized (aQ) {
                    vungleCreativeInfoRemove2 = aQ.remove(vungleCreativeInfoRemove.P());
                }
                if (vungleCreativeInfoRemove2 == null) {
                    Logger.d(f62349o, znsSxz.EKYKBvOZR, vungleCreativeInfoRemove.P(), " in creative to ID map");
                } else {
                    Logger.d(f62349o, "creative to ID map key '", vungleCreativeInfoRemove.P(), "'removed, key set: ", aQ.keySet());
                }
                Logger.d(f62349o, "get CI after media player start call - returning ", vungleCreativeInfoRemove.N(), " as ad ID");
                return vungleCreativeInfoRemove.N();
            }
            Logger.d(f62349o, "get CI after media player start call - cannot find creative in media player ID to CI map");
            return null;
        } catch (Exception e2) {
            Logger.e(f62349o, "exception when trying to remove from media player ID to CI map", e2.getMessage());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean A(String str) {
        Logger.d(f62349o, "should follow get url: ", str);
        if (str.toLowerCase().endsWith(f62336b.toLowerCase())) {
            Logger.d(f62349o, "should follow get url - returning true for url: ", str);
            return true;
        }
        if (str.equals(f62324aB)) {
            Logger.d(f62349o, "Vungle privacy policy url invoked");
            CreativeInfoManager.b(h.f63164d, (String) null);
        }
        String strC = C(str);
        if (strC != null && strC.length() > 0) {
            if (aS.containsKey(strC)) {
                Logger.d(f62349o, "ad to ID map contains creative ID: ", strC, ", returning true");
                return true;
            }
            Logger.d(f62349o, "ad to ID map does not contain creative ID: ", strC, " , key set : ", aS.keySet());
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z2 = str.contains(f62342h) || str.contains(f62343i) || str.contains(f62344j) || str.contains(f62345k);
        if (z2) {
            Logger.d(f62349o, "should follow input stream, url: ", str);
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0452 A[Catch: all -> 0x08b6, TryCatch #13 {all -> 0x08b6, blocks: (B:32:0x00c0, B:34:0x00c8, B:36:0x00d4, B:39:0x00dc, B:42:0x00e4, B:51:0x011b, B:53:0x0134, B:56:0x0174, B:58:0x017c, B:62:0x0189, B:72:0x01a8, B:78:0x01b9, B:80:0x01c1, B:83:0x01cb, B:88:0x01da, B:92:0x01ea, B:94:0x01f6, B:95:0x0215, B:97:0x021b, B:107:0x0255, B:110:0x0262, B:114:0x026f, B:116:0x0275, B:118:0x027d, B:119:0x028a, B:121:0x0293, B:123:0x029b, B:126:0x02a4, B:133:0x02cf, B:138:0x02e1, B:140:0x02ee, B:146:0x0307, B:148:0x030f, B:153:0x037a, B:155:0x0380, B:157:0x0388, B:159:0x0390, B:161:0x039e, B:162:0x03aa, B:165:0x03b2, B:167:0x03ba, B:168:0x03c0, B:171:0x03ca, B:173:0x03d2, B:176:0x03dd, B:178:0x03e5, B:181:0x03ef, B:183:0x03f7, B:187:0x0404, B:189:0x040c, B:192:0x0416, B:194:0x041e, B:196:0x0429, B:198:0x0452, B:200:0x0475, B:203:0x047e, B:206:0x048b, B:208:0x0490, B:210:0x0498, B:223:0x04c1, B:226:0x04c8, B:228:0x04d0, B:230:0x04de, B:232:0x04e3, B:248:0x053e, B:250:0x054c, B:252:0x0554, B:255:0x0562, B:256:0x0569, B:231:0x04e1, B:233:0x04ff, B:236:0x050c, B:238:0x051e, B:239:0x0521, B:241:0x0525, B:243:0x052d, B:244:0x0531, B:246:0x0539, B:212:0x049d, B:214:0x04a5, B:216:0x04aa, B:218:0x04b2, B:220:0x04b7, B:222:0x04bf, B:149:0x0339, B:151:0x0345, B:152:0x036b, B:142:0x02f7, B:144:0x02ff, B:127:0x02af, B:129:0x02be, B:131:0x02c6, B:106:0x0238, B:44:0x00f5, B:46:0x00fd, B:48:0x0109, B:99:0x0221, B:101:0x022c), top: B:462:0x00c0, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0525 A[Catch: all -> 0x08b6, TryCatch #13 {all -> 0x08b6, blocks: (B:32:0x00c0, B:34:0x00c8, B:36:0x00d4, B:39:0x00dc, B:42:0x00e4, B:51:0x011b, B:53:0x0134, B:56:0x0174, B:58:0x017c, B:62:0x0189, B:72:0x01a8, B:78:0x01b9, B:80:0x01c1, B:83:0x01cb, B:88:0x01da, B:92:0x01ea, B:94:0x01f6, B:95:0x0215, B:97:0x021b, B:107:0x0255, B:110:0x0262, B:114:0x026f, B:116:0x0275, B:118:0x027d, B:119:0x028a, B:121:0x0293, B:123:0x029b, B:126:0x02a4, B:133:0x02cf, B:138:0x02e1, B:140:0x02ee, B:146:0x0307, B:148:0x030f, B:153:0x037a, B:155:0x0380, B:157:0x0388, B:159:0x0390, B:161:0x039e, B:162:0x03aa, B:165:0x03b2, B:167:0x03ba, B:168:0x03c0, B:171:0x03ca, B:173:0x03d2, B:176:0x03dd, B:178:0x03e5, B:181:0x03ef, B:183:0x03f7, B:187:0x0404, B:189:0x040c, B:192:0x0416, B:194:0x041e, B:196:0x0429, B:198:0x0452, B:200:0x0475, B:203:0x047e, B:206:0x048b, B:208:0x0490, B:210:0x0498, B:223:0x04c1, B:226:0x04c8, B:228:0x04d0, B:230:0x04de, B:232:0x04e3, B:248:0x053e, B:250:0x054c, B:252:0x0554, B:255:0x0562, B:256:0x0569, B:231:0x04e1, B:233:0x04ff, B:236:0x050c, B:238:0x051e, B:239:0x0521, B:241:0x0525, B:243:0x052d, B:244:0x0531, B:246:0x0539, B:212:0x049d, B:214:0x04a5, B:216:0x04aa, B:218:0x04b2, B:220:0x04b7, B:222:0x04bf, B:149:0x0339, B:151:0x0345, B:152:0x036b, B:142:0x02f7, B:144:0x02ff, B:127:0x02af, B:129:0x02be, B:131:0x02c6, B:106:0x0238, B:44:0x00f5, B:46:0x00fd, B:48:0x0109, B:99:0x0221, B:101:0x022c), top: B:462:0x00c0, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0569 A[Catch: all -> 0x08b6, TRY_LEAVE, TryCatch #13 {all -> 0x08b6, blocks: (B:32:0x00c0, B:34:0x00c8, B:36:0x00d4, B:39:0x00dc, B:42:0x00e4, B:51:0x011b, B:53:0x0134, B:56:0x0174, B:58:0x017c, B:62:0x0189, B:72:0x01a8, B:78:0x01b9, B:80:0x01c1, B:83:0x01cb, B:88:0x01da, B:92:0x01ea, B:94:0x01f6, B:95:0x0215, B:97:0x021b, B:107:0x0255, B:110:0x0262, B:114:0x026f, B:116:0x0275, B:118:0x027d, B:119:0x028a, B:121:0x0293, B:123:0x029b, B:126:0x02a4, B:133:0x02cf, B:138:0x02e1, B:140:0x02ee, B:146:0x0307, B:148:0x030f, B:153:0x037a, B:155:0x0380, B:157:0x0388, B:159:0x0390, B:161:0x039e, B:162:0x03aa, B:165:0x03b2, B:167:0x03ba, B:168:0x03c0, B:171:0x03ca, B:173:0x03d2, B:176:0x03dd, B:178:0x03e5, B:181:0x03ef, B:183:0x03f7, B:187:0x0404, B:189:0x040c, B:192:0x0416, B:194:0x041e, B:196:0x0429, B:198:0x0452, B:200:0x0475, B:203:0x047e, B:206:0x048b, B:208:0x0490, B:210:0x0498, B:223:0x04c1, B:226:0x04c8, B:228:0x04d0, B:230:0x04de, B:232:0x04e3, B:248:0x053e, B:250:0x054c, B:252:0x0554, B:255:0x0562, B:256:0x0569, B:231:0x04e1, B:233:0x04ff, B:236:0x050c, B:238:0x051e, B:239:0x0521, B:241:0x0525, B:243:0x052d, B:244:0x0531, B:246:0x0539, B:212:0x049d, B:214:0x04a5, B:216:0x04aa, B:218:0x04b2, B:220:0x04b7, B:222:0x04bf, B:149:0x0339, B:151:0x0345, B:152:0x036b, B:142:0x02f7, B:144:0x02ff, B:127:0x02af, B:129:0x02be, B:131:0x02c6, B:106:0x0238, B:44:0x00f5, B:46:0x00fd, B:48:0x0109, B:99:0x0221, B:101:0x022c), top: B:462:0x00c0, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0587 A[Catch: all -> 0x08a4, TryCatch #1 {all -> 0x08a4, blocks: (B:259:0x057e, B:261:0x0587, B:267:0x05a1, B:269:0x05a9, B:271:0x05c2, B:275:0x05ce, B:262:0x058e, B:264:0x0596, B:258:0x0577), top: B:439:0x0577 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x058e A[Catch: all -> 0x08a4, TryCatch #1 {all -> 0x08a4, blocks: (B:259:0x057e, B:261:0x0587, B:267:0x05a1, B:269:0x05a9, B:271:0x05c2, B:275:0x05ce, B:262:0x058e, B:264:0x0596, B:258:0x0577), top: B:439:0x0577 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05e1 A[Catch: all -> 0x089c, TryCatch #16 {all -> 0x089c, blocks: (B:273:0x05cb, B:277:0x05dd, B:279:0x05e1, B:281:0x05e8, B:285:0x0620), top: B:467:0x05cb }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x067a A[Catch: all -> 0x0665, TRY_ENTER, TryCatch #2 {all -> 0x0665, blocks: (B:289:0x0657, B:298:0x067a, B:300:0x067f), top: B:441:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x067f A[Catch: all -> 0x0665, TRY_LEAVE, TryCatch #2 {all -> 0x0665, blocks: (B:289:0x0657, B:298:0x067a, B:300:0x067f), top: B:441:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x06c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v3, types: [com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CreativeInfo a(JSONObject jSONObject, String str, boolean z2, c.a aVar) {
        String str2;
        Object obj;
        char c2;
        char c4;
        int i2;
        char c5;
        ?? r16;
        Throwable th;
        String string;
        ArrayList<String> arrayList;
        String strOptString;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject2;
        boolean z3;
        String string2;
        String str6;
        ArrayList<String> arrayList2;
        String str7;
        JSONObject jSONObjectOptJSONObject;
        String strOptString2;
        long j2;
        BrandSafetyUtils.AdType adType;
        String strOptString3;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject3;
        boolean z4;
        String str12;
        String str13;
        t tVar;
        JSONObject jSONObject4;
        int i3;
        Object obj2;
        boolean z5;
        String str14;
        try {
            Logger.printFullVerboseLog(f62349o, "get CI from Json object started : ", jSONObject);
            string = jSONObject.getString("id");
            Logger.d(f62349o, "get CI from Json ad ID: ", string);
        } catch (Throwable th2) {
            th = th2;
            str2 = null;
        }
        if (string.equals("") && jSONObject.has(f62319V) && (jSONObject.getString(f62319V).equals(f62320W) || jSONObject.getString(f62319V).equals(f62321X))) {
            Logger.d(f62349o, "get CI from Json No fill, exiting");
            return null;
        }
        ArrayList<String> arrayList3 = new ArrayList<>();
        JSONObject jSONObject5 = jSONObject.has(at) ? jSONObject.getJSONObject(at) : jSONObject.has(au) ? jSONObject.getJSONObject(au) : null;
        if (jSONObject5 == null || !jSONObject5.has(av)) {
            arrayList = arrayList3;
            strOptString = null;
            str3 = null;
            str4 = null;
            str5 = null;
            jSONObject2 = null;
            z3 = false;
        } else {
            JSONObject jSONObject6 = jSONObject5.getJSONObject(av);
            String string3 = jSONObject6.has(aE) ? jSONObject6.getString(aE) : null;
            String string4 = jSONObject6.has(f62327aF) ? jSONObject6.getString(f62327aF) : null;
            try {
                if (jSONObject6.has(f62341g)) {
                    String strOptString4 = jSONObject6.optString(f62341g);
                    byte[] bArrDecode = !TextUtils.isEmpty(strOptString4) ? Base64.decode(strOptString4, 0) : null;
                    str14 = bArrDecode != null ? com.safedk.android.utils.c.a(bArrDecode) : null;
                    if (str14 != null) {
                        Logger.d(f62349o, "found EC_HTML content");
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else if (jSONObject6.has(f62340f)) {
                    String string5 = jSONObject6.getString(f62340f);
                    if (TextUtils.isEmpty(string5)) {
                        str14 = string5;
                        z5 = false;
                    } else {
                        str14 = new String(Base64.decode(string5, 0));
                        z5 = false;
                    }
                } else {
                    z5 = false;
                    str14 = null;
                }
                Logger.d(f62349o, "get CI from Json HTML is: ", str14);
                if (TextUtils.isEmpty(str14)) {
                    str5 = string3;
                    str4 = string4;
                    arrayList = arrayList3;
                    strOptString = null;
                    z3 = z5;
                    str3 = str14;
                    jSONObject2 = jSONObject6;
                } else {
                    ArrayList<String> arrayListF = n.f(str14);
                    String strE = E(str14);
                    Logger.d(f62349o, "get CI from Json HTML clickUrl : ", strE);
                    str5 = string3;
                    strOptString = strE;
                    str4 = string4;
                    arrayList = arrayListF;
                    z3 = z5;
                    str3 = str14;
                    jSONObject2 = jSONObject6;
                }
            } catch (Throwable th3) {
                th = th3;
                i2 = 3;
                c4 = 1;
                c2 = 2;
                obj = null;
                c5 = 0;
                th = th;
                r16 = obj;
                Object[] objArr = new Object[i2];
                objArr[c5] = "get CI from Json object exception: ";
                objArr[c4] = th.getMessage();
                objArr[c2] = th;
                Logger.e(f62349o, objArr);
                return r16;
            }
        }
        JSONObject jSONObject7 = jSONObject.has("tpat") ? jSONObject.getJSONObject("tpat") : null;
        if (strOptString == null && jSONObject2 != null && jSONObject2.has(az)) {
            obj2 = null;
            try {
                strOptString = jSONObject2.optString(az, null);
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
                i2 = 3;
                c4 = 1;
                c2 = 2;
                c5 = 0;
                th = th;
                r16 = obj;
                Object[] objArr2 = new Object[i2];
                objArr2[c5] = "get CI from Json object exception: ";
                objArr2[c4] = th.getMessage();
                objArr2[c2] = th;
                Logger.e(f62349o, objArr2);
                return r16;
            }
        }
        if (strOptString == null && jSONObject2 != null && jSONObject2.has(aA)) {
            strOptString = jSONObject2.optString(aA, null);
        }
        if (strOptString == null && jSONObject.has(f62318U)) {
            strOptString = jSONObject.getString(f62318U);
        }
        if (strOptString == null && jSONObject7 != null && jSONObject7.has("clickUrl")) {
            obj2 = null;
            strOptString = jSONObject7.optString("clickUrl", null);
        }
        JSONObject jSONObject8 = jSONObject7;
        String str15 = str3;
        Object[] objArr3 = new Object[2];
        c5 = 0;
        try {
            objArr3[0] = "get CI from Json clickUrl processing ";
            objArr3[1] = strOptString;
            Logger.d(f62349o, objArr3);
            if (n.a((Object) strOptString)) {
                Logger.d(f62349o, "handle app package name debug url = ", strOptString, ", packageId = ", n.o(strOptString));
            }
            if (TextUtils.isEmpty(strOptString) || !n.n(strOptString)) {
                strOptString = strOptString;
            } else {
                try {
                    JSONArray jSONArray = new JSONArray(strOptString);
                    if (jSONArray.length() > 0) {
                        strOptString = (String) jSONArray.get(0);
                    }
                    i3 = 2;
                } catch (Throwable th5) {
                    i3 = 2;
                    Logger.d(f62349o, "get CI from Json clickUrl processing exception :", th5.getMessage(), th5);
                    strOptString = strOptString;
                }
                Object[] objArr4 = new Object[i3];
                objArr4[0] = "get CI from Json clickUrl processing unescaped = ";
                c4 = 1;
                try {
                    objArr4[1] = strOptString;
                    Logger.d(f62349o, objArr4);
                } catch (Throwable th6) {
                    th = th6;
                    i2 = 3;
                    c2 = 2;
                    obj = null;
                    c5 = 0;
                    th = th;
                    r16 = obj;
                    Object[] objArr22 = new Object[i2];
                    objArr22[c5] = "get CI from Json object exception: ";
                    objArr22[c4] = th.getMessage();
                    objArr22[c2] = th;
                    Logger.e(f62349o, objArr22);
                    return r16;
                }
            }
            HashMap<String, String> mapA = a(jSONObject, string);
            if (strOptString == null && mapA.containsKey("clickUrl_0")) {
                strOptString = mapA.get("clickUrl_0");
                mapA.remove("clickUrl_0");
            }
            if (jSONObject.has(f62351q)) {
                String string6 = jSONObject.getString(f62351q);
                if (string6 != null && !string6.equals(V8ValueNull.NULL)) {
                    string2 = string6.split("\\|")[1];
                }
                Logger.d(f62349o, "get CI from Json Campaign is null, exiting");
                return null;
            }
            string2 = jSONObject.has("creative_id") ? jSONObject.getString("creative_id") : null;
            String str16 = str4;
            Object[] objArr5 = new Object[2];
            c5 = 0;
            objArr5[0] = "get CI from Json creativeId is ";
            objArr5[1] = string2;
            Logger.d(f62349o, objArr5);
            String string7 = jSONObject.has("url") ? jSONObject.getString("url") : (jSONObject2 == null || !jSONObject2.has(f62323Z)) ? null : jSONObject2.getString(f62323Z);
            if (jSONObject.has(af)) {
                String string8 = jSONObject.getString(af);
                str6 = str5;
                arrayList2 = arrayList;
                Logger.d(f62349o, "get CI from Json zip files bundle identified ", string8, " in ", af);
                str7 = string8;
            } else {
                str6 = str5;
                arrayList2 = arrayList;
                if (jSONObject.has(ag)) {
                    String string9 = jSONObject.getString(ag);
                    Logger.d(f62349o, "get CI from Json zip files bundle identified ", string9, " in ", ag);
                    str7 = string9;
                } else {
                    Logger.d(f62349o, "get CI from Json zip files bundle not present in prefetch data.");
                    str7 = null;
                }
            }
            if (TextUtils.isEmpty(string7)) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(at);
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = jSONObject.optJSONObject(au);
                }
                if (jSONObjectOptJSONObject2 != null) {
                    JSONObject jSONObject9 = jSONObjectOptJSONObject2.getJSONObject(ad);
                    if (jSONObject9.has("MAIN_VIDEO")) {
                        string7 = jSONObject9.getJSONObject("MAIN_VIDEO").getString("url");
                    }
                }
            }
            if (TextUtils.isEmpty(string7) && jSONObject2 != null && jSONObject2.has(aN)) {
                string7 = jSONObject2.optString(aN);
            }
            if (TextUtils.isEmpty(string7)) {
                jSONObjectOptJSONObject = (jSONObject5 == null || !jSONObject5.has(ad)) ? null : jSONObject5.optJSONObject(YmsTEL.BzbYKJrV);
                JSONObject jSONObjectOptJSONObject3 = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(f62329aO)) ? null : jSONObjectOptJSONObject.optJSONObject(f62329aO);
                if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.has("url")) {
                    string7 = jSONObjectOptJSONObject3.optString("url");
                }
            } else {
                jSONObjectOptJSONObject = null;
            }
            if (string7 != null) {
                strOptString2 = string7;
                long jCurrentTimeMillis = System.currentTimeMillis() + this.f62226C.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE);
                Logger.d(f62349o, "get CI from Json expiration initial value (now, 1 week) =  ", Long.valueOf(jCurrentTimeMillis));
                if (jSONObject.has(ai)) {
                    j2 = jCurrentTimeMillis;
                } else {
                    long j3 = jSONObject.getLong(ai) * 1000;
                    Logger.d(f62349o, "get CI from Json expiration override ,  new values is ", Long.valueOf(j3));
                    j2 = j3;
                }
                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                try {
                    strOptString3 = jSONObject.optString(ah, null);
                    Object[] objArr6 = new Object[2];
                    objArr6[0] = "get CI from Json templateType is ";
                    objArr6[1] = strOptString3;
                    Logger.d(f62349o, objArr6);
                    if (strOptString3 == null && strOptString3.equals("banner")) {
                        adType = BrandSafetyUtils.AdType.BANNER;
                    } else if (strOptString3 == null && strOptString3.equals("mrec")) {
                        adType = BrandSafetyUtils.AdType.MREC;
                    } else if (strOptString3 == null && strOptString3.equals("native")) {
                        adType = BrandSafetyUtils.AdType.NATIVE;
                    } else if (strOptString3 != null && strOptString3.equals("fullscreen")) {
                        adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                    }
                    if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                        adFormatType = adType.equals(BrandSafetyUtils.AdType.BANNER) ? BrandSafetyEvent.AdFormatType.BANNER : adType.equals(BrandSafetyUtils.AdType.MREC) ? BrandSafetyEvent.AdFormatType.MREC : null;
                    } else if (str == null || !f62331aT.containsKey(str)) {
                        Object[] objArr7 = new Object[3];
                        objArr7[0] = "get CI from Json process placements data does not contain the placement ";
                        objArr7[1] = str;
                        objArr7[2] = ", will try to determine based on REWARDED_VALUE";
                        Logger.d(f62349o, objArr7);
                        adFormatType = jSONObject.optInt(aa) == ab ? BrandSafetyEvent.AdFormatType.REWARD : BrandSafetyEvent.AdFormatType.INTER;
                    } else {
                        BrandSafetyEvent.AdFormatType adFormatType2 = f62331aT.get(str).booleanValue() ? BrandSafetyEvent.AdFormatType.REWARD : BrandSafetyEvent.AdFormatType.INTER;
                        Logger.d(f62349o, "get CI from Json process placements placement ", str, " is ", adFormatType2);
                        adFormatType = adFormatType2;
                    }
                    ArrayList<String> arrayListF2 = n.f(jSONObject.toString());
                    if (!TextUtils.isEmpty(strOptString) || strOptString.contains(f62325aC)) {
                        Object[] objArr8 = new Object[2];
                        objArr8[0] = "get CI from Json clickUrl discarded : ";
                        str8 = null;
                        try {
                            objArr8[1] = null;
                            Logger.printFullVerboseLog(f62349o, objArr8);
                            str9 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            str2 = str8;
                            i2 = 3;
                            c4 = 1;
                            c2 = 2;
                            obj = str2;
                            c5 = 0;
                            th = th;
                            r16 = obj;
                            Object[] objArr222 = new Object[i2];
                            objArr222[c5] = "get CI from Json object exception: ";
                            objArr222[c4] = th.getMessage();
                            objArr222[c2] = th;
                            Logger.e(f62349o, objArr222);
                            return r16;
                        }
                    } else {
                        Object[] objArr9 = new Object[2];
                        objArr9[0] = "get CI from Json clickUrl : ";
                        c4 = 1;
                        objArr9[1] = strOptString;
                        Logger.printFullVerboseLog(f62349o, objArr9);
                        str9 = strOptString;
                        str8 = null;
                    }
                    String string10 = !jSONObject.has(aj) ? jSONObject.getString(aj) : jSONObject.has(f62332ak) ? jSONObject.getString(f62332ak) : str8;
                    str10 = (string10 == null && "native".equals(strOptString3)) ? string10 + "/" + strOptString3 : string10;
                    Object[] objArr10 = new Object[2];
                    c5 = 0;
                    try {
                        objArr10[0] = "get CI from Json struct : ";
                        objArr10[1] = str10;
                        Logger.d(f62349o, objArr10);
                        Object[] objArr11 = new Object[12];
                        c5 = 0;
                        objArr11[0] = "get CI from Json adtype = ";
                        objArr11[1] = adType == null ? adType.name() : V8ValueNull.NULL;
                        objArr11[2] = ", id: ";
                        objArr11[3] = string;
                        objArr11[4] = ", click url: ";
                        objArr11[5] = str9;
                        objArr11[6] = ", creative id: ";
                        objArr11[7] = string2;
                        objArr11[8] = ", video url: ";
                        objArr11[9] = strOptString2;
                        objArr11[10] = "postBundle = ";
                        objArr11[11] = str7 == null ? str7 : "";
                        Logger.d(f62349o, objArr11);
                        str11 = str6;
                        JSONObject jSONObject10 = jSONObject2;
                        obj = str8;
                        ArrayList<String> arrayList4 = arrayList2;
                        try {
                            VungleCreativeInfo vungleCreativeInfo = new VungleCreativeInfo(adType, string, string2, str9, strOptString2, adFormatType, str, this.f62229G, j2, str10);
                            if ("native".equals(strOptString3)) {
                                try {
                                    vungleCreativeInfo.b((List<String>) arrayListF2);
                                    vungleCreativeInfo.b((List<String>) arrayList4);
                                    jSONObject3 = jSONObject;
                                    z4 = z2;
                                    str12 = strOptString3;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th = th;
                                    i2 = 3;
                                    c4 = 1;
                                    c2 = 2;
                                    r16 = obj;
                                    Object[] objArr2222 = new Object[i2];
                                    objArr2222[c5] = "get CI from Json object exception: ";
                                    objArr2222[c4] = th.getMessage();
                                    objArr2222[c2] = th;
                                    Logger.e(f62349o, objArr2222);
                                    return r16;
                                }
                            } else {
                                jSONObject3 = jSONObject;
                                z4 = z2;
                                str12 = strOptString3;
                                a(vungleCreativeInfo, jSONObject3, z4);
                            }
                            if (str11 != null) {
                                vungleCreativeInfo.m(str11);
                            }
                            if (str16 == null) {
                                str13 = str16;
                                vungleCreativeInfo.i(str13);
                            } else {
                                str13 = str16;
                            }
                            if (z3) {
                                tVar = this;
                            } else {
                                tVar = this;
                                try {
                                    tVar.d((CreativeInfo) vungleCreativeInfo, str15);
                                    FileUploadManager.a().a(new FileUploadManager.FileUploadData(aM, str15, vungleCreativeInfo.N()));
                                } catch (Throwable th9) {
                                    th = th9;
                                    th = th;
                                    i2 = 3;
                                    c4 = 1;
                                    c2 = 2;
                                    r16 = obj;
                                    Object[] objArr22222 = new Object[i2];
                                    objArr22222[c5] = "get CI from Json object exception: ";
                                    objArr22222[c4] = th.getMessage();
                                    objArr22222[c2] = th;
                                    Logger.e(f62349o, objArr22222);
                                    return r16;
                                }
                            }
                            try {
                                Object[] objArr12 = new Object[4];
                                objArr12[0] = "get CI from Json - buyer id is: ";
                                c4 = 1;
                                try {
                                    objArr12[1] = str11;
                                    c2 = 2;
                                    try {
                                        objArr12[2] = " and ad domain is: ";
                                        i2 = 3;
                                        try {
                                            objArr12[3] = str13;
                                            Logger.d(f62349o, objArr12);
                                            synchronized (aS) {
                                                aS.put(string, vungleCreativeInfo);
                                            }
                                            if ("native".equals(str12) && !z4 && aVar != null) {
                                                String str17 = aVar.f62188c + "_" + aVar.f62186a + "_" + h.f63164d;
                                                Logger.d(f62349o, "get CI from Json - saving native banner ad with id= ", str17);
                                                synchronized (aS) {
                                                    aS.put(str17, vungleCreativeInfo);
                                                }
                                            }
                                            if (strOptString2 != null && !z4) {
                                                vungleCreativeInfo.b(Arrays.asList(strOptString2));
                                            }
                                            if (str7 != null && !z4) {
                                                Logger.d(f62349o, "get CI from Json adding zip files bundle ", str7, " to prefetch resources");
                                                vungleCreativeInfo.c(Arrays.asList(str7));
                                            }
                                            if (mapA.size() > 0) {
                                                for (String str18 : mapA.values()) {
                                                    if (vungleCreativeInfo.v(str18)) {
                                                        Logger.d(f62349o, "get CI from Json adding url to CI dsp domains: ", str18);
                                                        vungleCreativeInfo.x(str18);
                                                    }
                                                }
                                            }
                                            if (vungleCreativeInfo.p() == null && jSONObject3.has(f62317T)) {
                                                tVar.a(jSONObject3.getString(f62317T), vungleCreativeInfo, f62317T);
                                            }
                                            if (vungleCreativeInfo.p() == null && jSONObject3.has(f62318U)) {
                                                tVar.a(jSONObject3.getString(f62318U), vungleCreativeInfo, f62318U);
                                            }
                                            if (vungleCreativeInfo.p() == null && jSONObject3.has(ax)) {
                                                vungleCreativeInfo.q(jSONObject3.getString(ax));
                                                Logger.d(f62349o, "app package name will be updated from ", ax, " to ", jSONObject3.getString(ax));
                                            }
                                            if (vungleCreativeInfo.p() == null) {
                                                jSONObject4 = jSONObject10;
                                                if (jSONObject4 != null && jSONObject4.has(ay)) {
                                                    tVar.a(jSONObject4.getString(ay), vungleCreativeInfo, ay);
                                                }
                                            } else {
                                                jSONObject4 = jSONObject10;
                                            }
                                            if (vungleCreativeInfo.p() == null && jSONObject4 != null && jSONObject4.has(az)) {
                                                tVar.a(jSONObject4.getString(az), vungleCreativeInfo, az);
                                            }
                                            if (vungleCreativeInfo.p() == null && jSONObject4 != null && jSONObject4.has(aA)) {
                                                tVar.a(jSONObject4.getString(aA), vungleCreativeInfo, aA);
                                            }
                                            if (vungleCreativeInfo.p() == null && jSONObject8 != null && jSONObject8.has("clickUrl")) {
                                                Object obj3 = jSONObject8.get("clickUrl");
                                                if (obj3 instanceof String) {
                                                    tVar.a(jSONObject8.getString("clickUrl"), vungleCreativeInfo, "clickUrl");
                                                } else if (obj3 instanceof JSONArray) {
                                                    JSONArray jSONArray2 = jSONObject8.getJSONArray("clickUrl");
                                                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                                                        if (vungleCreativeInfo.p() == null) {
                                                            tVar.a(jSONArray2.getString(i5), vungleCreativeInfo, "clickUrl_" + i5);
                                                        }
                                                    }
                                                }
                                            }
                                            return vungleCreativeInfo;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            th = th;
                                            r16 = obj;
                                            Object[] objArr222222 = new Object[i2];
                                            objArr222222[c5] = "get CI from Json object exception: ";
                                            objArr222222[c4] = th.getMessage();
                                            objArr222222[c2] = th;
                                            Logger.e(f62349o, objArr222222);
                                            return r16;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        i2 = 3;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    i2 = 3;
                                    obj = obj;
                                    c2 = 2;
                                    th = th;
                                    r16 = obj;
                                    Object[] objArr2222222 = new Object[i2];
                                    objArr2222222[c5] = "get CI from Json object exception: ";
                                    objArr2222222[c4] = th.getMessage();
                                    objArr2222222[c2] = th;
                                    Logger.e(f62349o, objArr2222222);
                                    return r16;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                i2 = 3;
                                c4 = 1;
                                obj = obj;
                                c2 = 2;
                                th = th;
                                r16 = obj;
                                Object[] objArr22222222 = new Object[i2];
                                objArr22222222[c5] = "get CI from Json object exception: ";
                                objArr22222222[c4] = th.getMessage();
                                objArr22222222[c2] = th;
                                Logger.e(f62349o, objArr22222222);
                                return r16;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        obj = str8;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    str2 = null;
                }
            } else {
                JSONObject jSONObjectOptJSONObject4 = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(f62330aP)) ? null : jSONObjectOptJSONObject.optJSONObject(f62330aP);
                if (jSONObjectOptJSONObject4 != null && jSONObjectOptJSONObject4.has("url")) {
                    strOptString2 = jSONObjectOptJSONObject4.optString("url");
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() + this.f62226C.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE);
                Logger.d(f62349o, "get CI from Json expiration initial value (now, 1 week) =  ", Long.valueOf(jCurrentTimeMillis2));
                if (jSONObject.has(ai)) {
                }
                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                strOptString3 = jSONObject.optString(ah, null);
                Object[] objArr62 = new Object[2];
                objArr62[0] = "get CI from Json templateType is ";
                objArr62[1] = strOptString3;
                Logger.d(f62349o, objArr62);
                if (strOptString3 == null) {
                    if (strOptString3 == null) {
                        if (strOptString3 == null) {
                            if (strOptString3 != null) {
                                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                            }
                            if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                            }
                            ArrayList<String> arrayListF22 = n.f(jSONObject.toString());
                            if (TextUtils.isEmpty(strOptString)) {
                                Object[] objArr82 = new Object[2];
                                objArr82[0] = "get CI from Json clickUrl discarded : ";
                                str8 = null;
                                objArr82[1] = null;
                                Logger.printFullVerboseLog(f62349o, objArr82);
                                str9 = null;
                                if (!jSONObject.has(aj)) {
                                }
                                if (string10 == null) {
                                    Object[] objArr102 = new Object[2];
                                    c5 = 0;
                                    objArr102[0] = "get CI from Json struct : ";
                                    objArr102[1] = str10;
                                    Logger.d(f62349o, objArr102);
                                    Object[] objArr112 = new Object[12];
                                    c5 = 0;
                                    objArr112[0] = "get CI from Json adtype = ";
                                    objArr112[1] = adType == null ? adType.name() : V8ValueNull.NULL;
                                    objArr112[2] = ", id: ";
                                    objArr112[3] = string;
                                    objArr112[4] = ", click url: ";
                                    objArr112[5] = str9;
                                    objArr112[6] = ", creative id: ";
                                    objArr112[7] = string2;
                                    objArr112[8] = ", video url: ";
                                    objArr112[9] = strOptString2;
                                    objArr112[10] = "postBundle = ";
                                    objArr112[11] = str7 == null ? str7 : "";
                                    Logger.d(f62349o, objArr112);
                                    str11 = str6;
                                    JSONObject jSONObject102 = jSONObject2;
                                    obj = str8;
                                    ArrayList<String> arrayList42 = arrayList2;
                                    VungleCreativeInfo vungleCreativeInfo2 = new VungleCreativeInfo(adType, string, string2, str9, strOptString2, adFormatType, str, this.f62229G, j2, str10);
                                    if ("native".equals(strOptString3)) {
                                    }
                                    if (str11 != null) {
                                    }
                                    if (str16 == null) {
                                    }
                                    if (z3) {
                                    }
                                    Object[] objArr122 = new Object[4];
                                    objArr122[0] = "get CI from Json - buyer id is: ";
                                    c4 = 1;
                                    objArr122[1] = str11;
                                    c2 = 2;
                                    objArr122[2] = " and ad domain is: ";
                                    i2 = 3;
                                    objArr122[3] = str13;
                                    Logger.d(f62349o, objArr122);
                                    synchronized (aS) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th17) {
            th = th17;
            i2 = 3;
            c4 = 1;
            c2 = 2;
            obj = null;
        }
        Object[] objArr222222222 = new Object[i2];
        objArr222222222[c5] = "get CI from Json object exception: ";
        objArr222222222[c4] = th.getMessage();
        objArr222222222[c2] = th;
        Logger.e(f62349o, objArr222222222);
        return r16;
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, boolean z2) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(at);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject(au);
        }
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(av);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString(aH);
                if (!TextUtils.isEmpty(strOptString)) {
                    if (z2) {
                        creativeInfo.A(CreativeInfo.aM + strOptString);
                    } else {
                        creativeInfo.z(strOptString);
                    }
                }
                String strOptString2 = jSONObjectOptJSONObject2.optString(aI);
                if (!TextUtils.isEmpty(strOptString2)) {
                    if (z2) {
                        creativeInfo.A(CreativeInfo.f62433aP + strOptString2);
                    } else {
                        creativeInfo.z(strOptString2);
                    }
                }
                String strOptString3 = jSONObjectOptJSONObject2.optString(aJ);
                if (!TextUtils.isEmpty(strOptString3)) {
                    if (z2) {
                        creativeInfo.A(CreativeInfo.aQ + strOptString3);
                    } else {
                        creativeInfo.z(strOptString3);
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(ad);
            if (jSONObjectOptJSONObject3 != null) {
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("MAIN_IMAGE");
                if (jSONObjectOptJSONObject4 != null) {
                    String strOptString4 = jSONObjectOptJSONObject4.optString("url");
                    if (!TextUtils.isEmpty(strOptString4)) {
                        if (z2) {
                            creativeInfo.A(CreativeInfo.aN + strOptString4);
                        } else {
                            creativeInfo.y(strOptString4);
                        }
                    }
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject(f62328aL);
                if (jSONObjectOptJSONObject5 != null) {
                    String strOptString5 = jSONObjectOptJSONObject5.optString("url");
                    if (!TextUtils.isEmpty(strOptString5)) {
                        if (!z2) {
                            creativeInfo.y(strOptString5);
                            return;
                        }
                        creativeInfo.A(CreativeInfo.f62432aO + strOptString5);
                    }
                }
            }
        }
    }

    private void a(String str, VungleCreativeInfo vungleCreativeInfo, String str2) {
        Logger.d(f62349o, "handle app package name started, appPackageName = ", str);
        if (str != null) {
            str = n.o(str);
        }
        if (str != null) {
            vungleCreativeInfo.q(str);
            Logger.d(f62349o, "app package name will be updated from ", str2, " to ", str);
        } else {
            Logger.d(f62349o, "app package name from ", str2, " not valid, skipping value ", str);
        }
    }

    private HashMap<String, String> a(JSONObject jSONObject, String str) {
        HashMap<String, String> map = new HashMap<>();
        try {
            if (jSONObject.has("tpat")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tpat");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String string = itKeys.next().toString();
                    if (jSONObject2.get(string) instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(string);
                        Logger.d(f62349o, "iterating over key '", string, "' , content: ", jSONArray.toString());
                        if (jSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                if (!map.values().contains(jSONArray.getString(i2))) {
                                    map.put(string + "_" + i2, jSONArray.getString(i2));
                                    Logger.d(f62349o, "collecting additional url: ", jSONArray.getString(i2));
                                } else {
                                    Logger.d(f62349o, "url already in map. skipping: ", jSONArray.getString(i2));
                                }
                            }
                        }
                    } else {
                        Logger.d(f62349o, "key '", string, "' is not a JSONArray, skipping");
                    }
                }
            } else {
                Logger.d(f62349o, "tpat key does not exist, exiting");
            }
        } catch (JSONException e2) {
            Logger.e(f62349o, "Error collecting urls under tpat key", e2);
        }
        return map;
    }

    private VungleCreativeInfo a(File file) {
        if (file == null) {
            Logger.d(f62349o, "get ad ID by video file - file is null");
            return null;
        }
        String strC = C(file.getAbsolutePath());
        Logger.d(f62349o, "get ad ID by video file - creative to ID map iteration, looking for '", strC, "', key set: ", aQ.keySet().toString());
        PersistentConcurrentHashMap<String, VungleCreativeInfo> persistentConcurrentHashMap = aQ;
        if (persistentConcurrentHashMap != null && strC != null) {
            synchronized (persistentConcurrentHashMap) {
                VungleCreativeInfo vungleCreativeInfoRemove = aQ.remove(strC);
                if (vungleCreativeInfoRemove != null) {
                    Logger.d(f62349o, Logger.FeatureTag.CI_MATCHING, "get ad ID by video file - CI MATCH! creative found: ", strC);
                    return vungleCreativeInfoRemove;
                }
                Iterator<String> it = aQ.keySet().iterator();
                while (it.hasNext()) {
                    VungleCreativeInfo vungleCreativeInfo = aQ.get(it.next());
                    if (vungleCreativeInfo.P().equals(strC)) {
                        Logger.d(f62349o, Logger.FeatureTag.CI_MATCHING, "get ad ID by video file - CI MATCH! creative found: ", strC);
                        return vungleCreativeInfo;
                    }
                }
            }
        }
        Logger.d(f62349o, "get ad ID by video file - creative not found");
        return null;
    }

    private String C(String str) {
        if (str != null && str.split("/").length > 1) {
            String str2 = str.split("/")[str.split("/").length - 2];
            Logger.d(f62349o, "ad ID to be searched: ", str2);
            return str2;
        }
        Logger.d(f62349o, "file path is not according to the expected pattern: ", str, ", cannot extract CreativeId");
        return null;
    }

    private boolean b(JSONObject jSONObject) throws JSONException {
        return !((JSONObject) jSONObject.get(f62337c)).has(ah) ? true : true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        e.a(aQ, "VungleDiscovery:creativeToIdMap");
        e.a(aR, "VungleDiscovery:mediaPlayerIdToCreativeInfo");
        e.a(aS, "VungleDiscovery:adToIdMap");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType k(String str) {
        if (str != null && str.startsWith(f62347m)) {
            if (str.contains("open")) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            return null;
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String l(String str) {
        if (str != null && str.contains(f62347m)) {
            return k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String v(String str) {
        try {
            if (str.startsWith("window.vungle.mraidBridge.notifyReadyEvent")) {
                String strA = k.a(str, "\"SESSION_ID\":\"", "\"");
                Logger.d(f62349o, "get ad id from evaluate JS - session ID: ", strA);
                return strA;
            }
            return null;
        } catch (Throwable th) {
            Logger.d(f62349o, "get ad id from evaluate JS exception", th);
            return null;
        }
    }
}
