package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008a\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0082\u0001\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001az\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a=\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00032\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010%\u001a\u00020\u0003*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001aK\u0010.\u001a\u00020\u0003*\u00020 2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0002¢\u0006\u0004\b.\u0010/\"\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101\"\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101\"\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101\"\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00101\"\u0014\u00106\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101\"\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u0014\u0010<\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>²\u0006\f\u0010=\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/runtime/Composable;", "text", "icon", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "rl", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", c.f62177j, "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "O", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/Placeable;", "textOrIconPlaceable", "", "tabHeight", "ck", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;I)V", "Landroidx/compose/ui/unit/Density;", "density", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "HI", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;IIII)V", "Landroidx/compose/ui/unit/Dp;", "F", "SmallTabHeight", "LargeTabHeight", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/TextUnit;", "J2", "J", "IconDistanceFromBaseline", "Uo", "TextDistanceFromLeadingIcon", TtmlNode.ATTR_TTS_COLOR, "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,430:1\n75#2:431\n75#2:432\n75#2:433\n68#3:434\n66#3,5:435\n71#3:443\n74#3:447\n1225#4,3:440\n1228#4,3:444\n1247#4,6:455\n1884#5,7:448\n79#6:461\n77#6,8:462\n86#6,4:479\n90#6,2:489\n79#6,6:499\n86#6,4:514\n90#6,2:524\n94#6:530\n79#6,6:539\n86#6,4:554\n90#6,2:564\n94#6:570\n94#6:574\n368#7,9:470\n377#7:491\n368#7,9:505\n377#7:526\n378#7,2:528\n368#7,9:545\n377#7:566\n378#7,2:568\n378#7,2:572\n4034#8,6:483\n4034#8,6:518\n4034#8,6:558\n71#9:492\n68#9,6:493\n74#9:527\n78#9:531\n71#9:532\n68#9,6:533\n74#9:567\n78#9:571\n1#10:575\n85#11:576\n149#12:577\n149#12:578\n149#12:579\n149#12:580\n149#12:581\n149#12:582\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt\n*L\n97#1:431\n160#1:432\n230#1:433\n273#1:434\n273#1:435,5\n273#1:443\n273#1:447\n273#1:440,3\n273#1:444,3\n309#1:455,6\n273#1:448,7\n302#1:461\n302#1:462,8\n302#1:479,4\n302#1:489,2\n304#1:499,6\n304#1:514,4\n304#1:524,2\n304#1:530\n307#1:539,6\n307#1:554,4\n307#1:564,2\n307#1:570\n302#1:574\n302#1:470,9\n302#1:491\n304#1:505,9\n304#1:526\n304#1:528,2\n307#1:545,9\n307#1:566\n307#1:568,2\n302#1:572,2\n302#1:483,6\n304#1:518,6\n307#1:558,6\n304#1:492\n304#1:493,6\n304#1:527\n304#1:531\n307#1:532\n307#1:533,6\n307#1:567\n307#1:571\n273#1:576\n409#1:577\n410#1:578\n418#1:579\n422#1:580\n425#1:581\n429#1:582\n*E\n"})
public final class TabKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23337n = Dp.KN(48);
    private static final float rl = Dp.KN(72);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f23338t = Dp.KN(16);
    private static final float nr = Dp.KN(14);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f23336O = Dp.KN(6);
    private static final long J2 = TextUnitKt.KN(20);
    private static final float Uo = Dp.KN(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1249848471);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function22) ? 32 : 16;
        }
        if (composerKN.HI((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(1249848471, i3, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:300)");
            }
            int i5 = i3 & 14;
            boolean z2 = ((i3 & 112) == 32) | (i5 == 4);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                        Placeable placeableDR0;
                        final Placeable placeableDR02;
                        if (function2 != null) {
                            int size = list.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                Measurable measurable = (Measurable) list.get(i7);
                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "text")) {
                                    placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableDR0 = null;
                        if (function22 != null) {
                            int size2 = list.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                Measurable measurable2 = (Measurable) list.get(i8);
                                if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "icon")) {
                                    placeableDR02 = measurable2.dR0(j2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        placeableDR02 = null;
                        final int iMax = Math.max(placeableDR0 != null ? placeableDR0.getWidth() : 0, placeableDR02 != null ? placeableDR02.getWidth() : 0);
                        final int iHow = measureScope.How((placeableDR0 == null || placeableDR02 == null) ? TabKt.f23337n : TabKt.rl);
                        final Integer numValueOf = placeableDR0 != null ? Integer.valueOf(placeableDR0.z(AlignmentLineKt.n())) : null;
                        final Integer numValueOf2 = placeableDR0 != null ? Integer.valueOf(placeableDR0.z(AlignmentLineKt.rl())) : null;
                        final Placeable placeable = placeableDR0;
                        return MeasureScope.ER(measureScope, iMax, iHow, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$1.1
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
                                Placeable placeable2;
                                Placeable placeable3 = placeable;
                                if (placeable3 == null || (placeable2 = placeableDR02) == null) {
                                    if (placeable3 != null) {
                                        TabKt.ck(placementScope, placeable3, iHow);
                                        return;
                                    }
                                    Placeable placeable4 = placeableDR02;
                                    if (placeable4 != null) {
                                        TabKt.ck(placementScope, placeable4, iHow);
                                        return;
                                    }
                                    return;
                                }
                                MeasureScope measureScope2 = measureScope;
                                int i9 = iMax;
                                int i10 = iHow;
                                Integer num = numValueOf;
                                Intrinsics.checkNotNull(num);
                                int iIntValue = num.intValue();
                                Integer num2 = numValueOf2;
                                Intrinsics.checkNotNull(num2);
                                TabKt.HI(placementScope, measureScope2, placeable3, placeable2, i9, i10, iIntValue, num2.intValue());
                            }
                        }, 4, null);
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
            if (function2 != null) {
                composerKN.eF(-238651272);
                Modifier modifierGh = PaddingKt.gh(LayoutIdKt.rl(companion, "text"), f23338t, 0.0f, 2, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh);
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
                function2.invoke(composerKN, Integer.valueOf(i5));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-238546523);
                composerKN.Xw();
            }
            if (function22 != null) {
                composerKN.eF(-238517724);
                Modifier modifierRl = LayoutIdKt.rl(companion, "icon");
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl);
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-238455259);
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i7) {
                    TabKt.nr(function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HI(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i2, int i3, int i5, int i7) {
        int iHow = density.How(i5 == i7 ? nr : f23336O) + density.How(TabRowDefaults.f23397n.t());
        int height = (placeable2.getHeight() + density.I4p(J2)) - i5;
        int i8 = (i3 - i7) - iHow;
        Placeable.PlacementScope.az(placementScope, placeable, (i2 - placeable.getWidth()) / 2, i8, 0.0f, 4, null);
        Placeable.PlacementScope.az(placementScope, placeable2, (i2 - placeable2.getWidth()) / 2, i8 - height, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final long j2, final long j3, boolean z2, final Function2 function2, Composer composer, final int i2) {
        int i3;
        final boolean z3;
        int i5;
        Composer composerKN = composer.KN(-405571117);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            z3 = z2;
            i3 |= composerKN.n(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function2) ? 2048 : 1024;
        }
        if (composerKN.HI((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-405571117, i3, -1, "androidx.compose.material.TabTransition (Tab.kt:269)");
            }
            int i7 = i3 >> 6;
            Transition transitionMUb = TransitionKt.mUb(Boolean.valueOf(z3), null, composerKN, i7 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return n(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec n(Transition.Segment segment, Composer composer2, int i8) {
                    TweenSpec tweenSpecTy;
                    composer2.eF(-2120892502);
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-2120892502, i8, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:274)");
                    }
                    if (segment.t(Boolean.FALSE, Boolean.TRUE)) {
                        tweenSpecTy = AnimationSpecKt.az(150, 100, EasingKt.O());
                    } else {
                        tweenSpecTy = AnimationSpecKt.ty(100, 0, EasingKt.O(), 2, null);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    composer2.Xw();
                    return tweenSpecTy;
                }
            };
            boolean zBooleanValue = ((Boolean) transitionMUb.Ik()).booleanValue();
            composerKN.eF(1445938070);
            if (ComposerKt.v()) {
                ComposerKt.p5(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j4 = zBooleanValue ? j2 : j3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            ColorSpace colorSpaceR = Color.r(j4);
            boolean zP5 = composerKN.p5(colorSpaceR);
            Object objIF = composerKN.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = (TwoWayConverter) ColorVectorConverterKt.n(Color.INSTANCE).invoke(colorSpaceR);
                composerKN.o(objIF);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) objIF;
            boolean zBooleanValue2 = ((Boolean) transitionMUb.xMQ()).booleanValue();
            composerKN.eF(1445938070);
            if (ComposerKt.v()) {
                ComposerKt.p5(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            }
            long j5 = zBooleanValue2 ? j2 : j3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            Color colorXMQ = Color.xMQ(j5);
            boolean zBooleanValue3 = ((Boolean) transitionMUb.Ik()).booleanValue();
            composerKN.eF(1445938070);
            if (ComposerKt.v()) {
                i5 = i7;
                ComposerKt.p5(1445938070, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:285)");
            } else {
                i5 = i7;
            }
            long j6 = zBooleanValue3 ? j2 : j3;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            composerKN.Xw();
            State stateJ2 = TransitionKt.J2(transitionMUb, colorXMQ, Color.xMQ(j6), tabKt$TabTransition$color$2.invoke(transitionMUb.HI(), composerKN, 0), twoWayConverter, "ColorAnimation", composerKN, 0);
            CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(Color.az(J2(stateJ2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.n().nr(Float.valueOf(Color.ck(J2(stateJ2))))}, function2, composerKN, ProvidedValue.xMQ | (i5 & 112));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabTransition$1
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
                    TabKt.O(j2, j3, z3, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final boolean z2, final Function0 function0, final Function2 function2, final Function2 function22, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, long j2, long j3, Composer composer, final int i2, final int i3) {
        final boolean z4;
        int i5;
        final Function0 function02;
        Function2 function23;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        int i10;
        Composer composer2;
        final long j4;
        final Modifier modifier3;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource3;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        long value;
        long jAz;
        Composer composerKN = composer.KN(-1499861761);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function2) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function23 = function22;
                    i5 |= composerKN.E2(function23) ? 2048 : 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        modifier2 = modifier;
                        i5 |= composerKN.p5(modifier2) ? 16384 : 8192;
                    }
                    i8 = i3 & 32;
                    if (i8 == 0) {
                        i5 |= 196608;
                    } else {
                        if ((196608 & i2) == 0) {
                            z5 = z3;
                            i5 |= composerKN.n(z5) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 == 0) {
                            if ((1572864 & i2) == 0) {
                                mutableInteractionSource2 = mutableInteractionSource;
                                i5 |= composerKN.p5(mutableInteractionSource2) ? 1048576 : 524288;
                            }
                            if ((12582912 & i2) != 0) {
                                i10 = i5 | (((i3 & 128) == 0 && composerKN.nr(j2)) ? 8388608 : 4194304);
                            } else {
                                i10 = i5;
                            }
                            if ((i2 & 100663296) == 0) {
                                i10 |= ((i3 & 256) == 0 && composerKN.nr(j3)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                            }
                            if (composerKN.HI((38347923 & i10) == 38347922, i10 & 1)) {
                                composer2 = composerKN;
                                composer2.wTp();
                                j4 = j2;
                                modifier3 = modifier2;
                                z6 = z5;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                j5 = j3;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        z5 = true;
                                    }
                                    if (i9 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i10 &= -29360129;
                                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                    } else {
                                        value = j2;
                                    }
                                    if ((i3 & 256) != 0) {
                                        jAz = Color.az(value, ContentAlpha.f21745n.nr(composerKN, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i10 &= -234881025;
                                    }
                                    final boolean z7 = z5;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    composerKN.S();
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-1499861761, i10, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:161)");
                                    }
                                    final IndicationNodeFactory indicationNodeFactoryJ2 = RippleKt.J2(true, 0.0f, value, 2, null);
                                    final Modifier modifier4 = modifier2;
                                    final Function2 function24 = function23;
                                    int i11 = i10 >> 21;
                                    long j6 = value;
                                    O(j6, jAz, z2, ComposableLambdaKt.nr(866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$1
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
                                            if (!composer3.HI((i12 & 3) != 2, i12 & 1)) {
                                                composer3.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(866677691, i12, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:168)");
                                            }
                                            Modifier modifierKN = SizeKt.KN(PaddingKt.gh(SelectableKt.n(SizeKt.xMQ(modifier4, TabKt.f23337n), z4, mutableInteractionSource4, indicationNodeFactoryJ2, z7, Role.mUb(Role.INSTANCE.KN()), function02), TabKt.f23338t, 0.0f, 2, null), 0.0f, 1, null);
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                            Function2 function25 = function24;
                                            Function2 function26 = function2;
                                            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                                            int iN = ComposablesKt.n(composer3, 0);
                                            CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                            Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                            function25.invoke(composer3, 0);
                                            SpacerKt.n(SizeKt.o(Modifier.INSTANCE, TabKt.Uo), composer3, 6);
                                            TextKt.n(TextStyle.t(MaterialTheme.f22169n.t(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                            composer3.XQ();
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composerKN, 54), composerKN, ((i10 << 6) & 896) | (i11 & 112) | (i11 & 14) | 3072);
                                    composer2 = composerKN;
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                    modifier3 = modifier4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    z6 = z7;
                                    j5 = jAz;
                                    j4 = value;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 128) != 0) {
                                        i10 &= -29360129;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i10 &= -234881025;
                                    }
                                    value = j2;
                                }
                                jAz = j3;
                                final boolean z72 = z5;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                composerKN.S();
                                if (ComposerKt.v()) {
                                }
                                final IndicationNodeFactory indicationNodeFactoryJ22 = RippleKt.J2(true, 0.0f, value, 2, null);
                                final Modifier modifier42 = modifier2;
                                final Function2 function242 = function23;
                                int i112 = i10 >> 21;
                                long j62 = value;
                                O(j62, jAz, z2, ComposableLambdaKt.nr(866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$1
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
                                        if (!composer3.HI((i12 & 3) != 2, i12 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(866677691, i12, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:168)");
                                        }
                                        Modifier modifierKN = SizeKt.KN(PaddingKt.gh(SelectableKt.n(SizeKt.xMQ(modifier42, TabKt.f23337n), z4, mutableInteractionSource42, indicationNodeFactoryJ22, z72, Role.mUb(Role.INSTANCE.KN()), function02), TabKt.f23338t, 0.0f, 2, null), 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                        Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
                                        Function2 function25 = function242;
                                        Function2 function26 = function2;
                                        MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalRl, verticalXMQ, composer3, 54);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                                        function25.invoke(composer3, 0);
                                        SpacerKt.n(SizeKt.o(Modifier.INSTANCE, TabKt.Uo), composer3, 6);
                                        TextKt.n(TextStyle.t(MaterialTheme.f22169n.t(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i10 << 6) & 896) | (i112 & 112) | (i112 & 14) | 3072);
                                composer2 = composerKN;
                                if (ComposerKt.v()) {
                                }
                                modifier3 = modifier42;
                                mutableInteractionSource3 = mutableInteractionSource42;
                                z6 = z72;
                                j5 = jAz;
                                j4 = value;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
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
                                        TabKt.n(z2, function0, function2, function22, modifier3, z6, mutableInteractionSource3, j4, j5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 1572864;
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((12582912 & i2) != 0) {
                        }
                        if ((i2 & 100663296) == 0) {
                        }
                        if (composerKN.HI((38347923 & i10) == 38347922, i10 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    z5 = z3;
                    i9 = i3 & 64;
                    if (i9 == 0) {
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((12582912 & i2) != 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if (composerKN.HI((38347923 & i10) == 38347922, i10 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                modifier2 = modifier;
                i8 = i3 & 32;
                if (i8 == 0) {
                }
                z5 = z3;
                i9 = i3 & 64;
                if (i9 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i2) != 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if (composerKN.HI((38347923 & i10) == 38347922, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function23 = function22;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            z5 = z3;
            i9 = i3 & 64;
            if (i9 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i2) != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if (composerKN.HI((38347923 & i10) == 38347922, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        function23 = function22;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        z5 = z3;
        i9 = i3 & 64;
        if (i9 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i2) != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (composerKN.HI((38347923 & i10) == 38347922, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, Function2 function2, Function2 function22, MutableInteractionSource mutableInteractionSource, long j2, long j3, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        boolean z5;
        int i8;
        final Function2 function23;
        int i9;
        final Function2 function24;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z6;
        final Function2 function25;
        final Function2 function26;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        long value;
        long j6;
        long jAz;
        MutableInteractionSource mutableInteractionSource3;
        int i14;
        int i15;
        boolean z7;
        final ComposableLambda composableLambdaNr;
        long j7;
        int i16;
        Composer composerKN = composer.KN(-1486097588);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z5 = z3;
                    i5 |= composerKN.n(z5) ? 2048 : 1024;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        function23 = function2;
                        i5 |= composerKN.E2(function23) ? 16384 : 8192;
                    }
                    i9 = i3 & 32;
                    if (i9 != 0) {
                        if ((196608 & i2) == 0) {
                            function24 = function22;
                            i5 |= composerKN.E2(function24) ? 131072 : 65536;
                        }
                        i10 = i3 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= composerKN.p5(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                i16 = i5;
                                i12 = i17;
                                int i18 = composerKN.nr(j2) ? 8388608 : 4194304;
                                i11 = i16 | i18;
                            } else {
                                i16 = i5;
                                i12 = i17;
                            }
                            i11 = i16 | i18;
                        } else {
                            i11 = i5;
                            i12 = i17;
                        }
                        if ((i2 & 100663296) == 0) {
                            i11 |= ((i3 & 256) == 0 && composerKN.nr(j3)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                        }
                        i13 = i11;
                        if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
                            composerKN.e();
                            if ((i2 & 1) == 0 || composerKN.rV9()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z5 = true;
                                }
                                if (i8 != 0) {
                                    function23 = null;
                                }
                                if (i9 != 0) {
                                    function24 = null;
                                }
                                MutableInteractionSource mutableInteractionSource4 = i10 != 0 ? null : mutableInteractionSource;
                                if ((i3 & 128) != 0) {
                                    value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                    i13 &= -29360129;
                                } else {
                                    value = j2;
                                }
                                if ((i3 & 256) != 0) {
                                    long j9 = value;
                                    j6 = j9;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    i15 = i13 & (-234881025);
                                    i14 = 12582912;
                                    jAz = Color.az(j9, ContentAlpha.f21745n.nr(composerKN, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                } else {
                                    j6 = value;
                                    jAz = j3;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    i14 = 12582912;
                                    i15 = i13;
                                }
                                z7 = z5;
                                composableLambdaNr = null;
                                j7 = j6;
                            } else {
                                composerKN.wTp();
                                i15 = (i3 & 128) != 0 ? i13 & (-29360129) : i13;
                                if ((i3 & 256) != 0) {
                                    i15 &= -234881025;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                jAz = j3;
                                i14 = 12582912;
                                z7 = z5;
                                composableLambdaNr = null;
                                j7 = j2;
                            }
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-1486097588, i15, -1, "androidx.compose.material.Tab (Tab.kt:98)");
                            }
                            if (function23 == null) {
                                composerKN.eF(1041219556);
                            } else {
                                composerKN.eF(1041219557);
                                composableLambdaNr = ComposableLambdaKt.nr(-1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        n(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(Composer composer3, int i19) {
                                        if (!composer3.HI((i19 & 3) != 2, i19 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1729014781, i19, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:102)");
                                        }
                                        TextKt.n(TextStyle.t(MaterialTheme.f22169n.t(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function23, composer3, 0);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54);
                            }
                            composerKN.Xw();
                            int i19 = (i15 & 14) | i14 | (i15 & 112) | (i15 & 896) | (i15 & 7168);
                            int i20 = i15 >> 6;
                            composer2 = composerKN;
                            Modifier modifier4 = modifier2;
                            t(z4, function02, modifier4, z7, mutableInteractionSource3, j7, jAz, ComposableLambdaKt.nr(-178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    n(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(ColumnScope columnScope, Composer composer3, int i21) {
                                    if (!composer3.HI((i21 & 17) != 16, i21 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(-178151495, i21, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:115)");
                                    }
                                    TabKt.nr(composableLambdaNr, function24, composer3, 0);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, (57344 & i20) | i19 | (458752 & i20) | (i20 & 3670016), 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function25 = function23;
                            function26 = function24;
                            modifier3 = modifier4;
                            z6 = z7;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            j4 = j7;
                            j5 = jAz;
                        } else {
                            composer2 = composerKN;
                            composer2.wTp();
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            z6 = z5;
                            function25 = function23;
                            function26 = function24;
                            j4 = j2;
                            j5 = j3;
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh != null) {
                            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i21) {
                                    TabKt.rl(z2, function0, modifier3, z6, function25, function26, mutableInteractionSource2, j4, j5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 196608;
                    function24 = function22;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    i13 = i11;
                    if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh != null) {
                    }
                }
                function23 = function2;
                i9 = i3 & 32;
                if (i9 != 0) {
                }
                function24 = function22;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                i13 = i11;
                if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                }
            }
            z5 = z3;
            i8 = i3 & 16;
            if (i8 != 0) {
            }
            function23 = function2;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            function24 = function22;
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            i13 = i11;
            if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 8;
        if (i7 == 0) {
        }
        z5 = z3;
        i8 = i3 & 16;
        if (i8 != 0) {
        }
        function23 = function2;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        function24 = function22;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        i13 = i11;
        if (composerKN.HI((i13 & 38347923) != 38347922, i13 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final Function0 function0, Modifier modifier, boolean z3, MutableInteractionSource mutableInteractionSource, long j2, long j3, final Function3 function3, Composer composer, final int i2, final int i3) {
        boolean z4;
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        MutableInteractionSource mutableInteractionSource2;
        long value;
        int i10;
        Function3 function32;
        final Modifier modifier3;
        Composer composer2;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource3;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        long j6;
        final Modifier modifier4;
        final boolean z7;
        int i11;
        long jAz;
        final MutableInteractionSource mutableInteractionSource4;
        Composer composerKN = composer.KN(713679175);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.n(z4) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function0) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z3;
                        i5 |= composerKN.n(z5) ? 2048 : 1024;
                    }
                    i9 = i3 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i5 |= composerKN.p5(mutableInteractionSource2) ? 16384 : 8192;
                        }
                        if ((196608 & i2) == 0) {
                            if ((i3 & 32) == 0) {
                                value = j2;
                                int i12 = composerKN.nr(value) ? 131072 : 65536;
                                i5 |= i12;
                            } else {
                                value = j2;
                            }
                            i5 |= i12;
                        } else {
                            value = j2;
                        }
                        if ((1572864 & i2) == 0) {
                            i10 = i5 | (((i3 & 64) == 0 && composerKN.nr(j3)) ? 1048576 : 524288);
                        } else {
                            i10 = i5;
                        }
                        if ((i3 & 128) == 0) {
                            if ((i2 & 12582912) == 0) {
                                function32 = function3;
                                i10 |= composerKN.E2(function32) ? 8388608 : 4194304;
                            }
                            if (composerKN.HI((i10 & 4793491) == 4793490, i10 & 1)) {
                                composerKN.wTp();
                                modifier3 = modifier2;
                                composer2 = composerKN;
                                z6 = z5;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                j4 = value;
                                j5 = j3;
                            } else {
                                composerKN.e();
                                if ((i2 & 1) == 0 || composerKN.rV9()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        z5 = true;
                                    }
                                    if (i9 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i3 & 32) != 0) {
                                        value = ((Color) composerKN.ty(ContentColorKt.n())).getValue();
                                        i10 &= -458753;
                                    }
                                    j6 = value;
                                    if ((i3 & 64) != 0) {
                                        modifier4 = modifier2;
                                        jAz = Color.az(j6, ContentAlpha.f21745n.nr(composerKN, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        z7 = z5;
                                        i11 = i10 & (-3670017);
                                    } else {
                                        modifier4 = modifier2;
                                        z7 = z5;
                                        i11 = i10;
                                        jAz = j3;
                                    }
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                } else {
                                    composerKN.wTp();
                                    if ((i3 & 32) != 0) {
                                        i10 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i10 &= -3670017;
                                    }
                                    z7 = z5;
                                    j6 = value;
                                    i11 = i10;
                                    modifier4 = modifier2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    jAz = j3;
                                }
                                composerKN.S();
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(713679175, i11, -1, "androidx.compose.material.Tab (Tab.kt:232)");
                                }
                                long j7 = j6;
                                final IndicationNodeFactory indicationNodeFactoryJ2 = RippleKt.J2(true, 0.0f, j7, 2, null);
                                final Function3 function33 = function32;
                                final boolean z9 = z4;
                                int i13 = i11 >> 15;
                                O(j7, jAz, z2, ComposableLambdaKt.nr(-1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
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
                                        if (!composer3.HI((i14 & 3) != 2, i14 & 1)) {
                                            composer3.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-1237246709, i14, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:239)");
                                        }
                                        Modifier modifierKN = SizeKt.KN(SelectableKt.n(modifier4, z9, mutableInteractionSource4, indicationNodeFactoryJ2, z7, Role.mUb(Role.INSTANCE.KN()), function0), 0.0f, 1, null);
                                        Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
                                        Function3 function34 = function33;
                                        MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalRl, horizontalUo, composer3, 54);
                                        int iN = ComposablesKt.n(composer3, 0);
                                        CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                        Modifier modifierO = ComposedModifierKt.O(composer3, modifierKN);
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
                                        Updater.O(composerN, measurePolicyN, companion.t());
                                        Updater.O(composerN, compositionLocalMapIk, companion.O());
                                        Function2 function2Rl = companion.rl();
                                        if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                                            composerN.o(Integer.valueOf(iN));
                                            composerN.az(Integer.valueOf(iN), function2Rl);
                                        }
                                        Updater.O(composerN, modifierO, companion.nr());
                                        function34.invoke(ColumnScopeInstance.f17468n, composer3, 6);
                                        composer3.XQ();
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composerKN, 54), composerKN, ((i11 << 6) & 896) | (i13 & 112) | (i13 & 14) | 3072);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                composer2 = composerKN;
                                j4 = j7;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                j5 = jAz;
                                modifier3 = modifier4;
                                z6 = z7;
                            }
                            scopeUpdateScopeGh = composer2.gh();
                            if (scopeUpdateScopeGh == null) {
                                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$4
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
                                        TabKt.t(z2, function0, modifier3, z6, mutableInteractionSource3, j4, j5, function3, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 |= 12582912;
                        function32 = function3;
                        if (composerKN.HI((i10 & 4793491) == 4793490, i10 & 1)) {
                        }
                        scopeUpdateScopeGh = composer2.gh();
                        if (scopeUpdateScopeGh == null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i2) == 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    function32 = function3;
                    if (composerKN.HI((i10 & 4793491) == 4793490, i10 & 1)) {
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                    }
                }
                z5 = z3;
                i9 = i3 & 16;
                if (i9 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i2) == 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                function32 = function3;
                if (composerKN.HI((i10 & 4793491) == 4793490, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            modifier2 = modifier;
            i8 = i3 & 8;
            if (i8 != 0) {
            }
            z5 = z3;
            i9 = i3 & 16;
            if (i9 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            function32 = function3;
            if (composerKN.HI((i10 & 4793491) == 4793490, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i3 & 8;
        if (i8 != 0) {
        }
        z5 = z3;
        i9 = i3 & 16;
        if (i9 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        function32 = function3;
        if (composerKN.HI((i10 & 4793491) == 4793490, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final long J2(State state) {
        return ((Color) state.getValue()).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ck(Placeable.PlacementScope placementScope, Placeable placeable, int i2) {
        Placeable.PlacementScope.az(placementScope, placeable, 0, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
    }
}
