package androidx.compose.foundation.layout;

import GJW.vd;
import GJW.xuv;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
final class WindowInsetsNestedScrollConnection$fling$2 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ WindowInsetsAnimationController E2;
    final /* synthetic */ int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ WindowInsetsNestedScrollConnection f17868O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ int f17869S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ int f17870Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f17871e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f17872g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec f17874o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ float f17875r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17876t;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean E2;
        final /* synthetic */ SplineBasedFloatDecayAnimationSpec J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ float f17877O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f17878S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ WindowInsetsNestedScrollConnection f17879Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f17880g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17881n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f17882o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f17883r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f17884t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2, float f3, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i3, int i5, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2, Continuation continuation) {
            super(2, continuation);
            this.f17884t = i2;
            this.f17877O = f3;
            this.J2 = splineBasedFloatDecayAnimationSpec;
            this.f17883r = i3;
            this.f17882o = i5;
            this.f17879Z = windowInsetsNestedScrollConnection;
            this.f17878S = floatRef;
            this.f17880g = windowInsetsAnimationController;
            this.E2 = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f17884t, this.f17877O, this.J2, this.f17883r, this.f17882o, this.f17879Z, this.f17878S, this.f17880g, this.E2, continuation);
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
            int i2 = this.f17881n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                float f3 = this.f17884t;
                float f4 = this.f17877O;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.J2;
                final int i3 = this.f17883r;
                final int i5 = this.f17882o;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f17879Z;
                final Ref.FloatRef floatRef = this.f17878S;
                final WindowInsetsAnimationController windowInsetsAnimationController = this.f17880g;
                final boolean z2 = this.E2;
                Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f5, Float f6) {
                        n(f5.floatValue(), f6.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(float f5, float f6) {
                        float f7 = i3;
                        if (f5 <= i5 && f7 <= f5) {
                            windowInsetsNestedScrollConnection.KN(f5);
                            return;
                        }
                        floatRef.element = f6;
                        windowInsetsAnimationController.finish(z2);
                        windowInsetsNestedScrollConnection.animationController = null;
                        xuv xuvVar = windowInsetsNestedScrollConnection.animationJob;
                        if (xuvVar != null) {
                            xuvVar.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
                        }
                    }
                };
                this.f17881n = 1;
                if (SuspendAnimationKt.Uo(f3, f4, splineBasedFloatDecayAnimationSpec, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i2, float f3, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i3, int i5, Ref.FloatRef floatRef, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f17868O = windowInsetsNestedScrollConnection;
        this.J2 = i2;
        this.f17875r = f3;
        this.f17874o = splineBasedFloatDecayAnimationSpec;
        this.f17870Z = i3;
        this.f17869S = i5;
        this.f17872g = floatRef;
        this.E2 = windowInsetsAnimationController;
        this.f17871e = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.f17868O, this.J2, this.f17875r, this.f17874o, this.f17870Z, this.f17869S, this.f17872g, this.E2, this.f17871e, continuation);
        windowInsetsNestedScrollConnection$fling$2.f17876t = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17873n;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f17876t;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f17868O;
            windowInsetsNestedScrollConnection.animationJob = GJW.C.nr(vdVar, null, null, new AnonymousClass1(this.J2, this.f17875r, this.f17874o, this.f17870Z, this.f17869S, windowInsetsNestedScrollConnection, this.f17872g, this.E2, this.f17871e, null), 3, null);
            xuv xuvVar = this.f17868O.animationJob;
            if (xuvVar != null) {
                this.f17873n = 1;
                if (xuvVar.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f17868O.animationJob = null;
        return Unit.INSTANCE;
    }
}
