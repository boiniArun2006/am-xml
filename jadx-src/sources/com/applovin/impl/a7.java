package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f47928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f47929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f47932e;

    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i2) {
            return i2 != 0 ? i2 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public void a(Boolean bool) {
        this.f47932e = bool;
    }

    public Boolean a() {
        return this.f47932e;
    }

    public String b() {
        return this.f47931d;
    }

    public String c() {
        return this.f47930c;
    }

    public Integer d() {
        return this.f47929b;
    }

    public String e() {
        Boolean bool = this.f47932e;
        return "\n" + this.f47931d + " - " + (bool != null ? String.valueOf(bool) : p0.b().a(C1802k.o()));
    }

    public a f() {
        return this.f47928a;
    }

    public a7(JSONObject jSONObject, String str) {
        this.f47931d = str;
        this.f47928a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f47929b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f47930c = JsonUtils.getString(jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, null);
    }
}
