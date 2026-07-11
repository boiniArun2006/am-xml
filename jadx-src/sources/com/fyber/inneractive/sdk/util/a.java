package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f56977a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56979c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56978b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f56980d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56981e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f56982f = 0;

    public final void a(boolean z2) {
        this.f56979c = z2;
        boolean z3 = this.f56978b;
        String str = MRAIDPresenter.CLOSE;
        if (z3) {
            if (z2) {
                str = "skip";
            }
            IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", str);
        } else {
            if (z2) {
                str = "skip";
            }
            IAlog.a("%s%s timer started", "AdExperienceLatency: ", str);
            this.f56980d = System.currentTimeMillis();
            this.f56978b = true;
        }
    }

    public final void a() {
        if (!this.f56978b || this.f56981e <= 0) {
            return;
        }
        this.f56982f += System.currentTimeMillis() - this.f56981e;
        this.f56981e = 0L;
    }

    public final void a(String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (!this.f56978b || this.f56979c) {
            return;
        }
        String strA = c0.a(System.currentTimeMillis(), this.f56980d, this.f56982f);
        InneractiveAdSpot inneractiveAdSpot = this.f56977a;
        com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
        InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f53977a : null;
        com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.f53978b : null;
        JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f53979c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f54359c = uVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("close_action_latency", strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "close_action_latency", strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("origin", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
            }
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
        this.f56980d = 0L;
        this.f56981e = 0L;
        this.f56982f = 0L;
        this.f56978b = false;
    }
}
