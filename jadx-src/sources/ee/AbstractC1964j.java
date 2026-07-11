package ee;

import Tv6.j;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: renamed from: ee.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class AbstractC1964j {

    /* JADX INFO: renamed from: ee.j$j, reason: collision with other inner class name */
    public static final class C0854j extends FullScreenContentCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f63778n;
        final /* synthetic */ Continuation rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterstitialAd f63779t;

        C0854j(Function0 function0, Continuation continuation, InterstitialAd interstitialAd) {
            this.f63778n = function0;
            this.rl = continuation;
            this.f63779t = interstitialAd;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            Continuation continuation = this.rl;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.w6(this.f63779t)));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            Tv6.j jVarN = Tv6.n.n(adError);
            Continuation continuation = this.rl;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.C1266n(jVarN)));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            this.f63778n.invoke();
        }
    }

    /* JADX INFO: renamed from: ee.j$n */
    static final class n implements OnPaidEventListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f63780n;

        n(Function1 function1) {
            this.f63780n = function1;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void onPaidEvent(AdValue adValue) {
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            this.f63780n.invoke(adValue);
        }
    }

    /* JADX INFO: renamed from: ee.j$w6 */
    public static final class w6 extends InterstitialAdLoadCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f63781n;

        w6(Continuation continuation) {
            this.f63781n = continuation;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Continuation continuation = this.f63781n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.C1266n(error)));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Continuation continuation = this.f63781n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.w6(ad)));
        }
    }

    public static final Object n(InterstitialAd interstitialAd, Activity activity, Function0 function0, Function1 function1, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        interstitialAd.setFullScreenContentCallback(new C0854j(function0, safeContinuation, interstitialAd));
        interstitialAd.setOnPaidEventListener(new n(function1));
        try {
            interstitialAd.show(activity);
        } catch (Exception e2) {
            j.EnumC0375j enumC0375j = j.EnumC0375j.f10587Z;
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            Tv6.j jVar = new Tv6.j(enumC0375j, message, -1, "unknown");
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m313constructorimpl(new n.C1266n(jVar)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final Object rl(Context context, String str, AdRequest adRequest, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        InterstitialAd.load(context, str, adRequest, new w6(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object t(Context context, String str, AdRequest adRequest, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            adRequest = new AdRequest.Builder().build();
        }
        return rl(context, str, adRequest, continuation);
    }
}
