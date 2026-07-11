package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationBarTokens;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\u001ab\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0087\u0001\u0010\u001d\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001as\u0010#\u001a\u00020\u000b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0002\b\f2\u0006\u0010\u0018\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0003¢\u0006\u0004\b#\u0010$\u001a8\u0010-\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aP\u00100\u001a\u00020,*\u00020%2\u0006\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102\"\u001a\u00106\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b4\u00105\"\u001a\u00109\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00105\"\u0014\u0010;\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00102\"\u001a\u0010=\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b<\u00105\"\u0014\u0010?\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D²\u0006\f\u0010@\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010C\u001a\u00020B8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationBarItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationBarItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "indicatorRipple", "indicator", "", "animationProgress", "O", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "ty", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "HI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "F", "NavigationBarHeight", "az", "()F", "NavigationBarItemHorizontalPadding", "t", "getNavigationBarIndicatorToLabelPadding", "NavigationBarIndicatorToLabelPadding", "nr", "IndicatorHorizontalPadding", "qie", "IndicatorVerticalPadding", "J2", "IndicatorVerticalOffset", "iconColor", "textColor", "", "itemWidth", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,717:1\n1223#2,6:718\n1223#2,6:724\n1223#2,6:730\n1223#2,6:769\n1223#2,6:775\n1223#2,6:785\n1223#2,6:862\n71#3,3:736\n74#3:767\n78#3:784\n71#3:822\n68#3,6:823\n74#3:857\n78#3:861\n71#3:868\n68#3,6:869\n74#3:903\n78#3:907\n78#4,6:739\n85#4,4:754\n89#4,2:764\n93#4:783\n78#4:791\n76#4,8:792\n85#4,4:809\n89#4,2:819\n78#4,6:829\n85#4,4:844\n89#4,2:854\n93#4:860\n78#4,6:875\n85#4,4:890\n89#4,2:900\n93#4:906\n93#4:910\n368#5,9:745\n377#5:766\n378#5,2:781\n368#5,9:800\n377#5:821\n368#5,9:835\n377#5:856\n378#5,2:858\n368#5,9:881\n377#5:902\n378#5,2:904\n378#5,2:908\n4032#6,6:758\n4032#6,6:813\n4032#6,6:848\n4032#6,6:894\n77#7:768\n75#8:911\n108#8,2:912\n148#9:914\n148#9:915\n148#9:920\n56#10:916\n71#10:917\n56#10:918\n71#10:919\n*S KotlinDebug\n*F\n+ 1 NavigationBar.kt\nandroidx/compose/material3/NavigationBarKt\n*L\n183#1:718,6\n215#1:724,6\n229#1:730,6\n249#1:769,6\n281#1:775,6\n532#1:785,6\n525#1:862,6\n217#1:736,3\n217#1:767\n217#1:784\n521#1:822\n521#1:823,6\n521#1:857\n521#1:861\n524#1:868\n524#1:869,6\n524#1:903\n524#1:907\n217#1:739,6\n217#1:754,4\n217#1:764,2\n217#1:783\n517#1:791\n517#1:792,8\n517#1:809,4\n517#1:819,2\n521#1:829,6\n521#1:844,4\n521#1:854,2\n521#1:860\n524#1:875,6\n524#1:890,4\n524#1:900,2\n524#1:906\n517#1:910\n217#1:745,9\n217#1:766\n217#1:781,2\n517#1:800,9\n517#1:821\n521#1:835,9\n521#1:856\n521#1:858,2\n524#1:881,9\n524#1:902\n524#1:904,2\n517#1:908,2\n217#1:758,6\n517#1:813,6\n521#1:848,6\n524#1:894,6\n243#1:768\n215#1:911\n215#1:912,2\n704#1:914\n707#1:915\n716#1:920\n710#1:916\n710#1:917\n714#1:918\n714#1:919\n*E\n"})
public final class NavigationBarKt {
    private static final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f26411O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26412n;
    private static final float nr;
    private static final float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26413t;

