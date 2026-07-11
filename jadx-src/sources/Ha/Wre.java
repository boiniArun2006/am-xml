package Ha;

import GJW.Pl;
import GJW.eO;
import SL.Wre;
import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.ads.MaxRewardedAd;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {

    public static final class j extends Ha.w6 {
        final /* synthetic */ Pl J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f3921O;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f3922r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f3923t;

        j(Function1 function1, Pl pl, Function1 function12) {
            this.f3921O = function1;
            this.J2 = pl;
            this.f3922r = function12;
        }

        @Override // Ha.w6, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd ad, MaxError errorCode) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.J2.isActive()) {
                Pl pl = this.J2;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.C1266n(new SL.w6(ad, Ml.n(errorCode)))));
            }
        }

        @Override // Ha.w6, com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.f3921O.invoke(ad);
        }

        @Override // Ha.w6, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            if (this.J2.isActive()) {
                Pl pl = this.J2;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.w6(this.f3923t ? new Wre.n(ad) : new Wre.j(ad))));
            }
        }

        @Override // Ha.w6, com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd ad, MaxReward reward) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Intrinsics.checkNotNullParameter(reward, "reward");
            this.f3923t = true;
            this.f3922r.invoke(ad);
        }
    }

    static final class n implements MaxAdRevenueListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f3924n;

        n(Function1 function1) {
            this.f3924n = function1;
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public final void onAdRevenuePaid(MaxAd maxAd) {
            Intrinsics.checkNotNullParameter(maxAd, "maxAd");
            this.f3924n.invoke(maxAd);
        }
    }

    public static final class w6 extends Ha.w6 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Pl f3925t;

        w6(Pl pl) {
            this.f3925t = pl;
        }

        @Override // Ha.w6, com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String adUnitId, MaxError errorCode) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f3925t.isActive()) {
                Pl pl = this.f3925t;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.C1266n(Ml.rl(errorCode))));
            }
        }

        @Override // Ha.w6, com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            if (this.f3925t.isActive()) {
                Pl pl = this.f3925t;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.w6(ad)));
            }
        }
    }

    public static final Object n(MaxRewardedAd maxRewardedAd, Activity activity, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        maxRewardedAd.setListener(new j(function1, eOVar, function12));
        maxRewardedAd.setRevenueListener(new n(function13));
        maxRewardedAd.showAd(activity);
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    public static final Object rl(MaxRewardedAd maxRewardedAd, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        maxRewardedAd.setListener(new w6(eOVar));
        maxRewardedAd.loadAd();
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
