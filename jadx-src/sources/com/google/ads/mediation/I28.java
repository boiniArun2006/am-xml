package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class I28 extends AdListener implements zzg, zze, zzd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AbstractAdViewAdapter f57253n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final MediationNativeListener f57254t;

    public I28(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f57253n = abstractAdViewAdapter;
        this.f57254t = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f57254t.onAdClicked(this.f57253n);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f57254t.onAdClosed(this.f57253n);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f57254t.onAdFailedToLoad(this.f57253n, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f57254t.onAdImpression(this.f57253n);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f57254t.onAdOpened(this.f57253n);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f57254t.onAdLoaded(this.f57253n, new j(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbln zzblnVar) {
        this.f57254t.zzc(this.f57253n, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbln zzblnVar, String str) {
        this.f57254t.zzd(this.f57253n, zzblnVar, str);
    }
}
