package androidx.constraintlayout.compose.carousel;

import TFv.CN3;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "anchors", "", c.f62177j, "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableState$snapTo$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,850:1\n1#2:851\n*E\n"})
final class CarouselSwipeableState$snapTo$2<T> implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f34946n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState f34947t;

    CarouselSwipeableState$snapTo$2(Object obj, CarouselSwipeableState carouselSwipeableState) {
        this.f34946n = obj;
        this.f34947t = carouselSwipeableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // TFv.CN3
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Map map, Continuation continuation) {
        CarouselSwipeableState$snapTo$2$emit$1 carouselSwipeableState$snapTo$2$emit$1;
        CarouselSwipeableState$snapTo$2<T> carouselSwipeableState$snapTo$2;
        if (continuation instanceof CarouselSwipeableState$snapTo$2$emit$1) {
            carouselSwipeableState$snapTo$2$emit$1 = (CarouselSwipeableState$snapTo$2$emit$1) continuation;
            int i2 = carouselSwipeableState$snapTo$2$emit$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselSwipeableState$snapTo$2$emit$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                carouselSwipeableState$snapTo$2$emit$1 = new CarouselSwipeableState$snapTo$2$emit$1(this, continuation);
            }
        }
        Object obj = carouselSwipeableState$snapTo$2$emit$1.f34950t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = carouselSwipeableState$snapTo$2$emit$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Float fUo = CarouselSwipeableKt.Uo(map, this.f34946n);
            if (fUo == null) {
                throw new IllegalArgumentException("The target value must have an associated anchor.");
            }
            CarouselSwipeableState carouselSwipeableState = this.f34947t;
            float fFloatValue = fUo.floatValue();
            carouselSwipeableState$snapTo$2$emit$1.f34949n = this;
            carouselSwipeableState$snapTo$2$emit$1.J2 = 1;
            if (carouselSwipeableState.T(fFloatValue, carouselSwipeableState$snapTo$2$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            carouselSwipeableState$snapTo$2 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            carouselSwipeableState$snapTo$2 = (CarouselSwipeableState$snapTo$2) carouselSwipeableState$snapTo$2$emit$1.f34949n;
            ResultKt.throwOnFailure(obj);
        }
        carouselSwipeableState$snapTo$2.f34947t.fD(carouselSwipeableState$snapTo$2.f34946n);
        return Unit.INSTANCE;
    }
}
