package androidx.compose.animation.core;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ SeekableTransitionState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Object f15594O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f15596o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Transition f15597r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Object f15598t;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", i = {}, l = {510}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f15599O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ float f15600Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15601n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Transition f15602o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SeekableTransitionState f15603r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f15604t;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", i = {}, l = {506}, m = "invokeSuspend", n = {}, s = {})
        static final class C04911 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f15605n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ SeekableTransitionState f15606t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04911(SeekableTransitionState seekableTransitionState, Continuation continuation) {
                super(2, continuation);
                this.f15606t = seekableTransitionState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C04911(this.f15606t, continuation);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(vd vdVar, Continuation continuation) {
                return ((C04911) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                return invoke2(vdVar, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f15605n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SeekableTransitionState seekableTransitionState = this.f15606t;
                    this.f15605n = 1;
                    if (seekableTransitionState.bzg(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f3, Continuation continuation) {
            super(2, continuation);
            this.f15599O = obj;
            this.J2 = obj2;
            this.f15603r = seekableTransitionState;
            this.f15602o = transition;
            this.f15600Z = f3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15599O, this.J2, this.f15603r, this.f15602o, this.f15600Z, continuation);
            anonymousClass1.f15604t = obj;
            return anonymousClass1;
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
            int i2 = this.f15601n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f15604t;
                if (Intrinsics.areEqual(this.f15599O, this.J2)) {
                    this.f15603r.currentAnimation = null;
                    if (Intrinsics.areEqual(this.f15603r.n(), this.f15599O)) {
                        return Unit.INSTANCE;
                    }
                } else {
                    this.f15603r.s7N();
                }
                if (!Intrinsics.areEqual(this.f15599O, this.J2)) {
                    this.f15602o.P5(this.f15599O);
                    this.f15602o.s7N(0L);
                    this.f15603r.eF(this.f15599O);
                    this.f15602o.X(this.f15600Z);
                }
                this.f15603r.p5(this.f15600Z);
                if (!this.f15603r.initialValueAnimations.KN()) {
                    this.f15603r.lastFrameTimeNanos = Long.MIN_VALUE;
                } else {
                    C.nr(vdVar, null, null, new C04911(this.f15603r, null), 3, null);
                }
                SeekableTransitionState seekableTransitionState = this.f15603r;
                this.f15601n = 1;
                if (seekableTransitionState.B(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f15603r.U();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$seekTo$3(Object obj, Object obj2, SeekableTransitionState seekableTransitionState, Transition transition, float f3, Continuation continuation) {
        super(1, continuation);
        this.f15598t = obj;
        this.f15594O = obj2;
        this.J2 = seekableTransitionState;
        this.f15597r = transition;
        this.f15596o = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SeekableTransitionState$seekTo$3(this.f15598t, this.f15594O, this.J2, this.f15597r, this.f15596o, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((SeekableTransitionState$seekTo$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15595n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15598t, this.f15594O, this.J2, this.f15597r, this.f15596o, null);
            this.f15595n = 1;
            if (Lu.J2(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
