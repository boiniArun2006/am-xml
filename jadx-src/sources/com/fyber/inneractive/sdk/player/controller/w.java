package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.h0;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f54497a;

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        z zVar = this.f54497a;
        zVar.getClass();
        sb.append(IAlog.a(zVar));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.a(sb.toString(), new Object[0]);
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var != null) {
            g0Var.a(str, str2);
        }
    }

    public w(z zVar) {
        this.f54497a = zVar;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z2) {
        z zVar = this.f54497a;
        zVar.getClass();
        IAlog.a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.a(zVar), Boolean.valueOf(z2));
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var == null || !z2) {
            return;
        }
        g0Var.f();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        z zVar = this.f54497a;
        if (zVar.f54507g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.f54504d;
            this.f54497a.f54507g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        z zVar = this.f54497a;
        if (zVar.f54507g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.f54504d;
            this.f54497a.f54507g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        z zVar = this.f54497a;
        zVar.getClass();
        IAlog.a("%sweb view callback: onClickedAndOpen", IAlog.a(zVar));
        this.f54497a.a(w0.COMPANION.a());
        z zVar2 = this.f54497a;
        if (zVar2.f54507g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f54501a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = ((com.fyber.inneractive.sdk.player.n) fVar).f56387t.f53605b.a();
                if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                    fVar.a((com.fyber.inneractive.sdk.flow.endcard.c) bVarA, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            }
            IAlog.d("AD_CLICKED", new Object[0]);
            this.f54497a.f54507g.e();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        z zVar = this.f54497a;
        zVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(zVar));
        this.f54497a.a(w0.COMPANION.a());
        z zVar2 = this.f54497a;
        if (zVar2.f54507g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f54501a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f56387t;
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVar.f53605b.a();
                Object obj = bVarA;
                if (bVarA != null) {
                    boolean zJ = bVarA.j();
                    obj = bVarA;
                    if (zJ) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Other);
                        obj = cVar;
                        if (cVar == null) {
                            com.fyber.inneractive.sdk.flow.endcard.c cVar2 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Html);
                            obj = cVar2;
                            if (cVar2 == null) {
                                com.fyber.inneractive.sdk.flow.endcard.c cVar3 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Iframe);
                                obj = cVar3;
                                if (cVar3 == null) {
                                    obj = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.Static);
                                }
                            }
                        }
                    }
                }
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = nVar.f56387t.f53605b.a();
                com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK;
                com.fyber.inneractive.sdk.response.i iVar = obj instanceof com.fyber.inneractive.sdk.response.i ? (com.fyber.inneractive.sdk.response.i) obj : null;
                List listA = iVar != null ? iVar.a(xVar) : null;
                if (listA != null && !listA.isEmpty()) {
                    fVar.a((com.fyber.inneractive.sdk.response.i) obj, VideoClickOrigin.COMPANION, xVar);
                } else {
                    this.f54497a.getClass();
                    if ((bVarA2 instanceof com.fyber.inneractive.sdk.flow.endcard.o) && ((com.fyber.inneractive.sdk.flow.endcard.o) bVarA2).f53645h.f57067b > 0) {
                        nVar.a(nVar.f56383p, VideoClickOrigin.COMPANION, xVar);
                    }
                }
            }
            IAlog.d("AD_CLICKED", new Object[0]);
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f54497a.f54504d;
            if (sVar != null) {
                sVar.g();
            }
            return this.f54497a.f54507g.a(str, g1Var, false);
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("mListener is null, internal SDK fatal error"));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var != null) {
            g0Var.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        View endCardView = this.f54497a.f54504d.getEndCardView();
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var == null) {
            return false;
        }
        g0Var.a(endCardView, str);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var != null) {
            g0Var.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z2, Orientation orientation) {
        z zVar = this.f54497a;
        zVar.getClass();
        IAlog.a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.a(zVar), Boolean.valueOf(z2), orientation.toString());
        g0 g0Var = this.f54497a.f54507g;
        if (g0Var != null) {
            g0Var.a(z2, orientation);
        }
    }
}
