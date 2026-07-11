package androidx.compose.foundation.layout;

import GJW.vd;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
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
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class WindowInsetsNestedScrollConnection$fling$3 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ WindowInsetsNestedScrollConnection f17890O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ boolean f17891S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ WindowInsetsAnimationController f17892Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f17894o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ int f17895r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f17896t;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f17897O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ WindowInsetsNestedScrollConnection f17898Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17899n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f17900o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WindowInsetsAnimationController f17901r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f17902t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i2, int i3, float f3, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation continuation) {
            super(2, continuation);
            this.f17902t = i2;
            this.f17897O = i3;
            this.J2 = f3;
            this.f17901r = windowInsetsAnimationController;
            this.f17900o = z2;
            this.f17898Z = windowInsetsNestedScrollConnection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f17902t, this.f17897O, this.J2, this.f17901r, this.f17900o, this.f17898Z, continuation);
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
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f17899n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    anonymousClass1 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Animatable animatableRl = AnimatableKt.rl(this.f17902t, 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat(this.f17897O);
                Float fBoxFloat2 = Boxing.boxFloat(this.J2);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f17898Z;
                Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.fling.3.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                        n(animatable);
                        return Unit.INSTANCE;
                    }

                    public final void n(Animatable animatable) {
                        windowInsetsNestedScrollConnection.KN(((Number) animatable.ty()).floatValue());
                    }
                };
                this.f17899n = 1;
                anonymousClass1 = this;
                if (Animatable.J2(animatableRl, fBoxFloat, null, fBoxFloat2, function1, anonymousClass1, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            anonymousClass1.f17901r.finish(anonymousClass1.f17900o);
            anonymousClass1.f17898Z.animationController = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i2, int i3, float f3, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f17890O = windowInsetsNestedScrollConnection;
        this.J2 = i2;
        this.f17895r = i3;
        this.f17894o = f3;
        this.f17892Z = windowInsetsAnimationController;
        this.f17891S = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.f17890O, this.J2, this.f17895r, this.f17894o, this.f17892Z, this.f17891S, continuation);
        windowInsetsNestedScrollConnection$fling$3.f17896t = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f17893n == 0) {
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f17896t;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f17890O;
            windowInsetsNestedScrollConnection.animationJob = GJW.C.nr(vdVar, null, null, new AnonymousClass1(this.J2, this.f17895r, this.f17894o, this.f17892Z, this.f17891S, windowInsetsNestedScrollConnection, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
