package Ha;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class n implements MaxAdListener {
    @Override // com.applovin.mediation.MaxAdListener
    public final void onAdClicked(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd ad, MaxError errorCode) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String adUnitId, MaxError errorCode) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }
}
