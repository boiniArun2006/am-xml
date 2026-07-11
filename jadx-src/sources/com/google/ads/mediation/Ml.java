package com.google.ads.mediation;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class Ml extends FullScreenContentCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AbstractAdViewAdapter f57255n;
    final MediationInterstitialListener rl;

    public Ml(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f57255n = abstractAdViewAdapter;
        this.rl = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.rl.onAdClosed(this.f57255n);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.rl.onAdOpened(this.f57255n);
    }
}
