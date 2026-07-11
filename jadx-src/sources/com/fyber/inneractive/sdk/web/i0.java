package com.fyber.inneractive.sdk.web;

import a88.fuX;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class i0 extends i1 {
    public static final String[] q0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public com.fyber.inneractive.sdk.mraid.f0 f57132N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final z f57133O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final d0 f57134P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final c0 f57135Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ViewGroup f57136R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public m f57137S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f57138T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f57139U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public e0 f57140V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public IAcloseButton f57141W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f57142X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float f57143Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f57144Z;
    public int a0;
    public int b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f57145c0;
    public int d0;
    public int e0;
    public Orientation f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f57146g0;
    public FrameLayout h0;
    public FrameLayout i0;
    public FrameLayout j0;
    public int k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f57147l0;
    public t m0;
    public final p n0;
    public com.fyber.inneractive.sdk.rtb.watermark.b o0;
    public com.fyber.inneractive.sdk.util.h1 p0;

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public void a(boolean z2) {
        a(new com.fyber.inneractive.sdk.mraid.g0(z2));
        super.a(z2);
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
        com.fyber.inneractive.sdk.util.r.f57026b.post(new r(this));
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
        m mVar = this.f57113b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.f57113b.getViewTreeObserver().removeOnPreDrawListener(this.n0);
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new s(this));
    }

    public void setResizeProperties() {
    }

    public final void d(boolean z2) {
        try {
            Activity activity = (Activity) com.fyber.inneractive.sdk.util.o.a(this.f57113b);
            if (activity != null) {
                if (!z2 || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                    activity.setRequestedOrientation(this.f57139U);
                } else {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                }
            }
        } catch (Exception unused) {
            IAlog.a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.util.g1 g() {
        m mVar;
        return (this.f57132N != com.fyber.inneractive.sdk.mraid.f0.EXPANDED || (mVar = this.f57137S) == null) ? super.g() : mVar.getLastClickedLocation();
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void j() {
        m mVar = this.f57113b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void k() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f57113b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.f57113b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.f57144Z, this.a0));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.b0, this.f57145c0));
        } else {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.f57113b.getWidthDp(), this.f57113b.getHeightDp()));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f57113b.getWidthDp(), this.f57113b.getHeightDp()));
        }
        m mVar2 = this.f57113b;
        int iC = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.b0);
        m mVar3 = this.f57113b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(iC, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.f57145c0)));
        a(arrayList);
        com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        this.f57132N = f0Var;
        a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final boolean m() {
        c0 c0Var = this.f57135Q;
        return c0Var != null && c0Var.equals(c0.INTERSTITIAL);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        ViewGroup viewGroup;
        m mVar;
        ViewGroup viewGroup2;
        m mVar2;
        com.fyber.inneractive.sdk.mraid.f0 f0Var;
        ViewGroup viewGroup3 = this.f57136R;
        ViewGroup viewGroup4 = null;
        if (viewGroup3 == null) {
            viewGroup = null;
        } else {
            View viewFindViewById = viewGroup3.findViewById(R.id.ia_identifier_overlay);
            if (viewFindViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewFindViewById;
            }
        }
        if (viewGroup == null) {
            m mVar3 = this.f57113b;
            if (mVar3 != null) {
                View viewFindViewById2 = mVar3.findViewById(R.id.ia_identifier_overlay);
                if (viewFindViewById2 instanceof ViewGroup) {
                    viewGroup4 = (ViewGroup) viewFindViewById2;
                }
            }
        } else {
            viewGroup4 = viewGroup;
        }
        this.f57138T = false;
        if (p() || (f0Var = this.f57132N) == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            c(false);
            m mVar4 = this.f57113b;
            if (mVar4 != null) {
                com.fyber.inneractive.sdk.mraid.f0 f0Var2 = this.f57132N;
                if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.EXPANDED) {
                    FrameLayout frameLayout = this.i0;
                    if (frameLayout != null && this.j0 != null) {
                        frameLayout.removeAllViewsInLayout();
                        this.j0.removeAllViewsInLayout();
                        ViewGroup viewGroup5 = this.f57136R;
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(this.j0);
                        }
                    }
                    FrameLayout frameLayout2 = this.h0;
                    if (frameLayout2 != null && (viewGroup2 = (ViewGroup) frameLayout2.getParent()) != null) {
                        viewGroup2.addView(this.f57113b, this.f57146g0);
                        m mVar5 = this.f57113b;
                        int i2 = this.k0;
                        int i3 = this.f57147l0;
                        ViewGroup.LayoutParams layoutParams = mVar5.getLayoutParams();
                        layoutParams.width = i2;
                        layoutParams.height = i3;
                        mVar5.setLayoutParams(layoutParams);
                        com.fyber.inneractive.sdk.util.o.a(this.f57113b, 17);
                        viewGroup2.removeView(this.h0);
                        viewGroup2.invalidate();
                        this.f57113b.requestLayout();
                    }
                    this.d0 = this.k0;
                    this.e0 = this.f57147l0;
                } else if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                    int i5 = this.k0;
                    this.d0 = i5;
                    int i7 = this.f57147l0;
                    this.e0 = i7;
                    ViewGroup.LayoutParams layoutParams2 = mVar4.getLayoutParams();
                    layoutParams2.width = i5;
                    layoutParams2.height = i7;
                    mVar4.setLayoutParams(layoutParams2);
                    com.fyber.inneractive.sdk.util.o.a(this.f57113b, 17);
                }
            }
            if (viewGroup4 != null && (mVar = this.f57113b) != null) {
                viewGroup4.setLayoutParams(mVar.getLayoutParams());
                if (p()) {
                    com.fyber.inneractive.sdk.util.v.a(viewGroup4);
                    this.f57113b.addView(viewGroup4);
                }
            }
            this.f57132N = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
            d(false);
            a(new com.fyber.inneractive.sdk.mraid.d0(this.f57132N));
        } else if (f0Var == com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
            com.fyber.inneractive.sdk.mraid.f0 f0Var3 = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
            this.f57132N = f0Var3;
            a(new com.fyber.inneractive.sdk.mraid.d0(f0Var3));
        }
        if (viewGroup4 != null) {
            viewGroup4.setPadding(0, 0, 0, 0);
        }
        j1 j1Var = this.f57118g;
        if (j1Var != null) {
            ((b0) j1Var).onClose();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            r();
        }
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
        if (bVar == null || bVar.f56910a == null || (mVar2 = this.f57113b) == null || mVar2.getParent() == null || this.p0 == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.v.a(this.o0.f56910a);
        ImageView imageView = this.o0.f56910a;
        com.fyber.inneractive.sdk.util.h1 h1Var = this.p0;
        imageView.setLayoutParams(com.fyber.inneractive.sdk.util.v.a(h1Var.f57002a, h1Var.f57003b, 13));
        ((ViewGroup) this.f57113b.getParent()).addView(this.o0.f56910a);
    }

    public final boolean p() {
        return this.f57132N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
    }

    public final void q() {
        com.fyber.inneractive.sdk.measurement.tracker.e bVar;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.measurement.e eVar2 = this.f57155H;
        if (eVar2 != null) {
            m mVar = this.f57113b;
            com.fyber.inneractive.sdk.flow.x xVar = this.f57130s;
            boolean z2 = false;
            IAlog.a("omsdk initMraidSession", new Object[0]);
            a88.o oVar = eVar2.f54041e;
            if (oVar == null) {
                IAlog.a("omsdk partner is null", new Object[0]);
                bVar = null;
            } else {
                if (xVar != null && (eVar = xVar.f53978b) != null && eVar.f56845G) {
                    z2 = true;
                }
                eVar2.f54042f.getClass();
                bVar = z2 ? new com.fyber.inneractive.sdk.measurement.tracker.b(oVar, mVar) : new com.fyber.inneractive.sdk.measurement.tracker.a(oVar, mVar);
                bVar.a(mVar);
            }
            this.f57156I = bVar;
        }
        g gVar = this.f57117f;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void r() {
        try {
            if (!(com.fyber.inneractive.sdk.util.o.a(this.f57113b) instanceof Activity) || this.m0 == null) {
                return;
            }
            ((Activity) com.fyber.inneractive.sdk.util.o.a(this.f57113b)).getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.m0);
            this.m0 = null;
        } catch (Exception e2) {
            IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e2.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void setAdDefaultSize(int i2, int i3) {
        this.k0 = i2;
        this.f57147l0 = i3;
        this.d0 = i2;
        this.e0 = i3;
    }

    public void setOrientationProperties(boolean z2, String str) {
        if ("portrait".equals(str)) {
            this.f0 = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f0 = Orientation.LANDSCAPE;
        } else {
            this.f0 = Orientation.NONE;
        }
        j1 j1Var = this.f57118g;
        if (j1Var != null) {
            ((b0) j1Var).a(z2, this.f0);
        }
    }

    public i0(boolean z2, c0 c0Var, z zVar, d0 d0Var, com.fyber.inneractive.sdk.measurement.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z2, c0Var, rVar);
        this.f57132N = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
        this.f57138T = false;
        this.f57144Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.f57145c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = Orientation.NONE;
        this.f57155H = eVar;
        this.f57135Q = c0Var;
        this.f57133O = zVar;
        this.f57134P = d0Var;
        this.n0 = new p(this);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void b(boolean z2) {
        m mVar = this.f57113b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.f57113b.getViewTreeObserver().removeOnPreDrawListener(this.n0);
        }
        com.fyber.inneractive.sdk.util.r.f57026b.post(new s(this));
        m mVar2 = this.f57137S;
        if (mVar2 != null && mVar2.getParent() != null && (this.f57137S.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f57137S.getParent()).removeView(this.f57137S);
            this.f57137S = null;
        }
        FrameLayout frameLayout = this.i0;
        if (frameLayout != null && this.j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f57136R;
            if (viewGroup != null) {
                viewGroup.removeView(this.j0);
            }
        }
        this.i0 = null;
        this.j0 = null;
        this.h0 = null;
        this.f57112a = false;
        com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
        if (bVar != null) {
            com.fyber.inneractive.sdk.util.v.a(bVar.f56910a);
            this.o0 = null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            r();
        }
        super.b(z2);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void h() {
        int requestedOrientation;
        super.h();
        FrameLayout frameLayout = this.i0;
        if (frameLayout != null && this.j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f57136R;
            if (viewGroup != null) {
                viewGroup.removeView(this.j0);
            }
        }
        this.f57132N = com.fyber.inneractive.sdk.mraid.f0.LOADING;
        Context contextA = com.fyber.inneractive.sdk.util.o.a(this.f57113b);
        if (contextA instanceof Activity) {
            requestedOrientation = ((Activity) contextA).getRequestedOrientation();
        } else {
            requestedOrientation = -1;
        }
        this.f57139U = requestedOrientation;
        this.i0 = new FrameLayout(contextA);
        this.j0 = new FrameLayout(contextA);
        FrameLayout frameLayout2 = new FrameLayout(contextA);
        frameLayout2.setBackgroundColor(-858993460);
        this.h0 = frameLayout2;
        a(contextA, false);
        m mVar = this.f57113b;
        if (mVar != null) {
            mVar.setOnKeyListener(new q(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        if (this.f57132N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED && !TextUtils.isEmpty(str) && webView.equals(this.f57137S) && !this.f57138T) {
            this.f57138T = true;
            return false;
        }
        return super.a(webView, str);
    }

    public final void c(boolean z2) {
        if (this.f57136R == null) {
            return;
        }
        if (z2) {
            int iB = com.fyber.inneractive.sdk.util.o.b(35);
            if (this.f57141W == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(com.fyber.inneractive.sdk.util.o.a(this.f57113b), iB);
                this.f57141W = iAcloseButton;
                iAcloseButton.setOnClickListener(new o(this));
            }
            com.fyber.inneractive.sdk.util.v.a(this.f57141W);
            FrameLayout frameLayout = this.j0;
            if (frameLayout != null) {
                frameLayout.addView(this.f57141W);
                IAcloseButton iAcloseButton2 = this.f57141W;
                ViewGroup.LayoutParams layoutParams = iAcloseButton2.getLayoutParams();
                layoutParams.width = iB;
                layoutParams.height = iB;
                iAcloseButton2.setLayoutParams(layoutParams);
                com.fyber.inneractive.sdk.util.o.a(this.f57141W, 53);
                IAcloseButton iAcloseButton3 = this.f57141W;
                int iB2 = com.fyber.inneractive.sdk.util.o.b(10);
                int iB3 = com.fyber.inneractive.sdk.util.o.b(10);
                ViewGroup.LayoutParams layoutParams2 = iAcloseButton3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.topMargin = iB2;
                    marginLayoutParams.rightMargin = iB3;
                    marginLayoutParams.bottomMargin = 0;
                    iAcloseButton3.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            FrameLayout frameLayout2 = this.j0;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.f57141W);
            }
        }
        j1 j1Var = this.f57118g;
        if (j1Var != null) {
            ((b0) j1Var).b(z2);
        }
        this.f57142X = !z2;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void a(Context context, boolean z2) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.f53260M.f53295u.a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.f57143Y = displayMetrics.density;
        Rect rect = new Rect();
        boolean z3 = context instanceof Activity;
        if (z3 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i2 = rect.top;
        View viewFindViewById = (!z3 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(android.R.id.content);
        int top = viewFindViewById != null ? viewFindViewById.getTop() - i2 : 0;
        int i3 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        double d2 = i3;
        double d4 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d4 * d2);
        int heightDp = (int) (d4 * ((double) i5));
        int i7 = (i5 - i2) - top;
        m mVar = this.f57113b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.f57113b.getScaleY() != 1.0f) {
            widthDp = this.f57113b.getWidthDp();
            heightDp = this.f57113b.getHeightDp();
            int iB = (com.fyber.inneractive.sdk.util.o.b(this.f57113b.getHeightDp()) - i2) - top;
            this.b0 = this.f57144Z;
            this.f57145c0 = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iB));
        } else {
            double d5 = 160.0d / ((double) displayMetrics.densityDpi);
            this.b0 = (int) (d2 * d5);
            this.f57145c0 = (int) (d5 * ((double) i7));
        }
        if (this.f57144Z == widthDp && this.a0 == heightDp) {
            return;
        }
        this.f57144Z = widthDp;
        this.a0 = heightDp;
        if (z2) {
            a(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
            a(new com.fyber.inneractive.sdk.mraid.a0(this.b0, this.f57145c0));
            a(new com.fyber.inneractive.sdk.mraid.z(this.b0, this.f57145c0));
            int i8 = this.d0;
            if (i8 > 0 && this.e0 > 0) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i8), com.fyber.inneractive.sdk.util.o.c(this.e0)));
                return;
            }
            m mVar2 = this.f57113b;
            if (mVar2 == null || mVar2.getWidth() <= 0 || this.f57113b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.f57113b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.f57113b.getHeight())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, int i2, int i3, boolean z2, boolean z3) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ImageView imageView;
        if (this.f57113b == null || this.f57133O == z.DISABLED || this.f57132N != com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        try {
            ViewGroup viewGroup3 = (ViewGroup) this.f57113b.getRootView().findViewById(android.R.id.content);
            this.f57136R = viewGroup3;
            if (viewGroup3 == null) {
                IAlog.f("Couldn't find content in the view tree", new Object[0]);
                a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.m0 = new t(this);
                if (com.fyber.inneractive.sdk.util.o.a(this.f57113b) instanceof Activity) {
                    ((Activity) com.fyber.inneractive.sdk.util.o.a(this.f57113b)).getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.m0);
                }
            }
            this.f57142X = z2;
            j1 j1Var = this.f57118g;
            if (j1Var != null) {
                ((b0) j1Var).b(z2);
            }
            d(z3);
            if (this.e0 >= 0) {
                this.e0 = com.fyber.inneractive.sdk.util.o.b(i3);
            }
            if (this.d0 >= 0) {
                this.d0 = com.fyber.inneractive.sdk.util.o.b(i2);
            }
            m mVar = this.f57113b;
            ViewGroup viewGroup4 = (ViewGroup) mVar.getParent();
            if (viewGroup4 == null) {
                viewGroup = null;
            } else {
                View viewFindViewById = viewGroup4.findViewById(R.id.ia_identifier_overlay);
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            }
            if (str != null) {
                m mVar2 = new m();
                this.f57137S = mVar2;
                mVar2.setId(R.id.ia_inneractive_webview_mraid);
                DTExchangeNetworkBridge.webviewLoadUrl(this.f57137S, str);
                this.f57137S.setWebChromeClient(this.f57114c);
                this.f57137S.setWebViewClient(this.f57115d);
                mVar = this.f57137S;
                mVar.setOnKeyListener(new u(this));
            } else {
                m mVar3 = this.f57113b;
                if (mVar3 != null && (viewGroup2 = (ViewGroup) mVar3.getParent()) != null) {
                    int childCount = viewGroup2.getChildCount();
                    int i5 = 0;
                    while (i5 < childCount && viewGroup2.getChildAt(i5) != this.f57113b) {
                        i5++;
                    }
                    ViewGroup viewGroup5 = (ViewGroup) viewGroup2.findViewById(R.id.ia_identifier_overlay);
                    this.f57146g0 = i5;
                    com.fyber.inneractive.sdk.util.v.a(viewGroup5);
                    FrameLayout frameLayout = this.h0;
                    if (frameLayout != null) {
                        com.fyber.inneractive.sdk.util.v.a(frameLayout);
                        viewGroup2.addView(this.h0, i5);
                        FrameLayout frameLayout2 = this.h0;
                        int width = this.f57113b.getWidth();
                        int height = this.f57113b.getHeight();
                        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                        layoutParams.width = width;
                        layoutParams.height = height;
                        frameLayout2.setLayoutParams(layoutParams);
                        com.fyber.inneractive.sdk.util.o.a(this.h0, 17);
                    }
                    viewGroup2.removeView(this.f57113b);
                }
            }
            float f3 = this.f57143Y;
            int i7 = (int) ((50.0f * f3) + 0.5f);
            if (i3 >= 0 && i2 >= 0) {
                i2 = (int) (i2 * f3);
                i3 = (int) (i3 * f3);
                if (i2 < i7) {
                    i2 = i7;
                }
                if (i3 < i7) {
                    i3 = i7;
                }
            }
            if (this.j0 != null && this.i0 != null) {
                View view = new View(com.fyber.inneractive.sdk.util.o.a(this.f57113b));
                view.setBackgroundColor(com.fyber.inneractive.sdk.util.o.a(this.f57113b).getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
                view.setOnTouchListener(new n());
                this.j0.addView(view);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                com.fyber.inneractive.sdk.util.v.a(mVar);
                this.i0.addView(mVar);
                ViewGroup.LayoutParams layoutParams3 = mVar.getLayoutParams();
                layoutParams3.width = -1;
                layoutParams3.height = -1;
                mVar.setLayoutParams(layoutParams3);
                com.fyber.inneractive.sdk.util.v.a(this.i0);
                this.j0.addView(this.i0);
                FrameLayout frameLayout3 = this.i0;
                ViewGroup.LayoutParams layoutParams4 = frameLayout3.getLayoutParams();
                layoutParams4.width = i2;
                layoutParams4.height = i3;
                frameLayout3.setLayoutParams(layoutParams4);
                com.fyber.inneractive.sdk.util.o.a(this.i0, 17);
            }
            FrameLayout frameLayout4 = this.j0;
            if (frameLayout4 != null) {
                com.fyber.inneractive.sdk.util.v.a(frameLayout4);
                com.fyber.inneractive.sdk.rtb.watermark.b bVar = this.o0;
                if (bVar != null && (imageView = bVar.f56910a) != null) {
                    com.fyber.inneractive.sdk.util.v.a(imageView);
                    ImageView imageView2 = this.o0.f56910a;
                    ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                    layoutParams5.width = -1;
                    layoutParams5.height = -1;
                    imageView2.setLayoutParams(layoutParams5);
                    this.j0.addView(this.o0.f56910a);
                }
                this.f57136R.addView(this.j0);
                FrameLayout frameLayout5 = this.j0;
                ViewGroup.LayoutParams layoutParams6 = frameLayout5.getLayoutParams();
                layoutParams6.width = -1;
                layoutParams6.height = -1;
                frameLayout5.setLayoutParams(layoutParams6);
            }
            if (!mVar.hasFocus()) {
                mVar.requestFocus();
            }
            d0 d0Var = this.f57134P;
            if (d0Var == d0.ALWAYS_VISIBLE || (!this.f57142X && d0Var != d0.ALWAYS_HIDDEN)) {
                c(true);
            }
            com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
            this.f57132N = f0Var;
            a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
            int i8 = this.d0;
            if (i8 != -1 && this.e0 != -1) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i8), com.fyber.inneractive.sdk.util.o.c(this.e0)));
            }
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND);
            if (viewGroup != null) {
                int dimension = (int) viewGroup.getContext().getResources().getDimension(R.dimen.ia_identifier_padding);
                viewGroup.setPadding(dimension, 0, 0, dimension);
                viewGroup.setLayoutParams(this.f57136R.getLayoutParams());
                this.f57136R.addView(viewGroup);
            }
            j1 j1Var2 = this.f57118g;
            if (j1Var2 != null) {
                ((b0) j1Var2).d();
            }
        } catch (Exception unused) {
            IAlog.f("Couldn't find content in the view tree", new Object[0]);
            a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public static HashMap a(Map map) {
        String str;
        HashMap map2 = new HashMap();
        if (map.containsKey("description") && map.containsKey(TtmlNode.START)) {
            map2.put("title", map.get("description"));
            if (map.containsKey(TtmlNode.START) && map.get(TtmlNode.START) != null) {
                Date dateA = a((String) map.get(TtmlNode.START));
                if (dateA != null) {
                    map2.put("beginTime", Long.valueOf(dateA.getTime()));
                    if (map.containsKey(TtmlNode.END) && map.get(TtmlNode.END) != null) {
                        Date dateA2 = a((String) map.get(TtmlNode.END));
                        if (dateA2 != null) {
                            map2.put("endTime", Long.valueOf(dateA2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        map2.put("eventLocation", map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        map2.put("description", map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        map2.put("availability", Integer.valueOf("transparent".equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = (String) map.get("frequency");
                        int i2 = map.containsKey("interval") ? Integer.parseInt((String) map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb.append("FREQ=DAILY;");
                            if (i2 != -1) {
                                sb.append("INTERVAL=" + i2 + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb.append("FREQ=WEEKLY;");
                                if (i2 != -1) {
                                    sb.append("INTERVAL=" + i2 + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    String str3 = (String) map.get("daysInWeek");
                                    StringBuilder sb2 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] strArrSplit = str3.split(",");
                                    for (String str4 : strArrSplit) {
                                        int i3 = Integer.parseInt(str4);
                                        if (i3 == 7) {
                                            i3 = 0;
                                        }
                                        if (!zArr[i3]) {
                                            StringBuilder sb3 = new StringBuilder();
                                            switch (i3) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of week ", i3));
                                            }
                                            sb3.append(str);
                                            sb3.append(",");
                                            sb2.append(sb3.toString());
                                            zArr[i3] = true;
                                        }
                                    }
                                    if (strArrSplit.length != 0) {
                                        sb2.deleteCharAt(sb2.length() - 1);
                                        String string = sb2.toString();
                                        if (string == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb.append("BYDAY=" + string + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb.append("FREQ=MONTHLY;");
                                if (i2 != -1) {
                                    sb.append("INTERVAL=" + i2 + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    String str5 = (String) map.get("daysInMonth");
                                    StringBuilder sb4 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] strArrSplit2 = str5.split(",");
                                    for (String str6 : strArrSplit2) {
                                        int i5 = Integer.parseInt(str6);
                                        int i7 = i5 + 31;
                                        if (!zArr2[i7]) {
                                            StringBuilder sb5 = new StringBuilder();
                                            if (i5 != 0 && i5 >= -31 && i5 <= 31) {
                                                sb5.append("" + i5);
                                                sb5.append(",");
                                                sb4.append(sb5.toString());
                                                zArr2[i7] = true;
                                            } else {
                                                throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of month ", i5));
                                            }
                                        }
                                    }
                                    if (strArrSplit2.length != 0) {
                                        sb4.deleteCharAt(sb4.length() - 1);
                                        String string2 = sb4.toString();
                                        if (string2 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb.append("BYMONTHDAY=" + string2 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    String string3 = sb.toString();
                    if (!TextUtils.isEmpty(string3)) {
                        map2.put("rrule", string3);
                    }
                    return map2;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public static Date a(String str) {
        Date date = null;
        int i2 = 0;
        while (true) {
            String[] strArr = q0;
            if (i2 >= 2) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i2], Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
            i2++;
        }
        return date;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar, String str) {
        String strA = kVar.a();
        m mVar = this.f57113b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireErrorEvent('" + strA + "', '" + str + "');");
        }
    }

    public static LinkedHashMap a(URI uri) {
        int i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split("&")) {
                int iIndexOf = str.indexOf(com.safedk.android.analytics.brandsafety.l.ae);
                linkedHashMap.put(iIndexOf > 0 ? URLDecoder.decode(str.substring(0, iIndexOf), C.UTF8_NAME) : str, (iIndexOf <= 0 || str.length() <= (i2 = iIndexOf + 1)) ? null : URLDecoder.decode(str.substring(i2), C.UTF8_NAME));
            }
        }
        return linkedHashMap;
    }

    public final void a(View view, com.fyber.inneractive.sdk.measurement.tracker.d dVar) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        if (view == null || (eVar = this.f57156I) == null) {
            return;
        }
        try {
            a88.n nVar = eVar.f54062a;
            if (nVar != null) {
                if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton) {
                    nVar.n(view, fuX.CLOSE_AD, dVar.name());
                } else if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.Watermark) {
                    nVar.n(view, fuX.NOT_VISIBLE, dVar.name());
                } else {
                    nVar.n(view, fuX.OTHER, dVar.name());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.BANNER_RESIZE_EXPAND;
        InneractiveAdRequest inneractiveAdRequest = this.f57129r;
        com.fyber.inneractive.sdk.flow.x xVar = this.f57130s;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.f53978b : null;
        JSONArray jSONArrayB = (xVar == null || (rVar = xVar.f53979c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.f54359c = uVar;
        wVar.f54357a = inneractiveAdRequest;
        wVar.f54360d = jSONArrayB;
        wVar.a(FileUploadManager.f61572j, kVar.a()).a((String) null);
    }
}
