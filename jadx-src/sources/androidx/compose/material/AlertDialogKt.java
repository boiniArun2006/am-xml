package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a{\u0010\r\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0010\u001a\u00020\u0001*\u00020\u000f2\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", "title", "text", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "rl", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", c.f62177j, "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "TitlePadding", "TextPadding", "Landroidx/compose/ui/unit/TextUnit;", "J", "TitleBaselineDistanceFromTop", "nr", "TextBaselineDistanceFromTitle", "O", "TextBaselineDistanceFromTop", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,452:1\n79#2,6:453\n86#2,4:468\n90#2,2:478\n79#2,6:488\n86#2,4:503\n90#2,2:513\n94#2:519\n79#2,6:528\n86#2,4:543\n90#2,2:553\n94#2:559\n94#2:563\n79#2:570\n77#2,8:571\n86#2,4:588\n90#2,2:598\n94#2:603\n368#3,9:459\n377#3:480\n368#3,9:494\n377#3:515\n378#3,2:517\n368#3,9:534\n377#3:555\n378#3,2:557\n378#3,2:561\n368#3,9:579\n377#3,3:600\n4034#4,6:472\n4034#4,6:507\n4034#4,6:547\n4034#4,6:592\n71#5:481\n68#5,6:482\n74#5:516\n78#5:520\n71#5:521\n68#5,6:522\n74#5:556\n78#5:560\n1247#6,6:564\n149#7:604\n149#7:605\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt\n*L\n251#1:453,6\n251#1:468,4\n251#1:478,2\n254#1:488,6\n254#1:503,4\n254#1:513,2\n254#1:519\n257#1:528,6\n257#1:543,4\n257#1:553,2\n257#1:559\n251#1:563\n353#1:570\n353#1:571,8\n353#1:588,4\n353#1:598,2\n353#1:603\n251#1:459,9\n251#1:480\n254#1:494,9\n254#1:515\n254#1:517,2\n257#1:534,9\n257#1:555\n257#1:557,2\n251#1:561,2\n353#1:579,9\n353#1:600,3\n251#1:472,6\n254#1:507,6\n257#1:547,6\n353#1:592,6\n254#1:481\n254#1:482,6\n254#1:516\n254#1:520\n257#1:521\n257#1:522,6\n257#1:556\n257#1:560\n353#1:564,6\n443#1:604\n444#1:605\n*E\n"})
public final class AlertDialogKt {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f21019O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Modifier f21020n;
    private static final long nr;
    private static final Modifier rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f21021t;

