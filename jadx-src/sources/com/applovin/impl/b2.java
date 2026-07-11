package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class b2 extends AbstractC1812v1 {
    @Override // com.applovin.impl.AbstractC1812v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.AbstractC1812v1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    public b2(com.applovin.impl.sdk.ad.b bVar, Activity activity, C1802k c1802k) {
        super(bVar, activity, c1802k);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, final com.applovin.impl.adview.l lVar, a aVar, ProgressBar progressBar, i0 i0Var, View view, View view2, AppLovinAdView appLovinAdView, com.applovin.impl.adview.k kVar, ImageView imageView2, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        if (this.f50619c.i0() == b.e.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else if (this.f50619c.i0() == b.e.BOTTOM) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        } else if (this.f50619c.i0() == b.e.LEFT) {
            layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
        } else {
            if (this.f50619c.i0() == b.e.RIGHT) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1, 5);
            } else {
                layoutParams = this.f50621e;
            }
            appLovinAdView.setLayoutParams(this.f50621e);
            this.f50620d.addView(appLovinAdView);
            view2.setLayoutParams(this.f50621e);
            this.f50620d.addView(view2);
            view.setLayoutParams(layoutParams);
            this.f50620d.addView(view);
            if (lVar != null) {
                d8 d8VarB0 = this.f50619c.b0();
                LinearLayout linearLayout = new LinearLayout(this.f50618b);
                linearLayout.setOrientation(1);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setGravity(d8VarB0.e());
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                LinearLayout linearLayout2 = new LinearLayout(this.f50618b);
                linearLayout2.setOrientation(0);
                linearLayout2.setWeightSum(100.0f);
                linearLayout2.setGravity(d8VarB0.e());
                ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, 0, d8VarB0.f());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1, d8VarB0.i());
                int iDpToPx = AppLovinSdkUtils.dpToPx(this.f50618b, d8VarB0.g());
                layoutParams4.setMargins(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
                linearLayout2.addView(lVar, layoutParams4);
                linearLayout.addView(linearLayout2, layoutParams3);
                this.f50620d.addView(linearLayout, layoutParams2);
                if (d8VarB0.a() > 0.0f) {
                    lVar.setVisibility(4);
                    long jC = n7.c(d8VarB0.a());
                    final long jB = d8VarB0.b();
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.UGc
                        @Override // java.lang.Runnable
                        public final void run() {
                            e8.a(lVar, jB, (Runnable) null);
                        }
                    }, jC);
                }
                if (d8VarB0.c() > 0.0f) {
                    long jC2 = n7.c(d8VarB0.c());
                    final long jD = d8VarB0.d();
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.Q
                        @Override // java.lang.Runnable
                        public final void run() {
                            e8.b(lVar, jD, null);
                        }
                    }, jC2);
                }
            }
            if (gVar != null) {
                a(this.f50619c.n(), (this.f50619c.A0() ? 3 : 5) | 48, gVar);
            }
            if (imageView != null) {
                int iDpToPx2 = AppLovinSdkUtils.dpToPx(this.f50618b, ((Integer) this.f50617a.a(x4.e2)).intValue());
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, ((Integer) this.f50617a.a(x4.g2)).intValue());
                int iDpToPx3 = AppLovinSdkUtils.dpToPx(this.f50618b, ((Integer) this.f50617a.a(x4.f50817f2)).intValue());
                layoutParams5.setMargins(iDpToPx3, iDpToPx3, iDpToPx3, iDpToPx3);
                this.f50620d.addView(imageView, layoutParams5);
            }
            if (aVar != null) {
                this.f50620d.addView(aVar, this.f50621e);
            }
            if (i0Var != null) {
                int iDpToPx4 = AppLovinSdkUtils.dpToPx(this.f50618b, ((Integer) this.f50617a.a(x4.R1)).intValue());
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iDpToPx4, iDpToPx4, ((Integer) this.f50617a.a(x4.Q1)).intValue());
                int iDpToPx5 = AppLovinSdkUtils.dpToPx(this.f50618b, ((Integer) this.f50617a.a(x4.f50781P1)).intValue());
                layoutParams6.setMargins(iDpToPx5, iDpToPx5, iDpToPx5, iDpToPx5);
                this.f50620d.addView(i0Var, layoutParams6);
            }
            if (progressBar != null) {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, 20, 80);
                layoutParams7.setMargins(0, 0, 0, ((Integer) this.f50617a.a(x4.j2)).intValue());
                this.f50620d.addView(progressBar, layoutParams7);
            }
            if (imageView2 != null) {
                o7 o7Var = (o7) this.f50619c;
                if (o7Var.r1()) {
                    int iDpToPx6 = AppLovinSdkUtils.dpToPx(this.f50618b, o7Var.l1().g());
                    int iDpToPx7 = AppLovinSdkUtils.dpToPx(this.f50618b, o7Var.l1().d());
                    int iDpToPx8 = AppLovinSdkUtils.dpToPx(this.f50618b, ((Integer) this.f50617a.a(x4.f50803X4)).intValue());
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(iDpToPx6, iDpToPx7, 83);
                    layoutParams8.setMargins(iDpToPx8, iDpToPx8, iDpToPx8, iDpToPx8);
                    this.f50620d.addView(imageView2, layoutParams8);
                }
            }
            if (kVar != null) {
                this.f50620d.addView(kVar, this.f50621e);
            }
            if (viewGroup == null) {
                viewGroup.addView(this.f50620d);
                return;
            } else {
                this.f50618b.setContentView(this.f50620d);
                return;
            }
        }
        appLovinAdView.setLayoutParams(this.f50621e);
        this.f50620d.addView(appLovinAdView);
        view2.setLayoutParams(this.f50621e);
        this.f50620d.addView(view2);
        view.setLayoutParams(layoutParams);
        this.f50620d.addView(view);
        if (lVar != null) {
        }
        if (gVar != null) {
        }
        if (imageView != null) {
        }
        if (aVar != null) {
        }
        if (i0Var != null) {
        }
        if (progressBar != null) {
        }
        if (imageView2 != null) {
        }
        if (kVar != null) {
        }
        if (viewGroup == null) {
        }
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        AbstractC1798s.a(this.f50620d, view);
        if (gVar != null) {
            a(this.f50619c.n(), (this.f50619c.u0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.f50617a.a(x4.q2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.f50617a.a(x4.r2)).intValue());
            this.f50620d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.f50620d.addView(kVar, this.f50621e);
        }
    }
}
