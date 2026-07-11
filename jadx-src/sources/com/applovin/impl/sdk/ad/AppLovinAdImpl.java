package com.applovin.impl.sdk.ad;

import WJ.phkN.HFAkacKHsU;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.C1809u;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1809u f50064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1799c f50066c;

    public abstract JSONObject getOriginalFullResponse();

    @Override // com.applovin.impl.t1
    public void setExpired() {
        this.f50065b = true;
    }

    private long b() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(x4.c1)).longValue());
    }

    public boolean equals(Object obj) {
        AppLovinAd appLovinAdC;
        if ((obj instanceof C1799c) && (appLovinAdC = ((C1799c) obj).c()) != null) {
            obj = appLovinAdC;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject(HFAkacKHsU.tYLwYIETBLqcUdw, -1L);
    }

    public C1809u getAdZone() {
        C1809u c1809u = this.f50064a;
        if (c1809u != null) {
            if (c1809u.f() != null && this.f50064a.g() != null) {
                return this.f50064a;
            }
            if (getSize() == null && getType() == null) {
                return this.f50064a;
            }
        }
        C1809u c1809uA = C1809u.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f50064a = c1809uA;
        return c1809uA;
    }

    public C1799c getDummyAd() {
        return this.f50066c;
    }

    @Nullable
    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    public String getRawFullResponse() {
        String string;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.toString();
        }
        synchronized (this.fullResponseLock) {
            string = this.fullResponse.toString();
        }
        return string;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.O();
        if (!C1804o.a()) {
            return false;
        }
        this.sdk.O().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public boolean isExpired() {
        return this.f50065b;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(C1799c c1799c) {
        this.f50066c = c1799c;
    }

    public void setHasShown(boolean z2) {
        try {
            h5 h5Var = this.synchronizedAdObject;
            if (h5Var != null) {
                h5Var.a(HrvQKfmFZJudBc.QYoR, (Object) Boolean.valueOf(z2));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z2);
            }
        } catch (Throwable unused) {
        }
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        super(jSONObject, jSONObject2, c1802k);
    }

    public boolean canExpire() {
        if (getSize() == AppLovinAdSize.INTERSTITIAL && b() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.t1
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return b() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }
}
