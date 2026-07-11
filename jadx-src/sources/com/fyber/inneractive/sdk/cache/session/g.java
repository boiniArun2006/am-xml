package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f53210d;

    public final JSONObject a(boolean z2, boolean z3) {
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            try {
                jSONObject.put("time", this.f53210d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f53207a);
        if (z3) {
            jSONObject.put("com", this.f53209c);
        }
        jSONObject.put("cli", this.f53208b);
        return jSONObject;
    }

    public g(int i2, int i3, int i5, long j2) {
        this.f53210d = j2;
        this.f53207a = i2;
        this.f53208b = i3;
        this.f53209c = i5;
    }

    public static g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("time");
        int iOptInt = jSONObject.optInt("cli", -1);
        int iOptInt2 = jSONObject.optInt("imp", -1);
        int iOptInt3 = jSONObject.optInt("com", -1);
        if (jOptLong == 0 || iOptInt < 0 || iOptInt2 < 0 || iOptInt3 < 0) {
            return null;
        }
        return new g(iOptInt2, iOptInt, iOptInt3, jOptLong);
    }
}
