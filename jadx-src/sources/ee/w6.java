package ee;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {

    static final class j implements OnInitializationCompleteListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f63788n;

        j(Continuation continuation) {
            this.f63788n = continuation;
        }

        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
        public final void onInitializationComplete(InitializationStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f63788n.resumeWith(Result.m313constructorimpl(status));
        }
    }

    public static final Object n(Context context, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        MobileAds.initialize(context, new j(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
