package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/DismissState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "Landroidx/compose/material/DismissDirection;", "directions", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", "dismissThresholds", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "background", "dismissContent", c.f62177j, "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/DismissValue;", "from", "to", "nr", "(Landroidx/compose/material/DismissValue;Landroidx/compose/material/DismissValue;)Landroidx/compose/material/DismissDirection;", "Landroidx/compose/ui/unit/Dp;", "F", "DISMISS_THRESHOLD", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,227:1\n1247#2,6:228\n149#3:234\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material/SwipeToDismissKt\n*L\n137#1:228,6\n226#1:234\n*E\n"})
public final class SwipeToDismissKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23183n = Dp.KN(56);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DismissDirection nr(DismissValue dismissValue, DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.f21822n) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.f21824t) {
            return DismissDirection.f21815n;
        }
        if (dismissValue == dismissValue2 && dismissValue == DismissValue.f21821O) {
            return DismissDirection.f21816t;
        }
        DismissValue dismissValue3 = DismissValue.f21822n;
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.f21824t) {
            return DismissDirection.f21815n;
        }
        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.f21821O) {
            return DismissDirection.f21816t;
        }
        if (dismissValue == DismissValue.f21824t && dismissValue2 == dismissValue3) {
            return DismissDirection.f21815n;
        }
        if (dismissValue == DismissValue.f21821O && dismissValue2 == dismissValue3) {
            return DismissDirection.f21816t;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final DismissState dismissState, Modifier modifier, Set set, Function1 function1, final Function3 function3, final Function3 function32, Composer composer, final int i2, final int i3) {
        DismissState dismissState2;
        int i5;
        Modifier modifier2;
        int i7;
        Set set2;
        int i8;
        Function1 function12;
        Function3 function33;
        Function3 function34;
        final Modifier modifier3;
        final Set set3;
        final Function1 function13;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i9;
        Modifier modifier4;
        boolean z2;
        final Function1 function14;
        Composer composerKN = composer.KN(634380143);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            dismissState2 = dismissState;
        } else if ((i2 & 6) == 0) {
            dismissState2 = dismissState;
            i5 = (composerKN.p5(dismissState2) ? 4 : 2) | i2;
        } else {
            dismissState2 = dismissState;
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    set2 = set;
                    i5 |= composerKN.E2(set2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        function12 = function1;
                        i5 |= composerKN.E2(function12) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            function33 = function3;
                            i5 |= composerKN.E2(function33) ? 16384 : 8192;
                        }
                        if ((i3 & 32) == 0) {
                            if ((i2 & 196608) == 0) {
                                function34 = function32;
                                i5 |= composerKN.E2(function34) ? 131072 : 65536;
                            }
                            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                                composerKN.wTp();
                                modifier3 = modifier2;
                                set3 = set2;
                                function13 = function12;
                            } else {
                                if (i10 != 0) {
                                    modifier4 = Modifier.INSTANCE;
                                    i9 = i8;
                                } else {
                                    i9 = i8;
                                    modifier4 = modifier2;
                                }
                                final Set of = i7 != 0 ? SetsKt.setOf((Object[]) new DismissDirection[]{DismissDirection.f21816t, DismissDirection.f21815n}) : set2;
                                if (i9 != 0) {
                                    function14 = new Function1<DismissDirection, FixedThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final FixedThreshold invoke(DismissDirection dismissDirection) {
                                            return new FixedThreshold(SwipeToDismissKt.f23183n, null);
                                        }
                                    };
                                    z2 = true;
                                } else {
                                    z2 = true;
                                    function14 = function12;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(634380143, i5, -1, "androidx.compose.material.SwipeToDismiss (SwipeToDismiss.kt:166)");
                                }
                                final DismissState dismissState3 = dismissState2;
                                final Function3 function35 = function33;
                                final Function3 function36 = function34;
                                Set set4 = of;
                                BoxWithConstraintsKt.n(modifier4, null, false, ComposableLambdaKt.nr(338007641, z2, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                                        n(boxWithConstraintsScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, int i11) {
                                        BoxWithConstraintsScope boxWithConstraintsScope2;
                                        int i12;
                                        if ((i11 & 6) == 0) {
                                            boxWithConstraintsScope2 = boxWithConstraintsScope;
                                            i12 = i11 | (composer2.p5(boxWithConstraintsScope2) ? 4 : 2);
                                        } else {
                                            boxWithConstraintsScope2 = boxWithConstraintsScope;
                                            i12 = i11;
                                        }
                                        if (!composer2.HI((i12 & 19) != 18, i12 & 1)) {
                                            composer2.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(338007641, i12, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:167)");
                                        }
                                        float fQie = Constraints.qie(boxWithConstraintsScope2.getConstraints());
                                        boolean z3 = composer2.ty(CompositionLocalsKt.az()) == LayoutDirection.f34161t;
                                        Float fValueOf = Float.valueOf(0.0f);
                                        DismissValue dismissValue = DismissValue.f21822n;
                                        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(fValueOf, dismissValue));
                                        Set set5 = of;
                                        DismissDirection dismissDirection = DismissDirection.f21815n;
                                        if (set5.contains(dismissDirection)) {
                                            Pair pair = TuplesKt.to(Float.valueOf(fQie), DismissValue.f21824t);
                                            mapMutableMapOf.put(pair.getFirst(), pair.getSecond());
                                        }
                                        Set set6 = of;
                                        DismissDirection dismissDirection2 = DismissDirection.f21816t;
                                        if (set6.contains(dismissDirection2)) {
                                            Pair pair2 = TuplesKt.to(Float.valueOf(-fQie), DismissValue.f21821O);
                                            mapMutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                        }
                                        boolean zP5 = composer2.p5(function14);
                                        final Function1 function15 = function14;
                                        Object objIF = composer2.iF();
                                        if (zP5 || objIF == Composer.INSTANCE.n()) {
                                            objIF = new Function2<DismissValue, DismissValue, ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                                public final ThresholdConfig invoke(DismissValue dismissValue2, DismissValue dismissValue3) {
                                                    Function1 function16 = function15;
                                                    DismissDirection dismissDirectionNr = SwipeToDismissKt.nr(dismissValue2, dismissValue3);
                                                    Intrinsics.checkNotNull(dismissDirectionNr);
                                                    return (ThresholdConfig) function16.invoke(dismissDirectionNr);
                                                }
                                            };
                                            composer2.o(objIF);
                                        }
                                        Function2 function2 = (Function2) objIF;
                                        float f3 = of.contains(dismissDirection2) ? 10.0f : 20.0f;
                                        float f4 = of.contains(dismissDirection) ? 10.0f : 20.0f;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierJ2 = SwipeableKt.J2(companion, dismissState3, mapMutableMapOf, Orientation.f16970t, (288 & 8) != 0 ? true : dismissState3.ck() == dismissValue, (288 & 16) != 0 ? false : z3, (288 & 32) != 0 ? null : null, (288 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                            @Override // kotlin.jvm.functions.Function2
                                            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                            public final FixedThreshold invoke(Object obj, Object obj2) {
                                                return new FixedThreshold(Dp.KN(56), null);
                                            }
                                        } : function2, (288 & 128) != 0 ? SwipeableDefaults.nr(SwipeableDefaults.f23201n, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fQie, f3, f4), (288 & 256) != 0 ? SwipeableDefaults.f23201n.rl() : 0.0f);
                                        Function3 function37 = function35;
                                        final DismissState dismissState4 = dismissState3;
                                        Function3 function38 = function36;
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                                        int iN = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer2.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer2, modifierJ2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0 function0N = companion3.n();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer2.T();
                                        if (composer2.getInserting()) {
                                            composer2.s7N(function0N);
                                        } else {
                                            composer2.r();
                                        }
                                        Composer composerN = Updater.n(composer2);
                                        Updater.O(composerN, measurePolicyUo, companion3.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion3.O());
                                        Function2 function2Rl = companion3.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion3.nr());
                                        Modifier modifierO2 = BoxScopeInstance.f17448n.O(companion);
                                        Arrangement arrangement = Arrangement.f17400n;
                                        MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.qie(), composer2, 0);
                                        int iN2 = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
                                        Modifier modifierO3 = ComposedModifierKt.O(composer2, modifierO2);
                                        Function0 function0N2 = companion3.n();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer2.T();
                                        if (composer2.getInserting()) {
                                            composer2.s7N(function0N2);
                                        } else {
                                            composer2.r();
                                        }
                                        Composer composerN2 = Updater.n(composer2);
                                        Updater.O(composerN2, measurePolicyRl, companion3.t());
                                        Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                                        Function2 function2Rl2 = companion3.rl();
                                        if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                            composerN2.o(Integer.valueOf(iN2));
                                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                        }
                                        Updater.O(composerN2, modifierO3, companion3.nr());
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                        function37.invoke(rowScopeInstance, composer2, 6);
                                        composer2.XQ();
                                        boolean zP52 = composer2.p5(dismissState4);
                                        Object objIF2 = composer2.iF();
                                        if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                                            objIF2 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                                    return IntOffset.t(n(density));
                                                }

                                                public final long n(Density density) {
                                                    return IntOffsetKt.n(MathKt.roundToInt(((Number) dismissState4.Z().getValue()).floatValue()), 0);
                                                }
                                            };
                                            composer2.o(objIF2);
                                        }
                                        Modifier modifierN = OffsetKt.n(companion, (Function1) objIF2);
                                        MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), companion2.qie(), composer2, 0);
                                        int iN3 = ComposablesKt.n(composer2, 0);
                                        CompositionLocalMap compositionLocalMapIk3 = composer2.Ik();
                                        Modifier modifierO4 = ComposedModifierKt.O(composer2, modifierN);
                                        Function0 function0N3 = companion3.n();
                                        if (composer2.getApplier() == null) {
                                            ComposablesKt.t();
                                        }
                                        composer2.T();
                                        if (composer2.getInserting()) {
                                            composer2.s7N(function0N3);
                                        } else {
                                            composer2.r();
                                        }
                                        Composer composerN3 = Updater.n(composer2);
                                        Updater.O(composerN3, measurePolicyRl2, companion3.t());
                                        Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
                                        Function2 function2Rl3 = companion3.rl();
                                        if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                            composerN3.o(Integer.valueOf(iN3));
                                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                                        }
                                        Updater.O(composerN3, modifierO4, companion3.nr());
                                        function38.invoke(rowScopeInstance, composer2, 6);
                                        composer2.XQ();
                                        composer2.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i5 >> 3) & 14) | 3072, 6);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                set3 = set4;
                                modifier3 = modifier4;
                                function13 = function14;
                            }
                            scopeUpdateScopeGh = composerKN.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        n(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer2, int i11) {
                                        SwipeToDismissKt.n(dismissState, modifier3, set3, function13, function3, function32, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 196608;
                        function34 = function32;
                        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        }
                        scopeUpdateScopeGh = composerKN.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    function33 = function3;
                    if ((i3 & 32) == 0) {
                    }
                    function34 = function32;
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                    }
                    scopeUpdateScopeGh = composerKN.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                function12 = function1;
                if ((i3 & 16) == 0) {
                }
                function33 = function3;
                if ((i3 & 32) == 0) {
                }
                function34 = function32;
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            set2 = set;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            if ((i3 & 16) == 0) {
            }
            function33 = function3;
            if ((i3 & 32) == 0) {
            }
            function34 = function32;
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        set2 = set;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        if ((i3 & 16) == 0) {
        }
        function33 = function3;
        if ((i3 & 32) == 0) {
        }
        function34 = function32;
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
