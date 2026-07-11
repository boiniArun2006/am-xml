package com.applovin.impl;

import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class q7 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f49803a;

    public static q7 a(p8 p8Var, q7 q7Var, s7 s7Var, C1802k c1802k) {
        try {
            List listB = q7Var != null ? q7Var.b() : new ArrayList();
            Iterator it = p8Var.a("Verification").iterator();
            while (it.hasNext()) {
                p7 p7VarA = p7.a((p8) it.next(), s7Var, c1802k);
                if (p7VarA != null) {
                    listB.add(p7VarA);
                }
            }
            return new q7(listB);
        } catch (Throwable th) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("VastAdVerifications", "Error occurred while initializing", th);
            }
            c1802k.D().a("VastAdVerifications", th);
            return null;
        }
    }

    public List b() {
        return this.f49803a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7) {
            return this.f49803a.equals(((q7) obj).f49803a);
        }
        return false;
    }

    public int hashCode() {
        return this.f49803a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f49803a + "'}";
    }

    private q7(List list) {
        this.f49803a = list;
    }

    static q7 a(JSONObject jSONObject, C1802k c1802k) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "verifications", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            p7 p7VarA = p7.a(JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), c1802k);
            if (p7VarA != null) {
                arrayList.add(p7VarA);
            }
        }
        return new q7(arrayList);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f49803a != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f49803a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((p7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "verifications", jSONArray);
        }
        return jSONObject;
    }
}
