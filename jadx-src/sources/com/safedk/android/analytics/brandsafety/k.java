package com.safedk.android.analytics.brandsafety;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62591b = "text:";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f62592z = "ImpressionInfo";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private CreativeInfo f62593A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private String f62594B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private List<String> f62595C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f62596a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j f62597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f62598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    RedirectData f62599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f62600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet<String> f62601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final l f62602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f62603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BrandSafetyUtils.AdType f62604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f62605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f62607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SimpleConcurrentHashSet<String> f62608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SimpleConcurrentHashSet<String> f62609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SimpleConcurrentHashSet<String> f62610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SimpleConcurrentHashSet<String> f62611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SimpleConcurrentHashSet<String> f62612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f62613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f62615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f62617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f62618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f62619y;

    public boolean a() {
        return this.f62619y;
    }

    public void a(boolean z2) {
        this.f62619y = z2;
        Logger.d(f62592z, "setIsClicked invoked, clicked : ", Boolean.valueOf(z2));
    }

    public String b() {
        return this.f62594B;
    }

    public boolean c() {
        CreativeInfo creativeInfo = this.f62593A;
        return creativeInfo != null && creativeInfo.w();
    }

    public boolean d() {
        CreativeInfo creativeInfo = this.f62593A;
        return creativeInfo != null && creativeInfo.x();
    }

    public void a(String str) {
        this.f62594B = str;
        if (str != null && !this.f62595C.contains(str)) {
            this.f62595C.add(str);
        }
    }

    public List<String> e() {
        return this.f62595C;
    }

    public k(String str, String str2) {
        this(str, null, null, null);
        this.f62594B = str2;
    }

    public k(String str, j jVar, String str2, BrandSafetyUtils.AdType adType) {
        this.f62598d = null;
        this.f62600f = 0;
        this.f62601g = new HashSet<>();
        this.f62602h = new l();
        this.f62603i = null;
        this.f62604j = null;
        this.f62605k = false;
        this.f62606l = false;
        this.f62607m = false;
        this.f62608n = new SimpleConcurrentHashSet<>();
        this.f62609o = new SimpleConcurrentHashSet<>();
        this.f62610p = new SimpleConcurrentHashSet<>();
        this.f62611q = new SimpleConcurrentHashSet<>();
        this.f62612r = new SimpleConcurrentHashSet<>();
        this.f62613s = false;
        this.f62614t = false;
        this.f62615u = false;
        this.f62616v = false;
        this.f62617w = 0;
        this.f62618x = null;
        this.f62619y = false;
        this.f62595C = new ArrayList();
        this.f62596a = str == null ? UUID.randomUUID().toString() : str;
        this.f62597c = jVar;
        this.f62593A = null;
        this.f62603i = str2;
        this.f62604j = adType;
    }

    public k(RedirectData redirectData) {
        this(null, null, null, null);
        this.f62599e = redirectData;
    }

    public boolean f() {
        RedirectData redirectData = this.f62599e;
        return redirectData != null && redirectData.f61726i;
    }

    public boolean g() {
        RedirectData redirectData = this.f62599e;
        return redirectData != null && redirectData.f61727j;
    }

    public boolean h() {
        RedirectData redirectData = this.f62599e;
        return redirectData != null && redirectData.f61728k;
    }

    public void a(RedirectData redirectData) {
        this.f62599e = redirectData;
        this.f62600f++;
        if ((redirectData.f61727j || redirectData.f61728k) && this.f62593A != null) {
            m();
        }
    }

    public void i() {
        j jVar;
        CreativeInfo creativeInfo = this.f62593A;
        if (creativeInfo == null) {
            return;
        }
        boolean zA = CreativeInfoManager.a(creativeInfo.S(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        if (this.f62593A.an() && (jVar = this.f62597c) != null && !zA) {
            Logger.d(f62592z, "removing image taken for multi-ad ", jVar.f62585b);
            BrandSafetyUtils.d(this.f62597c.f62585b);
            this.f62597c = null;
        }
    }

    public void a(CreativeInfo creativeInfo) {
        j jVar;
        if (this.f62593A == null && creativeInfo != null) {
            a(l.f62658m, new l.a[0]);
        }
        this.f62593A = creativeInfo;
        if (creativeInfo != null) {
            creativeInfo.q().addAll(this.f62601g);
            this.f62601g = new HashSet<>();
            i();
            if (creativeInfo.aq() && (jVar = this.f62597c) != null) {
                Logger.d(f62592z, "set creative info, removing image taken for website endcard: ", jVar.f62585b);
                BrandSafetyUtils.d(this.f62597c.f62585b);
                this.f62597c = null;
            }
        }
    }

    public CreativeInfo j() {
        return this.f62593A;
    }

    public String k() {
        return this.f62596a;
    }

    public void l() {
        this.f62597c = null;
    }

    public void a(String str, l.a... aVarArr) {
        this.f62602h.a(str, aVarArr);
    }

    public void b(String str, l.a... aVarArr) {
        this.f62602h.b(str, aVarArr);
    }

    public void m() {
        Logger.d(f62592z, Logger.FeatureTag.NW_RESOURCES, "start collecting expand resources...");
        this.f62616v = true;
    }

    public void b(String str) {
        String strD;
        if (str.startsWith("text:")) {
            strD = str;
        } else {
            strD = d(str);
        }
        if (!TextUtils.isEmpty(strD)) {
            CreativeInfo creativeInfo = this.f62593A;
            if (creativeInfo != null && creativeInfo.c(strD)) {
                Logger.d(f62592z, Logger.FeatureTag.NW_RESOURCES, "add resource url: avoid adding a recommendation resource: ", strD);
                this.f62593A.d();
                return;
            }
            CreativeInfo creativeInfo2 = this.f62593A;
            if (creativeInfo2 != null && creativeInfo2.d(strD)) {
                Logger.d(f62592z, Logger.FeatureTag.NW_RESOURCES, "add resource url: Url is in the WebView urls exclusion list, will not be added : ", strD);
                return;
            }
            if (this.f62616v) {
                if (!str.startsWith("text:")) {
                    synchronized (this.f62611q) {
                        this.f62611q.a(strD);
                    }
                    Logger.d(f62592z, Logger.FeatureTag.NW_RESOURCES, "Resource was added successfully to impression expanded list, resource: ", strD);
                    return;
                }
                return;
            }
            synchronized (this.f62609o) {
                this.f62609o.a(strD);
            }
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f62601g.add(str);
        }
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? str : com.safedk.android.utils.k.g(com.safedk.android.utils.n.z(str));
    }

    public String toString() {
        return "Impression: id=" + this.f62596a + ", image is: " + this.f62597c + ", CI is: " + this.f62593A;
    }
}
