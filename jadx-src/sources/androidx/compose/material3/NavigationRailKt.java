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
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u001az\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0083\u0001\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001as\u0010\"\u001a\u00020\u00072\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0002\b\b2\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0012H\u0003¢\u0006\u0004\b\"\u0010#\u001a8\u0010,\u001a\u00020+*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aP\u0010/\u001a\u00020+*\u00020$2\u0006\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104\"\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102\"\u001a\u00108\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b7\u00104\"\u001a\u0010;\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104\"\u001a\u0010>\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u00104\"\u0014\u0010@\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00102\"\u0014\u0010B\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00102\"\u0014\u0010D\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\f\u0010E\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010F\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/NavigationRailItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "rl", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/NavigationRailItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "indicatorRipple", "indicator", "", "animationProgress", "t", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "ty", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "HI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JZF)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "F", "az", "()F", "NavigationRailVerticalPadding", "NavigationRailHeaderPadding", "qie", "NavigationRailItemWidth", "nr", "gh", "NavigationRailItemHeight", "O", "getNavigationRailItemVerticalPadding", "NavigationRailItemVerticalPadding", "J2", "IndicatorHorizontalPadding", "Uo", "IndicatorVerticalPaddingWithLabel", "KN", "IndicatorVerticalPaddingNoLabel", "iconColor", "textColor", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,749:1\n1223#2,6:750\n1223#2,6:789\n1223#2,6:795\n1223#2,6:805\n1223#2,6:882\n71#3,3:756\n74#3:787\n78#3:804\n71#3:842\n68#3,6:843\n74#3:877\n78#3:881\n71#3:888\n68#3,6:889\n74#3:923\n78#3:927\n78#4,6:759\n85#4,4:774\n89#4,2:784\n93#4:803\n78#4:811\n76#4,8:812\n85#4,4:829\n89#4,2:839\n78#4,6:849\n85#4,4:864\n89#4,2:874\n93#4:880\n78#4,6:895\n85#4,4:910\n89#4,2:920\n93#4:926\n93#4:930\n368#5,9:765\n377#5:786\n378#5,2:801\n368#5,9:820\n377#5:841\n368#5,9:855\n377#5:876\n378#5,2:878\n368#5,9:901\n377#5:922\n378#5,2:924\n378#5,2:928\n4032#6,6:778\n4032#6,6:833\n4032#6,6:868\n4032#6,6:914\n77#7:788\n148#8:931\n148#8:932\n148#8:933\n56#9:934\n71#9:935\n56#9:936\n71#9:937\n56#9:938\n71#9:939\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailKt\n*L\n184#1:750,6\n247#1:789,6\n283#1:795,6\n531#1:805,6\n524#1:882,6\n216#1:756,3\n216#1:787\n216#1:804\n520#1:842\n520#1:843,6\n520#1:877\n520#1:881\n523#1:888\n523#1:889,6\n523#1:923\n523#1:927\n216#1:759,6\n216#1:774,4\n216#1:784,2\n216#1:803\n516#1:811\n516#1:812,8\n516#1:829,4\n516#1:839,2\n520#1:849,6\n520#1:864,4\n520#1:874,2\n520#1:880\n523#1:895,6\n523#1:910,4\n523#1:920,2\n523#1:926\n516#1:930\n216#1:765,9\n216#1:786\n216#1:801,2\n516#1:820,9\n516#1:841\n520#1:855,9\n520#1:876\n520#1:878,2\n523#1:901,9\n523#1:922\n523#1:924,2\n516#1:928,2\n216#1:778,6\n516#1:833,6\n520#1:868,6\n523#1:914,6\n241#1:788\n719#1:931\n725#1:932\n739#1:933\n742#1:934\n742#1:935\n745#1:936\n745#1:937\n748#1:938\n748#1:939\n*E\n"})
public final class NavigationRailKt {
    private static final float J2;
    private static final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f26743O;
    private static final float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f26744n;
    private static final float nr;
    private static final float rl = Dp.KN(8);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f26745t;

