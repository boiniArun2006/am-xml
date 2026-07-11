package com.applovin.impl;

import com.applovin.impl.b5;
import com.applovin.impl.sdk.C1802k;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class d5 extends k3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a3 f48317k;

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public b5.b t() {
        return b5.b.values()[a("signal_cache_level", ((Integer) this.f48807a.a(r3.Q7)).intValue())];
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public a3 u() {
        return this.f48317k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.f48807a.a(r3.P7)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.f48807a.a(r3.x8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }

    public d5(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        super(a3Var.e(), jSONObject, jSONObject2, c1802k);
        this.f48317k = a3Var;
    }
}
