package Ha;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 implements MaxRewardedAdListener, MaxAdListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ n f3927n = new n();

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd ad, MaxReward reward) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(reward, "reward");
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.f3927n.onAdClicked(p0);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd p0, MaxError p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        this.f3927n.onAdDisplayFailed(p0, p1);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.f3927n.onAdDisplayed(p0);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.f3927n.onAdHidden(p0);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String p0, MaxError p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        this.f3927n.onAdLoadFailed(p0, p1);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.f3927n.onAdLoaded(p0);
    }
}
