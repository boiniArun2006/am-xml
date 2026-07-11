package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.c1;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class r0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f53415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0 f53417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f53418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f53419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f53420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f53421g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "id", this.f53415a);
        c1.a(jSONObject, "spotId", this.f53416b);
        c1.a(jSONObject, "display", this.f53417c);
        c1.a(jSONObject, "monitor", this.f53418d);
        c1.a(jSONObject, "native", this.f53419e);
        c1.a(jSONObject, "video", this.f53420f);
        c1.a(jSONObject, "viewability", this.f53421g);
        return jSONObject.toString();
    }
}
