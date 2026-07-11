package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class v extends p0 implements com.fyber.inneractive.sdk.rtb.watermark.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public v1 f56802F;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.g f56806J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public com.fyber.inneractive.sdk.util.viewtime.b f56807K;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public u f56808x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public IAmraidWebViewController f56810z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f56809y = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f56797A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f56798B = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f56799C = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f56800D = false;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f56801E = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public UnitDisplayType f56803G = UnitDisplayType.INTERSTITIAL;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f56804H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f56805I = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        s0 s0Var;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        l0 l0Var = (xVar == null || (s0Var = ((q0) xVar).f53980d) == null) ? null : ((r0) s0Var).f53417c;
        if (l0Var == null) {
            IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f53810i : null;
        this.f56810z = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f57113b == null) {
            IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError(QiDPjiOCZHDS.HvqCQbKvEIQdxv);
        }
        ((q0) xVar).e();
        this.f56803G = l0Var.f53402b;
        this.f56797A = false;
        this.f56798B = false;
        this.f56807K = new com.fyber.inneractive.sdk.util.viewtime.b(this.f53561a);
        this.f53796k = eVar;
        if (this.f56810z == null) {
            IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f53562b);
            return;
        }
        View closeButton = eVar.getCloseButton();
        if (closeButton != null) {
            this.f56810z.a(closeButton, com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        }
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((q0) this.f53562b).f53978b;
        int i2 = fVar.f56853e;
        int i3 = fVar.f56854f;
        boolean z2 = (i2 == 300 && i3 == 250) || (i2 == 600 && i3 == 500);
        this.f56799C = z2;
        if (z2) {
            this.f56810z.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i2), com.fyber.inneractive.sdk.util.o.a(i3));
        }
        if (this.f56808x == null) {
            this.f56808x = new u(this);
        }
        this.f56810z.setListener(this.f56808x);
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f53561a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f53977a, adContent.f53978b, adContent.f53979c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar.f53676d;
            iFyberAdIdentifier.f56960k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.f56810z.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        P();
        IAmraidWebViewController iAmraidWebViewController2 = this.f56810z;
        ViewGroup layout = this.f53796k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((q0) this.f53562b).f53977a;
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.f57113b;
        if (mVar != null) {
            layout.addView(mVar);
            com.fyber.inneractive.sdk.util.l0.f57009a.a(layout.getContext(), iAmraidWebViewController2.f57113b, iAmraidWebViewController2);
            com.fyber.inneractive.sdk.web.m mVar2 = iAmraidWebViewController2.f57113b;
            if (mVar2 != null) {
                mVar2.setTapListener(iAmraidWebViewController2);
            }
        }
        this.f56797A = true;
        if (this.f56803G == UnitDisplayType.REWARDED) {
            v1 v1Var = new v1(TimeUnit.SECONDS, IAConfigManager.f53260M.f53294t.f53466b.a("rewarded_mraid_delay", 31, 30));
            this.f56802F = v1Var;
            v1Var.f57050e = new t(this);
            v1Var.f57049d = false;
            v1Var.f57048c.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return !this.f56799C && this.f56810z.f57142X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || (rVar = ((q0) xVar).f53979c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f53562b).f53979c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int L() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        if (xVar == null || (rVar = ((q0) xVar).f53979c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f53562b).f53979c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    @Override // com.fyber.inneractive.sdk.flow.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long M() {
        int iB;
        com.fyber.inneractive.sdk.response.e eVar;
        int iMin = 5;
        if (this.f56803G == UnitDisplayType.REWARDED) {
            iB = IAConfigManager.f53260M.f53294t.f53466b.a("rewarded_mraid_delay", 31, 30);
            IAlog.a("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(iB));
        } else {
            com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.f53260M.f53294t;
            if (sVar == null) {
                iB = 5;
            } else {
                com.fyber.inneractive.sdk.config.o oVar = sVar.f53466b;
                int iB2 = oVar.b("mraid_x_delay_v2", 5, 0);
                com.fyber.inneractive.sdk.config.l lVarA = oVar.a("int_configuration");
                if (lVarA != null && lVarA.f53400a.containsKey("close_d")) {
                    iB = lVarA.f53400a.containsKey("close_d") ? Integer.parseInt((String) lVarA.f53400a.get("close_d")) : 5;
                    if (iB < 0 || iB > 30) {
                        iB = 5;
                    }
                    this.f53805t = true;
                } else if (this.f56803G == UnitDisplayType.INTERSTITIAL) {
                    CreativeType creativeType = CreativeType.PLAYABLE;
                    com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
                    iB = creativeType.equals((xVar == null || (eVar = ((q0) xVar).f53978b) == null) ? null : ((com.fyber.inneractive.sdk.response.f) eVar).f56848J) ? oVar.b("d_ad_int_pl", iB2, 5) : iB2;
                }
            }
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (A()) {
                Integer numA = ((com.fyber.inneractive.sdk.config.global.features.c) ((q0) this.f53562b).f53979c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("skip_time_sec");
                int iIntValue = numA != null ? numA.intValue() : 5;
                if (iIntValue >= 0 && iIntValue <= 8) {
                    iMin = iIntValue;
                }
            } else {
                iMin = Math.min(iB, 5);
            }
            iB = Math.min(iMin, iB);
        }
        return iB * 1000;
    }

    public final void P() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f53562b == null || (iAmraidWebViewController = this.f56810z) == null) {
            IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.f57113b;
        if (mVar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z2) {
        if (!I()) {
            if (z2) {
                this.f53807v.a((String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.f53807v;
                aVar.f56980d = 0L;
                aVar.f56981e = 0L;
                aVar.f56982f = 0L;
                aVar.f56978b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f56810z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f56797A && !this.f56798B && (eventsListener = this.f53563c) != null) {
            this.f56798B = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f53561a);
        }
        this.f56808x = null;
        v1 v1Var = this.f56802F;
        if (v1Var != null) {
            v1Var.f57050e = null;
            this.f56802F = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f56810z;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.f57156I) == null) {
            return;
        }
        try {
            a88.n nVar = eVar.f54062a;
            if (nVar == null || view == null) {
                return;
            }
            nVar.O(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f56803G == UnitDisplayType.REWARDED && this.f56804H) {
            O();
        }
        if (!this.f56798B && (eventsListener = this.f53563c) != null) {
            this.f56798B = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f53561a);
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.f56807K;
        if (bVar != null && bVar.f57054c != 0) {
            String strA = com.fyber.inneractive.sdk.util.c0.a(System.currentTimeMillis(), bVar.f57054c, bVar.f57056e);
            InneractiveAdSpot inneractiveAdSpot = bVar.f57053b;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f53977a : null;
            com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.f53978b : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f53979c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.f54359c = uVar;
            wVar.f54357a = inneractiveAdRequest;
            wVar.f54360d = jSONArrayB;
            wVar.a("time", strA);
            wVar.a((String) null);
            bVar.f57054c = 0L;
            bVar.f57055d = 0L;
            bVar.f57056e = 0L;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f53561a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
        v1 v1Var;
        v1 v1Var2 = this.f53798m;
        if (v1Var2 != null) {
            v1Var2.f57049d = false;
            v1Var2.a(SystemClock.uptimeMillis());
        }
        v1 v1Var3 = this.f53800o;
        if (v1Var3 != null) {
            v1Var3.f57049d = false;
            v1Var3.a(SystemClock.uptimeMillis());
        }
        if (this.f56803G == UnitDisplayType.REWARDED && (v1Var = this.f56802F) != null) {
            v1Var.f57049d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.f56807K;
        if (bVar != null) {
            if (bVar.f57054c == 0) {
                bVar.f57054c = System.currentTimeMillis();
            }
            if (bVar.f57055d > 0) {
                bVar.f57056e += System.currentTimeMillis() - bVar.f57055d;
                bVar.f57055d = 0L;
            }
        }
        this.f53807v.a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
        v1 v1Var;
        v1 v1Var2 = this.f53798m;
        if (v1Var2 != null) {
            v1Var2.f57049d = true;
            t1 t1Var = v1Var2.f57048c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        v1 v1Var3 = this.f53800o;
        if (v1Var3 != null) {
            v1Var3.f57049d = true;
            t1 t1Var2 = v1Var3.f57048c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
        if (this.f56803G == UnitDisplayType.REWARDED && (v1Var = this.f56802F) != null) {
            v1Var.f57049d = true;
            t1 t1Var3 = v1Var.f57048c;
            if (t1Var3 != null) {
                t1Var3.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.f56807K;
        if (bVar != null) {
            bVar.f57055d = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f53807v;
        if (aVar.f56978b && aVar.f56981e == 0) {
            aVar.f56981e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        boolean z2;
        if (this.f53796k == null) {
            z2 = true;
        } else if (this.f56803G == UnitDisplayType.REWARDED) {
            if (this.f56804H) {
                O();
            }
            z2 = this.f56804H;
        } else {
            z2 = this.f53801p;
        }
        if (!z2) {
            return true;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f53796k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context w() {
        IAmraidWebViewController iAmraidWebViewController = this.f56810z;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.f57113b : null);
    }

    public final void O() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.f56805I) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.f56806J != null) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY;
            com.fyber.inneractive.sdk.cache.session.e eVar = IAConfigManager.f53260M.f53297w.f53492a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f57025a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
            com.fyber.inneractive.sdk.external.g gVar = this.f56806J;
            i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(((com.fyber.inneractive.sdk.flow.s0) gVar.f53549a).mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f53549a.f53527b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.f56810z;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.f57151D) {
            H();
        }
        this.f56805I = true;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        P();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j2) {
        if (this.f56803G == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.f53805t) {
            return j2;
        }
        long j3 = 13;
        try {
            j3 = Long.parseLong(IAConfigManager.f53260M.f53294t.f53466b.a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j3 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.f56806J = gVar;
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.a
    public final void a(FrameLayout frameLayout) {
        IAmraidWebViewController iAmraidWebViewController = this.f56810z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(frameLayout, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark);
        }
    }
}
