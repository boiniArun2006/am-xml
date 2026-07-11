package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class v6 extends q6 {

    class a implements q0.e {
        a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            if (v6.this.h()) {
                C1804o c1804o = v6.this.f48735c;
                if (C1804o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f48735c.b(v6Var.f48734b, "Reward validation succeeded with code " + i2 + " but task was cancelled already");
                }
                C1804o c1804o2 = v6.this.f48735c;
                if (C1804o.a()) {
                    v6 v6Var2 = v6.this;
                    v6Var2.f48735c.b(v6Var2.f48734b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            C1804o c1804o3 = v6.this.f48735c;
            if (C1804o.a()) {
                v6 v6Var3 = v6.this;
                v6Var3.f48735c.a(v6Var3.f48734b, "Reward validation succeeded with code " + i2 + " and response: " + jSONObject);
            }
            v6.this.c(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            if (v6.this.h()) {
                C1804o c1804o = v6.this.f48735c;
                if (C1804o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.f48735c.b(v6Var.f48734b, "Reward validation failed with error code " + i2 + " but task was cancelled already");
                    return;
                }
                return;
            }
            C1804o c1804o2 = v6.this.f48735c;
            if (C1804o.a()) {
                v6 v6Var2 = v6.this;
                v6Var2.f48735c.b(v6Var2.f48734b, "Reward validation failed with code " + i2 + " and error: " + str2);
            }
            v6.this.a(i2);
        }
    }

    protected abstract void a(o4 o4Var);

    protected abstract boolean h();

    private o4 b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        r0.c(jSONObject2, this.f48733a);
        r0.b(jSONObject, this.f48733a);
        r0.a(jSONObject, this.f48733a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return o4.a(string, stringMap);
    }

    @Override // com.applovin.impl.q6
    protected int g() {
        return ((Integer) this.f48733a.a(x4.e1)).intValue();
    }

    protected v6(String str, C1802k c1802k) {
        super(str, c1802k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        o4 o4VarB = b(jSONObject);
        a(o4VarB);
        if (C1804o.a()) {
            this.f48735c.a(this.f48734b, "Pending reward handled: " + o4VarB);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new a());
    }
}