    static {
        float f3 = 4;
        f26744n = Dp.KN(f3);
        NavigationRailTokens navigationRailTokens = NavigationRailTokens.f29723n;
        f26745t = navigationRailTokens.KN();
        nr = navigationRailTokens.az();
        f26743O = Dp.KN(f3);
        float f4 = 2;
        J2 = Dp.KN(Dp.KN(navigationRailTokens.O() - navigationRailTokens.xMQ()) / f4);
        Uo = Dp.KN(Dp.KN(navigationRailTokens.t() - navigationRailTokens.xMQ()) / f4);
        KN = Dp.KN(Dp.KN(navigationRailTokens.az() - navigationRailTokens.xMQ()) / f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult HI(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, final boolean z2, final float f3) {
        float height = placeable2.getHeight();
        float f4 = Uo;
        float fL = height + measureScope.l(f4);
        float f5 = f26743O;
        float fL2 = fL + measureScope.l(f5) + placeable.getHeight();
        float f6 = 2;
        final float fCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.az(j2) - fL2) / f6, measureScope.l(f4));
        float f7 = fL2 + (fCoerceAtLeast * f6);
        final float height2 = ((z2 ? fCoerceAtLeast : (f7 - placeable2.getHeight()) / f6) - fCoerceAtLeast) * (1 - f3);
        final float height3 = placeable2.getHeight() + fCoerceAtLeast + measureScope.l(f4) + measureScope.l(f5);
        final int iUo = ConstraintsKt.Uo(j2, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        final int width = (iUo - placeable.getWidth()) / 2;
        final int width2 = (iUo - placeable2.getWidth()) / 2;
        final int width3 = (iUo - placeable3.getWidth()) / 2;
        final float fL3 = fCoerceAtLeast - measureScope.l(f4);
        return MeasureScope.ER(measureScope, iUo, MathKt.roundToInt(f7), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$placeLabelAndIcon$1
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
                    int i2 = iUo;
                    float f8 = fCoerceAtLeast;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.az(placementScope, placeable5, (i2 - placeable5.getWidth()) / 2, MathKt.roundToInt((f8 - measureScope2.l(NavigationRailKt.Uo)) + height2), 0.0f, 4, null);
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

    public static final float az() {
        return f26744n;
    }

    public static final float gh() {
        return nr;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, Function3 function3, WindowInsets windowInsets, final Function3 function32, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jN;
        long jT2;
        Function3 function33;
        WindowInsets windowInsets2;
        long j4;
        final WindowInsets windowInsetsRl;
        Modifier modifier3;
        final Function3 function34;
        Composer composer2;
        final Function3 function35;
        final WindowInsets windowInsets3;
        final Modifier modifier4;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(118552648);
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
            jT2 = j3;
            i5 |= ((i3 & 4) == 0 && composerKN.nr(jT2)) ? 256 : 128;
        } else {
            jT2 = j3;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                function33 = function3;
                i5 |= composerKN.E2(function33) ? 2048 : 1024;
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
                i5 |= composerKN.E2(function32) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !composerKN.xMQ()) {
                composerKN.e();
                if ((i2 & 1) != 0 || composerKN.rV9()) {
                    Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 2) != 0) {
                        jN = NavigationRailDefaults.f26738n.n(composerKN, 6);
                        i5 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        jT2 = ColorSchemeKt.t(jN, composerKN, (i5 >> 3) & 14);
                        i5 &= -897;
                    }
                    if (i9 != 0) {
                        function33 = null;
                    }
                    if ((i3 & 16) == 0) {
                        windowInsetsRl = NavigationRailDefaults.f26738n.rl(composerKN, 6);
                        i5 &= -57345;
                        j4 = jT2;
                    } else {
                        j4 = jT2;
                        windowInsetsRl = windowInsets2;
                    }
                    modifier3 = modifier5;
                    function34 = function33;
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
                    j4 = jT2;
                    function34 = function33;
                    modifier3 = modifier2;
                    windowInsetsRl = windowInsets2;
                }
                long j7 = jN;
                composerKN.S();
                if (ComposerKt.v()) {
                    ComposerKt.p5(118552648, i5, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:118)");
                }
                int i11 = (i5 & 14) | 12582912;
                int i12 = i5 << 3;
                composer2 = composerKN;
                SurfaceKt.n(modifier3, null, j7, j4, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-2092683357, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i13) {
                        if ((i13 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2092683357, i13, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:124)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierN = SelectableGroupKt.n(PaddingKt.gh(SizeKt.g(WindowInsetsPaddingKt.nr(SizeKt.nr(companion, 0.0f, 1, null), windowInsetsRl), NavigationRailTokens.f29723n.KN(), 0.0f, 2, null), 0.0f, NavigationRailKt.az(), 1, null));
                        Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(NavigationRailKt.az());
                        Function3 function36 = function34;
                        Function3 function37 = function32;
                        MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composer3, 54);
                        int iN = ComposablesKt.n(composer3, 0);
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
                        Composer composerN = Updater.n(composer3);
                        Updater.O(composerN, measurePolicyN, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                        composer3.eF(722845512);
                        if (function36 != null) {
                            function36.invoke(columnScopeInstance, composer3, 6);
                            SpacerKt.n(SizeKt.xMQ(companion, NavigationRailKt.rl), composer3, 6);
                        }
                        composer3.Xw();
                        function37.invoke(columnScopeInstance, composer3, 6);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, i11 | (i12 & 896) | (i12 & 7168), 114);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function35 = function34;
                windowInsets3 = windowInsetsRl;
                modifier4 = modifier3;
                j5 = j7;
                j6 = j4;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier4 = modifier2;
                j5 = jN;
                j6 = jT2;
                function35 = function33;
                windowInsets3 = windowInsets2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i13) {
                        NavigationRailKt.n(modifier4, j5, j6, function35, windowInsets3, function32, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        function33 = function3;
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
                function34 = function33;
                long j72 = jN;
                composerKN.S();
                if (ComposerKt.v()) {
                }
                int i112 = (i5 & 14) | 12582912;
                int i122 = i5 << 3;
                composer2 = composerKN;
                SurfaceKt.n(modifier3, null, j72, j4, 0.0f, 0.0f, null, ComposableLambdaKt.nr(-2092683357, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        n(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer3, int i13) {
                        if ((i13 & 3) == 2 && composer3.xMQ()) {
                            composer3.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-2092683357, i13, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:124)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierN = SelectableGroupKt.n(PaddingKt.gh(SizeKt.g(WindowInsetsPaddingKt.nr(SizeKt.nr(companion, 0.0f, 1, null), windowInsetsRl), NavigationRailTokens.f29723n.KN(), 0.0f, 2, null), 0.0f, NavigationRailKt.az(), 1, null));
                        Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(NavigationRailKt.az());
                        Function3 function36 = function34;
                        Function3 function37 = function32;
                        MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composer3, 54);
                        int iN = ComposablesKt.n(composer3, 0);
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
                        Composer composerN = Updater.n(composer3);
                        Updater.O(composerN, measurePolicyN, companion2.t());
                        Updater.O(composerN, compositionLocalMapIk, companion2.O());
                        Function2 function2Rl = companion2.rl();
                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                            composerN.o(Integer.valueOf(iN));
                            composerN.az(Integer.valueOf(iN), function2Rl);
                        }
                        Updater.O(composerN, modifierO, companion2.nr());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                        composer3.eF(722845512);
                        if (function36 != null) {
                            function36.invoke(columnScopeInstance, composer3, 6);
                            SpacerKt.n(SizeKt.xMQ(companion, NavigationRailKt.rl), composer3, 6);
                        }
                        composer3.Xw();
                        function37.invoke(columnScopeInstance, composer3, 6);
                        composer3.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composer2, i112 | (i122 & 896) | (i122 & 7168), 114);
                if (ComposerKt.v()) {
                }
                function35 = function34;
                windowInsets3 = windowInsetsRl;
                modifier4 = modifier3;
                j5 = j72;
                j6 = j4;
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final float qie() {
        return f26745t;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, boolean z4, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
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
        NavigationRailItemColors navigationRailItemColorsN;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z9;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        final Function2 function25;
        final boolean z10;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        final State stateNr;
        long jN;
        boolean zP5;
        Object objIF;
        final Shape shapeO;
        boolean zP52;
        Object objIF2;
        Composer composer2;
        final NavigationRailItemColors navigationRailItemColors2;
        final Function2 function26;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1533971045);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function0) ? 32 : 16;
            }
            if ((4 & i3) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    function23 = function2;
                    i5 |= composerKN.E2(function23) ? 256 : 128;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                    modifier2 = modifier;
                } else if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
                } else {
                    modifier2 = modifier;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                    z5 = z3;
                } else if ((i2 & 24576) == 0) {
                    z5 = z3;
                    i5 |= composerKN.n(z5) ? 16384 : 8192;
                } else {
                    z5 = z3;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i5 |= 196608;
                    function24 = function22;
                } else {
                    function24 = function22;
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.E2(function24) ? 131072 : 65536;
                    }
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                    if ((i2 & 1572864) == 0) {
                        z6 = true;
                        z7 = z4;
                        i5 |= composerKN.n(z7) ? 1048576 : 524288;
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            navigationRailItemColorsN = navigationRailItemColors;
                            int i13 = composerKN.p5(navigationRailItemColorsN) ? 8388608 : 4194304;
                            i5 |= i13;
                        } else {
                            navigationRailItemColorsN = navigationRailItemColors;
                        }
                        i5 |= i13;
                    } else {
                        navigationRailItemColorsN = navigationRailItemColors;
                    }
                    i11 = 256 & i3;
                    if (i11 == 0) {
                        i5 |= 100663296;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((i2 & 100663296) == 0) {
                            i5 |= composerKN.p5(mutableInteractionSource2) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                    }
                    if ((i5 & 38347923) == 38347922 || !composerKN.xMQ()) {
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
                                i5 &= -29360129;
                                navigationRailItemColorsN = NavigationRailItemDefaults.f26742n.n(composerKN, 6);
                            }
                            z9 = z7;
                            i12 = i5;
                            if (i11 != 0) {
                                mutableInteractionSource2 = null;
                            }
                        } else {
                            composerKN.wTp();
                            if ((128 & i3) != 0) {
                                i5 &= -29360129;
                            }
                            modifier3 = modifier2;
                            z9 = z7;
                            i12 = i5;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:181)");
                        }
                        composerKN.eF(-782588008);
                        if (mutableInteractionSource2 != null) {
                            Object objIF3 = composerKN.iF();
                            if (objIF3 == Composer.INSTANCE.n()) {
                                objIF3 = InteractionSourceKt.n();
                                composerKN.o(objIF3);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) objIF3;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        composerKN.Xw();
                        final boolean z11 = z5;
                        final Function2 function27 = function23;
                        final NavigationRailItemColors navigationRailItemColors3 = navigationRailItemColorsN;
                        function25 = function24;
                        final boolean z12 = z9;
                        z10 = z12;
                        boolean z13 = z6;
                        ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1023357515, z13, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
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
                                    ComposerKt.p5(-1023357515, i14, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:186)");
                                }
                                State stateN = SingleValueAnimationKt.n(navigationRailItemColors3.rl(z2, z11), AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer3, 48, 12);
                                Modifier modifierN = (function25 == null || !(z12 || z2)) ? Modifier.INSTANCE : SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                });
                                Function2 function28 = function27;
                                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN2 = ComposablesKt.n(composer3, 0);
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
                                Composer composerN2 = Updater.n(composer3);
                                Updater.O(composerN2, measurePolicyUo, companion.t());
                                Updater.O(composerN2, compositionLocalMapIk, companion.O());
                                Function2 function2Rl2 = companion.rl();
                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO, companion.nr());
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
                        composerKN.eF(-782561860);
                        ComposableLambda composableLambdaNr2 = function25 != null ? null : ComposableLambdaKt.nr(-105269599, z13, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
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
                                    ComposerKt.p5(-105269599, i14, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:201)");
                                }
                                ProvideContentColorTextStyleKt.n(rl(SingleValueAnimationKt.n(navigationRailItemColors3.t(z2, z5), AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer3, 48, 12)), TypographyKt.t(NavigationRailTokens.f29723n.qie(), composer3, 6), function25, composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }

                            private static final long rl(State state) {
                                return ((Color) state.getValue()).getValue();
                            }
                        }, composerKN, 54);
                        composerKN.Xw();
                        Modifier modifier5 = modifier3;
                        Modifier modifierRl = SizeKt.rl(SelectableKt.n(modifier5, z2, mutableInteractionSource3, null, z5, Role.mUb(Role.INSTANCE.KN()), function0), 0.0f, nr, z13 ? 1 : 0, null);
                        float f3 = f26745t;
                        Modifier modifierG = SizeKt.g(modifierRl, f3, 0.0f, 2, null);
                        MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), true);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                        Modifier modifierO = ComposedModifierKt.O(composerKN, modifierG);
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
                        stateNr = AnimateAsStateKt.nr(!z2 ? 1.0f : 0.0f, AnimationSpecKt.ty(150, 0, null, 6, null), 0.0f, null, null, composerKN, 48, 28);
                        int iHow = ((Density) composerKN.ty(CompositionLocalsKt.J2())).How(f3);
                        NavigationRailTokens navigationRailTokens = NavigationRailTokens.f29723n;
                        int i14 = i12;
                        jN = OffsetKt.n((iHow - r14.How(navigationRailTokens.O())) / 2, 0.0f);
                        Unit unit = Unit.INSTANCE;
                        zP5 = composerKN.p5(mutableInteractionSource3) | composerKN.nr(jN);
                        objIF = composerKN.iF();
                        if (!zP5 || objIF == Composer.INSTANCE.n()) {
                            objIF = new MappedInteractionSource(mutableInteractionSource3, jN, null);
                            composerKN.o(objIF);
                        }
                        final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objIF;
                        if (function25 == null) {
                            composerKN.eF(585295320);
                            shapeO = ShapesKt.O(navigationRailTokens.nr(), composerKN, 6);
                            composerKN.Xw();
                        } else {
                            composerKN.eF(585379857);
                            shapeO = ShapesKt.O(navigationRailTokens.ty(), composerKN, 6);
                            composerKN.Xw();
                        }
                        ComposableLambda composableLambdaNr3 = ComposableLambdaKt.nr(211026382, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicatorRipple$1
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
                                    ComposerKt.p5(211026382, i15, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:261)");
                                }
                                BoxKt.n(IndicationKt.rl(ClipKt.n(LayoutIdKt.rl(Modifier.INSTANCE, "indicatorRipple"), shapeO), mappedInteractionSource, RippleKt.nr(false, 0.0f, 0L, composer3, 0, 7)), composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54);
                        ComposableLambda composableLambdaNr4 = ComposableLambdaKt.nr(-1862011490, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicator$1
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
                                    ComposerKt.p5(-1862011490, i15, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:269)");
                                }
                                Modifier modifierRl2 = LayoutIdKt.rl(Modifier.INSTANCE, "indicator");
                                boolean zP53 = composer3.p5(stateNr);
                                final State state = stateNr;
                                Object objIF4 = composer3.iF();
                                if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                                    objIF4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicator$1$1$1
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
                                    composer3.o(objIF4);
                                }
                                BoxKt.n(BackgroundKt.t(GraphicsLayerModifierKt.n(modifierRl2, (Function1) objIF4), navigationRailItemColors3.getSelectedIndicatorColor(), shapeO), composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54);
                        zP52 = composerKN.p5(stateNr);
                        objIF2 = composerKN.iF();
                        if (!zP52 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$2$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                public final Float invoke() {
                                    return (Float) stateNr.getValue();
                                }
                            };
                            composerKN.o(objIF2);
                        }
                        t(composableLambdaNr3, composableLambdaNr4, composableLambdaNr, composableLambdaNr2, z10, (Function0) objIF2, composerKN, ((i14 >> 6) & 57344) | 438);
                        composer2 = composerKN;
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        navigationRailItemColors2 = navigationRailItemColors3;
                        function26 = function25;
                        modifier4 = modifier5;
                    } else {
                        composerKN.wTp();
                        modifier4 = modifier2;
                        function26 = function24;
                        composer2 = composerKN;
                        navigationRailItemColors2 = navigationRailItemColorsN;
                        z10 = z7;
                    }
                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    final boolean z14 = z5;
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2
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
                                NavigationRailKt.rl(z2, function0, function2, modifier4, z14, function26, z10, navigationRailItemColors2, mutableInteractionSource4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                z6 = true;
                z7 = z4;
                if ((i2 & 12582912) != 0) {
                }
                i11 = 256 & i3;
                if (i11 == 0) {
                }
                if ((i5 & 38347923) == 38347922) {
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
                        composerKN.eF(-782588008);
                        if (mutableInteractionSource2 != null) {
                        }
                        composerKN.Xw();
                        final boolean z112 = z5;
                        final Function2 function272 = function23;
                        final NavigationRailItemColors navigationRailItemColors32 = navigationRailItemColorsN;
                        function25 = function24;
                        final boolean z122 = z9;
                        z10 = z122;
                        boolean z132 = z6;
                        ComposableLambda composableLambdaNr5 = ComposableLambdaKt.nr(-1023357515, z132, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
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
                                    ComposerKt.p5(-1023357515, i142, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:186)");
                                }
                                State stateN = SingleValueAnimationKt.n(navigationRailItemColors32.rl(z2, z112), AnimationSpecKt.ty(150, 0, null, 6, null), null, null, composer3, 48, 12);
                                Modifier modifierN = (function25 == null || !(z122 || z2)) ? Modifier.INSTANCE : SemanticsModifierKt.n(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        n(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }
                                });
                                Function2 function28 = function272;
                                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                                int iN2 = ComposablesKt.n(composer3, 0);
                                CompositionLocalMap compositionLocalMapIk2 = composer3.Ik();
                                Modifier modifierO2 = ComposedModifierKt.O(composer3, modifierN);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0 function0N2 = companion2.n();
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
                                Updater.O(composerN2, measurePolicyUo2, companion2.t());
                                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                                Function2 function2Rl2 = companion2.rl();
                                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                                    composerN2.o(Integer.valueOf(iN2));
                                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                                }
                                Updater.O(composerN2, modifierO2, companion2.nr());
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
                        composerKN.eF(-782561860);
                        if (function25 != null) {
                        }
                        composerKN.Xw();
                        Modifier modifier52 = modifier3;
                        Modifier modifierRl2 = SizeKt.rl(SelectableKt.n(modifier52, z2, mutableInteractionSource3, null, z5, Role.mUb(Role.INSTANCE.KN()), function0), 0.0f, nr, z132 ? 1 : 0, null);
                        float f32 = f26745t;
                        Modifier modifierG2 = SizeKt.g(modifierRl2, f32, 0.0f, 2, null);
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.O(), true);
                        iN = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                        Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierG2);
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
                            stateNr = AnimateAsStateKt.nr(!z2 ? 1.0f : 0.0f, AnimationSpecKt.ty(150, 0, null, 6, null), 0.0f, null, null, composerKN, 48, 28);
                            int iHow2 = ((Density) composerKN.ty(CompositionLocalsKt.J2())).How(f32);
                            NavigationRailTokens navigationRailTokens2 = NavigationRailTokens.f29723n;
                            int i142 = i12;
                            jN = OffsetKt.n((iHow2 - r14.How(navigationRailTokens2.O())) / 2, 0.0f);
                            Unit unit2 = Unit.INSTANCE;
                            zP5 = composerKN.p5(mutableInteractionSource3) | composerKN.nr(jN);
                            objIF = composerKN.iF();
                            if (!zP5) {
                                objIF = new MappedInteractionSource(mutableInteractionSource3, jN, null);
                                composerKN.o(objIF);
                                final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) objIF;
                                if (function25 == null) {
                                }
                                ComposableLambda composableLambdaNr32 = ComposableLambdaKt.nr(211026382, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicatorRipple$1
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
                                            ComposerKt.p5(211026382, i15, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:261)");
                                        }
                                        BoxKt.n(IndicationKt.rl(ClipKt.n(LayoutIdKt.rl(Modifier.INSTANCE, "indicatorRipple"), shapeO), mappedInteractionSource2, RippleKt.nr(false, 0.0f, 0L, composer3, 0, 7)), composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                ComposableLambda composableLambdaNr42 = ComposableLambdaKt.nr(-1862011490, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicator$1
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
                                            ComposerKt.p5(-1862011490, i15, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:269)");
                                        }
                                        Modifier modifierRl22 = LayoutIdKt.rl(Modifier.INSTANCE, "indicator");
                                        boolean zP53 = composer3.p5(stateNr);
                                        final State state = stateNr;
                                        Object objIF4 = composer3.iF();
                                        if (zP53 || objIF4 == Composer.INSTANCE.n()) {
                                            objIF4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicator$1$1$1
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
                                            composer3.o(objIF4);
                                        }
                                        BoxKt.n(BackgroundKt.t(GraphicsLayerModifierKt.n(modifierRl22, (Function1) objIF4), navigationRailItemColors32.getSelectedIndicatorColor(), shapeO), composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                                zP52 = composerKN.p5(stateNr);
                                objIF2 = composerKN.iF();
                                if (!zP52) {
                                    objIF2 = new Function0<Float>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$2$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                                        public final Float invoke() {
                                            return (Float) stateNr.getValue();
                                        }
                                    };
                                    composerKN.o(objIF2);
                                    t(composableLambdaNr32, composableLambdaNr42, composableLambdaNr5, composableLambdaNr2, z10, (Function0) objIF2, composerKN, ((i142 >> 6) & 57344) | 438);
                                    composer2 = composerKN;
                                    composer2.XQ();
                                    if (ComposerKt.v()) {
                                    }
                                    navigationRailItemColors2 = navigationRailItemColors32;
                                    function26 = function25;
                                    modifier4 = modifier52;
                                }
                            }
                        }
                    }
                }
                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                final boolean z142 = z5;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
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
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            z6 = true;
            z7 = z4;
            if ((i2 & 12582912) != 0) {
            }
            i11 = 256 & i3;
            if (i11 == 0) {
            }
            if ((i5 & 38347923) == 38347922) {
            }
            final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            final boolean z1422 = z5;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
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
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        z6 = true;
        z7 = z4;
        if ((i2 & 12582912) != 0) {
        }
        i11 = 256 & i3;
        if (i11 == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
        }
        final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        final boolean z14222 = z5;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final boolean z2, final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1498399348);
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
                ComposerKt.p5(1498399348, i3, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)");
            }
            int i5 = 458752 & i3;
            int i7 = 57344 & i3;
            boolean z3 = ((i3 & 7168) == 2048) | (i5 == 131072) | (i7 == 16384);
            Object objIF = composerKN.iF();
            if (z3 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$2$1
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
                                int width = placeableDR02.getWidth() + measureScope2.How(Dp.KN(NavigationRailKt.J2 * f3));
                                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                                int height = placeableDR02.getHeight() + measureScope2.How(Dp.KN((function24 == null ? NavigationRailKt.KN : NavigationRailKt.Uo) * f3));
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
                                            return NavigationRailKt.ty(measureScope2, placeableDR02, placeableDR03, placeableDR04, j2);
                                        }
                                        Intrinsics.checkNotNull(placeableDR0);
                                        return NavigationRailKt.HI(measureScope, placeableDR0, placeableDR02, placeableDR03, placeableDR04, j2, z2, fFloatValue);
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
            composerKN.eF(2145400941);
            if (function24 != null) {
                Modifier modifierRl2 = LayoutIdKt.rl(companion, "label");
                boolean z4 = (i7 == 16384) | (i5 == 131072);
                Object objIF2 = composerKN.iF();
                if (z4 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$1$2$1
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$3
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
                    NavigationRailKt.t(function2, function22, function23, function24, z2, function0, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ty(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        final int iUo = ConstraintsKt.Uo(j2, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        final int iJ2 = ConstraintsKt.J2(j2, measureScope.How(nr));
        final int width = (iUo - placeable.getWidth()) / 2;
        final int height = (iJ2 - placeable.getHeight()) / 2;
        final int width2 = (iUo - placeable2.getWidth()) / 2;
        final int height2 = (iJ2 - placeable2.getHeight()) / 2;
        return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$placeIcon$1
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
                    Placeable.PlacementScope.az(placementScope, placeable4, (iUo - placeable4.getWidth()) / 2, (iJ2 - placeable4.getHeight()) / 2, 0.0f, 4, null);
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
