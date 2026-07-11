package com.applovin.impl;

import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class r5 extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final C1809u f49880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f49881h;

    class a extends l6 {
        a(com.applovin.impl.sdk.network.a aVar, C1802k c1802k) {
            super(aVar, c1802k);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (i2 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f48903l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f48903l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i2), map);
                CollectionUtils.putStringIfValid("ad_zone_id", r5.this.f49880g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f48903l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f48903l.b()), map);
                this.f48733a.g().d(d2.f48302y, map);
                r5.this.b(jSONObject);
                return;
            }
            r5.this.a(i2, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            r5.this.a(i2, str2);
            this.f48733a.D().a("fetchAd", str, i2, str2);
        }
    }

    protected abstract AbstractRunnableC1782i5 a(JSONObject jSONObject);

    protected void a(int i2, String str) {
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Unable to fetch " + this.f49880g + " ad: server returned " + i2);
        }
        this.f48733a.g().a(d2.f48303z, this.f49880g, new AppLovinError(i2, str));
    }

    protected abstract String e();

    protected abstract String f();

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f49880g.e());
        if (this.f49880g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f49880g.f().getLabel());
        }
        if (this.f49880g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f49880g.g().getLabel());
        }
        return map;
    }

    protected void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f48733a);
        r0.b(jSONObject, this.f48733a);
        r0.a(jSONObject, this.f48733a);
        C1809u.a(jSONObject);
        this.f48733a.q0().a(a(jSONObject));
    }

    protected Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f49880g.e());
        if (this.f49880g.f() != null) {
            map.put("size", this.f49880g.f().getLabel());
        }
        if (this.f49880g.g() != null) {
            map.put("require", this.f49880g.g().getLabel());
        }
        return map;
    }

    public r5(C1809u c1809u, String str, C1802k c1802k) {
        super(str, c1802k);
        this.f49880g = c1809u;
        this.f49881h = c1802k.b();
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC1810u4.a aVarA;
        Map map;
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Fetching next ad of zone: " + this.f49880g);
        }
        if (((Boolean) this.f48733a.a(x4.T3)).booleanValue() && n7.k() && C1804o.a()) {
            this.f48735c.a(this.f48734b, "User is connected to a VPN");
        }
        n7.a(this.f48733a, this.f48734b);
        this.f48733a.g().a(d2.f48300x, this.f49880g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f48733a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f48733a.a(x4.h3)).booleanValue()) {
                aVarA = AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f48733a.A().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f48733a.a(x4.f50757D5)).booleanValue() && !((Boolean) this.f48733a.a(x4.z5)).booleanValue()) {
                    map.put(com.safedk.android.analytics.brandsafety.l.f62669x, UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f48733a.a(x4.k5)).booleanValue()) {
                    map.put("sdk_key", this.f48733a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                AbstractC1810u4.a aVarA2 = AbstractC1810u4.a.a(((Integer) this.f48733a.a(x4.t5)).intValue());
                Map mapA = n7.a(this.f48733a.A().a(h(), false, false));
                if (!((Boolean) this.f48733a.a(x4.M6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (n7.h(a()) || n7.j(a())) {
                map.putAll(this.f48733a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f49881h)) {
                map.put("sts", this.f49881h);
            }
            a.C0712a c0712aF = com.applovin.impl.sdk.network.a.a(this.f48733a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f48733a.a(x4.W2)).intValue()).c(((Boolean) this.f48733a.a(x4.X2)).booleanValue()).d(((Boolean) this.f48733a.a(x4.Y2)).booleanValue()).c(((Integer) this.f48733a.a(x4.V2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0712aF.a(andResetCustomPostBody);
                c0712aF.b(((Boolean) this.f48733a.a(x4.N5)).booleanValue());
            }
            a aVar = new a(c0712aF.a(), this.f48733a);
            aVar.c(x4.f50829l0);
            aVar.b(x4.m0);
            this.f48733a.q0().a(aVar);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Unable to fetch ad for zone id: " + this.f49880g, th);
            }
            a(0, th.getMessage());
        }
    }
}
