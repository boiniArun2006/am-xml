package com.safedk.android.analytics.brandsafety.creatives.infos;

import WJ.phkN.HFAkacKHsU;
import YgZ.uQga.IYJfqUyym;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.b;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistableBase;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.d;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import com.vungle.ads.internal.Constants;
import java.net.URLEncoder;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class CreativeInfo extends PersistableBase {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f62422A = "details?id=";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f62423B = "isVideoAd";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f62424C = "isPlayable";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f62425D = "campaign_id";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f62426L = "buyer_id";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f62427O = "exact_webview_prefetch";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f62428S = "ad_system";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62429a = "CreativeInfo";

    /* JADX INFO: renamed from: aF, reason: collision with root package name */
    public static final String f62430aF = "text_ad_gradient";
    public static final String aG = "native";
    public static final String aH = "native_banner";
    public static final String aI = "/ad_count_";
    public static final String aJ = "/multiple_ads";
    public static final String aK = "/multi_ad";

    /* JADX INFO: renamed from: aL, reason: collision with root package name */
    public static final String f62431aL = "matchingMethodAddress";
    public static final String aM = "title:";
    public static final String aN = "mainImg:";

    /* JADX INFO: renamed from: aO, reason: collision with root package name */
    public static final String f62432aO = "icon:";

    /* JADX INFO: renamed from: aP, reason: collision with root package name */
    public static final String f62433aP = "body:";
    public static final String aQ = "cta:";
    public static final String aR = "star:";
    public static final String aS = "advertiser:";

    /* JADX INFO: renamed from: aT, reason: collision with root package name */
    public static final String f62434aT = "element:";
    public static final String aU = "comment:";
    public static final String aV = "ad_domain";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public static final String f62435ak = "end_card_url";
    public static final String al = "html";
    public static final String am = "vast_ad_tag_uris";
    public static final String an = "text_ad";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public static final String f62436ao = "event_id";
    public static final String ap = "text:";
    public static final String aq = "video:";

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    public static final String f62437aw = "image_ad";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62438b = "prefetchTimestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62439c = "ad_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62440d = "creative_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62441e = "video_url";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62442f = "log";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62443g = "ci_debug_info";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62444h = "exact_";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62445i = "exact_fbLabel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62446j = "exact_markup";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62447k = "exact_video";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62448l = "exact_resource";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62449m = "exact_ad_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62450n = "exact_ad_object";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f62451o = "heuristic_mediation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f62452p = "heuristic_pending";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f62453q = "downstream_struct";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f62454r = "vast";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f62455s = "survey";
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f62456t = "text";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f62457u = "playable";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f62458v = "image";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f62459w = "mraid";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f62460x = "dsp_creative_id";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f62461y = "exact_event_id";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f62462z = "prefetch_resource_urls";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private BrandSafetyUtils.AdType f62463E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected String f62464F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected boolean f62465G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected boolean f62466H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected boolean f62467I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected String f62468J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected String f62469K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    protected String f62470M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected final HashSet<String> f62471N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected final HashSet<String> f62472P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f62473Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Timestamp f62474R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    boolean f62475T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    boolean f62476U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    boolean f62477V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f62478W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected String f62479X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f62480Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f62481Z;
    private String aA;

    /* JADX INFO: renamed from: aB, reason: collision with root package name */
    private String f62482aB;

    /* JADX INFO: renamed from: aC, reason: collision with root package name */
    private boolean f62483aC;

    /* JADX INFO: renamed from: aD, reason: collision with root package name */
    private String f62484aD;
    private String aE;
    protected String aW;
    protected String aX;
    protected String aY;
    protected String aZ;
    private String aa;
    private long ab;
    private String ac;
    private String ad;
    private int ae;
    private final List<String> af;
    private boolean ag;
    private String ah;
    private String ai;
    private List<String> aj;
    protected String ar;

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    protected String f62485as;
    protected String at;
    protected final HashSet<String> au;
    boolean av;
    public final Set<String> ax;
    public boolean ay;
    private transient View az;
    protected final HashSet<String> ba;
    boolean bb;
    boolean bc;
    boolean bd;
    boolean be;
    protected boolean bf;
    protected final l bg;
    public final List<String> bh;
    private boolean bi;
    private String bj;
    private boolean bk;
    private boolean bl;

    public CreativeInfo() {
        this.af = new ArrayList();
        this.az = null;
        this.f62481Z = false;
        this.aW = null;
        this.f62465G = false;
        this.f62466H = false;
        this.ab = 0L;
        this.f62483aC = false;
        this.ag = false;
        this.bi = true;
        this.ah = null;
        this.bj = null;
        this.f62471N = new HashSet<>();
        this.f62472P = new HashSet<>();
        this.ba = new HashSet<>();
        this.au = new LinkedHashSet();
        this.f62475T = false;
        this.f62476U = false;
        this.bb = false;
        this.bc = false;
        this.bd = false;
        this.av = false;
        this.f62477V = false;
        this.f62478W = false;
        this.be = false;
        this.bf = false;
        this.bg = new l();
        this.bh = new ArrayList();
        this.ax = new HashSet();
        this.ay = false;
        this.bl = false;
    }

    public CreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String clickUrl, String videoUrl, String downstreamStruct, String sdkVersion) {
        this.af = new ArrayList();
        this.az = null;
        this.f62481Z = false;
        this.aW = null;
        this.f62465G = false;
        this.f62466H = false;
        this.ab = 0L;
        this.f62483aC = false;
        this.ag = false;
        this.bi = true;
        this.ah = null;
        this.bj = null;
        this.f62471N = new HashSet<>();
        this.f62472P = new HashSet<>();
        this.ba = new HashSet<>();
        this.au = new LinkedHashSet();
        this.f62475T = false;
        this.f62476U = false;
        this.bb = false;
        this.bc = false;
        this.bd = false;
        this.av = false;
        this.f62477V = false;
        this.f62478W = false;
        this.be = false;
        this.bf = false;
        this.bg = new l();
        this.bh = new ArrayList();
        this.ax = new HashSet();
        this.ay = false;
        this.bl = false;
        this.aa = sdk;
        this.f62463E = adType;
        this.aa = sdk;
        this.f62480Y = id;
        k(creativeId);
        a(clickUrl, true);
        p(videoUrl);
        this.ag = true;
        this.ab = n.b(SystemClock.elapsedRealtime());
        this.f62464F = downstreamStruct;
        this.f62475T = !TextUtils.isEmpty(videoUrl);
        this.bg.a(l.f62646a, new l.a[0]);
        ah();
        if (sdkVersion != null) {
            this.f62473Q = sdkVersion;
            return;
        }
        String sdkVersionByPackage = SdksMapping.getSdkVersionByPackage(sdk);
        this.f62473Q = sdkVersionByPackage;
        Logger.d(f62429a, "package version updated, package : ", sdk, ", sdkVersion : ", sdkVersionByPackage);
    }

    public boolean c(String str) {
        return this.ax.contains(str);
    }

    public boolean d(String str) {
        boolean zContains;
        synchronized (this.af) {
            zContains = this.af.contains(str);
        }
        return zContains;
    }

    public boolean c() {
        return this.ay;
    }

    public void d() {
        this.ay = true;
    }

    public List<String> e() {
        return this.bh;
    }

    public View f() {
        return this.az;
    }

    public void a(View view) {
        this.az = view;
    }

    public boolean g() {
        return this.f62481Z;
    }

    public String h() {
        return this.f62464F;
    }

    public void e(String str) {
        this.f62464F = str;
    }

    public void f(String str) {
        a(str, "");
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (TextUtils.isEmpty(this.f62464F)) {
            this.f62464F = str;
            return;
        }
        this.f62464F += str2 + str;
    }

    public String j() {
        Logger.d(f62429a, "getAdUnitId started with the stored value: ", this.aW);
        return this.aW;
    }

    public void g(String str) {
        Logger.d(f62429a, "setAdUnitId started with ad unit id: ", str);
        this.aW = str;
    }

    public boolean k() {
        return this.f62467I;
    }

    public String l() {
        return this.f62485as;
    }

    public void a(boolean z2) {
        this.f62483aC = z2;
    }

    public boolean m() {
        return this.f62483aC;
    }

    public String n() {
        return this.f62484aD;
    }

    public void h(String str) {
        this.f62484aD = str;
    }

    public void i(String str) {
        this.aZ = str;
    }

    public String o() {
        return this.aZ;
    }

    public void j(String str) {
        this.f62469K = str;
    }

    public String p() {
        return this.f62470M;
    }

    public HashSet<String> q() {
        return this.f62471N;
    }

    public HashSet<String> r() {
        return this.f62472P;
    }

    public HashSet<String> s() {
        return this.ba;
    }

    public String t() {
        return this.f62473Q;
    }

    public HashSet<String> u() {
        return this.au;
    }

    public void b(boolean z2) {
        this.f62477V = z2;
    }

    public void c(boolean z2) {
        this.av = z2;
    }

    public boolean v() {
        return this.f62475T || this.f62477V;
    }

    public void d(boolean z2) {
        this.bc = z2;
    }

    public boolean w() {
        return this.bc;
    }

    public void e(boolean z2) {
        this.bd = z2;
    }

    public boolean x() {
        return this.bd;
    }

    public boolean y() {
        return this.f62478W;
    }

    public void f(boolean z2) {
        Logger.d(f62429a, "VideoAd property has been set to ", Boolean.valueOf(z2));
        this.f62475T = z2;
    }

    public boolean z() {
        return this.f62476U;
    }

    public void g(boolean z2) {
        this.f62476U = z2;
    }

    public boolean A() {
        return this.f62477V;
    }

    public boolean B() {
        return this.av;
    }

    public String C() {
        return this.f62479X;
    }

    public boolean D() {
        return this.bf;
    }

    public void h(boolean z2) {
        this.bf = z2;
    }

    public void E() {
        this.bk = true;
    }

    public boolean F() {
        return this.bk;
    }

    public l G() {
        return this.bg;
    }

    public void k(String str) {
        this.ac = str;
    }

    public void l(String str) {
        Logger.d(f62429a, "set Dsp Creative Id - set to value: ", str);
        this.f62482aB = str;
    }

    public void m(String str) {
        this.ar = str;
    }

    public void n(String str) {
        this.aA = str;
    }

    public void o(String str) {
        this.f62485as = str;
    }

    public String H() {
        return this.f62469K;
    }

    public String I() {
        StringBuilder sb = new StringBuilder();
        if (this.f62465G) {
            sb.append(this.f62480Y);
        }
        sb.append(this.ac);
        sb.append(this.f62468J);
        return sb.toString();
    }

    public String J() {
        return this.f62468J;
    }

    public void p(String str) {
        String strD = D(str);
        this.f62468J = strD;
        Logger.d(f62429a, "setting video url to: ", strD);
        y(this.f62468J);
    }

    public String K() {
        return this.aE;
    }

    public void a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType == null) {
            Logger.d(f62429a, "adFormat is null , existing");
        } else if (adFormatType == BrandSafetyEvent.AdFormatType.LEADER) {
            this.aE = BrandSafetyEvent.AdFormatType.BANNER.name();
        } else {
            this.aE = adFormatType.name();
        }
    }

    public void q(String str) {
        Logger.d(f62429a, "setPackageName: ", str);
        this.f62470M = str;
    }

    public void a(String str, Set<String> set) {
        a(Arrays.asList(str), set);
    }

    public void a(List<String> list, Set<String> set) {
        Logger.d(f62429a, "add recommendations: ", list, ", resources list: ", set);
        if (list != null) {
            synchronized (this.bh) {
                this.bh.addAll(list);
            }
            Logger.d(f62429a, "add recommendations added : ", list);
        }
        if (set != null) {
            synchronized (this.ax) {
                this.ax.addAll(set);
            }
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                if (!TextUtils.isEmpty(strD)) {
                    synchronized (this.ax) {
                        this.ax.add(strD);
                    }
                }
            }
        }
    }

    public Bundle b() {
        List<String> list;
        Bundle bundle = new Bundle();
        boolean zA = CreativeInfoManager.a(this.aa, AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        if (!TextUtils.isEmpty(this.f62480Y) && zA) {
            bundle.putString(f62439c, this.f62480Y);
        }
        if (this.f62466H) {
            bundle.putLong(f62438b, this.ab);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            bundle.putString("creative_id", this.ac);
        }
        if (!TextUtils.isEmpty(this.f62482aB)) {
            bundle.putString(f62460x, this.f62482aB);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            bundle.putString(f62426L, this.ar);
        }
        if (!TextUtils.isEmpty(this.f62485as)) {
            bundle.putString(f62428S, this.f62485as);
        }
        if (!TextUtils.isEmpty(this.f62468J)) {
            bundle.putString("video_url", this.f62468J);
        }
        if (!TextUtils.isEmpty(this.at)) {
            bundle.putString(f62435ak, this.at);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            bundle.putString(f62443g, this.ai);
        }
        if (!TextUtils.isEmpty(this.f62464F)) {
            bundle.putString(f62453q, this.f62464F);
        }
        if (!TextUtils.isEmpty(this.f62469K)) {
            bundle.putString("zone_id", this.f62469K);
        }
        bundle.putString("ad_format_type", this.aE);
        if (!TextUtils.isEmpty(this.f62470M)) {
            bundle.putString(BrandSafetyEvent.f62736g, this.f62470M);
        }
        bundle.putString("sdk_version", this.f62473Q);
        if (!TextUtils.isEmpty(this.aZ)) {
            bundle.putString(aV, this.aZ);
        }
        HashSet<String> hashSet = this.f62471N;
        if (hashSet != null && !hashSet.isEmpty()) {
            synchronized (this.f62471N) {
                bundle.putStringArrayList(BrandSafetyEvent.f62737h, new ArrayList<>(this.f62471N));
            }
        }
        HashSet<String> hashSet2 = this.f62472P;
        if (hashSet2 != null && !hashSet2.isEmpty()) {
            synchronized (this.f62472P) {
                bundle.putStringArrayList(f62462z, new ArrayList<>(this.f62472P));
            }
        }
        HashSet<String> hashSet3 = this.au;
        if (hashSet3 != null && !hashSet3.isEmpty()) {
            synchronized (this.au) {
                bundle.putStringArrayList(am, new ArrayList<>(this.au));
            }
        }
        if (this.ay && (list = this.bh) != null && !list.isEmpty()) {
            synchronized (this.bh) {
                bundle.putStringArrayList(BrandSafetyEvent.f62750u, new ArrayList<>(this.bh));
            }
        }
        HashSet<FileUploadManager.FileUploadData> hashSetA = FileUploadManager.a().a(this);
        if (hashSetA != null && hashSetA.size() > 0) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<FileUploadManager.FileUploadData> it = hashSetA.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().h());
            }
            bundle.putParcelableArrayList(FileUploadManager.f61571i, arrayList);
        }
        return bundle;
    }

    public boolean a() {
        return this.ac == null;
    }

    public boolean L() {
        return !this.ag;
    }

    public BrandSafetyUtils.AdType M() {
        return this.f62463E;
    }

    public void a(BrandSafetyUtils.AdType adType) {
        if (adType == null) {
            Logger.d(f62429a, "setAdType - ad type is null, not setting");
            return;
        }
        Logger.d(f62429a, "setAdType - set to ad type: ", adType, " for ci with id: ", this.f62480Y);
        this.f62463E = adType;
        ah();
    }

    public String N() {
        return this.f62480Y;
    }

    public void r(String str) {
        this.f62480Y = str;
    }

    public String O() {
        return this.ad;
    }

    public String P() {
        return this.ac;
    }

    public String Q() {
        return this.f62482aB;
    }

    public String R() {
        return this.ar;
    }

    public String S() {
        return this.aa;
    }

    public void s(String str) {
        this.aa = str;
    }

    public String T() {
        return this.aA;
    }

    public int U() {
        return this.ae;
    }

    public void a(int i2) {
        this.ae = i2;
    }

    public void V() {
        Logger.d(f62429a, "resetting click url");
        this.ad = null;
    }

    public void a(String str, boolean z2) {
        Logger.d(f62429a, "setting click url to: ", str);
        this.ad = str;
        this.bl = z2;
    }

    public void i(boolean z2) {
        this.f62467I = z2;
    }

    public void a(String str, String str2, String str3) {
        this.ah = str;
        if (str2 != null) {
            this.bj = str2;
        }
        if (str3 != null) {
            u("mi=" + str3);
        }
    }

    public void t(String str) {
        this.bj = str;
    }

    public void W() {
        this.ah = null;
        this.bj = null;
    }

    public void u(String str) {
        if (str != null) {
            String str2 = this.ai;
            if (str2 == null) {
                this.ai = str;
                return;
            }
            if (!str2.contains(str)) {
                this.ai += l.ac + str;
                return;
            }
            Logger.d(f62429a, "setDebugInfo ci debug info already contains the string. skipping. content : ", str);
        }
    }

    public void X() {
        this.ai = null;
    }

    public String Y() {
        return this.ai;
    }

    public String Z() {
        return this.ah;
    }

    public String aa() {
        return this.bj;
    }

    public boolean a(Map<Integer, CreativeInfo> map) {
        if (this.ae == 0) {
            return false;
        }
        synchronized (map) {
            map.put(Integer.valueOf(this.ae), this);
        }
        return true;
    }

    public boolean b(Map<Integer, CreativeInfo> map) {
        CreativeInfo creativeInfoRemove;
        if (this.ae == 0) {
            return false;
        }
        synchronized (map) {
            creativeInfoRemove = map.remove(Integer.valueOf(this.ae));
        }
        return creativeInfoRemove != null;
    }

    public boolean c(Map<String, CreativeInfo> map) {
        CreativeInfo creativeInfoRemove;
        if (!WebView.class.getCanonicalName().equals(this.aX)) {
            return false;
        }
        synchronized (map) {
            creativeInfoRemove = map.remove(this.aX);
        }
        return creativeInfoRemove != null;
    }

    public void a(List<String> list) {
        this.aj = list;
    }

    public List<String> ab() {
        return this.aj;
    }

    public void b(List<String> list) {
        if (list != null) {
            for (String str : list) {
                if (str != null) {
                    String strD = D(str);
                    String strE = E(str);
                    if (!TextUtils.isEmpty(strD)) {
                        if (b(str) || b(strD) || b(strE) || str.startsWith(f62434aT)) {
                            Logger.d(f62429a, "classifyPrefetchUrl ", this.aa, " url is a prefetch url ", str);
                            y(strD);
                        } else if (v(strD) && !strD.equals(this.ad)) {
                            Logger.d(f62429a, "classifyPrefetchUrl ", this.aa, " url is a dsp url ", str);
                            x(strD);
                        } else {
                            Logger.d(f62429a, "classifyPrefetchUrl ", this.aa, " url is not a prefetch nor a dsp url and will be discarded : ", str);
                        }
                    }
                }
            }
        }
    }

    public void c(List<String> list) {
        if (list != null) {
            Logger.printFullVerboseLog(f62429a, "add prefetch urls : ", list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    protected boolean v(String str) {
        return g.a(this.aa, str);
    }

    protected boolean b(String str) {
        return n.a(str, (Map<String, String>) null);
    }

    public void w(String str) {
        if (v(str)) {
            x(str);
        }
    }

    public void a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                x(it.next());
            }
        }
    }

    public void x(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD) && !this.au.contains(strD)) {
            if (!this.ax.contains(strD)) {
                Logger.d(f62429a, "add dsp domain url - adding the following url: ", strD);
                synchronized (this.f62471N) {
                    this.f62471N.add(strD);
                }
                return;
            }
            Logger.d(f62429a, "add dsp domain url: avoid adding a recommendation resource", strD);
            this.ay = true;
        }
    }

    public void y(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD)) {
            if (this.af != null) {
                synchronized (this.f62472P) {
                    if (!this.af.contains(strD)) {
                        this.f62472P.add(strD);
                    }
                }
                return;
            }
            Logger.d(f62429a, "add prefetch Url: Url is in the WebView urls exclusion list , will not be added : ", strD);
        }
    }

    public void b(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                y(it.next());
            }
        }
    }

    public void z(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.af != null) {
                synchronized (this.f62472P) {
                    if (!this.af.contains(str)) {
                        Logger.d(f62429a, "adding prefetch text: ", str.trim());
                        this.f62472P.add("text:" + str.trim());
                    }
                }
                return;
            }
            Logger.d(f62429a, "add prefetch text: already in the list, will not be added: ", str);
        }
    }

    public void A(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.af != null) {
                synchronized (this.f62472P) {
                    if (!this.af.contains(str)) {
                        this.f62472P.add(f62434aT + str);
                    }
                }
                return;
            }
            Logger.d(f62429a, "add prefetch element: already in the list, will not be added: ", str);
        }
    }

    public void B(String str) {
        if (str != null && !str.isEmpty()) {
            synchronized (this.ba) {
                this.ba.add(str);
            }
        }
    }

    public void C(String str) {
        String strD = D(str);
        if (!TextUtils.isEmpty(strD)) {
            synchronized (this.au) {
                this.au.add(strD);
            }
        }
        synchronized (this.f62471N) {
            this.f62471N.remove(strD);
        }
    }

    public String toString() {
        Bundle bundleB = b();
        bundleB.putBoolean(f62423B, this.f62475T | this.f62477V);
        bundleB.putBoolean(f62424C, this.f62478W);
        return "ci hash=" + hashCode() + ", matchingObjectAddress=" + this.aX + ", event id=" + this.f62484aD + ", id=" + this.f62480Y + ", stopCollectingResources=" + this.f62483aC + ", " + bundleB;
    }

    public String ac() {
        Bundle bundle = new Bundle();
        bundle.putString(f62439c, this.f62480Y);
        String str = this.aX;
        if (str != null) {
            bundle.putString(f62431aL, str);
        }
        String str2 = this.f62484aD;
        if (str2 != null) {
            bundle.putString("event_id", str2);
        }
        return "ci hash=" + hashCode() + ", " + bundle;
    }

    public Timestamp ad() {
        return this.f62474R;
    }

    public static String D(String str) {
        return TextUtils.isEmpty(str) ? str : k.g(n.z(str));
    }

    protected String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, C.UTF8_NAME);
        } catch (Throwable th) {
            Logger.d(f62429a, "Failure in encode url. This url will be sent as is in the next event. ", th.getMessage(), ". Url=", str);
            return str;
        }
    }

    public void ae() {
        this.f62481Z = true;
    }

    public void F(String str) {
        this.f62479X = str;
    }

    public String af() {
        return this.ac;
    }

    public long ag() {
        return this.ab;
    }

    public void ah() {
        b bVarK = CreativeInfoManager.k(this.aa);
        if (bVarK != null) {
            if (M().equals(BrandSafetyUtils.AdType.INTERSTITIAL)) {
                this.f62474R = new Timestamp(System.currentTimeMillis() + bVarK.e(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE));
                Logger.d(f62429a, "set expiration time - sdk: ", this.aa, ", inter max age: ", Long.valueOf(bVarK.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE)));
            } else if (M().equals(BrandSafetyUtils.AdType.BANNER) || M().equals(BrandSafetyUtils.AdType.MREC) || M().equals(BrandSafetyUtils.AdType.NATIVE)) {
                this.f62474R = new Timestamp(System.currentTimeMillis() + bVarK.e(AdNetworkConfiguration.BANNER_CI_MAX_AGE));
                Logger.d(f62429a, "set expiration time - sdk: ", this.aa, ", banner/mrec/native max age: ", Long.valueOf(bVarK.e(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE)));
            }
        }
    }

    public boolean ai() {
        return this.bi;
    }

    public void j(boolean z2) {
        this.bi = z2;
    }

    public String aj() {
        return this.aY;
    }

    public String ak() {
        return this.aX;
    }

    public void a(Object obj) {
        if (obj != null) {
            this.aY = obj.getClass().getCanonicalName();
            this.aX = BrandSafetyUtils.a(obj);
        } else {
            this.aY = null;
            this.aX = null;
        }
        Logger.d(f62429a, "set matching object - type: ", this.aY, ", address: ", this.aX, ", ad id: ", this.f62480Y);
    }

    public void b(String str, String str2) {
        this.aX = str;
        this.aY = str2;
    }

    public void al() {
        long j2 = this.ab;
        this.ab = n.b(SystemClock.elapsedRealtime());
        Logger.d(f62429a, "prefetch timestamp reset. old value = ", Long.valueOf(j2), ", new value = ", Long.valueOf(this.ab));
    }

    public void G(String str) {
        String strD = D(str);
        synchronized (this.af) {
            this.af.add(strD);
        }
    }

    public List<String> am() {
        return this.af;
    }

    public boolean an() {
        return this.be;
    }

    public void ao() {
        this.be = true;
    }

    public void a(CreativeInfo creativeInfo) {
    }

    public void a(String str, l.a... aVarArr) {
        try {
            this.bg.a(str, aVarArr);
        } catch (NullPointerException e2) {
            Logger.d(f62429a, "add impression log event failed: type=", str, ", impressionLog=", this.bg);
        }
    }

    public void a(Long l2, Long l5, String str, l.a... aVarArr) {
        try {
            this.bg.a(l2, l5, str, aVarArr);
        } catch (NullPointerException e2) {
            Logger.d(HFAkacKHsU.OsBfLPvaWxNX, "add impression log event failed: type=", str, ", impressionLog=", this.bg);
        }
    }

    public boolean ap() {
        return this.bl;
    }

    public void H(String str) {
        this.at = str;
    }

    public boolean aq() {
        return this.bb;
    }

    public void a(Boolean bool) {
        this.bb = bool.booleanValue();
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        BrandSafetyUtils.AdType adType = this.f62463E;
        if (adType != null) {
            jSONObject.put("adType", adType.name());
        }
        if (!TextUtils.isEmpty(this.f62480Y)) {
            jSONObject.put("id", this.f62480Y);
        }
        if (!this.af.isEmpty()) {
            synchronized (this.af) {
                jSONObject.put("excludedWebViewResourceUrlsList", d.a(this.af));
            }
        }
        jSONObject.put("mediaFileWithJsAppAttributeExists", this.f62481Z);
        if (!TextUtils.isEmpty(this.f62464F)) {
            jSONObject.put("downstreamStruct", this.f62464F);
        }
        if (!TextUtils.isEmpty(this.aW)) {
            jSONObject.put("adUnitId", this.aW);
        }
        jSONObject.put("shouldReportId", this.f62465G);
        jSONObject.put("shouldReportPrefetchTimestamp", this.f62466H);
        jSONObject.put("isPortraitOrientation", this.f62467I);
        if (!TextUtils.isEmpty(this.aa)) {
            jSONObject.put("sdk", this.aa);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            jSONObject.put("actualSdk", this.aA);
        }
        jSONObject.put(f62438b, this.ab);
        if (!TextUtils.isEmpty(this.ac)) {
            jSONObject.put("creativeId", this.ac);
        }
        if (!TextUtils.isEmpty(this.f62482aB)) {
            jSONObject.put("dspCreativeId", this.f62482aB);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            jSONObject.put("buyerId", this.ar);
        }
        if (!TextUtils.isEmpty(this.f62485as)) {
            jSONObject.put("adSystem", this.f62485as);
        }
        if (!TextUtils.isEmpty(this.ad)) {
            jSONObject.put(Constants.CLICK_URL, this.ad);
        }
        if (!TextUtils.isEmpty(this.f62468J)) {
            jSONObject.put("videoUrl", this.f62468J);
        }
        if (!TextUtils.isEmpty(this.at)) {
            jSONObject.put("endCardUrl", this.at);
        }
        jSONObject.put("stopCollectingResources", this.f62483aC);
        jSONObject.put("contentHashCode", this.ae);
        if (!TextUtils.isEmpty(this.f62484aD)) {
            jSONObject.put("eventId", this.f62484aD);
        }
        jSONObject.put("fill", this.ag);
        jSONObject.put("fresh", this.bi);
        if (!TextUtils.isEmpty(this.ah)) {
            jSONObject.put("matchingMethod", this.ah);
        }
        if (!TextUtils.isEmpty(this.bj)) {
            jSONObject.put("matchingMethodDetails", this.bj);
        }
        if (!TextUtils.isEmpty(this.aX)) {
            jSONObject.put("matchingObjectAddress", this.aX);
        }
        if (!TextUtils.isEmpty(this.aY)) {
            jSONObject.put("matchingObjectType", this.aY);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            jSONObject.put("ciDebugInfo", this.ai);
        }
        if (!TextUtils.isEmpty(this.aE)) {
            jSONObject.put("adFormat", this.aE);
        }
        if (!TextUtils.isEmpty(this.f62469K)) {
            jSONObject.put("placementId", this.f62469K);
        }
        if (!TextUtils.isEmpty(this.f62470M)) {
            jSONObject.put("packageName", this.f62470M);
        }
        if (!TextUtils.isEmpty(this.aZ)) {
            jSONObject.put("adDomain", this.aZ);
        }
        List<String> list = this.aj;
        if (list != null) {
            jSONObject.put("adText", d.a(list));
        }
        jSONObject.put("dspUrlList", d.a(this.f62471N));
        jSONObject.put("prefetchUrlList", d.a(this.f62472P));
        if (!TextUtils.isEmpty(this.f62473Q)) {
            jSONObject.put("sdkVersion", this.f62473Q);
        }
        if (!this.au.isEmpty()) {
            jSONObject.put("vastAdTagUriList", d.a(this.au));
        }
        Timestamp timestamp = this.f62474R;
        jSONObject.put("expirationTimestamp", timestamp != null ? Long.valueOf(timestamp.getTime()) : null);
        jSONObject.put(f62423B, this.f62475T);
        jSONObject.put("isVideoEndCard", this.f62476U);
        jSONObject.put("isWebsiteEndCard", this.bb);
        jSONObject.put("isEcommerceCollageAd", this.bc);
        jSONObject.put("adHasVideoLoadingScreen", this.bd);
        jSONObject.put("isVastAd", this.av);
        jSONObject.put("isVastVideoAd", this.f62477V);
        jSONObject.put(f62424C, this.f62478W);
        jSONObject.put("isMultipleAds", this.be);
        if (!TextUtils.isEmpty(this.f62479X)) {
            jSONObject.put(IYJfqUyym.bYQKEs, this.f62479X);
        }
        jSONObject.put("isEventIDUpdated", this.bf);
        jSONObject.put("isShoppingCollageCreative", this.bk);
        jSONObject.put("impressionLog", this.bg.i());
        if (!this.bh.isEmpty()) {
            jSONObject.put("recommendations", d.a(this.bh));
        }
        if (!this.ax.isEmpty()) {
            jSONObject.put("recommendationsResources", d.a(this.ax));
        }
        jSONObject.put("recommendationDisplayed", this.ay);
        jSONObject.put("isClickUrlFromPrefetch", this.bl);
        HashSet<String> hashSet = this.ba;
        if (hashSet != null && !hashSet.isEmpty()) {
            jSONObject.put("prefetchUrlSha256List", d.a(this.ba));
        }
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adType", "");
            this.f62463E = strOptString.isEmpty() ? null : BrandSafetyUtils.AdType.valueOf(strOptString);
            this.f62480Y = jSONObject.optString("id", "");
            this.af.addAll(d.b(jSONObject.optJSONArray("excludedWebViewResourceUrlsList")));
            this.f62481Z = jSONObject.optBoolean("mediaFileWithJsAppAttributeExists", false);
            this.f62464F = jSONObject.optString("downstreamStruct", "");
            this.aW = jSONObject.optString("adUnitId", "");
            this.f62465G = jSONObject.optBoolean("shouldReportId", false);
            this.f62466H = jSONObject.optBoolean("shouldReportPrefetchTimestamp", false);
            this.f62467I = jSONObject.optBoolean("isPortraitOrientation", false);
            this.aa = jSONObject.optString("sdk", "");
            this.aA = jSONObject.optString("actualSdk", "");
            this.ab = jSONObject.optLong(f62438b, 0L);
            this.ac = jSONObject.optString("creativeId", "");
            this.f62482aB = jSONObject.optString("dspCreativeId", "");
            this.ar = jSONObject.optString("buyerId", "");
            this.f62485as = jSONObject.optString("adSystem", "");
            this.ad = jSONObject.optString(Constants.CLICK_URL, "");
            this.f62468J = jSONObject.optString("videoUrl", "");
            this.at = jSONObject.optString("endCardUrl", "");
            this.f62483aC = jSONObject.optBoolean("stopCollectingResources", false);
            this.ae = jSONObject.optInt("contentHashCode", 0);
            this.f62484aD = jSONObject.optString("eventId", "");
            this.ag = jSONObject.optBoolean("fill", false);
            this.bi = jSONObject.optBoolean("fresh", true);
            this.ah = jSONObject.optString("matchingMethod", "");
            this.bj = jSONObject.optString("matchingMethodDetails", "");
            this.aX = jSONObject.optString("matchingObjectAddress", "");
            this.aY = jSONObject.optString("matchingObjectType", "");
            this.ai = jSONObject.optString("ciDebugInfo", "");
            this.aE = jSONObject.optString("adFormat", "");
            this.f62469K = jSONObject.optString("placementId", "");
            this.f62470M = jSONObject.optString("packageName", "");
            this.aZ = jSONObject.optString("adDomain", "");
            this.aj = d.b(jSONObject.optJSONArray("adText"));
            this.f62471N.addAll(d.b(jSONObject.optJSONArray("dspUrlList")));
            this.f62472P.addAll(d.b(jSONObject.optJSONArray("prefetchUrlList")));
            this.f62473Q = jSONObject.optString("sdkVersion", "");
            this.au.addAll(d.b(jSONObject.optJSONArray("vastAdTagUriList")));
            this.f62474R = new Timestamp(jSONObject.optLong("expirationTimestamp", 0L));
            this.f62475T = jSONObject.optBoolean(f62423B, false);
            this.f62476U = jSONObject.optBoolean("isVideoEndCard", false);
            this.bb = jSONObject.optBoolean("isWebsiteEndCard", false);
            this.bc = jSONObject.optBoolean("isEcommerceCollageAd", false);
            this.bd = jSONObject.optBoolean("adHasVideoLoadingScreen", false);
            this.av = jSONObject.optBoolean("isVastAd", false);
            this.f62477V = jSONObject.optBoolean("isVastVideoAd", false);
            this.f62478W = jSONObject.optBoolean(f62424C, false);
            this.be = jSONObject.optBoolean("isMultipleAds", false);
            this.f62479X = jSONObject.optString("vastAdParameters", "");
            this.bf = jSONObject.optBoolean("isEventIDUpdated", false);
            this.bk = jSONObject.optBoolean("isShoppingCollageCreative", false);
            this.bg.a(jSONObject.optJSONObject("impressionLog"));
            this.bh.addAll(d.b(jSONObject.optJSONArray("recommendations")));
            this.ax.addAll(d.b(jSONObject.optJSONArray("recommendationsResources")));
            this.ay = jSONObject.optBoolean("recommendationDisplayed", false);
            this.bl = jSONObject.optBoolean("isClickUrlFromPrefetch", false);
            this.ba.addAll(d.b(jSONObject.optJSONArray("prefetchUrlSha256List")));
        }
    }
}
