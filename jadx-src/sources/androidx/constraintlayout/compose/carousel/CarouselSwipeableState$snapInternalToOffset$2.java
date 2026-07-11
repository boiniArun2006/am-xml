package androidx.constraintlayout.compose.carousel;

import androidx.compose.foundation.gestures.DragScope;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableState$snapInternalToOffset$2", f = "CarouselSwipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class CarouselSwipeableState$snapInternalToOffset$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CarouselSwipeableState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ float f34943O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f34944n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f34945t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableState$snapInternalToOffset$2(float f3, CarouselSwipeableState carouselSwipeableState, Continuation continuation) {
        super(2, continuation);
        this.f34943O = f3;
        this.J2 = carouselSwipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarouselSwipeableState$snapInternalToOffset$2 carouselSwipeableState$snapInternalToOffset$2 = new CarouselSwipeableState$snapInternalToOffset$2(this.f34943O, this.J2, continuation);
        carouselSwipeableState$snapInternalToOffset$2.f34945t = obj;
        return carouselSwipeableState$snapInternalToOffset$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(DragScope dragScope, Continuation continuation) {
        return ((CarouselSwipeableState$snapInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f34944n == 0) {
            ResultKt.throwOnFailure(obj);
            ((DragScope) this.f34945t).n(this.f34943O - this.J2.absoluteOffset.n());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
