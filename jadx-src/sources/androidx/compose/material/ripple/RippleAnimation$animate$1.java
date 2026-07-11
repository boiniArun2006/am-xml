package androidx.compose.material.ripple;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", i = {0, 1}, l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 79, 80}, m = "animate", n = {"this", "this"}, s = {"L$0", "L$0"})
final class RippleAnimation$animate$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ RippleAnimation f24011O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f24012n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f24013t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleAnimation$animate$1(RippleAnimation rippleAnimation, Continuation continuation) {
        super(continuation);
        this.f24011O = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24013t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f24011O.nr(this);
    }
}