    static {
        NavigationBarTokens navigationBarTokens = NavigationBarTokens.f29700n;
        f26412n = navigationBarTokens.KN();
        rl = Dp.KN(8);
        f26413t = Dp.KN(4);
        float f3 = 2;
        nr = Dp.KN(Dp.KN(navigationBarTokens.O() - navigationBarTokens.xMQ()) / f3);
        f26411O = Dp.KN(Dp.KN(navigationBarTokens.t() - navigationBarTokens.xMQ()) / f3);
        J2 = Dp.KN(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult HI(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, final boolean z2, final float f3) {
        float height = placeable2.getHeight();
        float f4 = f26411O;
        float fL = height + measureScope.l(f4);
        float f5 = f26413t;
        float fL2 = fL + measureScope.l(f5) + placeable.getHeight();
        float f6 = 2;
        final float fCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.az(j2) - fL2) / f6, measureScope.l(f4));
        float f7 = fL2 + (fCoerceAtLeast * f6);
        final float height2 = ((z2 ? fCoerceAtLeast : (f7 - placeable2.getHeight()) / f6) - fCoerceAtLeast) * (1 - f3);
        final float height3 = placeable2.getHeight() + fCoerceAtLeast + measureScope.l(f4) + measureScope.l(f5);
        final int iQie = Constraints.qie(j2);
        final int width = (iQie - placeable.getWidth()) / 2;
        final int width2 = (iQie - placeable2.getWidth()) / 2;
        final int width3 = (iQie - placeable3.getWidth()) / 2;
        final float fL3 = fCoerceAtLeast - measureScope.l(f4);
        return MeasureScope.ER(measureScope, iQie, MathKt.roundToInt(f7), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
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
                Placeable.PlacementScope placementScope2;
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i2 = iQie;
                    float f8 = fCoerceAtLeast;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.az(placementScope, placeable5, (i2 - placeable5.getWidth()) / 2, MathKt.roundToInt((f8 - measureScope2.How(NavigationBarKt.qie())) + height2), 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                if (z2 || f3 != 0.0f) {
                    Placeable.PlacementScope.az(placementScope2, placeable, width, MathKt.roundToInt(height3 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.az(placementScope2, placeable2, width2, MathKt.roundToInt(fCoerceAtLeast + height2), 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope2, placeable3, width3, MathKt.roundToInt(fL3 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final boolean z2, final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1427075886);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function23) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function24) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.n(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function0) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1427075886, i3, -1, "androidx.compose.material3.NavigationBarItemLayout (NavigationBar.kt:515)");
            }
            int i5 = 458752 & i3;
            int i7 = 57344 & i3;
            boolean z3 = ((i3 & 7168) == 2048) | (i5 == 131072) | (i7 == 16384);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        Object obj;
                        Placeable placeableDR0;
                        MeasureScope measureScope2 = measureScope;
                        float fFloatValue = ((Number) function0.invoke()).floatValue();
                        long jNr = Constraints.nr(j2, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Measurable measurable = (Measurable) list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "icon")) {
                                Placeable placeableDR02 = measurable.dR0(jNr);
                                float f3 = 2;
                                int width = placeableDR02.getWidth() + measureScope2.How(Dp.KN(NavigationBarKt.nr * f3));
                                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                                int height = placeableDR02.getHeight() + measureScope2.How(Dp.KN(NavigationBarKt.qie() * f3));
                                int size2 = list.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    Measurable measurable2 = (Measurable) list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "indicatorRipple")) {
                                        Placeable placeableDR03 = measurable2.dR0(Constraints.INSTANCE.t(width, height));
                                        int size3 = list.size();
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= size3) {
                                                obj = null;
                                                break;
                                            }
                                            obj = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "indicator")) {
                                                break;
                                            }
                                            i10++;
                                        }
                                        Measurable measurable3 = (Measurable) obj;
                                        Placeable placeableDR04 = measurable3 != null ? measurable3.dR0(Constraints.INSTANCE.t(iRoundToInt, height)) : null;
                                        if (function24 != null) {
                                            int size4 = list.size();
                                            for (int i11 = 0; i11 < size4; i11++) {
                                                Measurable measurable4 = (Measurable) list.get(i11);
                                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable4), "label")) {
                                                    placeableDR0 = measurable4.dR0(jNr);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableDR0 = null;
                                        if (function24 == null) {
                                            return NavigationBarKt.ty(measureScope2, placeableDR02, placeableDR03, placeableDR04, j2);
                                        }
                                        Intrinsics.checkNotNull(placeableDR0);
                                        return NavigationBarKt.HI(measureScope, placeableDR0, placeableDR02, placeableDR03, placeableDR04, j2, z2, fFloatValue);
                                    }
                                    i9++;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i8++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
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
            Updater.O(composerN, measurePolicy, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            function2.invoke(composerKN, Integer.valueOf(i3 & 14));
            function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
            Modifier modifierRl = LayoutIdKt.rl(companion, "icon");
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
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
            function23.invoke(composerKN, Integer.valueOf((i3 >> 6) & 14));
            composerKN.XQ();
            composerKN.eF(1087196576);
            if (function24 != null) {
                Modifier modifierRl2 = LayoutIdKt.rl(companion, "label");
                boolean z4 = (i7 == 16384) | (i5 == 131072);
                Object objIF2 = composerKN.iF();
                if (z4 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            n(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        public final void n(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.rl(z2 ? 1.0f : ((Number) function0.invoke()).floatValue());
                        }
                    };
                    composerKN.o(objIF2);
                }
                Modifier modifierN = GraphicsLayerModifierKt.n(modifierRl2, (Function1) objIF2);
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierN);
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
                function24.invoke(composerKN, Integer.valueOf((i3 >> 9) & 14));
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    NavigationBarKt.O(function2, function22, function23, function24, z2, function0, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final float az() {
        return rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, float f3, WindowInsets windowInsets, final Function3 function3, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jN;
        long jRl;
        float fRl;
        WindowInsets windowInsets2;
        long j4;
        float f4;
        final WindowInsets windowInsetsT;
        Modifier modifier3;
        Composer composer2;
        final WindowInsets windowInsets3;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final float f5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1596802123);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                jN = j2;
                int i8 = composerKN.nr(jN) ? 32 : 16;
                i5 |= i8;
            } else {
                jN = j2;
            }
            i5 |= i8;
        } else {
            jN = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            jRl = j3;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(jRl)) ? 256 : 128;
        } else {
            jRl = j3;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                fRl = f3;
                i5 |= composerKN.rl(fRl) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    windowInsets2 = windowInsets;
                    int i10 = composerKN.p5(windowInsets2) ? 16384 : 8192;
                    i5 |= i10;
                } else {
                    windowInsets2 = windowInsets;
                }
                i5 |= i10;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerKN.E2(function3) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jN = NavigationBarDefaults.f26406n.n(composerKN, 6);
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        jRl = ColorSchemeKt.rl(MaterialTheme.f26164n.n(composerKN, 6), jN);
                        i5 &= -897;
                    }
                    if (i9 != 0) {
                        fRl = NavigationBarDefaults.f26406n.rl();
                    }
                    if ((i3 & 16) == 0) {
                        windowInsetsT = NavigationBarDefaults.f26406n.t(composerKN, 6);
                        i5 &= -57345;
                        j4 = jRl;
                        f4 = fRl;
                    } else {
                        j4 = jRl;
                        f4 = fRl;
                        windowInsetsT = windowInsets2;
                    }
                    modifier3 = modifier5;
                } else {
                    composerKN.wTp();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    j4 = jRl;
                    f4 = fRl;
                    modifier3 = modifier2;
                    windowInsetsT = windowInsets2;
                }
                long j7 = jN;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(1596802123, i5, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:115)");
                }
                int i11 = i5 << 3;
                composer2 = composerKN;
                SurfaceKt.n(modifier3, null, j7, j4, f4, 0.0f, null, ComposableLambdaKt.nr(105663120, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                        if ((i12 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(105663120, i12, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:122)");
                        }
                        Modifier modifierN = SelectableGroupKt.n(SizeKt.rl(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsetsT), 0.0f, NavigationBarKt.f26412n, 1, null));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(NavigationBarKt.az());
                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                        Function3 function32 = function3;
                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, verticalXMQ, composer3, 54);
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
                        Updater.O(composerN, measurePolicyRl, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        Function2 function2Rl = companion.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, (i5 & 14) | 12582912 | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 98);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                windowInsets3 = windowInsetsT;
                modifier4 = modifier3;
                j5 = j7;
                j6 = j4;
                f5 = f4;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier4 = modifier2;
                j5 = jN;
                j6 = jRl;
                f5 = fRl;
                windowInsets3 = windowInsets2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$2
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
                        NavigationBarKt.n(modifier4, j5, j6, f5, windowInsets3, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        fRl = f3;
        if ((i2 & 24576) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((74899 & i5) == 74898) {
            composerKN.e();
            if ((i2 & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i3 & 2) != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 16) == 0) {
                }
                modifier3 = modifier5;
                long j72 = jN;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                int i112 = i5 << 3;
                composer2 = composerKN;
                SurfaceKt.n(modifier3, null, j72, j4, f4, 0.0f, null, ComposableLambdaKt.nr(105663120, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                        if ((i12 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(105663120, i12, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:122)");
                        }
                        Modifier modifierN = SelectableGroupKt.n(SizeKt.rl(WindowInsetsPaddingKt.nr(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), windowInsetsT), 0.0f, NavigationBarKt.f26412n, 1, null));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(NavigationBarKt.az());
                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                        Function3 function32 = function3;
                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, verticalXMQ, composer3, 54);
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
                        Updater.O(composerN, measurePolicyRl, companion.t());
                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                        Function2 function2Rl = companion.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion.nr());
                        function32.invoke(RowScopeInstance.f17780n, composer3, 6);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, (i5 & 14) | 12582912 | (i112 & 896) | (i112 & 7168) | (i112 & 57344), 98);
                if (ComposerKt.v()) {
                }
                windowInsets3 = windowInsetsT;
                modifier4 = modifier3;
                j5 = j72;
                j6 = j4;
                f5 = f4;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float qie() {
        return f26411O;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final RowScope rowScope, final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, boolean z4, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        RowScope rowScope2;
        int i5;
        Function2 function23;
        int i7;
        Modifier modifier2;
        int i8;
        final boolean z5;
        int i9;
        Function2 function24;
        int i10;
        boolean z6;
        boolean z7;
        final NavigationBarItemColors navigationBarItemColorsN;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z9;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        Object objIF;
        Composer.Companion companion;
        MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        Object objIF2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final State stateNr;
        long jN;
        boolean zP5;
        Object objIF3;
        boolean zP52;
        Object objIF4;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource5;
        final NavigationBarItemColors navigationBarItemColors2;
        final boolean z10;
        final boolean z11;
        final Function2 function25;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-663510974);
        if ((Integer.MIN_VALUE & i3) != 0) {
            i5 = i2 | 6;
            rowScope2 = rowScope;
        } else if ((i2 & 6) == 0) {
            rowScope2 = rowScope;
            i5 = (composerKN.p5(rowScope2) ? 4 : 2) | i2;
        } else {
            rowScope2 = rowScope;
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function0) ? 256 : 128;
            }
            if ((4 & i3) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function23 = function2;
                    i5 |= composerKN.E2(function23) ? 2048 : 1024;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i5 |= 24576;
                    modifier2 = modifier;
                } else if ((i2 & 24576) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
                } else {
                    modifier2 = modifier;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 196608;
                    z5 = z3;
                } else {
                    z5 = z3;
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.n(z5) ? 131072 : 65536;
                    }
                    i9 = i3 & 32;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function24 = function22;
                    } else {
                        function24 = function22;
                        if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.E2(function24) ? 1048576 : 524288;
                        }
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        if ((i2 & 12582912) == 0) {
                            z6 = true;
                            z7 = z4;
                            i5 |= composerKN.n(z7) ? 8388608 : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & 128) == 0) {
                                navigationBarItemColorsN = navigationBarItemColors;
                                int i13 = composerKN.p5(navigationBarItemColorsN) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                                i5 |= i13;
                            } else {
                                navigationBarItemColorsN = navigationBarItemColors;
                            }
                            i5 |= i13;
                        } else {
                            navigationBarItemColorsN = navigationBarItemColors;
                        }
                        i11 = 256 & i3;
                        if (i11 != 0) {
                            i5 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                i5 |= composerKN.p5(mutableInteractionSource2) ? 536870912 : 268435456;
                            }
                        }
                        if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
                            composerKN.wTp();
                            mutableInteractionSource5 = mutableInteractionSource2;
                            composer2 = composerKN;
                            function25 = function24;
                            z10 = z5;
                            navigationBarItemColors2 = navigationBarItemColorsN;
                            z11 = z7;
                            modifier4 = modifier2;
                        } else {
                            composerKN.e();
                            if ((i2 & 1) != 0 || composerKN.rV9()) {
                                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i8 != 0) {
                                    z5 = z6;
                                }
                                if (i9 != 0) {
                                    function24 = null;
                                }
                                if (i10 != 0) {
                                    z7 = z6;
                                }
                                if ((128 & i3) != 0) {
                                    i5 &= -234881025;
                                    navigationBarItemColorsN = NavigationBarItemDefaults.f26410n.n(composerKN, 6);
                                }
                                z9 = z7;
                                i12 = i5;
                                if (i11 != 0) {
                                    mutableInteractionSource2 = null;
                                }
                            } else {
                                composerKN.wTp();
                                if ((128 & i3) != 0) {
                                    i5 &= -234881025;
                                }
                                modifier3 = modifier2;
                                z9 = z7;
                                i12 = i5;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-663510974, i12, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:180)");
                            }
                            composerKN.eF(-103236853);
                            if (mutableInteractionSource2 != null) {
                                Object objIF5 = composerKN.iF();
                                if (objIF5 == Composer.INSTANCE.n()) {
                                    objIF5 = InteractionSourceKt.n();
                                    composerKN.o(objIF5);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) objIF5;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            composerKN.Xw();
                            final boolean z12 = z5;
                            final Function2 function26 = function23;
                            final NavigationBarItemColors navigationBarItemColors3 = navigationBarItemColorsN;
                            final Function2 function27 = function24;
                            final boolean z13 = z9;
                            Modifier modifier5 = modifier3;
                            boolean z14 = z6;
                            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1419576100, z14, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i14) {
                                    if ((i14 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1419576100, i14, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:185)");
                                    }
                                    State stateN = SingleValueAnimationKt.n(navigationBarItemColors3.rl(z2, z12), AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer3, 48, 12);
                                    Modifier modifierN = (function27 == null || !(z13 || z2)) ? Modifier.INSTANCE : SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
                                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            n(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    Function2 function28 = function26;
                                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                    int iN2 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, modifierN);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0 function0N = companion2.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN2 = Updater.n(composer3);
                                    Updater.O(composerN2, measurePolicyUo, companion2.t());
                                    Updater.O(composerN2, compositionLocalMapIk, companion2.O());
                                    Function2 function2Rl2 = companion2.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO, companion2.nr());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                                    CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(rl(stateN))), function28, composer3, ProvidedValue.xMQ);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }

                                private static final long rl(State state) {
                                    return ((Color) state.getValue()).getValue();
                                }
                            }, composerKN, 54);
                            composerKN.eF(-103210706);
                            ComposableLambda composableLambdaNr2 = function27 != null ? null : ComposableLambdaKt.nr(1644987592, z14, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i14) {
                                    if ((i14 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1644987592, i14, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:200)");
                                    }
                                    ProvideContentColorTextStyleKt.n(rl(SingleValueAnimationKt.n(navigationBarItemColorsN.t(z2, z5), AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer3, 48, 12)), TypographyKt.t(NavigationBarTokens.f29700n.qie(), composer3, 6), function27, composer3, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }

                                private static final long rl(State state) {
                                    return ((Color) state.getValue()).getValue();
                                }
                            }, composerKN, 54);
                            composerKN.Xw();
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                objIF = SnapshotIntStateKt.n(0);
                                composerKN.o(objIF);
                            }
                            final MutableIntState mutableIntState = (MutableIntState) objIF;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier5;
                            ComposableLambda composableLambda = composableLambdaNr2;
                            int i14 = i12;
                            boolean z15 = z5;
                            Modifier modifierRl = RowScope.rl(rowScope2, SizeKt.rl(SelectableKt.n(modifier5, z2, mutableInteractionSource4, null, z5, Role.mUb(Role.INSTANCE.KN()), function0), 0.0f, f26412n, 1, null), 1.0f, false, 2, null);
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                                objIF2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                                        n(intSize.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(long j2) {
                                        NavigationBarKt.nr(mutableIntState, IntSize.Uo(j2));
                                    }
                                };
                                composerKN.o(objIF2);
                            }
                            Modifier modifierN = OnRemeasuredModifierKt.n(modifierRl, (Function1) objIF2);
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), true);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0 function0N = companion2.n();
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
                            Updater.O(composerN, measurePolicyUo, companion2.t());
                            Updater.O(composerN, compositionLocalMapIk, companion2.O());
                            function2Rl = companion2.rl();
                            if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                            }
                            Updater.O(composerN, modifierO, companion2.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            stateNr = AnimateAsStateKt.nr(!z2 ? 1.0f : 0.0f, AnimationSpecKt.ty(100, 0, null, 6, null), 0.0f, null, null, composerKN, 48, 28);
                            jN = OffsetKt.n((t(mutableIntState) - r10.How(NavigationBarTokens.f29700n.O())) / 2, ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(J2));
                            Unit unit = Unit.INSTANCE;
                            zP5 = composerKN.p5(mutableInteractionSource4) | composerKN.nr(jN);
                            objIF3 = composerKN.iF();
                            if (!zP5 || objIF3 == companion.n()) {
                                objIF3 = new MappedInteractionSource(mutableInteractionSource4, jN, null);
                                composerKN.o(objIF3);
                            }
                            final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objIF3;
                            ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(691730997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicatorRipple$1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i15) {
                                    if ((i15 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(691730997, i15, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:256)");
                                    }
                                    BoxKt.n(IndicationKt.rl(ClipKt.n(LayoutIdKt.rl(Modifier.INSTANCE, "indicatorRipple"), ShapesKt.O(NavigationBarTokens.f29700n.nr(), composer3, 6)), mappedInteractionSource, RippleKt.nr(false, 0.0f, 0L, composer3, 0, 7)), composer3, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54);
                            ComposableLambda composableLambdaNr4 = ComposableLambdaKt.nr(-474426875, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i15) {
                                    if ((i15 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-474426875, i15, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:264)");
                                    }
                                    Modifier modifierRl2 = LayoutIdKt.rl(Modifier.INSTANCE, "indicator");
                                    boolean zP53 = composer3.p5(stateNr);
                                    final State state = stateNr;
                                    Object objIF6 = composer3.iF();
                                    if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                                        objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                n(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                graphicsLayerScope.rl(((Number) state.getValue()).floatValue());
                                            }
                                        };
                                        composer3.o(objIF6);
                                    }
                                    BoxKt.n(BackgroundKt.t(GraphicsLayerModifierKt.n(modifierRl2, (Function1) objIF6), navigationBarItemColorsN.getSelectedIndicatorColor(), ShapesKt.O(NavigationBarTokens.f29700n.nr(), composer3, 6)), composer3, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54);
                            zP52 = composerKN.p5(stateNr);
                            objIF4 = composerKN.iF();
                            if (!zP52 || objIF4 == companion.n()) {
                                objIF4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$2$1
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
                            composer2 = composerKN;
                            O(composableLambdaNr3, composableLambdaNr4, composableLambdaNr, composableLambda, z13, (Function0) objIF4, composer2, ((i14 >> 9) & 57344) | 438);
                            composer2.XQ();
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            mutableInteractionSource5 = mutableInteractionSource2;
                            navigationBarItemColors2 = navigationBarItemColorsN;
                            z10 = z15;
                            z11 = z13;
                            function25 = function27;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i15) {
                                    NavigationBarKt.rl(rowScope, z2, function0, function2, modifier4, z10, function25, z11, navigationBarItemColors2, mutableInteractionSource5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 12582912;
                    z6 = true;
                    z7 = z4;
                    if ((i2 & 100663296) == 0) {
                    }
                    i11 = 256 & i3;
                    if (i11 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                        composerKN.e();
                        if ((i2 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if ((128 & i3) != 0) {
                            }
                            z9 = z7;
                            i12 = i5;
                            if (i11 != 0) {
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            composerKN.eF(-103236853);
                            if (mutableInteractionSource2 != null) {
                            }
                            composerKN.Xw();
                            final boolean z122 = z5;
                            final Function2 function262 = function23;
                            final NavigationBarItemColors navigationBarItemColors32 = navigationBarItemColorsN;
                            final Function2 function272 = function24;
                            final boolean z132 = z9;
                            Modifier modifier52 = modifier3;
                            boolean z142 = z6;
                            ComposableLambda composableLambdaNr5 = ComposableLambdaKt.nr(-1419576100, z142, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i142) {
                                    if ((i142 & 3) == 2 && composer3.xMQ()) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1419576100, i142, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:185)");
                                    }
                                    State stateN = SingleValueAnimationKt.n(navigationBarItemColors32.rl(z2, z122), AnimationSpecKt.ty(100, 0, null, 6, null), null, null, composer3, 48, 12);
                                    Modifier modifierN2 = (function272 == null || !(z132 || z2)) ? Modifier.INSTANCE : SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
                                        public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            n(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }
                                    });
                                    Function2 function28 = function262;
                                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                    int iN2 = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                    Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierN2);
                                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                    Function0 function0N2 = companion22.n();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.t();
                                    }
                                    composer3.T();
                                    if (composer3.getInserting()) {
                                        composer3.s7N(function0N2);
                                    } else {
                                        composer3.r();
                                    }
                                    Composer composerN2 = Updater.n(composer3);
                                    Updater.O(composerN2, measurePolicyUo2, companion22.t());
                                    Updater.O(composerN2, compositionLocalMapIk2, companion22.O());
                                    Function2 function2Rl2 = companion22.rl();
                                    if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                        composerN2.o(Integer.valueOf(iN2));
                                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                    }
                                    Updater.O(composerN2, modifierO2, companion22.nr());
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                    CompositionLocalKt.rl(ContentColorKt.n().nr(Color.xMQ(rl(stateN))), function28, composer3, ProvidedValue.xMQ);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }

                                private static final long rl(State state) {
                                    return ((Color) state.getValue()).getValue();
                                }
                            }, composerKN, 54);
                            composerKN.eF(-103210706);
                            if (function272 != null) {
                            }
                            composerKN.Xw();
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                            }
                            final MutableIntState mutableIntState2 = (MutableIntState) objIF;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier52;
                            ComposableLambda composableLambda2 = composableLambdaNr2;
                            int i142 = i12;
                            boolean z152 = z5;
                            Modifier modifierRl2 = RowScope.rl(rowScope2, SizeKt.rl(SelectableKt.n(modifier52, z2, mutableInteractionSource4, null, z5, Role.mUb(Role.INSTANCE.KN()), function0), 0.0f, f26412n, 1, null), 1.0f, false, 2, null);
                            objIF2 = composerKN.iF();
                            if (objIF2 == companion.n()) {
                            }
                            Modifier modifierN2 = OnRemeasuredModifierKt.n(modifierRl2, (Function1) objIF2);
                            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), true);
                            iN = ComposablesKt.n(composerKN, 0);
                            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0 function0N2 = companion22.n();
                            if (composerKN.getApplier() == null) {
                            }
                            composerKN.T();
                            if (composerKN.getInserting()) {
                            }
                            composerN = Updater.n(composerKN);
                            Updater.O(composerN, measurePolicyUo2, companion22.t());
                            Updater.O(composerN, compositionLocalMapIk2, companion22.O());
                            function2Rl = companion22.rl();
                            if (!composerN.getInserting()) {
                                composerN.o(Integer.valueOf(iN));
                                composerN.az(Integer.valueOf(iN), function2Rl);
                                Updater.O(composerN, modifierO2, companion22.nr());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                                stateNr = AnimateAsStateKt.nr(!z2 ? 1.0f : 0.0f, AnimationSpecKt.ty(100, 0, null, 6, null), 0.0f, null, null, composerKN, 48, 28);
                                jN = OffsetKt.n((t(mutableIntState2) - r10.How(NavigationBarTokens.f29700n.O())) / 2, ((Density) composerKN.ty(CompositionLocalsKt.J2())).l(J2));
                                Unit unit2 = Unit.INSTANCE;
                                zP5 = composerKN.p5(mutableInteractionSource4) | composerKN.nr(jN);
                                objIF3 = composerKN.iF();
                                if (!zP5) {
                                    objIF3 = new MappedInteractionSource(mutableInteractionSource4, jN, null);
                                    composerKN.o(objIF3);
                                    final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) objIF3;
                                    ComposableLambda composableLambdaNr32 = ComposableLambdaKt.nr(691730997, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicatorRipple$1
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i15) {
                                            if ((i15 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(691730997, i15, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:256)");
                                            }
                                            BoxKt.n(IndicationKt.rl(ClipKt.n(LayoutIdKt.rl(Modifier.INSTANCE, "indicatorRipple"), ShapesKt.O(NavigationBarTokens.f29700n.nr(), composer3, 6)), mappedInteractionSource2, RippleKt.nr(false, 0.0f, 0L, composer3, 0, 7)), composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    ComposableLambda composableLambdaNr42 = ComposableLambdaKt.nr(-474426875, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i15) {
                                            if ((i15 & 3) == 2 && composer3.xMQ()) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(-474426875, i15, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:264)");
                                            }
                                            Modifier modifierRl22 = LayoutIdKt.rl(Modifier.INSTANCE, "indicator");
                                            boolean zP53 = composer3.p5(stateNr);
                                            final State state = stateNr;
                                            Object objIF6 = composer3.iF();
                                            if (zP53 || objIF6 == Composer.INSTANCE.n()) {
                                                objIF6 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$indicator$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                        n(graphicsLayerScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                                                        graphicsLayerScope.rl(((Number) state.getValue()).floatValue());
                                                    }
                                                };
                                                composer3.o(objIF6);
                                            }
                                            BoxKt.n(BackgroundKt.t(GraphicsLayerModifierKt.n(modifierRl22, (Function1) objIF6), navigationBarItemColorsN.getSelectedIndicatorColor(), ShapesKt.O(NavigationBarTokens.f29700n.nr(), composer3, 6)), composer3, 0);
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54);
                                    zP52 = composerKN.p5(stateNr);
                                    objIF4 = composerKN.iF();
                                    if (!zP52) {
                                        objIF4 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$2$1
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
                                        composer2 = composerKN;
                                        O(composableLambdaNr32, composableLambdaNr42, composableLambdaNr5, composableLambda2, z132, (Function0) objIF4, composer2, ((i142 >> 9) & 57344) | 438);
                                        composer2.XQ();
                                        if (ComposerKt.v()) {
                                        }
                                        mutableInteractionSource5 = mutableInteractionSource2;
                                        navigationBarItemColors2 = navigationBarItemColorsN;
                                        z10 = z152;
                                        z11 = z132;
                                        function25 = function272;
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                i9 = i3 & 32;
                if (i9 == 0) {
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                z6 = true;
                z7 = z4;
                if ((i2 & 100663296) == 0) {
                }
                i11 = 256 & i3;
                if (i11 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            function23 = function2;
            i7 = i3 & 8;
            if (i7 != 0) {
            }
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            i9 = i3 & 32;
            if (i9 == 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            z6 = true;
            z7 = z4;
            if ((i2 & 100663296) == 0) {
            }
            i11 = 256 & i3;
            if (i11 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((4 & i3) == 0) {
        }
        function23 = function2;
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        i9 = i3 & 32;
        if (i9 == 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        z6 = true;
        z7 = z4;
        if ((i2 & 100663296) == 0) {
        }
        i11 = 256 & i3;
        if (i11 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableIntState mutableIntState, int i2) {
        mutableIntState.KN(i2);
    }

    private static final int t(MutableIntState mutableIntState) {
        return mutableIntState.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ty(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        final int iQie = Constraints.qie(j2);
        final int iJ2 = ConstraintsKt.J2(j2, measureScope.How(f26412n));
        final int width = (iQie - placeable.getWidth()) / 2;
        final int height = (iJ2 - placeable.getHeight()) / 2;
        final int width2 = (iQie - placeable2.getWidth()) / 2;
        final int height2 = (iJ2 - placeable2.getHeight()) / 2;
        return MeasureScope.ER(measureScope, iQie, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
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
                Placeable.PlacementScope placementScope2;
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.az(placementScope, placeable4, (iQie - placeable4.getWidth()) / 2, (iJ2 - placeable4.getHeight()) / 2, 0.0f, 4, null);
                    placementScope2 = placementScope;
                } else {
                    placementScope2 = placementScope;
                }
                Placeable.PlacementScope.az(placementScope2, placeable, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.az(placementScope2, placeable2, width2, height2, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
