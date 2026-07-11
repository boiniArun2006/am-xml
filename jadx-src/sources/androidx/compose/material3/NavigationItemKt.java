package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\u001aÍ\u0001\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00002\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0090\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00022\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a6\u0010.\u001a\u00020-*\u00020&2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020+H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001aV\u00101\u001a\u00020-*\u00020&2\u0006\u00100\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aF\u00103\u001a\u00020-*\u00020&2\u0006\u00100\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u001a\u00108\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107\"\u001a\u0010:\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b9\u00107\"\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006\u000e\u0010>\u001a\u00020=8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/runtime/Composable;", "icon", "Landroidx/compose/ui/text/TextStyle;", "labelTextStyle", "Landroidx/compose/ui/graphics/Shape;", "indicatorShape", "Landroidx/compose/ui/unit/Dp;", "indicatorWidth", "indicatorHorizontalPadding", "indicatorVerticalPadding", "indicatorToLabelVerticalPadding", "startIconToLabelHorizontalPadding", "topIconItemVerticalPadding", "Landroidx/compose/material3/NavigationItemColors;", "colors", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "label", "badge", "Landroidx/compose/material3/NavigationItemIconPosition;", "iconPosition", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Shape;FFFFFFLandroidx/compose/material3/NavigationItemColors;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/ui/graphics/Color;", "indicatorColor", "", "animationProgress", "rl", "(Landroidx/compose/foundation/interaction/InteractionSource;JLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;FFFFFLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "mUb", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "qie", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JFFF)Landroidx/compose/ui/layout/MeasureResult;", "gh", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "F", "getNavigationItemMinWidth", "()F", "NavigationItemMinWidth", "getNavigationItemMinHeight", "NavigationItemMinHeight", "t", "IndicatorVerticalOffset", "", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,731:1\n1223#2,6:732\n1223#2,6:738\n1223#2,6:777\n1223#2,6:783\n1223#2,6:824\n71#3,3:744\n74#3:775\n78#3:792\n71#3:830\n68#3,6:831\n74#3:865\n78#3:869\n71#3:870\n68#3,6:871\n74#3:905\n78#3:909\n78#4,6:747\n85#4,4:762\n89#4,2:772\n93#4:791\n78#4:793\n76#4,8:794\n85#4,4:811\n89#4,2:821\n78#4,6:837\n85#4,4:852\n89#4,2:862\n93#4:868\n78#4,6:877\n85#4,4:892\n89#4,2:902\n93#4:908\n93#4:912\n368#5,9:753\n377#5:774\n378#5,2:789\n368#5,9:802\n377#5:823\n368#5,9:843\n377#5:864\n378#5,2:866\n368#5,9:883\n377#5:904\n378#5,2:906\n378#5,2:910\n4032#6,6:766\n4032#6,6:815\n4032#6,6:856\n4032#6,6:896\n77#7:776\n50#8:913\n50#8:914\n75#9:915\n108#9,2:916\n148#10:918\n*S KotlinDebug\n*F\n+ 1 NavigationItem.kt\nandroidx/compose/material3/NavigationItemKt\n*L\n282#1:732,6\n295#1:738,6\n319#1:777,6\n331#1:783,6\n370#1:824,6\n284#1:744,3\n284#1:775\n284#1:792\n376#1:830\n376#1:831,6\n376#1:865\n376#1:869\n378#1:870\n378#1:871,6\n378#1:905\n378#1:909\n284#1:747,6\n284#1:762,4\n284#1:772,2\n284#1:791\n357#1:793\n357#1:794,8\n357#1:811,4\n357#1:821,2\n376#1:837,6\n376#1:852,4\n376#1:862,2\n376#1:868\n378#1:877,6\n378#1:892,4\n378#1:902,2\n378#1:908\n357#1:912\n284#1:753,9\n284#1:774\n284#1:789,2\n357#1:802,9\n357#1:823\n376#1:843,9\n376#1:864\n376#1:866,2\n378#1:883,9\n378#1:904\n378#1:906,2\n357#1:910,2\n284#1:766,6\n357#1:815,6\n376#1:856,6\n378#1:896,6\n311#1:776\n657#1:913\n666#1:914\n282#1:915\n282#1:916,2\n730#1:918\n*E\n"})
public final class NavigationItemKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26666n = NavigationRailKt.qie();
    private static final float rl = NavigationRailKt.gh();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26667t = Dp.KN(12);

    public static final void n(final boolean z2, final Function0 function0, final Function2 function2, final TextStyle textStyle, final Shape shape, final float f3, final float f4, final float f5, final float f6, final float f7, final float f8, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z3, final Function2 function22, final Function2 function23, final int i2, MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i5) {
        int i7;
        Function2 function24;
        int i8;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        InteractionSource interactionSource;
        Composer composer2;
        Composer composerKN = composer.KN(547979956);
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.n(z2) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function24 = function2;
            i7 |= composerKN.E2(function24) ? 256 : 128;
        } else {
            function24 = function2;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.p5(textStyle) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= composerKN.p5(shape) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i7 |= composerKN.rl(f3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= composerKN.rl(f4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= composerKN.rl(f5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= composerKN.rl(f6) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i7 |= composerKN.rl(f7) ? 536870912 : 268435456;
        }
        int i9 = i7;
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerKN.rl(f8) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= composerKN.p5(navigationItemColors) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= composerKN.n(z3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= composerKN.E2(function22) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i8 |= composerKN.E2(function23) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i8 |= composerKN.t(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i8 |= composerKN.p5(mutableInteractionSource) ? 8388608 : 4194304;
        }
        int i10 = i8;
        if ((i9 & 306783379) == 306783378 && (4793491 & i10) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
            mutableInteractionSource2 = mutableInteractionSource;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(547979956, i9, i10, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            final Function2 function25 = function24;
            final ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-44329638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i11) {
                    if ((i11 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-44329638, i11, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:255)");
                    }
                    long jRl = navigationItemColors.rl(z2, z3);
                    Modifier modifierN = function22 != null ? SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1.1
                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            n(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }) : Modifier.INSTANCE;
                    Function2 function26 = function25;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    int iN = ComposablesKt.n(composer3, 0);
                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer3.T();
                    if (composer3.getInserting()) {
                        composer3.s7N(function0N);
                    } else {
                        composer3.r();
                    }
                    Composer composerN = Updater.n(composer3);
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(jRl)), function26, composer3, ProvidedValue.xMQ);
                    composer3.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54);
            composerKN.eF(-1735402128);
            if (function23 != null) {
                composableLambdaNr = ComposableLambdaKt.nr(1836184859, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i11) {
                        if ((i11 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(1836184859, i11, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                        }
                        final Function2 function26 = function23;
                        ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(870803363, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                n(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(BoxScope boxScope, Composer composer4, int i12) {
                                if ((i12 & 17) == 16 && composer4.xMQ()) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(870803363, i12, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function26.invoke(composer4, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, 54);
                        final Function2 function27 = composableLambdaNr;
                        BadgeKt.rl(composableLambdaNr2, null, ComposableLambdaKt.nr(-1365557663, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                n(boxScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(BoxScope boxScope, Composer composer4, int i12) {
                                if ((i12 & 17) == 16 && composer4.xMQ()) {
                                    composer4.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(-1365557663, i12, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function27.invoke(composer4, 6);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composer3, 54), composer3, 390, 2);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54);
            }
            ComposableLambda composableLambda = composableLambdaNr;
            composerKN.Xw();
            composerKN.eF(-1735395524);
            ComposableLambda composableLambdaNr2 = null;
            if (function22 == null) {
                z4 = true;
            } else {
                z4 = true;
                composableLambdaNr2 = ComposableLambdaKt.nr(-254668050, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i11) {
                        if ((i11 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-254668050, i11, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                        }
                        ProvideContentColorTextStyleKt.n(navigationItemColors.t(z2, z3), textStyle, function22, composer3, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54);
            }
            ComposableLambda composableLambda2 = composableLambdaNr2;
            composerKN.Xw();
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotIntStateKt.n(0);
                composerKN.o(objIF);
            }
            final MutableIntState mutableIntState = (MutableIntState) objIF;
            mutableInteractionSource2 = mutableInteractionSource;
            Modifier modifierN = SizeKt.n(SelectableKt.n(modifier, z2, mutableInteractionSource2, null, z3, Role.mUb(Role.INSTANCE.KN()), function0), f26666n, rl);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        n(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(long j2) {
                        NavigationItemKt.nr(mutableIntState, IntSize.Uo(j2));
                    }
                };
                composerKN.o(objIF2);
            }
            Modifier modifierN2 = OnRemeasuredModifierKt.n(modifierN, (Function1) objIF2);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), z4);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, AnimationSpecKt.ty(100, 0, null, 6, null), 0.0f, null, null, composerKN, 48, 28);
            composerKN.eF(-1634400795);
            if (NavigationItemIconPosition.nr(i2, NavigationItemIconPosition.INSTANCE.n())) {
                long jN = OffsetKt.n((t(mutableIntState) - r1.How(f3)) / 2, ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(f26667t));
                Unit unit = Unit.INSTANCE;
                boolean zNr = ((i10 & 29360128) == 8388608) | composerKN.nr(jN);
                Object objIF3 = composerKN.iF();
                if (zNr || objIF3 == companion.n()) {
                    objIF3 = new MappedInteractionSource(mutableInteractionSource2, jN, null);
                    composerKN.o(objIF3);
                }
                interactionSource = (MappedInteractionSource) objIF3;
            } else {
                interactionSource = null;
            }
            composerKN.Xw();
            if (interactionSource == null) {
                interactionSource = mutableInteractionSource2;
            }
            long selectedIndicatorColor = navigationItemColors.getSelectedIndicatorColor();
            boolean zP5 = composerKN.p5(stateNr);
            Object objIF4 = composerKN.iF();
            if (zP5 || objIF4 == companion.n()) {
                objIF4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$2$3$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Float invoke() {
                        return (Float) stateNr.getValue();
                    }
                };
                composerKN.o(objIF4);
            }
            int i11 = i9 << 3;
            rl(interactionSource, selectedIndicatorColor, shape, composableLambda, i2, composableLambda2, (Function0) objIF4, f4, f5, f6, f7, f8, composerKN, ((i9 >> 6) & 896) | ((i10 >> 6) & 57344) | (i11 & 29360128) | (234881024 & i11) | (i11 & 1879048192), ((i9 >> 27) & 14) | ((i10 << 3) & 112));
            composer2 = composerKN;
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i12) {
                    NavigationItemKt.n(z2, function0, function2, textStyle, shape, f3, f4, f5, f6, f7, f8, navigationItemColors, modifier, z3, function22, function23, i2, mutableInteractionSource3, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult gh(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, float f3) {
        int iUo = ConstraintsKt.Uo(j2, placeable3.getWidth());
        int iJ2 = ConstraintsKt.J2(j2, placeable3.getHeight());
        final int width = (iUo - placeable4.getWidth()) / 2;
        final int height = (iJ2 - placeable4.getHeight()) / 2;
        final int height2 = (iJ2 - placeable2.getHeight()) / 2;
        final int height3 = (iJ2 - placeable.getHeight()) / 2;
        final int width2 = (iUo - ((placeable2.getWidth() + measureScope.How(f3)) + placeable.getWidth())) / 2;
        final int width3 = placeable2.getWidth() + width2 + measureScope.How(f3);
        final int width4 = (iUo - placeable3.getWidth()) / 2;
        final int height4 = (iJ2 - placeable3.getHeight()) / 2;
        return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.az(placementScope, placeable4, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable, width3, height3, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable2, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable3, width4, height4, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult mUb(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        int iUo = ConstraintsKt.Uo(j2, placeable2.getWidth());
        int iJ2 = ConstraintsKt.J2(j2, placeable2.getHeight());
        final int width = (iUo - placeable3.getWidth()) / 2;
        final int height = (iJ2 - placeable3.getHeight()) / 2;
        final int width2 = (iUo - placeable.getWidth()) / 2;
        final int height2 = (iJ2 - placeable.getHeight()) / 2;
        final int width3 = (iUo - placeable2.getWidth()) / 2;
        final int height3 = (iJ2 - placeable2.getHeight()) / 2;
        return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.az(placementScope, placeable3, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable2, width3, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult qie(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, float f3, float f4, float f5) {
        int iUo = ConstraintsKt.Uo(j2, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int iJ2 = ConstraintsKt.J2(j2, MathKt.roundToInt(placeable3.getHeight() + measureScope.l(f3) + placeable.getHeight() + (measureScope.l(f5) * 2)));
        final int iHow = measureScope.How(Dp.KN(f5 + f4));
        final int width = (iUo - placeable2.getWidth()) / 2;
        final int width2 = (iUo - placeable4.getWidth()) / 2;
        final int iHow2 = iHow - measureScope.How(f4);
        final int width3 = (iUo - placeable.getWidth()) / 2;
        final int height = iHow + placeable2.getHeight() + measureScope.How(Dp.KN(f3 + f4));
        final int width4 = (iUo - placeable3.getWidth()) / 2;
        return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.az(placementScope, placeable4, width2, iHow2, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable, width3, height, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable2, width, iHow, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope, placeable3, width4, iHow2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v29 */
    public static final void rl(final InteractionSource interactionSource, final long j2, final Shape shape, final Function2 function2, final int i2, final Function2 function22, Function0 function0, final float f3, final float f4, final float f5, final float f6, final float f7, Composer composer, final int i3, final int i5) {
        int i7;
        int i8;
        ?? r02;
        int i9;
        Object topIconOrIconOnlyMeasurePolicy;
        Composer composer2;
        final Function0 function02;
        Composer composerKN = composer.KN(1757687417);
        if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(interactionSource) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(shape) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= composerKN.t(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i7 |= composerKN.E2(function22) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 |= composerKN.E2(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= composerKN.rl(f3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= composerKN.rl(f4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i7 |= composerKN.rl(f5) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (composerKN.rl(f6) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= composerKN.rl(f7) ? 32 : 16;
        }
        int i10 = i8;
        if ((i7 & 306783379) == 306783378 && (i10 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            function02 = function0;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1757687417, i7, i10, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if (function22 == null || NavigationItemIconPosition.nr(i2, NavigationItemIconPosition.INSTANCE.n())) {
                r02 = 0;
                i9 = i7;
                composer2 = composerKN;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(function22 != null, function0, f3, f4, f5, f7, null);
                function02 = function0;
            } else {
                r02 = 0;
                i9 = i7;
                function02 = function0;
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(function02, f3, f4, f6, null);
                composer2 = composerKN;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int iN = ComposablesKt.n(composer2, r02);
            CompositionLocalMap compositionLocalMapIk = composer2.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, topIconOrIconOnlyMeasurePolicy, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            composerKN = composer2;
            BoxKt.n(IndicationKt.rl(ClipKt.n(LayoutIdKt.rl(companion, "indicatorRipple"), shape), interactionSource, RippleKt.nr(false, 0.0f, 0L, composerKN, 0, 7)), composerKN, r02);
            Modifier modifierRl = LayoutIdKt.rl(companion, "indicator");
            ?? r10 = (i9 & 3670016) == 1048576 ? 1 : r02;
            Object objIF = composerKN.iF();
            if (r10 != 0 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        n(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.rl(((Number) function02.invoke()).floatValue());
                    }
                };
                composerKN.o(objIF);
            }
            BoxKt.n(BackgroundKt.t(GraphicsLayerModifierKt.n(modifierRl, (Function1) objIF), j2, shape), composerKN, r02);
            Modifier modifierRl2 = LayoutIdKt.rl(companion, "icon");
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), r02);
            int iN2 = ComposablesKt.n(composerKN, r02);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl2);
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyUo, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf((i9 >> 9) & 14));
            composerKN.XQ();
            composerKN.eF(-776741606);
            if (function22 != null) {
                Modifier modifierRl3 = LayoutIdKt.rl(companion, "label");
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl3);
                Function0 function0N3 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N3);
                } else {
                    composerKN.r();
                }
                Composer composerN3 = Updater.n(composerKN);
                Updater.O(composerN3, measurePolicyUo2, companion2.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
                Function2 function2Rl3 = companion2.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion2.nr());
                function22.invoke(composerKN, Integer.valueOf((i9 >> 15) & 14));
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            final Function0 function03 = function02;
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i11) {
                    NavigationItemKt.rl(interactionSource, j2, shape, function2, i2, function22, function03, f3, f4, f5, f6, f7, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    private static final int t(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }
}
