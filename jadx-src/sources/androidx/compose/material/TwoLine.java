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
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0080\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u001a\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u0012R\u001a\u0010#\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u001a\u0010%\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u001a\u0010'\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010\u0012R\u001a\u0010)\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u001a\u0010+\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u001a\u0010-\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/TwoLine;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "text", "secondaryText", "overlineText", "trailing", c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "MinHeight", "t", "MinHeightWithIcon", "nr", "IconMinPaddedWidth", "O", "IconLeftPadding", "J2", "IconVerticalPadding", "Uo", "ContentLeftPadding", "KN", "ContentRightPadding", "xMQ", "OverlineBaselineOffset", "mUb", "OverlineToPrimaryBaselineOffset", "gh", "PrimaryBaselineOffsetNoIcon", "qie", "PrimaryBaselineOffsetWithIcon", "az", "PrimaryToSecondaryBaselineOffsetNoIcon", "ty", "PrimaryToSecondaryBaselineOffsetWithIcon", "HI", "TrailingRightPadding", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n99#2:446\n96#2,6:447\n102#2:481\n106#2:525\n79#3,6:453\n86#3,4:468\n90#3,2:478\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:520\n94#3:524\n368#4,9:459\n377#4:480\n368#4,9:495\n377#4:516\n378#4,2:518\n378#4,2:522\n4034#5,6:472\n4034#5,6:508\n51#6:482\n71#7:483\n69#7,5:484\n74#7:517\n78#7:521\n149#8:526\n149#8:527\n149#8:528\n149#8:529\n149#8:530\n149#8:531\n149#8:532\n149#8:533\n149#8:534\n149#8:535\n149#8:536\n149#8:537\n149#8:538\n149#8:539\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/TwoLine\n*L\n218#1:446\n218#1:447,6\n218#1:481\n218#1:525\n218#1:453,6\n218#1:468,4\n218#1:478,2\n223#1:489,6\n223#1:504,4\n223#1:514,2\n223#1:520\n218#1:524\n218#1:459,9\n218#1:480\n223#1:495,9\n223#1:516\n223#1:518,2\n218#1:522,2\n218#1:472,6\n223#1:508,6\n225#1:482\n223#1:483\n223#1:484,5\n223#1:517\n223#1:521\n187#1:526\n188#1:527\n191#1:528\n192#1:529\n193#1:530\n196#1:531\n197#1:532\n198#1:533\n199#1:534\n200#1:535\n201#1:536\n202#1:537\n203#1:538\n206#1:539\n*E\n"})
final class TwoLine {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final float TrailingRightPadding;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float IconVerticalPadding;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float ContentRightPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float IconLeftPadding;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float ContentLeftPadding;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final float OverlineToPrimaryBaselineOffset;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TwoLine f23832n = new TwoLine();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(64);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeightWithIcon = Dp.KN(72);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float IconMinPaddedWidth = Dp.KN(40);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float OverlineBaselineOffset = Dp.KN(24);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final float PrimaryBaselineOffsetNoIcon = Dp.KN(28);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final float PrimaryBaselineOffsetWithIcon = Dp.KN(32);

    static {
        float f3 = 16;
        IconLeftPadding = Dp.KN(f3);
        IconVerticalPadding = Dp.KN(f3);
        ContentLeftPadding = Dp.KN(f3);
        ContentRightPadding = Dp.KN(f3);
        float f4 = 20;
        OverlineToPrimaryBaselineOffset = Dp.KN(f4);
        PrimaryToSecondaryBaselineOffsetNoIcon = Dp.KN(f4);
        PrimaryToSecondaryBaselineOffsetWithIcon = Dp.KN(f4);
        TrailingRightPadding = Dp.KN(f3);
    }

