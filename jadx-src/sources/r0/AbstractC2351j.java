package r0;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: r0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AbstractC2351j {
    public static tUa.j n(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String str = "";
        boolean z2 = false;
        try {
            if (jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                String strOptString = jSONObjectOptJSONObject.optString("igniteVersion", "");
                try {
                    if (!jSONObjectOptJSONObject.has("features") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("features")) == null) {
                        str = strOptString;
                    } else {
                        for (int length = jSONArrayOptJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(length);
                            if (jSONObjectOptJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(jSONObjectOptJSONObject2.optString("type", ""))) {
                                str = strOptString;
                                z2 = true;
                                break;
                            }
                        }
                        str = strOptString;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = strOptString;
                    eh.n.rl("IgniteVersionParser: exception on parse: %s", e.getMessage());
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return new tUa.j(z2, str);
    }
}
