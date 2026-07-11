package KA9;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class I28 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(RowScope rowScope, int i2, String str, int i3, Composer composer, int i5) {
        O(rowScope, i2, str, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    private static final void O(final RowScope rowScope, final int i2, final String str, Composer composer, int i3) {
        int i5;
        final int i7;
        Composer composerKN = composer.KN(-845638988);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(rowScope) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(str) ? 256 : 128;
        }
        int i8 = i5;
        if ((i8 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            i7 = i3;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-845638988, i8, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemInfoLine (ProjectItemInfo.kt:68)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierRl = RowScope.rl(rowScope, SizeKt.xMQ(companion, Dp.KN(16)), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierRl);
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
            IconKt.n(PainterResources_androidKt.t(i2, composerKN, (i8 >> 3) & 14), null, null, aD.w6.RQ(), composerKN, 3120, 4);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(6)), composerKN, 6);
            i7 = i3;
            CM.S(str, H9N.j.f3810n.rl(composerKN, 6).s7N(), null, aD.w6.ER(), null, null, null, 0, false, 0, null, composerKN, ((i8 >> 6) & 14) | 3072, 0, 2036);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.J2(rowScope, i2, str, i7, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(RowScope rowScope, String str, String str2, String str3, String str4, String str5, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(rowScope, str, str2, str3, str4, str5, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final RowScope rowScope, final String title, String ratio, String res, String size, String fps, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Modifier modifier3;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        int iN3;
        Composer composerN3;
        Function2 function2Rl3;
        String str;
        String str2;
        int iN4;
        Composer composerN4;
        Function2 function2Rl4;
        final String str3;
        String str4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(fps, "fps");
        Composer composerKN = composer.KN(1013143108);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(rowScope) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 1) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(title) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(ratio) ? 256 : 128;
        }
        if ((i3 & 4) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(res) ? 2048 : 1024;
        }
        if ((i3 & 8) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.p5(size) ? 16384 : 8192;
        }
        if ((i3 & 16) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.p5(fps) ? 131072 : 65536;
        }
        int i8 = i3 & 32;
        if (i8 == 0) {
            if ((1572864 & i2) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 1048576 : 524288;
            }
            i7 = i5;
            if ((599187 & i7) == 599186 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1013143108, i7, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.ProjectItemInfo (ProjectItemInfo.kt:33)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Modifier modifierT = rowScope.t(modifier4, companion.xMQ());
                Alignment.Horizontal horizontalGh = companion.gh();
                Arrangement arrangement = Arrangement.f17400n;
                MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), horizontalGh, composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
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
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                int i9 = i7 >> 3;
                modifier3 = modifier4;
                CM.S(title, H9N.j.f3810n.rl(composerKN, 6).nY(), null, aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), TextOverflow.INSTANCE.rl(), false, 1, null, composerKN, (i9 & 14) | 817892352, 0, 1332);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(8)), composerKN, 6);
                Modifier modifierViF = SizeKt.ViF(companion3, Dp.KN(168));
                MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion.gh(), composerKN, 0);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierViF);
                Function0 function0N2 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N2);
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyN2, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion.qie(), composerKN, 0);
                iN3 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, companion3);
                Function0 function0N3 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N3);
                }
                composerN3 = Updater.n(composerKN);
                Updater.O(composerN3, measurePolicyRl, companion2.t());
                Updater.O(composerN3, compositionLocalMapIk3, companion2.O());
                function2Rl3 = companion2.rl();
                if (!composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                    composerN3.o(Integer.valueOf(iN3));
                    composerN3.az(Integer.valueOf(iN3), function2Rl3);
                }
                Updater.O(composerN3, modifierO3, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composerKN.eF(-2134419735);
                if (ratio.length() <= 0) {
                    str = ratio;
                    O(rowScopeInstance, 2131231920, str, composerKN, (i7 & 896) | 54);
                } else {
                    str = ratio;
                }
                composerKN.Xw();
                str2 = res;
                O(rowScopeInstance, 2131231921, str2, composerKN, (i9 & 896) | 54);
                composerKN.XQ();
                SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(4)), composerKN, 6);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), companion.qie(), composerKN, 0);
                iN4 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
                Modifier modifierO4 = ComposedModifierKt.O(composerKN, companion3);
                Function0 function0N4 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N4);
                }
                composerN4 = Updater.n(composerKN);
                Updater.O(composerN4, measurePolicyRl2, companion2.t());
                Updater.O(composerN4, compositionLocalMapIk4, companion2.O());
                function2Rl4 = companion2.rl();
                if (!composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                    composerN4.o(Integer.valueOf(iN4));
                    composerN4.az(Integer.valueOf(iN4), function2Rl4);
                }
                Updater.O(composerN4, modifierO4, companion2.nr());
                str3 = size;
                O(rowScopeInstance, 2131231922, str3, composerKN, ((i7 >> 6) & 896) | 54);
                str4 = fps;
                O(rowScopeInstance, 2131231914, str4, composerKN, ((i7 >> 9) & 896) | 54);
                composerKN.XQ();
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                str = ratio;
                str2 = res;
                str4 = fps;
                modifier3 = modifier2;
                str3 = size;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final String str5 = str;
                final String str6 = str4;
                final String str7 = str2;
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeGh.n(new Function2() { // from class: KA9.w6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return I28.nr(rowScope, title, str5, str7, str3, str6, modifier5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 1572864;
        modifier2 = modifier;
        i7 = i5;
        if ((599187 & i7) == 599186) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Modifier modifierT2 = rowScope.t(modifier4, companion4.xMQ());
            Alignment.Horizontal horizontalGh2 = companion4.gh();
            Arrangement arrangement2 = Arrangement.f17400n;
            MeasurePolicy measurePolicyN3 = ColumnKt.n(arrangement2.Uo(), horizontalGh2, composerKN, 48);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk5 = composerKN.Ik();
            Modifier modifierO5 = ComposedModifierKt.O(composerKN, modifierT2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N5 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN3, companion22.t());
            Updater.O(composerN, compositionLocalMapIk5, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO5, companion22.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                int i92 = i7 >> 3;
                modifier3 = modifier4;
                CM.S(title, H9N.j.f3810n.rl(composerKN, 6).nY(), null, aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), TextOverflow.INSTANCE.rl(), false, 1, null, composerKN, (i92 & 14) | 817892352, 0, 1332);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion32, Dp.KN(8)), composerKN, 6);
                Modifier modifierViF2 = SizeKt.ViF(companion32, Dp.KN(168));
                MeasurePolicy measurePolicyN22 = ColumnKt.n(arrangement2.Uo(), companion4.gh(), composerKN, 0);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierViF2);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyN22, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    MeasurePolicy measurePolicyRl3 = RowKt.rl(arrangement2.J2(), companion4.qie(), composerKN, 0);
                    iN3 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk32 = composerKN.Ik();
                    Modifier modifierO32 = ComposedModifierKt.O(composerKN, companion32);
                    Function0 function0N32 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN3 = Updater.n(composerKN);
                    Updater.O(composerN3, measurePolicyRl3, companion22.t());
                    Updater.O(composerN3, compositionLocalMapIk32, companion22.O());
                    function2Rl3 = companion22.rl();
                    if (!composerN3.getInserting()) {
                        composerN3.o(Integer.valueOf(iN3));
                        composerN3.az(Integer.valueOf(iN3), function2Rl3);
                        Updater.O(composerN3, modifierO32, companion22.nr());
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                        composerKN.eF(-2134419735);
                        if (ratio.length() <= 0) {
                        }
                        composerKN.Xw();
                        str2 = res;
                        O(rowScopeInstance2, 2131231921, str2, composerKN, (i92 & 896) | 54);
                        composerKN.XQ();
                        SpacerKt.n(SizeKt.xMQ(companion32, Dp.KN(4)), composerKN, 6);
                        MeasurePolicy measurePolicyRl22 = RowKt.rl(arrangement2.J2(), companion4.qie(), composerKN, 0);
                        iN4 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk42 = composerKN.Ik();
                        Modifier modifierO42 = ComposedModifierKt.O(composerKN, companion32);
                        Function0 function0N42 = companion22.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN4 = Updater.n(composerKN);
                        Updater.O(composerN4, measurePolicyRl22, companion22.t());
                        Updater.O(composerN4, compositionLocalMapIk42, companion22.O());
                        function2Rl4 = companion22.rl();
                        if (!composerN4.getInserting()) {
                            composerN4.o(Integer.valueOf(iN4));
                            composerN4.az(Integer.valueOf(iN4), function2Rl4);
                            Updater.O(composerN4, modifierO42, companion22.nr());
                            str3 = size;
                            O(rowScopeInstance2, 2131231922, str3, composerKN, ((i7 >> 6) & 896) | 54);
                            str4 = fps;
                            O(rowScopeInstance2, 2131231914, str4, composerKN, ((i7 >> 9) & 896) | 54);
                            composerKN.XQ();
                            composerKN.XQ();
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
