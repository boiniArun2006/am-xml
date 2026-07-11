package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.safedk.android.analytics.brandsafety.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class b extends AbstractRunnableC1782i5 implements a.InterfaceC0711a, AppLovinAdLoadListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final List f50335A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final List f50336B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f50337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f50338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f50339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f50340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f50341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f50342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Double f50343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f50344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f50345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f50346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o7 f50347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f50348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f50349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f50350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Uri f50351u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f50352v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f50353w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f50354x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f50355y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f50356z;

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f50350t = Uri.parse(string);
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processed click destination URL: " + this.f50350t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f50351u = Uri.parse(string2);
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processed click destination backup URL: " + this.f50351u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f50337g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f48733a.a(x4.f50778O2)).booleanValue()) {
                try {
                    this.f50352v.addAll(JsonUtils.toList(jSONArray));
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed click tracking URLs: " + this.f50352v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i2, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f50354x.add(new e.a(this.f48733a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processed click tracking requests: " + this.f50354x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f50339i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f48733a.D().a(this.f48734b, "prepareNativeComponents", th);
        }
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1802k c1802k) {
        super("TaskRenderNativeAd", c1802k);
        this.f50340j = "";
        this.f50341k = "";
        this.f50342l = "";
        this.f50343m = null;
        this.f50344n = "";
        this.f50345o = null;
        this.f50346p = null;
        this.f50348r = null;
        this.f50349s = null;
        this.f50350t = null;
        this.f50351u = null;
        this.f50352v = new ArrayList();
        this.f50353w = new ArrayList();
        this.f50354x = new ArrayList();
        this.f50355y = new ArrayList();
        this.f50356z = new ArrayList();
        this.f50335A = new ArrayList();
        this.f50336B = new ArrayList();
        this.f50337g = jSONObject;
        this.f50338h = jSONObject2;
        this.f50339i = appLovinNativeAdLoadListener;
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.Xo
            @Override // java.lang.Runnable
            public final void run() {
                this.f50329n.b(appLovinNativeAdImpl);
            }
        });
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f50337g), JsonUtils.shallowCopy(this.f50338h), this.f48733a).setTitle(this.f50340j).setAdvertiser(this.f50341k).setBody(this.f50342l).setCallToAction(this.f50344n).setStarRating(this.f50343m).setIconUri(this.f50345o).setMainImageUri(this.f50346p).setPrivacyIconUri(this.f50348r).setVastAd(this.f50347q).setPrivacyDestinationUri(this.f50349s).setClickDestinationUri(this.f50350t).setClickDestinationBackupUri(this.f50351u).setClickTrackingUrls(this.f50352v).setJsTrackers(this.f50353w).setClickTrackingRequests(this.f50354x).setImpressionRequests(this.f50355y).setViewableMRC50Requests(this.f50356z).setViewableMRC100Requests(this.f50335A).setViewableVideo50Requests(this.f50336B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f48733a.q0().a((AbstractRunnableC1782i5) new a(appLovinNativeAdImplBuild, this.f48733a, this), d6.b.CORE);
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f50337g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f48733a.a(x4.N2)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r3 = 0;
        String string = JsonUtils.getString(this.f50337g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f50348r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f50337g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f50349s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f50337g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "No oRtb response provided: " + this.f50337g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, NodeModuleProcess.PROPERTY_VERSION, null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unable to retrieve assets - failing ad load: " + this.f50337g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) r3);
            if (jSONObject4.has("title")) {
                this.f50340j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r3), "text", r3);
                if (C1804o.a()) {
                    this.f48735c.a(this.f48734b, "Processed title: " + this.f50340j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r3));
            } else if (jSONObject4.has(l.f62665t)) {
                int i3 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, l.f62665t, (JSONObject) r3);
                int i5 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r3);
                if (i5 == 1 || 3 == i3) {
                    this.f50345o = Uri.parse(string4);
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed icon URL: " + this.f50345o);
                    }
                } else if (i5 == 3 || 2 == i3) {
                    this.f50346p = Uri.parse(string4);
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed main image URL: " + this.f50346p);
                    }
                } else {
                    if (C1804o.a()) {
                        this.f48735c.k(this.f48734b, "Unrecognized image: " + jSONObject4);
                    }
                    int i7 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i8 = JsonUtils.getInt(jSONObject5, CmcdData.STREAMING_FORMAT_HLS, -1);
                    if (i7 <= 0 || i8 <= 0) {
                        if (C1804o.a()) {
                            this.f48735c.k(this.f48734b, "Skipping...");
                        }
                    } else if (i7 / i8 > 1.0d) {
                        if (C1804o.a()) {
                            this.f48735c.a(this.f48734b, "Inferring main image from " + i7 + "x" + i8 + "...");
                        }
                        this.f50346p = Uri.parse(string4);
                    } else {
                        if (C1804o.a()) {
                            this.f48735c.a(this.f48734b, "Inferring icon image from " + i7 + "x" + i8 + "...");
                        }
                        this.f50345o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed VAST video");
                    }
                } else if (C1804o.a()) {
                    this.f48735c.k(this.f48734b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i9 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i10 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i10 == 1 || i9 == 8) {
                    this.f50341k = string6;
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed advertiser: " + this.f50341k);
                    }
                } else if (i10 == 2 || i9 == 4) {
                    this.f50342l = string6;
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed body: " + this.f50342l);
                    }
                } else if (i10 == 12 || i9 == 5) {
                    this.f50344n = string6;
                    if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Processed cta: " + this.f50344n);
                    }
                } else if (i10 == 3 || i9 == 6) {
                    double dA = n7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f50343m = Double.valueOf(dA);
                        if (C1804o.a()) {
                            this.f48735c.a(this.f48734b, "Processed star rating: " + this.f50343m);
                        }
                    } else if (C1804o.a()) {
                        this.f48735c.a(this.f48734b, "Received invalid star rating: " + string6);
                    }
                } else if (C1804o.a()) {
                    this.f48735c.k(this.f48734b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (C1804o.a()) {
                this.f48735c.b(this.f48734b, "Unsupported asset object: " + jSONObject4);
            }
            i2++;
            r3 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f50353w.add(string7);
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i11 = 0;
            while (i11 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i11, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f50355y.add(new e.a(this.f48733a).b(str2).b(false).a(false).h(f()).a());
                        if (C1804o.a()) {
                            this.f48735c.a(this.f48734b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i11++;
                obj = null;
            }
        }
        ?? r6 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i12 = 0;
            while (i12 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i12, (JSONObject) r6);
                int i13 = JsonUtils.getInt(jSONObject7, com.safedk.android.analytics.events.a.f62811a, -1);
                int i14 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r6);
                if (!TextUtils.isEmpty(string8)) {
                    if (i14 == 1 || i14 == 2) {
                        if (i14 == 2 && string8.startsWith("<script")) {
                            this.f50353w.add(string8);
                        } else {
                            e eVarA = new e.a(this.f48733a).b(string8).b(false).a(false).h(f() || i14 == 2).a();
                            if (i13 == 1) {
                                this.f50355y.add(eVarA);
                                if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Processed impression URL: " + string8);
                                }
                            } else if (i13 == 2) {
                                this.f50356z.add(eVarA);
                                if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i13 == 3) {
                                this.f50335A.add(eVarA);
                                if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i13 == 4) {
                                this.f50336B.add(eVarA);
                                if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i13 == 555) {
                                if (C1804o.a()) {
                                    this.f48735c.a(this.f48734b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (C1804o.a()) {
                                this.f48735c.b(this.f48734b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (C1804o.a()) {
                        this.f48735c.b(this.f48734b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i12++;
                r6 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Processing VAST video...");
        }
        this.f48733a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.f50337g), JsonUtils.shallowCopy(this.f50338h), this, this.f48733a));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "VAST ad rendered successfully");
        }
        this.f50347q = (o7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i2) {
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "VAST ad failed to render");
        }
        e();
    }

    private void b(String str) {
        this.f50339i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0711a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
