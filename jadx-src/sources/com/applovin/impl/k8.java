package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f48827c;

    public String a() {
        return this.f48825a;
    }

    public String b() {
        return this.f48826b;
    }

    public List c() {
        return this.f48827c;
    }

    public k8(JSONObject jSONObject) {
        this.f48825a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f48826b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f48827c = JsonUtils.getStringList(jSONObject, "segments", null);
    }
}
