package androidx.compose.material;

import GJW.C;
import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "", "t", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1290:1\n75#2:1291\n75#2:1292\n1247#3,6:1293\n1247#3,6:1299\n1247#3,6:1305\n1247#3,6:1311\n1247#3,3:1324\n1250#3,3:1328\n1247#3,6:1331\n1247#3,6:1337\n1247#3,6:1343\n1247#3,6:1349\n557#4:1317\n554#4,6:1318\n555#5:1327\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n421#1:1291\n426#1:1292\n437#1:1293,6\n438#1:1299,6\n441#1:1305,6\n448#1:1311,6\n455#1:1324,3\n455#1:1328,3\n457#1:1331,6\n483#1:1337,6\n528#1:1343,6\n537#1:1349,6\n455#1:1317\n455#1:1318,6\n455#1:1327\n*E\n"})
final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ SliderColors E2;
    final /* synthetic */ Function0 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ List f22766O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ boolean f22767S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f22768Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f22769g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ClosedFloatingPointRange f22770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f22771o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ State f22772r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ClosedFloatingPointRange f22773t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2(ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, List list, Function0 function0, State state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z2, int i2, SliderColors sliderColors) {
        super(3);
        this.f22770n = closedFloatingPointRange;
        this.f22773t = closedFloatingPointRange2;
        this.f22766O = list;
        this.J2 = function0;
        this.f22772r = state;
        this.f22771o = mutableInteractionSource;
        this.f22768Z = mutableInteractionSource2;
        this.f22767S = z2;
        this.f22769g = i2;
        this.E2 = sliderColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ClosedFloatingPointRange O(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2) {
        return SliderKt.iF(floatRef.element, floatRef2.element, closedFloatingPointRange2, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        t(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i3;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        if ((i2 & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2 | (composer.p5(boxWithConstraintsScope2) ? 4 : 2);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2;
        }
        if (!composer.HI((i3 & 19) != 18, i3 & 1)) {
            composer.wTp();
            return;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(652589923, i3, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:420)");
        }
        boolean z2 = composer.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t;
        float fQie = Constraints.qie(boxWithConstraintsScope2.rl());
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        final Ref.FloatRef floatRef4 = new Ref.FloatRef();
        Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        floatRef3.element = fQie - density.l(SliderKt.nY());
        floatRef4.element = density.l(SliderKt.nY());
        ClosedFloatingPointRange closedFloatingPointRange = this.f22773t;
        ClosedFloatingPointRange closedFloatingPointRange2 = this.f22770n;
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = PrimitiveSnapshotStateKt.n(nr(closedFloatingPointRange2, floatRef4, floatRef3, ((Number) closedFloatingPointRange.getStart()).floatValue()));
            composer.o(objIF);
        }
        final MutableFloatState mutableFloatState = (MutableFloatState) objIF;
        ClosedFloatingPointRange closedFloatingPointRange3 = this.f22773t;
        ClosedFloatingPointRange closedFloatingPointRange4 = this.f22770n;
        Object objIF2 = composer.iF();
        if (objIF2 == companion.n()) {
            objIF2 = PrimitiveSnapshotStateKt.n(nr(closedFloatingPointRange4, floatRef4, floatRef3, ((Number) closedFloatingPointRange3.getEndInclusive()).floatValue()));
            composer.o(objIF2);
        }
        final MutableFloatState mutableFloatState2 = (MutableFloatState) objIF2;
        boolean zP5 = composer.p5(this.f22770n) | composer.rl(floatRef4.element) | composer.rl(floatRef3.element);
        ClosedFloatingPointRange closedFloatingPointRange5 = this.f22770n;
        Object objIF3 = composer.iF();
        if (zP5 || objIF3 == companion.n()) {
            objIF3 = new SliderKt$RangeSlider$2$2$1(closedFloatingPointRange5, floatRef4, floatRef3);
            composer.o(objIF3);
        }
        SliderKt.n((Function1) ((KFunction) objIF3), this.f22770n, RangesKt.rangeTo(floatRef4.element, floatRef3.element), mutableFloatState, ((Number) this.f22773t.getStart()).floatValue(), composer, 3072);
        boolean zP52 = composer.p5(this.f22770n) | composer.rl(floatRef4.element) | composer.rl(floatRef3.element);
        ClosedFloatingPointRange closedFloatingPointRange6 = this.f22770n;
        Object objIF4 = composer.iF();
        if (zP52 || objIF4 == companion.n()) {
            objIF4 = new SliderKt$RangeSlider$2$3$1(closedFloatingPointRange6, floatRef4, floatRef3);
            composer.o(objIF4);
        }
        SliderKt.n((Function1) ((KFunction) objIF4), this.f22770n, RangesKt.rangeTo(floatRef4.element, floatRef3.element), mutableFloatState2, ((Number) this.f22773t.getEndInclusive()).floatValue(), composer, 3072);
        Object objIF5 = composer.iF();
        if (objIF5 == companion.n()) {
            objIF5 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
            composer.o(objIF5);
        }
        final vd vdVar = (vd) objIF5;
        boolean zE2 = composer.E2(this.f22766O) | composer.rl(floatRef4.element) | composer.rl(floatRef3.element) | composer.p5(this.J2) | composer.E2(vdVar) | composer.p5(this.f22772r) | composer.p5(this.f22770n);
        final List list = this.f22766O;
        final Function0 function0 = this.J2;
        final State state = this.f22772r;
        final ClosedFloatingPointRange closedFloatingPointRange7 = this.f22770n;
        Object objIF6 = composer.iF();
        if (zE2 || objIF6 == companion.n()) {
            objIF6 = new Function1<Boolean, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Ref.FloatRef E2;
                    final /* synthetic */ Function0 J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ float f22790O;

                    /* JADX INFO: renamed from: S, reason: collision with root package name */
                    final /* synthetic */ State f22791S;

                    /* JADX INFO: renamed from: Z, reason: collision with root package name */
                    final /* synthetic */ MutableFloatState f22792Z;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ ClosedFloatingPointRange f22793e;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Ref.FloatRef f22794g;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f22795n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    final /* synthetic */ MutableFloatState f22796o;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ boolean f22797r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ float f22798t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(float f3, float f4, Function0 function0, boolean z2, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, State state, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange, Continuation continuation) {
                        super(2, continuation);
                        this.f22798t = f3;
                        this.f22790O = f4;
                        this.J2 = function0;
                        this.f22797r = z2;
                        this.f22796o = mutableFloatState;
                        this.f22792Z = mutableFloatState2;
                        this.f22791S = state;
                        this.f22794g = floatRef;
                        this.E2 = floatRef2;
                        this.f22793e = closedFloatingPointRange;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f22798t, this.f22790O, this.J2, this.f22797r, this.f22796o, this.f22792Z, this.f22791S, this.f22794g, this.E2, this.f22793e, continuation);
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
                        int i2 = this.f22795n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            Animatable animatableRl = AnimatableKt.rl(this.f22798t, 0.0f, 2, null);
                            Float fBoxFloat = Boxing.boxFloat(this.f22790O);
                            TweenSpec tweenSpec = SliderKt.xMQ;
                            Float fBoxFloat2 = Boxing.boxFloat(0.0f);
                            final boolean z2 = this.f22797r;
                            final MutableFloatState mutableFloatState = this.f22796o;
                            final MutableFloatState mutableFloatState2 = this.f22792Z;
                            final State state = this.f22791S;
                            final Ref.FloatRef floatRef = this.f22794g;
                            final Ref.FloatRef floatRef2 = this.E2;
                            final ClosedFloatingPointRange closedFloatingPointRange = this.f22793e;
                            Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material.SliderKt.RangeSlider.2.gestureEndAction.1.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                                    n(animatable);
                                    return Unit.INSTANCE;
                                }

                                public final void n(Animatable animatable) {
                                    (z2 ? mutableFloatState : mutableFloatState2).Z(((Number) animatable.ty()).floatValue());
                                    ((Function1) state.getValue()).invoke(SliderKt$RangeSlider$2.O(floatRef, floatRef2, closedFloatingPointRange, RangesKt.rangeTo(mutableFloatState.n(), mutableFloatState2.n())));
                                }
                            };
                            this.f22795n = 1;
                            if (animatableRl.O(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        Function0 function0 = this.J2;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(boolean z3) {
                    float fN = (z3 ? mutableFloatState : mutableFloatState2).n();
                    float fX2 = SliderKt.X(fN, list, floatRef4.element, floatRef3.element);
                    if (fN != fX2) {
                        C.nr(vdVar, null, null, new AnonymousClass1(fN, fX2, function0, z3, mutableFloatState, mutableFloatState2, state, floatRef4, floatRef3, closedFloatingPointRange7, null), 3, null);
                        return;
                    }
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            };
            floatRef = floatRef4;
            floatRef2 = floatRef3;
            composer.o(objIF6);
        } else {
            floatRef2 = floatRef3;
            floatRef = floatRef4;
        }
        State stateCk = SnapshotStateKt.ck((Function1) objIF6, composer, 0);
        boolean zP53 = composer.p5(this.f22770n) | composer.rl(floatRef.element) | composer.rl(floatRef2.element) | composer.p5(this.f22773t) | composer.p5(this.f22772r);
        final ClosedFloatingPointRange closedFloatingPointRange8 = this.f22773t;
        final State state2 = this.f22772r;
        final ClosedFloatingPointRange closedFloatingPointRange9 = this.f22770n;
        Object objIF7 = composer.iF();
        if (zP53 || objIF7 == companion.n()) {
            final Ref.FloatRef floatRef5 = floatRef2;
            final Ref.FloatRef floatRef6 = floatRef;
            objIF7 = new Function2<Boolean, Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f3) {
                    n(bool.booleanValue(), f3.floatValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void n(boolean z3, float f3) {
                    ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
                    if (z3) {
                        MutableFloatState mutableFloatState3 = mutableFloatState;
                        mutableFloatState3.Z(mutableFloatState3.n() + f3);
                        mutableFloatState2.Z(SliderKt$RangeSlider$2.nr(closedFloatingPointRange9, floatRef6, floatRef5, ((Number) closedFloatingPointRange8.getEndInclusive()).floatValue()));
                        float fN = mutableFloatState2.n();
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(RangesKt.coerceIn(mutableFloatState.n(), floatRef6.element, fN), fN);
                    } else {
                        MutableFloatState mutableFloatState4 = mutableFloatState2;
                        mutableFloatState4.Z(mutableFloatState4.n() + f3);
                        mutableFloatState.Z(SliderKt$RangeSlider$2.nr(closedFloatingPointRange9, floatRef6, floatRef5, ((Number) closedFloatingPointRange8.getStart()).floatValue()));
                        float fN2 = mutableFloatState.n();
                        closedFloatingPointRangeRangeTo = RangesKt.rangeTo(fN2, RangesKt.coerceIn(mutableFloatState2.n(), fN2, floatRef5.element));
                    }
                    ((Function1) state2.getValue()).invoke(SliderKt$RangeSlider$2.O(floatRef6, floatRef5, closedFloatingPointRange9, closedFloatingPointRangeRangeTo));
                }
            };
            composer.o(objIF7);
        }
        State stateCk2 = SnapshotStateKt.ck((Function2) objIF7, composer, 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierG = SliderKt.g(companion2, this.f22771o, this.f22768Z, mutableFloatState, mutableFloatState2, this.f22767S, z2, fQie, this.f22770n, stateCk, stateCk2);
        final float fCoerceIn = RangesKt.coerceIn(((Number) this.f22773t.getStart()).floatValue(), ((Number) this.f22770n.getStart()).floatValue(), ((Number) this.f22773t.getEndInclusive()).floatValue());
        final float fCoerceIn2 = RangesKt.coerceIn(((Number) this.f22773t.getEndInclusive()).floatValue(), ((Number) this.f22773t.getStart()).floatValue(), ((Number) this.f22770n.getEndInclusive()).floatValue());
        float fViF = SliderKt.ViF(((Number) this.f22770n.getStart()).floatValue(), ((Number) this.f22770n.getEndInclusive()).floatValue(), fCoerceIn);
        float fViF2 = SliderKt.ViF(((Number) this.f22770n.getStart()).floatValue(), ((Number) this.f22770n.getEndInclusive()).floatValue(), fCoerceIn2);
        int iFloor = (int) Math.floor(this.f22769g * fViF2);
        int iFloor2 = (int) Math.floor(this.f22769g * (1.0f - fViF));
        boolean z3 = this.f22767S;
        boolean zP54 = composer.p5(this.f22772r) | composer.rl(fCoerceIn2);
        final State state3 = this.f22772r;
        Object objIF8 = composer.iF();
        if (zP54 || objIF8 == companion.n()) {
            objIF8 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                    n(f3.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f3) {
                    ((Function1) state3.getValue()).invoke(RangesKt.rangeTo(f3, fCoerceIn2));
                }
            };
            composer.o(objIF8);
        }
        Modifier modifierE2 = SliderKt.E2(companion2, fCoerceIn, z3, (Function1) objIF8, this.J2, RangesKt.rangeTo(((Number) this.f22770n.getStart()).floatValue(), fCoerceIn2), iFloor);
        boolean z4 = this.f22767S;
        boolean zP55 = composer.p5(this.f22772r) | composer.rl(fCoerceIn);
        final State state4 = this.f22772r;
        Object objIF9 = composer.iF();
        if (zP55 || objIF9 == companion.n()) {
            objIF9 = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                    n(f3.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f3) {
                    ((Function1) state4.getValue()).invoke(RangesKt.rangeTo(fCoerceIn, f3));
                }
            };
            composer.o(objIF9);
        }
        SliderKt.t(this.f22767S, fViF, fViF2, this.f22766O, this.E2, floatRef2.element - floatRef.element, this.f22771o, this.f22768Z, modifierG, modifierE2, SliderKt.E2(companion2, fCoerceIn2, z4, (Function1) objIF9, this.J2, RangesKt.rangeTo(fCoerceIn, ((Number) this.f22770n.getEndInclusive()).floatValue()), iFloor2), composer, 14155776, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float nr(ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f3) {
        return SliderKt.te(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f3, floatRef.element, floatRef2.element);
    }
}
