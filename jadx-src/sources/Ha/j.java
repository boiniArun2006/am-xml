package Ha;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    /* JADX INFO: renamed from: Ha.j$j, reason: collision with other inner class name */
    static final class C0134j implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f3926n;

        C0134j(Continuation continuation) {
            this.f3926n = continuation;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f3926n.resumeWith(Result.m313constructorimpl(appLovinSdkConfiguration));
        }
    }

    public static final Object n(AppLovinSdk appLovinSdk, AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        appLovinSdk.initialize(appLovinSdkInitializationConfiguration, new C0134j(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
