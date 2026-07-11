package com.applovin.impl;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.C1802k;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class y1 extends AbstractC1812v1 {
    @Override // com.applovin.impl.AbstractC1812v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f50620d.addView(appLovinAdView);
        if (gVar != null) {
            a(this.f50619c.n(), (this.f50619c.u0() ? 3 : 5) | 48, gVar);
        }
        if (kVar != null) {
            this.f50620d.addView(kVar, this.f50621e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f50620d);
        } else {
            this.f50618b.setContentView(this.f50620d);
        }
    }

    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, C1802k c1802k) {
        super(bVar, activity, c1802k);
    }
}
