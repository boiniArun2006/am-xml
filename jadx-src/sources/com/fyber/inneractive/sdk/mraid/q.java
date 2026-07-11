package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import com.fyber.inneractive.sdk.web.j1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class q extends e {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        com.fyber.inneractive.sdk.util.d0 d0Var;
        String str = (String) this.f54205b.get("url");
        IAlog.e("IAmraidActionOpen: opening Internal Browser For Url: %s", str);
        i0 i0Var = this.f54206c;
        if (i0Var != null) {
            g1 g1Var = this.f54207d;
            j1 j1Var = i0Var.f57118g;
            if (j1Var != null) {
                d0Var = ((com.fyber.inneractive.sdk.web.b0) j1Var).a(str, g1Var);
            } else {
                com.fyber.inneractive.sdk.util.g0 g0Var = com.fyber.inneractive.sdk.util.g0.FAILED;
                Exception exc = new Exception("No webview listener available");
                if (com.fyber.inneractive.sdk.util.o.a(i0Var.f57113b) != null) {
                    com.fyber.inneractive.sdk.util.o.a(i0Var.f57113b).getClass();
                }
                d0Var = new com.fyber.inneractive.sdk.util.d0(g0Var, exc);
            }
            if (d0Var.f56991a == com.fyber.inneractive.sdk.util.g0.FAILED) {
                i0 i0Var2 = this.f54206c;
                k kVar = k.OPEN;
                Throwable th = d0Var.f56992b;
                i0Var2.a(kVar, th == null ? "unknown error" : th.getMessage());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.f54205b.get("url");
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final void d() {
        i0 i0Var = this.f54206c;
        if (i0Var != null) {
            i0Var.a(k.OPEN, "No native click was detected in a timely fashion");
        }
    }

    public q(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
