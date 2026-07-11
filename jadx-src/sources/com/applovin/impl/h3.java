package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class h3 extends y2 {
    public float j0() {
        return a("viewability_min_alpha", ((Float) this.f48807a.a(x4.w1)).floatValue() / 100.0f);
    }

    public int k0() {
        return a("viewability_min_pixels", -1);
    }

    public float m0() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float n0() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public long o0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f48807a.a(x4.x1)).longValue());
    }

    protected h3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, C1802k c1802k) {
        super(a3Var, jSONObject, jSONObject2, hVar, c1802k);
    }

    public int l0() {
        x4 x4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            x4Var = x4.p1;
        } else if (format == MaxAdFormat.MREC) {
            x4Var = x4.f50839r1;
        } else if (format == MaxAdFormat.LEADER) {
            x4Var = x4.f50844t1;
        } else if (format == MaxAdFormat.NATIVE) {
            x4Var = x4.v1;
        } else {
            x4Var = null;
        }
        if (x4Var != null) {
            return a("viewability_min_height", ((Integer) this.f48807a.a(x4Var)).intValue());
        }
        return 0;
    }

    public int p0() {
        x4 x4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            x4Var = x4.o1;
        } else if (format == MaxAdFormat.MREC) {
            x4Var = x4.q1;
        } else if (format == MaxAdFormat.LEADER) {
            x4Var = x4.s1;
        } else if (format == MaxAdFormat.NATIVE) {
            x4Var = x4.u1;
        } else {
            x4Var = null;
        }
        if (x4Var != null) {
            return a("viewability_min_width", ((Integer) this.f48807a.a(x4Var)).intValue());
        }
        return 0;
    }

    public boolean q0() {
        if (k0() < 0 && m0() < 0.0f && n0() < 0.0f) {
            return false;
        }
        return true;
    }
}
