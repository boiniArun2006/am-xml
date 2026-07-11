package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements Function2<GJW.vd, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ MotionDurationScaleImpl f33133O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f33134n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ TFv.rv6 f33135t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.f33135t, this.f33133O, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(GJW.vd vdVar, Continuation continuation) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(TFv.rv6 rv6Var, MotionDurationScaleImpl motionDurationScaleImpl, Continuation continuation) {
        super(2, continuation);
        this.f33135t = rv6Var;
        this.f33133O = motionDurationScaleImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(GJW.vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f33134n;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            TFv.rv6 rv6Var = this.f33135t;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.f33133O;
            TFv.CN3 cn3 = new TFv.CN3() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                public final Object n(float f3, Continuation continuation) {
                    motionDurationScaleImpl.t(f3);
                    return Unit.INSTANCE;
                }

                @Override // TFv.CN3
                public /* bridge */ /* synthetic */ Object rl(Object obj2, Continuation continuation) {
                    return n(((Number) obj2).floatValue(), continuation);
                }
            };
            this.f33134n = 1;
            if (rv6Var.n(cn3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
