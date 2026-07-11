package com.fyber.inneractive.sdk.flow;

import a88.C;
import a88.Dsr;
import a88.Ml;
import a88.Wre;
import a88.w6;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class u extends k implements com.fyber.inneractive.sdk.player.s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f53927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f53928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f53929o = new t(this);

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (this.f53927m != null) {
            com.fyber.inneractive.sdk.response.e eVar = this.f53694b;
            this.f53927m.a((eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).f56877L) == null) ? null : bVar.f54106d.size() == 0 ? new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, null) : new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, null), null, true);
        }
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(this.f53704l);
        this.f53703k.a();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_vast_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        IAlog.a(IAlog.a(this) + "start called", new Object[0]);
        a(this.f53699g, (com.fyber.inneractive.sdk.response.g) this.f53694b, this.f53693a, this);
    }

    public final com.fyber.inneractive.sdk.player.ui.remote.g i() {
        com.fyber.inneractive.sdk.player.a aVar;
        com.fyber.inneractive.sdk.player.ui.remote.g gVar;
        com.fyber.inneractive.sdk.player.t tVar = this.f53927m;
        if (tVar == null || (aVar = tVar.f56402f) == null || (gVar = ((com.fyber.inneractive.sdk.player.n) aVar).f56388u) == null) {
            return null;
        }
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(this.f53704l);
        this.f53703k.a();
    }

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.player.s sVar) {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        w6 w6VarN;
        String str;
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.model.vast.b bVar2;
        InneractiveAdRequest inneractiveAdRequest2 = this.f53693a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? this.f53698f : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig == null && gVar != null) {
            selectedUnitConfig = com.fyber.inneractive.sdk.config.a.a(gVar.f56861m);
        }
        Ml mlRl = null;
        com.fyber.inneractive.sdk.model.vast.b bVar3 = gVar == null ? null : gVar.f56877L;
        if (bVar3 != null && bVar3.f54106d.size() < bVar3.f54111i) {
            bVar3.f54106d.clear();
            bVar3.f54109g.clear();
            bVar3.f54106d.addAll(bVar3.f54113k);
            bVar3.f54109g.addAll(bVar3.f54114l);
        }
        t0 t0Var = new t0(selectedUnitConfig, rVar, gVar, inneractiveAdRequest);
        this.f53695c = t0Var;
        com.fyber.inneractive.sdk.player.t tVar2 = new com.fyber.inneractive.sdk.player.t(gVar, inneractiveAdRequest, t0Var, sVar);
        this.f53927m = tVar2;
        t0 t0Var2 = (t0) this.f53695c;
        t0Var2.f53925i = tVar2;
        t0Var2.f53982f = this.f53700h;
        this.f53928n = bVar3 != null ? bVar3.f54116n : null;
        tVar2.f56401e = null;
        if (gVar != null && (bVar2 = gVar.f56877L) != null) {
            tVar2.f56401e = (com.fyber.inneractive.sdk.model.vast.r) bVar2.f54106d.poll();
        }
        if (tVar2.f56401e == null) {
            InneractiveVideoError.Error playerError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError();
            int i2 = com.fyber.inneractive.sdk.player.r.f56396a[playerError.ordinal()];
            if (i2 == 1) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if (i2 == 2) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
            } else if (i2 == 3) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            } else if (i2 == 4) {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_PRE_BUFFER_TIMEOUT;
            } else if (i2 != 5) {
                IAlog.a("IAReportError, Does not know player error " + playerError.getErrorString(), new Object[0]);
                tVar = com.fyber.inneractive.sdk.network.t.VAST_UNKNOWN_PLAYER_ERROR;
            } else {
                tVar = com.fyber.inneractive.sdk.network.t.VAST_ERROR_BUFFER_TIMEOUT;
            }
            InneractiveAdRequest inneractiveAdRequest3 = tVar2.f56398b;
            com.fyber.inneractive.sdk.response.g gVar2 = tVar2.f56399c;
            JSONArray jSONArrayB = tVar2.f56404h.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar.f54358b = tVar;
            wVar.f54357a = inneractiveAdRequest3;
            wVar.f54360d = jSONArrayB;
            wVar.a((String) null);
            sVar.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.VAST_NO_MEDIA_FILES));
        } else {
            try {
                tVar2.f56402f = tVar2.f56397a.a();
            } catch (Throwable th) {
                tVar2.f56400d.a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, i.COULD_NOT_CREATE_FLOW_MANAGER, th));
            }
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f56402f;
            if (aVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) aVar;
                com.fyber.inneractive.sdk.measurement.e eVar = nVar.f56324d;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.measurement.f fVar = new com.fyber.inneractive.sdk.measurement.f();
                    ArrayList arrayList = nVar.f56383p.f54107e;
                    t0 t0Var3 = nVar.f56322b;
                    try {
                        try {
                            Wre wre = Wre.VIDEO;
                            Dsr dsr = Dsr.UNSPECIFIED;
                            C c2 = C.NATIVE;
                            w6VarN = w6.n(wre, dsr, c2, c2, false);
                        } catch (Throwable th2) {
                            fVar.a(th2);
                            w6VarN = null;
                        }
                        ArrayList arrayListA = fVar.a(arrayList);
                        a88.o oVar = eVar.f54041e;
                        if (oVar != null && (str = eVar.f54038b) != null) {
                            try {
                                mlRl = Ml.rl(oVar, str, arrayListA, "", "");
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                        a88.n nVarRl = a88.n.rl(w6VarN, mlRl);
                        fVar.f54046a = nVarRl;
                        fVar.f54047b = a88.j.n(nVarRl);
                        fVar.f54048c = VI.n.Uo(fVar.f54046a);
                        fVar.f54046a.J2();
                        fVar.f54051f = t0Var3;
                    } catch (Throwable th4) {
                        fVar.a(th4);
                    }
                    nVar.f56325e = fVar;
                    nVar.f56326f = new com.fyber.inneractive.sdk.player.p(fVar);
                }
                if (nVar.f56325e == null && (bVar = nVar.f56383p) != null) {
                    for (com.fyber.inneractive.sdk.measurement.h hVar : bVar.f54107e) {
                        com.fyber.inneractive.sdk.measurement.i iVar = com.fyber.inneractive.sdk.measurement.i.ERROR_DURING_RESOURCE_LOAD;
                        com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_VERIFICATION_NOT_EXECUTED;
                        com.fyber.inneractive.sdk.player.n.a(new com.fyber.inneractive.sdk.measurement.g(hVar.a(xVar), iVar), xVar);
                    }
                }
            }
            tVar2.a();
        }
        if (TextUtils.isEmpty(this.f53928n)) {
            return;
        }
        IAConfigManager.f53260M.f53292r.a(new com.fyber.inneractive.sdk.network.v0(this.f53929o, com.fyber.inneractive.sdk.util.o.f57018a, new com.fyber.inneractive.sdk.cache.l(this.f53928n)));
    }

    public final void a(Exception exc, String str, boolean z2) {
        HashMap map = new HashMap();
        map.put("description", str);
        if (exc != null) {
            map.put("exception", exc.getMessage());
        }
        if (i() != null) {
            i().f56502a.a();
        }
        com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR.name(), this.f53928n, this.f53693a, this.f53694b, map, Boolean.valueOf(z2));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.r.f57025a.execute(new e(new f(this.f53694b, this.f53693a, "send_failed_vast_creatives", this.f53699g.b()), inneractiveInfrastructureError));
        b(inneractiveInfrastructureError);
    }
}
