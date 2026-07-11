package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T, V] */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Landroidx/compose/animation/core/AnimationVector;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
final class Animatable$runAnimation$2<T, V> extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ Animatable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f15400O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Function1 f15401S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ long f15402Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Animation f15404o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Object f15405r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f15406t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Animatable$runAnimation$2(Animatable animatable, Object obj, Animation animation, long j2, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.J2 = animatable;
        this.f15405r = obj;
        this.f15404o = animation;
        this.f15402Z = j2;
        this.f15401S = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$runAnimation$2(this.J2, this.f15405r, this.f15404o, this.f15402Z, this.f15401S, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        return ((Animatable$runAnimation$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationState animationState;
        Ref.BooleanRef booleanRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f15400O;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.J2.getInternalState().N((AnimationVector) this.J2.getTypeConverter().getConvertToVector().invoke(this.f15405r));
                this.J2.Z(this.f15404o.getTargetValue());
                this.J2.o(true);
                final AnimationState animationStateKN = AnimationStateKt.KN(this.J2.getInternalState(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Animation animation = this.f15404o;
                long j2 = this.f15402Z;
                final Animatable animatable = this.J2;
                final Function1 function1 = this.f15401S;
                Function1<AnimationScope<T, V>, Unit> function12 = new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        n((AnimationScope) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void n(AnimationScope animationScope) {
                        SuspendAnimationKt.ck(animationScope, animatable.getInternalState());
                        Object objKN = animatable.KN(animationScope.O());
                        if (Intrinsics.areEqual(objKN, animationScope.O())) {
                            Function1 function13 = function1;
                            if (function13 != null) {
                                function13.invoke(animatable);
                                return;
                            }
                            return;
                        }
                        animatable.getInternalState().T(objKN);
                        animationStateKN.T(objKN);
                        Function1 function14 = function1;
                        if (function14 != null) {
                            function14.invoke(animatable);
                        }
                        animationScope.n();
                        booleanRef2.element = true;
                    }
                };
                this.f15403n = animationStateKN;
                this.f15406t = booleanRef2;
                this.f15400O = 1;
                if (SuspendAnimationKt.t(animationStateKN, animation, j2, function12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                animationState = animationStateKN;
                booleanRef = booleanRef2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.f15406t;
                animationState = (AnimationState) this.f15403n;
                ResultKt.throwOnFailure(obj);
            }
            AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.f15435n : AnimationEndReason.f15436t;
            this.J2.xMQ();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e2) {
            this.J2.xMQ();
            throw e2;
        }
    }
}
