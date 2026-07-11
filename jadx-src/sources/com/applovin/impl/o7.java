package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class o7 extends com.applovin.impl.sdk.ad.b implements q4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f49593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f49594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final x7 f49595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f49596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b8 f49597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r7 f49598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f49599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final q7 f49600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l4 f49601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Set f49602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f49603x;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f49604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f49605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C1802k f49606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f49607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f49608e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f49609f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x7 f49610g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b8 f49611h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private r7 f49612i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private q7 f49613j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Set f49614k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Set f49615l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f49605b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.f49608e = str;
            return this;
        }

        public b b(Set set) {
            this.f49614k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f49604a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(C1802k c1802k) {
            if (c1802k != null) {
                this.f49606c = c1802k;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f49609f = str;
            return this;
        }

        public b a(x7 x7Var) {
            this.f49610g = x7Var;
            return this;
        }

        public b a(b8 b8Var) {
            this.f49611h = b8Var;
            return this;
        }

        public b a(r7 r7Var) {
            this.f49612i = r7Var;
            return this;
        }

        public b a(q7 q7Var) {
            this.f49613j = q7Var;
            return this;
        }

        public b a(Set set) {
            this.f49615l = set;
            return this;
        }

        public b a(long j2) {
            this.f49607d = j2;
            return this;
        }

        public o7 a() {
            return new o7(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum c {
        COMPANION_AD,
        VIDEO
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void E0() {
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7) || !super.equals(obj)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        String str = this.f49593n;
        if (str == null ? o7Var.f49593n != null : !str.equals(o7Var.f49593n)) {
            return false;
        }
        String str2 = this.f49594o;
        if (str2 == null ? o7Var.f49594o != null : !str2.equals(o7Var.f49594o)) {
            return false;
        }
        x7 x7Var = this.f49595p;
        if (x7Var == null ? o7Var.f49595p != null : !x7Var.equals(o7Var.f49595p)) {
            return false;
        }
        b8 b8Var = this.f49597r;
        if (b8Var == null ? o7Var.f49597r != null : !b8Var.equals(o7Var.f49597r)) {
            return false;
        }
        r7 r7Var = this.f49598s;
        if (r7Var == null ? o7Var.f49598s != null : !r7Var.equals(o7Var.f49598s)) {
            return false;
        }
        q7 q7Var = this.f49600u;
        if (q7Var == null ? o7Var.f49600u != null : !q7Var.equals(o7Var.f49600u)) {
            return false;
        }
        Set set = this.f49602w;
        if (set == null ? o7Var.f49602w != null : !set.equals(o7Var.f49602w)) {
            return false;
        }
        Set set2 = this.f49603x;
        Set set3 = o7Var.f49603x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    private o7(b bVar) {
        super(bVar.f49604a, bVar.f49605b, bVar.f49606c);
        this.f49593n = bVar.f49608e;
        this.f49595p = bVar.f49610g;
        this.f49594o = bVar.f49609f;
        this.f49597r = bVar.f49611h;
        this.f49598s = bVar.f49612i;
        this.f49600u = bVar.f49613j;
        this.f49602w = bVar.f49614k;
        this.f49603x = bVar.f49615l;
        this.f49601v = new l4(this);
        Uri uriL0 = l0();
        if (uriL0 != null) {
            this.f49599t = uriL0.toString();
        } else {
            this.f49599t = "";
        }
        this.f49596q = bVar.f49607d;
    }

    private Set h1() {
        r7 r7Var = this.f49598s;
        return r7Var != null ? r7Var.b() : Collections.EMPTY_SET;
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set o1() {
        b8 b8Var = this.f49597r;
        return b8Var != null ? b8Var.b() : Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List s(h5 h5Var) {
        return n7.a(h5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List A() {
        List listA;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.ys8
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return this.f50933n.s((h5) obj);
                }
            });
        }
        synchronized (this.adObjectLock) {
            listA = n7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
        }
        return listA;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.f49599t;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (C1804o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.f49602w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.f49603x;
        }
        this.sdk.O();
        if (C1804o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.EMPTY_SET;
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public q7 e1() {
        return this.f49600u;
    }

    public Uri f1() {
        b8 b8Var = this.f49597r;
        if (b8Var != null) {
            return b8Var.c();
        }
        return null;
    }

    public r7 g1() {
        return this.f49598s;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public l4 getAdEventTracker() {
        return this.f49601v;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f49596q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List listG;
        b8 b8Var = this.f49597r;
        return (b8Var == null || (listG = b8Var.g()) == null || listG.size() <= 0) ? false : true;
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f49600u != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    public u7 l1() {
        b8 b8Var = this.f49597r;
        if (b8Var != null) {
            return b8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public x7 n1() {
        return this.f49595p;
    }

    public b8 p1() {
        return this.f49597r;
    }

    public c8 q1() {
        Long lF = r0.f(this.sdk);
        return this.f49597r.a(lF != null ? lF.longValue() : 0L);
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f49593n + "', adDescription='" + this.f49594o + "', systemInfo=" + this.f49595p + ", videoCreative=" + this.f49597r + ", companionAd=" + this.f49598s + ", adVerifications=" + this.f49600u + ", impressionTrackers=" + this.f49602w + ", errorTrackers=" + this.f49603x + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri c0() {
        return f1();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8 = super.hashCode() * 31;
        String str = this.f49593n;
        int iHashCode9 = 0;
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = (iHashCode8 + iHashCode) * 31;
        String str2 = this.f49594o;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i3 = (i2 + iHashCode2) * 31;
        x7 x7Var = this.f49595p;
        if (x7Var != null) {
            iHashCode3 = x7Var.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i5 = (i3 + iHashCode3) * 31;
        b8 b8Var = this.f49597r;
        if (b8Var != null) {
            iHashCode4 = b8Var.hashCode();
        } else {
            iHashCode4 = 0;
        }
        int i7 = (i5 + iHashCode4) * 31;
        r7 r7Var = this.f49598s;
        if (r7Var != null) {
            iHashCode5 = r7Var.hashCode();
        } else {
            iHashCode5 = 0;
        }
        int i8 = (i7 + iHashCode5) * 31;
        q7 q7Var = this.f49600u;
        if (q7Var != null) {
            iHashCode6 = q7Var.hashCode();
        } else {
            iHashCode6 = 0;
        }
        int i9 = (i8 + iHashCode6) * 31;
        Set set = this.f49602w;
        if (set != null) {
            iHashCode7 = set.hashCode();
        } else {
            iHashCode7 = 0;
        }
        int i10 = (i9 + iHashCode7) * 31;
        Set set2 = this.f49603x;
        if (set2 != null) {
            iHashCode9 = set2.hashCode();
        }
        return i10 + iHashCode9;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri l0() {
        c8 c8VarQ1 = q1();
        if (c8VarQ1 != null) {
            return c8VarQ1.e();
        }
        return null;
    }

    public boolean r1() {
        if (l1() != null) {
            return true;
        }
        return false;
    }

    private Set a(c cVar, String[] strArr) {
        Map mapD;
        r7 r7Var;
        b8 b8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (b8Var = this.f49597r) != null) {
                mapD = b8Var.e();
            } else {
                mapD = (cVar != c.COMPANION_AD || (r7Var = this.f49598s) == null) ? null : r7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (mapD != null && !mapD.isEmpty()) {
                for (String str : strArr) {
                    if (mapD.containsKey(str)) {
                        hashSet.addAll((Collection) mapD.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.EMPTY_SET;
    }

    public static o7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.f49605b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.safedk.android.analytics.brandsafety.l.f62638S, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.f49604a = jSONObject3;
        bVar.f49606c = c1802k;
        bVar.f49607d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.f49608e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f49609f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.f49610g = x7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), c1802k);
        bVar.f49611h = b8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), c1802k);
        bVar.f49612i = r7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), c1802k);
        bVar.f49613j = q7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), c1802k);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), c1802k);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        bVar.f49614k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null), c1802k);
            if (y7VarA2 != null) {
                hashSet2.add(y7VarA2);
            }
        }
        bVar.f49615l = hashSet2;
        o7 o7Var = new o7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, YjqZUJsVmhcjko.DcfhUM, new JSONObject());
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                o7Var.a(next, string);
            }
        }
        return o7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.f49596q);
        JsonUtils.putString(jSONObject, "title", this.f49593n);
        JsonUtils.putString(jSONObject, "ad_description", this.f49594o);
        x7 x7Var = this.f49595p;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", x7Var.a());
        }
        b8 b8Var = this.f49597r;
        if (b8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", b8Var.a());
        }
        r7 r7Var = this.f49598s;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", r7Var.a());
        }
        q7 q7Var = this.f49600u;
        if (q7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", q7Var.a());
        }
        if (this.f49602w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f49602w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.f49603x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f49603x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", h5Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
