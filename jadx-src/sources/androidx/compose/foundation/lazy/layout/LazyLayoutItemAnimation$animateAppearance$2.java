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
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {183, 185}, m = "invokeSuspend", n = {}, s = {})
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiniteAnimationSpec J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemAnimation f18422O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f18423n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ GraphicsLayer f18424r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f18425t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animateAppearance$2(boolean z2, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation continuation) {
        super(2, continuation);
        this.f18425t = z2;
        this.f18422O = lazyLayoutItemAnimation;
        this.J2 = finiteAnimationSpec;
        this.f18424r = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.f18425t, this.f18422O, this.J2, this.f18424r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|33|(1:(1:(4:6|7|25|26)(2:10|11))(1:12))(6:14|36|15|(3:17|(1:19)|24)|31|32)|20|21|34|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (androidx.compose.animation.core.Animatable.J2(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r0 = th;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        LazyLayoutItemAnimation$animateAppearance$2 lazyLayoutItemAnimation$animateAppearance$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f18423n;
        try {
        } catch (Throwable th2) {
            th = th2;
            lazyLayoutItemAnimation$animateAppearance$2 = this;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    lazyLayoutItemAnimation$animateAppearance$2 = this;
                    lazyLayoutItemAnimation$animateAppearance$2.f18422O.nY(false);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                if (this.f18425t) {
                    Animatable animatable = this.f18422O.visibilityAnimation;
                    Float fBoxFloat = Boxing.boxFloat(0.0f);
                    this.f18423n = 1;
                    if (animatable.XQ(fBoxFloat, this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } catch (Throwable th3) {
                th = th3;
                lazyLayoutItemAnimation$animateAppearance$2 = this;
                th = th;
                lazyLayoutItemAnimation$animateAppearance$2.f18422O.nY(false);
                throw th;
            }
            lazyLayoutItemAnimation$animateAppearance$2.f18422O.nY(false);
            throw th;
        }
        Animatable animatable2 = this.f18422O.visibilityAnimation;
        Float fBoxFloat2 = Boxing.boxFloat(1.0f);
        FiniteAnimationSpec finiteAnimationSpec = this.J2;
        final GraphicsLayer graphicsLayer = this.f18424r;
        final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f18422O;
        Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable3) {
                n(animatable3);
                return Unit.INSTANCE;
            }

            public final void n(Animatable animatable3) {
                graphicsLayer.wTp(((Number) animatable3.ty()).floatValue());
                lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
            }
        };
        this.f18423n = 2;
        lazyLayoutItemAnimation$animateAppearance$2 = this;
    }
}
