package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f47569n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JSONObject f47570t;

    public String O() {
        return this.rl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f47569n, purchaseHistoryRecord.n()) && TextUtils.equals(this.rl, purchaseHistoryRecord.O());
    }

    public String n() {
        return this.f47569n;
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f47569n));
    }

    private final ArrayList J2() {
        ArrayList arrayList = new ArrayList();
        if (this.f47570t.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f47570t.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i2));
                }
            }
        } else if (this.f47570t.has("productId")) {
            arrayList.add(this.f47570t.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f47569n.hashCode();
    }

    public String nr() {
        JSONObject jSONObject = this.f47570t;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public long t() {
        return this.f47570t.optLong("purchaseTime");
    }

    public PurchaseHistoryRecord(String str, String str2) {
        this.f47569n = str;
        this.rl = str2;
        this.f47570t = new JSONObject(str);
    }

    public List rl() {
        return J2();
    }
}
