package androidx.compose.animation.core;

import GJW.Lu;
import GJW.vd;
import androidx.compose.animation.core.SeekableTransitionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "S"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", i = {}, l = {599}, m = "invokeSuspend", n = {}, s = {})
final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SeekableTransitionState f15579O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f15580n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ FiniteAnimationSpec f15581r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ Transition f15582t;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", i = {0}, l = {2147, 612, 614, 668, 670}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2141:1\n120#2,10:2142\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n*L\n610#1:2142,10\n*E\n"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
        final /* synthetic */ SeekableTransitionState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f15583O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ FiniteAnimationSpec f15584Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f15585n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Transition f15586o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f15587r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f15588t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SeekableTransitionState seekableTransitionState, Object obj, Transition transition, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
            super(2, continuation);
            this.J2 = seekableTransitionState;
            this.f15587r = obj;
            this.f15586o = transition;
            this.f15584Z = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.J2, this.f15587r, this.f15586o, this.f15584Z, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(vd vdVar, Continuation continuation) {
            return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
            return invoke2(vdVar, (Continuation) continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x01e8, code lost:
        
            if (r2.FX(r18) != r0) goto L76;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yB.j jVar;
            SeekableTransitionState seekableTransitionState;
            SeekableTransitionState seekableTransitionState2;
            AnimationVector1D animationVector1DRl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f15583O;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object objRl = this.J2.rl();
                    if (!Intrinsics.areEqual(this.f15587r, objRl)) {
                        this.J2.s7N();
                        this.J2.p5(0.0f);
                        this.f15586o.P5(this.f15587r);
                        this.f15586o.s7N(0L);
                        this.J2.nr(objRl);
                        this.J2.eF(this.f15587r);
                    }
                    yB.j compositionContinuationMutex = this.J2.getCompositionContinuationMutex();
                    SeekableTransitionState seekableTransitionState3 = this.J2;
                    this.f15585n = compositionContinuationMutex;
                    this.f15588t = seekableTransitionState3;
                    this.f15583O = 1;
                    if (compositionContinuationMutex.Z(null, this) != coroutine_suspended) {
                        jVar = compositionContinuationMutex;
                        seekableTransitionState = seekableTransitionState3;
                    }
                    return coroutine_suspended;
                }
                if (i2 == 1) {
                    seekableTransitionState = (SeekableTransitionState) this.f15588t;
                    jVar = (yB.j) this.f15585n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        seekableTransitionState2 = this.J2;
                        this.f15583O = 3;
                        if (seekableTransitionState2.B(this) != coroutine_suspended) {
                            if (!Intrinsics.areEqual(this.J2.n(), this.f15587r)) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        if (!Intrinsics.areEqual(this.J2.n(), this.f15587r)) {
                            if (this.J2.N() < 1.0f) {
                                SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.J2.currentAnimation;
                                FiniteAnimationSpec finiteAnimationSpec = this.f15584Z;
                                VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpecN = finiteAnimationSpec != null ? finiteAnimationSpec.n(VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE)) : null;
                                if (seekingAnimationState == null || !Intrinsics.areEqual(vectorizedFiniteAnimationSpecN, seekingAnimationState.getAnimationSpec())) {
                                    VectorizedAnimationSpec animationSpec = seekingAnimationState != null ? seekingAnimationState.getAnimationSpec() : null;
                                    if (animationSpec != null) {
                                        long progressNanos = seekingAnimationState.getProgressNanos();
                                        AnimationVector1D animationVector1D = seekingAnimationState.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String();
                                        AnimationVector1D animationVector1DN = SeekableTransitionState.f15572r.n();
                                        AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
                                        if (initialVelocity == null) {
                                            initialVelocity = SeekableTransitionState.f15572r.rl();
                                        }
                                        animationVector1DRl = (AnimationVector1D) animationSpec.J2(progressNanos, animationVector1D, animationVector1DN, initialVelocity);
                                    } else if (seekingAnimationState == null || seekingAnimationState.getProgressNanos() == 0) {
                                        animationVector1DRl = SeekableTransitionState.f15572r.rl();
                                    } else {
                                        long durationNanos = seekingAnimationState.getDurationNanos();
                                        if (durationNanos == Long.MIN_VALUE) {
                                            durationNanos = this.J2.getTotalDurationNanos();
                                        }
                                        float f3 = durationNanos / 1.0E9f;
                                        animationVector1DRl = f3 <= 0.0f ? SeekableTransitionState.f15572r.rl() : new AnimationVector1D(1.0f / f3);
                                    }
                                    if (seekingAnimationState == null) {
                                        seekingAnimationState = new SeekableTransitionState.SeekingAnimationState();
                                    }
                                    seekingAnimationState.xMQ(vectorizedFiniteAnimationSpecN);
                                    seekingAnimationState.gh(false);
                                    seekingAnimationState.HI(this.J2.N());
                                    seekingAnimationState.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String().O(0, this.J2.N());
                                    seekingAnimationState.qie(this.J2.getTotalDurationNanos());
                                    seekingAnimationState.ty(0L);
                                    seekingAnimationState.az(animationVector1DRl);
                                    seekingAnimationState.mUb(vectorizedFiniteAnimationSpecN != null ? vectorizedFiniteAnimationSpecN.t(seekingAnimationState.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), SeekableTransitionState.f15572r.n(), animationVector1DRl) : MathKt.roundToLong(this.J2.getTotalDurationNanos() * (1.0d - ((double) this.J2.N()))));
                                    this.J2.currentAnimation = seekingAnimationState;
                                }
                            }
                            SeekableTransitionState seekableTransitionState4 = this.J2;
                            this.f15585n = null;
                            this.f15588t = null;
                            this.f15583O = 4;
                            if (seekableTransitionState4.bzg(this) != coroutine_suspended) {
                                this.J2.nr(this.f15587r);
                                SeekableTransitionState seekableTransitionState5 = this.J2;
                                this.f15583O = 5;
                            }
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.J2.p5(0.0f);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    this.J2.nr(this.f15587r);
                    SeekableTransitionState seekableTransitionState52 = this.J2;
                    this.f15583O = 5;
                }
                Object composedTargetState = seekableTransitionState.getComposedTargetState();
                jVar.T(null);
                if (!Intrinsics.areEqual(this.f15587r, composedTargetState)) {
                    SeekableTransitionState seekableTransitionState6 = this.J2;
                    this.f15585n = null;
                    this.f15588t = null;
                    this.f15583O = 2;
                    if (seekableTransitionState6.fD(this) != coroutine_suspended) {
                        seekableTransitionState2 = this.J2;
                        this.f15583O = 3;
                        if (seekableTransitionState2.B(this) != coroutine_suspended) {
                        }
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                jVar.T(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SeekableTransitionState$animateTo$2(Transition transition, SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation) {
        super(1, continuation);
        this.f15582t = transition;
        this.f15579O = seekableTransitionState;
        this.J2 = obj;
        this.f15581r = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SeekableTransitionState$animateTo$2(this.f15582t, this.f15579O, this.J2, this.f15581r, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((SeekableTransitionState$animateTo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15580n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15579O, this.J2, this.f15582t, this.f15581r, null);
            this.f15580n = 1;
            if (Lu.J2(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f15582t.te();
        return Unit.INSTANCE;
    }
}
