package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f54084a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f54085b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f54086c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f54087d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f54088e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f54089f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f54090g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f54091h = null;

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final HashMap j() {
        HashMap map = new HashMap();
        Long l2 = this.f54085b;
        if (l2 != null && this.f54084a != null) {
            map.put("sdk_init_network_req", Long.valueOf(l2.longValue() - this.f54084a.longValue()));
        }
        Long l5 = this.f54091h;
        if (l5 != null && this.f54085b != null) {
            map.put("sdk_got_response_from_markup_url", Long.valueOf(l5.longValue() - this.f54085b.longValue()));
        }
        Long l6 = this.f54087d;
        if (l6 != null && this.f54091h != null) {
            map.put("sdk_parsed_res", Long.valueOf(l6.longValue() - this.f54091h.longValue()));
        }
        Long l7 = this.f54086c;
        if (l7 != null && this.f54085b != null) {
            map.put("sdk_got_server_res", Long.valueOf(l7.longValue() - this.f54085b.longValue()));
        }
        Long l8 = this.f54087d;
        if (l8 != null && this.f54086c != null) {
            map.put("sdk_parsed_res", Long.valueOf(l8.longValue() - this.f54086c.longValue()));
        }
        Long l9 = this.f54088e;
        if (l9 != null && this.f54087d != null) {
            map.put("ad_loaded_result", Long.valueOf(l9.longValue() - this.f54087d.longValue()));
        }
        Long l10 = this.f54089f;
        if (l10 != null && this.f54088e != null) {
            map.put("publisher_notified", Long.valueOf(l10.longValue() - this.f54088e.longValue()));
        }
        Long l11 = this.f54090g;
        if (l11 != null && this.f54084a != null) {
            map.put("roundtrip", Long.valueOf(l11.longValue() - this.f54084a.longValue()));
        }
        return map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricsCollectorData{");
        if (this.f54084a != null && this.f54085b != null) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.f54085b.longValue() - this.f54084a.longValue());
        }
        if (this.f54091h != null && this.f54085b != null) {
            sb.append(", sdk_got_response_from_markup_url=");
            sb.append(this.f54091h.longValue() - this.f54085b.longValue());
        }
        if (this.f54086c != null && this.f54085b != null) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.f54086c.longValue() - this.f54085b.longValue());
        }
        if (this.f54087d != null && this.f54086c != null) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.f54087d.longValue() - this.f54086c.longValue());
        }
        if (this.f54088e != null && this.f54087d != null) {
            sb.append(", ad_loaded_result=");
            sb.append(this.f54088e.longValue() - this.f54087d.longValue());
        }
        if (this.f54089f != null && this.f54088e != null) {
            sb.append(", publisher_notified=");
            sb.append(this.f54089f.longValue() - this.f54088e.longValue());
        }
        if (this.f54090g != null && this.f54084a != null) {
            sb.append(", roundtrip=");
            sb.append(this.f54090g.longValue() - this.f54084a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long b() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54090g = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long c() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54084a = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long d() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54087d = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long e() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54089f = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long f() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54085b = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long g() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54086c = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long h() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54091h = lValueOf;
        return lValueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.g
    public final Long i() {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        this.f54088e = lValueOf;
        return lValueOf;
    }
}
