package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class b3 extends h3 {
    public b3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        super(a3Var, jSONObject, jSONObject2, null, c1802k);
    }

    private b3(b3 b3Var, com.applovin.impl.mediation.h hVar) {
        super(b3Var.N(), b3Var.a(), b3Var.g(), hVar, b3Var.f48807a);
    }

    @Override // com.applovin.impl.y2
    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new b3(this, hVar);
    }

    public long r0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((Long) this.f48807a.a(r3.y7)).longValue());
    }

    public long s0() {
        return n7.e(a("bg_color", (String) null));
    }

    public int t0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long u0() {
        return a("viewability_imp_delay_ms", ((Long) this.f48807a.a(x4.n1)).longValue());
    }

    public int v0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean x0() {
        return a("proe", (Boolean) this.f48807a.a(r3.a8)).booleanValue();
    }

    public boolean w0() {
        if (r0() >= 0) {
            return true;
        }
        return false;
    }
}
