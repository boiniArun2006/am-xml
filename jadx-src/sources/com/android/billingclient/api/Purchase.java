package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Purchase {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f47567n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONObject f47568t;

    public String KN() {
        return this.rl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f47567n, purchase.rl()) && TextUtils.equals(this.rl, purchase.KN());
    }

    public String rl() {
        return this.f47567n;
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f47567n));
    }

    private final ArrayList gh() {
        ArrayList arrayList = new ArrayList();
        if (this.f47568t.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f47568t.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i2));
                }
            }
        } else if (this.f47568t.has("productId")) {
            arrayList.add(this.f47568t.optString("productId"));
        }
        return arrayList;
    }

    public long J2() {
        return this.f47568t.optLong("purchaseTime");
    }

    public int O() {
        return this.f47568t.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public String Uo() {
        JSONObject jSONObject = this.f47568t;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int hashCode() {
        return this.f47567n.hashCode();
    }

    public boolean mUb() {
        return this.f47568t.optBoolean("autoRenewing");
    }

    public String n() {
        String strOptString = this.f47568t.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String t() {
        return this.f47568t.optString("packageName");
    }

    public boolean xMQ() {
        return this.f47568t.optBoolean("acknowledged", true);
    }

    public Purchase(String str, String str2) {
        this.f47567n = str;
        this.rl = str2;
        this.f47568t = new JSONObject(str);
    }

    public List nr() {
        return gh();
    }
}
