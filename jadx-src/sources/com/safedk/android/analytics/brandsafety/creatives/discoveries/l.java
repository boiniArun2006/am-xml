package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MintegralCreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.brandsafety.n;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f62252A = "ext_data";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f62253B = "par_dspid";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f62254C = "slot_id";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f62255D = "{";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f62256E = "}";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f62257F = "ad_type";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final int f62258G = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final String f62259H = "mof_template_url";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String f62262K = "choose_from_two";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String f62263L = "multi_ad_mintegral_dsp";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String f62264M = "rks";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f62265N = "a";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f62266O = "b";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final String f62267P = "c";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final String f62268Q = "aks";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final String f62269R = "k";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final String f62270S = "q";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final String f62271T = "r";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final String f62272U = "al";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final String f62273V = "csp";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final String f62274W = "mp";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f62275X = "drp";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final String f62276Y = "ap";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final String f62277Z = "srp";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62278a = "status";
    private static final String aa = "sdkId";
    private static final String ab = "webviewAddress";
    private static final String ac = "direction";
    private static final String ad = "recommendation-images";
    private static final String ae = "recommendations";
    private static final String af = "url";
    private static final String ag = "responseText";
    private static final String ah = "image_url";
    private static final String ai = "title";
    private static final String aj = "icon_url";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f62279ak = "desc";
    private static final String al = "ctatext";
    private static final Map<String, String> am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62280b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62281c = "data";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f62282d = 287;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f62283e = 94;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f62284f = 296;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f62285g = 42;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f62286h = 295;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f62291m = "MintegralDiscoveryHelper";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f62292n = "ads";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f62293o = "id";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f62294p = "video_url";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62295q = "image_url";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f62296r = "end_screen_url";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f62297s = "unit_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f62298t = "package_name";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f62299u = "click_url";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f62300v = "cam_html";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f62301w = "ad_tracking";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f62302x = "impression";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f62303y = "impression_url";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f62304z = "adv_id";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final String[] f62260I = {"mbridge_same_choice_one_layout", "bigTplChoseFromTwo"};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String[] f62261J = {"mbridge_order_layout_list", "big-template-501"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62287i = ".rayjump.com/openapi/moreoffer";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62288j = "mtgglobals.com/openapi/moreoffer";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62289k = ".rayjump.com//openapi/moreoffer";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List<String> f62290l = Arrays.asList(f62287i, f62288j, f62289k);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f62314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashSet<String> f62315b = new HashSet<>();
    }

    static {
        HashMap map = new HashMap();
        am = map;
        map.put("+", "X");
        am.put("/", "u");
        am.put("0", CmcdData.OBJECT_TYPE_INIT_SEGMENT);
        am.put("1", "6");
        am.put("2", "1");
        am.put("3", f62269R);
        am.put("4", "e");
        am.put("5", "V");
        am.put("6", InneractiveMediationDefs.GENDER_FEMALE);
        am.put("7", RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        am.put("8", f62271T);
        am.put("9", "4");
        am.put("A", "z");
        am.put("B", "y");
        am.put("C", "/");
        am.put("D", "Y");
        am.put("E", "o");
        am.put("F", "2");
        am.put(RequestConfiguration.MAX_AD_CONTENT_RATING_G, "O");
        am.put("H", "Z");
        am.put("I", "8");
        am.put("J", "d");
        am.put("K", "9");
        am.put("L", "a");
        am.put("M", "w");
        am.put("N", "Q");
        am.put("O", "7");
        am.put("P", "5");
        am.put("Q", CmcdData.STREAM_TYPE_LIVE);
        am.put("R", "I");
        am.put("S", "B");
        am.put(RequestConfiguration.MAX_AD_CONTENT_RATING_T, "0");
        am.put("U", "j");
        am.put("V", "U");
        am.put("W", "L");
        am.put("X", "v");
        am.put("Y", f62266O);
        am.put("Z", "S");
        am.put("a", "D");
        am.put(f62266O, "3");
        am.put(f62267P, "F");
        am.put("d", "H");
        am.put("e", "x");
        am.put(InneractiveMediationDefs.GENDER_FEMALE, "N");
        am.put("g", c.f62177j);
        am.put(CmcdData.STREAMING_FORMAT_HLS, f62267P);
        am.put(CmcdData.OBJECT_TYPE_INIT_SEGMENT, "M");
        am.put("j", "E");
        am.put(f62269R, "W");
        am.put(CmcdData.STREAM_TYPE_LIVE, "g");
        am.put("m", "+");
        am.put(c.f62177j, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        am.put("o", "C");
        am.put(TtmlNode.TAG_P, "K");
        am.put(f62270S, f62270S);
        am.put(f62271T, "m");
        am.put(CmcdData.STREAMING_FORMAT_SS, CmcdData.STREAMING_FORMAT_SS);
        am.put("t", CmcdData.STREAMING_FORMAT_HLS);
        am.put("u", TtmlNode.TAG_P);
        am.put("v", "A");
        am.put("w", "t");
        am.put("x", "R");
        am.put("y", "P");
        am.put("z", "J");
        am.put(com.safedk.android.analytics.brandsafety.l.ae, com.safedk.android.analytics.brandsafety.l.ae);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f62305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f62306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f62307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f62308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f62309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f62310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f62311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f62312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f62313i;

        public String toString() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            StringBuilder sb = new StringBuilder();
            String str9 = "";
            if (this.f62305a != null) {
                str = this.f62305a + " ";
            } else {
                str = "";
            }
            sb.append(str);
            if (this.f62306b != null) {
                str2 = this.f62306b + " ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            if (this.f62307c != null) {
                str3 = this.f62307c + " ";
            } else {
                str3 = "";
            }
            sb.append(str3);
            if (this.f62308d != null) {
                str4 = this.f62308d + " ";
            } else {
                str4 = "";
            }
            sb.append(str4);
            if (this.f62309e != null) {
                str5 = this.f62309e + " ";
            } else {
                str5 = "";
            }
            sb.append(str5);
            if (this.f62310f != null) {
                str6 = this.f62310f + " ";
            } else {
                str6 = "";
            }
            sb.append(str6);
            if (this.f62311g != null) {
                str7 = this.f62311g + " ";
            } else {
                str7 = "";
            }
            sb.append(str7);
            if (this.f62312h != null) {
                str8 = this.f62312h + " ";
            } else {
                str8 = "";
            }
            sb.append(str8);
            if (this.f62313i != null) {
                str9 = this.f62313i + " ";
            }
            sb.append(str9);
            return sb.toString();
        }
    }

    public static void a(String str, String str2, String str3) {
        if (!str.equals(h.f63175o) && b(str3)) {
            Logger.d(f62291m, "add multiple ads downstream struct started, sdkPackageName= ", str, ", webViewAddress= ", str2, ", url= ", str3);
            BannerFinder bannerFinderA = SafeDK.getInstance().A();
            if (bannerFinderA != null) {
                List<CreativeInfo> listA = bannerFinderA.a(str, str2);
                if (listA != null && !listA.isEmpty()) {
                    Logger.d(f62291m, "add multiple ads downstream struct - found CIs by webView= ", listA);
                    for (CreativeInfo creativeInfo : listA) {
                        synchronized (creativeInfo) {
                            if (creativeInfo.an()) {
                                Logger.d(f62291m, "add multiple ads downstream struct - CI is already multi, not adding ", CreativeInfo.aJ, " to CI= ", creativeInfo.ac());
                            } else if (creativeInfo.h() != null && creativeInfo.h().contains(CreativeInfo.aJ)) {
                                Logger.d(f62291m, "add multiple ads downstream struct - already added ", CreativeInfo.aJ, " to CI= ", creativeInfo.ac());
                            } else {
                                Logger.d(f62291m, "add multiple ads downstream struct - adding ", CreativeInfo.aJ, YmsTEL.vfPGnjKLDRB, creativeInfo.ac());
                                creativeInfo.a(CreativeInfo.aJ, "");
                            }
                        }
                    }
                    return;
                }
                Logger.d(f62291m, "add multiple ads downstream struct - CI list is null or empty. sdkPackageName = ", str, ", webViewAddress = ", str2);
            }
        }
    }

    public static boolean a(String str) {
        return str != null && str.contains(".rayjump.com") && str.contains("openapi/ad");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = f62290l.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void b(String str, String str2, String str3) {
        n nVarR;
        CreativeInfo creativeInfoJ;
        if (a(str2)) {
            Logger.d(f62291m, "handle DSP recommendations prefetch, URL:", str2);
            InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
            if (interstitialFinderZ != null && (nVarR = interstitialFinderZ.r(str)) != null && (creativeInfoJ = nVarR.j()) != null) {
                Logger.d(f62291m, "handle DSP recommendations prefetch, CI: ", creativeInfoJ.ac());
                a(creativeInfoJ, str2, str3);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        Logger.d(f62291m, "handle dsp recommendations prefetch - started, url= ", str);
        Logger.d(f62291m, "handle dsp recommendations prefetch - bufferValue= ", str2);
        if (creativeInfo != null && str != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.getInt("status") == 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null && a(jSONObjectOptJSONObject)) {
                    Logger.d(f62291m, "handle dsp recommendations prefetch - buffer is recommendations prefetch, calling handleRecommendationsPrefetch");
                    a(creativeInfo, jSONObjectOptJSONObject);
                }
            } catch (JSONException e2) {
                Logger.d(f62291m, "handle dsp recommendations prefetch - not a valid JSON string, exception: ", e2);
            } catch (Throwable th) {
                Logger.d(f62291m, "handle dsp recommendations prefetch - encountered exception: ", th);
            }
        }
    }

    public static CreativeInfo a(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f62291m, "handle recommendations prefetch - started");
        if (creativeInfo.S().equals(h.f63175o)) {
            creativeInfo = b(creativeInfo);
        }
        ArrayList<b> arrayListB = b(jSONObject);
        for (b bVar : arrayListB) {
            creativeInfo.a(bVar.f62314a, bVar.f62315b);
            Logger.printFullVerboseLog(f62291m, "handle recommendations prefetch - added recommendation= ", bVar.f62314a, ", resource list= ", bVar.f62315b);
        }
        creativeInfo.d();
        creativeInfo.u("added_recs (" + com.safedk.android.utils.n.e() + "):" + arrayListB.size());
        return creativeInfo;
    }

    public static CreativeInfo b(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f62291m, "handle inter second prefetch - started");
        if (creativeInfo.S().equals(h.f63175o)) {
            creativeInfo = b(creativeInfo);
        }
        for (b bVar : b(jSONObject)) {
            creativeInfo.a(bVar.f62314a, new HashSet());
            Logger.printFullVerboseLog(f62291m, "handle inter second prefetch - added recommendation= ", bVar.f62314a);
        }
        creativeInfo.d();
        String strH = creativeInfo.h() != null ? creativeInfo.h() : "";
        if (!strH.contains(CreativeInfo.aJ)) {
            creativeInfo.e(strH + CreativeInfo.aJ);
        }
        return creativeInfo;
    }

    public static void c(String str) {
        Logger.d(f62291m, "handle dsp complementary prefetch - started. message= ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Logger.d(f62291m, "handle dsp complementary prefetch - jsonObject= ", jSONObject);
            String strOptString = jSONObject.optString("sdkId");
            Logger.d(f62291m, "handle dsp complementary prefetch - sdk= ", strOptString);
            String strOptString2 = jSONObject.optString(ab);
            Logger.d(f62291m, "handle dsp complementary prefetch - webViewAddress= ", strOptString2);
            if (!TextUtils.isEmpty(strOptString) && !strOptString.equals(h.f63175o) && !TextUtils.isEmpty(strOptString2)) {
                String string = jSONObject.getString(ac);
                Logger.d(f62291m, "handle dsp complementary prefetch - direction= ", string);
                if (!TextUtils.isEmpty(string) && string.equals(ad)) {
                    Logger.d(f62291m, "handle dsp complementary prefetch - full screen recommendations");
                    a(jSONObject, strOptString, strOptString2);
                } else {
                    Logger.d(f62291m, "handle dsp complementary prefetch - banner complementary");
                    b(jSONObject, strOptString, strOptString2);
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "handle dsp complementary prefetch - message is not a valid JSON. exception= ", e2);
        } catch (Exception e3) {
            Logger.d(f62291m, "handle dsp complementary prefetch - encountered exception= ", e3);
        }
    }

    public static void a(CreativeInfo creativeInfo) {
        String strH = creativeInfo.h();
        if (strH != null) {
            creativeInfo.e(strH.replace(CreativeInfo.aJ, ""));
        }
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ae);
            Logger.d(f62291m, "handle dsp fullScreen recommendations - jsonArray= ", jSONArrayOptJSONArray);
            if (jSONArrayOptJSONArray != null) {
                List<CreativeInfo> listA = a(str, str2);
                Logger.d(f62291m, "handle dsp fullScreen recommendations - found CIs= ", listA);
                for (CreativeInfo creativeInfo : listA) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        String str3 = (String) jSONArrayOptJSONArray.get(i2);
                        Logger.d(f62291m, "handle dsp fullScreen recommendations - removing image from webView resources: ", str3);
                        creativeInfo.G(str3);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "handle dsp fullScreen recommendations - exception= ", e2);
        }
    }

    private static void b(JSONObject jSONObject, String str, String str2) {
        try {
            String strOptString = jSONObject.optString("url");
            Logger.d(f62291m, "handle dsp banner complementary prefetch - url is dsp complementary url= ", strOptString);
            if (!b(strOptString)) {
                Logger.d(f62291m, "handle dsp banner complementary prefetch - sdk field is empty or is Mintegral sdk, returning. sdk= ", str);
                return;
            }
            String strOptString2 = jSONObject.optString(ag);
            if (TextUtils.isEmpty(strOptString2)) {
                Logger.d(f62291m, "handle dsp banner complementary prefetch - adsData field is null or empty, returning. adsDataString= ", strOptString2);
            } else {
                JSONObject jSONObject2 = new JSONObject(strOptString2);
                Logger.d(f62291m, "handle dsp banner complementary prefetch - responsePrefetch= ", jSONObject2);
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                Logger.d(f62291m, "handle dsp banner complementary prefetch - adsData= ", jSONObjectOptJSONObject);
                if (jSONObjectOptJSONObject != null) {
                    for (CreativeInfo creativeInfoA : a(str, str2)) {
                        if (c(jSONObjectOptJSONObject)) {
                            Logger.d(f62291m, pTYaLzzmJSGAPQ.pTImaPwOYsQQZJb);
                            creativeInfoA = a(creativeInfoA, jSONObjectOptJSONObject);
                        } else {
                            Logger.d(f62291m, "handle dsp banner complementary prefetch - ads data is second (multi) ad, calling handleSecondMultiAd");
                            c(creativeInfoA, jSONObjectOptJSONObject);
                        }
                        a(creativeInfoA);
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "handle dsp banner complementary prefetch - message is not a valid JSON. exception= ", e2);
        } catch (Exception e3) {
            Logger.d(f62291m, "handle dsp banner complementary prefetch - encountered exception= ", e3);
        }
    }

    public static void c(CreativeInfo creativeInfo, JSONObject jSONObject) {
        Logger.d(f62291m, "handle second multi ad - started, firstCI= ", creativeInfo);
        List<CreativeInfo> listA = a(jSONObject, creativeInfo, creativeInfo.f62473Q, (c.a) null);
        if (!listA.isEmpty()) {
            Logger.d(f62291m, "handle second multi ad - CIs generated= ", listA);
            creativeInfo.a(com.safedk.android.analytics.brandsafety.l.f62647b, new l.a[0]);
            creativeInfo.ao();
            a(creativeInfo);
            StringBuilder sb = new StringBuilder();
            sb.append(creativeInfo.h() != null ? creativeInfo.h() : "");
            sb.append(creativeInfo.S().equals(h.f63175o) ? CreativeInfo.aK : f62263L);
            String str = sb.toString() + CreativeInfo.aI + (listA.size() + 1);
            creativeInfo.e(str);
            Logger.d(f62291m, "handle second multi ad - updating downstream struct of first CI to= ", str);
            SafeDK.getInstance().A().a(creativeInfo);
            for (CreativeInfo creativeInfo2 : listA) {
                creativeInfo2.h(creativeInfo.n());
                creativeInfo2.ao();
                creativeInfo2.e(creativeInfo.h());
                creativeInfo2.j(creativeInfo.H());
                if (creativeInfo.Z() != null) {
                    creativeInfo2.b(creativeInfo.ak(), creativeInfo.aj());
                    Logger.printFullVerboseLog(f62291m, "handle second multi ad - finished updating second CI, calling setCreativeInAdFinder. second CI= ", creativeInfo2);
                    CreativeInfoManager.a(creativeInfo2, creativeInfo.Z(), creativeInfo.aa(), creativeInfo.Y());
                } else {
                    Logger.d(f62291m, "handle second multi ad - not matched yet, adding CI to multi ad list");
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(creativeInfo.S());
                    if (adNetworkDiscoveryJ != null) {
                        adNetworkDiscoveryJ.a(creativeInfo, creativeInfo.N());
                        adNetworkDiscoveryJ.a(creativeInfo2, creativeInfo.N());
                    }
                }
            }
            return;
        }
        Logger.d(f62291m, "handle second multi ad - could not generate second CI");
    }

    public static List<CreativeInfo> a(JSONObject jSONObject, CreativeInfo creativeInfo, String str, c.a aVar) {
        BrandSafetyEvent.AdFormatType adFormatTypeValueOf;
        BrandSafetyUtils.AdType adTypeM;
        int i2 = 1;
        Logger.d(f62291m, "generate CI - started");
        ArrayList arrayList = new ArrayList();
        Map<String, String> mapG = g(jSONObject);
        int i3 = 2;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(f62291m, gUxOLwRQBPPLC.WUvzaeCC, Integer.valueOf(jSONArray.length()));
            int i5 = 0;
            while (i5 < jSONArray.length()) {
                Object[] objArr = new Object[i3];
                objArr[0] = "generate CI - Looping over ad index= ";
                objArr[i2] = Integer.valueOf(i5);
                Logger.d(f62291m, objArr);
                JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                Map<String, String> mapF = f(jSONObject2.optJSONObject(f62268Q));
                a aVarB = b(jSONObject2, mapG, mapF);
                String strA = a(aVarB);
                if (strA == null) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = "generate CI - adId is null, skipping this ad";
                    Logger.d(f62291m, objArr2);
                } else {
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = "generate CI - adId= ";
                    objArr3[i2] = strA;
                    Logger.d(f62291m, objArr3);
                    if (creativeInfo == null) {
                        Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> pairE = e(jSONObject);
                        adFormatTypeValueOf = (BrandSafetyEvent.AdFormatType) pairE.first;
                        adTypeM = (BrandSafetyUtils.AdType) pairE.second;
                    } else {
                        adFormatTypeValueOf = BrandSafetyEvent.AdFormatType.valueOf(creativeInfo.K());
                        adTypeM = creativeInfo.M();
                    }
                    Object[] objArr4 = new Object[4];
                    objArr4[0] = "generate CI - adFormat= ";
                    objArr4[i2] = adFormatTypeValueOf;
                    objArr4[2] = " BrandSafety adType= ";
                    objArr4[3] = adTypeM;
                    Logger.d(f62291m, objArr4);
                    String string = jSONObject2.getString("id");
                    String strA2 = a(jSONObject2, mapG, mapF);
                    String strF = f(jSONObject2.getString("video_url"));
                    String string2 = jSONObject2.getString(com.safedk.android.analytics.brandsafety.c.f61803h);
                    MintegralCreativeInfo mintegralCreativeInfo = new MintegralCreativeInfo(strA, adTypeM, string, strA2, strF, string2, adFormatTypeValueOf, k.d(jSONObject.getString(f62296r), f62297s), str, a(jSONObject, jSONArray, adTypeM), false, jSONObject2.getString(f62298t));
                    Logger.d(f62291m, "generate CI - creativeInfo created= ", mintegralCreativeInfo);
                    mintegralCreativeInfo.a(aVarB.f62305a);
                    Logger.d(f62291m, "generate CI - setting creativeInfo k field= ", aVarB.f62305a);
                    if (adTypeM == BrandSafetyUtils.AdType.NATIVE && aVar != null) {
                        Logger.d(f62291m, "generate CI - creativeInfo is native, updating its elements");
                        a(mintegralCreativeInfo, jSONObject2, aVar.f62187b == BrandSafetyEvent.AdFormatType.NATIVE);
                    }
                    if (creativeInfo != null) {
                        Logger.d(f62291m, "generate CI - Mintegral dsp, updating sdk to: ", creativeInfo.S());
                        mintegralCreativeInfo.s(creativeInfo.S());
                        mintegralCreativeInfo.n(h.f63175o);
                    }
                    a(mintegralCreativeInfo, jSONObject2, string2);
                    arrayList.add(mintegralCreativeInfo);
                    a(mintegralCreativeInfo, adTypeM, jSONObject, jSONArray);
                    a(mintegralCreativeInfo, jSONObject, i5);
                    d(mintegralCreativeInfo, jSONObject2);
                    e(mintegralCreativeInfo, jSONObject2);
                    if (jSONObject2.has(f62304z) && jSONObject2.getInt(f62304z) == 0) {
                        mintegralCreativeInfo.e(mintegralCreativeInfo.h() + "/adv_id_0");
                        Logger.d(f62291m, "downstream struct added programmatic indicator");
                    }
                }
                i5++;
                i2 = 1;
                i3 = 2;
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "generate CI - could not extract ads array, exception= ", e2);
        }
        return arrayList;
    }

    private static void d(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            if (jSONObject.has(f62301w)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(f62301w);
                if (jSONObject2.has("impression")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("impression");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        creativeInfo.x(jSONArray.getString(i2));
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "add impression tracking URLs - could not extract impression urls, exception= ", e2);
        }
    }

    private static void e(CreativeInfo creativeInfo, JSONObject jSONObject) {
        try {
            String str = "";
            if (jSONObject.has(f62252A)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(f62252A);
                if (jSONObject2.has(f62253B)) {
                    str = "|par_dspid=" + jSONObject2.getInt(f62253B);
                }
                if (jSONObject2.has(f62254C)) {
                    str = str + "|slot_id=" + jSONObject2.getInt(f62254C);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                creativeInfo.u(str);
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "parsing exception= ", e2.getMessage());
        }
    }

    private static CreativeInfo b(CreativeInfo creativeInfo) {
        CreativeInfo creativeInfoJ;
        n nVarR = SafeDK.getInstance().z().r(creativeInfo.S());
        if (nVarR != null && (creativeInfoJ = nVarR.j()) != null && creativeInfo != creativeInfoJ && creativeInfo.N().equals(creativeInfoJ.N())) {
            Logger.d(f62291m, "get current displaying Ci - found currently displayed instance= ", creativeInfo.ac());
            return creativeInfoJ;
        }
        return creativeInfo;
    }

    public static boolean a(JSONObject jSONObject) {
        boolean z2 = d(jSONObject) == 295;
        Logger.d(f62291m, "is complementary prefetch - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    public static ArrayList<b> b(JSONObject jSONObject) {
        ArrayList<b> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("ads");
            Logger.d(f62291m, "generate recommendations - number of recommendations= ", Integer.valueOf(jSONArray.length()));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                bVar.f62314a = jSONObject2.getString(f62298t);
                bVar.f62315b.addAll(com.safedk.android.utils.n.f(jSONObject2.toString().replace("\\/", "/")));
                Logger.d(f62291m, "generate recommendations - generating recommendation num ", Integer.valueOf(i2), jhotmBbwMbr.QHiYLPVgPzRaBBh, bVar.f62314a, ", resources= ", bVar.f62315b);
                arrayList.add(bVar);
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "generate recommendations - exception while generating recommendations. exception= ", e2);
        }
        return arrayList;
    }

    public static boolean c(JSONObject jSONObject) {
        boolean z2;
        if (jSONObject != null) {
            try {
                z2 = jSONObject.getJSONArray("ads").length() > 2;
            } catch (JSONException e2) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        Logger.d(f62291m, "is recommendations prefetch - returning= ", Boolean.valueOf(z2));
        return z2;
    }

    private static List<CreativeInfo> a(String str, String str2) {
        List<CreativeInfo> listA;
        for (com.safedk.android.analytics.brandsafety.b bVar : SafeDK.getInstance().y()) {
            if (bVar != null && (listA = bVar.a(str, str2)) != null && !listA.isEmpty()) {
                return listA;
            }
        }
        return new ArrayList();
    }

    private static void a(MintegralCreativeInfo mintegralCreativeInfo, JSONObject jSONObject, int i2) {
        ArrayList<b> arrayListB;
        if (e(jSONObject.optString(f62259H, null)) && (arrayListB = b(jSONObject)) != null && arrayListB.size() == 2) {
            b bVar = arrayListB.get(1 - i2);
            mintegralCreativeInfo.b(bVar.f62314a, bVar.f62315b);
            Logger.d(f62291m, "add choose ad recommendations - updating creative info recommendations: ", bVar);
        }
    }

    private static void a(CreativeInfo creativeInfo, BrandSafetyUtils.AdType adType, JSONObject jSONObject, JSONArray jSONArray) {
        if (adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1) {
            String strOptString = jSONObject.optString(f62259H);
            if (!TextUtils.isEmpty(strOptString)) {
                Logger.d(f62291m, "set mof template url - adding mofTemplateYrl to debug info= ", strOptString);
                creativeInfo.u("mofTemplateUrl:" + strOptString);
            }
        }
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, String str) {
        Logger.d(f62291m, "extract and classify urls - started");
        ArrayList<String> arrayListF = com.safedk.android.utils.n.f(jSONObject.toString().replace("\\/", "/"));
        arrayListF.remove(d.H(str));
        Logger.d(f62291m, "extract and classify urls - prefetchResourcesList= ", arrayListF);
        creativeInfo.b((List<String>) arrayListF);
    }

    private static String a(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        Logger.d(f62291m, "get click url - started");
        String strA = null;
        try {
            String string = jSONObject.getString("click_url");
            Logger.d(f62291m, "get click url - click url from ad object= ", string);
            if (string.isEmpty() && jSONObject.has(f62300v)) {
                String strE = d.E(jSONObject.getString(f62300v));
                if (strE != null) {
                    string = strE;
                }
                Logger.d(f62291m, "get click url - click url from dsp ad= ", string);
            }
            if (string.contains(f62255D) && string.contains(f62256E)) {
                strA = a(map2, a(map, string));
                Logger.d(f62291m, "get click url - click url after replacing place holders= ", strA);
                return strA;
            }
            return string;
        } catch (JSONException e2) {
            Logger.d(f62291m, "get click url - exception while extracting click url. exception= ", e2);
            return strA;
        }
    }

    private static String a(JSONObject jSONObject, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        Logger.d(f62291m, "generate downstream struct - started");
        String strOptString = jSONObject.optString(f62259H, null);
        String str = "";
        if (e(strOptString)) {
            String str2 = "" + f62262K;
            Logger.d(f62291m, "generate downstream struct - downstream struct added: ", f62262K);
            str = str2;
        }
        if (a(strOptString, jSONArray, adType)) {
            str = str + CreativeInfo.aJ;
            Logger.d(f62291m, "generate downstream struct - downstream struct added: ", CreativeInfo.aJ);
        }
        Logger.d(f62291m, "generate downstream struct - final downstream struct: ", str);
        return str;
    }

    private static boolean e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f62260I) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, JSONArray jSONArray, BrandSafetyUtils.AdType adType) {
        if (adType != null && adType.equals(BrandSafetyUtils.AdType.INTERSTITIAL) && jSONArray.length() > 1 && !TextUtils.isEmpty(str)) {
            for (String str2 : f62261J) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Pair<BrandSafetyEvent.AdFormatType, BrandSafetyUtils.AdType> e(JSONObject jSONObject) {
        BrandSafetyUtils.AdType adType;
        Logger.d(f62291m, "generate brandSafety ad type and format - started");
        int iD = d(jSONObject);
        BrandSafetyEvent.AdFormatType adFormatType = null;
        if (iD != 287) {
            adType = null;
        } else {
            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (iD == 94) {
            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        }
        if (iD == 296) {
            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
            adType = BrandSafetyUtils.AdType.BANNER;
        }
        if (iD == 42) {
            adFormatType = BrandSafetyEvent.AdFormatType.NATIVE;
            adType = BrandSafetyUtils.AdType.NATIVE;
        }
        return new Pair<>(adFormatType, adType);
    }

    private static String f(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            stringBuffer.append(am.get(str.substring(i2, i3)));
            i2 = i3;
        }
        return new String(Base64.decode(stringBuffer.toString(), 0));
    }

    public static String a(a aVar) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(aVar.f62305a)) {
            i2 = 0;
        } else {
            sb.append(aVar.f62305a);
            i2 = 1;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62307c)) {
            sb.append(aVar.f62307c);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62306b)) {
            sb.append(aVar.f62306b);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62308d)) {
            sb.append(aVar.f62308d);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62309e)) {
            sb.append(aVar.f62309e);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62310f)) {
            sb.append(aVar.f62310f);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62311g)) {
            sb.append(aVar.f62311g);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62312h)) {
            sb.append(aVar.f62312h);
            i2++;
        }
        sb.append(com.safedk.android.analytics.brandsafety.l.ad);
        if (!TextUtils.isEmpty(aVar.f62313i)) {
            sb.append(aVar.f62313i);
            i2++;
        }
        if (i2 < 2) {
            Logger.d(f62291m, "generate ad id AKS - not enough params to generate a valid ID: ", sb);
            return null;
        }
        Logger.d(f62291m, "generate ad id AKS - generated ad id = ", sb);
        return sb.toString();
    }

    private static a b(JSONObject jSONObject, Map<String, String> map, Map<String, String> map2) {
        String strA;
        a aVar = null;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f62268Q);
            if (!jSONObject.has(f62303y)) {
                strA = null;
            } else {
                strA = jSONObject.getString(f62303y);
            }
            Logger.d(f62291m, "generate AKS from ad prefetch - impression url template: ", strA);
            if (jSONObjectOptJSONObject != null) {
                a aVar2 = new a();
                try {
                    aVar2.f62305a = jSONObjectOptJSONObject.optString(f62269R);
                    aVar2.f62307c = jSONObjectOptJSONObject.optString(f62270S);
                    aVar2.f62306b = jSONObjectOptJSONObject.optString(f62271T);
                    aVar2.f62308d = jSONObjectOptJSONObject.optString(f62272U);
                    aVar2.f62309e = jSONObjectOptJSONObject.optString(f62273V);
                    aVar2.f62310f = jSONObjectOptJSONObject.optString(f62274W);
                    aVar2.f62311g = jSONObjectOptJSONObject.optString(f62275X);
                    aVar2.f62312h = jSONObjectOptJSONObject.optString(f62276Y);
                    aVar2.f62313i = jSONObjectOptJSONObject.optString(f62277Z);
                    aVar = aVar2;
                } catch (JSONException e2) {
                    e = e2;
                    aVar = aVar2;
                }
            }
            if (aVar == null || a(aVar) == null) {
                if (strA.contains(f62255D) && strA.contains(f62256E)) {
                    strA = a(map2, a(map, strA));
                }
                return d(strA);
            }
            return aVar;
        } catch (JSONException e3) {
            e = e3;
        }
        Logger.d(f62291m, "generate AKS from ad prefetch - exception while generating AKS from ad data. exception= ", e);
        return aVar;
    }

    private static Map<String, String> f(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                if (jSONObject.has(f62269R)) {
                    map.put(f62269R, jSONObject.getString(f62269R));
                }
                if (jSONObject.has(f62270S)) {
                    map.put(f62270S, jSONObject.getString(f62270S));
                }
                if (jSONObject.has(f62271T)) {
                    map.put(f62271T, jSONObject.getString(f62271T));
                }
                if (jSONObject.has(f62272U)) {
                    map.put(f62272U, jSONObject.getString(f62272U));
                }
                if (jSONObject.has(f62273V)) {
                    map.put(f62273V, jSONObject.getString(f62273V));
                }
                if (jSONObject.has(f62274W)) {
                    map.put(f62274W, jSONObject.getString(f62274W));
                }
                if (jSONObject.has(f62275X)) {
                    map.put(f62275X, jSONObject.getString(f62275X));
                }
                if (jSONObject.has(f62276Y)) {
                    map.put(f62276Y, jSONObject.getString(f62276Y));
                }
                if (jSONObject.has(f62277Z)) {
                    map.put(f62277Z, jSONObject.getString(f62277Z));
                }
            } catch (JSONException e2) {
                Logger.d(f62291m, "generate ad level place holders map - exception while generating adLevelPlaceHoldersMap. exception= ", e2);
            }
        }
        return map;
    }

    private static Map<String, String> g(JSONObject jSONObject) {
        String str = KfLR.hXrJEgOkos;
        Map<String, String> map = new HashMap<>();
        try {
            if (jSONObject.has(f62264M)) {
                map = com.safedk.android.utils.d.a(jSONObject.getJSONObject(f62264M));
                if (jSONObject.has(str)) {
                    map.put(str, jSONObject.getString(str));
                }
                if (jSONObject.has(f62266O)) {
                    map.put(f62266O, jSONObject.getString(f62266O));
                }
                if (jSONObject.has(f62267P)) {
                    map.put(f62267P, jSONObject.getString(f62267P));
                }
            }
        } catch (JSONException e2) {
            Logger.d(f62291m, "generate prefetch level place holders map - exception while generating prefetchLevelPlaceHoldersMap. exception= ", e2);
        }
        return map;
    }

    public static a d(String str) {
        try {
            a aVar = new a();
            Map<String, String> mapA = k.a(str, false);
            aVar.f62305a = mapA.get(f62269R);
            aVar.f62307c = mapA.get(f62270S);
            aVar.f62306b = mapA.get(f62271T);
            aVar.f62308d = mapA.get(f62272U);
            aVar.f62309e = mapA.get(f62273V);
            aVar.f62310f = mapA.get(f62274W);
            aVar.f62311g = mapA.get(f62275X);
            aVar.f62312h = mapA.get(f62276Y);
            aVar.f62313i = mapA.get(f62277Z);
            Logger.d(f62291m, "generate AKS from impression url - generated AKS data= ", aVar);
            return aVar;
        } catch (Throwable th) {
            Logger.d(f62291m, "generate AKS from impression url - exception while generating AKS from url ", str, ",  exception= ", th.getMessage());
            return null;
        }
    }

    public static int d(JSONObject jSONObject) {
        return jSONObject.optInt(f62257F, -1);
    }

    private static String a(Map<String, String> map, String str) {
        for (String str2 : map.keySet()) {
            str = str.replace(f62255D + str2 + f62256E, map.get(str2));
        }
        return str;
    }

    private static void a(CreativeInfo creativeInfo, JSONObject jSONObject, boolean z2) {
        String strOptString = jSONObject.optString(com.safedk.android.analytics.brandsafety.c.f61803h);
        if (z2) {
            creativeInfo.r().remove(strOptString);
            creativeInfo.A(CreativeInfo.aN + strOptString);
        } else {
            creativeInfo.y(strOptString);
        }
        Logger.d(f62291m, "update native prefetch elements - adding main image element= ", strOptString);
        String strOptString2 = jSONObject.optString(ai);
        if (z2) {
            creativeInfo.A(CreativeInfo.aM + strOptString2);
        } else {
            creativeInfo.z(strOptString2);
        }
        Logger.d(f62291m, "update native prefetch elements - adding title element= ", strOptString2);
        String strOptString3 = jSONObject.optString(aj);
        if (z2) {
            creativeInfo.A(CreativeInfo.f62432aO + strOptString3);
        } else {
            creativeInfo.y(strOptString3);
        }
        Logger.d(f62291m, "update native prefetch elements - adding icon url element= ", strOptString3);
        String strOptString4 = jSONObject.optString(f62279ak);
        if (z2) {
            creativeInfo.A(CreativeInfo.f62433aP + strOptString4);
        } else {
            creativeInfo.z(strOptString4);
        }
        Logger.d(f62291m, "update native prefetch elements - adding body element= ", strOptString4);
        String strOptString5 = jSONObject.optString(al);
        if (z2) {
            creativeInfo.A(CreativeInfo.aQ + strOptString5);
        } else {
            creativeInfo.z(strOptString5);
        }
        Logger.d(f62291m, "update native prefetch elements - adding cta element= ", strOptString5);
        if (!z2) {
            creativeInfo.f("/native");
        }
    }
}
