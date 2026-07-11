package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class m6 extends o6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f48960g;

    @Override // com.applovin.impl.q6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f48960g.getAdZone().e());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f48960g.P());
        String clCode = this.f48960g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    public m6(com.applovin.impl.sdk.ad.b bVar, C1802k c1802k) {
        super("TaskReportAppLovinReward", c1802k);
        this.f48960g = bVar;
    }

    @Override // com.applovin.impl.q6
    protected String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.o6
    protected o4 h() {
        return this.f48960g.i();
    }

    @Override // com.applovin.impl.o6
    protected void b(JSONObject jSONObject) {
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Reported reward successfully for ad: " + this.f48960g);
        }
    }

    @Override // com.applovin.impl.o6
    protected void i() {
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "No reward result was found for ad: " + this.f48960g);
        }
    }

    @Override // com.applovin.impl.q6
    protected void a(int i2) {
        super.a(i2);
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Failed to report reward for ad: " + this.f48960g + " - error code: " + i2);
        }
        this.f48733a.g().a(d2.f48253H, this.f48960g);
    }
}
