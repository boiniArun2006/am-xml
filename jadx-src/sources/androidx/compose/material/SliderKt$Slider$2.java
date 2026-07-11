package androidx.compose.material;

import GJW.C;
import GJW.vd;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
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
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1290:1\n75#2:1291\n75#2:1292\n557#3:1293\n554#3,6:1294\n1247#4,3:1300\n1250#4,3:1304\n1247#4,6:1307\n1247#4,6:1313\n1247#4,6:1319\n1247#4,6:1325\n1247#4,6:1331\n1247#4,6:1337\n555#5:1303\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$2\n*L\n197#1:1291\n202#1:1292\n213#1:1293\n213#1:1294,6\n213#1:1300,3\n213#1:1304,3\n214#1:1307,6\n215#1:1313,6\n218#1:1319,6\n227#1:1325,6\n230#1:1331,6\n261#1:1337,6\n213#1:1303\n*E\n"})
final class SliderKt$Slider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ Function0 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ List f22834O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final /* synthetic */ State f22835S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ SliderColors f22836Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ ClosedFloatingPointRange f22837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ boolean f22838o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f22839r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ float f22840t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$2(ClosedFloatingPointRange closedFloatingPointRange, float f3, List list, Function0 function0, MutableInteractionSource mutableInteractionSource, boolean z2, SliderColors sliderColors, State state) {
        super(3);
        this.f22837n = closedFloatingPointRange;
        this.f22840t = f3;
        this.f22834O = list;
        this.J2 = function0;
        this.f22839r = mutableInteractionSource;
        this.f22838o = z2;
        this.f22836Z = sliderColors;
        this.f22835S = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float O(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange, float f3) {
        return SliderKt.te(floatRef.element, floatRef2.element, f3, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
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
        MutableFloatState mutableFloatState;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        final SliderDraggableState sliderDraggableState;
        Ref.FloatRef floatRef3;
        Ref.FloatRef floatRef4;
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
            ComposerKt.p5(2085116814, i3, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)");
        }
        boolean z2 = composer.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t;
        float fQie = Constraints.qie(boxWithConstraintsScope2.rl());
        final Ref.FloatRef floatRef5 = new Ref.FloatRef();
        final Ref.FloatRef floatRef6 = new Ref.FloatRef();
        Density density = (Density) composer.ty(CompositionLocalsKt.J2());
        floatRef5.element = Math.max(fQie - density.l(SliderKt.nY()), 0.0f);
        floatRef6.element = Math.min(density.l(SliderKt.nY()), floatRef5.element);
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
            composer.o(objIF);
        }
        final vd vdVar = (vd) objIF;
        float f3 = this.f22840t;
        ClosedFloatingPointRange closedFloatingPointRange = this.f22837n;
        Object objIF2 = composer.iF();
        if (objIF2 == companion.n()) {
            objIF2 = PrimitiveSnapshotStateKt.n(nr(closedFloatingPointRange, floatRef6, floatRef5, f3));
            composer.o(objIF2);
        }
        final MutableFloatState mutableFloatState2 = (MutableFloatState) objIF2;
        Object objIF3 = composer.iF();
        if (objIF3 == companion.n()) {
            objIF3 = PrimitiveSnapshotStateKt.n(0.0f);
            composer.o(objIF3);
        }
        final MutableFloatState mutableFloatState3 = (MutableFloatState) objIF3;
        boolean zRl = composer.rl(floatRef6.element) | composer.rl(floatRef5.element) | composer.p5(this.f22837n);
        final State state = this.f22835S;
        final ClosedFloatingPointRange closedFloatingPointRange2 = this.f22837n;
        Object objIF4 = composer.iF();
        if (zRl || objIF4 == companion.n()) {
            mutableFloatState = mutableFloatState3;
            floatRef = floatRef6;
            floatRef2 = floatRef5;
            objIF4 = new SliderDraggableState(new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$2$draggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                    n(f4.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f4) {
                    MutableFloatState mutableFloatState4 = mutableFloatState2;
                    mutableFloatState4.Z(mutableFloatState4.n() + f4 + mutableFloatState3.n());
                    mutableFloatState3.Z(0.0f);
                    ((Function1) state.getValue()).invoke(Float.valueOf(SliderKt$Slider$2.O(floatRef6, floatRef5, closedFloatingPointRange2, RangesKt.coerceIn(mutableFloatState2.n(), floatRef6.element, floatRef5.element))));
                }
            });
            composer.o(objIF4);
        } else {
            floatRef2 = floatRef5;
            floatRef = floatRef6;
            mutableFloatState = mutableFloatState3;
        }
        SliderDraggableState sliderDraggableState2 = (SliderDraggableState) objIF4;
        boolean zP5 = composer.p5(this.f22837n) | composer.rl(floatRef.element) | composer.rl(floatRef2.element);
        ClosedFloatingPointRange closedFloatingPointRange3 = this.f22837n;
        Object objIF5 = composer.iF();
        if (zP5 || objIF5 == companion.n()) {
            objIF5 = new SliderKt$Slider$2$2$1(closedFloatingPointRange3, floatRef, floatRef2);
            composer.o(objIF5);
        }
        SliderKt.n((Function1) ((KFunction) objIF5), this.f22837n, RangesKt.rangeTo(floatRef.element, floatRef2.element), mutableFloatState2, this.f22840t, composer, 3072);
        boolean zE2 = composer.E2(this.f22834O) | composer.rl(floatRef.element) | composer.rl(floatRef2.element) | composer.E2(vdVar) | composer.E2(sliderDraggableState2) | composer.p5(this.J2);
        final List list = this.f22834O;
        final Function0 function0 = this.J2;
        Object objIF6 = composer.iF();
        if (zE2 || objIF6 == companion.n()) {
            sliderDraggableState = sliderDraggableState2;
            final Ref.FloatRef floatRef7 = floatRef2;
            final Ref.FloatRef floatRef8 = floatRef;
            Object obj = new Function1<Float, Unit>() { // from class: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1

                /* JADX INFO: renamed from: androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                    final /* synthetic */ float J2;

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ float f22858O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f22859n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    final /* synthetic */ Function0 f22860o;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ float f22861r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ SliderDraggableState f22862t;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(SliderDraggableState sliderDraggableState, float f3, float f4, float f5, Function0 function0, Continuation continuation) {
                        super(2, continuation);
                        this.f22862t = sliderDraggableState;
                        this.f22858O = f3;
                        this.J2 = f4;
                        this.f22861r = f5;
                        this.f22860o = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass1(this.f22862t, this.f22858O, this.J2, this.f22861r, this.f22860o, continuation);
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
                        int i2 = this.f22859n;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            SliderDraggableState sliderDraggableState = this.f22862t;
                            float f3 = this.f22858O;
                            float f4 = this.J2;
                            float f5 = this.f22861r;
                            this.f22859n = 1;
                            if (SliderKt.WPU(sliderDraggableState, f3, f4, f5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        Function0 function0 = this.f22860o;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                    n(f4.floatValue());
                    return Unit.INSTANCE;
                }

                public final void n(float f4) {
                    Function0 function02;
                    float fN = mutableFloatState2.n();
                    float fX2 = SliderKt.X(fN, list, floatRef8.element, floatRef7.element);
                    if (fN != fX2) {
                        C.nr(vdVar, null, null, new AnonymousClass1(sliderDraggableState, fN, fX2, f4, function0, null), 3, null);
                    } else {
                        if (sliderDraggableState.KN() || (function02 = function0) == null) {
                            return;
                        }
                        function02.invoke();
                    }
                }
            };
            floatRef3 = floatRef8;
            floatRef4 = floatRef7;
            composer.o(obj);
            objIF6 = obj;
        } else {
            floatRef4 = floatRef2;
            floatRef3 = floatRef;
            sliderDraggableState = sliderDraggableState2;
        }
        State stateCk = SnapshotStateKt.ck((Function1) objIF6, composer, 0);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierE = SliderKt.e(companion2, sliderDraggableState, this.f22839r, fQie, z2, mutableFloatState2, stateCk, mutableFloatState, this.f22838o);
        Orientation orientation = Orientation.f16970t;
        boolean zKN = sliderDraggableState.KN();
        boolean z3 = this.f22838o;
        boolean z4 = z2;
        MutableInteractionSource mutableInteractionSource = this.f22839r;
        boolean zP52 = composer.p5(stateCk);
        Object objIF7 = composer.iF();
        if (zP52 || objIF7 == companion.n()) {
            objIF7 = new SliderKt$Slider$2$drag$1$1(stateCk, null);
            composer.o(objIF7);
        }
        SliderKt.O(this.f22838o, SliderKt.ViF(((Number) this.f22837n.getStart()).floatValue(), ((Number) this.f22837n.getEndInclusive()).floatValue(), RangesKt.coerceIn(this.f22840t, ((Number) this.f22837n.getStart()).floatValue(), ((Number) this.f22837n.getEndInclusive()).floatValue())), this.f22834O, this.f22836Z, floatRef4.element - floatRef3.element, this.f22839r, modifierE.Zmq(DraggableKt.KN(companion2, sliderDraggableState, orientation, z3, mutableInteractionSource, zKN, null, (Function3) objIF7, z4, 32, null)), composer, 0);
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
