package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.endcard.r;
import com.fyber.inneractive.sdk.flow.endcard.t;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.x;
import com.fyber.inneractive.sdk.flow.vast.h;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.i;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.e1;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.web.i1;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f53617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f53618b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f53619c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f53620d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f53621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f53622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.c f53623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f53624h;

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.f53624h;
        com.fyber.inneractive.sdk.flow.endcard.c cVar = this.f53623g;
        bVar.getClass();
        if (cVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", cVar.i());
            bVar.f53616d.a(cVar);
        }
    }

    public final void b() {
        Iterator it = this.f53622f;
        if (it == null || !it.hasNext()) {
            return;
        }
        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) this.f53622f.next();
        this.f53623g = cVar;
        String str = null;
        if (cVar instanceof r) {
            r rVar = (r) cVar;
            this.f53618b.getClass();
            String str2 = rVar.f53592g.f54124f;
            x0 x0Var = rVar.f53588c;
            u uVar = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f53985c;
            g gVar = x0Var.f53986d;
            JSONArray jSONArray = x0Var.f53988f;
            w wVar = new w(gVar);
            wVar.f54359c = uVar;
            wVar.f54357a = inneractiveAdRequest;
            wVar.f54360d = jSONArray;
            wVar.a((String) null);
            com.fyber.inneractive.sdk.flow.endcard.u uVar2 = (com.fyber.inneractive.sdk.flow.endcard.u) rVar.f();
            uVar2.f53658e = str2;
            uVar2.a(this);
            return;
        }
        if (cVar instanceof v) {
            e eVar = this.f53619c;
            v vVar = (v) cVar;
            eVar.getClass();
            k kVar = vVar.f53663h;
            int i2 = c.f53625a[kVar.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                IAlog.f("%s Invalid static type: %s", "StaticCompanionEndCardLoader", kVar);
                return;
            }
            String str3 = vVar.f53592g.f54124f;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            IAlog.c("%s load Static End-Card image %s", "StaticCompanionEndCardLoader", str3);
            x0 x0Var2 = vVar.f53588c;
            u uVar3 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f53985c;
            g gVar2 = x0Var2.f53986d;
            JSONArray jSONArray2 = x0Var2.f53988f;
            w wVar2 = new w(gVar2);
            wVar2.f54359c = uVar3;
            wVar2.f54357a = inneractiveAdRequest2;
            wVar2.f54360d = jSONArray2;
            wVar2.a((String) null);
            IAConfigManager.f53260M.f53292r.a(new e1(new d(eVar, vVar, this), vVar.f53592g.f54124f, vVar.f53588c.f53984b.f53979c));
            return;
        }
        if (cVar instanceof x) {
            x xVar = (x) cVar;
            this.f53620d.getClass();
            if (xVar.f53592g.f54119a != i.Static) {
                x0 x0Var3 = xVar.f53588c;
                u uVar4 = u.VAST_COMPANION_LOAD_ATTEMPT;
                InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f53985c;
                g gVar3 = x0Var3.f53986d;
                JSONArray jSONArray3 = x0Var3.f53988f;
                w wVar3 = new w(gVar3);
                wVar3.f54359c = uVar4;
                wVar3.f54357a = inneractiveAdRequest3;
                wVar3.f54360d = jSONArray3;
                wVar3.a((String) null);
                String str4 = xVar.f53592g.f54124f;
                String strB = o.b("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(strB)) {
                    strB = strB.replace("$__SrcIframeUrl__$", str4);
                }
                com.fyber.inneractive.sdk.flow.endcard.u uVar5 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
                uVar5.f53658e = strB;
                uVar5.a(this);
                return;
            }
            x0 x0Var4 = xVar.f53588c;
            u uVar6 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest4 = x0Var4.f53985c;
            g gVar4 = x0Var4.f53986d;
            JSONArray jSONArray4 = x0Var4.f53988f;
            w wVar4 = new w(gVar4);
            wVar4.f54359c = uVar6;
            wVar4.f54357a = inneractiveAdRequest4;
            wVar4.f54360d = jSONArray4;
            wVar4.a((String) null);
            com.fyber.inneractive.sdk.model.vast.c cVar2 = xVar.f53592g;
            String str5 = cVar2.f54124f;
            String str6 = cVar2.f54125g;
            if (TextUtils.isEmpty(str6)) {
                com.fyber.inneractive.sdk.model.vast.b bVar = xVar.f53588c.f53986d.f56877L;
                if (bVar != null) {
                    str = bVar.f54104b;
                }
            } else {
                str = str6;
            }
            String strB2 = o.b("fyb_static_endcard_tmpl.html");
            if (!TextUtils.isEmpty(strB2)) {
                strB2 = strB2.replace("$__IMGSRC__$", str5);
                if (str != null) {
                    strB2 = strB2.replace("$__IMGHREF__$", str.replace("\"", "\\\""));
                }
            }
            com.fyber.inneractive.sdk.flow.endcard.u uVar7 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
            uVar7.f53658e = strB2;
            if (TextUtils.isEmpty(strB2)) {
                throw new h("End-Card HTML not loaded", "No template");
            }
            com.fyber.inneractive.sdk.player.controller.d dVarE = uVar7.e();
            dVarE.a();
            i1 i1Var = dVarE.f54431a;
            if (i1Var != null) {
                i1Var.f57153F = false;
            }
            dVarE.a(strB2, new t(uVar7, this), !(uVar7 instanceof p));
        }
    }

    public a(j jVar, x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f53617a = jVar;
        this.f53621e = x0Var;
        this.f53624h = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) {
        this.f53624h.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
        b();
    }
}
