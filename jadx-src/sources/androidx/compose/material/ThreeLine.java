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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J~\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\b2\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001d\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u001a\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u0012R\u001a\u0010#\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u001a\u0010%\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u001a\u0010'\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/material/ThreeLine;", "", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "icon", "text", "secondaryText", "overlineText", "trailing", c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "MinHeight", "t", "IconMinPaddedWidth", "nr", "IconLeftPadding", "O", "IconThreeLineVerticalPadding", "J2", "ContentLeftPadding", "Uo", "ContentRightPadding", "KN", "ThreeLineBaselineFirstOffset", "xMQ", "ThreeLineBaselineSecondOffset", "mUb", "ThreeLineBaselineThirdOffset", "gh", "ThreeLineTrailingTopPadding", "qie", "TrailingRightPadding", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,445:1\n99#2:446\n96#2,6:447\n102#2:481\n106#2:526\n79#3,6:453\n86#3,4:468\n90#3,2:478\n79#3,6:489\n86#3,4:504\n90#3,2:514\n94#3:520\n94#3:525\n368#4,9:459\n377#4:480\n368#4,9:495\n377#4:516\n378#4,2:518\n378#4,2:523\n4034#5,6:472\n4034#5,6:508\n51#6:482\n57#6:522\n71#7:483\n69#7,5:484\n74#7:517\n78#7:521\n149#8:527\n149#8:528\n149#8:529\n149#8:530\n149#8:531\n149#8:532\n149#8:533\n149#8:534\n149#8:535\n149#8:536\n149#8:537\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ThreeLine\n*L\n317#1:446\n317#1:447,6\n317#1:481\n317#1:526\n317#1:453,6\n317#1:468,4\n317#1:478,2\n320#1:489,6\n320#1:504,4\n320#1:514,2\n320#1:520\n317#1:525\n317#1:459,9\n317#1:480\n320#1:495,9\n320#1:516\n320#1:518,2\n317#1:523,2\n317#1:472,6\n320#1:508,6\n319#1:482\n346#1:522\n320#1:483\n320#1:484,5\n320#1:517\n320#1:521\n290#1:527\n293#1:528\n294#1:529\n295#1:530\n298#1:531\n299#1:532\n300#1:533\n301#1:534\n302#1:535\n303#1:536\n306#1:537\n*E\n"})
final class ThreeLine {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final float ContentLeftPadding;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final float IconThreeLineVerticalPadding;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final float ContentRightPadding;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final float ThreeLineTrailingTopPadding;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final float ThreeLineBaselineThirdOffset;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final float IconLeftPadding;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final float TrailingRightPadding;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final float ThreeLineBaselineSecondOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreeLine f23818n = new ThreeLine();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float MinHeight = Dp.KN(88);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float IconMinPaddedWidth = Dp.KN(40);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final float ThreeLineBaselineFirstOffset = Dp.KN(28);

    static {
        float f3 = 16;
        IconLeftPadding = Dp.KN(f3);
        IconThreeLineVerticalPadding = Dp.KN(f3);
        ContentLeftPadding = Dp.KN(f3);
        ContentRightPadding = Dp.KN(f3);
        float f4 = 20;
        ThreeLineBaselineSecondOffset = Dp.KN(f4);
        ThreeLineBaselineThirdOffset = Dp.KN(f4);
        ThreeLineTrailingTopPadding = Dp.KN(f3);
        TrailingRightPadding = Dp.KN(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(Modifier modifier, final Function2 function2, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final ThreeLine threeLine;
        int i7;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(1749738797);
        int i8 = i3 & 1;
        if (i8 != 0) {
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
        if ((i3 & 64) == 0) {
            if ((i2 & 1572864) == 0) {
                threeLine = this;
                i5 |= composerKN.p5(threeLine) ? 1048576 : 524288;
            }
            i7 = i5;
            if (composerKN.HI((599187 & i7) == 599186, i7 & 1)) {
                composerKN.wTp();
            } else {
                Modifier modifier3 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1749738797, i7, -1, "androidx.compose.material.ThreeLine.ListItem (ListItem.kt:315)");
                }
                Modifier modifierGh = SizeKt.gh(modifier3, MinHeight, 0.0f, 2, null);
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
                    composerKN.eF(1135491690);
                    float f3 = IconLeftPadding;
                    float fKN = Dp.KN(f3 + IconMinPaddedWidth);
                    Modifier modifierAYN = SizeKt.aYN(Modifier.INSTANCE, fKN, fKN, 0.0f, 0.0f, 12, null);
                    float f4 = IconThreeLineVerticalPadding;
                    Modifier modifierAz = PaddingKt.az(modifierAYN, f3, f4, 0.0f, f4, 4, null);
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
                    function2.invoke(composerKN, Integer.valueOf((i7 >> 3) & 14));
                    composerKN.XQ();
                    composerKN.Xw();
                } else {
                    composerKN.eF(1136020240);
                    composerKN.Xw();
                }
                float f5 = ThreeLineBaselineFirstOffset;
                List listListOf = CollectionsKt.listOf((Object[]) new Dp[]{Dp.nr(f5), Dp.nr(ThreeLineBaselineSecondOffset), Dp.nr(ThreeLineBaselineThirdOffset)});
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ListItemKt.n(listListOf, PaddingKt.az(RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.nr(-318094245, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i9) {
                        if (!composer2.HI((i9 & 3) != 2, i9 & 1)) {
                            composer2.wTp();
                            return;
                        }
                        if (ComposerKt.v()) {
                            ComposerKt.p5(-318094245, i9, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:339)");
                        }
                        if (function24 != null) {
                            composer2.eF(-1959304577);
                            function24.invoke(composer2, 0);
                        } else {
                            composer2.eF(-608886287);
                        }
                        composer2.Xw();
                        function22.invoke(composer2, 0);
                        function23.invoke(composer2, 0);
                        if (ComposerKt.v()) {
                            ComposerKt.M7();
                        }
                    }
                }, composerKN, 54), composerKN, 390, 0);
                composerKN = composerKN;
                if (function25 != null) {
                    composerKN.eF(1136529043);
                    float f6 = ThreeLineTrailingTopPadding;
                    modifier2 = modifier3;
                    ListItemKt.t(Dp.KN(f5 - f6), PaddingKt.az(companion3, 0.0f, f6, TrailingRightPadding, 0.0f, 9, null), function25, composerKN, ((i7 >> 9) & 896) | 54, 0);
                    composerKN.Xw();
                } else {
                    modifier2 = modifier3;
                    composerKN.eF(1136802928);
                    composerKN.Xw();
                }
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        n(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(Composer composer2, int i9) {
                        this.f23827n.n(modifier4, function2, function22, function23, function24, function25, composer2, RecomposeScopeImplKt.n(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i5 |= 1572864;
        threeLine = this;
        i7 = i5;
        if (composerKN.HI((599187 & i7) == 599186, i7 & 1)) {
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private ThreeLine() {
    }
}
