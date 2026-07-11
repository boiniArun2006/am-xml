package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.n f60779n;
    private final Map rl = Collections.synchronizedMap(new HashMap());

    public void n(String str, CN3 cn3) {
        JSONObject jSONObjectOptJSONObject;
        SHQ.j jVar = (SHQ.j) this.f60779n.get();
        if (jVar == null) {
            return;
        }
        JSONObject jSONObjectXMQ = cn3.xMQ();
        if (jSONObjectXMQ.length() < 1) {
            return;
        }
        JSONObject jSONObjectUo = cn3.Uo();
        if (jSONObjectUo.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectXMQ.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.rl) {
                try {
                    if (strOptString.equals(this.rl.get(str))) {
                        return;
                    }
                    this.rl.put(str, strOptString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", jSONObjectUo.optString(str));
                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                    jVar.rl("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", strOptString);
                    jVar.rl("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public r(oSp.n nVar) {
        this.f60779n = nVar;
    }
}
