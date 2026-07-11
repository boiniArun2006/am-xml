package androidx.compose.foundation.lazy.layout;

import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {141, 148}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiniteAnimationSpec J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemAnimation f18433O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18434n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ long f18435r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f18436t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec finiteAnimationSpec, long j2, Continuation continuation) {
        super(2, continuation);
        this.f18433O = lazyLayoutItemAnimation;
        this.J2 = finiteAnimationSpec;
        this.f18435r = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.f18433O, this.J2, this.f18435r, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:40)|(1:(1:(5:6|7|34|35|36)(2:9|10))(2:11|12))(7:14|15|(2:17|(1:19)(1:20))(1:22)|21|23|(2:25|(1:27))(4:29|30|38|31)|33)|28|29|30|38|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (androidx.compose.animation.core.Animatable.J2(r12, r4, r5, null, r7, r8, 4, null) != r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        LazyLayoutItemAnimation$animatePlacementDelta$1 lazyLayoutItemAnimation$animatePlacementDelta$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f18436t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
                    lazyLayoutItemAnimation$animatePlacementDelta$1.f18433O.X(false);
                    lazyLayoutItemAnimation$animatePlacementDelta$1.f18433O.isRunningMovingAwayAnimation = false;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finiteAnimationSpec2 = (FiniteAnimationSpec) this.f18434n;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.f18433O.placementDeltaAnimation.Ik()) {
                FiniteAnimationSpec finiteAnimationSpec3 = this.J2;
                if (!(finiteAnimationSpec3 instanceof SpringSpec)) {
                    finiteAnimationSpec = LazyLayoutItemAnimationKt.f18447n;
                } else {
                    finiteAnimationSpec = (SpringSpec) finiteAnimationSpec3;
                }
            } else {
                finiteAnimationSpec = this.J2;
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            if (!this.f18433O.placementDeltaAnimation.Ik()) {
                Animatable animatable = this.f18433O.placementDeltaAnimation;
                IntOffset intOffsetT = IntOffset.t(this.f18435r);
                this.f18434n = finiteAnimationSpec2;
                this.f18436t = 1;
                if (animatable.XQ(intOffsetT, this) == coroutine_suspended) {
                }
            } else {
                FiniteAnimationSpec finiteAnimationSpec4 = finiteAnimationSpec2;
                final long jTy = IntOffset.ty(((IntOffset) this.f18433O.placementDeltaAnimation.ty()).getPackedValue(), this.f18435r);
                Animatable animatable2 = this.f18433O.placementDeltaAnimation;
                IntOffset intOffsetT2 = IntOffset.t(jTy);
                final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.f18433O;
                Function1<Animatable<IntOffset, AnimationVector2D>, Unit> function1 = new Function1<Animatable<IntOffset, AnimationVector2D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable3) {
                        n(animatable3);
                        return Unit.INSTANCE;
                    }

                    public final void n(Animatable animatable3) {
                        lazyLayoutItemAnimation.T(IntOffset.ty(((IntOffset) animatable3.ty()).getPackedValue(), jTy));
                        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                    }
                };
                this.f18434n = null;
                this.f18436t = 2;
                lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
            }
            return coroutine_suspended;
        }
        this.f18433O.onLayerPropertyChanged.invoke();
        FiniteAnimationSpec finiteAnimationSpec42 = finiteAnimationSpec2;
        final long jTy2 = IntOffset.ty(((IntOffset) this.f18433O.placementDeltaAnimation.ty()).getPackedValue(), this.f18435r);
        Animatable animatable22 = this.f18433O.placementDeltaAnimation;
        IntOffset intOffsetT22 = IntOffset.t(jTy2);
        final LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.f18433O;
        Function1<Animatable<IntOffset, AnimationVector2D>, Unit> function12 = new Function1<Animatable<IntOffset, AnimationVector2D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<IntOffset, AnimationVector2D> animatable3) {
                n(animatable3);
                return Unit.INSTANCE;
            }

            public final void n(Animatable animatable3) {
                lazyLayoutItemAnimation2.T(IntOffset.ty(((IntOffset) animatable3.ty()).getPackedValue(), jTy2));
                lazyLayoutItemAnimation2.onLayerPropertyChanged.invoke();
            }
        };
        this.f18434n = null;
        this.f18436t = 2;
        lazyLayoutItemAnimation$animatePlacementDelta$1 = this;
    }
}
