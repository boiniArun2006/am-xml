package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class t6 extends v6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f50508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f50509h;

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f50508g.getAdZone().e());
        String clCode = this.f50508g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    public t6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, C1802k c1802k) {
        super("TaskValidateAppLovinReward", c1802k);
        this.f50508g = bVar;
        this.f50509h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.v6
    protected boolean h() {
        return this.f50508g.K0();
    }

    @Override // com.applovin.impl.v6
    protected void a(o4 o4Var) {
        this.f50508g.a(o4Var);
        String strB = o4Var.b();
        Map<String, String> mapA = o4Var.a();
        if (strB.equals("accepted")) {
            this.f50509h.userRewardVerified(this.f50508g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f50509h.userOverQuota(this.f50508g, mapA);
        } else if (strB.equals("rejected")) {
            this.f50509h.userRewardRejected(this.f50508g, mapA);
        } else {
            this.f50509h.validationRequestFailed(this.f50508g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i2) {
        String str;
        super.a(i2);
        if (i2 >= 400 && i2 < 500) {
            this.f50509h.userRewardRejected(this.f50508g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f50509h.validationRequestFailed(this.f50508g, i2);
            str = "network_timeout";
        }
        this.f50508g.a(o4.a(str));
    }
}
