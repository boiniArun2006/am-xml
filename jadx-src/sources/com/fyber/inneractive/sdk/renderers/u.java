package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.n0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.v1;
import com.fyber.inneractive.sdk.web.g0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class u implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f56796a;

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        String str2;
        v vVar = this.f56796a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(vVar));
        Context contextW = this.f56796a.w();
        v vVar2 = this.f56796a;
        com.fyber.inneractive.sdk.interfaces.e eVar = vVar2.f53796k;
        if (eVar != null) {
            contextW = vVar2.c(eVar.getLayout());
        }
        Context context = contextW;
        v vVar3 = this.f56796a;
        if (!vVar3.f53566f) {
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No context or no native click detected"));
        }
        com.fyber.inneractive.sdk.flow.x xVar = vVar3.f53562b;
        com.fyber.inneractive.sdk.response.e eVar2 = xVar == null ? null : ((q0) xVar).f53978b;
        if (eVar2 != null && (str2 = eVar2.f56860l) != null && str2.trim().length() > 0) {
            IAlog.d("AD_CLICKED", new Object[0]);
            z0.b(str2);
        }
        v vVar4 = this.f56796a;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = vVar4.f56803G == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY;
        com.fyber.inneractive.sdk.cache.session.e eVar3 = IAConfigManager.f53260M.f53297w.f53492a;
        if (eVar3 != null) {
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar3, aVar, cVar));
        }
        return this.f56796a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z2) {
        if (z2) {
            v vVar = this.f56796a;
            if (!vVar.f53804s) {
                vVar.f53804s = true;
                com.fyber.inneractive.sdk.interfaces.e eVar = vVar.f53796k;
                if (eVar != null) {
                    vVar.d(eVar.isCloseButtonDisplay());
                }
            }
            v vVar2 = this.f56796a;
            if (!vVar2.f53802q) {
                vVar2.f53802q = true;
                v1 v1Var = new v1(TimeUnit.MILLISECONDS, vVar2.f53803r);
                vVar2.f53798m = v1Var;
                v1Var.f57050e = new n0(vVar2);
                v1Var.f57049d = false;
                v1Var.f57048c.sendEmptyMessage(1932593528);
            }
            com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f56796a.f53796k;
            if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
                return;
            }
            v vVar3 = this.f56796a;
            vVar3.f53801p = false;
            com.fyber.inneractive.sdk.interfaces.e eVar3 = vVar3.f53796k;
            if (eVar3 != null) {
                eVar3.disableCloseButton();
            }
            com.fyber.inneractive.sdk.util.a aVar = vVar3.f53807v;
            aVar.f56980d = 0L;
            aVar.f56981e = 0L;
            aVar.f56982f = 0L;
            aVar.f56978b = false;
        }
    }

    public u(v vVar) {
        this.f56796a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        v vVar = this.f56796a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(vVar));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        v vVar = this.f56796a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(vVar));
        v vVar2 = this.f56796a;
        vVar2.f56800D = true;
        vVar2.P();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        v vVar = this.f56796a;
        vVar.w();
        vVar.c(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        v vVar = this.f56796a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(vVar));
        v vVar2 = this.f56796a;
        if (vVar2.f56800D) {
            vVar2.f56800D = false;
            vVar2.P();
            return;
        }
        if (vVar2.f56803G == UnitDisplayType.REWARDED) {
            vVar2.O();
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56796a.f53796k;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.f56796a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f56796a.a(new WebViewRendererProcessHasGoneError());
        this.f56796a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        v vVar = this.f56796a;
        vVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(vVar));
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56796a.f53796k;
        if (eVar == null || eVar.getLayout() == null) {
            return;
        }
        v vVar2 = this.f56796a;
        if (!vVar2.f56801E) {
            com.fyber.inneractive.sdk.network.b0.a(vVar2.f53796k.getLayout().getContext(), str, str2, this.f56796a.f53562b);
            v vVar3 = this.f56796a;
            vVar3.f56801E = true;
            IAlog.a("%sreporting auto redirect", IAlog.a(vVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(vVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z2) {
        String str;
        if (z2) {
            v vVar = this.f56796a;
            if (!vVar.f56809y) {
                vVar.f56809y = true;
                if (vVar.f53562b != null) {
                    IAmraidWebViewController iAmraidWebViewController = vVar.f56810z;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    com.fyber.inneractive.sdk.response.e eVar = ((q0) vVar.f53562b).f53978b;
                    if (eVar != null && (str = eVar.f56859k) != null && str.trim().length() > 0) {
                        IAlog.e("%sfiring impression!", IAlog.a(vVar));
                        IAlog.d("AD_IMPRESSION", new Object[0]);
                        z0.b(str);
                    }
                    com.fyber.inneractive.sdk.web.m mVar = vVar.f56810z.f57113b;
                    if (mVar != null) {
                        mVar.a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    com.fyber.inneractive.sdk.cache.session.enums.c cVar = vVar.f56803G == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_DISPLAY;
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.f53260M.f53297w.f53492a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                    vVar.E();
                    vVar.J();
                }
            }
        }
        v vVar2 = this.f56796a;
        vVar2.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(vVar2), Boolean.valueOf(z2));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z2, Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56796a.f53796k;
        if (eVar != null) {
            eVar.setActivityOrientation(z2, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56796a.f53796k;
        if (eVar == null || eVar.getLayout() == null) {
            return false;
        }
        v vVar = this.f56796a;
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(vVar.c(vVar.f53796k.getLayout()), str);
        if (zStartRichMediaIntent) {
            this.f56796a.c(false);
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        this.f56796a.e(false);
        v vVar = this.f56796a;
        InneractiveUnitController.EventsListener eventsListener = vVar.f53563c;
        if (eventsListener != null) {
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(vVar.f53561a, mraidVideoFailedToDisplayError);
        }
    }
}
