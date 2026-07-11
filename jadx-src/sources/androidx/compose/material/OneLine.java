package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material/OneLine;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "text", "trailing", c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "MinHeight", "t", "MinHeightWithIcon", "nr", "IconMinPaddedWidth", "O", "IconLeftPadding", "J2", "IconVerticalPadding", "Uo", "ContentLeftPadding", "KN", "ContentRightPadding", "xMQ", "TrailingRightPadding", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n99#2:446\n96#2,6:447\n102#2:481\n106#2:604\n79#3,6:453\n86#3,4:468\n90#3,2:478\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:520\n79#3,6:528\n86#3,4:543\n90#3,2:553\n94#3:559\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n94#3:603\n368#4,9:459\n377#4:480\n368#4,9:495\n377#4:516\n378#4,2:518\n368#4,9:534\n377#4:555\n378#4,2:557\n368#4,9:574\n377#4:595\n378#4,2:597\n378#4,2:601\n4034#5,6:472\n4034#5,6:508\n4034#5,6:547\n4034#5,6:587\n51#6:482\n71#7:483\n69#7,5:484\n74#7:517\n78#7:521\n71#7:522\n69#7,5:523\n74#7:556\n78#7:560\n71#7:561\n68#7,6:562\n74#7:596\n78#7:600\n149#8:605\n149#8:606\n149#8:607\n149#8:608\n149#8:609\n149#8:610\n149#8:611\n149#8:612\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/OneLine\n*L\n151#1:446\n151#1:447,6\n151#1:481\n151#1:604\n151#1:453,6\n151#1:468,4\n151#1:478,2\n153#1:489,6\n153#1:504,4\n153#1:514,2\n153#1:520\n166#1:528,6\n166#1:543,4\n166#1:553,2\n166#1:559\n175#1:568,6\n175#1:583,4\n175#1:593,2\n175#1:599\n151#1:603\n151#1:459,9\n151#1:480\n153#1:495,9\n153#1:516\n153#1:518,2\n166#1:534,9\n166#1:555\n166#1:557,2\n175#1:574,9\n175#1:595\n175#1:597,2\n151#1:601,2\n151#1:472,6\n153#1:508,6\n166#1:547,6\n175#1:587,6\n155#1:482\n153#1:483\n153#1:484,5\n153#1:517\n153#1:521\n166#1:522\n166#1:523,5\n166#1:556\n166#1:560\n175#1:561\n175#1:562,6\n175#1:596\n175#1:600\n128#1:605\n129#1:606\n132#1:607\n133#1:608\n134#1:609\n137#1:610\n138#1:611\n141#1:612\n*E\n"})
final class OneLine {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float ContentRightPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float IconLeftPadding;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float ContentLeftPadding;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float TrailingRightPadding;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final OneLine f22354n = new OneLine();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(48);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeightWithIcon = Dp.KN(56);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float IconMinPaddedWidth = Dp.KN(40);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float IconVerticalPadding = Dp.KN(8);

    public final void n(Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Composer composerKN = composer.KN(-1884451315);
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
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(function22) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(function23) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.p5(this) ? 16384 : 8192;
        }
        if (composerKN.HI((i5 & 9363) != 9362, 1 & i5)) {
            if (i7 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1884451315, i5, -1, "androidx.compose.material.OneLine.ListItem (ListItem.kt:148)");
            }
            Modifier modifierGh = SizeKt.gh(modifier2, function2 == null ? MinHeight : MinHeightWithIcon, 0.0f, 2, null);
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            if (function2 != null) {
                composerKN.eF(-1966455448);
                Modifier modifierT = rowScopeInstance.t(Modifier.INSTANCE, companion.xMQ());
                float f3 = IconLeftPadding;
                Modifier modifierG = SizeKt.g(modifierT, Dp.KN(f3 + IconMinPaddedWidth), 0.0f, 2, null);
                float f4 = IconVerticalPadding;
                Modifier modifierAz = PaddingKt.az(modifierG, f3, f4, 0.0f, f4, 4, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.KN(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz);
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
                function2.invoke(composerKN, Integer.valueOf((i5 >> 3) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-1965948040);
                composerKN.Xw();
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAz2 = PaddingKt.az(rowScopeInstance.t(RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), companion.xMQ()), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion.KN(), false);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierAz2);
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
            function22.invoke(composerKN, Integer.valueOf((i5 >> 6) & 14));
            composerKN.XQ();
            if (function23 != null) {
                composerKN.eF(-1965606420);
                Modifier modifierAz3 = PaddingKt.az(rowScopeInstance.t(companion3, companion.xMQ()), 0.0f, 0.0f, TrailingRightPadding, 0.0f, 11, null);
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion.HI(), false);
                int iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierAz3);
                Function0 function0N4 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.s7N(function0N4);
                } else {
                    composerKN.r();
                }
                Composer composerN4 = Updater.n(composerKN);
                Updater.O(composerN4, measurePolicyUo3, companion2.t());
                Updater.O(composerN4, compositionLocalMapIk4, companion2.O());
                Function2 function2Rl4 = companion2.rl();
                if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                    composerN4.o(Integer.valueOf(iN4));
                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                }
                Updater.O(composerN4, modifierO4, companion2.nr());
                function23.invoke(composerKN, Integer.valueOf((i5 >> 9) & 14));
                composerKN.XQ();
                composerKN.Xw();
            } else {
                composerKN.eF(-1965410376);
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OneLine$ListItem$2
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
                    this.f22358n.n(modifier3, function2, function22, function23, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    static {
        float f3 = 16;
        IconLeftPadding = Dp.KN(f3);
        ContentLeftPadding = Dp.KN(f3);
        ContentRightPadding = Dp.KN(f3);
        TrailingRightPadding = Dp.KN(f3);
    }

    private OneLine() {
    }
}
