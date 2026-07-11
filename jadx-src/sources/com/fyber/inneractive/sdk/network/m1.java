package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f54289a;

    public m1(n1 n1Var) {
        this.f54289a = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        n1 n1Var = this.f54289a;
        t0 t0Var = (t0) com.fyber.inneractive.sdk.util.v.a(n1Var.f54291b);
        Thread thread = (Thread) com.fyber.inneractive.sdk.util.v.a(this.f54289a.f54290a);
        if (t0Var == null || t0Var.f54320f == i1.DONE || t0Var.f54320f == i1.RESOLVED) {
            return;
        }
        boolean zV2 = t0Var.v();
        IAlog.a("%s : NetworkWatchdogHolder : should report: %s", IAlog.a(n1.class), Boolean.valueOf(zV2));
        if (zV2) {
            if (thread != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                Exception exc = new Exception();
                exc.setStackTrace(stackTrace);
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.getBuffer().toString();
            } else {
                string = "";
            }
            String strR = t0Var.r();
            InneractiveAdRequest inneractiveAdRequest = t0Var instanceof q0 ? ((q0) t0Var).f54300p : null;
            com.fyber.inneractive.sdk.response.e eVar = t0Var instanceof f1 ? ((f1) t0Var).f54256s : null;
            u uVar = u.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
            JSONArray jSONArrayB = t0Var.k() != null ? t0Var.k().b() : null;
            w wVar = new w(eVar);
            wVar.f54359c = uVar;
            wVar.f54357a = inneractiveAdRequest;
            wVar.f54360d = jSONArrayB;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", strR);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "url", strR);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
            }
            Integer numValueOf = Integer.valueOf(n1Var.f54292c);
            try {
                jSONObject.put("total_time", numValueOf);
            } catch (Exception unused3) {
                IAlog.f("Got exception adding param to json object: %s, %s", "total_time", numValueOf);
            }
            wVar.f54362f.put(jSONObject);
            wVar.a((String) null);
        }
        IAlog.a("%s : NetworkWatchdogHolder should cancel by timeout: %d", IAlog.a(n1Var), Integer.valueOf(n1Var.f54292c));
        t0Var.d();
    }
}
