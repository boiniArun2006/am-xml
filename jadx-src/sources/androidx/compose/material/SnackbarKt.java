package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
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
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001ax\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a`\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00032\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001a\u001a\u00020\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001c\u001a\u00020\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d\"\u0014\u0010!\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d\"\u0014\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d\"\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001d\"\u0014\u0010&\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001d\"\u0014\u0010(\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001d\"\u0014\u0010*\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FileUploadManager.f61572j, "", "actionOnNewLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material/SnackbarData;", "snackbarData", "actionColor", "nr", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJFLandroidx/compose/runtime/Composer;II)V", "O", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "text", c.f62177j, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rl", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "J2", "TextEndExtraSpacing", "Uo", "LongButtonVerticalOffset", "KN", "SnackbarMinHeightOneLine", "xMQ", "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,383:1\n149#2:384\n149#2:385\n149#2:386\n149#2:698\n149#2:699\n149#2:700\n149#2:701\n149#2:702\n149#2:703\n149#2:704\n149#2:705\n149#2:706\n79#3:387\n77#3,8:388\n86#3,4:405\n90#3,2:415\n79#3,6:425\n86#3,4:440\n90#3,2:450\n94#3:456\n94#3:460\n79#3,6:468\n86#3,4:483\n90#3,2:493\n79#3,6:504\n86#3,4:519\n90#3,2:529\n94#3:535\n79#3,6:544\n86#3,4:559\n90#3,2:569\n94#3:575\n94#3:579\n79#3,6:587\n86#3,4:602\n90#3,2:612\n79#3,6:622\n86#3,4:637\n90#3,2:647\n94#3:653\n79#3,6:662\n86#3,4:677\n90#3,2:687\n94#3:693\n94#3:697\n368#4,9:396\n377#4:417\n368#4,9:431\n377#4:452\n378#4,2:454\n378#4,2:458\n368#4,9:474\n377#4:495\n368#4,9:510\n377#4:531\n378#4,2:533\n368#4,9:550\n377#4:571\n378#4,2:573\n378#4,2:577\n368#4,9:593\n377#4:614\n368#4,9:628\n377#4:649\n378#4,2:651\n368#4,9:668\n377#4:689\n378#4,2:691\n378#4,2:695\n4034#5,6:409\n4034#5,6:444\n4034#5,6:487\n4034#5,6:523\n4034#5,6:563\n4034#5,6:606\n4034#5,6:641\n4034#5,6:681\n71#6:418\n68#6,6:419\n74#6:453\n78#6:457\n71#6:497\n68#6,6:498\n74#6:532\n78#6:536\n71#6:537\n68#6,6:538\n74#6:572\n78#6:576\n71#6:615\n68#6,6:616\n74#6:650\n78#6:654\n71#6:655\n68#6,6:656\n74#6:690\n78#6:694\n86#7:461\n83#7,6:462\n89#7:496\n93#7:580\n1247#8,6:581\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt\n*L\n93#1:384\n167#1:385\n183#1:386\n374#1:698\n375#1:699\n376#1:700\n377#1:701\n378#1:702\n379#1:703\n380#1:704\n381#1:705\n382#1:706\n239#1:387\n239#1:388,8\n239#1:405,4\n239#1:415,2\n240#1:425,6\n240#1:440,4\n240#1:450,2\n240#1:456\n239#1:460\n293#1:468,6\n293#1:483,4\n293#1:493,2\n302#1:504,6\n302#1:519,4\n302#1:529,2\n302#1:535\n308#1:544,6\n308#1:559,4\n308#1:569,2\n308#1:575\n293#1:579\n316#1:587,6\n316#1:602,4\n316#1:612,2\n318#1:622,6\n318#1:637,4\n318#1:647,2\n318#1:653\n319#1:662,6\n319#1:677,4\n319#1:687,2\n319#1:693\n316#1:697\n239#1:396,9\n239#1:417\n240#1:431,9\n240#1:452\n240#1:454,2\n239#1:458,2\n293#1:474,9\n293#1:495\n302#1:510,9\n302#1:531\n302#1:533,2\n308#1:550,9\n308#1:571\n308#1:573,2\n293#1:577,2\n316#1:593,9\n316#1:614\n318#1:628,9\n318#1:649\n318#1:651,2\n319#1:668,9\n319#1:689\n319#1:691,2\n316#1:695,2\n239#1:409,6\n240#1:444,6\n293#1:487,6\n302#1:523,6\n308#1:563,6\n316#1:606,6\n318#1:641,6\n319#1:681,6\n240#1:418\n240#1:419,6\n240#1:453\n240#1:457\n302#1:497\n302#1:498,6\n302#1:532\n302#1:536\n308#1:537\n308#1:538,6\n308#1:572\n308#1:576\n318#1:615\n318#1:616,6\n318#1:650\n318#1:654\n319#1:655\n319#1:656,6\n319#1:690\n319#1:694\n293#1:461\n293#1:462,6\n293#1:496\n293#1:580\n322#1:581,6\n*E\n"})
public final class SnackbarKt {
    private static final float J2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f23051t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f23050n = Dp.KN(30);
    private static final float rl = Dp.KN(16);
    private static final float nr = Dp.KN(2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final float f23049O = Dp.KN(6);
    private static final float Uo = Dp.KN(12);
    private static final float KN = Dp.KN(48);
    private static final float xMQ = Dp.KN(68);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(final Function2 function2, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(917397959);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (composerKN.HI((i3 & 3) != 2, 1 & i3)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(917397959, i3, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:237)");
            }
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                    final ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    boolean z2 = false;
                    int iZ = Integer.MIN_VALUE;
                    int iZ2 = Integer.MIN_VALUE;
                    int iMax = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        Placeable placeableDR0 = ((Measurable) list.get(i5)).dR0(j2);
                        arrayList.add(placeableDR0);
                        if (placeableDR0.z(AlignmentLineKt.n()) != Integer.MIN_VALUE && (iZ == Integer.MIN_VALUE || placeableDR0.z(AlignmentLineKt.n()) < iZ)) {
                            iZ = placeableDR0.z(AlignmentLineKt.n());
                        }
                        if (placeableDR0.z(AlignmentLineKt.rl()) != Integer.MIN_VALUE && (iZ2 == Integer.MIN_VALUE || placeableDR0.z(AlignmentLineKt.rl()) > iZ2)) {
                            iZ2 = placeableDR0.z(AlignmentLineKt.rl());
                        }
                        iMax = Math.max(iMax, placeableDR0.getHeight());
                    }
                    if (iZ != Integer.MIN_VALUE && iZ2 != Integer.MIN_VALUE) {
                        z2 = true;
                    }
                    final int iMax2 = Math.max(measureScope.How((iZ == iZ2 || !z2) ? SnackbarKt.KN : SnackbarKt.xMQ), iMax);
                    return MeasureScope.ER(measureScope, Constraints.qie(j2), iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$2.2
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
                            ArrayList arrayList2 = arrayList;
                            int i7 = iMax2;
                            int size2 = arrayList2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                Placeable placeable = (Placeable) arrayList2.get(i8);
                                Placeable.PlacementScope.az(placementScope, placeable, 0, (i7 - placeable.getHeight()) / 2, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
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
            Updater.O(composerN, snackbarKt$TextOnlySnackbar$2, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            Modifier modifierMUb = PaddingKt.mUb(companion, rl, f23049O);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierMUb);
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
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
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
                    SnackbarKt.O(function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    static {
        float f3 = 8;
        f23051t = Dp.KN(f3);
        J2 = Dp.KN(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1229075900);
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
                ComposerKt.p5(-1229075900, i3, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:291)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            float f3 = rl;
            float f4 = f23051t;
            Modifier modifierAz = PaddingKt.az(modifierKN, f3, 0.0f, f4, nr, 2, null);
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Modifier modifierAz2 = PaddingKt.az(androidx.compose.foundation.layout.AlignmentLineKt.Uo(companion, f23050n, Uo), 0.0f, 0.0f, f4, 0.0f, 11, null);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz2);
            Function0 function0N2 = companion3.n();
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
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            function2.invoke(composerKN, Integer.valueOf(i3 & 14));
            composerKN.XQ();
            Modifier modifierT = columnScopeInstance.t(companion, companion2.mUb());
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierT);
            Function0 function0N3 = companion3.n();
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
            Updater.O(composerN3, measurePolicyUo2, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
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
                    SnackbarKt.n(function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(final SnackbarData snackbarData, Modifier modifier, boolean z2, Shape shape, long j2, long j3, long j4, float f3, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        boolean z3;
        Shape small;
        long jN;
        long jTy;
        int i8;
        Composer composer2;
        final float f4;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape2;
        final long j5;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeGh;
        long jRl;
        float fKN;
        long j9;
        int i9;
        final long j10;
        boolean z5;
        Shape shape3;
        long j11;
        final SnackbarData snackbarData2;
        ComposableLambda composableLambdaNr;
        Composer composerKN = composer.KN(258660814);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? composerKN.p5(snackbarData) : composerKN.E2(snackbarData) ? 4 : 2) | i2;
        } else {
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
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        small = shape;
                        int i11 = composerKN.p5(small) ? 2048 : 1024;
                        i5 |= i11;
                    } else {
                        small = shape;
                    }
                    i5 |= i11;
                } else {
                    small = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        jN = j2;
                        int i12 = composerKN.nr(jN) ? 16384 : 8192;
                        i5 |= i12;
                    } else {
                        jN = j2;
                    }
                    i5 |= i12;
                } else {
                    jN = j2;
                }
                if ((196608 & i2) == 0) {
                    jTy = j3;
                    i5 |= ((i3 & 32) == 0 && composerKN.nr(jTy)) ? 131072 : 65536;
                } else {
                    jTy = j3;
                }
                if ((1572864 & i2) == 0) {
                    i5 |= ((i3 & 64) == 0 && composerKN.nr(j4)) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.rl(f3) ? 8388608 : 4194304;
                }
                if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                            small = MaterialTheme.f22169n.rl(composerKN, 6).getSmall();
                        }
                        if ((i3 & 16) != 0) {
                            jN = SnackbarDefaults.f23001n.n(composerKN, 6);
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            jRl = SnackbarDefaults.f23001n.rl(composerKN, 6);
                            i5 &= -3670017;
                        } else {
                            jRl = j4;
                        }
                        fKN = i8 != 0 ? Dp.KN(6) : f3;
                        j9 = jTy;
                        i9 = 12582912;
                        j10 = jRl;
                        z5 = z3;
                        shape3 = small;
                        j11 = jN;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        j10 = j4;
                        fKN = f3;
                        shape3 = small;
                        j11 = jN;
                        j9 = jTy;
                        i9 = 12582912;
                        z5 = z3;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(258660814, i5, -1, "androidx.compose.material.Snackbar (Snackbar.kt:167)");
                    }
                    final String actionLabel = snackbarData.getActionLabel();
                    if (actionLabel != null) {
                        composerKN.eF(1609221416);
                        snackbarData2 = snackbarData;
                        composableLambdaNr = ComposableLambdaKt.nr(1843479216, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void n(Composer composer3, int i13) {
                                if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                    composer3.wTp();
                                    return;
                                }
                                if (ComposerKt.v()) {
                                    ComposerKt.p5(1843479216, i13, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:172)");
                                }
                                ButtonColors buttonColorsUo = ButtonDefaults.f21598n.Uo(0L, j10, 0L, composer3, 3072, 5);
                                boolean zE2 = composer3.E2(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objIF = composer3.iF();
                                if (zE2 || objIF == Composer.INSTANCE.n()) {
                                    objIF = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.rl();
                                        }
                                    };
                                    composer3.o(objIF);
                                }
                                final String str = actionLabel;
                                ButtonKt.t((Function0) objIF, null, false, null, null, null, null, buttonColorsUo, null, ComposableLambdaKt.nr(-929149933, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                        n(rowScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(RowScope rowScope, Composer composer4, int i14) {
                                        if (!composer4.HI((i14 & 17) != 16, i14 & 1)) {
                                            composer4.wTp();
                                            return;
                                        }
                                        if (ComposerKt.v()) {
                                            ComposerKt.p5(-929149933, i14, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:175)");
                                        }
                                        TextKt.t(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131070);
                                        if (ComposerKt.v()) {
                                            ComposerKt.M7();
                                        }
                                    }
                                }, composer3, 54), composer3, C.ENCODING_PCM_32BIT, 382);
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                n(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composerKN, 54);
                        composerKN.Xw();
                    } else {
                        snackbarData2 = snackbarData;
                        composerKN.eF(1609519419);
                        composerKN.Xw();
                        composableLambdaNr = null;
                    }
                    composer2 = composerKN;
                    t(PaddingKt.xMQ(modifier2, Dp.KN(12)), composableLambdaNr, z5, shape3, j11, j9, fKN, ComposableLambdaKt.nr(-261845785, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i13) {
                            if (!composer3.HI((i13 & 3) != 2, i13 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-261845785, i13, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:183)");
                            }
                            TextKt.t(snackbarData2.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, (i5 & 896) | i9 | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 >> 3) & 3670016), 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    j7 = j10;
                    modifier3 = modifier2;
                    z4 = z5;
                    shape2 = shape3;
                    j5 = j11;
                    j6 = j9;
                    f4 = fKN;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    f4 = f3;
                    modifier3 = modifier2;
                    z4 = z3;
                    shape2 = small;
                    j5 = jN;
                    j6 = jTy;
                    j7 = j4;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
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
                            SnackbarKt.nr(snackbarData, modifier3, z4, shape2, j5, j6, j7, f4, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(final Function2 function2, final Function2 function22, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-534813202);
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
                ComposerKt.p5(-534813202, i3, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:312)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(companion, rl, 0.0f, f23051t, 0.0f, 10, null);
            Object objIF = composerKN.iF();
            Object objN = Composer.INSTANCE.n();
            final String str = "text";
            final String str2 = FileUploadManager.f61572j;
            if (objIF == objN) {
                objIF = new MeasurePolicy() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                        int iHow;
                        int iMax;
                        MeasureScope measureScope2 = measureScope;
                        String str3 = str2;
                        int size = list.size();
                        int height = 0;
                        int i5 = 0;
                        while (i5 < size) {
                            Measurable measurable = (Measurable) list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.n(measurable), str3)) {
                                long j3 = j2;
                                final Placeable placeableDR0 = measurable.dR0(j3);
                                int iCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.qie(j3) - placeableDR0.getWidth()) - measureScope2.How(SnackbarKt.J2), Constraints.ty(j3));
                                String str4 = str;
                                int size2 = list.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Measurable measurable2 = (Measurable) list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.n(measurable2), str4)) {
                                        final Placeable placeableDR02 = measurable2.dR0(Constraints.nr(j3, 0, iCoerceAtLeast, 0, 0, 9, null));
                                        int iZ = placeableDR02.z(AlignmentLineKt.n());
                                        int iZ2 = placeableDR02.z(AlignmentLineKt.rl());
                                        boolean z2 = true;
                                        boolean z3 = (iZ == Integer.MIN_VALUE || iZ2 == Integer.MIN_VALUE) ? false : true;
                                        if (iZ != iZ2 && z3) {
                                            z2 = false;
                                        }
                                        final int iQie = Constraints.qie(j2) - placeableDR0.getWidth();
                                        if (z2) {
                                            iMax = Math.max(measureScope2.How(SnackbarKt.KN), placeableDR0.getHeight());
                                            iHow = (iMax - placeableDR02.getHeight()) / 2;
                                            int iZ3 = placeableDR0.z(AlignmentLineKt.n());
                                            if (iZ3 != Integer.MIN_VALUE) {
                                                height = (iZ + iHow) - iZ3;
                                            }
                                        } else {
                                            iHow = measureScope2.How(SnackbarKt.f23050n) - iZ;
                                            iMax = Math.max(measureScope2.How(SnackbarKt.xMQ), placeableDR02.getHeight() + iHow);
                                            height = (iMax - placeableDR0.getHeight()) / 2;
                                        }
                                        final int i8 = height;
                                        final int i9 = iHow;
                                        return MeasureScope.ER(measureScope2, Constraints.qie(j2), iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$2$1.2
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
                                                Placeable.PlacementScope.az(placementScope, placeableDR02, 0, i9, 0.0f, 4, null);
                                                Placeable.PlacementScope.az(placementScope, placeableDR0, iQie, i8, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                    i7++;
                                    measureScope2 = measureScope;
                                    j3 = j2;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i5++;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerKN.o(objIF);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objIF;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
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
            Modifier modifierGh = PaddingKt.gh(LayoutIdKt.rl(companion, "text"), 0.0f, f23049O, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
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
            function2.invoke(composerKN, Integer.valueOf(i3 & 14));
            composerKN.XQ();
            Modifier modifierRl = LayoutIdKt.rl(companion, FileUploadManager.f61572j);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
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
            function22.invoke(composerKN, Integer.valueOf((i3 >> 3) & 14));
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
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
                    SnackbarKt.rl(function2, function22, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(Modifier modifier, Function2 function2, boolean z2, Shape shape, long j2, long j3, float f3, final Function2 function22, Composer composer, final int i2, final int i3) {
        int i5;
        Function2 function23;
        int i7;
        final boolean z3;
        Shape shape2;
        long jN;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier2;
        final Function2 function24;
        final boolean z4;
        final Shape shape3;
        final long j4;
        final long j5;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeGh;
        final Function2 function25;
        Shape small;
        long jTy;
        float fKN;
        int i10;
        long j6;
        long j7;
        Modifier modifier3;
        Shape shape4;
        int i11;
        Composer composerKN = composer.KN(-558258760);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function23 = function2;
                i5 |= composerKN.E2(function23) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    z3 = z2;
                    i5 |= composerKN.n(z3) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        shape2 = shape;
                        int i14 = composerKN.p5(shape2) ? 2048 : 1024;
                        i5 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i5 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        jN = j2;
                        int i15 = composerKN.nr(jN) ? 16384 : 8192;
                        i5 |= i15;
                    } else {
                        jN = j2;
                    }
                    i5 |= i15;
                } else {
                    jN = j2;
                }
                if ((196608 & i2) == 0) {
                    i8 = i12;
                    i5 |= ((i3 & 32) == 0 && composerKN.nr(j3)) ? 131072 : 65536;
                } else {
                    i8 = i12;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= composerKN.rl(f3) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= composerKN.E2(function22) ? 8388608 : 4194304;
                }
                if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
                    composerKN.e();
                    if ((i2 & 1) == 0 || composerKN.rV9()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        function25 = i13 != 0 ? null : function23;
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if ((i3 & 8) != 0) {
                            small = MaterialTheme.f22169n.rl(composerKN, 6).getSmall();
                            i5 &= -7169;
                        } else {
                            small = shape2;
                        }
                        if ((i3 & 16) != 0) {
                            jN = SnackbarDefaults.f23001n.n(composerKN, 6);
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            jTy = MaterialTheme.f22169n.n(composerKN, 6).ty();
                            i5 = (-458753) & i5;
                        } else {
                            jTy = j3;
                        }
                        fKN = i9 != 0 ? Dp.KN(6) : f3;
                        i10 = 1572864;
                        j6 = jTy;
                        j7 = jN;
                        modifier3 = modifier4;
                        shape4 = small;
                        i11 = -558258760;
                    } else {
                        composerKN.wTp();
                        if ((i3 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i5 &= -458753;
                        }
                        j6 = j3;
                        fKN = f3;
                        function25 = function23;
                        i10 = 1572864;
                        i11 = -558258760;
                        j7 = jN;
                        modifier3 = modifier;
                        shape4 = shape2;
                    }
                    composerKN.S();
                    if (ComposerKt.v()) {
                        ComposerKt.p5(i11, i5, -1, "androidx.compose.material.Snackbar (Snackbar.kt:94)");
                    }
                    int i16 = (i5 & 14) | i10;
                    int i17 = i5 >> 6;
                    composer2 = composerKN;
                    SurfaceKt.n(modifier3, shape4, j7, j6, null, fKN, ComposableLambdaKt.nr(-2084221700, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i18) {
                            if (!composer3.HI((i18 & 3) != 2, i18 & 1)) {
                                composer3.wTp();
                                return;
                            }
                            if (ComposerKt.v()) {
                                ComposerKt.p5(-2084221700, i18, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:102)");
                            }
                            ProvidedValue providedValueNr = ContentAlphaKt.n().nr(Float.valueOf(ContentAlpha.f21745n.t(composer3, 6)));
                            final Function2 function26 = function25;
                            final Function2 function27 = function22;
                            final boolean z5 = z3;
                            CompositionLocalKt.rl(providedValueNr, ComposableLambdaKt.nr(1939362236, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    n(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer4, int i19) {
                                    if (!composer4.HI((i19 & 3) != 2, i19 & 1)) {
                                        composer4.wTp();
                                        return;
                                    }
                                    if (ComposerKt.v()) {
                                        ComposerKt.p5(1939362236, i19, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:103)");
                                    }
                                    TextStyle body2 = MaterialTheme.f22169n.t(composer4, 6).getBody2();
                                    final Function2 function28 = function26;
                                    final Function2 function29 = function27;
                                    final boolean z6 = z5;
                                    TextKt.n(body2, ComposableLambdaKt.nr(225114541, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            n(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer5, int i20) {
                                            if (!composer5.HI((i20 & 3) != 2, i20 & 1)) {
                                                composer5.wTp();
                                                return;
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.p5(225114541, i20, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:105)");
                                            }
                                            if (function28 == null) {
                                                composer5.eF(1850968129);
                                                SnackbarKt.O(function29, composer5, 0);
                                                composer5.Xw();
                                            } else if (z6) {
                                                composer5.eF(1850970222);
                                                SnackbarKt.n(function29, function28, composer5, 0);
                                                composer5.Xw();
                                            } else {
                                                composer5.eF(1850972359);
                                                SnackbarKt.rl(function29, function28, composer5, 0);
                                                composer5.Xw();
                                            }
                                            if (ComposerKt.v()) {
                                                ComposerKt.M7();
                                            }
                                        }
                                    }, composer4, 54), composer4, 48);
                                    if (ComposerKt.v()) {
                                        ComposerKt.M7();
                                    }
                                }
                            }, composer3, 54), composer3, ProvidedValue.xMQ | 48);
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                        }
                    }, composerKN, 54), composer2, i16 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | ((i5 >> 3) & 458752), 16);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    function24 = function25;
                    z4 = z3;
                    modifier2 = modifier3;
                    shape3 = shape4;
                    j4 = j7;
                    j5 = j6;
                    f4 = fKN;
                } else {
                    composer2 = composerKN;
                    composer2.wTp();
                    modifier2 = modifier;
                    function24 = function23;
                    z4 = z3;
                    shape3 = shape2;
                    j4 = jN;
                    j5 = j3;
                    f4 = f3;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i18) {
                            SnackbarKt.t(modifier2, function24, z4, shape3, j4, j5, f4, function22, composer3, RecomposeScopeImplKt.n(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            z3 = z2;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        function23 = function2;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        z3 = z2;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (composerKN.HI((4793491 & i5) != 4793490, i5 & 1)) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }
}
