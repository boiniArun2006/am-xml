package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class a1 {
    public static List a(C1802k c1802k) {
        c1802k.O();
        if (C1804o.a()) {
            c1802k.O().a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String strA = n7.a(R.raw.applovin_consent_flow_unified_cmp, C1802k.o(), c1802k);
        if (!TextUtils.isEmpty(strA)) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strA, null);
            if (jSONObjectJsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObjectJsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(v0.a(JsonUtils.getJSONObject(jSONArray, i2, new JSONObject()), c1802k));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }
}
