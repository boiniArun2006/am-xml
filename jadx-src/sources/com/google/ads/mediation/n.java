package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n extends AdListener implements AppEventListener, zza {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AbstractAdViewAdapter f57339n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final MediationBannerListener f57340t;

    public n(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f57339n = abstractAdViewAdapter;
        this.f57340t = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f57340t.onAdClicked(this.f57339n);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f57340t.onAdClosed(this.f57339n);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f57340t.onAdFailedToLoad(this.f57339n, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f57340t.onAdLoaded(this.f57339n);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f57340t.onAdOpened(this.f57339n);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f57340t.zza(this.f57339n, str, str2);
    }
}
