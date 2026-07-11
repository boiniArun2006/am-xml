package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.ad.b;

/* JADX INFO: renamed from: com.applovin.impl.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class AbstractC1812v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C1802k f50617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Activity f50618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.applovin.impl.sdk.ad.b f50619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ViewGroup f50620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FrameLayout.LayoutParams f50621e;

    public void a(View view) {
        this.f50620d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f50619c.n(), (this.f50619c.u0() ? 3 : 5) | 48, gVar);
    }

    AbstractC1812v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, C1802k c1802k) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f50621e = layoutParams;
        this.f50619c = bVar;
        this.f50617a = c1802k;
        this.f50618b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f50620d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    void a(b.d dVar, int i2, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f50099a, dVar.f50103e, dVar.f50102d, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i3 = dVar.f50101c;
        layoutParams.setMargins(i3, dVar.f50100b, i3, 0);
        layoutParams.gravity = i2;
        this.f50620d.addView(gVar, layoutParams);
    }
}
