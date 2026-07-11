package androidx.compose.foundation.gestures.snapping;

import GJW.vd;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LGJW/vd;", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "<anonymous>", "(LGJW/vd;)Landroidx/compose/foundation/gestures/snapping/AnimationResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {135, 151}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,485:1\n50#2,5:486\n50#2,5:491\n481#3,4:496\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n125#1:486,5\n143#1:491,5\n149#1:496,4\n*E\n"})
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements Function2<vd, Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SnapFlingBehavior f17302O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ ScrollScope f17304o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ Function1 f17305r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f17306t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f3, Function1 function1, ScrollScope scrollScope, Continuation continuation) {
        super(2, continuation);
        this.f17302O = snapFlingBehavior;
        this.J2 = f3;
        this.f17305r = function1;
        this.f17304o = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnapFlingBehavior$fling$result$1(this.f17302O, this.J2, this.f17305r, this.f17304o, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((SnapFlingBehavior$fling$result$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Ref.FloatRef floatRef;
        Object objQie;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f17306t;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            float fRl = this.f17302O.snapLayoutInfoProvider.rl(this.J2, DecayAnimationSpecKt.n(this.f17302O.decayAnimationSpec, 0.0f, this.J2));
            if (Float.isNaN(fRl)) {
                InlineClassHelperKt.t("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new Ref.FloatRef();
            float fAbs = Math.abs(fRl) * Math.signum(this.J2);
            floatRef.element = fAbs;
            this.f17305r.invoke(Boxing.boxFloat(fAbs));
            SnapFlingBehavior snapFlingBehavior = this.f17302O;
            ScrollScope scrollScope = this.f17304o;
            float f3 = floatRef.element;
            float f4 = this.J2;
            final Function1 function1 = this.f17305r;
            Function1<Float, Unit> function12 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                    n(f5.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f5) {
                    Ref.FloatRef floatRef2 = floatRef;
                    float f6 = floatRef2.element - f5;
                    floatRef2.element = f6;
                    function1.invoke(Float.valueOf(f6));
                }
            };
            this.f17303n = floatRef;
            this.f17306t = 1;
            objQie = snapFlingBehavior.qie(scrollScope, f3, f4, function12, this);
            if (objQie != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) this.f17303n;
        ResultKt.throwOnFailure(obj);
        floatRef = floatRef2;
        objQie = obj;
        AnimationState animationState = (AnimationState) objQie;
        float fN = this.f17302O.snapLayoutInfoProvider.n(((Number) animationState.te()).floatValue());
        if (Float.isNaN(fN)) {
            InlineClassHelperKt.t("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.element = fN;
        ScrollScope scrollScope2 = this.f17304o;
        AnimationState animationStateUo = AnimationStateKt.Uo(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, null);
        AnimationSpec animationSpec = this.f17302O.snapAnimationSpec;
        final Function1 function13 = this.f17305r;
        Function1<Float, Unit> function14 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                n(f5.floatValue());
                return Unit.INSTANCE;
            }

            public final void n(float f5) {
                Ref.FloatRef floatRef3 = floatRef;
                float f6 = floatRef3.element - f5;
                floatRef3.element = f6;
                function13.invoke(Float.valueOf(f6));
            }
        };
        this.f17303n = null;
        this.f17306t = 2;
        Object objKN = SnapFlingBehaviorKt.KN(scrollScope2, fN, fN, animationStateUo, animationSpec, function14, this);
        return objKN == coroutine_suspended ? coroutine_suspended : objKN;
    }
}
