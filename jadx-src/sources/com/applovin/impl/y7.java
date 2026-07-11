package com.applovin.impl;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class y7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f50923e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50924f = -1;

    public static y7 a(p8 p8Var, s7 s7Var, C1802k c1802k) {
        List<String> listExplode;
        int size;
        long seconds;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strD = p8Var.d();
            if (TextUtils.isEmpty(strD)) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            y7 y7Var = new y7();
            y7Var.f50921c = strD;
            y7Var.f50919a = (String) p8Var.a().get("id");
            y7Var.f50920b = (String) p8Var.a().get(com.safedk.android.analytics.events.a.f62811a);
            y7Var.f50922d = ((Boolean) c1802k.a(x4.j5)).booleanValue();
            if (s7Var != null) {
                y7Var.f50922d = JsonUtils.getBoolean(s7Var.b(), "vast_fire_trackers_from_webview", Boolean.valueOf(y7Var.f50922d)).booleanValue();
            }
            y7Var.f50924f = a(y7Var.b(), s7Var);
            String str = (String) p8Var.a().get("offset");
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    y7Var.f50924f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return y7Var;
                }
                if (strTrim.contains(":") && (size = (listExplode = CollectionUtils.explode(strTrim, ":")).size()) > 0) {
                    int i2 = size - 1;
                    long j2 = 0;
                    for (int i3 = i2; i3 >= 0; i3--) {
                        String str2 = listExplode.get(i3);
                        if (StringUtils.isNumeric(str2)) {
                            int i5 = Integer.parseInt(str2);
                            if (i3 == i2) {
                                seconds = i5;
                            } else if (i3 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i5);
                            } else if (i3 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i5);
                            }
                            j2 += seconds;
                        }
                    }
                    y7Var.f50923e = j2;
                    y7Var.f50924f = -1;
                }
            }
            return y7Var;
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("VastTracker", "Error occurred while initializing", th);
            }
            c1802k.D().a("VastTracker", th);
            return null;
        }
    }

    public String b() {
        return this.f50920b;
    }

    public String c() {
        return this.f50921c;
    }

    public boolean d() {
        return this.f50922d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.f50923e != y7Var.f50923e || this.f50924f != y7Var.f50924f) {
            return false;
        }
        String str = this.f50919a;
        if (str == null ? y7Var.f50919a != null : !str.equals(y7Var.f50919a)) {
            return false;
        }
        String str2 = this.f50920b;
        if (str2 == null ? y7Var.f50920b == null : str2.equals(y7Var.f50920b)) {
            return this.f50921c.equals(y7Var.f50921c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f50919a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f50920b;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f50921c.hashCode()) * 31;
        long j2 = this.f50923e;
        return ((iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f50924f;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f50919a + "', event='" + this.f50920b + "', uriString='" + this.f50921c + "', offsetSeconds=" + this.f50923e + ", offsetPercent=" + this.f50924f + '}';
    }

    private y7() {
    }

    public boolean a(long j2, int i2) {
        long j3 = this.f50923e;
        boolean z2 = j3 >= 0;
        boolean z3 = j2 >= j3;
        int i3 = this.f50924f;
        return (z2 && z3) || ((i3 >= 0) && (i2 >= i3));
    }

    private static int a(String str, s7 s7Var) {
        if (TtmlNode.START.equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (s7Var != null) {
            return s7Var.g();
        }
        return 95;
    }

    public static y7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        y7 y7Var = new y7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        y7Var.f50921c = string;
        y7Var.f50919a = JsonUtils.getString(jSONObject, "identifier", "");
        y7Var.f50920b = JsonUtils.getString(jSONObject, com.safedk.android.analytics.events.a.f62811a, "");
        y7Var.f50923e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        y7Var.f50924f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return y7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "identifier", this.f50919a);
        JsonUtils.putString(jSONObject, com.safedk.android.analytics.events.a.f62811a, this.f50920b);
        JsonUtils.putString(jSONObject, "uri_string", this.f50921c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f50923e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f50924f);
        return jSONObject;
    }
}
