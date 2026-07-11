package com.fyber.inneractive.sdk.external;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.factories.j;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.renderers.c0;
import com.fyber.inneractive.sdk.renderers.e0;
import com.fyber.inneractive.sdk.renderers.y;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class NativeAdUnitController extends s0 implements com.fyber.inneractive.sdk.flow.nativead.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f53540a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f53541b;

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }

    public final void a() {
        ViewGroup viewGroup = this.f53541b;
        if (viewGroup != null) {
            this.f53541b = null;
            IAlog.a("%s: unbindView called with %s", logPrefix(), viewGroup);
            IAlog.a("%s: spot is %s", logPrefix(), getAdSpot());
            Iterator it = new HashSet(this.f53540a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                    if (dVar.b(viewGroup)) {
                        IAlog.a("%s: unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                        dVar.s();
                        break;
                    }
                }
            }
        }
        Iterator it2 = new HashSet(this.f53540a).iterator();
        while (it2.hasNext()) {
            ((InneractiveAdRenderer) it2.next()).destroy();
        }
        this.f53540a.clear();
        this.f53541b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.a
    public void bind(MediaView mediaView) {
        y c0Var;
        r rVar;
        IAlog.a(QiDPjiOCZHDS.mEhmYK, logPrefix(), mediaView);
        InneractiveAdSpot adSpot = getAdSpot();
        com.fyber.inneractive.sdk.response.e eVar = null;
        if (adSpot == null) {
            IAlog.f("NativeAdUnitController was not attached to an ad spot", new Object[0]);
        } else {
            Iterator it = new HashSet(this.f53540a).iterator();
            while (true) {
                if (it.hasNext()) {
                    InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                    if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                        com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                        if (dVar.b(mediaView)) {
                            dVar.l();
                            IAlog.a("%s: bindView returning an already attached renderer %s", logPrefix(), dVar);
                            break;
                        }
                    }
                } else {
                    this.f53541b = mediaView;
                    Iterator it2 = j.f53557a.f53558a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ((com.fyber.inneractive.sdk.nativead.d) it2.next()).getClass();
                            if (adSpot.getAdContent() instanceof w0) {
                                x adContent = adSpot.getAdContent();
                                if ((adContent instanceof w0) && adContent.isVideoAd()) {
                                    c0Var = new e0();
                                } else {
                                    c0Var = new c0();
                                }
                            }
                        } else {
                            c0Var = null;
                            break;
                        }
                    }
                    if (c0Var != null) {
                        ((w0) adSpot.getAdContent()).f53973u.f53744b = c0Var;
                        c0Var.initialize(adSpot);
                        selectContentController();
                        c0Var.b(mediaView);
                        this.f53540a.add(c0Var);
                        IAlog.a("%s: created renderer %s", logPrefix(), c0Var);
                    } else {
                        IAlog.f("%s: Could not find a renderer for the given spot!", logPrefix());
                    }
                }
            }
        }
        i0 i0Var = this.mAdSpot.get();
        if (i0Var != null && i0Var.getAdContent() != null) {
            x adContent2 = i0Var.getAdContent();
            eVar = adContent2.f53978b;
            rVar = adContent2.f53979c;
        } else {
            rVar = null;
        }
        View viewCreatePrivacyView = createPrivacyView(mediaView.getContext(), eVar, rVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        mediaView.addView(viewCreatePrivacyView, layoutParams);
    }

    public View createPrivacyView(Context context, com.fyber.inneractive.sdk.response.e eVar, r rVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, (ViewGroup) null, false);
        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, null, eVar, rVar);
        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
        IFyberAdIdentifier iFyberAdIdentifier = gVar.f53676d;
        iFyberAdIdentifier.f56960k = corner;
        iFyberAdIdentifier.a(viewGroup);
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            a();
        } else {
            com.fyber.inneractive.sdk.util.r.f57026b.post(new h(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof NativeAdContent;
    }
}
