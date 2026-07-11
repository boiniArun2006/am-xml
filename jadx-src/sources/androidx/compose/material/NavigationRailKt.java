package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
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
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.internal.d;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0082\u0001\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001az\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0090\u0001\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00142\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aR\u0010(\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142&\u0010\u000f\u001a\"\u0012\u0013\u0012\u00110$¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aA\u0010+\u001a\u00020\u000b2\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\f2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0016¢\u0006\u0002\b\f2\b\b\u0001\u0010*\u001a\u00020$H\u0003¢\u0006\u0004\b+\u0010,\u001a&\u00103\u001a\u000202*\u00020-2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a8\u00106\u001a\u000202*\u00020-2\u0006\u00105\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\b\b\u0001\u0010*\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020$088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00109\"\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;\"\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010;\"\u0014\u0010>\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010;\"\u0014\u0010?\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010;\"\u0014\u0010A\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010;\"\u0014\u0010C\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010;\"\u0014\u0010F\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\f\u0010'\u001a\u00020$8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "header", AppLovinEventTypes.USER_VIEWED_CONTENT, "rl", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", c.f62177j, "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "t", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "activeColor", "inactiveColor", "", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "animationProgress", "O", "(JJZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "iconPositionAnimationProgress", "nr", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "ty", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;J)Landroidx/compose/ui/layout/MeasureResult;", "labelPlaceable", "HI", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;JF)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/animation/core/TweenSpec;", "Landroidx/compose/animation/core/TweenSpec;", "NavigationRailAnimationSpec", "F", "NavigationRailItemSize", "NavigationRailItemCompactSize", "NavigationRailPadding", "HeaderPadding", "J2", "ItemLabelBaselineBottomOffset", "Uo", "ItemIconTopOffset", "KN", "Landroidx/compose/foundation/layout/WindowInsets;", "ZeroInsets", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,450:1\n75#2:451\n71#3:452\n69#3,5:453\n74#3:486\n78#3:490\n71#3:528\n68#3,6:529\n74#3:563\n78#3:567\n71#3:568\n68#3,6:569\n74#3:603\n78#3:607\n79#4,6:458\n86#4,4:473\n90#4,2:483\n94#4:489\n79#4:497\n77#4,8:498\n86#4,4:515\n90#4,2:525\n79#4,6:535\n86#4,4:550\n90#4,2:560\n94#4:566\n79#4,6:575\n86#4,4:590\n90#4,2:600\n94#4:606\n94#4:610\n368#5,9:464\n377#5:485\n378#5,2:487\n368#5,9:506\n377#5:527\n368#5,9:541\n377#5:562\n378#5,2:564\n368#5,9:581\n377#5:602\n378#5,2:604\n378#5,2:608\n4034#6,6:477\n4034#6,6:519\n4034#6,6:554\n4034#6,6:594\n1247#7,6:491\n85#8:611\n149#9:612\n149#9:613\n149#9:614\n149#9:615\n149#9:616\n149#9:617\n149#9:618\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailKt\n*L\n214#1:451\n231#1:452\n231#1:453,5\n231#1:486\n231#1:490\n323#1:528\n323#1:529,6\n323#1:563\n323#1:567\n325#1:568\n325#1:569,6\n325#1:603\n325#1:607\n231#1:458,6\n231#1:473,4\n231#1:483,2\n231#1:489\n322#1:497\n322#1:498,8\n322#1:515,4\n322#1:525,2\n323#1:535,6\n323#1:550,4\n323#1:560,2\n323#1:566\n325#1:575,6\n325#1:590,4\n325#1:600,2\n325#1:606\n322#1:610\n231#1:464,9\n231#1:485\n231#1:487,2\n322#1:506,9\n322#1:527\n323#1:541,9\n323#1:562\n323#1:564,2\n325#1:581,9\n325#1:602\n325#1:604,2\n322#1:608,2\n231#1:477,6\n322#1:519,6\n323#1:554,6\n325#1:594,6\n327#1:491,6\n291#1:611\n427#1:612\n430#1:613\n433#1:614\n439#1:615\n442#1:616\n447#1:617\n449#1:618\n*E\n"})
public final class NavigationRailKt {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f22295O;
    private static final float nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TweenSpec f22296n = new TweenSpec(d.f62986a, 0, EasingKt.nr(), 2, null);
    private static final float rl = Dp.KN(72);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f22297t = Dp.KN(56);
    private static final float J2 = Dp.KN(16);
    private static final float Uo = Dp.KN(14);
    private static final WindowInsets KN = WindowInsetsKt.t(Dp.KN(0), 0.0f, 0.0f, 0.0f, 14, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final Function2 function2, final Function2 function22, final float f3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1903861684);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function22) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1903861684, i3, -1, "androidx.compose.material.NavigationRailItemBaselineLayout (NavigationRail.kt:320)");
            }
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        Placeable placeableDR0;
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            Measurable measurable = (Measurable) list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), "icon")) {
                                Placeable placeableDR02 = measurable.dR0(j2);
                                if (function22 != null) {
                                    int size2 = list.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        Measurable measurable2 = (Measurable) list.get(i7);
                                        if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), "label")) {
                                            placeableDR0 = measurable2.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null));
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                placeableDR0 = null;
                                Placeable placeable = placeableDR0;
                                if (function22 == null) {
                                    return NavigationRailKt.ty(measureScope, placeableDR02, j2);
                                }
                                Intrinsics.checkNotNull(placeable);
                                return NavigationRailKt.HI(measureScope, placeable, placeableDR02, j2, f3);
                            }
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
            function2.invoke(composerKN, Integer.valueOf(i3 & 14));
            composerKN.XQ();
            if (function22 != null) {
                composerKN.eF(531629965);
                Modifier modifierN = AlphaKt.n(LayoutIdKt.rl(companion, "label"), f3);
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
                function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(531729909);
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
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItemBaselineLayout$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    NavigationRailKt.nr(function2, function22, f3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    static {
        float f3 = 8;
        nr = Dp.KN(f3);
        f22295O = Dp.KN(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final long j2, final long j3, final boolean z2, final Function3 function3, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-207161906);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j3) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        if (composerKN.HI((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-207161906, i3, -1, "androidx.compose.material.NavigationRailTransition (NavigationRail.kt:288)");
            }
            final State stateNr = AnimateAsStateKt.nr(z2 ? 1.0f : 0.0f, f22296n, 0.0f, null, null, composerKN, 48, 28);
            long jKN = ColorKt.KN(j3, j2, J2(stateNr));
            CompositionLocalKt.t(new ProvidedValue[]{ContentColorKt.n().nr(Color.xMQ(Color.az(jKN, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.n().nr(Float.valueOf(Color.ck(jKN)))}, ComposableLambdaKt.nr(-1688205042, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    if (!composer2.HI((i5 & 3) != 2, i5 & 1)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1688205042, i5, -1, "androidx.compose.material.NavigationRailTransition.<anonymous> (NavigationRail.kt:301)");
                    }
                    function3.invoke(Float.valueOf(NavigationRailKt.J2(stateNr)), composer2, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailTransition$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i5) {
                    NavigationRailKt.O(j2, j3, z2, function3, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(Modifier modifier, long j2, long j3, float f3, Function3 function3, final Function3 function32, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        long jTy;
        long j4;
        float fN;
        int i7;
        Function3 function33;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f4;
        final Function3 function34;
        ScopeUpdateScope scopeUpdateScopeGh;
        float f5;
        Function3 function35;
        int i8;
        Modifier modifier4;
        long j7;
        long j9;
        int i9;
        Composer composerKN = composer.KN(1790971523);
        int i10 = i3 & 1;
        if (i10 != 0) {
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
                jTy = j2;
                int i11 = composerKN.nr(jTy) ? 32 : 16;
                i5 |= i11;
            } else {
                jTy = j2;
            }
            i5 |= i11;
        } else {
            jTy = j2;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i3 & 4) == 0) {
                j4 = j3;
                int i12 = composerKN.nr(j4) ? 256 : 128;
                i5 |= i12;
            } else {
                j4 = j3;
            }
            i5 |= i12;
        } else {
            j4 = j3;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i5 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                fN = f3;
                i5 |= composerKN.rl(fN) ? 2048 : 1024;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function33 = function3;
                    i5 |= composerKN.E2(function33) ? 16384 : 8192;
                }
                if ((i3 & 32) == 0) {
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.E2(function32) ? 131072 : 65536;
                    }
                    if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier3 = modifier2;
                        j5 = jTy;
                        j6 = j4;
                        f4 = fN;
                        function34 = function33;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier5 = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 2) != 0) {
                                i5 &= -113;
                                jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                            }
                            if ((i3 & 4) != 0) {
                                long jRl = ColorsKt.rl(jTy, composerKN, (i5 >> 3) & 14);
                                i5 &= -897;
                                j4 = jRl;
                            }
                            if (i13 != 0) {
                                fN = NavigationRailDefaults.f22294n.n();
                            }
                            if (i7 != 0) {
                                function35 = null;
                                j7 = jTy;
                                f5 = fN;
                                i8 = 6;
                                modifier4 = modifier5;
                            } else {
                                f5 = fN;
                                function35 = function33;
                                i8 = 6;
                                modifier4 = modifier5;
                                j7 = jTy;
                            }
                            j9 = j4;
                            i9 = 1790971523;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 2) != 0) {
                                i5 &= -113;
                            }
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            f5 = fN;
                            function35 = function33;
                            i8 = 6;
                            i9 = 1790971523;
                            modifier4 = modifier2;
                            j7 = jTy;
                            j9 = j4;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i9, i5, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:174)");
                        }
                        int i14 = i5 << 3;
                        composer2 = composerKN;
                        rl(KN, modifier4, j7, j9, f5, function35, function32, composer2, i8 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier3 = modifier4;
                        j5 = j7;
                        j6 = j9;
                        f4 = f5;
                        function34 = function35;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$3
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
                                NavigationRailKt.n(modifier3, j5, j6, f4, function34, function32, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function33 = function3;
            if ((i3 & 32) == 0) {
            }
            if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        fN = f3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        function33 = function3;
        if ((i3 & 32) == 0) {
        }
        if (composerKN.HI((74899 & i5) == 74898, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final WindowInsets windowInsets, Modifier modifier, long j2, long j3, float f3, Function3 function3, final Function3 function32, Composer composer, final int i2, final int i3) {
        int i5;
        long jTy;
        long jRl;
        int i7;
        float f4;
        int i8;
        Function3 function33;
        Composer composer2;
        final Modifier modifier2;
        final long j4;
        final long j5;
        final float f5;
        final Function3 function34;
        ScopeUpdateScope scopeUpdateScopeGh;
        float f6;
        long j6;
        long j7;
        Modifier modifier3;
        int i9;
        Composer composerKN = composer.KN(-1389243291);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(windowInsets) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.p5(modifier) ? 32 : 16;
            }
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                if ((i3 & 4) == 0) {
                    jTy = j2;
                    int i11 = composerKN.nr(jTy) ? 256 : 128;
                    i5 |= i11;
                } else {
                    jTy = j2;
                }
                i5 |= i11;
            } else {
                jTy = j2;
            }
            if ((i2 & 3072) != 0) {
                jRl = j3;
                i5 |= ((i3 & 8) == 0 && composerKN.nr(jRl)) ? 2048 : 1024;
            } else {
                jRl = j3;
            }
            i7 = i3 & 16;
            if (i7 == 0) {
                i5 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    f4 = f3;
                    i5 |= composerKN.rl(f4) ? 16384 : 8192;
                }
                i8 = i3 & 32;
                if (i8 == 0) {
                    if ((196608 & i2) == 0) {
                        function33 = function3;
                        i5 |= composerKN.E2(function33) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerKN.E2(function32) ? 1048576 : 524288;
                    }
                    if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier2 = modifier;
                        j4 = jTy;
                        j5 = jRl;
                        f5 = f4;
                        function34 = function33;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jRl = ColorsKt.rl(jTy, composerKN, (i5 >> 6) & 14);
                                i5 &= -7169;
                            }
                            float fN = i7 != 0 ? NavigationRailDefaults.f22294n.n() : f4;
                            if (i8 != 0) {
                                function34 = null;
                                f6 = fN;
                                j6 = jTy;
                            } else {
                                f6 = fN;
                                j6 = jTy;
                                function34 = function33;
                            }
                            j7 = jRl;
                            modifier3 = modifier4;
                            i9 = -1389243291;
                        } else {
                            composerKN.wTp();
                            if ((i3 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i5 &= -7169;
                            }
                            f6 = f4;
                            function34 = function33;
                            i9 = -1389243291;
                            j6 = jTy;
                            j7 = jRl;
                            modifier3 = modifier;
                        }
                        composerKN.S();
                        if (ComposerKt.v()) {
                            ComposerKt.p5(i9, i5, -1, "androidx.compose.material.NavigationRail (NavigationRail.kt:109)");
                        }
                        composer2 = composerKN;
                        SurfaceKt.n(modifier3, null, j6, j7, null, f6, ComposableLambdaKt.nr(-245908831, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$1
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
                                    ComposerKt.p5(-245908831, i12, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:116)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierN = SelectableGroupKt.n(PaddingKt.gh(WindowInsetsPaddingKt.nr(SizeKt.nr(companion, 0.0f, 1, null), windowInsets), 0.0f, NavigationRailKt.nr, 1, null));
                                Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                                Function3 function35 = function34;
                                Function3 function36 = function32;
                                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer3, 48);
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
                                if (function35 != null) {
                                    composer3.eF(-1453937351);
                                    function35.invoke(columnScopeInstance, composer3, 6);
                                    SpacerKt.n(SizeKt.xMQ(companion, NavigationRailKt.f22295O), composer3, 6);
                                    composer3.Xw();
                                } else {
                                    composer3.eF(-1453846056);
                                    composer3.Xw();
                                }
                                function36.invoke(columnScopeInstance, composer3, 6);
                                composer3.XQ();
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54), composer2, ((i5 >> 3) & 14) | 1572864 | (i5 & 896) | (i5 & 7168) | ((i5 << 3) & 458752), 18);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                        modifier2 = modifier3;
                        j4 = j6;
                        j5 = j7;
                        f5 = f6;
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRail$2
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
                                NavigationRailKt.rl(windowInsets, modifier2, j4, j5, f5, function34, function32, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 196608;
                function33 = function3;
                if ((i3 & 64) == 0) {
                }
                if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            f4 = f3;
            i8 = i3 & 32;
            if (i8 == 0) {
            }
            function33 = function3;
            if ((i3 & 64) == 0) {
            }
            if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        f4 = f3;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        function33 = function3;
        if ((i3 & 64) == 0) {
        }
        if (composerKN.HI((i5 & 599187) == 599186, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final boolean z2, final Function0 function0, final Function2 function2, Modifier modifier, boolean z3, Function2 function22, boolean z4, MutableInteractionSource mutableInteractionSource, long j2, long j3, Composer composer, final int i2, final int i3) {
        boolean z5;
        int i5;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        boolean z6;
        final Function2 function23;
        int i10;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        long jMUb;
        int i12;
        int i13;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource3;
        final Function2 function24;
        final long j4;
        final boolean z7;
        final boolean z9;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Modifier modifier3;
        boolean z10;
        final boolean z11;
        long jAz;
        Modifier modifier4;
        Composer composerKN = composer.KN(-1813548445);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            z5 = z2;
        } else if ((i2 & 6) == 0) {
            z5 = z2;
            i5 = (composerKN.n(z5) ? 4 : 2) | i2;
        } else {
            z5 = z2;
            i5 = i2;
        }
        if ((2 & i3) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function0) ? 32 : 16;
            }
            if ((4 & i3) == 0) {
                i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i5 |= composerKN.E2(function2) ? 256 : 128;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
                }
                i8 = 16 & i3;
                if (i8 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerKN.n(z3) ? 16384 : 8192;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    i5 |= 196608;
                    z6 = true;
                    function23 = function22;
                } else {
                    z6 = true;
                    function23 = function22;
                    if ((i2 & 196608) == 0) {
                        i5 |= composerKN.E2(function23) ? 131072 : 65536;
                    }
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.n(z4) ? 1048576 : 524288;
                }
                i11 = 128 & i3;
                if (i11 != 0) {
                    i5 |= 12582912;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 12582912) == 0) {
                        i5 |= composerKN.p5(mutableInteractionSource2) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 100663296) == 0) {
                    i12 = i11;
                    jMUb = j2;
                    i5 |= ((i3 & 256) == 0 && composerKN.nr(jMUb)) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                } else {
                    jMUb = j2;
                    i12 = i11;
                }
                if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                    i13 = i8;
                    i5 |= ((i3 & 512) == 0 && composerKN.nr(j3)) ? 536870912 : 268435456;
                } else {
                    i13 = i8;
                }
                if (composerKN.HI((i5 & 306783379) != 306783378 ? z6 : false, i5 & 1)) {
                    composerKN.e();
                    ComposableLambda composableLambdaNr = null;
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        z10 = i13 != 0 ? z6 : z3;
                        if (i9 != 0) {
                            function23 = null;
                        }
                        boolean z12 = i10 != 0 ? z6 : z4;
                        if (i12 != 0) {
                            mutableInteractionSource2 = null;
                        }
                        if ((256 & i3) != 0) {
                            jMUb = MaterialTheme.f22169n.n(composerKN, 6).mUb();
                            i5 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i5 &= -1879048193;
                            z11 = z12;
                            jAz = Color.az(((Color) composerKN.ty(ContentColorKt.n())).getValue(), ContentAlpha.f21745n.nr(composerKN, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            z11 = z12;
                            jAz = j3;
                        }
                    } else {
                        composerKN.wTp();
                        if ((256 & i3) != 0) {
                            i5 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i5 &= -1879048193;
                        }
                        z11 = z4;
                        jAz = j3;
                        modifier3 = modifier2;
                        z10 = z3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1813548445, i5, -1, "androidx.compose.material.NavigationRailItem (NavigationRail.kt:214)");
                    }
                    if (function23 == null) {
                        composerKN.eF(1653280754);
                        composerKN.Xw();
                        modifier4 = modifier3;
                    } else {
                        composerKN.eF(1653280755);
                        modifier4 = modifier3;
                        composableLambdaNr = ComposableLambdaKt.nr(-180398615, z6, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
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
                                    ComposerKt.p5(-180398615, i14, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:218)");
                                }
                                TextKt.n(TextStyle.t(MaterialTheme.f22169n.t(composer3, 6).getCaption(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.n(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function23, composer3, 0);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }
                        }, composerKN, 54);
                        composerKN.Xw();
                    }
                    final ComposableLambda composableLambda = composableLambdaNr;
                    Modifier modifier5 = modifier4;
                    boolean z13 = z10;
                    modifier2 = modifier5;
                    Modifier modifierZ = SizeKt.Z(SelectableKt.n(modifier5, z5, mutableInteractionSource2, RippleKt.J2(false, 0.0f, jMUb, 2, null), z13, Role.mUb(Role.INSTANCE.KN()), function0), function23 == null ? f22297t : rl);
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.O(), false);
                    int iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierZ);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
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
                    long j6 = jMUb;
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    ComposableLambda composableLambdaNr2 = ComposableLambdaKt.nr(670576792, true, new Function3<Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Float f3, Composer composer3, Integer num) {
                            n(f3.floatValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(float f3, Composer composer3, int i14) {
                            if ((i14 & 6) == 0) {
                                i14 |= composer3.rl(f3) ? 4 : 2;
                            }
                            if (!composer3.HI((i14 & 19) != 18, i14 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(670576792, i14, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:245)");
                            }
                            if (z11) {
                                f3 = 1.0f;
                            }
                            NavigationRailKt.nr(function2, composableLambda, f3, composer3, 0);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54);
                    int i14 = i5 >> 24;
                    long j7 = jAz;
                    O(j6, j7, z2, composableLambdaNr2, composerKN, (i14 & 112) | (i14 & 14) | 3072 | ((i5 << 6) & 896));
                    composer2 = composerKN;
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    z7 = z13;
                    j5 = j7;
                    function24 = function23;
                    j4 = j6;
                    mutableInteractionSource3 = mutableInteractionSource4;
                    z9 = z11;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    mutableInteractionSource3 = mutableInteractionSource2;
                    function24 = function23;
                    j4 = jMUb;
                    z7 = z3;
                    z9 = z4;
                    j5 = j3;
                }
                final Modifier modifier6 = modifier2;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.NavigationRailKt$NavigationRailItem$2
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
                            NavigationRailKt.t(z2, function0, function2, modifier6, z7, function24, z9, mutableInteractionSource3, j4, j5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 3072;
            modifier2 = modifier;
            i8 = 16 & i3;
            if (i8 != 0) {
            }
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i10 = i3 & 64;
            if (i10 != 0) {
            }
            i11 = 128 & i3;
            if (i11 != 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            }
            if (composerKN.HI((i5 & 306783379) != 306783378 ? z6 : false, i5 & 1)) {
            }
            final Modifier modifier62 = modifier2;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        if ((4 & i3) == 0) {
        }
        i7 = i3 & 8;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = 16 & i3;
        if (i8 != 0) {
        }
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        i11 = 128 & i3;
        if (i11 != 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
        }
        if (composerKN.HI((i5 & 306783379) != 306783378 ? z6 : false, i5 & 1)) {
        }
        final Modifier modifier622 = modifier2;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult HI(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, long j2, final float f3) {
        final int iGh = (Constraints.gh(j2) - placeable.z(AlignmentLineKt.rl())) - measureScope.How(J2);
        final int iQie = (Constraints.qie(j2) - placeable.getWidth()) / 2;
        final int iHow = measureScope.How(Uo);
        int iGh2 = (Constraints.gh(j2) - placeable2.getHeight()) / 2;
        final int iQie2 = (Constraints.qie(j2) - placeable2.getWidth()) / 2;
        final int iRoundToInt = MathKt.roundToInt((iGh2 - iHow) * (1 - f3));
        return MeasureScope.ER(measureScope, Constraints.qie(j2), Constraints.gh(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeLabelAndIcon$1
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
                if (f3 != 0.0f) {
                    Placeable.PlacementScope.az(placementScope, placeable, iQie, iGh + iRoundToInt, 0.0f, 4, null);
                }
                Placeable.PlacementScope.az(placementScope, placeable2, iQie2, iHow + iRoundToInt, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float J2(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ty(MeasureScope measureScope, final Placeable placeable, long j2) {
        final int iMax = Math.max(0, (Constraints.qie(j2) - placeable.getWidth()) / 2);
        final int iMax2 = Math.max(0, (Constraints.gh(j2) - placeable.getHeight()) / 2);
        return MeasureScope.ER(measureScope, Constraints.qie(j2), Constraints.gh(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.NavigationRailKt$placeIcon$1
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
                Placeable.PlacementScope.az(placementScope, placeable, iMax, iMax2, 0.0f, 4, null);
            }
        }, 4, null);
    }
}
