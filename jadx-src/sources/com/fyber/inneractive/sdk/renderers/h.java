package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.g0;
import com.safedk.android.internal.special.SpecialsBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f56757a;

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z2, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z2) {
    }

    public h(n nVar) {
        this.f56757a = nVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        s0 s0Var;
        l0 l0Var;
        String str2;
        n nVar = this.f56757a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(nVar));
        ViewGroup viewGroup = this.f56757a.f56769p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.f57018a : this.f56757a.f56769p.getContext();
        if (context != null) {
            n nVar2 = this.f56757a;
            if (nVar2.f53566f) {
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.f53562b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f53978b : null;
                if (eVar != null && (str2 = eVar.f56860l) != null && str2.trim().length() > 0) {
                    IAlog.d("AD_CLICKED", new Object[0]);
                    z0.b(str2);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f56757a.f53562b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f53980d) != null && (l0Var = ((r0) s0Var).f53417c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                    com.fyber.inneractive.sdk.cache.session.enums.c cVar = l0Var.f53402b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.f53260M.f53297w.f53492a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                }
                return this.f56757a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.f56757a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        this.f56757a.d(true);
        n nVar = this.f56757a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(nVar));
        n nVar2 = this.f56757a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.f53563c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(nVar2.f53561a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        n nVar = this.f56757a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(nVar));
        n nVar2 = this.f56757a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.f53563c;
        if (eventsListener != null) {
            SpecialsBridge.fyberOnAdExpanded((InneractiveAdViewEventsListener) eventsListener, nVar2.f53561a);
        }
        n nVar3 = this.f56757a;
        nVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(nVar3));
        this.f56757a.d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        n nVar = this.f56757a;
        nVar.w();
        nVar.c(false);
        this.f56757a.F();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        n nVar = this.f56757a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(nVar));
        n nVar2 = this.f56757a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.f53563c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(nVar2.f53561a);
        }
        this.f56757a.N();
        n nVar3 = this.f56757a;
        nVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(nVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f56757a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        n nVar = this.f56757a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(nVar));
        ViewGroup viewGroup = this.f56757a.f56769p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        n nVar2 = this.f56757a;
        if (!nVar2.f56775v) {
            com.fyber.inneractive.sdk.network.b0.a(nVar2.f56769p.getContext(), str, str2, this.f56757a.f53562b);
            n nVar3 = this.f56757a;
            nVar3.f56775v = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(nVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(nVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z2) {
        s0 s0Var;
        l0 l0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        n nVar = this.f56757a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(nVar), Boolean.valueOf(z2));
        if (z2) {
            n nVar2 = this.f56757a;
            if (!nVar2.f56768o) {
                IAlog.a("%sonShownForTheFirstTime called", IAlog.a(nVar2));
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.f53562b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f53978b : null;
                if (eVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = nVar2.f56766m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    String str = eVar.f56859k;
                    if (str != null && str.trim().length() > 0) {
                        IAlog.e("%sfiring impression!", IAlog.a(nVar2));
                        IAlog.d("AD_IMPRESSION", new Object[0]);
                        z0.b(str);
                    }
                    nVar2.E();
                }
                long jK = nVar2.K();
                nVar2.f56764k = jK;
                if (jK != 0) {
                    nVar2.a(true, jK);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = nVar2.f53562b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f53980d) != null && (l0Var = ((r0) s0Var).f53417c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (l0Var.f53402b == UnitDisplayType.MRECT) {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                    } else {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    }
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.f53260M.f53297w.f53492a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                }
                this.f56757a.f56768o = true;
                return;
            }
            d dVar = nVar2.f56778y;
            if (dVar != null && !dVar.f56746h && !dVar.f56745g && dVar.f56744f != 0) {
                dVar.f56744f = 0L;
                dVar.f56745g = true;
                dVar.a();
            }
            this.f56757a.N();
            return;
        }
        d dVar2 = this.f56757a.f56778y;
        if (dVar2 != null && dVar2.f56745g) {
            dVar2.f56745g = false;
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar2.f56748j);
        }
        this.f56757a.d(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(com.fyber.inneractive.sdk.util.o.a(this.f56757a.x()), str);
        if (zStartRichMediaIntent) {
            n nVar = this.f56757a;
            if (nVar.f53563c != null) {
                nVar.c(false);
            }
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        n nVar = this.f56757a;
        InneractiveUnitController.EventsListener eventsListener = nVar.f53563c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(nVar.f53561a, mraidVideoFailedToDisplayError);
        }
    }
}
