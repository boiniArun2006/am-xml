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
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    static final class Ml implements OnUserEarnedRewardListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f63782n;
        final /* synthetic */ Function1 nr;
        final /* synthetic */ Function0 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f63783t;

        Ml(Ref.BooleanRef booleanRef, Function0 function0, Ref.ObjectRef objectRef, Function1 function1) {
            this.f63782n = booleanRef;
            this.rl = function0;
            this.f63783t = objectRef;
            this.nr = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public final void onUserEarnedReward(RewardItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f63782n.element = true;
            this.rl.invoke();
            AdValue adValue = (AdValue) this.f63783t.element;
            if (adValue != null) {
                this.nr.invoke(adValue);
            }
        }
    }

    public static final class j extends RewardedAdLoadCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f63784n;

        j(Continuation continuation) {
            this.f63784n = continuation;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
            Continuation continuation = this.f63784n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.C1266n(loadAdError)));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(RewardedAd ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            Continuation continuation = this.f63784n;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.w6(ad)));
        }
    }

    /* JADX INFO: renamed from: ee.n$n, reason: collision with other inner class name */
    public static final class C0855n extends FullScreenContentCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f63785n;
        final /* synthetic */ Continuation rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f63786t;

        C0855n(Function0 function0, Continuation continuation, Ref.BooleanRef booleanRef) {
            this.f63785n = function0;
            this.rl = continuation;
            this.f63786t = booleanRef;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            Continuation continuation = this.rl;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(new n.w6(Boolean.valueOf(this.f63786t.element))));
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
            this.f63785n.invoke();
        }
    }

    static final class w6 implements OnPaidEventListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f63787n;

        w6(Ref.ObjectRef objectRef) {
            this.f63787n = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.ads.OnPaidEventListener
        public final void onPaidEvent(AdValue adValue) {
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            this.f63787n.element = adValue;
        }
    }

    public static final Object n(Context context, String str, AdRequest adRequest, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        RewardedAd.load(context, str, adRequest, new j(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object rl(Context context, String str, AdRequest adRequest, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            adRequest = new AdRequest.Builder().build();
        }
        return n(context, str, adRequest, continuation);
    }

    public static final Object t(RewardedAd rewardedAd, Activity activity, Function0 function0, Function0 function02, Function1 function1, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        rewardedAd.setFullScreenContentCallback(new C0855n(function0, safeContinuation, booleanRef));
        rewardedAd.setOnPaidEventListener(new w6(objectRef));
        try {
            rewardedAd.show(activity, new Ml(booleanRef, function02, objectRef, function1));
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
}
