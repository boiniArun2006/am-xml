package com.fyber.inneractive.sdk.player.controller;

import a88.fuX;
import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class z implements b, p, o, com.fyber.inneractive.sdk.player.ui.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.f f54501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f54502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f54503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.s f54504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f54505e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f54507g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f54510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f54511k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f54513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f54514n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f54521u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f54522v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54506f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54508h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f54509i = -0.1f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54512l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54515o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f54516p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54517q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f54518r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f54519s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f54520t = com.fyber.inneractive.sdk.ignite.m.NONE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f54523w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f54525y = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Skip f54524x = null;

    public abstract boolean A();

    public void a() {
    }

    public abstract void b(g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null) {
            return false;
        }
        if (this.f54508h || fVar.f56321a == null) {
            return true;
        }
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
        if (sVar != null && sVar.a()) {
            return true;
        }
        int iC = this.f54501a.f56321a.c();
        com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
        return com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar2), ((com.fyber.inneractive.sdk.player.n) fVar2).f56386s) && !this.f54508h && this.f54506f == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z2) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.f54515o && !this.f54512l) {
            this.f54512l = true;
        }
    }

    public boolean e() {
        String str;
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            com.fyber.inneractive.sdk.response.g gVar = kVarJ.f53604a.f53986d;
            if (!((gVar == null || (str = gVar.f56840B) == null || !TextUtils.equals(str, "1")) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z2) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (qVar = fVar.f56321a) != null) {
            qVar.b(z2);
        }
        this.f54504d.setMuteButtonState(true);
    }

    public void g() {
        if (this.f54521u != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
        }
    }

    public void h(boolean z2) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null) {
            if (!fVar.f56327g) {
                E();
                return;
            }
            if (z2 && (qVar = fVar.f56321a) != null) {
                qVar.a(0, true);
                return;
            }
            q qVar2 = fVar.f56321a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f54475e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public final void i(boolean z2) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (qVar = fVar.f56321a) != null) {
            qVar.d(z2);
        }
        this.f54504d.setMuteButtonState(false);
    }

    public abstract int o();

    public abstract void r();

    public abstract void t();

    public abstract void v();

    public void w() {
    }

    public boolean B() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        s0 s0Var = this.f54502b;
        boolean z2 = (s0Var == null || (t0Var = ((r0) s0Var).f53420f) == null || t0Var.f53480j != UnitDisplayType.REWARDED) ? false : true;
        if (!InneractiveAdManager.isCurrentUserAChild() || !z2 || this.f54504d == null || (fVar = this.f54501a) == null || (qVar = fVar.f56321a) == null) {
            return false;
        }
        int iB = qVar.b() / 1000;
        return (this.f54501a.f56321a.c() / 1000) - iB <= 0 || iB < l();
    }

    public void C() {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
        com.fyber.inneractive.sdk.config.global.features.v vVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class) : null;
        boolean zBooleanValue = (vVar == null || (boolC = vVar.c("show_cta")) == null) ? true : boolC.booleanValue();
        g0 g0Var = this.f54507g;
        if (g0Var != null) {
            this.f54520t = g0Var.o();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.f54520t;
        this.f54504d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? zBooleanValue : true, mVar);
    }

    public final void D() {
        com.fyber.inneractive.sdk.flow.endcard.b bVarA;
        g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        View view;
        View view2;
        com.fyber.inneractive.sdk.flow.endcard.b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        this.f54504d.i();
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            bVarA = kVarJ.a();
            com.fyber.inneractive.sdk.flow.endcard.h hVar = kVarJ.f53608e;
            com.fyber.inneractive.sdk.flow.endcard.m mVar = kVarJ.f53605b;
            hVar.getClass();
            if (mVar.f53640a.size() >= 1) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = mVar.a();
                com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
                Iterator it = mVar.f53640a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    } else {
                        bVar = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
                        if (bVar.i() == iVar) {
                            break;
                        }
                    }
                }
                if (bVarA2 != null && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && bVarA2.l() && (oVar = bVarA2.f53588c.f53987e.f54108f) != null && oVar.f54162d && bVar != null && bVar.l()) {
                    hVar.a(bVarA2, bVar.l());
                    hVar.a(bVar, true, bVarA2.k());
                } else if (bVarA2 == bVar || bVarA2 == null || bVarA2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
                    hVar.a(bVarA2, false, false);
                } else {
                    hVar.a(bVarA2, false);
                }
            }
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            if (e() || (g0Var = this.f54507g) == null) {
                return;
            }
            g0Var.i();
            return;
        }
        a(bVarA);
        if (n() != null) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVarN = n();
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVarN.f53818d;
            if (bVar2 == null || (cVar = bVar2.f53827c) == null || !(z2 = cVar.f53838e)) {
                bVarN.f53815a.a();
                bVarN.a();
                bVarN.a((bVarN.f53818d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
                return;
            }
            bVar2.f53833i = kVarJ;
            if (!z2 || (cVar2 = bVar2.f53828d) == null || bVar2.f53831g) {
                return;
            }
            if (cVar2.f53916b == null || (view2 = cVar2.f53915a) == null || view2.getParent() == null || cVar2.f53916b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar2.f53828d;
                if (cVar4.f53916b == null || cVar4.f53915a == null) {
                    IAlog.f("StorePromoView: show: missing container or content", new Object[0]);
                    return;
                }
                cVar4.a();
                com.fyber.inneractive.sdk.util.v.a(cVar4.f53916b);
                sVar.addView(cVar4.f53916b);
                cVar4.f53915a.setAnimation(cVar4.f53917c);
                cVar4.f53916b.setVisibility(0);
                com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = cVar4.f53920f;
                if (bVar3 != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar4 = bVar3.f53818d;
                    com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar5 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar4 == null || (cVar3 = bVar4.f53828d) == null || cVar3.f53916b == null || (view = cVar3.f53915a) == null || view.getParent() == null || cVar3.f53916b.getVisibility() != 0) ? false : true, bVar3.f53823i);
                    Iterator it2 = bVar3.f53822h.iterator();
                    while (it2.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it2.next()).a(bVar5);
                    }
                    JSONObject jSONObject = new JSONObject();
                    Integer numValueOf = Integer.valueOf(bVar3.f53821g);
                    try {
                        jSONObject.put("screenshots", numValueOf);
                    } catch (Exception unused) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", numValueOf);
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.f53817c;
                    com.fyber.inneractive.sdk.response.e eVar = bVar3.f53816b;
                    String str = bVar3.f53820f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (Exception unused2) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    wVar.f54362f.put(jSONObject);
                    wVar.a((String) null);
                }
            }
        }
    }

    public void E() {
        boolean z2;
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (((qVar2 = fVar.f56321a) != null && qVar2.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.f54517q)) {
            fVar.a();
        }
        boolean zA = IAConfigManager.f53260M.f53294t.f53466b.a("endcard").a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
        sVar.e((fVar2 == null || (qVar = fVar2.f56321a) == null || qVar.f54475e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z2 = this.f54517q) && !zA) || this.f54518r || (z2 && zA)));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        g();
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        q qVar;
        Application application;
        u uVar = this.f54513m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.f57018a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (qVar = fVar.f56321a) != null) {
            qVar.f54472b.remove(this);
            this.f54501a.f56321a.f54473c.remove(this);
        }
        g();
        Runnable runnable = this.f54510j;
        if (runnable != null) {
            this.f54504d.removeCallbacks(runnable);
            this.f54510j = null;
        }
        this.f54507g = null;
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f56387t;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new w(this);
    }

    public final int l() {
        int i2;
        try {
            i2 = Integer.parseInt(IAConfigManager.f53260M.f53294t.f53466b.a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i2 = 30;
        }
        if (i2 < 1) {
            return 30;
        }
        return i2;
    }

    public final float m() {
        try {
            return ((AudioManager) this.f54504d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f56389v;
        }
        return null;
    }

    public final boolean p() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        return (fVar == null || (qVar = fVar.f56321a) == null || (!qVar.g() && ((double) m()) != 0.0d)) ? false : true;
    }

    public final void q() {
        this.f54504d.a(true);
        this.f54504d.e(false);
        Runnable runnable = this.f54510j;
        if (runnable == null) {
            if (runnable == null) {
                this.f54510j = new t(this);
            }
            int i2 = i();
            IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i2));
            this.f54504d.postDelayed(this.f54510j, i2);
        }
    }

    public void u() {
        Runnable runnable = this.f54510j;
        if (runnable != null) {
            this.f54504d.removeCallbacks(runnable);
            this.f54510j = null;
        }
        this.f54504d.a(false);
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x() {
        q qVar;
        this.f54504d.a(false);
        this.f54504d.e(false);
        Runnable runnable = this.f54510j;
        if (runnable != null) {
            this.f54504d.removeCallbacks(runnable);
            this.f54510j = null;
        }
        if (this.f54501a != null && A() && !this.f54508h) {
            int iC = this.f54501a.f56321a.c();
            com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
            if (com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar), ((com.fyber.inneractive.sdk.player.n) fVar).f56386s)) {
                if (this.f54506f <= 0) {
                    this.f54504d.g(true);
                    h();
                } else {
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
                    if (fVar2 == null || (qVar = fVar2.f56321a) == null) {
                        if (!this.f54516p) {
                            this.f54504d.g(true);
                            b(this.f54506f);
                            this.f54516p = true;
                        }
                    } else if (this.f54506f >= qVar.c() / 1000) {
                        this.f54504d.g(false);
                    }
                }
            }
        }
        g0 g0Var = this.f54507g;
        if (g0Var != null && !this.f54511k) {
            this.f54511k = true;
            g0Var.j();
        }
        this.f54517q = false;
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && fVar.f56321a != null && (gVar = this.f54521u) != null) {
            gVar.invalidate();
            this.f54521u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f54504d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.f54504d.requestLayout();
        }
    }

    public void z() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || (qVar = fVar.f56321a) == null) {
            return;
        }
        if (qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), qVar.f54475e);
            return;
        }
        IAlog.a("%spauseVideo %s", IAlog.a(this), this.f54504d);
        TextureView textureView = qVar.f54480j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.f54504d.getTextureHost()) {
            return;
        }
        qVar.i();
    }

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z2, String str) {
        q qVar;
        this.f54501a = fVar;
        this.f54502b = s0Var;
        this.f54503c = rVar;
        this.f54504d = sVar;
        this.f54514n = z2;
        this.f54522v = str;
        sVar.setListener(this);
        if (fVar != null && (qVar = fVar.f56321a) != null) {
            if (!qVar.f54472b.contains(this)) {
                qVar.f54472b.add(this);
            }
            q qVar2 = fVar.f56321a;
            if (!qVar2.f54473c.contains(this)) {
                qVar2.f54473c.add(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        i1 i1Var;
        IAlog.a("IAVideoUIControllerBase: showEndCard: dismiss time: %d sec.", Integer.valueOf(bVar.f53591f));
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar2 = new com.fyber.inneractive.sdk.player.ui.b(a(cVar.d()));
            if (bVar2.f56405a) {
                com.fyber.inneractive.sdk.web.b0 b0VarK = k();
                com.fyber.inneractive.sdk.flow.endcard.a aVar = (com.fyber.inneractive.sdk.flow.endcard.a) cVar.f();
                if ((aVar instanceof com.fyber.inneractive.sdk.flow.endcard.u) && (i1Var = ((com.fyber.inneractive.sdk.flow.endcard.u) aVar).e().f54431a) != null) {
                    i1Var.setListener(b0VarK);
                }
                this.f54504d.e(false);
                this.f54504d.a(cVar, bVar2);
                ViewGroup viewGroup = this.f54504d.f56506m;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.o) {
            com.fyber.inneractive.sdk.flow.endcard.o oVar = (com.fyber.inneractive.sdk.flow.endcard.o) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar3 = new com.fyber.inneractive.sdk.player.ui.b(a(oVar.d()));
            if (bVar3.f56405a) {
                com.fyber.inneractive.sdk.web.b0 b0VarK2 = k();
                i1 i1Var2 = ((com.fyber.inneractive.sdk.flow.endcard.p) oVar.f()).e().f54431a;
                if (i1Var2 != null) {
                    i1Var2.setListener(b0VarK2);
                }
                this.f54504d.a(oVar, bVar3);
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.d) {
            com.fyber.inneractive.sdk.flow.endcard.d dVar = (com.fyber.inneractive.sdk.flow.endcard.d) bVar;
            com.fyber.inneractive.sdk.player.ui.c cVarD = dVar.d();
            String str = this.f54522v;
            if (str == null) {
                com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
                if (rVar != null) {
                    com.fyber.inneractive.sdk.config.global.features.d dVar2 = (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class);
                    dVar2.d(IAConfigManager.f53260M.f53289o);
                    com.fyber.inneractive.sdk.model.vast.a aVar2 = dVar2.f53360e;
                    str = (aVar2 == null || !aVar2.f54101d) ? null : aVar2.f54098a;
                }
            }
            cVarD.f56416c = str;
            com.fyber.inneractive.sdk.player.ui.b bVar4 = new com.fyber.inneractive.sdk.player.ui.b(a(cVarD));
            if (bVar4.f56405a) {
                this.f54504d.e(false);
                this.f54504d.a(dVar, bVar4);
            }
        }
    }

    public void s() {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z2) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        q qVar2;
        t0 t0Var;
        int iB;
        com.fyber.inneractive.sdk.measurement.f fVar2;
        q qVar3;
        s0 s0Var;
        t0 t0Var2;
        this.f54517q = true;
        x0 x0Var = IAConfigManager.f53260M.f53297w;
        if (z2 && x0Var != null && (s0Var = this.f54502b) != null && (t0Var2 = ((r0) s0Var).f53420f) != null) {
            x0Var.a(t0Var2.f53480j, "LAST_VAST_SKIPED", "1");
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f54501a;
        if (fVar3 != null && (qVar3 = fVar3.f56321a) != null) {
            qVar3.k();
            this.f54501a.f56321a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar4 = this.f54501a;
        if (fVar4 != null && z2 && (fVar2 = fVar4.f56325e) != null && fVar2.f54048c != null) {
            IAlog.a("%s skipped", "OMVideo");
            try {
                fVar2.f54048c.qie();
            } catch (Throwable th) {
                fVar2.a(th);
            }
        }
        if (!this.f54504d.c()) {
            this.f54504d.a(false);
            Runnable runnable = this.f54510j;
            if (runnable != null) {
                this.f54504d.removeCallbacks(runnable);
                this.f54510j = null;
            }
            this.f54511k = false;
            this.f54508h = true;
            s0 s0Var2 = this.f54502b;
            if (s0Var2 != null && (t0Var = ((r0) s0Var2).f53420f) != null && t0Var.f53480j == UnitDisplayType.REWARDED && this.f54507g != null) {
                com.fyber.inneractive.sdk.player.f fVar5 = this.f54501a;
                q qVar4 = fVar5 != null ? fVar5.f56321a : null;
                if ((fVar5 != null ? fVar5.f56321a : null) != null) {
                    iB = (fVar5 != null ? fVar5.f56321a : null).b();
                } else {
                    iB = -1;
                }
                boolean z3 = this.f54517q;
                if (z3 && this.f54501a != null && qVar4 != null) {
                    int iB2 = qVar4.b();
                    int iC = qVar4.c() - iB2;
                    int iL = l() * 1000;
                    if (iC > 0 && iB2 < iL) {
                        this.f54525y = true;
                    } else {
                        this.f54507g.a(iB, this.f54517q);
                    }
                } else {
                    this.f54507g.a(iB, z3);
                }
            }
        }
        if (z2) {
            boolean zA = IAConfigManager.f53260M.f53294t.f53466b.a("endcard").a();
            com.fyber.inneractive.sdk.player.f fVar6 = this.f54501a;
            if ((fVar6 != null && (qVar2 = fVar6.f56321a) != null && qVar2.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed) || ((this.f54517q && !zA) || this.f54518r)) {
                D();
            }
        }
        g0 g0Var = this.f54507g;
        if (g0Var != null && (this.f54506f <= 0 || this.f54508h || ((fVar = this.f54501a) != null && (qVar = fVar.f56321a) != null && qVar.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed))) {
            g0Var.a(z2);
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(boolean z2) {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        Context context = this.f54504d.getContext();
        com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            cVar = new ArrayList(cVar2.f53362c.values()).size() > 0 ? (com.fyber.inneractive.sdk.config.global.features.c) this.f54503c.a(com.fyber.inneractive.sdk.config.global.features.c.class) : null;
        }
        new f0(context, cVar, new v(this, z2)).f54456b.show();
    }

    public final void e(boolean z2) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || (qVar = fVar.f56321a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f54475e;
        if (z2 && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f54504d.c()) {
            h(false);
            return;
        }
        if (!z2 && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.f54504d.c()) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    public void f() {
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.f54521u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.f54504d);
            this.f54521u = gVar;
            gVar.setId(R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
            if (fVar2 != null && (fVar = fVar2.f56325e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
                View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                a88.n nVar = fVar.f54046a;
                if (nVar != null) {
                    try {
                        nVar.nr(sVar);
                    } catch (Throwable th) {
                        fVar.a(th);
                    }
                }
                if (fVar.f54046a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.f54046a.n(view, fuX.VIDEO_CONTROLS, null);
                            } catch (Throwable th2) {
                                fVar.a(th2);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.f54504d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.f54046a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.f54046a.n(view2, fuX.OTHER, null);
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                if (this.f54504d.getWatermarkView() != null) {
                    View watermarkView = this.f54504d.getWatermarkView();
                    a88.n nVar2 = fVar.f54046a;
                    if (nVar2 != null) {
                        nVar2.n(watermarkView, fuX.NOT_VISIBLE, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark.name());
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.f54504d.getTextureHost());
        if (this.f54521u != null && this.f54504d.getTextureHost().equals(this.f54521u.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f54501a;
        if (fVar3 != null && (qVar2 = fVar3.f56321a) != null) {
            qVar2.a(this.f54521u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.f54521u;
        if (gVar2 != null && gVar2.getParent() == null) {
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f54504d.getTextureHost().addView(this.f54521u, layoutParams);
        }
        this.f54512l = false;
        x xVar = new x(this);
        this.f54505e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f54501a;
        if (fVar4 == null || (qVar = fVar4.f56321a) == null) {
            return;
        }
        qVar.f54474d = xVar;
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.f53260M.f53289o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f53360e;
                if (aVar != null && aVar.f54101d) {
                    str = aVar.f54099b;
                }
            }
            if (TextUtils.isEmpty(this.f54522v) && str != null) {
                this.f54504d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
                sVar.setSkipText(sVar.getContext().getString(R.string.ia_video_skip_text));
            }
            this.f54504d.h();
            this.f54506f = 0;
            g0 g0Var = this.f54507g;
            if (g0Var != null) {
                g0Var.c();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z2) {
        IAlog.a(Apsps.TPqznVzWXLPHu, IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || fVar.f56321a == null) {
            return;
        }
        this.f54504d.setUnitConfig(this.f54502b);
        this.f54504d.a(this.f54514n, this.f54501a.f56321a.f(), this.f54501a.f56321a.e());
        if (A()) {
            this.f54506f = o();
        } else {
            this.f54504d.g(false);
        }
        if (!z2) {
            a(this.f54501a.f56321a.b());
            a(this.f54501a.f56321a.f54475e, false);
        }
        this.f54504d.setMuteButtonState(p());
    }

    public final void b(int i2) {
        if (this.f54504d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.f53260M.f53289o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f53360e;
                if (aVar != null && aVar.f54101d) {
                    str = aVar.f54100c;
                }
            }
            if (TextUtils.isEmpty(this.f54522v) && str != null) {
                this.f54504d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i2)));
            } else {
                this.f54504d.setSkipText(String.valueOf(i2));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f56389v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f53814k) {
                bVar.f53822h.remove(aVar);
            }
            return;
        }
        IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        String string;
        cVar.f56421h = this.f54501a != null && com.fyber.inneractive.sdk.player.f.a(this.f54503c, this.f54520t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f54503c;
        com.fyber.inneractive.sdk.config.global.features.o oVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.o) rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class) : null;
        if (oVar != null) {
            string = oVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.f54504d.getContext().getString(R.string.ia_video_app_info_text);
        }
        cVar.f56422i = string;
        cVar.f56420g = this.f54520t;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z2) {
        g0 g0Var;
        int iB;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (y.f54499a[bVar.ordinal()]) {
            case 1:
                boolean z3 = this.f54523w;
                if (z3) {
                    IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, String.valueOf(z3));
                    q();
                }
                break;
            case 2:
                if (this.f54515o) {
                    E();
                    w();
                }
                break;
            case 3:
                if (this.f54515o) {
                    this.f54523w = true;
                    q();
                }
                break;
            case 4:
                if (this.f54523w) {
                    this.f54523w = false;
                }
                if (this.f54515o) {
                    x();
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.f54515o || (!e() && !this.f54519s)) {
                    this.f54519s = true;
                    if (!this.f54504d.c()) {
                        this.f54504d.a(false);
                        Runnable runnable = this.f54510j;
                        if (runnable != null) {
                            this.f54504d.removeCallbacks(runnable);
                            this.f54510j = null;
                        }
                        E();
                        D();
                        this.f54511k = false;
                        this.f54508h = true;
                    }
                    if (z2 && (g0Var = this.f54507g) != null) {
                        boolean z4 = this.f54517q;
                        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
                        if ((fVar != null ? fVar.f56321a : null) != null) {
                            iB = (fVar != null ? fVar.f56321a : null).b();
                        } else {
                            iB = -1;
                        }
                        g0Var.a(iB, z4);
                        break;
                    }
                }
                break;
            case 7:
                if (this.f54515o || ((sVar = this.f54504d) != null && sVar.isShown())) {
                    s();
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    @Override // com.fyber.inneractive.sdk.player.controller.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2) {
        s0 s0Var;
        t0 t0Var;
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar == null || fVar.f56321a == null) {
            return;
        }
        float fM = m();
        com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
        if (fVar2 != null && (qVar = fVar2.f56321a) != null && qVar.h()) {
            float f3 = this.f54509i;
            if (fM != f3) {
                if (fM > 0.0f && f3 >= 0.0f && p()) {
                    i(true);
                } else if (fM == 0.0d) {
                    f(true);
                }
            }
            this.f54504d.setMuteButtonState(p());
        }
        this.f54509i = fM;
        int iC = this.f54501a.f56321a.c();
        int iB = this.f54501a.f56321a.b();
        int i3 = iB / 1000;
        int i5 = iC / 1000;
        int i7 = i5 - i3;
        if (i7 < 0 || (!this.f54501a.f56321a.h() && iB == iC)) {
            i7 = 0;
        }
        g0 g0Var = this.f54507g;
        if (g0Var != null) {
            g0Var.onProgress(iC, iB);
        }
        if (this.f54504d.l()) {
            return;
        }
        this.f54504d.setRemainingTime(Integer.toString(i7));
        if (this.f54506f < i5) {
            if (A()) {
                int iC2 = this.f54501a.f56321a.c();
                com.fyber.inneractive.sdk.player.f fVar3 = this.f54501a;
                if (com.fyber.inneractive.sdk.player.f.a(iC2, com.fyber.inneractive.sdk.player.f.a(fVar3), ((com.fyber.inneractive.sdk.player.n) fVar3).f56386s) && !this.f54508h) {
                    int i8 = this.f54506f;
                    if (i3 < i8) {
                        b(i8 - i3);
                    } else {
                        this.f54506f = 0;
                        h();
                    }
                    this.f54504d.g(true);
                } else {
                    this.f54504d.g(false);
                }
            }
        } else {
            this.f54504d.g(false);
            b(i7);
        }
        if (this.f54501a.f56321a.f54475e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            this.f54504d.a(iC, iB);
            int iL = l();
            if (i5 <= iL || i3 <= iL || (s0Var = this.f54502b) == null || (t0Var = ((r0) s0Var).f53420f) == null || t0Var.f53480j != UnitDisplayType.REWARDED) {
                return;
            }
            h();
            this.f54504d.g(true);
        }
    }

    public final void a(String str) {
        t0 t0Var;
        x0 x0Var = IAConfigManager.f53260M.f53297w;
        s0 s0Var = this.f54502b;
        if (s0Var == null || (t0Var = ((r0) s0Var).f53420f) == null) {
            return;
        }
        x0Var.a(t0Var.f53480j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public void a(boolean z2) {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        int iB;
        Application application;
        if (this.f54515o == z2 || (fVar = this.f54501a) == null || fVar.f56321a == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z2), this.f54504d);
        if (z2) {
            this.f54515o = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f54501a.f56321a.f54475e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f54504d.c()) {
                if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                        this.f54501a.getClass();
                    } else {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            x();
                        }
                        com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
                        if (!fVar2.f56330j) {
                            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar2;
                            nVar.a(nVar.f56383p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                            fVar2.f56330j = true;
                        }
                        f();
                        if (this.f54513m != null || (application = com.fyber.inneractive.sdk.util.o.f57018a) == null) {
                            return;
                        }
                        u uVar = new u(this);
                        this.f54513m = uVar;
                        application.registerActivityLifecycleCallbacks(uVar);
                        return;
                    }
                }
                s();
                return;
            }
            if (!this.f54519s) {
                this.f54519s = true;
                if (!this.f54525y) {
                    if (!this.f54504d.c()) {
                        this.f54504d.a(false);
                        Runnable runnable = this.f54510j;
                        if (runnable != null) {
                            this.f54504d.removeCallbacks(runnable);
                            this.f54510j = null;
                        }
                        E();
                        D();
                        this.f54511k = false;
                        this.f54508h = true;
                    }
                    g0 g0Var = this.f54507g;
                    if (g0Var != null) {
                        boolean z3 = this.f54517q;
                        com.fyber.inneractive.sdk.player.f fVar3 = this.f54501a;
                        if ((fVar3 != null ? fVar3.f56321a : null) != null) {
                            iB = (fVar3 != null ? fVar3.f56321a : null).b();
                        } else {
                            iB = -1;
                        }
                        g0Var.a(iB, z3);
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f54504d;
            if (sVar2 != null) {
                sVar2.k();
                return;
            }
            return;
        }
        this.f54515o = false;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f54501a;
        if (fVar4 != null && (qVar = fVar4.f56321a) != null && (xVar = qVar.f54474d) != null && xVar.equals(this.f54505e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            z();
            if (this.f54501a.f56321a.f54475e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.f54504d) != null && sVar.c())) {
                this.f54504d.j();
            }
        }
        com.fyber.inneractive.sdk.player.ui.s sVar3 = this.f54504d;
        if (sVar3 == null || !sVar3.f56432h) {
            g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i2, g1 g1Var) {
        IAlog.a("onClicked called with %d", Integer.valueOf(i2));
        switch (i2) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.f56383p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.f56383p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.f54504d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(w0.CTA_BUTTON.a());
                a(false, VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.f54501a;
                String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar3.f56387t.f53605b.a();
                    if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVarA;
                        String str2 = cVar.f53592g.f54125g;
                        if (TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.f56383p;
                            if (bVar != null) {
                                str = bVar.f54104b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
                if (sVar != null) {
                    sVar.g();
                }
                g0 g0Var = this.f54507g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (B()) {
                    g(true);
                } else {
                    d(true);
                }
                break;
            case 7:
                b(g1Var);
                break;
            case 8:
                a(w0.COMPANION.a());
                a(true, VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.f54501a;
                if (fVar4 != null && !this.f54504d.f56432h) {
                    fVar4.f56327g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(w0.APP_INFO.a());
                a(false, VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(w0.STORE_PROMO.a());
                a(false, VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    public final boolean a(boolean z2, VideoClickOrigin videoClickOrigin, g1 g1Var) {
        com.fyber.inneractive.sdk.util.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f54504d;
        if (sVar != null) {
            sVar.g();
        }
        g0 g0Var = this.f54507g;
        boolean z3 = false;
        if (g0Var != null) {
            if (z2) {
                com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f56383p;
                    g0Var.a(bVar != null ? bVar.f54104b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.f54501a;
                    nVar.a(nVar.f56383p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i2 = y.f54500b[videoClickOrigin.ordinal()];
                if (i2 == 1) {
                    gVar = com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA;
                } else if (i2 == 2) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CLICK;
                } else if (i2 != 3) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
                } else {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO;
                }
                com.fyber.inneractive.sdk.util.d0 d0VarA = this.f54507g.a(g1Var, gVar);
                com.fyber.inneractive.sdk.player.f fVar2 = this.f54501a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.f56383p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.f54501a.f56325e;
                    if (fVar3 != null && fVar3.f54048c != null) {
                        IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.f54048c.n(VI.j.CLICK);
                        } catch (Throwable th) {
                            fVar3.a(th);
                        }
                    }
                }
                if (d0VarA.f56991a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                    z3 = true;
                }
            }
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            a(w0.VIDEO.a());
        }
        return z3;
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f54501a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f56389v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f53814k) {
                bVar.f53822h.add(aVar);
            }
            return true;
        }
        IAlog.f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
        return false;
    }
}
