package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f53405a = new HashMap();

    public m() {
    }

    public m(JSONObject jSONObject) {
        JSONArray jSONArrayNames;
        JSONArray jSONArrayNames2 = jSONObject.names();
        for (int i2 = 0; i2 < jSONArrayNames2.length(); i2++) {
            String strOptString = jSONArrayNames2.optString(i2, null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strOptString);
            l lVar = new l();
            if (jSONObjectOptJSONObject != null && (jSONArrayNames = jSONObjectOptJSONObject.names()) != null) {
                for (int i3 = 0; i3 < jSONArrayNames.length(); i3++) {
                    String strOptString2 = jSONArrayNames.optString(i3, null);
                    String strOptString3 = jSONObjectOptJSONObject.optString(strOptString2, null);
                    if (strOptString2 != null && strOptString3 != null) {
                        lVar.f53400a.put(strOptString2, strOptString3);
                    }
                }
            }
            this.f53405a.put(strOptString, lVar);
        }
    }
}
