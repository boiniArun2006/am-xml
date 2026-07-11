package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class s7 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f49944f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f49945a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f49947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f49948d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f49946b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f49949e = System.currentTimeMillis();

    public List a() {
        return this.f49946b;
    }

    public JSONObject b() {
        return this.f49947c;
    }

    public long c() {
        return this.f49949e;
    }

    public int d() {
        return this.f49946b.size();
    }

    public JSONObject e() {
        return this.f49948d;
    }

    public List f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f49947c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f49944f;
    }

    public int g() {
        return n7.c(JsonUtils.getInt(this.f49947c, "video_completion_percent", -1));
    }

    public s7(JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        this.f49945a = c1802k;
        this.f49947c = jSONObject;
        this.f49948d = jSONObject2;
    }
}
