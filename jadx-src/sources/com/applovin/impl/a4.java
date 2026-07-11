package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47923b;

    public String a() {
        return this.f47922a;
    }

    public String b() {
        return this.f47923b;
    }

    public a4(JSONObject jSONObject, C1802k c1802k) {
        this.f47922a = JsonUtils.getString(jSONObject, "id", "");
        this.f47923b = JsonUtils.getString(jSONObject, "price", null);
    }
}
