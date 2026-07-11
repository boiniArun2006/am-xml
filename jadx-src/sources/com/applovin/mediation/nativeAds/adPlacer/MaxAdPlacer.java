package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.w2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MaxAdPlacer implements x2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f51112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f51113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w2 f51114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x2 f51115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Listener f51116e;
    protected final C1804o logger;
    protected final C1802k sdk;

    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i2);

        void onAdRemoved(int i2);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings) {
        this(maxAdPlacerSettings, C1802k.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i2, Collection collection) {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing trailing ads after position " + i2);
        }
        this.f51114c.a(collection);
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public void clearAds() {
        a(this.f51114c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f51137n.b();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i2) {
        final Collection<Integer> collectionE = this.f51114c.e(i2);
        if (!collectionE.isEmpty()) {
            a(collectionE, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.w6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51139n.a(i2, collectionE);
                }
            });
        }
        return collectionE;
    }

    public int getAdjustedCount(int i2) {
        return this.f51114c.b(i2);
    }

    public int getAdjustedPosition(int i2) {
        return this.f51114c.c(i2);
    }

    public int getOriginalPosition(int i2) {
        return this.f51114c.d(i2);
    }

    public boolean isAdPosition(int i2) {
        return this.f51114c.g(i2);
    }

    public boolean isFilledPosition(int i2) {
        return this.f51114c.h(i2);
    }

    public void moveItem(int i2, int i3) {
        this.f51114c.b(i2, i3);
    }

    @Override // com.applovin.impl.x2.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f51116e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f51116e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    public void renderAd(int i2, ViewGroup viewGroup) {
        MaxAd maxAdA = this.f51114c.a(i2);
        if (maxAdA == null) {
            if (C1804o.a()) {
                this.logger.a("MaxAdPlacer", "An ad is not available for position: " + i2);
                return;
            }
            return;
        }
        MaxNativeAdView maxNativeAdViewS0 = ((d3) maxAdA).s0();
        if (maxNativeAdViewS0 == null) {
            if (this.f51113b == null) {
                if (C1804o.a()) {
                    this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i2 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                    return;
                }
                return;
            }
            maxNativeAdViewS0 = new MaxNativeAdView(this.f51113b, viewGroup.getContext());
            if (this.f51115d.a(maxNativeAdViewS0, maxAdA)) {
                if (C1804o.a()) {
                    this.logger.a("MaxAdPlacer", "Rendered ad at position: " + i2);
                }
            } else if (C1804o.a()) {
                this.logger.b("MaxAdPlacer", "Unable to render ad at position: " + i2);
            }
        } else if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Using pre-rendered ad at position: " + i2);
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (maxNativeAdViewS0.getParent() != null) {
            ((ViewGroup) maxNativeAdViewS0.getParent()).removeView(maxNativeAdViewS0);
        }
        viewGroup.addView(maxNativeAdViewS0, -1, -1);
    }

    public void setAdSize(int i2, int i3) {
        this.f51112a = new AppLovinSdkUtils.Size(i2, i3);
    }

    public void setListener(Listener listener) {
        this.f51116e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f51113b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i2, int i3) {
        this.f51114c.c(i2, i3);
        if (i2 == -1 || i3 == -1) {
            return;
        }
        a();
    }

    @Deprecated
    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f51112a = AppLovinSdkUtils.Size.ZERO;
        C1802k c1802kA = appLovinSdk.a();
        this.sdk = c1802kA;
        C1804o c1804oO = c1802kA.O();
        this.logger = c1804oO;
        this.f51114c = new w2(maxAdPlacerSettings);
        this.f51115d = new x2(maxAdPlacerSettings, context, this);
        if (C1804o.a()) {
            c1804oO.a("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i2) {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Removing item at position: " + i2);
        }
        this.f51114c.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Clearing all cached ads");
        }
        this.f51114c.a();
        this.f51115d.a();
    }

    public void destroy() {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f51115d.c();
    }

    public long getAdItemId(int i2) {
        if (isFilledPosition(i2)) {
            return -System.identityHashCode(this.f51114c.a(i2));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i2) {
        boolean z2;
        if (isFilledPosition(i2)) {
            if (this.f51112a != AppLovinSdkUtils.Size.ZERO) {
                z2 = true;
            } else {
                z2 = false;
            }
            d3 d3Var = (d3) this.f51114c.a(i2);
            if (z2) {
                return this.f51112a;
            }
            if (d3Var.s0() != null) {
                View mainView = d3Var.s0().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public void insertItem(int i2) {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Inserting item at position: " + i2);
        }
        this.f51114c.f(i2);
    }

    public void loadAds() {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Loading ads");
        }
        this.f51115d.e();
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (C1804o.a()) {
            this.logger.b("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.x2.a
    public void onNativeAdLoaded() {
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i2) {
        List listSingletonList;
        if (isFilledPosition(i2)) {
            listSingletonList = Collections.singletonList(Integer.valueOf(i2));
        } else {
            listSingletonList = Collections.EMPTY_LIST;
        }
        a(listSingletonList, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f51135n.a(i2);
            }
        });
    }

    private void a() {
        int iC;
        while (this.f51115d.d() && (iC = this.f51114c.c()) != -1) {
            if (C1804o.a()) {
                this.logger.a("MaxAdPlacer", "Placing ad at position: " + iC);
            }
            this.f51114c.a(this.f51115d.b(), iC);
            Listener listener = this.f51116e;
            if (listener != null) {
                listener.onAdLoaded(iC);
            }
        }
    }

    private void a(Collection collection, Runnable runnable) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f51115d.a(this.f51114c.a(((Integer) it.next()).intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (C1804o.a()) {
            this.logger.a("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f51116e != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f51116e.onAdRemoved(((Integer) it2.next()).intValue());
            }
        }
    }
}
