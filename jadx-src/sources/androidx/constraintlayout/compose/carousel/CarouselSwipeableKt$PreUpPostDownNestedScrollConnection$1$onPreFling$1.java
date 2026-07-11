package androidx.constraintlayout.compose.carousel;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "CarouselSwipeable.kt", i = {0}, l = {833}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 f34868O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f34869n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f34870t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1, Continuation continuation) {
        super(continuation);
        this.f34868O = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34870t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f34868O.lS(0L, this);
    }
}
