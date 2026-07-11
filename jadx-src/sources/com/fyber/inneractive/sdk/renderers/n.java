package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n extends com.fyber.inneractive.sdk.flow.b0 implements com.fyber.inneractive.sdk.interfaces.d, com.fyber.inneractive.sdk.util.a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public k f56762A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f56763B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InneractiveAdViewUnitController f56765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAmraidWebViewController f56766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f56767n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f56769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f56770q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f56772s;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f56778y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f56779z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f56764k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f56768o = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f56771r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f56773t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f56774u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f56775v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f56776w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f56777x = false;

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof q0;
    }

    public final void d(boolean z2) {
        if (this.f56772s != null) {
            this.f56776w = z2;
            I();
            this.f56774u = this.f56764k - (System.currentTimeMillis() - this.f56771r);
            IAlog.a("%sPause refresh time : time remaning:%d ,refreshInterval: %d", IAlog.a(this), Long.valueOf(this.f56774u), Long.valueOf(this.f56764k));
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void l() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    public final void I() {
        if (this.f56772s != null) {
            IAlog.a("%scancelling refreen runnable", IAlog.a(this));
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(this.f56772s);
            this.f56772s = null;
        }
    }

    public final void J() {
        d dVar = this.f56778y;
        if (dVar != null) {
            dVar.f56745g = false;
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar.f56748j);
        }
        if (this.f56766m != null) {
            I();
            com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
            if (xVar != null) {
                ((q0) xVar).destroy();
            }
            this.f56766m = null;
            this.f53562b = null;
            ViewGroup viewGroup = this.f56769p;
            if (viewGroup != null) {
                viewGroup.removeView(this.f56770q);
            }
            l lVar = this.f56770q;
            if (lVar != null) {
                lVar.removeAllViews();
                this.f56770q = null;
            }
        }
        this.f56775v = false;
    }

    public final int K() {
        l0 l0Var;
        int iIntValue;
        int i2 = this.f56773t;
        if (i2 == -1) {
            IAlog.a("%sreturning disable value for banner refresh", IAlog.a(this));
            return 0;
        }
        if (i2 <= 0) {
            s0 s0Var = this.f53561a.getAdContent().f53980d;
            if (s0Var != null && (l0Var = ((r0) s0Var).f53417c) != null) {
                Integer num = l0Var.f53401a;
                IAlog.a("%sreturning refreshConfig = %d", IAlog.a(this), num);
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
            IAlog.a("%sgetRefreshInterval: returning 0. Refresh is disabled", IAlog.a(this));
            return 0;
        }
        IAlog.a("%sreturning overriden refresh interval = %d", IAlog.a(this), Integer.valueOf(this.f56773t));
        iIntValue = this.f56773t;
        return iIntValue * 1000;
    }

    public final boolean L() {
        s0 s0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        return (xVar == null || (s0Var = ((q0) xVar).f53980d) == null || ((r0) s0Var).f53417c == null || ((r0) s0Var).f53417c.f53402b == null || !((r0) s0Var).f53417c.f53402b.isFullscreenUnit()) ? false : true;
    }

    public final void M() {
        InneractiveAdViewUnitController inneractiveAdViewUnitController;
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f57113b == null) {
            return;
        }
        IAlog.a("%srefreshing ad", IAlog.a(this));
        if ((!this.f56766m.p() || this.f56766m.f57132N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) && (inneractiveAdViewUnitController = this.f56765l) != null) {
            this.f56771r = 0L;
            inneractiveAdViewUnitController.refreshAd();
        }
    }

    public final void N() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController == null || (mVar = iAmraidWebViewController.f57113b) == null || !mVar.getIsVisible() || this.f56771r == 0 || this.f56766m.p() || this.f56766m.f57132N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            return;
        }
        if (!this.f56776w) {
            if (this.f56764k < System.currentTimeMillis() - this.f56771r) {
                this.f56774u = 1L;
            } else {
                this.f56774u = this.f56764k - (System.currentTimeMillis() - this.f56771r);
            }
        }
        IAlog.a("%sresuming refresh runnable mRefreshTimeStamp %d", IAlog.a(this), Long.valueOf(this.f56774u));
        a(false, this.f56774u);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.rtb.watermark.b bVar;
        int i2;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        l lVar;
        InneractiveAdSpot inneractiveAdSpot = this.f53561a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f56768o = false;
        this.f53565e = false;
        if (viewGroup != null) {
            this.f56769p = viewGroup;
            this.f56765l = (InneractiveAdViewUnitController) inneractiveAdSpot.getSelectedUnitController();
        } else if (!this.f56777x) {
            J();
            if (!(this.f53561a.getAdContent() instanceof q0)) {
                IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f53561a.getAdContent());
                return;
            }
            this.f53562b = (q0) this.f53561a.getAdContent();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f53562b;
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f53810i : null;
        this.f56766m = iAmraidWebViewController;
        if (iAmraidWebViewController != null) {
            if (this.f56767n == null) {
                this.f56767n = new h(this);
            }
            iAmraidWebViewController.setListener(this.f56767n);
            InneractiveAdRequest inneractiveAdRequest = ((q0) this.f53562b).f53977a;
            int i3 = -1;
            if (L()) {
                l lVar2 = new l(this.f56769p.getContext(), 1.5f);
                this.f56770q = lVar2;
                IAmraidWebViewController iAmraidWebViewController2 = this.f56766m;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.f57113b;
                if (mVar != null) {
                    lVar2.addView(mVar, layoutParams);
                    com.fyber.inneractive.sdk.util.l0.f57009a.a(lVar2.getContext(), iAmraidWebViewController2.f57113b, iAmraidWebViewController2);
                    com.fyber.inneractive.sdk.web.m mVar2 = iAmraidWebViewController2.f57113b;
                    if (mVar2 != null) {
                        mVar2.setTapListener(iAmraidWebViewController2);
                    }
                }
                this.f56769p.addView(this.f56770q, new ViewGroup.LayoutParams(-2, -2));
            } else {
                this.f56770q = new l(this.f56769p.getContext(), 0.0f);
                q0 q0Var = (q0) this.f53562b;
                com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) q0Var.f53978b;
                h1 h1VarA = a(fVar.f56853e, fVar.f56854f, q0Var.f53980d);
                this.f56766m.setAdDefaultSize(h1VarA.f57002a, h1VarA.f57003b);
                IAmraidWebViewController iAmraidWebViewController3 = this.f56766m;
                View view = iAmraidWebViewController3.f57113b;
                if (view != null || com.fyber.inneractive.sdk.util.o.f57018a == null) {
                    ViewParent parent = view != null ? view.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    RelativeLayout.LayoutParams layoutParamsA = com.fyber.inneractive.sdk.util.v.a(h1VarA.f57002a, h1VarA.f57003b, 13);
                    IAmraidWebViewController iAmraidWebViewController4 = this.f56766m;
                    l lVar3 = this.f56770q;
                    com.fyber.inneractive.sdk.web.m mVar3 = iAmraidWebViewController4.f57113b;
                    if (mVar3 != null) {
                        lVar3.addView(mVar3, layoutParamsA);
                        com.fyber.inneractive.sdk.util.l0.f57009a.a(lVar3.getContext(), iAmraidWebViewController4.f57113b, iAmraidWebViewController4);
                        com.fyber.inneractive.sdk.web.m mVar4 = iAmraidWebViewController4.f57113b;
                        if (mVar4 != null) {
                            mVar4.setTapListener(iAmraidWebViewController4);
                        }
                    }
                    this.f56769p.addView(this.f56770q);
                    l lVar4 = this.f56770q;
                    ViewGroup.LayoutParams layoutParams2 = lVar4.getLayoutParams();
                    layoutParams2.width = -2;
                    layoutParams2.height = -2;
                    lVar4.setLayoutParams(layoutParams2);
                    InneractiveAdSpot inneractiveAdSpot2 = this.f53561a;
                    if (inneractiveAdSpot2 != null && inneractiveAdSpot2.getAdContent() != null && (viewGroup2 = this.f56769p) != null) {
                        Context context = viewGroup2.getContext();
                        com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(context, false, this.f53561a.getAdContent().f53977a, this.f53561a.getAdContent().f53978b, this.f53561a.getAdContent().f53979c);
                        ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.ia_layout_fyber_ad_identifier_relative, this.f56769p, false);
                        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
                        IFyberAdIdentifier iFyberAdIdentifier = gVar.f53676d;
                        iFyberAdIdentifier.f56960k = corner;
                        iFyberAdIdentifier.a(viewGroup4);
                        viewGroup4.setVisibility(0);
                        IAmraidWebViewController iAmraidWebViewController5 = this.f56766m;
                        if (iAmraidWebViewController5 == null) {
                            viewGroup3 = null;
                        } else {
                            viewGroup3 = iAmraidWebViewController5.f57113b;
                            if (viewGroup3 != null && viewGroup3.getParent() != null) {
                                viewGroup3 = (ViewGroup) viewGroup3.getParent();
                            }
                        }
                        if (viewGroup3 != null && x() != null) {
                            ViewGroup.LayoutParams layoutParams3 = x().getLayoutParams();
                            IAmraidWebViewController iAmraidWebViewController6 = this.f56766m;
                            viewGroup3.addView(viewGroup4, layoutParams3);
                            iAmraidWebViewController6.a(viewGroup4, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
                        }
                    }
                    InneractiveAdSpot inneractiveAdSpot3 = this.f53561a;
                    if (inneractiveAdSpot3 != null && (inneractiveAdSpot3 instanceof h0) && this.f56766m != null && this.f56770q != null && view != null && (bVar = ((h0) inneractiveAdSpot3).f53689m) != null) {
                        ImageView imageView = bVar.f56910a;
                        this.f56763B = imageView;
                        if (imageView != null) {
                            if (L()) {
                                i2 = -1;
                            } else {
                                i3 = h1VarA.f57002a;
                                i2 = h1VarA.f57003b;
                            }
                            if (this.f56779z == null) {
                                j jVar = new j(this);
                                this.f56779z = jVar;
                                view.addOnLayoutChangeListener(jVar);
                            }
                            if (this.f56762A == null) {
                                k kVar = new k(this);
                                this.f56762A = kVar;
                                view.addOnAttachStateChangeListener(kVar);
                            }
                            this.f56763B.setLayoutParams(com.fyber.inneractive.sdk.util.v.a(i3, i2, 13));
                            this.f56770q.addView(this.f56763B);
                            IAmraidWebViewController iAmraidWebViewController7 = this.f56766m;
                            h1 h1Var = new h1(i3, i2);
                            iAmraidWebViewController7.o0 = bVar;
                            iAmraidWebViewController7.p0 = h1Var;
                            ImageView imageView2 = bVar.f56910a;
                            if (imageView2 != null) {
                                iAmraidWebViewController7.a(imageView2, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark);
                            }
                        }
                    }
                } else if (this.f56777x) {
                    FrameLayout frameLayout = new FrameLayout(this.f56769p.getContext());
                    frameLayout.setBackgroundResource(R.color.ia_blank_background);
                    this.f56769p.removeAllViews();
                    this.f56769p.addView(frameLayout, new FrameLayout.LayoutParams(h1VarA.f57002a, h1VarA.f57003b, 17));
                } else {
                    this.f56777x = true;
                    iAmraidWebViewController3.f57113b = iAmraidWebViewController3.a(((q0) this.f53562b).f53979c);
                    try {
                        iAmraidWebViewController3.h();
                        DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(iAmraidWebViewController3.f57113b, iAmraidWebViewController3.f57127p, iAmraidWebViewController3.f57128q, "text/html", "utf-8", null);
                    } catch (Throwable unused) {
                        FrameLayout frameLayout2 = new FrameLayout(this.f56769p.getContext());
                        frameLayout2.setBackgroundResource(R.color.ia_blank_background);
                        this.f56769p.removeAllViews();
                        this.f56769p.addView(frameLayout2, new FrameLayout.LayoutParams(h1VarA.f57002a, h1VarA.f57003b, 17));
                    }
                }
            }
            com.fyber.inneractive.sdk.flow.x xVar2 = this.f53562b;
            com.fyber.inneractive.sdk.response.f fVar2 = xVar2 != null ? (com.fyber.inneractive.sdk.response.f) ((q0) xVar2).f53978b : null;
            if (fVar2 != null && (lVar = this.f56770q) != null) {
                d dVar = new d(fVar2, lVar, new g(this));
                this.f56778y = dVar;
                dVar.f56746h = false;
                dVar.f56742d = 1;
                dVar.f56743e = 0.0f;
                int i5 = fVar2.f56867s;
                if (i5 >= 1) {
                    dVar.f56742d = Math.min(i5, 100);
                }
                float f3 = fVar2.f56868t;
                if (f3 >= -1.0f) {
                    dVar.f56743e = f3;
                }
                if (dVar.f56743e >= 0.0f) {
                    IAlog.a("IAVisibilityTracker: startTrackingVisibility", new Object[0]);
                    dVar.f56741c = 0.0f;
                    dVar.f56744f = System.currentTimeMillis();
                    dVar.f56745g = true;
                    dVar.a();
                }
            }
        } else {
            IAlog.f("InneractiveAdViewMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", xVar);
        }
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f57062a;
        if (b0Var.f56983a.contains(this)) {
            return;
        }
        b0Var.f56983a.add(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f56769p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final boolean canRefreshAd() {
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.p() || this.f56766m.f57132N == com.fyber.inneractive.sdk.mraid.f0.RESIZED) ? false : true;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null && (mVar = iAmraidWebViewController.f57113b) != null) {
            j jVar = this.f56779z;
            if (jVar != null) {
                mVar.removeOnLayoutChangeListener(jVar);
            }
            k kVar = this.f56762A;
            if (kVar != null) {
                mVar.removeOnAttachStateChangeListener(kVar);
            }
        }
        this.f56763B = null;
        I();
        J();
        this.f56767n = null;
        com.fyber.inneractive.sdk.util.z.f57062a.f56983a.remove(this);
        i iVar = this.f56772s;
        if (iVar != null) {
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(iVar);
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
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

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int n() {
        return this.f56766m.e0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void s() {
        d dVar = this.f56778y;
        if (dVar != null) {
            dVar.f56745g = false;
            com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(dVar.f56748j);
        }
        l lVar = this.f56770q;
        if (lVar != null) {
            lVar.removeAllViews();
            this.f56770q = null;
        }
        ViewGroup viewGroup = this.f56769p;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f56769p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View x() {
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null) {
            return iAmraidWebViewController.f57113b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int y() {
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f57113b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f56766m.e0) : com.fyber.inneractive.sdk.util.o.c(this.f56766m.f57113b.getHeight());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int z() {
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null) {
            return (iAmraidWebViewController.f57113b == null || !iAmraidWebViewController.p()) ? com.fyber.inneractive.sdk.util.o.c(this.f56766m.d0) : com.fyber.inneractive.sdk.util.o.c(this.f56766m.f57113b.getWidth());
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void p() {
        com.fyber.inneractive.sdk.web.m mVar;
        IAlog.a("%sgot onAdRefreshFailed", IAlog.a(this));
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null && (mVar = iAmraidWebViewController.f57113b) != null) {
            if (mVar.getIsVisible() && !com.fyber.inneractive.sdk.util.z.f57062a.f56984b && !this.f56766m.p() && this.f56766m.f57132N != com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                IAlog.a("%sview is visible and screen is unlocked: refreshing ad and webView is not expanded", IAlog.a(this));
                long jK = K();
                this.f56764k = jK;
                if (jK != 0) {
                    a(false, 10000L);
                    return;
                }
                return;
            }
            IAlog.a("%sview is not visible or screen is locked or webView is Expanded or web is Resised. Waiting for visibility change", IAlog.a(this));
            this.f56774u = 1L;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int d() {
        return this.f56766m.d0;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f56766m;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    public final void a(boolean z2, long j2) {
        IAmraidWebViewController iAmraidWebViewController;
        com.fyber.inneractive.sdk.web.m mVar;
        if (!TextUtils.isEmpty(this.f53561a.getMediationNameString()) || j2 == 0 || (this.f53561a.getSelectedUnitController() instanceof InneractiveFullscreenUnitController) || this.f56773t == -1 || (iAmraidWebViewController = this.f56766m) == null || (mVar = iAmraidWebViewController.f57113b) == null) {
            return;
        }
        if (!mVar.getIsVisible()) {
            IAlog.a("%sstartRefreshTimer called but ad is not visible", IAlog.a(this));
            return;
        }
        this.f56771r = System.currentTimeMillis();
        this.f56764k = z2 ? this.f56764k : j2;
        IAlog.a("%sstartRefreshTimer in %d msec, mRefreshInterval = %d", IAlog.a(this), Long.valueOf(j2), Long.valueOf(this.f56764k));
        if (j2 > 1) {
            i iVar = this.f56772s;
            if (iVar != null) {
                com.fyber.inneractive.sdk.util.r.f57026b.removeCallbacks(iVar);
            }
            I();
            i iVar2 = new i(this);
            this.f56772s = iVar2;
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(iVar2, j2);
            return;
        }
        M();
    }

    public static h1 a(int i2, int i3, s0 s0Var) {
        int iA;
        int iA2;
        l0 l0Var;
        IAlog.a("View layout params: response width and height: %d, %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 > 0 && i3 > 0) {
            iA = com.fyber.inneractive.sdk.util.o.a(i2);
            iA2 = com.fyber.inneractive.sdk.util.o.a(i3);
        } else {
            UnitDisplayType unitDisplayType = UnitDisplayType.BANNER;
            if (s0Var != null && (l0Var = ((r0) s0Var).f53417c) != null) {
                unitDisplayType = l0Var.f53402b;
            }
            if (unitDisplayType.equals(UnitDisplayType.MRECT)) {
                iA = com.fyber.inneractive.sdk.util.o.a(m.RECTANGLE_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(m.RECTANGLE_HEIGHT.value);
            } else if (com.fyber.inneractive.sdk.util.k.m()) {
                iA = com.fyber.inneractive.sdk.util.o.a(m.BANNER_TABLET_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(m.BANNER_TABLET_HEIGHT.value);
            } else {
                iA = com.fyber.inneractive.sdk.util.o.a(m.BANNER_WIDTH.value);
                iA2 = com.fyber.inneractive.sdk.util.o.a(m.BANNER_HEIGHT.value);
            }
        }
        IAlog.e("View layout params: final scaled width and height: %d, %d", Integer.valueOf(iA), Integer.valueOf(iA2));
        return new h1(iA, iA2);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i2) {
        this.f56773t = i2;
    }
}
