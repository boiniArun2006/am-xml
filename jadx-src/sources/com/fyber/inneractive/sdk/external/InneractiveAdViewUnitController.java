package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.flow.g0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.r0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class InneractiveAdViewUnitController extends s0 implements g0, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f53522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f53524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53525d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public InneractiveAdViewUnitController() {
        this.f53523b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f53525d = 0;
        this.f53522a = new HashSet();
    }

    public final void a() {
        this.f53523b = true;
        Iterator it = new HashSet(this.f53522a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f53522a.clear();
        this.f53524c = null;
        super.destroy();
    }

    public void refreshAd() {
        IAlog.a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof r0)) {
            return;
        }
        ((r0) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return true;
    }

    public int getAdContentHeight() {
        int iN;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f53522a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iN = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).n()) > 0) {
                return iN;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int iD;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f53522a) {
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iD = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).d()) > 0) {
                return iD;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        com.fyber.inneractive.sdk.interfaces.f fVarB;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        Iterator it = com.fyber.inneractive.sdk.factories.h.f53555a.f53556a.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVarB = null;
                break;
            }
            com.fyber.inneractive.sdk.factories.g gVar = (com.fyber.inneractive.sdk.factories.g) it.next();
            if (gVar.a(inneractiveAdSpot)) {
                fVarB = gVar.b(inneractiveAdSpot);
                break;
            }
        }
        this.f53522a.add(fVarB);
        return fVarB;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f53522a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).p();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.d dVar;
        Iterator it = new HashSet(this.f53522a).iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (dVar != null) {
            dVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof h0) {
                int i2 = IAlog.f56974a;
                IAlog.d("%s %s", "AD_REFRESH", ((h0) inneractiveAdSpot).f53684h.f53791d.b());
            }
        } catch (Exception unused) {
        }
        IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void unbindView(View view) {
        if (this.f53524c != view) {
            IAlog.f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f53524c, view);
        } else {
            this.f53524c = null;
        }
        IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f53522a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(view)) {
                    IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    dVar.s();
                    this.f53522a.remove(dVar);
                    return;
                }
            }
        }
    }

    public void bindView(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.d dVarA;
        IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f53522a)) {
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(viewGroup)) {
                    dVar.l();
                    IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), dVar);
                    return;
                }
            }
        }
        this.f53524c = viewGroup;
        Iterator it = com.fyber.inneractive.sdk.factories.b.f53551a.f53552a.iterator();
        while (true) {
            if (it.hasNext()) {
                com.fyber.inneractive.sdk.factories.a aVar = (com.fyber.inneractive.sdk.factories.a) it.next();
                if (aVar.a(adSpot)) {
                    dVarA = aVar.a();
                    break;
                }
            } else {
                dVarA = null;
                break;
            }
        }
        int i2 = this.f53525d;
        if (i2 != 0) {
            dVarA.a(i2);
        }
        if (dVarA != null) {
            dVarA.initialize(adSpot);
            selectContentController();
            dVarA.a(viewGroup);
            this.f53522a.add(dVarA);
            IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), dVarA);
            return;
        }
        IAlog.f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        Iterator it = this.f53522a.iterator();
        while (it.hasNext()) {
            if (!((InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            a();
        } else {
            r.f57026b.post(new f(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) inneractiveAdSpot.getAdContent().f53980d;
        if (r0Var.f53419e != null) {
            return false;
        }
        l0 l0Var = r0Var.f53417c;
        if (l0Var != null) {
            if (UnitDisplayType.BANNER.equals(l0Var.f53402b) || UnitDisplayType.MRECT.equals(l0Var.f53402b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(l0Var.f53402b)) {
                if (inneractiveAdSpot.getCurrentProcessedRequest() == null || !inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen()) {
                    return false;
                }
                return true;
            }
        }
        t0 t0Var = r0Var.f53420f;
        if (t0Var == null || (!UnitDisplayType.LANDSCAPE.equals(t0Var.f53480j) && !UnitDisplayType.SQUARE.equals(t0Var.f53480j) && !UnitDisplayType.MRECT.equals(t0Var.f53480j))) {
            return false;
        }
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.f fVar) {
        WeakReference<i0> weakReference;
        IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), fVar);
        HashSet hashSet = this.f53522a;
        if (hashSet != null) {
            hashSet.remove(fVar);
        }
        if (!this.f53523b) {
            for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f53522a)) {
                if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                    ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).q();
                    if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                        ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                    }
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i2) {
        this();
        if (i2 >= 30) {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i2));
            this.f53525d = i2;
        } else {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i2), 30);
            this.f53525d = 30;
        }
    }

    public InneractiveAdViewUnitController(boolean z2) {
        this();
        if (z2) {
            this.f53525d = -1;
        }
    }
}
