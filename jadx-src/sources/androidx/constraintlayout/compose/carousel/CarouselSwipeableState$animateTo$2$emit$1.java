package androidx.constraintlayout.compose.carousel;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$animateTo$2", f = "CarouselSwipeable.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
final class CarouselSwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    final /* synthetic */ CarouselSwipeableState$animateTo$2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f34930O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34931n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f34932r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f34933t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$animateTo$2$emit$1(CarouselSwipeableState$animateTo$2 carouselSwipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.J2 = carouselSwipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34930O = obj;
        this.f34932r |= Integer.MIN_VALUE;
        return this.J2.rl(null, this);
    }
}
