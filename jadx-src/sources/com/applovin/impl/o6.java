package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class o6 extends q6 {

    class a implements q0.e {
        a() {
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            o6.this.b(jSONObject);
        }

        @Override // com.applovin.impl.q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            o6.this.a(i2);
        }
    }

    protected abstract void b(JSONObject jSONObject);

    protected abstract o4 h();

    protected abstract void i();

    @Override // com.applovin.impl.q6
    protected int g() {
        return ((Integer) this.f48733a.a(x4.f1)).intValue();
    }

    protected o6(String str, C1802k c1802k) {
        super(str, c1802k);
    }

    private JSONObject a(o4 o4Var) {
        JSONObject jSONObjectE = e();
        JsonUtils.putString(jSONObjectE, "result", o4Var.b());
        Map mapA = o4Var.a();
        if (mapA != null) {
            JsonUtils.putJSONObject(jSONObjectE, "params", new JSONObject(mapA));
        }
        return jSONObjectE;
    }

    @Override // java.lang.Runnable
    public void run() {
        o4 o4VarH = h();
        if (o4VarH != null) {
            if (C1804o.a()) {
                this.f48735c.a(this.f48734b, "Reporting pending reward: " + o4VarH + "...");
            }
            a(a(o4VarH), new a());
            return;
        }
        if (C1804o.a()) {
            this.f48735c.b(this.f48734b, "Pending reward not found");
        }
        i();
    }
}
