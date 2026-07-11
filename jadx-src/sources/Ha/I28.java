package Ha;

import GJW.Pl;
import GJW.eO;
import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {

    public static final class j extends Ha.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f3917n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Pl f3918t;

        j(Function1 function1, Pl pl) {
            this.f3917n = function1;
            this.f3918t = pl;
        }

        @Override // Ha.n, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd ad, MaxError errorCode) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f3918t.isActive()) {
                Pl pl = this.f3918t;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.C1266n(new SL.w6(ad, Ml.n(errorCode)))));
            }
        }

        @Override // Ha.n, com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.f3917n.invoke(ad);
        }

        @Override // Ha.n, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            if (this.f3918t.isActive()) {
                Pl pl = this.f3918t;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.w6(ad)));
            }
        }
    }

    static final class n implements MaxAdRevenueListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f3919n;

        n(Function1 function1) {
            this.f3919n = function1;
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public final void onAdRevenuePaid(MaxAd maxAd) {
            Intrinsics.checkNotNullParameter(maxAd, "maxAd");
            this.f3919n.invoke(maxAd);
        }
    }

    public static final class w6 extends Ha.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl f3920n;

        w6(Pl pl) {
            this.f3920n = pl;
        }

        @Override // Ha.n, com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String adUnitId, MaxError errorCode) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f3920n.isActive()) {
                Pl pl = this.f3920n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.C1266n(Ml.rl(errorCode))));
            }
        }

        @Override // Ha.n, com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            if (this.f3920n.isActive()) {
                Pl pl = this.f3920n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(new n.w6(ad)));
            }
        }
    }

    public static final Object n(MaxInterstitialAd maxInterstitialAd, Activity activity, Function1 function1, Function1 function12, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        maxInterstitialAd.setListener(new j(function1, eOVar));
        maxInterstitialAd.setRevenueListener(new n(function12));
        maxInterstitialAd.showAd(activity);
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    public static final Object rl(MaxInterstitialAd maxInterstitialAd, Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        maxInterstitialAd.setListener(new w6(eOVar));
        maxInterstitialAd.loadAd();
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
