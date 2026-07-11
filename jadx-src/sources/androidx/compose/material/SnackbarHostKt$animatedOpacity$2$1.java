package androidx.compose.material;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
final class SnackbarHostKt$animatedOpacity$2$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnimationSpec J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f23031O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f23032n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function0 f23033r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Animatable f23034t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedOpacity$2$1(Animatable animatable, boolean z2, AnimationSpec animationSpec, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f23034t = animatable;
        this.f23031O = z2;
        this.J2 = animationSpec;
        this.f23033r = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnackbarHostKt$animatedOpacity$2$1(this.f23034t, this.f23031O, this.J2, this.f23033r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SnackbarHostKt$animatedOpacity$2$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f3;
        SnackbarHostKt$animatedOpacity$2$1 snackbarHostKt$animatedOpacity$2$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f23032n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
                snackbarHostKt$animatedOpacity$2$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Animatable animatable = this.f23034t;
            if (this.f23031O) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            Float fBoxFloat = Boxing.boxFloat(f3);
            AnimationSpec animationSpec = this.J2;
            this.f23032n = 1;
            snackbarHostKt$animatedOpacity$2$1 = this;
            if (Animatable.J2(animatable, fBoxFloat, animationSpec, null, null, snackbarHostKt$animatedOpacity$2$1, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        snackbarHostKt$animatedOpacity$2$1.f23033r.invoke();
        return Unit.INSTANCE;
    }
}
