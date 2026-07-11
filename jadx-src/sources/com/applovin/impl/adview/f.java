package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.n1;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class f extends Dialog implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f48046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1802k f48047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1804o f48048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f48049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f48050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f48051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f48052g;

    class a implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f48052g.setClickable(true);
        }
    }

    private void a() {
        this.f48049d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f48052g.isClickable()) {
            this.f48052g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f48049d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f48046a);
        this.f48051f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f48051f.setBackgroundColor(-1157627904);
        this.f48051f.addView(this.f48049d);
        if (!this.f48050e.l1()) {
            a(this.f48050e.f1());
            g();
        }
        setContentView(this.f48051f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f48051f.removeView(this.f48049d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f48052g == null) {
                a();
            }
            this.f48052g.setVisibility(0);
            this.f48052g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f48052g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48048c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    private void g() {
        this.f48046a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.SPz
            @Override // java.lang.Runnable
            public final void run() {
                this.f47960n.f();
            }
        });
    }

    public b c() {
        return this.f48049d;
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        this.f48046a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f48076n.e();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f48049d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f48046a.getWindow().getAttributes().flags, this.f48046a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (C1804o.a()) {
                this.f48048c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48048c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, C1802k c1802k) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar != null) {
            if (bVar != null) {
                if (c1802k != null) {
                    if (activity != null) {
                        this.f48047b = c1802k;
                        this.f48048c = c1802k.O();
                        this.f48046a = activity;
                        this.f48049d = bVar;
                        this.f48050e = aVar;
                        requestWindowFeature(1);
                        setCancelable(false);
                        return;
                    }
                    throw new IllegalArgumentException("No activity specified");
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No main view specified");
        }
        throw new IllegalArgumentException("No ad specified");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    private void a(e.a aVar) {
        if (this.f48052g != null) {
            if (C1804o.a()) {
                this.f48048c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f48046a);
        this.f48052g = eVarA;
        eVarA.setVisibility(8);
        this.f48052g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.UGc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47961n.a(view);
            }
        });
        this.f48052g.setClickable(false);
        int iA = a(((Integer) this.f48047b.a(x4.z1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        C1802k c1802k = this.f48047b;
        x4 x4Var = x4.C1;
        layoutParams.addRule(((Boolean) c1802k.a(x4Var)).booleanValue() ? 9 : 11);
        this.f48052g.a(iA);
        int iA2 = a(((Integer) this.f48047b.a(x4.B1)).intValue());
        int iA3 = a(((Integer) this.f48047b.a(x4.A1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f48051f.addView(this.f48052g, layoutParams);
        this.f48052g.bringToFront();
        int iA4 = a(((Integer) this.f48047b.a(x4.D1)).intValue());
        View view = new View(this.f48046a);
        view.setBackgroundColor(0);
        int i2 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f48047b.a(x4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47959n.b(view2);
            }
        });
        this.f48051f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f48050e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i2) {
        return AppLovinSdkUtils.dpToPx(this.f48046a, i2);
    }
}
