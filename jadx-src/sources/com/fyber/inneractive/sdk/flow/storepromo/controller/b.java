package com.fyber.inneractive.sdk.flow.storepromo.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.k;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class b implements com.fyber.inneractive.sdk.flow.storepromo.loader.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InneractiveAdRequest f53825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f53826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f53827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.ui.c f53828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.loader.b f53829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.b f53830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f53831g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a f53832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f53833i;

    public final void a() {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = this.f53828d;
        if (cVar != null) {
            if (cVar.f53916b != null && cVar.f53915a != null) {
                cVar.f53918d.setAnimationListener(cVar.f53923i);
                cVar.f53915a.setAnimation(cVar.f53918d);
                cVar.f53915a.setVisibility(8);
            }
            k kVar = this.f53833i;
            if (kVar == null || kVar.f53605b.a() == null || kVar.f53605b.a().f().b() == null) {
                return;
            }
            IAlog.a("%sonStorePromoDismissed restoring endcard focus", IAlog.a(kVar));
            kVar.f53605b.a().f().b().requestFocus();
        }
    }

    public b(com.fyber.inneractive.sdk.flow.storepromo.model.c cVar, com.fyber.inneractive.sdk.flow.storepromo.b bVar, com.fyber.inneractive.sdk.flow.storepromo.loader.b bVar2, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar, e eVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f53832h = aVar;
        this.f53827c = new c(cVar, this, this);
        this.f53830f = bVar;
        this.f53825a = inneractiveAdRequest;
        this.f53826b = eVar;
        this.f53829e = bVar2;
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar, com.fyber.inneractive.sdk.flow.storepromo.model.c cVar) {
        this.f53828d = new com.fyber.inneractive.sdk.flow.storepromo.ui.c(IAConfigManager.f53260M.f53295u.a(), aVar, this.f53830f);
        u uVar = u.VAST_EVENT_SP_LOADED;
        InneractiveAdRequest inneractiveAdRequest = this.f53825a;
        e eVar = this.f53826b;
        String str = cVar.f53906h;
        w wVar = new w(uVar, inneractiveAdRequest, eVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("templateURL", str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
        IAlog.a("StorePromoController: onContentLoadedSuccess", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, String str2) {
        this.f53831g = true;
        a();
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.f53832h;
        if (aVar != null) {
            aVar.a(bVar, str, str2);
        }
    }
}
