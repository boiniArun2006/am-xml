package androidx.compose.material;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", i = {}, l = {602}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt$swipeable$3$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,881:1\n1#2:882\n*E\n"})
final class SwipeableKt$swipeable$3$3$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResistanceConfig J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Map f23230O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ float f23231Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function2 f23233o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Density f23234r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SwipeableState f23235t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3$3$1(SwipeableState swipeableState, Map map, ResistanceConfig resistanceConfig, Density density, Function2 function2, float f3, Continuation continuation) {
        super(2, continuation);
        this.f23235t = swipeableState;
        this.f23230O = map;
        this.J2 = resistanceConfig;
        this.f23234r = density;
        this.f23233o = function2;
        this.f23231Z = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeableKt$swipeable$3$3$1(this.f23235t, this.f23230O, this.J2, this.f23234r, this.f23233o, this.f23231Z, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SwipeableKt$swipeable$3$3$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f23232n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Map mapAz = this.f23235t.az();
            this.f23235t.te(this.f23230O);
            this.f23235t.E2(this.J2);
            SwipeableState swipeableState = this.f23235t;
            final Map map = this.f23230O;
            final Function2 function2 = this.f23233o;
            final Density density = this.f23234r;
            swipeableState.e(new Function2<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3$3$1.1
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
            this.f23235t.X(this.f23234r.l(this.f23231Z));
            SwipeableState swipeableState2 = this.f23235t;
            Map map2 = this.f23230O;
            this.f23232n = 1;
            if (swipeableState2.g(mapAz, map2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
