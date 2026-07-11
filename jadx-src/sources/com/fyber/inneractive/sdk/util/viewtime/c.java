package com.fyber.inneractive.sdk.util.viewtime;

import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.c0;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f57057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f57058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57059d;

    public final void a(boolean z2) {
        Object objA;
        r rVar;
        long j2 = this.f57052a;
        String str = String.format(Locale.US, "%d.%03d", Integer.valueOf((int) (j2 / 1000)), Integer.valueOf((int) (j2 % 1000)));
        u uVar = u.VAST_WATCHED_DURATION_AND_SKIP_ACTION;
        x xVar = this.f57057b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f53977a : null;
        e eVar = xVar != null ? xVar.f53978b : null;
        JSONArray jSONArrayB = (xVar == null || (rVar = xVar.f53979c) == null) ? null : rVar.b();
        w wVar = new w(eVar);
        wVar.f54359c = uVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArrayB;
        Boolean boolValueOf = Boolean.valueOf(this.f57059d);
        if (z2) {
            com.fyber.inneractive.sdk.util.a aVar = this.f57058c;
            aVar.getClass();
            objA = c0.a(System.currentTimeMillis(), aVar.f56980d, aVar.f56982f);
        } else {
            objA = -1;
        }
        wVar.a("duration", str, "is_skip_clickable", boolValueOf, "skip_action_latency", objA);
        wVar.a((String) null);
    }

    public c(x xVar, com.fyber.inneractive.sdk.util.a aVar, boolean z2) {
        this.f57057b = xVar;
        this.f57058c = aVar;
        this.f57059d = z2;
    }
}
