package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.d1;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class x implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f53491a;

    public x(IAConfigManager iAConfigManager) {
        this.f53491a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        com.fyber.inneractive.sdk.network.f fVar = this.f53491a.f53268F;
        fVar.getClass();
        int iA = IAConfigManager.f53260M.f53294t.f53466b.a("send_events_batch_interval", 30, -1);
        int i2 = iA >= 0 ? iA : 30;
        String property = System.getProperty("fyber.marketplace.use_batch_interval");
        if (property != null && !Boolean.getBoolean(property)) {
            i2 = 0;
        }
        fVar.f54251f = true;
        fVar.f54250e = i2;
        d1 d1Var = fVar.f54249d;
        if (d1Var != null && d1Var.hasMessages(12312329)) {
            fVar.f54249d.removeMessages(12312329);
        }
        long j2 = fVar.f54250e * 1000;
        d1 d1Var2 = fVar.f54249d;
        if (d1Var2 != null) {
            d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j2));
        }
        IAConfigManager iAConfigManager = this.f53491a;
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.f53270H;
        o oVar2 = iAConfigManager.f53294t.f53466b;
        JSONObject jSONObject = new JSONObject();
        String strA = oVar2.a("k", (String) null);
        if (strA != null) {
            try {
                jSONObject = new JSONObject(strA);
            } catch (JSONException unused) {
            }
        }
        dVar.getClass();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
        }
        dVar.f56921e.clear();
        dVar.f56921e.putAll(map);
    }
}
