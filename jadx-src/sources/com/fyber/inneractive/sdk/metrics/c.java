package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f54071g = String.valueOf(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f54072h = String.valueOf(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f54073i = String.valueOf(24);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f54074j = String.valueOf(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f54076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f54077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f54078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f54079f;

    public c(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f54077d = eVar;
        this.f54078e = inneractiveAdRequest;
        this.f54075b = str;
        this.f54076c = unitDisplayType;
        this.f54079f = jSONArray;
    }

    public final void a() {
        d dVar = d.f54080d;
        g gVarA = dVar.a(this.f54075b);
        HashMap mapJ = gVarA.j();
        if (!gVarA.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(this.f54075b).toString());
            return;
        }
        dVar.f54081a.remove(this.f54075b);
        r.f57025a.execute(new b(this, gVarA, mapJ));
    }
}
