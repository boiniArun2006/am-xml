package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c0 extends e implements y, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewGroup f56734l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f56736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f56737o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f56735m = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f56738p = new a0(this);

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean C() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f3, Rect rect) {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).a(f3);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.y
    public final void b(ViewGroup viewGroup) {
        if (this.f53561a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f56734l = viewGroup;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(this.f56734l.getContext());
        this.f56737o = imageView;
        imageView.setImageURI(((w0) this.f53562b).f53965m);
        this.f56737o.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.f56734l.setLayoutParams(layoutParams);
        this.f56734l.addView(this.f56737o, layoutParams);
        com.fyber.inneractive.sdk.ui.controller.a aVar = new com.fyber.inneractive.sdk.ui.controller.a();
        this.f56750k = aVar;
        aVar.f56966a = this.f56738p;
        n0 n0Var = l0.f57009a;
        ViewGroup viewGroup2 = this.f56734l;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
        c(this.f56734l);
    }

    static {
        IAlog.a(c0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f56736n;
        if (aVar != null) {
            aVar.a();
            this.f56736n = null;
        }
        ImageView imageView = this.f56737o;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f56737o = null;
        }
        l0.f57009a.a(this.f56734l);
        com.fyber.inneractive.sdk.util.v.a(this.f56734l);
        this.f56734l = null;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f56966a = null;
        }
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z2) {
        l0.f57009a.b(com.fyber.inneractive.sdk.util.o.a(x()).getApplicationContext());
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View x() {
        MediaView mediaView;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        return (xVar == null || (mediaView = ((w0) xVar).f53966n) == null) ? this.f56734l : mediaView;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z2, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        if (!this.f56735m) {
            com.fyber.inneractive.sdk.util.r.f57026b.post(new b0(this));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f56750k;
            if (bVar instanceof com.fyber.inneractive.sdk.ui.controller.a) {
                ((com.fyber.inneractive.sdk.ui.controller.a) bVar).f56967b.set(true);
            }
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new com.fyber.inneractive.sdk.flow.y(this, com.fyber.inneractive.sdk.util.o.a(x()), str, new g1(), gVar, z2, oVar));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f56736n;
        if (aVar != null) {
            aVar.a();
        }
    }
}
