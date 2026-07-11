package com.safedk.android.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class a implements f, Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62811a = "event";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f62812b = "ts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62813c = "ad_format";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62814d = "network";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62815e = "creative_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62816f = "dsp_name";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f62817g = "MaxEvent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f62818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f62819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f62820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f62821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f62822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f62823m;

    public String a() {
        return this.f62823m;
    }

    public String b() {
        return this.f62818h;
    }

    public void a(String str) {
        this.f62818h = str;
    }

    public long c() {
        return this.f62819i.longValue();
    }

    public String d() {
        return this.f62820j;
    }

    public String e() {
        return this.f62821k;
    }

    public String f() {
        return this.f62822l;
    }

    public a() {
    }

    public a(String str, long j2, String str2, String str3, String str4, String str5) {
        this.f62818h = str;
        this.f62819i = Long.valueOf(j2);
        this.f62820j = str2;
        this.f62821k = str3;
        this.f62823m = str4;
        this.f62822l = str5;
        Logger.d(f62817g, "New MaxEvent created , event=", str, ", timestamp=", Long.valueOf(j2), ", adFormat=", str2, ", network=", str3, ", creativeId=", str4, ", dspName=", str5);
    }

    public a(a aVar) {
        this.f62818h = aVar.f62818h;
        this.f62819i = aVar.f62819i;
        this.f62820j = aVar.f62820j;
        this.f62821k = aVar.f62821k;
        this.f62823m = aVar.f62823m;
        this.f62822l = aVar.f62822l;
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString(f62811a, this.f62818h);
        bundle.putLong(f62812b, this.f62819i.longValue());
        bundle.putString("ad_format", this.f62820j);
        bundle.putString(f62814d, this.f62821k);
        bundle.putString("creative_id", this.f62823m);
        String str = this.f62822l;
        if (str != null) {
            bundle.putString("dsp_name", str);
        }
        Logger.d(f62817g, "MaxEvent toBundle : ", bundle.toString());
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("event:" + this.f62818h + ",");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ts:");
        sb2.append(this.f62819i);
        sb.append(sb2.toString());
        sb.append("(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(this.f62819i.longValue() * 1000)) + "),");
        sb.append("ad_format:" + this.f62820j + ",");
        sb.append("network:" + this.f62821k + ",");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("creative_id:");
        sb3.append(this.f62823m);
        sb.append(sb3.toString());
        if (this.f62822l != null) {
            sb.append(",DSP_NAME:" + this.f62822l);
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f62819i.compareTo(aVar.f62819i);
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StatsEvent.f62824A, this.f62819i);
        if (!TextUtils.isEmpty(this.f62818h)) {
            jSONObject.put(f62811a, this.f62818h);
        }
        if (!TextUtils.isEmpty(this.f62820j)) {
            jSONObject.put("adFormat", this.f62820j);
        }
        if (!TextUtils.isEmpty(this.f62821k)) {
            jSONObject.put(f62814d, this.f62821k);
        }
        if (!TextUtils.isEmpty(this.f62822l)) {
            jSONObject.put("dspName", this.f62822l);
        }
        if (!TextUtils.isEmpty(this.f62823m)) {
            jSONObject.put("creativeId", this.f62823m);
        }
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f62819i = Long.valueOf(jSONObject.optLong(StatsEvent.f62824A, 0L));
            this.f62818h = jSONObject.optString(f62811a, "");
            this.f62820j = jSONObject.optString("adFormat", "");
            this.f62821k = jSONObject.optString(f62814d, "");
            this.f62822l = jSONObject.optString("dspName", "");
            this.f62823m = jSONObject.optString("creativeId", "");
        }
    }
}
