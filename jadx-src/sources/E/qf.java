package E;

import E.qf;
import SJ0.eZk;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
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
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class qf {

    static final class j implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f2178n;

        j(Function1 function1) {
            this.f2178n = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            final Function1 function1 = this.f2178n;
            Object objAz = TapGestureDetectorKt.az(pointerInputScope, null, null, null, new Function1() { // from class: E.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qf.j.rl(function1, (Offset) obj);
                }
            }, continuation, 7, null);
            return objAz == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAz : Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit rl(Function1 function1, Offset offset) {
            function1.invoke(Float.valueOf(Float.intBitsToFloat((int) (offset.getPackedValue() >> 32))));
            return Unit.INSTANCE;
        }
    }

    static final class n implements PointerInputEventHandler {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f2179O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f2180n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f2181t;

        n(Function0 function0, Function0 function02, Function1 function1) {
            this.f2180n = function0;
            this.f2181t = function02;
            this.f2179O = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Function1 function1, PointerInputChange change, float f3) {
            Intrinsics.checkNotNullParameter(change, "change");
            change.n();
            function1.invoke(Float.valueOf(f3));
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
            final Function0 function0 = this.f2181t;
            Function1 function1 = new Function1() { // from class: E.Ln
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qf.n.t(function0, (Offset) obj);
                }
            };
            Function0 function02 = this.f2180n;
            final Function1 function12 = this.f2179O;
            Object objIk = DragGestureDetectorKt.Ik(pointerInputScope, function1, function02, null, new Function2() { // from class: E.lej
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qf.n.nr(function12, (PointerInputChange) obj, ((Float) obj2).floatValue());
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J2(Modifier modifier, final Function1 onWidthMeasure, final Function1 onTap, final Function1 updateViewCallback, final Function1 onHorizontalDrag, Function0 function0, Function0 function02, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Function0 function03;
        int i7;
        Function0 function04;
        Function0 function05;
        boolean z2;
        Object objIF;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Object objIF2;
        Composer composer2;
        final Function0 function06;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onWidthMeasure, "onWidthMeasure");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(updateViewCallback, "updateViewCallback");
        Intrinsics.checkNotNullParameter(onHorizontalDrag, "onHorizontalDrag");
        Composer composerKN = composer.KN(-880982077);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onWidthMeasure) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onTap) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(updateViewCallback) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onHorizontalDrag) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i5 |= 196608;
        } else {
            if ((196608 & i2) == 0) {
                function03 = function0;
                i5 |= composerKN.E2(function03) ? 131072 : 65536;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    function04 = function02;
                    i5 |= composerKN.E2(function04) ? 1048576 : 524288;
                }
                if ((i5 & 599187) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function06 = function03;
                    composer2 = composerKN;
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i9 == 0) {
                        composerKN.eF(-681008224);
                        Object objIF3 = composerKN.iF();
                        if (objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function0() { // from class: E.afx
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return qf.Uo();
                                }
                            };
                            composerKN.o(objIF3);
                        }
                        composerKN.Xw();
                        function05 = (Function0) objIF3;
                    } else {
                        function05 = function03;
                    }
                    if (i7 != 0) {
                        composerKN.eF(-681007200);
                        Object objIF4 = composerKN.iF();
                        if (objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new Function0() { // from class: E.Z
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return qf.KN();
                                }
                            };
                            composerKN.o(objIF4);
                        }
                        composerKN.Xw();
                        function04 = (Function0) objIF4;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-880982077, i5, -1, "com.alightcreative.template.importpreview.ui.components.VideoTrimmerTimeline (TimelineWithHighlights.kt:33)");
                    }
                    Modifier modifierXMQ = SizeKt.xMQ(modifier2, Dp.KN(80));
                    composerKN.eF(-681003749);
                    z2 = (i5 & 112) != 32;
                    objIF = composerKN.iF();
                    if (!z2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: E.Ew
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qf.xMQ(onWidthMeasure, (LayoutCoordinates) obj);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifierN = OnGloballyPositionedModifierKt.n(modifierXMQ, (Function1) objIF);
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
                    if (composerKN.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                        composerKN.r();
                    } else {
                        composerKN.s7N(function0N);
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    function2Rl = companion.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    Modifier modifierQie = qie(Modifier.INSTANCE, onTap, onHorizontalDrag, function05, function04);
                    composerKN.eF(-2079773808);
                    objIF2 = composerKN.iF();
                    if (objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function1() { // from class: E.nKK
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return qf.mUb((Context) obj);
                            }
                        };
                        composerKN.o(objIF2);
                    }
                    composerKN.Xw();
                    AndroidView_androidKt.n((Function1) objIF2, modifierQie, updateViewCallback, composerKN, ((i5 >> 3) & 896) | 6, 0);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer2 = composerKN;
                    function06 = function05;
                }
                final Modifier modifier3 = modifier2;
                final Function0 function07 = function04;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: E.DAz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return qf.gh(modifier3, onWidthMeasure, onTap, updateViewCallback, onHorizontalDrag, function06, function07, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            function04 = function02;
            if ((i5 & 599187) == 599186) {
                if (i8 != 0) {
                }
                if (i9 == 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifierXMQ2 = SizeKt.xMQ(modifier2, Dp.KN(80));
                composerKN.eF(-681003749);
                if ((i5 & 112) != 32) {
                }
                objIF = composerKN.iF();
                if (!z2) {
                    objIF = new Function1() { // from class: E.Ew
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qf.xMQ(onWidthMeasure, (LayoutCoordinates) obj);
                        }
                    };
                    composerKN.o(objIF);
                    composerKN.Xw();
                    Modifier modifierN2 = OnGloballyPositionedModifierKt.n(modifierXMQ2, (Function1) objIF);
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N2 = companion2.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN = Updater.n(composerKN);
                    Updater.O(composerN, measurePolicyUo2, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk2, companion2.O());
                    function2Rl = companion2.rl();
                    if (!composerN.getInserting()) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                        Updater.O(composerN, modifierO2, companion2.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        Modifier modifierQie2 = qie(Modifier.INSTANCE, onTap, onHorizontalDrag, function05, function04);
                        composerKN.eF(-2079773808);
                        objIF2 = composerKN.iF();
                        if (objIF2 == Composer.INSTANCE.n()) {
                        }
                        composerKN.Xw();
                        AndroidView_androidKt.n((Function1) objIF2, modifierQie2, updateViewCallback, composerKN, ((i5 >> 3) & 896) | 6, 0);
                        composerKN.XQ();
                        if (ComposerKt.v()) {
                        }
                        composer2 = composerKN;
                        function06 = function05;
                    }
                }
            }
            final Modifier modifier32 = modifier2;
            final Function0 function072 = function04;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function03 = function0;
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        function04 = function02;
        if ((i5 & 599187) == 599186) {
        }
        final Modifier modifier322 = modifier2;
        final Function0 function0722 = function04;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i5) {
        J2(modifier, function1, function12, function13, function14, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout mUb(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return eZk.t(LayoutInflater.from(context)).getRoot();
    }

    private static final Modifier qie(Modifier modifier, Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        Unit unit = Unit.INSTANCE;
        return SuspendingPointerInputFilterKt.nr(SuspendingPointerInputFilterKt.nr(modifier, unit, new j(function1)), unit, new n(function02, function0, function12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Function1 function1, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(Integer.valueOf((int) (it.n() >> 32)));
        return Unit.INSTANCE;
    }
}