    public final void n(Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        boolean z2;
        Composer composerKN = composer.KN(-1340612993);
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
            i5 |= composerKN.E2(function24) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(function25) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= composerKN.p5(this) ? 1048576 : 524288;
        }
        if (composerKN.HI((599187 & i5) != 599186, i5 & 1)) {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1340612993, i5, -1, "androidx.compose.material.TwoLine.ListItem (ListItem.kt:215)");
            }
            final float f3 = function2 == null ? MinHeight : MinHeightWithIcon;
            Modifier modifierGh = SizeKt.gh(modifier4, f3, 0.0f, 2, null);
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Modifier modifier5 = modifier4;
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
            if (function2 != null) {
                composerKN.eF(-1767030913);
                float f4 = IconLeftPadding;
                Modifier modifierAYN = SizeKt.aYN(companion3, Dp.KN(f4 + IconMinPaddedWidth), f3, 0.0f, 0.0f, 12, null);
                float f5 = IconVerticalPadding;
                Modifier modifierAz2 = PaddingKt.az(modifierAYN, f4, f5, 0.0f, f5, 4, null);
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                int iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz2);
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
                composerKN.eF(-1766478338);
                composerKN.Xw();
            }
            if (function24 != null) {
                composerKN.eF(-1766430164);
                z2 = true;
                ListItemKt.n(CollectionsKt.listOf((Object[]) new Dp[]{Dp.nr(OverlineBaselineOffset), Dp.nr(OverlineToPrimaryBaselineOffset)}), modifierAz, ComposableLambdaKt.nr(-1675021441, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$1$2
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
                        if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1675021441, i8, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:243)");
                        }
                        function24.invoke(composer2, 0);
                        function22.invoke(composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, 390, 0);
                composerKN.Xw();
            } else {
                z2 = true;
                composerKN.eF(-1766139198);
                ListItemKt.n(CollectionsKt.listOf((Object[]) new Dp[]{Dp.nr(function2 != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon), Dp.nr(function2 != null ? PrimaryToSecondaryBaselineOffsetWithIcon : PrimaryToSecondaryBaselineOffsetNoIcon)}), modifierAz, ComposableLambdaKt.nr(993836488, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$1$3
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
                        if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(993836488, i8, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:262)");
                        }
                        function22.invoke(composer2, 0);
                        Function2 function26 = function23;
                        Intrinsics.checkNotNull(function26);
                        function26.invoke(composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composerKN.Xw();
            }
            if (function25 != null) {
                composerKN.eF(-1765411690);
                ListItemKt.t(function2 != null ? PrimaryBaselineOffsetWithIcon : PrimaryBaselineOffsetNoIcon, null, ComposableLambdaKt.nr(-1696992176, z2, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void n(Composer composer2, int i8) {
                        if (!composer2.HI((i8 & 3) != 2, 1 & i8)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-1696992176, i8, -1, "androidx.compose.material.TwoLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:274)");
                        }
                        Modifier modifierAz3 = PaddingKt.az(SizeKt.gh(Modifier.INSTANCE, f3, 0.0f, 2, null), 0.0f, 0.0f, TwoLine.TrailingRightPadding, 0.0f, 11, null);
                        Alignment alignmentO = Alignment.INSTANCE.O();
                        Function2 function26 = function25;
                        MeasurePolicy measurePolicyUo2 = BoxKt.Uo(alignmentO, false);
                        int iN3 = ComposablesKt.n(composer2, 0);
                        CompositionLocalMap compositionLocalMapIk3 = composer2.Ik();
                        Modifier modifierO3 = ComposedModifierKt.O(composer2, modifierAz3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0 function0N3 = companion4.n();
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
                        Updater.O(composerN3, measurePolicyUo2, companion4.t());
                        Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
                        Function2 function2Rl3 = companion4.rl();
                        if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                            composerN3.o(Integer.valueOf(iN3));
                            composerN3.az(Integer.valueOf(iN3), function2Rl3);
                        }
                        Updater.O(composerN3, modifierO3, companion4.nr());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                        function26.invoke(composer2, 0);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerKN, 54), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                composerKN.Xw();
            } else {
                composerKN.eF(-1764788962);
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        } else {
            composerKN.wTp();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$2
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
                    this.f23844n.n(modifier3, function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                }
            });
        }
    }

    private TwoLine() {
    }
}
