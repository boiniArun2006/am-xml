package pBD;

import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.caoccao.javet.interop.engine.JavetEngineConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class afx {
    private static final String nr(int i2) {
        String strSubstring = String.valueOf(i2 + 100).substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void rl(final int i2, Composer composer, final int i3) {
        int i5;
        Composer composerKN = composer.KN(984818516);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(984818516, i5, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.TimeLeftCard (TimeLeftCard.kt:23)");
            }
            String strNr = nr(i2 % 60);
            String strNr2 = nr((i2 / 60) % 60);
            String strNr3 = nr((i2 / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS) % 60);
            Modifier modifierMUb = PaddingKt.mUb(BackgroundKt.nr(ClipKt.n(Modifier.INSTANCE, RoundedCornerShapeKt.t(Dp.KN(4))), aD.w6.I(), null, 2, null), Dp.KN(8), Dp.KN((float) 0.5d));
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
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
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            CM.S(StringResources_androidKt.nr(2132017528, new Object[]{strNr3, strNr2, strNr}, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).aYN(), null, aD.w6.M7(), null, null, null, 0, false, 0, null, composerKN, 3072, 0, 2036);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.g9s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return afx.t(i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i2, int i3, Composer composer, int i5) {
        rl(i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }
}
