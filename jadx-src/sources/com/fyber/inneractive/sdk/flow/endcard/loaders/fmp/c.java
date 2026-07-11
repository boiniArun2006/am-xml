package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import android.text.TextUtils;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.g;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f53638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f53639b;

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z2) {
        String str = (String) obj;
        if (str != null && exc == null) {
            ((p) this.f53639b.f()).f53658e = str.concat("<style>body {margin: 0px; background-color: rgba(0, 0, 0, 0.0);}</style>");
            ((p) this.f53639b.f()).f53648l = z2;
            ((p) this.f53639b.f()).b(this.f53638a);
            return;
        }
        if (exc == null || (exc instanceof g) || z2) {
            return;
        }
        o oVar = this.f53639b;
        IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", "TemplateCallback");
        JSONObject jSONObject = new JSONObject();
        String strA = v.a(exc);
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject.put(MRAIDPresenter.ERROR, strA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", MRAIDPresenter.ERROR, strA);
            }
        }
        String strN = oVar.n();
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
        x0 x0Var = oVar.f53588c;
        t tVar = t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f53985c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f53986d;
        JSONArray jSONArray = x0Var.f53988f;
        w wVar = new w(gVar);
        wVar.f54358b = tVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArray;
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
    }

    public c(o oVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f53639b = oVar;
        this.f53638a = aVar;
    }
}
