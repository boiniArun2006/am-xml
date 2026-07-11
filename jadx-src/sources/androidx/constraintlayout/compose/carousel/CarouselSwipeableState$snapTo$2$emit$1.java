package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapTo$2", f = "CarouselSwipeable.kt", i = {0}, l = {299}, m = "emit", n = {"this"}, s = {"L$0"})
final class CarouselSwipeableState$snapTo$2$emit$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState$snapTo$2 f34948O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f34949n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f34950t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$snapTo$2$emit$1(CarouselSwipeableState$snapTo$2 carouselSwipeableState$snapTo$2, Continuation continuation) {
        super(continuation);
        this.f34948O = carouselSwipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34950t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f34948O.rl(null, this);
    }
}
