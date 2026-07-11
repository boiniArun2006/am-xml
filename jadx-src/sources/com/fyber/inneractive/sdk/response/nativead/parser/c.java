package com.fyber.inneractive.sdk.response.nativead.parser;

import com.caoccao.javet.values.primitive.V8ValueNull;
import com.fyber.inneractive.sdk.response.nativead.h;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class c {
    public static h a(JSONObject jSONObject) {
        h hVar = new h();
        if (jSONObject != null) {
            hVar.f56900a = v.a(jSONObject, "url");
            hVar.f56902c = v.a(jSONObject, "fallback");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clicktrackers");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i2);
                    if (strOptString != null && !strOptString.isEmpty() && !strOptString.equals(V8ValueNull.NULL)) {
                        hVar.f56901b.add(strOptString);
                    }
                }
            }
        }
        return hVar;
    }
}
