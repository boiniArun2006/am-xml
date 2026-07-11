package com.fyber.inneractive.sdk.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class i1 extends i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f57148A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f57149B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f57150C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f57151D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f57152E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f57153F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final c0 f57154G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.e f57155H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public com.fyber.inneractive.sdk.measurement.tracker.e f57156I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final e1 f57157J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final f1 f57158K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final g1 f57159L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final h1 f57160M;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f57161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f57162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f57163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f57164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f57165y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f57166z;

    public final void a(ArrayList arrayList) {
        if (this.f57113b != null) {
            String string = arrayList.toString();
            if (string.length() < 2) {
                return;
            }
            String str = "{" + string.substring(1, string.length() - 1) + "}";
            this.f57113b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.e("Fire changes: %s", str);
        }
    }

    public void j() {
        m mVar = this.f57113b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    public void k() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f57113b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.f57113b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.f57163w, this.f57164x));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f57161u, this.f57162v));
        } else {
            int widthDp = this.f57113b.getWidthDp();
            int heightDp = this.f57113b.getHeightDp();
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(widthDp, heightDp));
        }
        m mVar2 = this.f57113b;
        int iC = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.f57161u);
        m mVar3 = this.f57113b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(iC, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.f57162v)));
        a(arrayList);
        a(new com.fyber.inneractive.sdk.mraid.d0(com.fyber.inneractive.sdk.mraid.f0.DEFAULT));
    }

    public final void l() {
        m mVar = this.f57113b;
        if (mVar != null) {
            this.f57150C = true;
            if (this.f57148A) {
                mVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(this.f57157J, 0L);
        }
    }

    public boolean m() {
        c0 c0Var = this.f57154G;
        return c0Var != null && c0Var.equals(c0.INTERSTITIAL);
    }

    public void n() {
        m mVar;
        if (this.f57150C && this.f57151D && this.f57148A && (mVar = this.f57113b) != null) {
            mVar.a("FyberMraidVideoController.play()");
            h1 h1Var = this.f57160M;
            if (h1Var != null) {
                com.fyber.inneractive.sdk.util.r.f57026b.postDelayed(h1Var, 5000L);
            }
            if (this.f57152E) {
                this.f57113b.a("FyberMraidVideoController.mute(true)");
            }
        }
    }

    public void setAdDefaultSize(int i2, int i3) {
        this.f57165y = i2;
        this.f57166z = i3;
    }

    public void setAutoplayMRAIDVideos(boolean z2) {
        this.f57148A = z2;
    }

    public void setCenteringTagsRequired(boolean z2) {
        this.f57149B = z2;
    }

    public void setMuteMraidVideo(boolean z2) {
        this.f57152E = z2;
    }

    public i1(boolean z2, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z2, rVar);
        this.f57161u = -1;
        this.f57162v = -1;
        this.f57163w = -1;
        this.f57164x = -1;
        this.f57165y = -1;
        this.f57166z = -1;
        this.f57148A = false;
        this.f57149B = true;
        this.f57150C = false;
        this.f57151D = false;
        this.f57152E = false;
        this.f57156I = null;
        this.f57157J = new e1(this);
        this.f57158K = new f1(this);
        this.f57159L = new g1(this);
        this.f57160M = new h1(this);
        this.f57154G = c0Var;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.y yVar) {
        if (this.f57113b != null) {
            String str = "{" + yVar.toString() + "}";
            this.f57113b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.e("Fire changes: %s", str);
        }
    }

    public void a(Context context, boolean z2) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        Rect rect = new Rect();
        boolean z3 = context instanceof Activity;
        if (z3 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i2 = rect.top;
        View viewFindViewById = (!z3 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(R.id.content);
        int top = viewFindViewById != null ? viewFindViewById.getTop() - i2 : 0;
        int i3 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        double d2 = i3;
        double d4 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d4 * d2);
        int heightDp = (int) (d4 * ((double) i5));
        int iB = (i5 - i2) - top;
        m mVar = this.f57113b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.f57113b.getScaleY() != 1.0f) {
            widthDp = this.f57113b.getWidthDp();
            heightDp = this.f57113b.getHeightDp();
            iB = (com.fyber.inneractive.sdk.util.o.b(this.f57113b.getHeightDp()) - i2) - top;
            this.f57161u = this.f57163w;
        } else {
            this.f57161u = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * d2);
        }
        this.f57162v = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iB));
        if (this.f57163w == widthDp && this.f57164x == heightDp) {
            return;
        }
        this.f57163w = widthDp;
        this.f57164x = heightDp;
        a(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
        a(new com.fyber.inneractive.sdk.mraid.a0(this.f57161u, this.f57162v));
        a(new com.fyber.inneractive.sdk.mraid.z(this.f57161u, this.f57162v));
        int i7 = this.f57165y;
        if (i7 > 0 && this.f57166z > 0) {
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i7), com.fyber.inneractive.sdk.util.o.c(this.f57166z)));
            return;
        }
        m mVar2 = this.f57113b;
        if (mVar2 == null || mVar2.getWidth() <= 0 || this.f57113b.getHeight() <= 0) {
            return;
        }
        a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.f57113b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.f57113b.getHeight())));
    }
}
