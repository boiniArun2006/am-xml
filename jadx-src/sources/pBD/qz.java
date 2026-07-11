package pBD;

import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.caoccao.javet.interop.engine.JavetEngineConfig;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class qz {
    private static final void KN(final int i2, final int i3, Composer composer, final int i5) {
        int i7;
        Composer composer2;
        Composer composerKN = composer.KN(-487792139);
        if ((i5 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerKN.t(i3) ? 32 : 16;
        }
        if ((i7 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-487792139, i7, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.TimeCard (DiscountTimerBox.kt:65)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.nr(ClipKt.n(SizeKt.g(companion, Dp.KN(80), 0.0f, 2, null), RoundedCornerShapeKt.t(Dp.KN(12))), Color.az(aD.w6.dR0(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.KN(10));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            Modifier modifierN = BoxScopeInstance.f17448n.n(companion, companion2.O());
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.Uo(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierN);
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
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String strSubstring = String.valueOf(i2 + 100).substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            long jDR0 = aD.w6.dR0();
            H9N.j jVar = H9N.j.f3810n;
            int i8 = i7;
            composer2 = composerKN;
            CM.S(strSubstring, jVar.rl(composerKN, 6).iF(), null, jDR0, null, null, null, 0, false, 0, null, composer2, 3072, 0, 2036);
            CM.S(StringResources_androidKt.n(i3, i2, composer2, ((i8 >> 3) & 14) | ((i8 << 3) & 112)), jVar.rl(composer2, 6).s7N(), null, aD.w6.dR0(), null, null, null, 0, false, 0, null, composer2, 3072, 0, 2036);
            composer2.XQ();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.C
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.xMQ(i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(int i2, int i3, Composer composer, int i5) {
        nr(i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(int i2, Composer composer, int i3) {
        J2(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void nr(final int i2, Composer composer, final int i3) {
        int i5;
        Composer composerKN = composer.KN(-1651252722);
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerKN.t(i2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1651252722, i5, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.DiscountTimerBox (DiscountTimerBox.kt:37)");
            }
            int i7 = i2 % 60;
            int i8 = (i2 / 60) % 60;
            int i9 = (i2 / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS) % 60;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion2.Uo();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), horizontalUo, composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            TextKt.t(StringResources_androidKt.t(2132017526, composerKN, 6), null, aD.w6.dR0(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).Ik(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(18), null, null, null, 0, 0, null, 16646143, null), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65018);
            composerKN = composerKN;
            Modifier modifierAz = PaddingKt.az(companion, 0.0f, Dp.KN(12), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion2.xMQ(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz);
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
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            KN(i9, 2131886083, composerKN, 48);
            J2(composerKN, 0);
            KN(i8, 2131886084, composerKN, 48);
            J2(composerKN, 0);
            KN(i7, 2131886085, composerKN, 48);
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.O(i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(int i2, int i3, int i5, Composer composer, int i7) {
        KN(i2, i3, composer, RecomposeScopeImplKt.n(i5 | 1));
        return Unit.INSTANCE;
    }

    private static final void J2(Composer composer, final int i2) {
        Composer composerKN = composer.KN(2085413849);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2085413849, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.Separator (DiscountTimerBox.kt:92)");
            }
            ImageKt.n(PainterResources_androidKt.t(2131231615, composerKN, 6), null, PaddingKt.gh(Modifier.INSTANCE, Dp.KN(8), 0.0f, 2, null), null, null, 0.0f, null, composerKN, 432, b.f61769v);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return qz.Uo(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
