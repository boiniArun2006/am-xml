package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class r extends e implements com.fyber.inneractive.sdk.interfaces.d, InneractiveNativeVideoContentController.Renderer, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f56783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f56784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VideoContentListener f56785n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f56787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f0 f56788q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p f56791t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f56786o = new o(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f56789r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f56790s = new Rect();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f56792u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q f56793v = new q(this);

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i2) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int d() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.f56785n = null;
        s();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int n() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void p() {
    }

    public void I() {
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.f53926j) {
                return;
            }
            t0Var.f53926j = true;
            E();
        }
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof t0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f56787p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void l() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            IAlog.a("%sfullscreenExited called", IAlog.a(sVar));
            sVar.f54491E = false;
            sVar.j(sVar.f54490D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.f54501a;
            if (fVar == null || (qVar = fVar.f56321a) == null) {
                return;
            }
            sVar.a(qVar.f54475e);
            sVar.a(sVar.f54501a.f56321a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void s() {
        ViewGroup viewGroup;
        p pVar = this.f56791t;
        if (pVar != null && (viewGroup = this.f56787p) != null) {
            viewGroup.removeCallbacks(pVar);
            this.f56791t = null;
        }
        l0.f57009a.a(this.f56787p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.f56787p);
        if (this.f56750k != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f56750k;
            sVar.getClass();
            sVar.f54507g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.f56750k).destroy();
            this.f56750k = null;
        }
        if (this.f56784m != null) {
            ViewGroup viewGroup2 = this.f56787p;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(null);
                this.f56787p.removeView(this.f56783l);
            }
            this.f56784m.destroy();
            this.f56784m = null;
        }
        this.f56783l = null;
        this.f56788q = null;
        this.f56787p = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context w() {
        return c((View) this.f56787p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public View x() {
        return this.f56783l;
    }

    public void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.flow.x xVar;
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f56787p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!a(selectedUnitController)) {
            IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            this.f56785n = a(selectedUnitController.getSelectedContentController());
        }
        this.f56792u = false;
        this.f56783l = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar2 = this.f53562b;
        com.fyber.inneractive.sdk.player.t tVar = xVar2 != null ? ((t0) xVar2).f53925i : null;
        Context context = viewGroup.getContext();
        f0 f0VarA = a(tVar);
        this.f56788q = f0VarA;
        if (f0VarA == null || (xVar = this.f53562b) == null) {
            return;
        }
        this.f56784m = f0VarA.a(context, ((t0) xVar).f53979c);
        this.f56750k = (com.fyber.inneractive.sdk.player.controller.s) this.f56788q.a(this.f53561a, (t0) this.f53562b);
        ViewGroup viewGroup2 = this.f56787p;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f56783l, new ViewGroup.LayoutParams(-1, -2));
            this.f56787p.setLayoutTransition(null);
        }
        this.f56783l.addView((View) this.f56784m, new FrameLayout.LayoutParams(-2, -2, 17));
        com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f56750k;
        q qVar = this.f56793v;
        sVar.getClass();
        sVar.f54507g = qVar;
        com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f56750k;
        this.f56788q.b();
        sVar2.b(false);
        this.f56788q.a(this.f56786o);
        ViewGroup viewGroup3 = this.f56787p;
        if (viewGroup3 != null) {
            n0 n0Var = l0.f57009a;
            n0Var.getClass();
            n0Var.a(viewGroup3.getContext(), viewGroup3, this);
        }
    }

    public boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    public VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof InneractiveAdViewVideoContentController) {
            return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
        }
        IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), inneractiveContentController != null ? inneractiveContentController.getClass().getSimpleName() : V8ValueNull.NULL);
        return null;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f3, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f56789r == f3 && this.f56790s.equals(rect)) {
            return;
        }
        this.f56789r = f3;
        this.f56790s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).f54490D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.f56784m).f();
            ((com.fyber.inneractive.sdk.player.controller.s) this.f56750k).a(f3);
        }
        if (f3 > 0.0f) {
            p pVar = this.f56791t;
            if (pVar != null && (viewGroup2 = this.f56787p) != null) {
                viewGroup2.removeCallbacks(pVar);
                this.f56791t = null;
            }
            p pVar2 = new p(this);
            this.f56791t = pVar2;
            ViewGroup viewGroup3 = this.f56787p;
            if (viewGroup3 != null) {
                viewGroup3.postDelayed(pVar2, 100L);
                return;
            }
            return;
        }
        p pVar3 = this.f56791t;
        if (pVar3 == null || (viewGroup = this.f56787p) == null) {
            return;
        }
        viewGroup.removeCallbacks(pVar3);
        this.f56791t = null;
    }

    public f0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f56402f == null) {
            return null;
        }
        return new a(tVar);
    }
}
