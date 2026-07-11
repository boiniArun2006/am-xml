package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class r7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f49886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w7 f49887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f49888e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f49889f = new HashMap();

    public static r7 a(p8 p8Var, r7 r7Var, s7 s7Var, C1802k c1802k) {
        p8 p8VarC;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1802k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (r7Var == null) {
            try {
                r7Var = new r7();
            } catch (Throwable th) {
                c1802k.O();
                if (C1804o.a()) {
                    c1802k.O().a("VastCompanionAd", "Error occurred while initializing", th);
                }
                c1802k.D().a("VastCompanionAd", th);
                return null;
            }
        }
        if (r7Var.f49884a == 0 && r7Var.f49885b == 0) {
            int i2 = StringUtils.parseInt((String) p8Var.a().get("width"));
            int i3 = StringUtils.parseInt((String) p8Var.a().get("height"));
            if (i2 > 0 && i3 > 0) {
                r7Var.f49884a = i2;
                r7Var.f49885b = i3;
            }
        }
        r7Var.f49887d = w7.a(p8Var, r7Var.f49887d, c1802k);
        if (r7Var.f49886c == null && (p8VarC = p8Var.c("CompanionClickThrough")) != null) {
            String strD = p8VarC.d();
            if (StringUtils.isValidString(strD)) {
                r7Var.f49886c = Uri.parse(strD);
            }
        }
        a8.a(p8Var.a("CompanionClickTracking"), r7Var.f49888e, s7Var, c1802k);
        a8.a(p8Var, r7Var.f49889f, s7Var, c1802k);
        return r7Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (this.f49884a != r7Var.f49884a || this.f49885b != r7Var.f49885b) {
            return false;
        }
        Uri uri = this.f49886c;
        if (uri == null ? r7Var.f49886c != null : !uri.equals(r7Var.f49886c)) {
            return false;
        }
        w7 w7Var = this.f49887d;
        if (w7Var == null ? r7Var.f49887d != null : !w7Var.equals(r7Var.f49887d)) {
            return false;
        }
        Set set = this.f49888e;
        if (set == null ? r7Var.f49888e != null : !set.equals(r7Var.f49888e)) {
            return false;
        }
        Map map = this.f49889f;
        Map map2 = r7Var.f49889f;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public Set b() {
        return this.f49888e;
    }

    public Uri c() {
        return this.f49886c;
    }

    public Map d() {
        return this.f49889f;
    }

    public w7 e() {
        return this.f49887d;
    }

    public int hashCode() {
        int i2 = ((this.f49884a * 31) + this.f49885b) * 31;
        Uri uri = this.f49886c;
        int iHashCode = (i2 + (uri != null ? uri.hashCode() : 0)) * 31;
        w7 w7Var = this.f49887d;
        int iHashCode2 = (iHashCode + (w7Var != null ? w7Var.hashCode() : 0)) * 31;
        Set set = this.f49888e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f49889f;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f49884a + ", height=" + this.f49885b + ", destinationUri=" + this.f49886c + ", nonVideoResource=" + this.f49887d + ", clickTrackers=" + this.f49888e + ", eventTrackers=" + this.f49889f + '}';
    }

    private r7() {
    }

    public static r7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        int i2 = JsonUtils.getInt(jSONObject, "width", 0);
        int i3 = JsonUtils.getInt(jSONObject, "height", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        w7 w7VarA = w7.a(JsonUtils.getJSONObject(jSONObject, "non_video_resource", (JSONObject) null), c1802k);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "click_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray, i5, (JSONObject) null), c1802k);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        r7 r7Var = new r7();
        r7Var.f49884a = i2;
        r7Var.f49885b = i3;
        r7Var.f49886c = uri;
        r7Var.f49887d = w7VarA;
        r7Var.f49888e.addAll(hashSet);
        return r7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "width", this.f49884a);
        JsonUtils.putInt(jSONObject, "height", this.f49885b);
        Uri uri = this.f49886c;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        w7 w7Var = this.f49887d;
        JsonUtils.putJSONObject(jSONObject, "non_video_resource", w7Var != null ? w7Var.a() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f49888e.iterator();
        while (it.hasNext()) {
            jSONArray.put(((y7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        return jSONObject;
    }
}
