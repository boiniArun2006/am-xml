package androidx.compose.material;

import GJW.C;
import GJW.vd;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "", "velocity", "", "<anonymous>", "(LGJW/vd;F)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SwipeableKt$swipeable$3$4$1 extends SuspendLambda implements Function3<vd, Float, Continuation<? super Unit>, Object> {
    final /* synthetic */ SwipeableState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ float f23239O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23240n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f23241t;

    /* JADX INFO: renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", i = {}, l = {611}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ float f23242O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f23243n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ SwipeableState f23244t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwipeableState swipeableState, float f3, Continuation continuation) {
            super(2, continuation);
            this.f23244t = swipeableState;
            this.f23242O = f3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f23244t, this.f23242O, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f23243n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SwipeableState swipeableState = this.f23244t;
                float f3 = this.f23242O;
                this.f23243n = 1;
                if (swipeableState.nY(f3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3$4$1(SwipeableState swipeableState, Continuation continuation) {
        super(3, continuation);
        this.J2 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Float f3, Continuation<? super Unit> continuation) {
        return n(vdVar, f3.floatValue(), continuation);
    }

    public final Object n(vd vdVar, float f3, Continuation continuation) {
        SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1(this.J2, continuation);
        swipeableKt$swipeable$3$4$1.f23241t = vdVar;
        swipeableKt$swipeable$3$4$1.f23239O = f3;
        return swipeableKt$swipeable$3$4$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f23240n == 0) {
            ResultKt.throwOnFailure(obj);
            C.nr((vd) this.f23241t, null, null, new AnonymousClass1(this.J2, this.f23239O, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
