package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f53644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.a f53645h;

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        p pVar = (p) f();
        View viewB = pVar.b();
        if (viewB != null) {
            com.fyber.inneractive.sdk.util.v.a(viewB);
            viewGroup.addView(viewB);
            i1 i1Var = pVar.e().f54431a;
            if (i1Var != null) {
                i1Var.a(true);
            }
        }
        a(this.f53590e, this.f53588c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new p(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        com.fyber.inneractive.sdk.web.a aVar = this.f53645h;
        com.fyber.inneractive.sdk.util.g gVar = com.fyber.inneractive.sdk.util.g.FMP_ENDCARD;
        gVar.a(aVar.f57066a);
        gVar.a(aVar.f57067b);
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Fmp;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean j() {
        return this.f53590e > 1;
    }

    public o(x0 x0Var, String str, int i2) {
        super(i2, x0Var);
        this.f53645h = new com.fyber.inneractive.sdk.web.a(null, 0);
        this.f53644g = str;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        View viewB = f().b();
        com.fyber.inneractive.sdk.player.ui.c cVarD = super.d();
        cVarD.f56418e = viewB;
        return cVarD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        p pVar = (p) f();
        if (pVar.f53659f && pVar.b() != null) {
            return true;
        }
        return false;
    }

    public final String n() {
        q qVar;
        com.fyber.inneractive.sdk.web.b bVar = (com.fyber.inneractive.sdk.web.b) ((p) f()).e().f54431a;
        if (bVar == null || (qVar = bVar.f57071N) == null) {
            return null;
        }
        return qVar.f53651c;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.isErrorAlreadyReported(com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING)) {
            return;
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", this.f53586a);
        JSONObject jSONObject = new JSONObject();
        String strA = com.fyber.inneractive.sdk.util.v.a(cause);
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject.put(MRAIDPresenter.ERROR, strA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", MRAIDPresenter.ERROR, strA);
            }
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            try {
                jSONObject.put(NodeModuleProcess.PROPERTY_VERSION, strN);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", NodeModuleProcess.PROPERTY_VERSION, strN);
            }
        }
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        x0 x0Var = this.f53588c;
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f53985c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f53986d;
        JSONArray jSONArray = x0Var.f53988f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f54358b = tVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArray;
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(int i2, x0 x0Var) {
        String strN = n();
        this.f53645h = new com.fyber.inneractive.sdk.web.a(strN, i2);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strN)) {
            try {
                jSONObject.put(NodeModuleProcess.PROPERTY_VERSION, strN);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", NodeModuleProcess.PROPERTY_VERSION, strN);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(((p) f()).f53648l);
        try {
            jSONObject.put("loaded_from_cache", boolValueOf);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FMP_COMPANION_SUCCESSFULLY_SHOWN;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f53985c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f53986d;
        JSONArray jSONArray = x0Var.f53988f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f54359c = uVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArray;
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
    }
}
