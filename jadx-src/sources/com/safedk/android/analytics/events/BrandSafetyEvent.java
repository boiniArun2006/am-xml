package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.d;
import com.safedk.android.utils.h;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import com.vungle.ads.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class BrandSafetyEvent extends StatsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62724a = "click_url";
    public static final String aI = "revenue_event";

    /* JADX INFO: renamed from: aP, reason: collision with root package name */
    public static final String f62727aP = "webview_resource_urls";
    public static final String aQ = "webview_resource_urls_expanded";
    public static final String aR = "ci_matching_method";
    private static final String a_ = "BrandSafetyEvent";
    public static final String ac = "max_network_name";
    public static final String ad = "network_name";
    public static final String ae = "dsp_name";
    public static final String af = "custom_js_network_name";
    public static final String ag = "is_first_session";
    public static final String ah = "event_id";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    public static final String f62728ao = "max_creative_id";
    public static final String ap = "creative_id";
    public static final String aq = "did_fail_display_received";
    public static final String ar = "will_display_received";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    public static final String f62729as = "is_banner_view_detected";
    public static final String at = "image_slot";
    public static final String au = "interval_between_display_messages";
    public static final String av = "detected_view_proportions";

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    public static final String f62730aw = "device_orientation";
    public static final String ay = "multi_ad_uuid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62731b = "foreground_activity";
    private static final String bd = "REWARD";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62732c = "impression_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62733d = "viewing_time";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62735f = "zone_id";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62736g = "app_package_name";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62737h = "dsp_domains";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f62738i = "ad_format";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f62739j = "ad_format_type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f62740k = "third_party_ad_placement_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f62742m = "sdk_version";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f62743n = "impression";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f62744o = "image_file_size";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f62745p = "image_uniformity";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f62746q = "image_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f62747r = "image_orientation";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f62748s = "is_animated";
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f62749t = "is_clicked";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f62750u = "ad_recommendations";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f62751v = "is_next_session";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f62752L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private String f62753M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f62754N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private transient Bundle f62755O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f62756P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private String f62757Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f62758R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private String f62759S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f62760T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private String f62761U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f62762V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private String f62763W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f62764X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f62765Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f62766Z;
    private String aA;

    /* JADX INFO: renamed from: aB, reason: collision with root package name */
    private String f62767aB;

    /* JADX INFO: renamed from: aC, reason: collision with root package name */
    private String f62768aC;

    /* JADX INFO: renamed from: aD, reason: collision with root package name */
    private String f62769aD;
    private String aE;

    /* JADX INFO: renamed from: aF, reason: collision with root package name */
    private boolean f62770aF;
    private boolean aG;
    private boolean aH;

    /* JADX INFO: renamed from: aT, reason: collision with root package name */
    String f62771aT;
    HashSet<String> aU;
    Boolean aV;
    HashSet<String> aW;
    HashSet<String> aX;
    HashSet<String> aY;
    HashSet<String> aZ;
    private BrandSafetyUtils.ScreenShotOrientation aa;
    private boolean ai;
    private boolean aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private int f62772ak;
    private long al;
    private float am;
    private String an;
    Boolean ba;
    HashSet<String> bb;
    List<String> bc;
    private String bf;
    private String bg;
    private String bh;
    private String bi;
    private boolean bj;
    private RedirectData bk;
    private int bl;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62734e = "slot_number";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f62741l = "max_ad_unit_id";
    private static final Set<String> ab = new HashSet(Arrays.asList("impression_id", StatsEvent.f62830z, "sdk_uuid", f62734e, "ad_format_type", "zone_id", f62741l));
    public static final String aJ = "is_cross_origin_iframe_in_webview";
    public static final String aK = "webpage_resource_url_list";

    /* JADX INFO: renamed from: aL, reason: collision with root package name */
    public static final String f62725aL = "network_resource_url_list";
    public static final String aM = "expanded_webpage_resource_url_list";
    public static final String aN = "expanded_network_resource_url_list";
    public static final String aS = "is_hidden_iframe_in_webview";

    /* JADX INFO: renamed from: aO, reason: collision with root package name */
    public static final String f62726aO = "webpage_hidden_resource_urls";
    private static final Set<String> be = new HashSet(Arrays.asList(aJ, aK, f62725aL, aM, aN, aS, f62726aO));

    public enum AdFormatType {
        INTER,
        REWARD,
        BANNER,
        LEADER,
        MREC,
        APPOPEN,
        NATIVE
    }

    public BrandSafetyEvent() {
        this.f62756P = null;
        this.f62757Q = null;
        this.f62762V = false;
        this.f62763W = null;
        this.f62764X = false;
        this.aE = null;
        this.f62771aT = null;
        this.f62770aF = false;
        this.bi = null;
        this.aV = null;
        this.ba = null;
        this.aG = false;
        this.bj = false;
        this.ai = false;
        this.aj = false;
        this.f62772ak = 0;
        this.al = 0L;
        this.am = 0.0f;
        this.an = null;
        this.aH = false;
        this.bk = null;
        this.bl = 0;
        this.bc = Arrays.asList(BrandSafetyUtils.f61444j, bd, BrandSafetyUtils.f61446l);
        this.f62833E = StatsCollector.EventType.BrandSafety;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0357 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0361 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036e A[Catch: all -> 0x03a2, TryCatch #1 {all -> 0x03a2, blocks: (B:104:0x036a, B:106:0x036e, B:108:0x037d, B:109:0x037f, B:107:0x0378, B:123:0x03a0), top: B:129:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0378 A[Catch: all -> 0x03a2, TryCatch #1 {all -> 0x03a2, blocks: (B:104:0x036a, B:106:0x036e, B:108:0x037d, B:109:0x037f, B:107:0x0378, B:123:0x03a0), top: B:129:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #9 {all -> 0x006c, blocks: (B:8:0x0065, B:14:0x00a4, B:15:0x00ac, B:17:0x00b2, B:18:0x00bc, B:19:0x00c4, B:21:0x00ca, B:23:0x00d6, B:24:0x00de, B:26:0x00f7, B:28:0x0122, B:35:0x0173, B:40:0x01bc), top: B:143:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019b A[Catch: all -> 0x0395, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0395, blocks: (B:5:0x005f, B:12:0x0079, B:37:0x019b, B:41:0x01c1), top: B:129:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0269 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ba A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ca A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d1 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031e A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0328 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0331 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033b A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0344 A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x034e A[Catch: all -> 0x0381, TryCatch #0 {all -> 0x0381, blocks: (B:49:0x01e9, B:51:0x01ef, B:53:0x0225, B:54:0x022d, B:62:0x0247, B:69:0x0263, B:71:0x0269, B:72:0x027c, B:74:0x02ba, B:76:0x02c0, B:78:0x02c4, B:80:0x02ca, B:81:0x02d1, B:82:0x02ef, B:85:0x0304, B:86:0x0318, B:88:0x031e, B:90:0x032d, B:92:0x0331, B:94:0x0340, B:96:0x0344, B:98:0x0353, B:100:0x0357, B:102:0x0366, B:101:0x0361, B:97:0x034e, B:93:0x033b, B:89:0x0328), top: B:127:0x01e9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, long viewingTime, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, boolean isAnimated, long imageFileSize, float imageUniformity, int imageSlot, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> dspUrlList, Boolean isCrossOriginIframeInWebpage, SimpleConcurrentHashSet<String> webPageResourceUrlList, SimpleConcurrentHashSet<String> networkResourceUrlList, SimpleConcurrentHashSet<String> expandedWebPageResourceUrlList, SimpleConcurrentHashSet<String> expandedNetworkResourceUrlList, Boolean isHiddenIframeInWebpage, SimpleConcurrentHashSet<String> hiddenWebPageResourceUrlList) throws Throwable {
        String clickUrl2;
        super(sdk, StatsCollector.EventType.BrandSafety);
        this.f62756P = null;
        this.f62757Q = null;
        this.f62762V = false;
        this.f62763W = null;
        this.f62764X = false;
        this.aE = null;
        this.f62771aT = null;
        this.f62770aF = false;
        this.bi = null;
        this.aV = null;
        this.ba = null;
        this.aG = false;
        this.bj = false;
        this.ai = false;
        this.aj = false;
        this.f62772ak = 0;
        this.al = 0L;
        this.am = 0.0f;
        this.an = null;
        this.aH = false;
        this.bk = null;
        this.bl = 0;
        this.bc = Arrays.asList(BrandSafetyUtils.f61444j, bd, BrandSafetyUtils.f61446l);
        synchronized (this) {
            try {
                try {
                    this.f62752L = slotNumber;
                    if (timestamp <= 0) {
                        Logger.d(a_, "BrandSafetyEvent ctor creative info: ", creativeInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                        this.aU = new HashSet<>();
                        if (creativeInfo == null) {
                        }
                        clickUrl2 = clickUrl;
                        this.f62753M = clickUrl2;
                        this.f62762V = clicked;
                        this.f62756P = foregroundActivityName;
                        this.f62757Q = impressionMd5;
                        this.bf = multiAdUuid;
                        this.f62758R = viewingTime;
                        this.f62767aB = maxCreativeId;
                        if (applovinData != null) {
                        }
                        this.f62837I = isMature;
                        if (creativeInfo != null) {
                        }
                        this.az = isFirstSession;
                        if (eventId != null) {
                        }
                        this.f62770aF = didFailDisplayReceived;
                        this.bg = debugInfo;
                        this.bh = impressionLog;
                        Logger.d(a_, "impression log value = ", revenueEventValue);
                        this.bk = redirectData;
                        this.bl = redirectCount;
                        this.f62771aT = revenueEventValue;
                        this.aH = isScarAdMobAd;
                        Logger.d(a_, "revenue event value = ", revenueEventValue);
                        if (creativeInfo != null) {
                        }
                        Logger.d(a_, "matching method value = ", revenueEventValue);
                        if (creativeInfo != null) {
                        }
                        this.aV = isCrossOriginIframeInWebpage;
                        this.aW = webPageResourceUrlList != null ? new HashSet<>(webPageResourceUrlList.keySet()) : new HashSet<>();
                        this.aX = networkResourceUrlList != null ? new HashSet<>(networkResourceUrlList.keySet()) : new HashSet<>();
                        this.aZ = expandedWebPageResourceUrlList != null ? new HashSet<>(expandedWebPageResourceUrlList.keySet()) : new HashSet<>();
                        this.aY = expandedNetworkResourceUrlList != null ? new HashSet<>(expandedNetworkResourceUrlList.keySet()) : new HashSet<>();
                        this.ba = isHiddenIframeInWebpage;
                        this.bb = hiddenWebPageResourceUrlList != null ? new HashSet<>(hiddenWebPageResourceUrlList.keySet()) : new HashSet<>();
                        return;
                    }
                    try {
                        this.f62835G = n.b(timestamp);
                        Logger.d(a_, "BrandSafetyEvent ctor creative info: ", creativeInfo, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                        this.aU = new HashSet<>();
                        try {
                            try {
                                try {
                                    try {
                                        if (creativeInfo == null) {
                                            Iterator<String> it = creativeInfo.am().iterator();
                                            while (it.hasNext()) {
                                                networkResourceUrlList.remove(it.next());
                                            }
                                            Iterator<String> it2 = creativeInfo.e().iterator();
                                            while (it2.hasNext()) {
                                                networkResourceUrlList.remove(it2.next());
                                            }
                                            if (dspUrlList != null) {
                                                creativeInfo.a(new ArrayList<>(dspUrlList));
                                            }
                                            Logger.d(a_, "webview_resource_urls setting dsp urls list = ", dspUrlList);
                                            if (creativeInfo.S().equals(sdk)) {
                                                Logger.d(a_, "creative info sdk is equal to event SDK");
                                                this.f62754N = creativeInfo.I();
                                                Bundle bundleB = creativeInfo.b();
                                                this.f62755O = bundleB;
                                                Logger.d(a_, "addedCreativeInfoValues ", bundleB);
                                                if (clickUrl == null) {
                                                    Logger.d(a_, "self click url is null, setting creative info click url");
                                                    clickUrl2 = creativeInfo.O();
                                                } else {
                                                    clickUrl2 = clickUrl;
                                                }
                                                try {
                                                    Logger.d(a_, "webview_resource_urls removing resource urls list and dsp urls list.");
                                                    this.f62832D = creativeInfo.t();
                                                    Logger.d(a_, "BrandSeftyEvent ctor , sdk : ", sdk, ", sdk_version set : ", this.f62832D);
                                                    this.f62753M = clickUrl2;
                                                    this.f62762V = clicked;
                                                    this.f62756P = foregroundActivityName;
                                                    this.f62757Q = impressionMd5;
                                                    this.bf = multiAdUuid;
                                                    this.f62758R = viewingTime;
                                                    this.f62767aB = maxCreativeId;
                                                    if (applovinData != null) {
                                                        this.f62759S = applovinData.getString(f62741l);
                                                        this.aA = applovinData.getString(ad);
                                                        this.f62760T = b(applovinData.getString("ad_format"));
                                                        this.f62761U = applovinData.getString(f62740k);
                                                        this.f62768aC = applovinData.getString("dsp_name");
                                                        this.f62769aD = applovinData.getString(af);
                                                        if (maxCreativeId == null) {
                                                            this.f62767aB = applovinData.getString("creative_id");
                                                        }
                                                    }
                                                    this.f62837I = isMature;
                                                    if (creativeInfo != null) {
                                                        try {
                                                            this.f62763W = hashValue;
                                                            this.aa = screenShotOrientation;
                                                            this.f62764X = isAnimated;
                                                            if (hashValue != null) {
                                                                this.f62765Y = imageFileSize;
                                                                try {
                                                                    this.f62766Z = imageUniformity;
                                                                    this.f62772ak = imageSlot;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                    this.az = isFirstSession;
                                                    if (eventId != null) {
                                                        Logger.d(a_, "eventId = ", eventId);
                                                        this.aE = eventId;
                                                    }
                                                    this.f62770aF = didFailDisplayReceived;
                                                    this.bg = debugInfo;
                                                    this.bh = impressionLog;
                                                    Logger.d(a_, "impression log value = ", revenueEventValue);
                                                    this.bk = redirectData;
                                                    this.bl = redirectCount;
                                                    this.f62771aT = revenueEventValue;
                                                    this.aH = isScarAdMobAd;
                                                    Logger.d(a_, "revenue event value = ", revenueEventValue);
                                                    if (creativeInfo != null && creativeInfo.Z() != null && this.bi == null) {
                                                        if (creativeInfo.aa() != null) {
                                                            this.bi = creativeInfo.Z();
                                                        } else {
                                                            this.bi = creativeInfo.Z() + "_" + creativeInfo.aa();
                                                        }
                                                    }
                                                    Logger.d(a_, "matching method value = ", revenueEventValue);
                                                    if (creativeInfo != null && isMature) {
                                                        Logger.d(a_, "setting matching method for mature ci to null. ci = ", creativeInfo);
                                                        creativeInfo.W();
                                                    }
                                                    this.aV = isCrossOriginIframeInWebpage;
                                                    this.aW = webPageResourceUrlList != null ? new HashSet<>(webPageResourceUrlList.keySet()) : new HashSet<>();
                                                    this.aX = networkResourceUrlList != null ? new HashSet<>(networkResourceUrlList.keySet()) : new HashSet<>();
                                                    this.aZ = expandedWebPageResourceUrlList != null ? new HashSet<>(expandedWebPageResourceUrlList.keySet()) : new HashSet<>();
                                                    this.aY = expandedNetworkResourceUrlList != null ? new HashSet<>(expandedNetworkResourceUrlList.keySet()) : new HashSet<>();
                                                    this.ba = isHiddenIframeInWebpage;
                                                    this.bb = hiddenWebPageResourceUrlList != null ? new HashSet<>(hiddenWebPageResourceUrlList.keySet()) : new HashSet<>();
                                                    return;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } else {
                                                Logger.d(a_, "creative info sdk != sdk. creative info sdk: ", creativeInfo.S(), ", actual sdk: ", creativeInfo.T(), ", sdk: ", sdk);
                                            }
                                        } else {
                                            boolean zA = CreativeInfoManager.a(sdk, AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
                                            Logger.d(a_, "the don't report webview resource is: ", Boolean.valueOf(zA));
                                            if (!zA && dspUrlList != null) {
                                                this.aU.addAll(dspUrlList);
                                            }
                                            Logger.d(a_, "webview_resource_urls setting dsp urls list = ", dspUrlList);
                                        }
                                        this.f62758R = viewingTime;
                                        this.f62767aB = maxCreativeId;
                                        if (applovinData != null) {
                                        }
                                        this.f62837I = isMature;
                                        if (creativeInfo != null) {
                                        }
                                        this.az = isFirstSession;
                                        if (eventId != null) {
                                        }
                                        this.f62770aF = didFailDisplayReceived;
                                        this.bg = debugInfo;
                                        this.bh = impressionLog;
                                        Logger.d(a_, "impression log value = ", revenueEventValue);
                                        this.bk = redirectData;
                                        this.bl = redirectCount;
                                        this.f62771aT = revenueEventValue;
                                        this.aH = isScarAdMobAd;
                                        Logger.d(a_, "revenue event value = ", revenueEventValue);
                                        if (creativeInfo != null) {
                                            if (creativeInfo.aa() != null) {
                                            }
                                        }
                                        Logger.d(a_, "matching method value = ", revenueEventValue);
                                        if (creativeInfo != null) {
                                            Logger.d(a_, "setting matching method for mature ci to null. ci = ", creativeInfo);
                                            creativeInfo.W();
                                        }
                                        this.aV = isCrossOriginIframeInWebpage;
                                        this.aW = webPageResourceUrlList != null ? new HashSet<>(webPageResourceUrlList.keySet()) : new HashSet<>();
                                        this.aX = networkResourceUrlList != null ? new HashSet<>(networkResourceUrlList.keySet()) : new HashSet<>();
                                        this.aZ = expandedWebPageResourceUrlList != null ? new HashSet<>(expandedWebPageResourceUrlList.keySet()) : new HashSet<>();
                                        this.aY = expandedNetworkResourceUrlList != null ? new HashSet<>(expandedNetworkResourceUrlList.keySet()) : new HashSet<>();
                                        this.ba = isHiddenIframeInWebpage;
                                        this.bb = hiddenWebPageResourceUrlList != null ? new HashSet<>(hiddenWebPageResourceUrlList.keySet()) : new HashSet<>();
                                        return;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                    this.f62756P = foregroundActivityName;
                                    this.f62757Q = impressionMd5;
                                    this.bf = multiAdUuid;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                                this.f62762V = clicked;
                            } catch (Throwable th6) {
                                th = th6;
                                throw th;
                            }
                            this.f62753M = clickUrl2;
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        clickUrl2 = clickUrl;
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            } catch (Throwable th10) {
                th = th10;
            }
            throw th;
        }
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isBannerViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isScarAdMobAd, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog, RedirectData redirectData, int redirectCount, HashSet<String> dspUrlList, Boolean isCrossOriginIframeInWebpage, SimpleConcurrentHashSet<String> webPageResourceUrlList, SimpleConcurrentHashSet<String> networkResourceUrlList, SimpleConcurrentHashSet<String> expandedWebPageResourceUrlList, SimpleConcurrentHashSet<String> expandedNetworkResourceUrlList, Boolean isHiddenIframeInWebpage, SimpleConcurrentHashSet<String> hiddenWebPageResourceUrlList) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, isScarAdMobAd, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, redirectData, redirectCount, dspUrlList, isCrossOriginIframeInWebpage, webPageResourceUrlList, networkResourceUrlList, expandedWebPageResourceUrlList, expandedNetworkResourceUrlList, isHiddenIframeInWebpage, hiddenWebPageResourceUrlList);
        this.aG = true;
        this.ai = willDisplayReceived;
        this.aj = isBannerViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    public BrandSafetyEvent(String sdk, int slotNumber, String hashValue, boolean clicked, String clickUrl, CreativeInfo creativeInfo, long timestamp, String foregroundActivityName, String impressionMd5, String multiAdUuid, boolean isMature, Bundle applovinData, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, long imageFileSize, float imageUniformity, int imageSlot, boolean willDisplayReceived, boolean isAdViewDetected, long intervalBetweenDisplayMessages, float detectedViewProportions, String deviceOrientation, boolean isFirstSession, String eventId, String maxCreativeId, boolean didFailDisplayReceived, String revenueEventValue, String debugInfo, String impressionLog) {
        this(sdk, slotNumber, hashValue, clicked, clickUrl, creativeInfo, timestamp, foregroundActivityName, impressionMd5, multiAdUuid, 0L, isMature, applovinData, screenShotOrientation, false, imageFileSize, imageUniformity, imageSlot, false, isFirstSession, eventId, maxCreativeId, didFailDisplayReceived, revenueEventValue, debugInfo, impressionLog, null, 0, null, false, null, null, null, null, false, null);
        this.bj = true;
        this.ai = willDisplayReceived;
        this.aj = isAdViewDetected;
        this.al = intervalBetweenDisplayMessages;
        this.am = detectedViewProportions;
        this.an = deviceOrientation;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.BrandSafety;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        return this.f62757Q;
    }

    public void c() {
        this.f62763W = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023d A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0241 A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0250 A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0254 A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0267 A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290 A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b6 A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021b A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e A[Catch: all -> 0x02c0, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0031, B:9:0x005b, B:11:0x0063, B:12:0x0065, B:14:0x006f, B:16:0x0075, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x0085, B:24:0x0089, B:26:0x00c6, B:28:0x00ca, B:31:0x00f5, B:33:0x00f9, B:35:0x00fd, B:37:0x0107, B:42:0x0116, B:47:0x011f, B:51:0x0133, B:53:0x0143, B:55:0x0147, B:56:0x0158, B:58:0x015c, B:60:0x0166, B:62:0x016a, B:63:0x01b2, B:65:0x01b6, B:67:0x01ba, B:68:0x01cb, B:70:0x01cf, B:71:0x01e0, B:73:0x0208, B:74:0x020a, B:80:0x0216, B:81:0x0217, B:83:0x021b, B:84:0x021d, B:90:0x0229, B:91:0x022a, B:93:0x022e, B:94:0x0230, B:100:0x023c, B:101:0x023d, B:103:0x0241, B:104:0x0243, B:110:0x024f, B:111:0x0250, B:113:0x0254, B:114:0x0256, B:120:0x0262, B:121:0x0263, B:123:0x0267, B:125:0x026b, B:133:0x0286, B:126:0x0272, B:128:0x027a, B:134:0x028c, B:136:0x0290, B:138:0x0294, B:144:0x02ac, B:139:0x029b, B:141:0x02a3, B:145:0x02b2, B:147:0x02b6, B:148:0x02ba, B:48:0x0122, B:50:0x0126, B:30:0x00de, B:6:0x0045, B:8:0x0054, B:115:0x0257, B:116:0x025e, B:75:0x020b, B:76:0x0212, B:85:0x021e, B:86:0x0225, B:95:0x0231, B:96:0x0238, B:105:0x0244, B:106:0x024b), top: B:156:0x0001, inners: #0, #2, #3, #4, #5 }] */
    @Override // com.safedk.android.analytics.events.base.StatsEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(StatsEvent statsEvent) {
        boolean zBooleanValue;
        BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) statsEvent;
        boolean zBooleanValue2 = false;
        Logger.d(a_, "doAggregation removing dsp urls list. local dspUrlList = ", this.aU, ", isOnUiThread = ", Boolean.valueOf(n.c()));
        this.aU = new HashSet<>();
        Bundle bundle = brandSafetyEvent.f62755O;
        if (bundle != null) {
            Logger.d(a_, "Aggregating downstream struct. eventCreativeValues=", bundle);
            this.f62755O = bundle;
            this.f62754N = brandSafetyEvent.f62754N;
        } else {
            Logger.d(a_, "doAggregation setting dsp urls list");
            if (brandSafetyEvent.aU != null) {
                this.aU.addAll(brandSafetyEvent.aU);
            }
        }
        String str = brandSafetyEvent.f62753M;
        if (!TextUtils.isEmpty(str)) {
            this.f62753M = str;
        }
        long jL = statsEvent.l();
        if (jL != 0 && jL < this.f62835G) {
            this.f62835G = jL;
        }
        long j2 = brandSafetyEvent.f62758R;
        if (j2 > 0 && j2 > this.f62758R) {
            this.f62758R = j2;
        }
        if (brandSafetyEvent.f62763W != null) {
            Logger.d(a_, "doAggregation updating screenShotHashValue to '", brandSafetyEvent.f62763W, "' , image_file_size to ", Long.valueOf(brandSafetyEvent.f62765Y), " and image_max_uniform_pixels to ", Float.valueOf(brandSafetyEvent.f62766Z));
            this.f62763W = brandSafetyEvent.f62763W;
            this.f62765Y = brandSafetyEvent.f62765Y;
            this.f62766Z = brandSafetyEvent.f62766Z;
            this.f62772ak = brandSafetyEvent.f62772ak;
            BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = brandSafetyEvent.aa;
            if (screenShotOrientation != null && screenShotOrientation != BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED) {
                Logger.d(a_, "doAggregation updating screenShotOrientation to '", screenShotOrientation, "'");
                this.aa = screenShotOrientation;
            }
        } else {
            Logger.d(a_, "doAggregation updating image hash to null");
            this.f62763W = null;
            this.f62765Y = 0L;
            this.f62772ak = 0;
            this.aa = null;
            this.f62766Z = 0.0f;
        }
        boolean z2 = brandSafetyEvent.f62762V;
        if (z2) {
            this.f62762V = z2 && (brandSafetyEvent.bf == null || (this.f62760T != null && this.bc.contains(this.f62760T) && CreativeInfoManager.a(this.f62831C, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false)));
        } else if (brandSafetyEvent.bf != null) {
            this.f62762V = false;
            Logger.d(a_, "doAggregation reset clicked due to multi ad");
        }
        this.f62764X = brandSafetyEvent.f62764X;
        this.f62767aB = brandSafetyEvent.f62767aB;
        this.bf = brandSafetyEvent.bf;
        if (this.aE == null && brandSafetyEvent.aE != null) {
            String str2 = brandSafetyEvent.aE;
            this.aE = str2;
            Logger.d(a_, "doAggregation updating eventId to ", str2);
        }
        if (this.f62831C != null && !this.f62831C.equals(brandSafetyEvent.f62831C) && this.f62755O != null) {
            Logger.d(a_, "doAggregation incompatible SDK. current: ", this.f62831C, ", new: ", brandSafetyEvent.f62831C);
            String string = this.f62755O.getString(CreativeInfo.f62443g, "");
            this.f62755O.putString(CreativeInfo.f62443g, string + "|sdk=" + this.f62831C + ";newSdk=" + brandSafetyEvent.f62831C);
        }
        if (this.f62771aT == null && brandSafetyEvent.f62771aT != null) {
            String str3 = brandSafetyEvent.f62771aT;
            this.f62771aT = str3;
            Logger.d(a_, "doAggregation updating revenueEventValue to ", str3);
        }
        if (this.f62756P == null) {
            String str4 = brandSafetyEvent.f62756P;
            this.f62756P = str4;
            Logger.d(a_, "doAggregation updating foregroundActivityName to ", str4);
        }
        this.ai = brandSafetyEvent.ai;
        this.aj = brandSafetyEvent.aj;
        this.al = brandSafetyEvent.al;
        this.bk = brandSafetyEvent.bk;
        this.bl = brandSafetyEvent.bl;
        this.am = brandSafetyEvent.am;
        this.bg = brandSafetyEvent.bg;
        this.bh = brandSafetyEvent.bh;
        this.f62770aF = brandSafetyEvent.f62770aF;
        if (brandSafetyEvent.aW != null) {
            synchronized (this.aW) {
                this.aW.addAll(brandSafetyEvent.aW);
            }
            if (brandSafetyEvent.aX == null) {
                synchronized (this.aX) {
                    this.aX.addAll(brandSafetyEvent.aX);
                }
                if (brandSafetyEvent.aZ == null) {
                    synchronized (this.aZ) {
                        this.aZ.addAll(brandSafetyEvent.aZ);
                    }
                    if (brandSafetyEvent.aY == null) {
                        synchronized (this.aY) {
                            this.aY.addAll(brandSafetyEvent.aY);
                        }
                        if (brandSafetyEvent.bb != null) {
                            synchronized (this.bb) {
                                this.bb.addAll(brandSafetyEvent.bb);
                            }
                        }
                        if (brandSafetyEvent.aV != null) {
                            if (this.aV == null) {
                                zBooleanValue = brandSafetyEvent.aV.booleanValue();
                            } else {
                                zBooleanValue = this.aV.booleanValue() || brandSafetyEvent.aV.booleanValue();
                            }
                            this.aV = Boolean.valueOf(zBooleanValue);
                        }
                        if (brandSafetyEvent.ba != null) {
                            if (this.ba == null) {
                                zBooleanValue2 = brandSafetyEvent.ba.booleanValue();
                            } else if (this.ba.booleanValue() || brandSafetyEvent.ba.booleanValue()) {
                                zBooleanValue2 = true;
                            }
                            this.ba = Boolean.valueOf(zBooleanValue2);
                        }
                        if (brandSafetyEvent.bi != null) {
                            this.bi = brandSafetyEvent.bi;
                        }
                        this.aH = brandSafetyEvent.aH;
                    } else {
                        if (brandSafetyEvent.bb != null) {
                        }
                        if (brandSafetyEvent.aV != null) {
                        }
                        if (brandSafetyEvent.ba != null) {
                        }
                        if (brandSafetyEvent.bi != null) {
                        }
                        this.aH = brandSafetyEvent.aH;
                    }
                } else if (brandSafetyEvent.aY == null) {
                }
            } else if (brandSafetyEvent.aZ == null) {
            }
        } else if (brandSafetyEvent.aX == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0383 A[Catch: all -> 0x03df, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0010, B:8:0x0018, B:9:0x001f, B:11:0x0023, B:13:0x002b, B:22:0x0055, B:24:0x005d, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:30:0x0082, B:31:0x0089, B:33:0x0091, B:34:0x0098, B:36:0x00a0, B:37:0x00a7, B:39:0x00af, B:40:0x00b6, B:42:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d5, B:48:0x00dc, B:50:0x00e6, B:52:0x00ee, B:54:0x00f8, B:57:0x0109, B:59:0x0111, B:61:0x011b, B:65:0x0138, B:67:0x0140, B:69:0x0144, B:71:0x014a, B:72:0x0157, B:74:0x0166, B:76:0x0171, B:78:0x0175, B:79:0x017c, B:81:0x0180, B:82:0x018f, B:83:0x01a4, B:85:0x01ba, B:87:0x01c2, B:88:0x01de, B:89:0x01e5, B:91:0x01ed, B:92:0x01f4, B:94:0x0208, B:105:0x0245, B:107:0x0249, B:109:0x024d, B:111:0x0278, B:113:0x0280, B:114:0x029e, B:115:0x02a7, B:117:0x02b6, B:118:0x02bd, B:120:0x02cc, B:121:0x02d3, B:123:0x02d7, B:124:0x02e2, B:126:0x02e6, B:127:0x02f1, B:129:0x02f5, B:131:0x02fd, B:133:0x0301, B:135:0x0307, B:137:0x030d, B:138:0x030f, B:141:0x0318, B:142:0x031a, B:148:0x0324, B:151:0x0327, B:152:0x0328, B:153:0x0334, B:155:0x0338, B:157:0x0340, B:158:0x034c, B:160:0x0350, B:162:0x0358, B:164:0x035c, B:166:0x0362, B:168:0x0368, B:169:0x036a, B:172:0x0373, B:173:0x0375, B:179:0x037f, B:182:0x0382, B:183:0x0383, B:184:0x038f, B:186:0x0393, B:188:0x039b, B:189:0x03a7, B:191:0x03ab, B:193:0x03b3, B:194:0x03bf, B:196:0x03c7, B:197:0x03ce, B:96:0x020c, B:98:0x021e, B:100:0x0229, B:101:0x0230, B:103:0x0237, B:104:0x023e, B:63:0x0125, B:56:0x0102, B:64:0x012d, B:14:0x0031, B:16:0x0035, B:17:0x003d, B:19:0x0041, B:21:0x0049, B:170:0x036b, B:171:0x0372, B:143:0x031b, B:144:0x0320, B:139:0x0310, B:140:0x0317, B:174:0x0376, B:175:0x037b), top: B:211:0x0001, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c7 A[Catch: all -> 0x03df, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0010, B:8:0x0018, B:9:0x001f, B:11:0x0023, B:13:0x002b, B:22:0x0055, B:24:0x005d, B:25:0x0064, B:27:0x0073, B:28:0x007a, B:30:0x0082, B:31:0x0089, B:33:0x0091, B:34:0x0098, B:36:0x00a0, B:37:0x00a7, B:39:0x00af, B:40:0x00b6, B:42:0x00be, B:43:0x00c5, B:45:0x00cd, B:47:0x00d5, B:48:0x00dc, B:50:0x00e6, B:52:0x00ee, B:54:0x00f8, B:57:0x0109, B:59:0x0111, B:61:0x011b, B:65:0x0138, B:67:0x0140, B:69:0x0144, B:71:0x014a, B:72:0x0157, B:74:0x0166, B:76:0x0171, B:78:0x0175, B:79:0x017c, B:81:0x0180, B:82:0x018f, B:83:0x01a4, B:85:0x01ba, B:87:0x01c2, B:88:0x01de, B:89:0x01e5, B:91:0x01ed, B:92:0x01f4, B:94:0x0208, B:105:0x0245, B:107:0x0249, B:109:0x024d, B:111:0x0278, B:113:0x0280, B:114:0x029e, B:115:0x02a7, B:117:0x02b6, B:118:0x02bd, B:120:0x02cc, B:121:0x02d3, B:123:0x02d7, B:124:0x02e2, B:126:0x02e6, B:127:0x02f1, B:129:0x02f5, B:131:0x02fd, B:133:0x0301, B:135:0x0307, B:137:0x030d, B:138:0x030f, B:141:0x0318, B:142:0x031a, B:148:0x0324, B:151:0x0327, B:152:0x0328, B:153:0x0334, B:155:0x0338, B:157:0x0340, B:158:0x034c, B:160:0x0350, B:162:0x0358, B:164:0x035c, B:166:0x0362, B:168:0x0368, B:169:0x036a, B:172:0x0373, B:173:0x0375, B:179:0x037f, B:182:0x0382, B:183:0x0383, B:184:0x038f, B:186:0x0393, B:188:0x039b, B:189:0x03a7, B:191:0x03ab, B:193:0x03b3, B:194:0x03bf, B:196:0x03c7, B:197:0x03ce, B:96:0x020c, B:98:0x021e, B:100:0x0229, B:101:0x0230, B:103:0x0237, B:104:0x023e, B:63:0x0125, B:56:0x0102, B:64:0x012d, B:14:0x0031, B:16:0x0035, B:17:0x003d, B:19:0x0041, B:21:0x0049, B:170:0x036b, B:171:0x0372, B:143:0x031b, B:144:0x0320, B:139:0x0310, B:140:0x0317, B:174:0x0376, B:175:0x037b), top: B:211:0x0001, inners: #0, #1, #2, #3 }] */
    @Override // com.safedk.android.analytics.events.base.StatsEvent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Bundle d() {
        Bundle bundleD;
        bundleD = super.d();
        if (this.f62752L > 0) {
            bundleD.putInt(f62734e, this.f62752L);
        }
        if (!TextUtils.isEmpty(this.f62753M)) {
            bundleD.putString(f62724a, this.f62753M);
        }
        if (this.f62755O != null && !this.f62755O.isEmpty()) {
            bundleD.putAll(this.f62755O);
        } else if (this.aH) {
            bundleD.putString(CreativeInfo.f62453q, "/scar-admob");
        } else if (this.aU != null && !this.aU.isEmpty()) {
            bundleD.putStringArrayList(f62737h, new ArrayList<>(this.aU));
        }
        if (!TextUtils.isEmpty(this.f62756P)) {
            bundleD.putString("foreground_activity", this.f62756P);
        }
        bundleD.putString("impression_id", this.f62757Q);
        if (!TextUtils.isEmpty(this.bf)) {
            bundleD.putString(ay, this.bf);
        }
        if (this.f62758R > 0) {
            bundleD.putLong(f62733d, this.f62758R);
        }
        if (!TextUtils.isEmpty(this.f62759S)) {
            bundleD.putString(f62741l, this.f62759S);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            bundleD.putString(ac, this.aA);
        }
        if (!TextUtils.isEmpty(this.f62767aB)) {
            bundleD.putString(f62728ao, this.f62767aB);
        }
        if (!TextUtils.isEmpty(this.f62769aD)) {
            bundleD.putString(af, this.f62769aD);
        }
        if (!TextUtils.isEmpty(this.f62768aC) && !bundleD.containsKey(CreativeInfo.f62426L)) {
            bundleD.putString(CreativeInfo.f62426L, this.f62768aC);
        }
        if (!TextUtils.isEmpty(this.f62831C)) {
            if (bundleD.getString("ad_format_type") == null || h.f63171k.equals(this.f62831C) || h.f63176p.equals(this.f62831C)) {
                bundleD.putString("ad_format_type", this.f62760T);
            }
            if (bundleD.getString("zone_id") == null || h.f63171k.equals(this.f62831C) || h.f63176p.equals(this.f62831C)) {
                bundleD.putString("zone_id", this.f62761U);
            }
        } else {
            Logger.d(a_, "Sdk field value is null.");
        }
        if (bundleD.getString("ad_format_type") == null && this.bk != null && this.bk.f61737t != null) {
            bundleD.putString("ad_format_type", this.bk.f61737t.name());
        }
        bundleD.putString(StatsEvent.f62830z, "impression");
        if (!TextUtils.isEmpty(this.f62763W)) {
            bundleD.putString("image_id", this.f62763W);
            if (!this.aG && !this.bj) {
                bundleD.putBoolean(f62748s, this.f62764X);
            }
            if (this.aa != null) {
                bundleD.putString("image_orientation", this.aa.name().toLowerCase());
            }
            bundleD.putLong(f62744o, this.f62765Y);
            bundleD.putFloat(f62745p, this.f62766Z);
            bundleD.putInt(at, this.f62772ak);
        }
        bundleD.putBoolean(f62749t, this.f62762V);
        bundleD.putBoolean(f62751v, this.f62838J);
        if (!TextUtils.isEmpty(this.bg)) {
            String string = bundleD.getString(CreativeInfo.f62443g);
            if (string != null) {
                bundleD.putString(CreativeInfo.f62443g, string + l.ac + this.bg);
            } else {
                bundleD.putString(CreativeInfo.f62443g, this.bg);
            }
        }
        if (!TextUtils.isEmpty(this.bh)) {
            bundleD.putString(CreativeInfo.f62442f, this.bh);
        }
        Logger.d(a_, "add impression log to bundle: ", this.bh);
        if (this.aG || this.bj) {
            bundleD.putBoolean(ar, this.ai);
            bundleD.putBoolean(f62729as, this.aj);
            if (this.aG && this.al != Long.MAX_VALUE) {
                bundleD.putLong(au, this.al);
            }
            if (this.am > 0.0f) {
                bundleD.putFloat(av, this.am);
            }
            bundleD.putString(f62730aw, this.an);
        }
        if (!this.bj && this.bk != null) {
            bundleD.putAll(this.bk.a());
            this.bk.a("RedirectCount=" + this.bl);
            if (!TextUtils.isEmpty(this.bk.f61734q)) {
                String string2 = bundleD.getString(CreativeInfo.f62443g);
                if (string2 != null) {
                    bundleD.putString(CreativeInfo.f62443g, string2 + l.ac + this.bk.f61734q);
                } else {
                    bundleD.putString(CreativeInfo.f62443g, this.bk.f61734q);
                }
            }
        }
        bundleD.putBoolean(ag, this.az);
        if (!TextUtils.isEmpty(this.aE)) {
            bundleD.putString("event_id", this.aE);
        }
        bundleD.putBoolean(aq, this.f62770aF);
        if (!TextUtils.isEmpty(this.f62771aT)) {
            bundleD.putString("revenue_event", this.f62771aT);
        }
        if (this.aV != null) {
            bundleD.putBoolean(aJ, this.aV.booleanValue());
        }
        if (this.ba != null) {
            bundleD.putBoolean(aS, this.ba.booleanValue());
        }
        if (this.aZ != null && !this.aZ.isEmpty()) {
            if (this.bk != null && !this.bk.f61727j && !this.bk.f61728k) {
                synchronized (this.aW) {
                    this.aW.addAll(this.aZ);
                }
                synchronized (this.aZ) {
                    this.aZ.clear();
                }
            } else {
                bundleD.putStringArrayList(aM, new ArrayList<>(this.aZ));
            }
            if (this.aW != null) {
                bundleD.putStringArrayList(aK, new ArrayList<>(this.aW));
            }
            if (this.aY != null) {
                if (this.bk == null) {
                    bundleD.putStringArrayList(aN, new ArrayList<>(this.aY));
                }
            }
            if (this.aX != null) {
                bundleD.putStringArrayList(f62725aL, new ArrayList<>(this.aX));
            }
            if (this.bb != null) {
                bundleD.putStringArrayList(f62726aO, new ArrayList<>(this.bb));
            }
            if (!TextUtils.isEmpty(this.bi)) {
            }
            Logger.d(a_, "add matching method to bundle: ", this.bi);
        } else {
            if (this.aW != null && !this.aW.isEmpty()) {
                bundleD.putStringArrayList(aK, new ArrayList<>(this.aW));
            }
            if (this.aY != null && !this.aY.isEmpty()) {
                if (this.bk == null && !this.bk.f61727j && !this.bk.f61728k) {
                    synchronized (this.aX) {
                        this.aX.addAll(this.aY);
                    }
                    synchronized (this.aY) {
                        this.aY.clear();
                    }
                } else {
                    bundleD.putStringArrayList(aN, new ArrayList<>(this.aY));
                }
            }
            if (this.aX != null && !this.aX.isEmpty()) {
                bundleD.putStringArrayList(f62725aL, new ArrayList<>(this.aX));
            }
            if (this.bb != null && !this.bb.isEmpty()) {
                bundleD.putStringArrayList(f62726aO, new ArrayList<>(this.bb));
            }
            if (!TextUtils.isEmpty(this.bi)) {
                bundleD.putString(aR, this.bi);
            }
            Logger.d(a_, "add matching method to bundle: ", this.bi);
        }
        return bundleD;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Set<String> e() {
        HashSet hashSet = new HashSet(ab);
        if (this.f62831C != null && this.f62831C.equals(YjqZUJsVmhcjko.ljQJHxuzLoETO)) {
            hashSet.add(f62724a);
        }
        return hashSet;
    }

    public static Set<String> f() {
        return be;
    }

    private static Map<String, Object> b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (bundle.size() == 0) {
            return new HashMap();
        }
        HashMap map = new HashMap(bundle.size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Bundle) {
                    map.put(str, b((Bundle) obj));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (!arrayList.isEmpty() && (arrayList.get(0) instanceof Bundle)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (obj2 instanceof Bundle) {
                                arrayList2.add(b((Bundle) obj2));
                            }
                        }
                        map.put(str, arrayList2);
                    } else {
                        map.put(str, arrayList);
                    }
                } else {
                    map.put(str, obj);
                }
            }
        }
        return map;
    }

    private static Bundle a(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putStringArrayList(str, (ArrayList) obj);
            }
        }
        return bundle;
    }

    private String b(String str) {
        String string;
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType called, input=", str);
        if (BrandSafetyUtils.f61444j.equals(str)) {
            string = AdFormatType.INTER.toString();
        } else if (BrandSafetyUtils.f61445k.equals(str)) {
            string = AdFormatType.REWARD.toString();
        } else if (BrandSafetyUtils.f61447m.equals(str) || BrandSafetyUtils.f61448n.equals(str)) {
            string = AdFormatType.BANNER.toString();
        } else if (BrandSafetyUtils.f61446l.equals(str)) {
            string = AdFormatType.APPOPEN.toString();
        } else if (BrandSafetyUtils.f61449o.equals(str)) {
            string = AdFormatType.MREC.toString();
        } else if (!"NATIVE".equals(str)) {
            string = null;
        } else {
            string = AdFormatType.NATIVE.toString();
        }
        Logger.d(a_, "getAdFormatTypeFromMaxAdFormType returned  ", string);
        return string;
    }

    public String g() {
        return this.f62771aT;
    }

    public void a(String str) {
        this.f62771aT = str;
    }

    public String h() {
        return this.f62763W;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public Bundle a(Bundle bundle) {
        boolean z2;
        boolean zRemoveAll;
        String string;
        try {
            String string2 = bundle.getString("ad_format_type");
            String string3 = bundle.getString("impression_id");
            String strC = null;
            String strB = n.b(bundle, ac);
            if (strB != null && !strB.isEmpty()) {
                strC = CreativeInfoManager.c(strB);
            }
            Logger.d(a_, Logger.FeatureTag.RESOURCES, "network name = ", strB, ", sdk package = ", strC, ", ad type = ", string2);
            if (strC != null && string2 != null) {
                HashSet hashSet = new HashSet();
                HashSet<String> hashSet2 = new HashSet<>();
                HashSet hashSet3 = new HashSet();
                HashSet<String> hashSetC = n.c(bundle, aK);
                if (hashSetC != null && !hashSetC.isEmpty()) {
                    hashSet2.addAll(hashSetC);
                }
                HashSet<String> hashSetC2 = n.c(bundle, aM);
                if (hashSetC2 != null && !hashSetC2.isEmpty()) {
                    hashSet3.addAll(hashSetC2);
                }
                HashSet<String> hashSetC3 = n.c(bundle, f62726aO);
                if (hashSetC3 == null) {
                    z2 = false;
                } else {
                    hashSetC3.remove("");
                    z2 = !hashSetC3.isEmpty();
                }
                HashSet<String> hashSetC4 = n.c(bundle, f62725aL);
                if (hashSetC4 != null && z2) {
                    zRemoveAll = hashSetC4.removeAll(hashSetC3);
                } else {
                    zRemoveAll = false;
                }
                HashSet<String> hashSetC5 = n.c(bundle, aN);
                boolean zP = SafeDK.getInstance().P();
                boolean zA = CreativeInfoManager.a(strC, AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, false);
                Logger.FeatureTag featureTag = Logger.FeatureTag.JS_RESOURCES;
                boolean z3 = zRemoveAll;
                Object[] objArr = new Object[6];
                objArr[0] = "prepare bundle for reporting, package: ";
                objArr[1] = strC;
                objArr[2] = ", supportMergingWebviewNetworkResources: ";
                String str = "YES";
                objArr[3] = zP ? "YES" : "NO";
                objArr[4] = ", supportDifferentAdsInCrossOriginIframes: ";
                if (!zA) {
                    str = "NO";
                }
                objArr[5] = str;
                Logger.d(a_, featureTag, objArr);
                boolean z4 = Objects.equals(string2, BrandSafetyUtils.f61444j) || Objects.equals(string2, bd);
                if (zP && (!z4 || !zA)) {
                    if (hashSetC4 != null && !hashSetC4.isEmpty()) {
                        hashSet2.addAll(hashSetC4);
                    }
                    if (hashSetC5 != null && !hashSetC5.isEmpty()) {
                        hashSet3.addAll(hashSetC5);
                    }
                }
                if (z4) {
                    hashSet2 = k.a(hashSet2, "text:");
                }
                if (!CreativeInfoManager.a(strC, AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, false)) {
                    hashSet2 = k.a(hashSet2, CreativeInfo.aU);
                }
                if (hashSet2 != null && !hashSet2.isEmpty()) {
                    hashSet.addAll(hashSet2);
                    bundle.putStringArrayList(f62727aP, new ArrayList<>(hashSet));
                }
                if (!hashSet3.isEmpty()) {
                    bundle.putStringArrayList(aQ, new ArrayList<>(hashSet3));
                }
                Logger.d(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, type: ", string2, ", package: ", strC, ", impression id: ", string3);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, webpage resources: ", hashSetC);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, network resources: ", hashSetC4);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final resources: ", hashSet);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.JS_RESOURCES, "prepare bundle for reporting, expanded webpage resources: ", hashSetC2);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.NW_RESOURCES, "prepare bundle for reporting, expanded network resources: ", hashSetC5);
                Logger.printFullVerboseLog(a_, Logger.FeatureTag.RESOURCES, "prepare bundle for reporting, final expanded resources: ", hashSet3);
                if (bundle.getString(CreativeInfo.f62443g) != null) {
                    string = bundle.getString(CreativeInfo.f62443g);
                } else {
                    string = "";
                }
                if (bundle.getBoolean(aJ)) {
                    string = string + "|co1";
                }
                if (bundle.getBoolean(aS)) {
                    string = string + "|hi1";
                }
                if (z2) {
                    String str2 = string + "|hr";
                    string = z3 ? str2 + "2" : str2 + "1";
                }
                bundle.putString(CreativeInfo.f62443g, string);
            }
            Set<String> setF = f();
            if (setF != null) {
                for (String str3 : setF) {
                    if (bundle.containsKey(str3)) {
                        bundle.remove(str3);
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d(a_, "caught exception: ", e2.getMessage(), " ", e2);
        }
        return bundle;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        jSONObjectI.put("slotNumber", this.f62752L);
        if (!TextUtils.isEmpty(this.f62753M)) {
            jSONObjectI.put(Constants.CLICK_URL, this.f62753M);
        }
        if (!TextUtils.isEmpty(this.f62754N)) {
            jSONObjectI.put("addedCreativeInfoKey", this.f62754N);
        }
        if (!TextUtils.isEmpty(this.f62756P)) {
            jSONObjectI.put("foregroundActivityName", this.f62756P);
        }
        if (!TextUtils.isEmpty(this.f62757Q)) {
            jSONObjectI.put("impressionId", this.f62757Q);
        }
        if (!TextUtils.isEmpty(this.bf)) {
            jSONObjectI.put("multiAdUuid", this.bf);
        }
        jSONObjectI.put("viewingTime", this.f62758R);
        if (!TextUtils.isEmpty(this.f62759S)) {
            jSONObjectI.put("maxAdUnitId", this.f62759S);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            jSONObjectI.put("maxNetworkName", this.aA);
        }
        if (!TextUtils.isEmpty(this.f62760T)) {
            jSONObjectI.put("applovinDataAdFormatType", this.f62760T);
        }
        if (!TextUtils.isEmpty(this.f62761U)) {
            jSONObjectI.put("applovinData3rdPartyPlacementId", this.f62761U);
        }
        if (!TextUtils.isEmpty(this.f62767aB)) {
            jSONObjectI.put("maxCreativeId", this.f62767aB);
        }
        if (!TextUtils.isEmpty(this.f62768aC)) {
            jSONObjectI.put("dspName", this.f62768aC);
        }
        if (!TextUtils.isEmpty(this.f62769aD)) {
            jSONObjectI.put("customJsNetworkName", this.f62769aD);
        }
        jSONObjectI.put("clicked", this.f62762V);
        if (!TextUtils.isEmpty(this.f62763W)) {
            jSONObjectI.put("screenShotHashValue", this.f62763W);
        }
        jSONObjectI.put("isAnimated", this.f62764X);
        jSONObjectI.put("imageFileSize", this.f62765Y);
        jSONObjectI.put("imageUniformity", this.f62766Z);
        if (!TextUtils.isEmpty(this.aE)) {
            jSONObjectI.put("eventId", this.aE);
        }
        if (!TextUtils.isEmpty(this.f62771aT)) {
            jSONObjectI.put("revenueEventValue", this.f62771aT);
        }
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation = this.aa;
        if (screenShotOrientation != null) {
            jSONObjectI.put("screenShotOrientation", screenShotOrientation.name());
        }
        jSONObjectI.put("didFailDisplayReceived", this.f62770aF);
        if (!TextUtils.isEmpty(this.bg)) {
            jSONObjectI.put("debugInfo", this.bg);
        }
        if (!TextUtils.isEmpty(this.bh)) {
            jSONObjectI.put("impressionLog", this.bh);
        }
        jSONObjectI.put("isBanner", this.aG);
        jSONObjectI.put("isNative", this.bj);
        jSONObjectI.put("willDisplayReceived", this.ai);
        jSONObjectI.put("isBannerViewDetected", this.aj);
        jSONObjectI.put("imageSlot", this.f62772ak);
        jSONObjectI.put("intervalBetweenDisplayMessages", this.al);
        jSONObjectI.put("detectedViewProportions", this.am);
        if (!TextUtils.isEmpty(this.an)) {
            jSONObjectI.put("deviceOrientation", this.an);
        }
        jSONObjectI.put("isScarAdMobAd", this.aH);
        RedirectData redirectData = this.bk;
        if (redirectData != null) {
            jSONObjectI.put("redirectData", redirectData.i());
        }
        jSONObjectI.put("redirectCount", this.bl);
        HashSet<String> hashSet = this.aU;
        if (hashSet != null) {
            jSONObjectI.put("dspUrlList", d.a(hashSet));
        }
        Boolean bool = this.aV;
        if (bool != null) {
            jSONObjectI.put("isCrossOriginIframeInWebpage", bool);
        }
        Boolean bool2 = this.ba;
        if (bool2 != null) {
            jSONObjectI.put("isHiddenIframeInWebpage", bool2);
        }
        HashSet<String> hashSet2 = this.aW;
        if (hashSet2 != null) {
            jSONObjectI.put("webPageResourceUrlList", d.a(hashSet2));
        }
        HashSet<String> hashSet3 = this.aX;
        if (hashSet3 != null) {
            jSONObjectI.put("networkResourceUrlList", d.a(hashSet3));
        }
        HashSet<String> hashSet4 = this.aY;
        if (hashSet4 != null) {
            jSONObjectI.put("expandedNetworkResourceUrlList", d.a(hashSet4));
        }
        HashSet<String> hashSet5 = this.aZ;
        if (hashSet5 != null) {
            jSONObjectI.put("expandedWebPageResourceUrlList", d.a(hashSet5));
        }
        HashSet<String> hashSet6 = this.bb;
        if (hashSet6 != null) {
            jSONObjectI.put("hiddenWebPageResourceUrlList", d.a(hashSet6));
        }
        if (!TextUtils.isEmpty(this.bi)) {
            jSONObjectI.put("matchingMethod", this.bi);
        }
        Bundle bundle = this.f62755O;
        if (bundle != null) {
            jSONObjectI.put("addedCreativeInfoValues", d.a(bundle));
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.f62752L = jSONObject.optInt("slotNumber", 0);
            this.f62753M = jSONObject.optString(Constants.CLICK_URL, "");
            this.f62754N = jSONObject.optString("addedCreativeInfoKey", "");
            this.f62756P = jSONObject.optString("foregroundActivityName", "");
            this.f62757Q = jSONObject.optString("impressionId", "");
            this.bf = jSONObject.optString("multiAdUuid", "");
            this.f62758R = jSONObject.optLong("viewingTime", 0L);
            this.f62759S = jSONObject.optString("maxAdUnitId", "");
            this.aA = jSONObject.optString("maxNetworkName", "");
            this.f62760T = jSONObject.optString("applovinDataAdFormatType", "");
            this.f62761U = jSONObject.optString("applovinData3rdPartyPlacementId", "");
            this.f62767aB = jSONObject.optString("maxCreativeId", "");
            this.f62768aC = jSONObject.optString("dspName", "");
            this.f62769aD = jSONObject.optString("customJsNetworkName", "");
            this.f62762V = jSONObject.optBoolean("clicked", false);
            this.f62763W = jSONObject.optString("screenShotHashValue", "");
            this.f62764X = jSONObject.optBoolean("isAnimated", false);
            this.f62765Y = jSONObject.optLong("imageFileSize", 0L);
            this.f62766Z = (float) jSONObject.optDouble("imageUniformity", 0.0d);
            this.aE = jSONObject.optString("eventId", "");
            this.f62771aT = jSONObject.optString("revenueEventValue", "");
            this.aa = BrandSafetyUtils.ScreenShotOrientation.valueOf(jSONObject.optString("screenShotOrientation", BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED.name()));
            this.f62770aF = jSONObject.optBoolean("didFailDisplayReceived", false);
            this.bg = jSONObject.optString("debugInfo", "");
            this.bh = jSONObject.optString("impressionLog", "");
            this.bi = jSONObject.optString("matchingMethod", "");
            this.aG = jSONObject.optBoolean("isBanner", false);
            this.bj = jSONObject.optBoolean("isNative", false);
            this.ai = jSONObject.optBoolean("willDisplayReceived", false);
            this.aj = jSONObject.optBoolean("isBannerViewDetected", false);
            this.f62772ak = jSONObject.optInt("imageSlot", 0);
            this.al = jSONObject.optLong("intervalBetweenDisplayMessages", 0L);
            this.am = (float) jSONObject.optDouble("detectedViewProportions", 0.0d);
            this.an = jSONObject.optString("deviceOrientation", "");
            this.aH = jSONObject.optBoolean("isScarAdMobAd", false);
            this.bl = jSONObject.optInt("redirectCount", 0);
            if (jSONObject.has("isCrossOriginIframeInWebpage") && !jSONObject.isNull("isCrossOriginIframeInWebpage")) {
                this.aV = Boolean.valueOf(jSONObject.optBoolean("isCrossOriginIframeInWebpage"));
            }
            if (jSONObject.has("isHiddenIframeInWebpage") && !jSONObject.isNull("isHiddenIframeInWebpage")) {
                this.ba = Boolean.valueOf(jSONObject.optBoolean("isHiddenIframeInWebpage"));
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dspUrlList");
            if (jSONArrayOptJSONArray != null) {
                this.aU = new HashSet<>(d.b(jSONArrayOptJSONArray));
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("webPageResourceUrlList");
            if (jSONArrayOptJSONArray2 != null) {
                this.aW = new HashSet<>(d.b(jSONArrayOptJSONArray2));
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("networkResourceUrlList");
            if (jSONArrayOptJSONArray3 != null) {
                this.aX = new HashSet<>(d.b(jSONArrayOptJSONArray3));
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("expandedNetworkResourceUrlList");
            if (jSONArrayOptJSONArray4 != null) {
                this.aY = new HashSet<>(d.b(jSONArrayOptJSONArray4));
            }
            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("expandedWebPageResourceUrlList");
            if (jSONArrayOptJSONArray5 != null) {
                this.aZ = new HashSet<>(d.b(jSONArrayOptJSONArray5));
            }
            JSONArray jSONArrayOptJSONArray6 = jSONObject.optJSONArray("hiddenWebageResourceUrlList");
            if (jSONArrayOptJSONArray6 != null) {
                this.bb = new HashSet<>(d.b(jSONArrayOptJSONArray6));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("redirectData");
            if (jSONObjectOptJSONObject != null) {
                RedirectData redirectData = new RedirectData();
                this.bk = redirectData;
                redirectData.a(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("addedCreativeInfoValues");
            if (jSONObjectOptJSONObject2 != null) {
                this.f62755O = a(d.b(jSONObjectOptJSONObject2));
            }
        }
    }
}
