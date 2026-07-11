package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class s extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f56504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f56505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ViewGroup f56506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Button f56507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f56508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f56509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f56510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewGroup f56511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f56512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f56513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h1 f56514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f56515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f56516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f56517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h1 f56518y;

    public abstract void a(int i2, int i3);

    public abstract void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2);

    public abstract void a(boolean z2);

    public void a(boolean z2, int i2, int i3) {
        this.f56508o = i2;
        this.f56509p = i3;
        this.f56510q = z2;
    }

    public abstract void a(boolean z2, com.fyber.inneractive.sdk.ignite.m mVar);

    public abstract void a(boolean z2, String str);

    public abstract void b(boolean z2);

    public abstract void c(boolean z2);

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public boolean c() {
        return this.f56511r.getVisibility() == 0 || this.f56512s.getChildCount() > 0;
    }

    public abstract void d(boolean z2);

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    public abstract void e(boolean z2);

    public abstract void f(boolean z2);

    public abstract void g();

    public abstract void g(boolean z2);

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z2);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    public ViewGroup getDefaultEndCardContainer() {
        return this.f56511r;
    }

    public ViewGroup getTextureHost() {
        return this.f56506m;
    }

    public int getVideoHeight() {
        return this.f56509p;
    }

    public int getVideoWidth() {
        return this.f56508o;
    }

    public s(Context context, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context);
        this.f56508o = -1;
        this.f56509p = -1;
        this.f56510q = false;
        this.f56513t = new h1(0, 0);
        this.f56518y = new h1(0, 0);
        IAlog.a("%sctor called", IAlog.a(this));
        int tickFractions = getTickFractions();
        this.f56504k = tickFractions;
        this.f56503j = getMaxTickFactor();
        this.f56505l = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f56516w = rVar;
        this.f56517x = str;
    }

    public void destroy() {
        i();
        setVisibility(8);
        if (this.f56431g != null) {
            this.f56431g = null;
        }
        this.f56433i = null;
        IAlog.a("%sdestroyed called", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        a(this.f56518y, size, size2);
        h1 h1Var = this.f56518y;
        int i5 = h1Var.f57002a;
        if (i5 > 0 && h1Var.f57003b > 0) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            i3 = View.MeasureSpec.makeMeasureSpec(this.f56518y.f57003b, 1073741824);
            i2 = iMakeMeasureSpec;
        } else {
            h1Var.f57002a = size;
            h1Var.f57003b = size2;
        }
        if (!this.f56513t.equals(this.f56518y)) {
            h1 h1Var2 = this.f56513t;
            h1 h1Var3 = this.f56518y;
            h1Var2.getClass();
            h1Var2.f57002a = h1Var3.f57002a;
            h1Var2.f57003b = h1Var3.f57003b;
            o();
        }
        super.onMeasure(i2, i3);
    }

    public void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            n nVar = this.f56431g;
            com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) dVar.f();
            fVar.a(bVar, nVar);
            ViewGroup viewGroup = fVar.f53597c;
            v.a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            dVar.a(dVar.f53590e, dVar.f53588c);
        }
    }

    public final void a(View view, int i2) {
        if (view != null) {
            view.setOnTouchListener(new r(new GestureDetector(view.getContext(), new q(this, view, new int[2], i2))));
        }
    }
}
