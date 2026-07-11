package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class d1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f56993a;

    public d1(Looper looper, com.fyber.inneractive.sdk.network.f fVar) {
        super(looper);
        this.f56993a = new WeakReference(fVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String strA;
        String string;
        super.handleMessage(message);
        e1 e1Var = (e1) v.a(this.f56993a);
        if (e1Var != null) {
            com.fyber.inneractive.sdk.network.f fVar = (com.fyber.inneractive.sdk.network.f) e1Var;
            int i2 = message.what;
            if (i2 == 12312329 || i2 == 20150330) {
                if (fVar.f54251f && fVar.f54246a.size() > 0) {
                    while (true) {
                        JSONObject jSONObject = null;
                        string = null;
                        if (fVar.f54246a.size() <= 0) {
                            break;
                        }
                        try {
                            jSONObject = (JSONObject) fVar.f54246a.poll();
                        } catch (Throwable unused) {
                        }
                        if (jSONObject != null) {
                            fVar.f54247b.put(jSONObject);
                        }
                    }
                    if (fVar.f54247b.length() > 0) {
                        JSONArray jSONArray = fVar.f54247b;
                        int i3 = com.fyber.inneractive.sdk.config.k.f53392a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            strA = com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u + IAConfigManager.f53260M.f53283i.f53398f;
                        } else {
                            strA = com.fyber.inneractive.sdk.config.a.a(property, "Event");
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            string = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (string != null) {
                            IAConfigManager.f53260M.f53292r.a(new com.fyber.inneractive.sdk.network.x0(new com.fyber.inneractive.sdk.network.e(strA, jSONArray, jCurrentTimeMillis), strA, string));
                        }
                        fVar.f54247b = new JSONArray();
                    }
                }
                d1 d1Var = fVar.f54249d;
                if (d1Var != null) {
                    d1Var.removeMessages(12312329);
                    long j2 = fVar.f54250e * 1000;
                    d1 d1Var2 = fVar.f54249d;
                    if (d1Var2 != null) {
                        d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j2));
                    }
                }
            }
        }
    }
}
