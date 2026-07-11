package androidx.compose.foundation.lazy.layout;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ GraphicsLayer J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ FiniteAnimationSpec f18428O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18429n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemAnimation f18430t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation continuation) {
        super(2, continuation);
        this.f18430t = lazyLayoutItemAnimation;
        this.f18428O = finiteAnimationSpec;
        this.J2 = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.f18430t, this.f18428O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LazyLayoutItemAnimation$animateDisappearance$1 lazyLayoutItemAnimation$animateDisappearance$1;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f18429n;
        if (i2 != 0) {
            if (i2 == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                    lazyLayoutItemAnimation$animateDisappearance$1 = this;
                } catch (Throwable th2) {
                    th = th2;
                    lazyLayoutItemAnimation$animateDisappearance$1 = this;
                    lazyLayoutItemAnimation$animateDisappearance$1.f18430t.te(false);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                Animatable animatable = this.f18430t.visibilityAnimation;
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                FiniteAnimationSpec finiteAnimationSpec = this.f18428O;
                final GraphicsLayer graphicsLayer = this.J2;
                final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f18430t;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable2) {
                        n(animatable2);
                        return Unit.INSTANCE;
                    }

                    public final void n(Animatable animatable2) {
                        graphicsLayer.wTp(((Number) animatable2.ty()).floatValue());
                        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                    }
                };
                this.f18429n = 1;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                try {
                    if (Animatable.J2(animatable, fBoxFloat, finiteAnimationSpec, null, function1, lazyLayoutItemAnimation$animateDisappearance$1, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    lazyLayoutItemAnimation$animateDisappearance$1.f18430t.te(false);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.f18430t.te(false);
                throw th;
            }
        }
        lazyLayoutItemAnimation$animateDisappearance$1.f18430t.g(true);
        lazyLayoutItemAnimation$animateDisappearance$1.f18430t.te(false);
        return Unit.INSTANCE;
    }
}
