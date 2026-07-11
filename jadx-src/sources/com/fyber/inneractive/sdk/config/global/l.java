package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f53374a = new HashMap();

    public static l a(JSONObject jSONObject) throws JSONException {
        l lVar = new l();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
            q qVar = new q();
            qVar.f53377b = jSONObject2.getString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("params");
            if (jSONObjectOptJSONObject != null) {
                qVar.f53376a = new o(jSONObjectOptJSONObject);
            } else {
                IAlog.a("RemoteFeature fromJson. feature %s has no params!", qVar.f53377b);
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i3);
                    b bVar = new b();
                    bVar.f53348a = jSONObject3.getString("id");
                    bVar.f53349b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i5);
                        k kVar = new k();
                        kVar.f53372b = jSONObject4.getString("id");
                        kVar.f53373c = jSONObject4.getInt("perc");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("params");
                        if (jSONObjectOptJSONObject2 != null) {
                            kVar.f53376a = new o(jSONObjectOptJSONObject2);
                        }
                        bVar.f53350c.add(kVar);
                    }
                    b.a(bVar, jSONObject3.optJSONObject("include"), true);
                    b.a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f53378c.put(bVar.f53348a, bVar);
                }
            }
            lVar.f53374a.put(qVar.f53377b, qVar);
        }
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f53374a.equals(((l) obj).f53374a);
    }

    public final int hashCode() {
        return this.f53374a.hashCode();
    }

    public final String toString() {
        return String.format("remoteConfig - features: %s", this.f53374a.values());
    }
}
