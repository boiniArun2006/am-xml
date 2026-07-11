package androidx.constraintlayout.compose;

import GJW.vd;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.carousel.CarouselSwipeableState;
import com.vungle.ads.internal.protos.Sdk;
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
@DebugMetadata(c = "androidx.constraintlayout.compose.MotionCarouselKt$MotionCarousel$2$1", f = "MotionCarousel.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "invokeSuspend", n = {}, s = {})
final class MotionCarouselKt$MotionCarousel$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ String f34634O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f34635n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState f34636t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionCarouselKt$MotionCarousel$2$1(CarouselSwipeableState carouselSwipeableState, String str, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.f34636t = carouselSwipeableState;
        this.f34634O = str;
        this.J2 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MotionCarouselKt$MotionCarousel$2$1(this.f34636t, this.f34634O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((MotionCarouselKt$MotionCarousel$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f34635n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (MotionCarouselKt.O(this.J2).getIndex() > 0) {
                MotionCarouselKt.O(this.J2).nr(r4.getIndex() - 1);
            }
            CarouselSwipeableState carouselSwipeableState = this.f34636t;
            String str = this.f34634O;
            this.f34635n = 1;
            if (carouselSwipeableState.N(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MotionCarouselKt.O(this.J2).t(MotionCarouselDirection.FORWARD);
        return Unit.INSTANCE;
    }
}
