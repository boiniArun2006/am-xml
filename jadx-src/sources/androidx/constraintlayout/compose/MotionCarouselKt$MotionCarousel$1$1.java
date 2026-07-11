package androidx.constraintlayout.compose;

import GJW.vd;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$1$1", f = "MotionCarousel.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
final class MotionCarouselKt$MotionCarousel$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState f34630O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f34631n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableState f34632r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ androidx.compose.runtime.State f34633t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionCarouselKt$MotionCarousel$1$1(androidx.compose.runtime.State state, CarouselSwipeableState carouselSwipeableState, String str, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f34633t = state;
        this.f34630O = carouselSwipeableState;
        this.J2 = str;
        this.f34632r = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MotionCarouselKt$MotionCarousel$1$1(this.f34633t, this.f34630O, this.J2, this.f34632r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MotionCarouselKt$MotionCarousel$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f34631n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (MotionCarouselKt.O(this.f34632r).getIndex() + 1 < ((MotionItemsProvider) this.f34633t.getValue()).getItemsCount()) {
                CarouselState carouselStateO = MotionCarouselKt.O(this.f34632r);
                carouselStateO.nr(carouselStateO.getIndex() + 1);
                CarouselSwipeableState carouselSwipeableState = this.f34630O;
                String str = this.J2;
                this.f34631n = 1;
                if (carouselSwipeableState.N(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        MotionCarouselKt.O(this.f34632r).t(MotionCarouselDirection.FORWARD);
        return Unit.INSTANCE;
    }
}
