package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C1809u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f50545e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f50546f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f50547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f50549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdType f50550d;

    public static C1809u a(String str) {
        return a(null, null, str);
    }

    public static C1809u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static C1809u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static C1809u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static C1809u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static C1809u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static C1809u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static C1809u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static C1809u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static C1809u m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public String e() {
        return this.f50548b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1809u.class != obj.getClass()) {
            return false;
        }
        return this.f50548b.equalsIgnoreCase(((C1809u) obj).f50548b);
    }

    public AppLovinAdSize f() {
        if (this.f50549c == null && JsonUtils.valueExists(this.f50547a, "ad_size")) {
            this.f50549c = AppLovinAdSize.fromString(JsonUtils.getString(this.f50547a, "ad_size", null));
        }
        return this.f50549c;
    }

    public AppLovinAdType g() {
        if (this.f50550d == null && JsonUtils.valueExists(this.f50547a, "ad_type")) {
            this.f50550d = AppLovinAdType.fromString(JsonUtils.getString(this.f50547a, "ad_type", null));
        }
        return this.f50550d;
    }

    public int hashCode() {
        return this.f50548b.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f50548b + ", zoneObject=" + this.f50547a + '}';
    }

    private C1809u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z2, boolean z3) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f50549c = appLovinAdSize;
        this.f50550d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        if (z2) {
            lowerCase = lowerCase + "_bidding";
        }
        if (z3) {
            lowerCase = lowerCase + "_direct_sold";
        }
        this.f50548b = lowerCase;
    }

    public static C1809u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF == AppLovinAdSize.INTERSTITIAL) {
            if (g() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (g() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (g() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            return null;
        }
        if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        }
        return null;
    }

    public boolean i() {
        return a().contains(this);
    }

    public static C1809u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z2, boolean z3) {
        C1809u c1809u = new C1809u(appLovinAdSize, appLovinAdType, str, z2, z3);
        synchronized (f50546f) {
            try {
                String str2 = c1809u.f50548b;
                Map map = f50545e;
                if (map.containsKey(str2)) {
                    c1809u = (C1809u) map.get(str2);
                } else {
                    map.put(str2, c1809u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1809u;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f50546f) {
                try {
                    C1809u c1809u = (C1809u) f50545e.get(JsonUtils.getString(jSONObject, "zone_id", ""));
                    if (c1809u != null) {
                        c1809u.f50549c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        c1809u.f50550d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
