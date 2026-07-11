package s;

import SJ0.yr;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import s.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f73162n;

        j(long j2) {
            this.f73162n = j2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(562189402, i2, -1, "com.alightcreative.common.compose.components.player.PlayerTimeline.<anonymous>.<anonymous> (PlayerTimeline.kt:71)");
            }
            BoxKt.n(BackgroundKt.nr(SizeKt.xMQ(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(20)), this.f73162n, null, 2, null), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f73163n;

        static final class j extends SuspendLambda implements Function3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f73164O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73165n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ long f73166t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Function1 function1, Continuation continuation) {
                super(3, continuation);
                this.f73164O = function1;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return n((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (Continuation) obj3);
            }

            public final Object n(PressGestureScope pressGestureScope, long j2, Continuation continuation) {
                j jVar = new j(this.f73164O, continuation);
                jVar.f73166t = j2;
                return jVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f73165n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f73164O.invoke(Boxing.boxFloat(Float.intBitsToFloat((int) (this.f73166t >> 32))));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        n(Function1 function1) {
            this.f73163n = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            Object objAz = TapGestureDetectorKt.az(pointerInputScope, null, null, new j(this.f73163n, null), null, continuation, 11, null);
            return objAz == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAz : Unit.INSTANCE;
        }
    }

    static final class w6 implements PointerInputEventHandler {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f73167O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f73168n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f73169t;

        w6(Function0 function0, Function0 function02, Function1 function1) {
            this.f73168n = function0;
            this.f73169t = function02;
            this.f73167O = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Function1 function1, PointerInputChange change, float f3) {
            Intrinsics.checkNotNullParameter(change, "change");
            function1.invoke(Float.valueOf(Float.intBitsToFloat((int) (change.getPosition() >> 32))));
            change.n();
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            final Function0 function0 = this.f73169t;
            Function1 function1 = new Function1() { // from class: s.qz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return o.w6.t(function0, (Offset) obj);
                }
            };
            Function0 function02 = this.f73168n;
            final Function1 function12 = this.f73167O;
            Object objIk = DragGestureDetectorKt.Ik(pointerInputScope, function1, function02, null, new Function2() { // from class: s.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.w6.nr(function12, (PointerInputChange) obj, ((Float) obj2).floatValue());
                }
            }, continuation, 4, null);
            return objIk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIk : Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0, Offset offset) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void J2(Modifier modifier, final boolean z2, final Function1 onWidthMeasure, final Function1 onTimelineInput, final Function1 updateViewCallback, final long j2, Function0 function0, Function0 function02, boolean z3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Modifier modifier3;
        final Function0 function07;
        Composer composer2;
        final boolean z4;
        final Function0 function08;
        Intrinsics.checkNotNullParameter(onWidthMeasure, "onWidthMeasure");
        Intrinsics.checkNotNullParameter(onTimelineInput, "onTimelineInput");
        Intrinsics.checkNotNullParameter(updateViewCallback, "updateViewCallback");
        Composer composerKN = composer.KN(-1770242820);
        int i8 = i3 & 1;
        if (i8 != 0) {
            modifier2 = modifier;
            i7 = i2 | 6;
            i5 = 16;
        } else if ((i2 & 6) == 0) {
            i5 = 16;
            modifier2 = modifier;
            i7 = i2 | (composerKN.p5(modifier2) ? 4 : 2);
        } else {
            i5 = 16;
            modifier2 = modifier;
            i7 = i2;
        }
        if ((i3 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.n(z2) ? 32 : i5;
        }
        int i9 = i7;
        if ((4 & i3) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerKN.E2(onWidthMeasure) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i9 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i9 |= composerKN.E2(onTimelineInput) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i9 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i9 |= composerKN.E2(updateViewCallback) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i9 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i9 |= composerKN.nr(j2) ? 131072 : 65536;
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i9 |= 1572864;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i2 & 1572864) == 0) {
                i9 |= composerKN.E2(function03) ? 1048576 : 524288;
            }
        }
        int i11 = 128 & i3;
        if (i11 != 0) {
            i9 |= 12582912;
            function04 = function02;
        } else {
            function04 = function02;
            if ((i2 & 12582912) == 0) {
                i9 |= composerKN.E2(function04) ? 8388608 : 4194304;
            }
        }
        int i12 = i3 & 256;
        if (i12 != 0) {
            i9 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i9 |= composerKN.n(z3) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i9 & 38347923) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
            function07 = function04;
            modifier3 = modifier2;
            function08 = function03;
            composer2 = composerKN;
            z4 = z3;
        } else {
            Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier2;
            if (i10 != 0) {
                composerKN.eF(-444722501);
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: s.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.Uo();
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                function05 = (Function0) objIF;
            } else {
                function05 = function03;
            }
            if (i11 != 0) {
                composerKN.eF(-444721477);
                Object objIF2 = composerKN.iF();
                if (objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: s.fuX
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.xMQ();
                        }
                    };
                    composerKN.o(objIF2);
                }
                function06 = (Function0) objIF2;
                composerKN.Xw();
            } else {
                function06 = function04;
            }
            final boolean z5 = i12 != 0 ? false : z3;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1770242820, i9, -1, "com.alightcreative.common.compose.components.player.PlayerTimeline (PlayerTimeline.kt:42)");
            }
            Modifier modifierXMQ = SizeKt.xMQ(modifier4, Dp.KN(80));
            composerKN.eF(-444717034);
            boolean z6 = (i9 & 896) == 256;
            Object objIF3 = composerKN.iF();
            if (z6 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function1() { // from class: s.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.mUb(onWidthMeasure, (LayoutCoordinates) obj);
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            Modifier modifierN = OnGloballyPositionedModifierKt.n(modifierXMQ, (Function1) objIF3);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            modifier3 = modifier4;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierQie = qie(Modifier.INSTANCE, onTimelineInput, function05, function06);
            composerKN.eF(-1026557242);
            boolean z7 = (234881024 & i9) == 67108864;
            Object objIF4 = composerKN.iF();
            if (z7 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function1() { // from class: s.aC
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.gh(z5, (Context) obj);
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            Function0 function09 = function06;
            boolean z9 = z5;
            AndroidView_androidKt.n((Function1) objIF4, modifierQie, updateViewCallback, composerKN, (i9 >> 6) & 896, 0);
            Function0 function010 = function05;
            AnimatedVisibilityKt.mUb(z2, null, EnterExitTransitionKt.HI(new TweenSpec(1000, 1000, null, 4, null), 0.0f, 2, null), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(562189402, true, new j(j2), composerKN, 54), composerKN, ((i9 >> 3) & 14) | 196992, 18);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            function07 = function09;
            composer2 = composerKN;
            z4 = z9;
            function08 = function010;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeGh.n(new Function2() { // from class: s.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.KN(modifier5, z2, onWidthMeasure, onTimelineInput, updateViewCallback, j2, function08, function07, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Modifier modifier, boolean z2, Function1 function1, Function1 function12, Function1 function13, long j2, Function0 function0, Function0 function02, boolean z3, int i2, int i3, Composer composer, int i5) {
        J2(modifier, z2, function1, function12, function13, j2, function0, function02, z3, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout gh(boolean z2, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        yr yrVarT = yr.t(LayoutInflater.from(context));
        yrVarT.rl.setDarkMode(z2);
        yrVarT.f9692t.setDarkMode(z2);
        return yrVarT.getRoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(Integer.valueOf((int) (it.n() >> 32)));
        return Unit.INSTANCE;
    }

    private static final Modifier qie(Modifier modifier, Function1 function1, Function0 function0, Function0 function02) {
        Unit unit = Unit.INSTANCE;
        return SuspendingPointerInputFilterKt.nr(SuspendingPointerInputFilterKt.nr(modifier, unit, new n(function1)), unit, new w6(function02, function0, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ() {
        return Unit.INSTANCE;
    }
}
