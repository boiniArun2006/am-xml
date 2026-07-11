package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class x2 extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f50744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f50745c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f50746d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50747e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f50748f;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public void a(MaxAd maxAd) {
        this.f50744b.destroy(maxAd);
    }

    public void c() {
        this.f50748f = null;
        a();
        this.f50744b.destroy();
    }

    public void a() {
        synchronized (this.f50747e) {
            try {
                Iterator it = this.f50745c.iterator();
                while (it.hasNext()) {
                    a((MaxAd) it.next());
                }
                this.f50745c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f50747e) {
            maxAd = null;
            while (!this.f50745c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                try {
                    maxAd = (MaxAd) this.f50745c.remove();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e();
        }
        return maxAd;
    }

    public boolean d() {
        boolean z2;
        synchronized (this.f50747e) {
            z2 = !this.f50745c.isEmpty();
        }
        return z2;
    }

    public void e() {
        synchronized (this.f50747e) {
            try {
                if (!this.f50746d && this.f50745c.size() < this.f50743a) {
                    this.f50746d = true;
                    this.f50744b.loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f50748f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f50748f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f50748f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f50747e) {
            this.f50745c.add(maxAd);
            this.f50746d = false;
            e();
        }
        a aVar = this.f50748f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public x2(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f50743a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f50748f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f50744b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, EnumC1781i.NATIVE_AD_PLACER);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f50744b.render(maxNativeAdView, maxAd);
    }
}
