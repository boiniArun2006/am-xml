package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f53408a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f53409b = new HashMap();

    public final String a(String str, String str2) {
        return this.f53408a.containsKey(str) ? (String) this.f53408a.get(str) : str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f53408a.equals(oVar.f53408a) && this.f53409b.equals(oVar.f53409b)) {
                return true;
            }
        }
        return false;
    }

    public static o a(JSONObject jSONObject) {
        o oVar = new o();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
        for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
            String strOptString = jSONArrayNames.optString(i2, null);
            String strOptString2 = jSONObjectOptJSONObject.optString(strOptString, null);
            if (strOptString != null && strOptString2 != null) {
                oVar.f53408a.put(strOptString, strOptString2);
            }
        }
        if (jSONObjectOptJSONObject2 != null) {
            JSONArray jSONArrayNames2 = jSONObjectOptJSONObject2.names();
            for (int i3 = 0; i3 < jSONArrayNames2.length(); i3++) {
                String strOptString3 = jSONArrayNames2.optString(i3, null);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(strOptString3);
                if (strOptString3 != null && jSONObjectOptJSONObject3 != null) {
                    oVar.f53409b.put(strOptString3, new m(jSONObjectOptJSONObject3));
                }
            }
        }
        return oVar;
    }

    public final int hashCode() {
        return this.f53408a.hashCode();
    }

    public final int b(String str, int i2, int i3) {
        int i5;
        try {
            i5 = Integer.parseInt(a(str, Integer.toString(i2)));
        } catch (Throwable unused) {
            i5 = i2;
        }
        if (i5 >= i3 && i5 <= 30) {
            return i5;
        }
        return i2;
    }

    public final int a(String str, int i2, int i3) {
        try {
            i2 = Integer.parseInt(a(str, Integer.toString(i2)));
        } catch (Throwable unused) {
        }
        return Math.max(i2, i3);
    }

    public final boolean a(boolean z2, String str) {
        try {
            return Boolean.parseBoolean(a(str, Boolean.toString(z2)));
        } catch (Throwable unused) {
            return z2;
        }
    }

    public final l a(String str) {
        m mVar;
        String str2 = IAConfigManager.f53260M.f53278d;
        if (this.f53409b.containsKey(str2)) {
            mVar = (m) this.f53409b.get(str2);
        } else {
            mVar = new m();
        }
        mVar.getClass();
        return mVar.f53405a.containsKey(str) ? (l) mVar.f53405a.get(str) : new l();
    }
}
