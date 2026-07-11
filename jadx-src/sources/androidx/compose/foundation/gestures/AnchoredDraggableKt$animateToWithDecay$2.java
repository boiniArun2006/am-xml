package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1391, 1409, 1433}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n+ 2 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1#1,1753:1\n1749#2,4:1754\n1749#2,4:1758\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n*L\n1396#1:1754,4\n1408#1:1758,4\n*E\n"})
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f16476O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f16477S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ AnimationSpec f16478Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ DecayAnimationSpec f16479g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f16480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f16481o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f16482r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f16483t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState anchoredDraggableState, float f3, AnimationSpec animationSpec, Ref.FloatRef floatRef, DecayAnimationSpec decayAnimationSpec, Continuation continuation) {
        super(4, continuation);
        this.f16482r = anchoredDraggableState;
        this.f16481o = f3;
        this.f16478Z = animationSpec;
        this.f16477S = floatRef;
        this.f16479g = decayAnimationSpec;
    }

    @Override // kotlin.jvm.functions.Function4
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors draggableAnchors, Object obj, Continuation continuation) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.f16482r, this.f16481o, this.f16478Z, this.f16477S, this.f16479g, continuation);
        anchoredDraggableKt$animateToWithDecay$2.f16483t = anchoredDragScope;
        anchoredDraggableKt$animateToWithDecay$2.f16476O = draggableAnchors;
        anchoredDraggableKt$animateToWithDecay$2.J2 = obj;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.xMQ(r1, r1, false, r3, r24, 2, null) != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (androidx.compose.foundation.gestures.AnchoredDraggableKt.gh(r0, r16, r2, r4, r5, r5, r24) != r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        if (androidx.compose.foundation.gestures.AnchoredDraggableKt.gh(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f3;
        AnchoredDragScope anchoredDragScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f16480n;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope2 = (AnchoredDragScope) this.f16483t;
            DraggableAnchors draggableAnchors = (DraggableAnchors) this.f16476O;
            Object obj2 = this.J2;
            final float fT = draggableAnchors.t(obj2);
            if (!Float.isNaN(fT)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float fR = Float.isNaN(this.f16482r.r()) ? 0.0f : this.f16482r.r();
                floatRef.element = fR;
                if (fR != fT) {
                    float f4 = this.f16481o;
                    if ((fT - fR) * f4 < 0.0f || f4 == 0.0f) {
                        AnchoredDraggableState anchoredDraggableState = this.f16482r;
                        AnimationSpec animationSpec = this.f16478Z;
                        this.f16483t = null;
                        this.f16476O = null;
                        this.f16480n = 1;
                    } else {
                        float fN = DecayAnimationSpecKt.n(this.f16479g, fR, f4);
                        float f5 = this.f16481o;
                        if (f5 > 0.0f) {
                            if (fN < fT) {
                                anchoredDragScope = anchoredDragScope2;
                                f3 = f5;
                                AnchoredDraggableState anchoredDraggableState2 = this.f16482r;
                                AnimationSpec animationSpec2 = this.f16478Z;
                                this.f16483t = null;
                                this.f16476O = null;
                                this.f16480n = 3;
                            }
                            AnimationState animationStateT = AnimationStateKt.t(floatRef.element, f5, 0L, 0L, false, 28, null);
                            DecayAnimationSpec decayAnimationSpec = this.f16479g;
                            final Ref.FloatRef floatRef2 = this.f16477S;
                            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                    n(animationScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(AnimationScope animationScope) {
                                    float fFloatValue;
                                    float fFloatValue2 = ((Number) animationScope.O()).floatValue();
                                    float f6 = fT;
                                    if (fFloatValue2 >= f6 || floatRef.element <= f6) {
                                        float fFloatValue3 = ((Number) animationScope.O()).floatValue();
                                        float f7 = fT;
                                        if (fFloatValue3 <= f7 || floatRef.element >= f7) {
                                            anchoredDragScope2.n(((Number) animationScope.O()).floatValue(), ((Number) animationScope.J2()).floatValue());
                                            floatRef2.element = ((Number) animationScope.J2()).floatValue();
                                            floatRef.element = ((Number) animationScope.O()).floatValue();
                                            return;
                                        }
                                    }
                                    float fTy = AnchoredDraggableKt.ty(((Number) animationScope.O()).floatValue(), fT);
                                    anchoredDragScope2.n(fTy, ((Number) animationScope.J2()).floatValue());
                                    Ref.FloatRef floatRef3 = floatRef2;
                                    if (Float.isNaN(((Number) animationScope.J2()).floatValue())) {
                                        fFloatValue = 0.0f;
                                    } else {
                                        fFloatValue = ((Number) animationScope.J2()).floatValue();
                                    }
                                    floatRef3.element = fFloatValue;
                                    floatRef.element = fTy;
                                    animationScope.n();
                                }
                            };
                            this.f16483t = null;
                            this.f16476O = null;
                            this.f16480n = 2;
                        } else {
                            if (fN > fT) {
                                f3 = f5;
                                anchoredDragScope = anchoredDragScope2;
                                AnchoredDraggableState anchoredDraggableState22 = this.f16482r;
                                AnimationSpec animationSpec22 = this.f16478Z;
                                this.f16483t = null;
                                this.f16476O = null;
                                this.f16480n = 3;
                            }
                            AnimationState animationStateT2 = AnimationStateKt.t(floatRef.element, f5, 0L, 0L, false, 28, null);
                            DecayAnimationSpec decayAnimationSpec2 = this.f16479g;
                            final Ref.FloatRef floatRef22 = this.f16477S;
                            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                    n(animationScope);
                                    return Unit.INSTANCE;
                                }

                                public final void n(AnimationScope animationScope) {
                                    float fFloatValue;
                                    float fFloatValue2 = ((Number) animationScope.O()).floatValue();
                                    float f6 = fT;
                                    if (fFloatValue2 >= f6 || floatRef.element <= f6) {
                                        float fFloatValue3 = ((Number) animationScope.O()).floatValue();
                                        float f7 = fT;
                                        if (fFloatValue3 <= f7 || floatRef.element >= f7) {
                                            anchoredDragScope2.n(((Number) animationScope.O()).floatValue(), ((Number) animationScope.J2()).floatValue());
                                            floatRef22.element = ((Number) animationScope.J2()).floatValue();
                                            floatRef.element = ((Number) animationScope.O()).floatValue();
                                            return;
                                        }
                                    }
                                    float fTy = AnchoredDraggableKt.ty(((Number) animationScope.O()).floatValue(), fT);
                                    anchoredDragScope2.n(fTy, ((Number) animationScope.J2()).floatValue());
                                    Ref.FloatRef floatRef3 = floatRef22;
                                    if (Float.isNaN(((Number) animationScope.J2()).floatValue())) {
                                        fFloatValue = 0.0f;
                                    } else {
                                        fFloatValue = ((Number) animationScope.J2()).floatValue();
                                    }
                                    floatRef3.element = fFloatValue;
                                    floatRef.element = fTy;
                                    animationScope.n();
                                }
                            };
                            this.f16483t = null;
                            this.f16476O = null;
                            this.f16480n = 2;
                        }
                    }
                    return coroutine_suspended;
                }
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
            this.f16477S.element = 0.0f;
        } else if (i2 == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(Apsps.VcedtgEHQnaXl);
            }
            ResultKt.throwOnFailure(obj);
            this.f16477S.element = 0.0f;
        }
        return Unit.INSTANCE;
    }
}
