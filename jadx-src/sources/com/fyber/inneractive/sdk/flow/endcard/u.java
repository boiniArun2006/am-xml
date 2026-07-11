package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class u extends a implements ValueCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.vast.a f53656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.d f53657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f53658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f53659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewGroup f53660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f53661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f53662i;

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
        i1 i1Var = e().f54431a;
        if (i1Var != null) {
            i1Var.a(false);
        }
    }

    public q d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        ViewGroup viewGroup = this.f53660g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f53659f) {
            return null;
        }
        i1 i1Var = e().f54431a;
        com.fyber.inneractive.sdk.web.m mVar = i1Var == null ? null : i1Var.f57113b;
        if (mVar == null) {
            return null;
        }
        ViewGroup viewGroupA = a.a(mVar);
        this.f53660g = viewGroupA;
        return viewGroupA;
    }

    public final com.fyber.inneractive.sdk.player.controller.d e() {
        com.fyber.inneractive.sdk.player.controller.d dVar = this.f53657d;
        if (dVar == null) {
            b bVar = this.f53585b;
            dVar = new com.fyber.inneractive.sdk.player.controller.d(bVar.f53588c.f53983a, this.f53656c, bVar.i(), d());
            x0 x0Var = this.f53585b.f53588c;
            i1 i1Var = dVar.f54431a;
            if (i1Var != null) {
                if (i1Var.f57130s == null) {
                    i1Var.setAdContent(x0Var.f53984b);
                }
                if (i1Var.f57129r == null) {
                    i1Var.setAdRequest(x0Var.f53985c);
                }
                if (i1Var.f57131t == null) {
                    i1Var.setAdResponse(x0Var.f53986d);
                }
            }
            this.f53657d = dVar;
        }
        return dVar;
    }

    public boolean f() {
        com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.f53260M.f53294t;
        return sVar != null && sVar.f53466b.a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            IAlog.a("%s Playable detected: %s", this.f53584a, str);
            try {
                this.f53585b.a(new JSONArray(str));
            } catch (JSONException e2) {
                IAlog.f("%s invalid playable detection method: %s", this.f53584a, e2.getMessage());
            }
        }
        this.f53585b.m();
    }

    public u(b bVar) {
        super(bVar);
        this.f53659f = false;
        this.f53661h = new AtomicBoolean(false);
        this.f53662i = new s(this);
        x0 x0Var = bVar.f53588c;
        t0 t0Var = x0Var.f53984b;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f53985c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f53986d;
        this.f53656c = new com.fyber.inneractive.sdk.flow.vast.a(gVar.f56862n, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.f56853e, gVar.f56854f, t0Var.f53980d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f54431a;
        if (i1Var != null) {
            UnitDisplayType unitDisplayType = dVarE.f54433c;
            if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            i1Var.l();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        a();
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f54431a;
        if (i1Var != null) {
            i1Var.e();
            dVarE.f54431a = null;
        }
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        com.fyber.inneractive.sdk.web.g tVar;
        String str = this.f53658e;
        if (!TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.player.controller.d dVarE = e();
            if (aVar == null) {
                tVar = this.f53662i;
            } else {
                tVar = new t(this, aVar);
            }
            dVarE.a(str, tVar, !(this instanceof p));
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
    }
}
