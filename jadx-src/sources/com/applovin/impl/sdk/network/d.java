package com.applovin.impl.sdk.network;

import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f50417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f50418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f50419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbstractC1810u4.a f50420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f50421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f50422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f50423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f50424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f50425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50426n;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f50429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f50431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f50432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Map f50433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private AbstractC1810u4.a f50434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f50435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f50436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f50437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f50438l;

        public b a(String str) {
            this.f50430d = str;
            return this;
        }

        public b b(String str) {
            this.f50427a = str;
            return this;
        }

        public b c(String str) {
            this.f50428b = str;
            return this;
        }

        public b d(String str) {
            this.f50429c = str;
            return this;
        }

        public b a(Map map) {
            this.f50432f = map;
            return this;
        }

        public b b(Map map) {
            this.f50431e = map;
            return this;
        }

        public b c(Map map) {
            this.f50433g = map;
            return this;
        }

        public b d(boolean z2) {
            this.f50437k = z2;
            return this;
        }

        public b a(AbstractC1810u4.a aVar) {
            this.f50434h = aVar;
            return this;
        }

        public b b(boolean z2) {
            this.f50438l = z2;
            return this;
        }

        public b c(boolean z2) {
            this.f50436j = z2;
            return this;
        }

        public b a(boolean z2) {
            this.f50435i = z2;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    d(JSONObject jSONObject, C1802k c1802k) throws JSONException {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        String string3 = JsonUtils.getString(jSONObject, "httpMethod", "");
        String string4 = jSONObject.getString("targetUrl");
        String string5 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i2 = jSONObject.getInt("attemptNumber");
        Map mapSynchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap();
        Map mapSynchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap();
        Map mapSynchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap();
        this.f50413a = string;
        this.f50414b = string3;
        this.f50425m = string2;
        this.f50415c = string4;
        this.f50416d = string5;
        this.f50417e = mapSynchronizedMap;
        this.f50418f = mapSynchronizedMap2;
        this.f50419g = mapSynchronizedMap3;
        this.f50420h = AbstractC1810u4.a.a(jSONObject.optInt("encodingType", AbstractC1810u4.a.DEFAULT.b()));
        this.f50421i = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f50422j = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f50423k = jSONObject.optBoolean("isAllowedPreInitEvent", false);
        this.f50424l = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f50426n = i2;
    }

    public static b b() {
        return new b();
    }

    void a() {
        Map map = CollectionUtils.map(this.f50417e);
        map.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f50417e = map;
    }

    int c() {
        return this.f50426n;
    }

    String d() {
        return this.f50416d;
    }

    String e() {
        return this.f50425m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f50413a.equals(((d) obj).f50413a);
    }

    AbstractC1810u4.a f() {
        return this.f50420h;
    }

    Map g() {
        return this.f50418f;
    }

    String h() {
        return this.f50414b;
    }

    public int hashCode() {
        return this.f50413a.hashCode();
    }

    Map i() {
        return this.f50417e;
    }

    Map j() {
        return this.f50419g;
    }

    String k() {
        return this.f50415c;
    }

    void l() {
        this.f50426n++;
    }

    public boolean m() {
        return this.f50423k;
    }

    boolean n() {
        return this.f50421i;
    }

    boolean o() {
        return this.f50422j;
    }

    boolean p() {
        return this.f50424l;
    }

    JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f50413a);
        jSONObject.put("communicatorRequestId", this.f50425m);
        jSONObject.put("httpMethod", this.f50414b);
        jSONObject.put("targetUrl", this.f50415c);
        jSONObject.put("backupUrl", this.f50416d);
        jSONObject.put("encodingType", this.f50420h);
        jSONObject.put("isEncodingEnabled", this.f50421i);
        jSONObject.put("gzipBodyEncoding", this.f50422j);
        jSONObject.put("isAllowedPreInitEvent", this.f50423k);
        jSONObject.put("attemptNumber", this.f50426n);
        if (this.f50417e != null) {
            jSONObject.put("parameters", new JSONObject(this.f50417e));
        }
        if (this.f50418f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f50418f));
        }
        if (this.f50419g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f50419g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f50413a + "', communicatorRequestId='" + this.f50425m + "', httpMethod='" + this.f50414b + "', targetUrl='" + this.f50415c + "', backupUrl='" + this.f50416d + "', attemptNumber=" + this.f50426n + ", isEncodingEnabled=" + this.f50421i + ", isGzipBodyEncoding=" + this.f50422j + ", isAllowedPreInitEvent=" + this.f50423k + ", shouldFireInWebView=" + this.f50424l + '}';
    }

    private d(b bVar) {
        this.f50413a = UUID.randomUUID().toString();
        this.f50414b = bVar.f50428b;
        this.f50415c = bVar.f50429c;
        this.f50416d = bVar.f50430d;
        this.f50417e = bVar.f50431e;
        this.f50418f = bVar.f50432f;
        this.f50419g = bVar.f50433g;
        this.f50420h = bVar.f50434h;
        this.f50421i = bVar.f50435i;
        this.f50422j = bVar.f50436j;
        this.f50423k = bVar.f50437k;
        this.f50424l = bVar.f50438l;
        this.f50425m = bVar.f50427a;
        this.f50426n = 0;
    }
}
