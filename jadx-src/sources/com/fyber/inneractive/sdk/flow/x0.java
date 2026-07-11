package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f53984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f53985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f53986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f53987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f53988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.v f53989g;

    public x0(Context context, t0 t0Var) {
        com.fyber.inneractive.sdk.config.global.features.v vVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.f53979c;
        InneractiveAdRequest inneractiveAdRequest = t0Var.f53977a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.f53978b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.f56877L;
        if (rVar != null) {
            vVar = (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
            jSONArrayB = rVar.b();
        } else {
            vVar = null;
            jSONArrayB = null;
        }
        this.f53983a = context;
        this.f53984b = t0Var;
        this.f53985c = inneractiveAdRequest;
        this.f53986d = gVar;
        this.f53987e = bVar;
        this.f53989g = vVar;
        this.f53988f = jSONArrayB;
    }
}
