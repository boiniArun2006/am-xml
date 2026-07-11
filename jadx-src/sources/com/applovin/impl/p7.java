package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class p7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f49693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f49694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f49695d;

    public static p7 a(p8 p8Var, s7 s7Var, C1802k c1802k) {
        try {
            String str = (String) p8Var.a().get("vendor");
            p8 p8VarB = p8Var.b("VerificationParameters");
            String strD = p8VarB != null ? p8VarB.d() : null;
            List listA = p8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                v7 v7VarA = v7.a((p8) it.next(), c1802k);
                if (v7VarA != null) {
                    arrayList.add(v7VarA);
                }
            }
            HashMap map = new HashMap();
            a8.a(p8Var, map, s7Var, c1802k);
            return new p7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("VastAdVerification", "Error occurred while initializing", th);
            }
            c1802k.D().a("VastAdVerification", th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p7 p7Var = (p7) obj;
            String str = this.f49692a;
            if (str == null ? p7Var.f49692a != null : !str.equals(p7Var.f49692a)) {
                return false;
            }
            List list = this.f49693b;
            if (list == null ? p7Var.f49693b != null : !list.equals(p7Var.f49693b)) {
                return false;
            }
            String str2 = this.f49694c;
            if (str2 == null ? p7Var.f49694c != null : !str2.equals(p7Var.f49694c)) {
                return false;
            }
            Set set = this.f49695d;
            Set set2 = p7Var.f49695d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public Set b() {
        return this.f49695d;
    }

    public List c() {
        return this.f49693b;
    }

    public String d() {
        return this.f49692a;
    }

    public String e() {
        return this.f49694c;
    }

    public int hashCode() {
        String str = this.f49692a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f49693b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f49694c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f49695d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f49692a + "'javascriptResources='" + this.f49693b + "'verificationParameters='" + this.f49694c + "'errorEventTrackers='" + this.f49695d + "'}";
    }

    private p7(String str, List list, String str2, Set set) {
        this.f49692a = str;
        this.f49693b = list;
        this.f49694c = str2;
        this.f49695d = set;
    }

    public static p7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "javascript_resources", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            v7 v7VarA = v7.a(JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), c1802k);
            if (v7VarA != null) {
                arrayList.add(v7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_event_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i3, (JSONObject) null), c1802k);
            if (y7VarA != null) {
                hashSet.add(y7VarA);
            }
        }
        return new p7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f49692a);
        if (this.f49693b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f49693b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((v7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f49694c);
        if (this.f49695d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f49695d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
