package ka;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class r {
    public static final void rl(boolean z2, Function0 onOptOutButtonClick, Function0 onStayButtonClick, Composer composer, final int i2) {
        int i3;
        final Function0 function0;
        final Function0 function02;
        final boolean z3 = z2;
        Intrinsics.checkNotNullParameter(onOptOutButtonClick, "onOptOutButtonClick");
        Intrinsics.checkNotNullParameter(onStayButtonClick, "onStayButtonClick");
        Composer composerKN = composer.KN(1359423776);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onOptOutButtonClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onStayButtonClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            function02 = onOptOutButtonClick;
            function0 = onStayButtonClick;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1359423776, i3, -1, "com.alightcreative.app.motion.ranking.ui.RankingOptOutBottomSheetContent (RankingOptOutBottomSheetContent.kt:30)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierN = IntrinsicKt.n(companion, IntrinsicSize.f17696n);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            float f3 = 16;
            Modifier modifierMUb = PaddingKt.mUb(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), Dp.KN(44));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.Uo(), composerKN, 48);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierMUb);
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
            String strT = StringResources_androidKt.t(2132017625, composerKN, 6);
            Modifier modifierGh = PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleIF = jVar.rl(composerKN, 6).iF();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int i5 = i3;
            TextKt.t(strT, modifierGh, aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, textStyleIF, composerKN, 432, 0, 65016);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composerKN, 6);
            TextKt.t(StringResources_androidKt.t(2132017623, composerKN, 6), PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).wTp(), composerKN, 432, 0, 65016);
            composerKN = composerKN;
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(32)), composerKN, 6);
            Dj7.eO.J2(onOptOutButtonClick, StringResources_androidKt.t(2132017622, composerKN, 6), SizeKt.KN(companion, 0.0f, 1, null), null, null, null, 0, 0, 0.0f, null, null, null, false, composerKN, ((i5 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8184);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composerKN, 6);
            Dj7.eO.J2(onStayButtonClick, StringResources_androidKt.t(2132017624, composerKN, 6), SizeKt.KN(companion, 0.0f, 1, null), null, Dj7.CN3.f1593O, null, 0, 0, 0.0f, null, null, null, false, composerKN, ((i5 >> 6) & 14) | 24960, 0, 8168);
            function0 = onStayButtonClick;
            composerKN.XQ();
            z3 = z2;
            function02 = onOptOutButtonClick;
            Dj7.u.rl(z3, 0L, composerKN, i5 & 14, 2);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.Q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.t(z3, function02, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z2, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        rl(z2, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
