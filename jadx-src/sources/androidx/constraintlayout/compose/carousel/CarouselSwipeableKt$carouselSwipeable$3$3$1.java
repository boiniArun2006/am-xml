package androidx.constraintlayout.compose.carousel;

import GJW.vd;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1", f = "CarouselSwipeable.kt", i = {}, l = {584}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCarouselSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselSwipeable.kt\nandroidx/constraintlayout/compose/carousel/CarouselSwipeableKt$carouselSwipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,850:1\n1#2:851\n*E\n"})
final class CarouselSwipeableKt$carouselSwipeable$3$3$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResistanceConfig J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Map f34880O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ float f34881Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f34882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function2 f34883o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Density f34884r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ CarouselSwipeableState f34885t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CarouselSwipeableKt$carouselSwipeable$3$3$1(CarouselSwipeableState carouselSwipeableState, Map map, ResistanceConfig resistanceConfig, Density density, Function2 function2, float f3, Continuation continuation) {
        super(2, continuation);
        this.f34885t = carouselSwipeableState;
        this.f34880O = map;
        this.J2 = resistanceConfig;
        this.f34884r = density;
        this.f34883o = function2;
        this.f34881Z = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CarouselSwipeableKt$carouselSwipeable$3$3$1(this.f34885t, this.f34880O, this.J2, this.f34884r, this.f34883o, this.f34881Z, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((CarouselSwipeableKt$carouselSwipeable$3$3$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f34882n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Map mapAz = this.f34885t.az();
            this.f34885t.te(this.f34880O);
            this.f34885t.E2(this.J2);
            CarouselSwipeableState carouselSwipeableState = this.f34885t;
            final Map map = this.f34880O;
            final Function2 function2 = this.f34883o;
            final Density density = this.f34884r;
            carouselSwipeableState.e(new Function2<Float, Float, Float>() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Float invoke(Float f3, Float f4) {
                    return n(f3.floatValue(), f4.floatValue());
                }

                public final Float n(float f3, float f4) {
                    return Float.valueOf(((ThresholdConfig) function2.invoke(MapsKt.getValue(map, Float.valueOf(f3)), MapsKt.getValue(map, Float.valueOf(f4)))).n(density, f3, f4));
                }
            });
            this.f34885t.X(this.f34884r.l(this.f34881Z));
            CarouselSwipeableState carouselSwipeableState2 = this.f34885t;
            Map map2 = this.f34880O;
            this.f34882n = 1;
            if (carouselSwipeableState2.g(mapAz, map2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
