package androidx.compose.animation.core;

import GJW.vd;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", i = {0, 0, 1, 1}, l = {172, 193}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class InfiniteTransition$run$1$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private /* synthetic */ Object f15515O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15516n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ InfiniteTransition f15517r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f15518t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1$1(MutableState mutableState, InfiniteTransition infiniteTransition, Continuation continuation) {
        super(2, continuation);
        this.J2 = mutableState;
        this.f15517r = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.J2, this.f15517r, continuation);
        infiniteTransition$run$1$1.f15515O = obj;
        return infiniteTransition$run$1$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((InfiniteTransition$run$1$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15523n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ float f15524t;

        AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.f15524t = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f3, Continuation<? super Boolean> continuation) {
            return n(f3.floatValue(), continuation);
        }

        public final Object n(float f3, Continuation continuation) {
            return ((AnonymousClass3) create(Float.valueOf(f3), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15523n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f15524t > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0040, B:16:0x005d], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x005d, B:11:0x0040], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r1 r8
      0x0056: PHI (r1v2 kotlin.jvm.internal.Ref$FloatRef) = (r1v3 kotlin.jvm.internal.Ref$FloatRef), (r1v5 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0056: PHI (r8v3 GJW.vd) = (r8v4 GJW.vd), (r8v5 GJW.vd) binds: [B:12:0x0053, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:11:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final vd vdVar;
        final Ref.FloatRef floatRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15518t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    floatRef = (Ref.FloatRef) this.f15516n;
                    vd vdVar2 = (vd) this.f15515O;
                    ResultKt.throwOnFailure(obj);
                    vdVar = vdVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                floatRef = (Ref.FloatRef) this.f15516n;
                vd vdVar3 = (vd) this.f15515O;
                ResultKt.throwOnFailure(obj);
                vdVar = vdVar3;
                if (floatRef.element == 0.0f) {
                    TFv.Wre wreIk = SnapshotStateKt.Ik(new Function0<Float>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Float invoke() {
                            return Float.valueOf(SuspendAnimationKt.HI(vdVar.getCoroutineContext()));
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                    this.f15515O = vdVar;
                    this.f15516n = floatRef;
                    this.f15518t = 2;
                    if (TFv.fuX.nY(wreIk, anonymousClass3, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            vdVar = (vd) this.f15515O;
            floatRef = new Ref.FloatRef();
            floatRef.element = 1.0f;
        }
        final MutableState mutableState = this.J2;
        final InfiniteTransition infiniteTransition = this.f15517r;
        Function1<Long, Unit> function1 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                n(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void n(long j2) {
                State state = (State) mutableState.getValue();
                long jLongValue = state != null ? ((Number) state.getValue()).longValue() : j2;
                if (infiniteTransition.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimationKt.HI(vdVar.getCoroutineContext())) {
                    infiniteTransition.startTimeNanos = j2;
                    MutableVector mutableVector = infiniteTransition._animations;
                    Object[] objArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((InfiniteTransition.TransitionAnimationState) objArr[i3]).e();
                    }
                    floatRef.element = SuspendAnimationKt.HI(vdVar.getCoroutineContext());
                }
                if (floatRef.element != 0.0f) {
                    infiniteTransition.gh((long) ((jLongValue - infiniteTransition.startTimeNanos) / floatRef.element));
                    return;
                }
                MutableVector mutableVector2 = infiniteTransition._animations;
                Object[] objArr2 = mutableVector2.content;
                int size2 = mutableVector2.getSize();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((InfiniteTransition.TransitionAnimationState) objArr2[i5]).T();
                }
            }
        };
        this.f15515O = vdVar;
        this.f15516n = floatRef;
        this.f15518t = 1;
        if (InfiniteAnimationPolicyKt.n(function1, this) != coroutine_suspended) {
            if (floatRef.element == 0.0f) {
            }
            final MutableState mutableState2 = this.J2;
            final InfiniteTransition infiniteTransition2 = this.f15517r;
            Function1<Long, Unit> function12 = new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                    n(l2.longValue());
                    return Unit.INSTANCE;
                }

                public final void n(long j2) {
                    State state = (State) mutableState2.getValue();
                    long jLongValue = state != null ? ((Number) state.getValue()).longValue() : j2;
                    if (infiniteTransition2.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimationKt.HI(vdVar.getCoroutineContext())) {
                        infiniteTransition2.startTimeNanos = j2;
                        MutableVector mutableVector = infiniteTransition2._animations;
                        Object[] objArr = mutableVector.content;
                        int size = mutableVector.getSize();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((InfiniteTransition.TransitionAnimationState) objArr[i3]).e();
                        }
                        floatRef.element = SuspendAnimationKt.HI(vdVar.getCoroutineContext());
                    }
                    if (floatRef.element != 0.0f) {
                        infiniteTransition2.gh((long) ((jLongValue - infiniteTransition2.startTimeNanos) / floatRef.element));
                        return;
                    }
                    MutableVector mutableVector2 = infiniteTransition2._animations;
                    Object[] objArr2 = mutableVector2.content;
                    int size2 = mutableVector2.getSize();
                    for (int i5 = 0; i5 < size2; i5++) {
                        ((InfiniteTransition.TransitionAnimationState) objArr2[i5]).T();
                    }
                }
            };
            this.f15515O = vdVar;
            this.f15516n = floatRef;
            this.f15518t = 1;
            if (InfiniteAnimationPolicyKt.n(function12, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