    public static final void n(final ColumnScope columnScope, final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-555573207);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(function22) ? 256 : 128;
        }
        if (composerKN.HI((i3 & 147) != 146, 1 & i3)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-555573207, i3, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:249)");
            }
            Modifier modifierN = columnScope.n(Modifier.INSTANCE, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                    Object obj;
                    Object obj2;
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    final int i5;
                    int size = list.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            obj = null;
                            break;
                        }
                        obj = list.get(i7);
                        if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj), "title")) {
                            break;
                        }
                        i7++;
                    }
                    Measurable measurable = (Measurable) obj;
                    final Placeable placeableDR0 = measurable != null ? measurable.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null)) : null;
                    int size2 = list.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size2) {
                            obj2 = null;
                            break;
                        }
                        obj2 = list.get(i8);
                        if (Intrinsics.areEqual(LayoutIdKt.n((Measurable) obj2), "text")) {
                            break;
                        }
                        i8++;
                    }
                    Measurable measurable2 = (Measurable) obj2;
                    final Placeable placeableDR02 = measurable2 != null ? measurable2.dR0(Constraints.nr(j2, 0, 0, 0, 0, 11, null)) : null;
                    int iMax = Math.max(placeableDR0 != null ? placeableDR0.getWidth() : 0, placeableDR02 != null ? placeableDR02.getWidth() : 0);
                    if (placeableDR0 == null) {
                        iIntValue = 0;
                    } else {
                        int iIntValue4 = Integer.valueOf(placeableDR0.z(AlignmentLineKt.n())).intValue();
                        Integer numValueOf = iIntValue4 == Integer.MIN_VALUE ? null : Integer.valueOf(iIntValue4);
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        }
                    }
                    if (placeableDR0 == null) {
                        iIntValue2 = 0;
                    } else {
                        int iZ = placeableDR0.z(AlignmentLineKt.rl());
                        Integer numValueOf2 = iZ == Integer.MIN_VALUE ? null : Integer.valueOf(iZ);
                        if (numValueOf2 != null) {
                            iIntValue2 = numValueOf2.intValue();
                        }
                    }
                    final int iI4p = measureScope.I4p(AlertDialogKt.f21021t) - iIntValue;
                    if (placeableDR02 == null) {
                        iIntValue3 = 0;
                    } else {
                        int iZ2 = placeableDR02.z(AlignmentLineKt.n());
                        Integer numValueOf3 = iZ2 != Integer.MIN_VALUE ? Integer.valueOf(iZ2) : null;
                        if (numValueOf3 != null) {
                            iIntValue3 = numValueOf3.intValue();
                        }
                    }
                    int iI4p2 = placeableDR0 == null ? measureScope.I4p(AlertDialogKt.f21019O) : measureScope.I4p(AlertDialogKt.nr);
                    int height = placeableDR0 != null ? placeableDR0.getHeight() + iI4p : 0;
                    if (placeableDR0 == null) {
                        i5 = iI4p2 - iIntValue3;
                    } else {
                        i5 = (iIntValue2 == 0 ? height - iIntValue3 : (iI4p + iIntValue2) - iIntValue3) + iI4p2;
                    }
                    if (placeableDR02 != null) {
                        if (iIntValue2 == 0) {
                            height = (placeableDR02.getHeight() + iI4p2) - iIntValue3;
                        } else {
                            height = ((placeableDR02.getHeight() + iI4p2) - iIntValue3) - ((placeableDR0 != null ? placeableDR0.getHeight() : 0) - iIntValue2);
                        }
                    }
                    return MeasureScope.ER(measureScope, iMax, height + height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.1
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
                            Placeable placeable = placeableDR0;
                            if (placeable != null) {
                                placementScope2 = placementScope;
                                Placeable.PlacementScope.xMQ(placementScope2, placeable, 0, iI4p, 0.0f, 4, null);
                            } else {
                                placementScope2 = placementScope;
                            }
                            Placeable placeable2 = placeableDR02;
                            if (placeable2 != null) {
                                Placeable.PlacementScope.xMQ(placementScope2, placeable2, 0, i5, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
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
            Updater.O(composerN, alertDialogKt$AlertDialogBaselineLayout$2, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            if (function2 == null) {
                composerKN.eF(1317321954);
            } else {
                composerKN.eF(1317321955);
                Modifier modifierRl = LayoutIdKt.rl(f21020n, "title");
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Modifier modifierT = columnScope.t(modifierRl, companion2.gh());
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT);
                Function0 function0N2 = companion.n();
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
                Updater.O(composerN2, measurePolicyUo, companion.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion.O());
                Function2 function2Rl2 = companion.rl();
                if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                function2.invoke(composerKN, 0);
                composerKN.XQ();
            }
            composerKN.Xw();
            if (function22 == null) {
                composerKN.eF(1317454758);
            } else {
                composerKN.eF(1317454759);
                Modifier modifierRl2 = LayoutIdKt.rl(rl, "text");
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Modifier modifierT2 = columnScope.t(modifierRl2, companion3.gh());
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                int iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierT2);
                Function0 function0N3 = companion.n();
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
                Updater.O(composerN3, measurePolicyUo2, companion.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion.O());
                Function2 function2Rl3 = companion.rl();
                if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                function22.invoke(composerKN, 0);
                composerKN.XQ();
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
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
                    AlertDialogKt.n(columnScope, function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f3 = 24;
        f21020n = PaddingKt.az(companion, Dp.KN(f3), 0.0f, Dp.KN(f3), 0.0f, 10, null);
        rl = PaddingKt.az(companion, Dp.KN(f3), 0.0f, Dp.KN(f3), Dp.KN(28), 2, null);
        f21021t = TextUnitKt.KN(40);
        nr = TextUnitKt.KN(36);
        f21019O = TextUnitKt.KN(38);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j2, long j3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        final Function2 function24;
        int i8;
        final Function2 function25;
        Shape medium;
        long jTy;
        int i9;
        long jRl;
        int i10;
        Composer composer2;
        final Modifier modifier3;
        final Function2 function26;
        final Function2 function27;
        final Shape shape2;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i11;
        int i12;
        Composer composerKN = composer.KN(-453679601);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
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
                    function24 = function22;
                    i5 |= composerKN.E2(function24) ? 256 : 128;
                }
                i8 = i3 & 8;
                if (i8 == 0) {
                    if ((i2 & 3072) == 0) {
                        function25 = function23;
                        i5 |= composerKN.E2(function25) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            medium = shape;
                            int i14 = composerKN.p5(medium) ? 16384 : 8192;
                            i5 |= i14;
                        } else {
                            medium = shape;
                        }
                        i5 |= i14;
                    } else {
                        medium = shape;
                    }
                    if ((196608 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            jTy = j2;
                            int i15 = composerKN.nr(jTy) ? 131072 : 65536;
                            i5 |= i15;
                        } else {
                            jTy = j2;
                        }
                        i5 |= i15;
                    } else {
                        jTy = j2;
                    }
                    if ((i2 & 1572864) != 0) {
                        i9 = 1572864;
                        if ((i3 & 64) == 0) {
                            jRl = j3;
                            int i16 = composerKN.nr(jRl) ? 1048576 : 524288;
                            i5 |= i16;
                        } else {
                            jRl = j3;
                        }
                        i5 |= i16;
                    } else {
                        i9 = 1572864;
                        jRl = j3;
                    }
                    i10 = i5;
                    if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                        composer2 = composerKN;
                        composer2.wTp();
                        modifier3 = modifier2;
                        function26 = function24;
                        function27 = function25;
                        shape2 = medium;
                        j4 = jTy;
                        j5 = jRl;
                    } else {
                        composerKN.e();
                        if ((i2 & 1) == 0 || composerKN.rV9()) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i7 != 0) {
                                function24 = null;
                            }
                            if (i8 != 0) {
                                function25 = null;
                            }
                            if ((i3 & 16) != 0) {
                                i11 = i10 & (-57345);
                                medium = MaterialTheme.f22169n.rl(composerKN, 6).getMedium();
                            } else {
                                i11 = i10;
                            }
                            if ((i3 & 32) != 0) {
                                jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                                i12 = i11 & (-458753);
                            } else {
                                i12 = i11;
                            }
                            if ((i3 & 64) != 0) {
                                jRl = ColorsKt.rl(jTy, composerKN, (i12 >> 15) & 14);
                                i12 &= -3670017;
                            }
                            long j6 = jRl;
                            long j7 = jTy;
                            Shape shape3 = medium;
                            Modifier modifier4 = modifier2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-453679601, i12, -1, "androidx.compose.material.AlertDialogContent (AlertDialog.kt:203)");
                            }
                            int i17 = ((i12 >> 3) & 14) | i9;
                            int i18 = i12 >> 9;
                            composer2 = composerKN;
                            SurfaceKt.n(modifier4, shape3, j7, j6, null, 0.0f, ComposableLambdaKt.nr(629950291, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    ComposableLambda composableLambdaNr;
                                    if (!composer3.HI((i19 & 3) != 2, i19 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(629950291, i19, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:210)");
                                    }
                                    final Function2 function28 = function24;
                                    final Function2 function29 = function25;
                                    Function2 function210 = function2;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, companion);
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
                                    ComposableLambda composableLambdaNr2 = null;
                                    if (function28 == null) {
                                        composer3.eF(-366997612);
                                        composer3.Xw();
                                        composableLambdaNr = null;
                                    } else {
                                        composer3.eF(-366997611);
                                        composableLambdaNr = ComposableLambdaKt.nr(620104160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i20) {
                                                if (!composer4.HI((i20 & 3) != 2, i20 & 1)) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(620104160, i20, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:215)");
                                                }
                                                ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composer4, 6)));
                                                final Function2 function211 = function28;
                                                CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(770166432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        n(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer5, int i21) {
                                                        if (!composer5.HI((i21 & 3) != 2, i21 & 1)) {
                                                            composer5.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(770166432, i21, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:216)");
                                                        }
                                                        TextKt.n(MaterialTheme.f22169n.t(composer5, 6).getSubtitle1(), function211, composer5, 0);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, ProvidedValue.xMQ | 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.Xw();
                                    }
                                    if (function29 == null) {
                                        composer3.eF(-366576167);
                                    } else {
                                        composer3.eF(-366576166);
                                        composableLambdaNr2 = ComposableLambdaKt.nr(1965858367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i20) {
                                                if (!composer4.HI((i20 & 3) != 2, i20 & 1)) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1965858367, i20, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:224)");
                                                }
                                                ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.nr(composer4, 6)));
                                                final Function2 function211 = function29;
                                                CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(2115920639, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        n(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer5, int i21) {
                                                        if (!composer5.HI((i21 & 3) != 2, i21 & 1)) {
                                                            composer5.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(2115920639, i21, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:227)");
                                                        }
                                                        TextKt.n(MaterialTheme.f22169n.t(composer5, 6).getBody2(), function211, composer5, 0);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, ProvidedValue.xMQ | 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                    }
                                    composer3.Xw();
                                    AlertDialogKt.n(columnScopeInstance, composableLambdaNr, composableLambdaNr2, composer3, 6);
                                    function210.invoke(composer3, 0);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, i17 | (i18 & 112) | (i18 & 896) | (i18 & 7168), 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function26 = function24;
                            function27 = function25;
                            modifier3 = modifier4;
                            shape2 = shape3;
                            j4 = j7;
                            j5 = j6;
                        } else {
                            composerKN.wTp();
                            i12 = (i3 & 16) != 0 ? i10 & (-57345) : i10;
                            if ((i3 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            long j62 = jRl;
                            long j72 = jTy;
                            Shape shape32 = medium;
                            Modifier modifier42 = modifier2;
                            composerKN.S();
                            if (ComposerKt.v()) {
                            }
                            int i172 = ((i12 >> 3) & 14) | i9;
                            int i182 = i12 >> 9;
                            composer2 = composerKN;
                            SurfaceKt.n(modifier42, shape32, j72, j62, null, 0.0f, ComposableLambdaKt.nr(629950291, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i19) {
                                    ComposableLambda composableLambdaNr;
                                    if (!composer3.HI((i19 & 3) != 2, i19 & 1)) {
                                        composer3.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(629950291, i19, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:210)");
                                    }
                                    final Function2 function28 = function24;
                                    final Function2 function29 = function25;
                                    Function2 function210 = function2;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer3, 0);
                                    int iN = ComposablesKt.n(composer3, 0);
                                    CompositionLocalMap compositionLocalMapIk = composer3.Ik();
                                    Modifier modifierO = ComposedModifierKt.O(composer3, companion);
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
                                    ComposableLambda composableLambdaNr2 = null;
                                    if (function28 == null) {
                                        composer3.eF(-366997612);
                                        composer3.Xw();
                                        composableLambdaNr = null;
                                    } else {
                                        composer3.eF(-366997611);
                                        composableLambdaNr = ComposableLambdaKt.nr(620104160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i20) {
                                                if (!composer4.HI((i20 & 3) != 2, i20 & 1)) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(620104160, i20, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:215)");
                                                }
                                                ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composer4, 6)));
                                                final Function2 function211 = function28;
                                                CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(770166432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        n(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer5, int i21) {
                                                        if (!composer5.HI((i21 & 3) != 2, i21 & 1)) {
                                                            composer5.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(770166432, i21, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:216)");
                                                        }
                                                        TextKt.n(MaterialTheme.f22169n.t(composer5, 6).getSubtitle1(), function211, composer5, 0);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, ProvidedValue.xMQ | 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                        composer3.Xw();
                                    }
                                    if (function29 == null) {
                                        composer3.eF(-366576167);
                                    } else {
                                        composer3.eF(-366576166);
                                        composableLambdaNr2 = ComposableLambdaKt.nr(1965858367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                n(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void n(Composer composer4, int i20) {
                                                if (!composer4.HI((i20 & 3) != 2, i20 & 1)) {
                                                    composer4.wTp();
                                                    return;
                                                }
                                                if (ComposerKt.v()) {
                                                    ComposerKt.p5(1965858367, i20, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:224)");
                                                }
                                                ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.nr(composer4, 6)));
                                                final Function2 function211 = function29;
                                                CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(2115920639, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        n(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void n(Composer composer5, int i21) {
                                                        if (!composer5.HI((i21 & 3) != 2, i21 & 1)) {
                                                            composer5.wTp();
                                                            return;
                                                        }
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.p5(2115920639, i21, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:227)");
                                                        }
                                                        TextKt.n(MaterialTheme.f22169n.t(composer5, 6).getBody2(), function211, composer5, 0);
                                                        if (ComposerKt.v()) {
                                                            ComposerKt.M7();
                                                        }
                                                    }
                                                }, composer4, 54), composer4, ProvidedValue.xMQ | 48);
                                                if (ComposerKt.v()) {
                                                    ComposerKt.M7();
                                                }
                                            }
                                        }, composer3, 54);
                                    }
                                    composer3.Xw();
                                    AlertDialogKt.n(columnScopeInstance, composableLambdaNr, composableLambdaNr2, composer3, 6);
                                    function210.invoke(composer3, 0);
                                    composer3.XQ();
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composerKN, 54), composer2, i172 | (i182 & 112) | (i182 & 896) | (i182 & 7168), 48);
                            if (ComposerKt.v()) {
                            }
                            function26 = function24;
                            function27 = function25;
                            modifier3 = modifier42;
                            shape2 = shape32;
                            j4 = j72;
                            j5 = j62;
                        }
                    }
                    scopeUpdateScopeGh = composer2.gh();
                    if (scopeUpdateScopeGh == null) {
                        scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void n(Composer composer3, int i19) {
                                AlertDialogKt.rl(function2, modifier3, function26, function27, shape2, j4, j5, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 3072;
                function25 = function23;
                if ((i2 & 24576) != 0) {
                }
                if ((196608 & i2) != 0) {
                }
                if ((i2 & 1572864) != 0) {
                }
                i10 = i5;
                if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh == null) {
                }
            }
            function24 = function22;
            i8 = i3 & 8;
            if (i8 == 0) {
            }
            function25 = function23;
            if ((i2 & 24576) != 0) {
            }
            if ((196608 & i2) != 0) {
            }
            if ((i2 & 1572864) != 0) {
            }
            i10 = i5;
            if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 == 0) {
        }
        function24 = function22;
        i8 = i3 & 8;
        if (i8 == 0) {
        }
        function25 = function23;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        i10 = i5;
        if (composerKN.HI((i5 & 599187) == 599186, i10 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final void t(final float f3, final float f4, final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i5;
        int i7;
        int i8;
        Composer composerKN = composer.KN(73434452);
        if ((i2 & 6) == 0) {
            if (composerKN.rl(f3)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.rl(f4)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        boolean z4 = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(73434452, i3, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:351)");
            }
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 112) != 32) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object objIF = composerKN.iF();
            if (z5 || objIF == Composer.INSTANCE.n()) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(final MeasureScope measureScope, List list, long j2) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        final ArrayList arrayList3 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList4 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        int i9 = 0;
                        long jRl = ConstraintsKt.rl(0, Constraints.qie(j2), 0, 0, 13, null);
                        float f5 = f3;
                        float f6 = f4;
                        int size = list.size();
                        while (i9 < size) {
                            ArrayList arrayList5 = arrayList;
                            Placeable placeableDR0 = ((Measurable) list.get(i9)).dR0(jRl);
                            long j3 = jRl;
                            float f7 = f6;
                            int i10 = size;
                            int i11 = i9;
                            Ref.IntRef intRef5 = intRef3;
                            intRef3 = intRef5;
                            if (n(arrayList4, intRef5, measureScope, f5, j2, placeableDR0)) {
                                arrayList = arrayList5;
                            } else {
                                arrayList = arrayList5;
                                t(arrayList, intRef2, measureScope, f7, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                            }
                            if (!arrayList4.isEmpty()) {
                                intRef3.element += measureScope.How(f5);
                            }
                            arrayList4.add(placeableDR0);
                            intRef3.element += placeableDR0.getWidth();
                            intRef4.element = Math.max(intRef4.element, placeableDR0.getHeight());
                            i9 = i11 + 1;
                            f6 = f7;
                            jRl = j3;
                            size = i10;
                        }
                        if (!arrayList4.isEmpty()) {
                            t(arrayList, intRef2, measureScope, f4, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                        }
                        final int iQie = Constraints.qie(j2) != Integer.MAX_VALUE ? Constraints.qie(j2) : Math.max(intRef.element, Constraints.ty(j2));
                        int iMax = Math.max(intRef2.element, Constraints.az(j2));
                        final float f8 = f3;
                        final ArrayList arrayList6 = arrayList;
                        return MeasureScope.ER(measureScope, iQie, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$1.2
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
                                List list2 = arrayList6;
                                MeasureScope measureScope2 = measureScope;
                                float f9 = f8;
                                int i12 = iQie;
                                List list3 = arrayList3;
                                int size2 = list2.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    List list4 = (List) list2.get(i13);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        iArr[i14] = ((Placeable) list4.get(i14)).getWidth() + (i14 < CollectionsKt.getLastIndex(list4) ? measureScope2.How(f9) : 0);
                                        i14++;
                                    }
                                    int[] iArr2 = new int[size3];
                                    Arrangement.f17400n.n().rl(measureScope2, i12, iArr, iArr2);
                                    int size4 = list4.size();
                                    for (int i15 = 0; i15 < size4; i15++) {
                                        Placeable.PlacementScope.xMQ(placementScope, (Placeable) list4.get(i15), iArr2[i15], ((Number) list3.get(i13)).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    private static final boolean n(List list, Ref.IntRef intRef, MeasureScope measureScope, float f5, long j2, Placeable placeable) {
                        if (!list.isEmpty() && intRef.element + measureScope.How(f5) + placeable.getWidth() > Constraints.qie(j2)) {
                            return false;
                        }
                        return true;
                    }

                    private static final void t(List list, Ref.IntRef intRef, MeasureScope measureScope, float f5, List list2, List list3, Ref.IntRef intRef2, List list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!list.isEmpty()) {
                            intRef.element += measureScope.How(f5);
                        }
                        list.add(0, CollectionsKt.toList(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int i9 = (i3 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            int i10 = ((i9 << 6) & 896) | 6;
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
            function2.invoke(composerKN, Integer.valueOf((i10 >> 6) & 14));
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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
                    AlertDialogKt.t(f3, f4, function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }
}
