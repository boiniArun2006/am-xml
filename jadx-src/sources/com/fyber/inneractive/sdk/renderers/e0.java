package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e0 extends r implements y {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f56751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f56752x;

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean C() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean D() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final f0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar != null) {
            return new z(tVar);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.y
    public final void b(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        a(viewGroup);
        ImageView imageViewC = c(viewGroup);
        if (imageViewC == null || (mVar = this.f56784m) == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.ui.e) mVar).setWatermarkView(imageViewC);
    }

    static {
        IAlog.a(e0.class);
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final void I() {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.player.n nVar;
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || (xVar = this.f53562b) == null || ((t0) xVar).f53926j) {
            return;
        }
        IAlog.a("%sTracking impression", IAlog.a(this));
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) this.f53561a.getAdContent());
        this.f56751w = aVar;
        aVar.a(this);
        f0 f0Var = this.f56788q;
        if (f0Var != null && (nVar = f0Var.f56755c) != null) {
            if (nVar.f56390w.compareAndSet(false, true)) {
                nVar.a(nVar.f56383p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(nVar));
            }
        }
        super.I();
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f56751w;
        if (aVar != null) {
            aVar.a();
            this.f56751w = null;
        }
        WeakReference weakReference = this.f56752x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            tVar.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        l0.f57009a.a(this.f56787p);
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z2) {
        l0.f57009a.b(c((View) this.f56787p).getApplicationContext());
        WeakReference weakReference = this.f56752x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(new com.fyber.inneractive.sdk.player.ui.d(tVar, z2), 500L);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.flow.b0
    public final View x() {
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        MediaView mediaView = (inneractiveAdSpot == null || !(inneractiveAdSpot.getAdContent() instanceof w0)) ? null : ((w0) this.f53561a.getAdContent()).f53966n;
        return mediaView != null ? mediaView : this.f56787p;
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof NativeAdUnitController;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        if (inneractiveAdSpot.getAdContent() instanceof w0) {
            this.f53562b = ((w0) inneractiveAdSpot.getAdContent()).f53971s;
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.r
    public final VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (!(inneractiveContentController instanceof NativeAdVideoContentController)) {
            IAlog.f("%s: Content controller expected to be NativeAdVideoContentController but it: %s", IAlog.a(this), inneractiveContentController);
            return null;
        }
        return (VideoContentListener) ((NativeAdVideoContentController) inneractiveContentController).getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f56751w;
        if (aVar != null) {
            aVar.a();
            this.f56751w = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.r, com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.t tVar;
        com.fyber.inneractive.sdk.player.n nVar;
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
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        Float fValueOf = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar != null ? ((t0) xVar).f53925i : null;
        Context context = viewGroup.getContext();
        f0 f0VarA = a(tVar2);
        this.f56788q = f0VarA;
        if (f0VarA != null) {
            com.fyber.inneractive.sdk.player.ui.m mVarA = f0VarA.a(context, ((t0) this.f53562b).f53979c);
            this.f56784m = mVarA;
            if (mVarA instanceof com.fyber.inneractive.sdk.player.ui.t) {
                tVar = (com.fyber.inneractive.sdk.player.ui.t) mVarA;
                tVar.getViewTreeObserver().addOnWindowFocusChangeListener(this);
            } else {
                tVar = null;
            }
            this.f56752x = new WeakReference(tVar);
            this.f56750k = (com.fyber.inneractive.sdk.player.controller.s) this.f56788q.a(this.f53561a, (t0) this.f53562b);
            viewGroup.addView((View) this.f56784m, new ViewGroup.LayoutParams(-1, -1));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f56750k;
            q qVar = this.f56793v;
            sVar.getClass();
            sVar.f54507g = qVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f56750k;
            this.f56788q.b();
            sVar2.b(false);
            this.f56788q.a(this.f56786o);
            InneractiveAdSpot inneractiveAdSpot2 = this.f53561a;
            if (inneractiveAdSpot2 != null && (inneractiveAdSpot2.getAdContent() instanceof w0)) {
                w0 w0Var = (w0) this.f53561a.getAdContent();
                f0 f0Var = this.f56788q;
                com.fyber.inneractive.sdk.player.controller.q qVar2 = (f0Var == null || (nVar = f0Var.f56755c) == null) ? null : nVar.f56321a;
                if (qVar2 != null && qVar2.e() > 0 && qVar2.f() > 0) {
                    fValueOf = Float.valueOf(qVar2.f() / qVar2.e());
                }
                w0Var.f53968p = fValueOf;
            }
            n0 n0Var = l0.f57009a;
            ViewGroup viewGroup2 = this.f56787p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
            return;
        }
        IAlog.f("%s : can't render - video renderer is missing", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z2, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        com.fyber.inneractive.sdk.flow.x xVar;
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && (xVar = this.f53562b) != null && !((t0) xVar).f53926j) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
            if (bVar instanceof com.fyber.inneractive.sdk.player.controller.c0) {
                ((com.fyber.inneractive.sdk.player.controller.c0) bVar).f54430F.set(true);
            }
            com.fyber.inneractive.sdk.util.r.f57026b.post(new d0(this));
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new com.fyber.inneractive.sdk.flow.y(this, c((View) this.f56787p), str, new g1(), gVar, z2, oVar));
    }
}
