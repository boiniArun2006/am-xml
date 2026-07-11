package androidx.constraintlayout.compose;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.TransitionHandler", f = "TransitionHandler.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "updateProgressWhileTouchUp", n = {"this"}, s = {"L$0"})
final class TransitionHandler$updateProgressWhileTouchUp$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TransitionHandler f34848O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34849n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f34850t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransitionHandler$updateProgressWhileTouchUp$1(TransitionHandler transitionHandler, Continuation continuation) {
        super(continuation);
        this.f34848O = transitionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34850t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f34848O.KN(this);
    }
}
