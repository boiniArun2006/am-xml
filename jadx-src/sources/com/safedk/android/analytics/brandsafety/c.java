package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected static final String f61795S = "network_name";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61796a = "AdInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61797b = "image_hash";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61798c = "sdk_package";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f61799d = "sdk_uid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61800e = "type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61801f = "ad_format_type";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f61802g = "response_code";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f61803h = "image_url";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f61804i = "image_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f61805j = "image_orientation";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f61806k = "text";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f61807l = "safedk_version";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Bundle f61808A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    String f61809B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    String f61810C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    String f61811D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f61812E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f61813F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f61814G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f61815H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f61816I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    AdNetworkDiscovery.WebViewResourceMatchingMethod f61817J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    String f61818K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    String f61819L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    String f61820M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f61821N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f61822O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    String f61823P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    String f61824Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    final l f61825R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f61826T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f61827U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected boolean f61828V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final List<k> f61829W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f61830X;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected List<String> f61831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected List<String> f61832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f61833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BrandSafetyUtils.AdType f61834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f61835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f61836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    String f61837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f61838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    BrandSafetyUtils.ScreenShotOrientation f61839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    String f61840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f61841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f61842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f61843y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f61844z;

    public c(String[] strArr, int i2, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        if (strArr != null) {
            this.f61810C = strArr[0];
            this.f61809B = strArr[1];
        }
        this.f61808A = bundle;
        this.f61844z = i2;
    }

    public c(int i2, Bundle bundle, String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, BrandSafetyUtils.AdType adType) {
        this(str, str2, str3, screenShotOrientation, null, adType);
        this.f61808A = bundle;
        this.f61844z = i2;
    }

    public c(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, BrandSafetyUtils.AdType adType) {
        this.f61831m = null;
        this.f61832n = null;
        this.f61833o = 0L;
        this.f61839u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f61841w = false;
        this.f61842x = null;
        this.f61843y = 0;
        this.f61809B = null;
        this.f61810C = null;
        this.f61829W = new ArrayList();
        this.f61811D = null;
        this.f61812E = false;
        this.f61813F = false;
        this.f61814G = false;
        this.f61815H = false;
        this.f61816I = false;
        this.f61817J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.f61819L = null;
        this.f61820M = null;
        this.f61821N = false;
        this.f61822O = false;
        this.f61823P = null;
        this.f61824Q = null;
        this.f61825R = new l();
        this.f61827U = false;
        this.f61830X = 0;
        this.f61828V = false;
        Object[] objArr = new Object[8];
        objArr[0] = "AdInfo ctor started, hashValue = ";
        objArr[1] = str;
        objArr[2] = ", fileName = ";
        objArr[3] = str4;
        objArr[4] = ", maxSdk = ";
        objArr[5] = str2;
        objArr[6] = ", adType = ";
        objArr[7] = adType != null ? adType.name() : "";
        Logger.d(f61796a, objArr);
        this.f61840v = str2;
        this.f61836r = System.currentTimeMillis();
        this.f61834p = adType;
        j jVar = new j(str, str4, screenShotOrientation);
        synchronized (this.f61829W) {
            this.f61829W.add(new k(str3, jVar, str2, adType));
        }
        if (str2 != null) {
            this.f61817J = CreativeInfoManager.b(str2);
        }
    }

    public c(String str, long j2, BrandSafetyUtils.AdType adType) {
        this.f61831m = null;
        this.f61832n = null;
        this.f61833o = 0L;
        this.f61839u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f61841w = false;
        this.f61842x = null;
        this.f61843y = 0;
        this.f61809B = null;
        this.f61810C = null;
        this.f61829W = new ArrayList();
        this.f61811D = null;
        this.f61812E = false;
        this.f61813F = false;
        this.f61814G = false;
        this.f61815H = false;
        this.f61816I = false;
        this.f61817J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.f61819L = null;
        this.f61820M = null;
        this.f61821N = false;
        this.f61822O = false;
        this.f61823P = null;
        this.f61824Q = null;
        this.f61825R = new l();
        this.f61827U = false;
        this.f61830X = 0;
        this.f61828V = false;
        Object[] objArr = new Object[6];
        objArr[0] = "AdInfo ctor started, maxSdk = ";
        objArr[1] = str;
        objArr[2] = ", timestamp = ";
        objArr[3] = Long.valueOf(this.f61836r);
        objArr[4] = ", adType = ";
        objArr[5] = adType != null ? adType.name() : "";
        Logger.d(f61796a, objArr);
        this.f61840v = str;
        this.f61836r = j2;
        this.f61834p = adType;
    }

    public long a() {
        return this.f61836r;
    }

    public String b() {
        return this.f61838t;
    }

    public void a(String str) {
        this.f61838t = str;
    }

    public String c() {
        return this.f61840v;
    }

    public void b(String str) {
        this.f61840v = str;
    }

    public boolean d() {
        return this.f61841w;
    }

    public void a(boolean z2) {
        this.f61841w = z2;
    }

    public String e() {
        return this.f61842x;
    }

    protected boolean c(String str) {
        k kVarI = i();
        if (this.f61842x == null && kVarI != null) {
            if (kVarI.j() == null || (TextUtils.isEmpty(kVarI.j().O()) && !kVarI.j().an())) {
                this.f61842x = str;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        return this.f61811D != null;
    }

    public void b(boolean z2) {
        this.f61822O = z2;
    }

    public void a(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            if (CreativeInfoManager.a(this.f61840v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                if (this.f61811D != null && !creativeInfo.an()) {
                    creativeInfo.ao();
                    String strH = creativeInfo.h();
                    if (strH != null) {
                        creativeInfo.e(strH + CreativeInfo.aK);
                    }
                }
            } else if (creativeInfo.an()) {
                if (this.f61811D == null) {
                    String string = UUID.randomUUID().toString();
                    this.f61811D = string;
                    Logger.d(f61796a, "set CI, generate multi ad UUID: ", string);
                } else {
                    k kVarI = i();
                    if (kVarI != null && kVarI.j() != null) {
                        k kVar = new k(UUID.randomUUID().toString(), kVarI.b());
                        kVar.f62602h.a(kVarI.f62602h);
                        kVar.f62609o.a(kVarI.f62609o.keySet());
                        kVar.f62611q.a(kVarI.f62611q.keySet());
                        kVar.f62608n.a(kVarI.f62608n.keySet());
                        kVar.f62610p.a(kVarI.f62610p.keySet());
                        kVar.f62612r.a(kVarI.f62612r.keySet());
                        synchronized (this.f61829W) {
                            this.f61829W.add(kVar);
                        }
                        Logger.d(f61796a, "set CI, create new impression for multi ad, impression list: ", this.f61829W);
                    }
                }
            }
            k kVarI2 = i();
            Logger.d(f61796a, "set CI, impression: ", kVarI2);
            if (kVarI2 != null) {
                if (!creativeInfo.an() && kVarI2.j() != null && kVarI2.j().N() != null && !kVarI2.j().N().equals(creativeInfo.N())) {
                    Logger.d(f61796a, "set CI, failed to set CI due to unmatched IDs: old: ", creativeInfo.N(), ", new: ", kVarI2.j().N());
                    return;
                }
                if (kVarI2.g() || kVarI2.h()) {
                    kVarI2.m();
                }
                kVarI2.a(creativeInfo);
            }
            Logger.d(f61796a, "set CI, number of CIs: ", Integer.valueOf(k().size()), ", impression IDs: ", H(), ", multi ad UUID: ", this.f61811D);
        }
    }

    public List<k> g() {
        return this.f61829W;
    }

    public List<k> h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f61829W) {
            for (k kVar : this.f61829W) {
                if (kVar.j() != null && this.f61831m != null && this.f61831m.contains(kVar.j().ak())) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    public k i() {
        if (this.f61831m != null && this.f61811D == null) {
            synchronized (this.f61829W) {
                for (k kVar : this.f61829W) {
                    if (kVar.j() != null && this.f61831m.contains(kVar.j().ak())) {
                        return kVar;
                    }
                }
            }
        }
        if (!this.f61829W.isEmpty()) {
            List<k> list = this.f61829W;
            return list.get(list.size() - 1);
        }
        Logger.d(f61796a, "Failed to get active impression, view hierarchy: ", this.f61831m, ", impression IDs: ", H());
        return null;
    }

    public CreativeInfo j() {
        k kVarI = i();
        if (kVarI != null) {
            return kVarI.j();
        }
        return null;
    }

    public List<CreativeInfo> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f61829W) {
            for (k kVar : this.f61829W) {
                if (kVar.j() != null) {
                    arrayList.add(kVar.j());
                }
            }
        }
        return arrayList;
    }

    public List<CreativeInfo> l() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f61829W) {
            for (k kVar : this.f61829W) {
                boolean z2 = false;
                AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(c());
                if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.b() == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO) {
                    z2 = true;
                }
                if (kVar.j() != null && this.f61831m != null && (z2 || this.f61831m.contains(kVar.j().ak()))) {
                    arrayList.add(kVar.j());
                }
            }
        }
        return arrayList;
    }

    public j m() {
        k kVarI = i();
        if (kVarI != null) {
            return kVarI.f62597c;
        }
        return null;
    }

    public String n() {
        k kVarI = i();
        if (kVarI != null) {
            return kVarI.f62596a;
        }
        return "";
    }

    private List<String> H() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f61829W) {
            Iterator<k> it = this.f61829W.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f62596a);
            }
        }
        return arrayList;
    }

    public String o() {
        return this.f61809B;
    }

    public String p() {
        return this.f61810C;
    }

    public void a(String[] strArr) {
        this.f61810C = strArr[0];
        this.f61809B = strArr[1];
    }

    public int q() {
        return this.f61844z;
    }

    public Bundle r() {
        return this.f61808A;
    }

    public int s() {
        return this.f61843y;
    }

    public void c(boolean z2) {
        this.f61812E = z2;
    }

    public void d(boolean z2) {
        this.f61813F = z2;
    }

    public void e(boolean z2) {
        this.f61814G = z2;
    }

    public String t() {
        return this.f61835q;
    }

    public void u() {
        k kVarI = i();
        if (kVarI != null && kVarI.j() != null) {
            List<String> listAb = kVarI.j().ab();
            if (listAb != null && !listAb.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = listAb.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append("\n");
                }
                this.f61835q = sb.toString();
                return;
            }
            return;
        }
        Logger.d(f61796a, "Cannot extract text as Creative info object is null");
    }

    public long v() {
        return this.f61833o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" maxAdSdk: ");
        String str = this.f61840v;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(" impression IDs: ");
        sb.append(H());
        sb.append(" clickUrl: ");
        String str2 = this.f61842x;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(" viewAddress: ");
        String str3 = this.f61818K;
        sb.append(str3 != null ? str3 : "");
        return sb.toString();
    }

    public String w() {
        return this.f61819L;
    }

    public List<String> x() {
        return this.f61831m;
    }

    public void a(List<String> list) {
        this.f61831m = list;
    }

    public void b(List<WeakReference<WebView>> list) {
        StringBuilder sb = new StringBuilder("setViewsAddresses added [");
        this.f61832n = new ArrayList();
        synchronized (list) {
            for (WeakReference<WebView> weakReference : list) {
                if (weakReference != null && weakReference.get() != null) {
                    String strA = BrandSafetyUtils.a((Object) weakReference.get());
                    this.f61832n.add(strA);
                    sb.append(strA + " ");
                }
            }
            sb.append("]");
            Logger.d(f61796a, sb.toString());
        }
    }

    public String y() {
        Bundle bundle = this.f61808A;
        if (bundle != null && bundle.containsKey(BrandSafetyEvent.f62740k) && !TextUtils.isEmpty(this.f61808A.getString(BrandSafetyEvent.f62740k))) {
            return this.f61808A.getString(BrandSafetyEvent.f62740k);
        }
        return null;
    }

    public String z() {
        Bundle bundle = this.f61808A;
        if (bundle != null && bundle.containsKey("creative_id") && !TextUtils.isEmpty(this.f61808A.getString("creative_id"))) {
            return this.f61808A.getString("creative_id");
        }
        return null;
    }

    public String A() {
        Bundle bundle = this.f61808A;
        if (bundle != null && bundle.containsKey("network_name") && !TextUtils.isEmpty(this.f61808A.getString("network_name"))) {
            return this.f61808A.getString("network_name");
        }
        return null;
    }

    public String B() {
        return this.f61824Q;
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f61824Q;
            if (str2 == null) {
                this.f61824Q = str;
                return;
            }
            if (!str2.contains(str)) {
                this.f61824Q += l.ac + str;
            }
        }
    }

    public void a(String str, l.a... aVarArr) {
        this.f61825R.a(str, aVarArr);
    }

    public void a(Long l2, Long l5, String str, l.a... aVarArr) {
        this.f61825R.a(l2, l5, str, aVarArr);
    }

    public void b(String str, l.a... aVarArr) {
        this.f61825R.b(str, aVarArr);
    }

    public void a(l lVar) {
        this.f61825R.a(lVar);
    }

    public void f(boolean z2) {
        this.f61829W.clear();
        this.f61831m = null;
        this.f61833o = 0L;
        this.f61835q = null;
        this.f61836r = System.currentTimeMillis();
        this.f61837s = null;
        this.f61838t = null;
        this.f61839u = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f61840v = null;
        this.f61841w = false;
        this.f61842x = null;
        this.f61843y = 0;
        this.f61809B = null;
        this.f61810C = null;
        this.f61811D = null;
        this.f61812E = false;
        this.f61813F = false;
        this.f61814G = false;
        i().f62605k = false;
        this.f61816I = false;
        this.f61817J = AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
        this.f61821N = false;
        this.f61822O = false;
        if (z2) {
            this.f61823P = null;
        }
        this.f61824Q = null;
    }

    public void C() {
        this.f61819L = null;
        this.f61818K = null;
        if (i() != null && i().b() != null) {
            i().a((String) null);
        }
        this.f61808A = null;
        this.f61844z = 0;
        this.f61809B = null;
        this.f61810C = null;
    }

    public void D() {
        f(true);
        C();
    }

    public void a(d dVar, Bundle bundle, int i2) {
        this.f61819L = dVar.f62521c;
        this.f61818K = dVar.f62525g;
        if (i() != null) {
            i().a(dVar.f62525g);
        }
        this.f61808A = bundle;
        this.f61844z = i2;
    }

    int E() {
        return this.f61830X;
    }

    void F() {
        this.f61830X++;
    }

    void G() {
        this.f61830X = 0;
    }
}
