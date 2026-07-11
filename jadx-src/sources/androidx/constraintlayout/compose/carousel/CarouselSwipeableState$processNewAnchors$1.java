package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState", f = "CarouselSwipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {146, 171, 174}, m = "processNewAnchors$constraintlayout_compose_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
final class CarouselSwipeableState$processNewAnchors$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f34938O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f34940o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState f34941r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f34942t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$processNewAnchors$1(CarouselSwipeableState carouselSwipeableState, Continuation continuation) {
        super(continuation);
        this.f34941r = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f34940o |= Integer.MIN_VALUE;
        return this.f34941r.g(null, null, this);
    }
}
