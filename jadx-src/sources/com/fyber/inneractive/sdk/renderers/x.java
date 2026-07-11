package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.m0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.player.controller.g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class x extends p0 implements g0, com.fyber.inneractive.sdk.flow.storepromo.observer.a, com.fyber.inneractive.sdk.rtb.watermark.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public WeakReference f56812A;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.g f56816E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public f0 f56818G;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.viewtime.c f56824M;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.e f56825x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f56826y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.b f56827z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f56813B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f56814C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f56815D = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public UnitDisplayType f56817F = UnitDisplayType.INTERSTITIAL;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f56819H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final w f56820I = new w(this);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final RelativeLayout.LayoutParams f56821J = new RelativeLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f56822K = false;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f56823L = false;

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar;
        f0 f0Var;
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.f53294t.f53466b;
        oVar.getClass();
        String str = iAConfigManager.f53278d;
        if (!(oVar.f53409b.containsKey(str) ? (com.fyber.inneractive.sdk.config.m) oVar.f53409b.get(str) : new com.fyber.inneractive.sdk.config.m()).f53405a.containsKey("endcard")) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56827z;
            if (bVar == null && (f0Var = this.f56818G) != null) {
                bVar = f0Var.f56753a;
            }
            com.fyber.inneractive.sdk.config.global.features.v vVar = null;
            com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
            com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.f53605b.a() : null;
            if (bVarA != null && bVarA.i() == com.fyber.inneractive.sdk.model.vast.i.Static) {
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f53562b;
                if (xVar2 != null && (rVar = ((t0) xVar2).f53979c) != null) {
                    vVar = (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
                }
                UnitDisplayType unitDisplayType = this.f56817F;
                vVar.getClass();
                int i2 = com.fyber.inneractive.sdk.config.global.features.t.f53364a[unitDisplayType.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 && (boolC = vVar.c("countdown_iv")) != null) {
                        return boolC.booleanValue();
                    }
                    return false;
                }
                Boolean boolC2 = vVar.c("countdown_rv");
                if (boolC2 != null) {
                    return boolC2.booleanValue();
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
        this.f56822K = true;
        m0 m0Var = this.f53808w;
        if (m0Var != null) {
            m0Var.cancel();
            this.f53808w = null;
        }
        if (!this.f53804s) {
            this.f53804s = true;
            com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
            if (eVar != null) {
                d(eVar.isCloseButtonDisplay());
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f56825x;
        if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
            return;
        }
        e(true ^ this.f53805t);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean B() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f56826y;
        return mVar != null && mVar.b();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void G() {
        View view = this.f53570j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return this.f56822K;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || (rVar = ((t0) xVar).f53979c) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.s) rVar.a(com.fyber.inneractive.sdk.config.global.features.s.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int L() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || (rVar = ((t0) xVar).f53979c) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.s) rVar.a(com.fyber.inneractive.sdk.config.global.features.s.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f56826y;
        return mVar != null && mVar.c();
    }

    public final void O() {
        if (this.f56814C || this.f53563c == null) {
            return;
        }
        this.f56814C = true;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar != null && (eVar.wasDismissedByUser() || IAConfigManager.f53260M.f53294t.f53466b.a("endcard").a())) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f53562b;
            if (xVar2 != null) {
                t0 t0Var = (t0) xVar2;
                if (t0Var.f53925i != null) {
                    String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar = t0Var.f53925i;
                    if (tVar != null) {
                        tVar.a("EVENT_TRACKING", strArr);
                    }
                }
            }
            com.fyber.inneractive.sdk.model.vast.x xVar3 = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE_LINEAR;
            com.fyber.inneractive.sdk.flow.x xVar4 = this.f53562b;
            if (xVar4 != null) {
                t0 t0Var2 = (t0) xVar4;
                if (t0Var2.f53925i != null) {
                    String[] strArr2 = {xVar3.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var2.f53925i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr2);
                    }
                }
            }
        }
        ((InneractiveFullscreenAdEventsListener) this.f53563c).onAdDismissed(this.f53561a);
    }

    public final void P() {
        s0 s0Var;
        l0 l0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || (s0Var = ((t0) xVar).f53980d) == null || (l0Var = ((r0) s0Var).f53417c) == null) {
            return;
        }
        UnitDisplayType unitDisplayType = l0Var.f53402b;
        x0 x0Var = IAConfigManager.f53260M.f53297w;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f53492a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        com.fyber.inneractive.sdk.player.n nVar;
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        super.a(eVar, activity);
        this.f56825x = eVar;
        boolean z2 = false;
        this.f56813B = false;
        this.f56814C = false;
        this.f56823L = false;
        InneractiveUnitController selectedUnitController = this.f53561a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (selectedUnitController instanceof InneractiveFullscreenUnitController) {
                InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof InneractiveFullscreenVideoContentController) {
                        this.f56812A = new WeakReference((InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                    }
                }
            } else {
                IAlog.f("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", IAlog.a(this));
            }
        }
        s0 s0Var = this.f53561a.getAdContent().f53980d;
        if (s0Var != null && (t0Var = ((r0) s0Var).f53420f) != null) {
            this.f56817F = t0Var.f53480j;
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar != null) {
            ((t0) xVar).e();
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.f53562b;
        com.fyber.inneractive.sdk.util.viewtime.c cVar = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar2 != null ? ((t0) xVar2).f53925i : null;
        Context context = this.f56825x.getLayout().getContext();
        if (tVar2 != null) {
            com.fyber.inneractive.sdk.player.a aVar = tVar2.f56402f;
            if (aVar == null || ((com.fyber.inneractive.sdk.player.n) aVar).f56321a == null) {
                IAlog.f("%sFull screen video ad renderer is not valid.", IAlog.a(this));
                throw new InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
            }
            f fVar = new f(tVar2);
            this.f56818G = fVar;
            this.f56826y = fVar.a(context, ((t0) this.f53562b).f53979c);
            com.fyber.inneractive.sdk.player.controller.b bVarA = this.f56818G.a(this.f53561a, (t0) this.f53562b);
            this.f56827z = bVarA;
            this.f56818G.b();
            bVarA.b(false);
            com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) this.f56827z;
            zVar.getClass();
            zVar.f54507g = this;
            ((com.fyber.inneractive.sdk.player.controller.z) this.f56827z).a(this);
            ((com.fyber.inneractive.sdk.player.ui.e) this.f56826y).f();
            this.f56821J.addRule(13);
            this.f56825x.getLayout().addView((View) this.f56826y, this.f56821J);
            this.f53570j = ((View) this.f56826y).findViewById(R.id.ia_click_overlay);
            this.f56818G.a(this.f56820I);
            this.f56813B = true;
            com.fyber.inneractive.sdk.flow.x xVar3 = this.f53562b;
            if (xVar3 == null || (tVar = ((t0) xVar3).f53925i) == null) {
                nVar = null;
            } else {
                com.fyber.inneractive.sdk.player.a aVar2 = tVar.f56402f;
                if (aVar2 instanceof com.fyber.inneractive.sdk.player.n) {
                    nVar = (com.fyber.inneractive.sdk.player.n) aVar2;
                }
            }
            if (nVar == null || this.f56827z == null) {
                IAlog.b("%s%s is null, cannot create VideoViewTime", IAlog.a(this), nVar == null ? "mediaPlayerFlowManager" : "mUIController");
            } else {
                int iC = nVar.f56321a.c();
                com.fyber.inneractive.sdk.flow.x xVar4 = this.f53562b;
                com.fyber.inneractive.sdk.util.a aVar3 = this.f53806u;
                int iL = ((com.fyber.inneractive.sdk.player.controller.z) this.f56827z).l() * 1000;
                boolean zA = com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(nVar), ((t0) this.f53562b).f53980d);
                if (InneractiveAdManager.isCurrentUserAChild() || this.f56817F != UnitDisplayType.REWARDED) {
                    z2 = zA;
                } else if (iC > iL) {
                    z2 = true;
                }
                cVar = new com.fyber.inneractive.sdk.util.viewtime.c(xVar4, aVar3, z2);
            }
            this.f56824M = cVar;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
        if (!this.f56815D) {
            this.f53806u.a(true);
        }
        this.f56815D = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar != null) {
            eVar.destroy();
        }
        if (this.f56813B) {
            O();
        }
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f56827z;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(this);
            this.f56827z.destroy();
            this.f56827z = null;
        }
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f56826y;
        if (mVar != null) {
            mVar.destroy();
            this.f56826y = null;
        }
        this.f56825x = null;
        this.f56812A = null;
        this.f56824M = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.f56824M;
        if (cVar != null) {
            com.fyber.inneractive.sdk.player.ui.m mVar = this.f56826y;
            cVar.f57059d = mVar != null && mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        x0 x0Var = IAConfigManager.f53260M.f53297w;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = this.f56817F == UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f53492a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
        E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
        v1 v1Var = this.f53798m;
        if (v1Var != null) {
            v1Var.f57049d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        v1 v1Var2 = this.f53800o;
        if (v1Var2 != null) {
            v1Var2.f57049d = false;
            v1Var2.a(SystemClock.uptimeMillis());
        }
        this.f53807v.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.f56812A);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i2, int i3) {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.f56824M;
        if (cVar != null && i3 > -1) {
            cVar.f57052a = i3;
        }
        this.f53806u.a();
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.f56812A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i2, i3);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
        v1 v1Var = this.f53798m;
        if (v1Var != null) {
            v1Var.f57049d = true;
            t1 t1Var = v1Var.f57048c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        v1 v1Var2 = this.f53800o;
        if (v1Var2 != null) {
            v1Var2.f57049d = true;
            t1 t1Var2 = v1Var2.f57048c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f53806u;
        if (aVar.f56978b && aVar.f56981e == 0) {
            aVar.f56981e = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar2 = this.f53807v;
        if (aVar2.f56978b && aVar2.f56981e == 0) {
            aVar2.f56981e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.player.controller.b bVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar;
        View view;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        View view2;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || (tVar = ((t0) xVar).f53925i) == null || (bVar = this.f56827z) == null || (eVar = this.f56825x) == null || (mVar = this.f56826y) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) tVar.f56402f;
        com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = nVar.f56389v;
        if (bVar3 == null || (bVar2 = bVar3.f53818d) == null || (cVar = bVar2.f53828d) == null || cVar.f53916b == null || (view = cVar.f53915a) == null || view.getParent() == null || cVar.f53916b.getVisibility() != 0) {
            if (mVar.c()) {
                if (this.f53801p) {
                    eVar.dismissAd(true);
                    return true;
                }
            } else if (bVar.b()) {
                com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) bVar;
                if (zVar.B()) {
                    zVar.g(true);
                    return true;
                }
                zVar.d(true);
            }
            return true;
        }
        com.fyber.inneractive.sdk.flow.storepromo.b bVar4 = nVar.f56389v;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar5 = bVar4.f53818d;
        if (bVar5 == null || (cVar2 = bVar5.f53828d) == null || cVar2.f53916b == null || (view2 = cVar2.f53915a) == null || view2.getParent() == null || cVar2.f53916b.getVisibility() != 0) {
            IAlog.f("StorePromoManager: hidePromo: unable hide promo: controller null or not ready", new Object[0]);
            return true;
        }
        bVar4.f53818d.a();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void v() {
        View view = this.f53570j;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ;
        int iA;
        long j2;
        f0 f0Var;
        int iIntValue;
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (A()) {
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.c) ((t0) this.f53562b).f53979c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("end_card_skip_time_sec");
                if (numA != null) {
                    iIntValue = numA.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue < 0 || iIntValue > 5) {
                    iIntValue = 0;
                }
                if (iIntValue > 0) {
                    IAlog.a("%s: overriding endcard dismiss time with child mode with %d", IAlog.a(this), Integer.valueOf(iIntValue));
                    return iIntValue;
                }
            }
            IAlog.a("%s: overriding endcard dismiss time with child mode with %d", IAlog.a(this), 0);
            return 0L;
        }
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        com.fyber.inneractive.sdk.config.l lVarA = iAConfigManager.f53294t.f53466b.a("endcard");
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56827z;
        if (bVar == null && (f0Var = this.f56818G) != null) {
            bVar = f0Var.f56753a;
        }
        if (bVar != null) {
            kVarJ = ((com.fyber.inneractive.sdk.player.controller.z) bVar).j();
        } else {
            kVarJ = null;
        }
        if (kVarJ != null) {
            com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ.f53605b.a();
            if (bVarA != null) {
                iA = bVarA.f53591f;
            } else {
                iA = kVarJ.f53609f;
            }
        } else {
            iA = iAConfigManager.f53294t.f53466b.a("vast_endcard_x_delay", 5, 0);
        }
        long j3 = iA;
        String str = "endcard_cr";
        if (lVarA.f53400a.containsKey("endcard_cr") || lVarA.f53400a.containsKey("endcard_ci")) {
            if (this.f56817F != UnitDisplayType.REWARDED) {
                str = "endcard_ci";
            }
            if (lVarA.f53400a.containsKey(str)) {
                j2 = Long.parseLong((String) lVarA.f53400a.get(str));
            } else {
                j2 = j3;
            }
            if (j2 >= 0 && j2 <= 5) {
                IAlog.a("%s : overriding endcard dismiss time for type: %s with: %d sec.", IAlog.a(this), this.f56817F, Long.valueOf(j2));
                this.f53805t = true;
                j3 = j2;
            }
        }
        return j3 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
        P();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        O();
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        if (inneractiveAdSpot != null && (inneractiveAdSpot instanceof i0)) {
            ((i0) inneractiveAdSpot).a();
        }
    }

    public final void f(boolean z2) {
        if (N() && this.f56822K) {
            return;
        }
        if (z2) {
            com.fyber.inneractive.sdk.player.controller.b bVar = this.f56827z;
            com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
            com.fyber.inneractive.sdk.flow.endcard.o oVar = kVarJ != null ? (com.fyber.inneractive.sdk.flow.endcard.o) kVarJ.f53605b.a(com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) : null;
            this.f53807v.a(oVar != null ? oVar.g().toString() : null);
            return;
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f53807v;
        aVar.f56980d = 0L;
        aVar.f56981e = 0L;
        aVar.f56982f = 0L;
        aVar.f56978b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (((r2 == null || (r2 = r2.f56840B) == null || !android.text.TextUtils.equals(r2, "1")) ? false : true) != false) goto L52;
     */
    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z2) {
        com.fyber.inneractive.sdk.model.vast.o oVar;
        ViewGroup viewGroup;
        f(z2);
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f56827z;
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f56826y;
        if ((mVar == null || (viewGroup = ((com.fyber.inneractive.sdk.player.ui.s) mVar).f56511r) == null || viewGroup.getVisibility() != 0) && !this.f56819H) {
            if (kVarJ != null) {
                com.fyber.inneractive.sdk.response.g gVar = kVarJ.f53604a.f53986d;
            }
            com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.a() : null;
            if (bVarA != null && (oVar = bVarA.f53588c.f53987e.f54108f) != null && oVar.f54162d) {
                this.f56822K = false;
                this.f53801p = false;
                com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
                if (eVar != null) {
                    eVar.disableCloseButton();
                }
                com.fyber.inneractive.sdk.util.a aVar = this.f53807v;
                aVar.f56980d = 0L;
                aVar.f56981e = 0L;
                aVar.f56982f = 0L;
                aVar.f56978b = false;
                Runnable runnable = this.f53797l;
                if (runnable != null) {
                    com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable);
                    this.f53797l = null;
                }
                Runnable runnable2 = this.f53799n;
                if (runnable2 != null) {
                    com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(runnable2);
                    this.f53799n = null;
                }
                J();
                this.f56818G.f56753a.a(bVarA);
                com.fyber.inneractive.sdk.interfaces.e eVar2 = this.f56825x;
                if (eVar2 != null) {
                    eVar2.secondEndCardWasDisplayed();
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.interfaces.e eVar3 = this.f56825x;
            if (eVar3 != null) {
                eVar3.destroy();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar4 = this.f56825x;
        if (eVar4 != null) {
            eVar4.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f56827z;
        if (bVar == null) {
            IAlog.f("Unable to register store promo observer - ui controller unavailable", new Object[0]);
            return false;
        }
        return ((com.fyber.inneractive.sdk.player.controller.z) bVar).a(aVar);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.f56816E = gVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        P();
        if (this.f56826y.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f57018a;
        } else {
            context = this.f56826y.getContext();
        }
        Context context2 = context;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        return a(context2, (xVar == null || (eVar = ((t0) xVar).f53978b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).f56877L) == null) ? null : bVar.f54104b, g1Var, gVar, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z2, Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar != null) {
            eVar.setActivityOrientation(z2, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f56825x;
        if (eVar == null || eVar.getLayout() == null || this.f56825x.getLayout().getContext() == null) {
            return;
        }
        if (!this.f56823L) {
            com.fyber.inneractive.sdk.network.b0.a(this.f56825x.getLayout().getContext(), str, str2, this.f53562b);
            this.f56823L = true;
            IAlog.a(IAlog.a(this) + "reporting auto redirect", new Object[0]);
            return;
        }
        IAlog.a(IAlog.a(this) + "redirect already reported for this ad", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z2) {
        f0 f0Var;
        if (this.f56817F == UnitDisplayType.INTERSTITIAL) {
            this.f56819H = true;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56827z;
        if (bVar == null && (f0Var = this.f56818G) != null) {
            bVar = f0Var.f56753a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVarJ != null ? kVarJ.f53605b.a() : null;
        if (bVarA != null) {
            P();
            com.fyber.inneractive.sdk.util.d0 d0VarA = a(bVarA.f53588c.f53983a, str, g1Var, bVarA.g(), false, null);
            if (d0VarA.f56991a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                t0 t0Var = bVarA.f53588c.f53984b;
                String[] strArr = {com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK.toString()};
                com.fyber.inneractive.sdk.player.t tVar = t0Var.f53925i;
                if (tVar != null) {
                    tVar.a("EVENT_TRACKING", strArr);
                }
            }
            return d0VarA;
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i2, boolean z2) {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.f56824M;
        if (cVar != null && i2 > -1) {
            cVar.f57052a = i2;
        }
        if (cVar != null) {
            cVar.a(z2);
            this.f56824M = null;
        }
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.f56812A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        x0 x0Var = IAConfigManager.f53260M.f53297w;
        UnitDisplayType unitDisplayType = this.f56817F;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar2 = unitDisplayType == unitDisplayType2 ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
        com.fyber.inneractive.sdk.cache.session.e eVar = x0Var.f53492a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar2));
        }
        if (this.f56817F == unitDisplayType2) {
            com.fyber.inneractive.sdk.external.g gVar = this.f56816E;
            if (gVar != null) {
                i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(((com.fyber.inneractive.sdk.flow.s0) gVar.f53549a).mAdSpot);
                InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f53549a.f53527b;
                if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                    inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
                }
            }
            H();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || ((t0) xVar).f53925i == null) {
            return;
        }
        J();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z2) {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        if (z2) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_SKIP;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f53562b;
            if (xVar2 != null) {
                t0 t0Var = (t0) xVar2;
                if (t0Var.f53925i != null) {
                    String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var.f53925i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr);
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.flow.x xVar3 = this.f53562b;
        if (xVar3 == null || (tVar = ((t0) xVar3).f53925i) == null) {
            return;
        }
        tVar.a("TRACKING_COMPLETED", new String[0]);
        J();
        String[] strArr2 = new String[0];
        com.fyber.inneractive.sdk.player.t tVar3 = ((t0) this.f53562b).f53925i;
        if (tVar3 != null) {
            tVar3.a("TRACKING_COMPLETED", strArr2);
        }
        if (IAConfigManager.f53260M.f53294t.f53466b.a("endcard").a() && z2 && (eVar = this.f56825x) != null) {
            eVar.destroy();
        }
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.f56824M;
        if (cVar != null) {
            cVar.a(z2);
            this.f56824M = null;
        }
        f(z2);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(c(view), str);
            c(view);
            c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        c(view);
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j2) {
        if (this.f53805t) {
            return j2;
        }
        long j3 = 12;
        try {
            j3 = Long.parseLong(IAConfigManager.f53260M.f53294t.f53466b.a("vast_endcard_x_fallback_delay", Long.toString(12L)));
        } catch (Throwable unused) {
        }
        return j3 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f56827z;
        if (bVar == null) {
            IAlog.f("Unable to unregister store promo observer - ui controller unavailable", new Object[0]);
        } else {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        if (this.f56817F == UnitDisplayType.INTERSTITIAL) {
            IAlog.a("InneractiveFullscreenVideoAdRenderer: update: StorePromo isClicked: %s", Boolean.valueOf(bVar.f53912b));
            this.f56819H = bVar.f53912b;
        }
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.a
    public final void a(FrameLayout frameLayout) {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.f56826y;
        if (mVar != null) {
            ((com.fyber.inneractive.sdk.player.ui.e) mVar).setWatermarkView(frameLayout);
        }
    }
}
