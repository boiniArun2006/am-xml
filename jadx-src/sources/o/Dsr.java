package o;

import Dj7.YzO;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Dsr {
    public static final void rl(final Function0 onClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(588977627);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onClicked) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(588977627, i3, -1, "com.alightcreative.monetization.ui.components.buttons.PaywallCloseWithAdButton (PaywallCloseWithAdButton.kt:34)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
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
            int i5 = i3;
            YzO.rl(aD.w6.v(), SizeKt.xMQ(companion, Dp.KN(128)), null, composerKN, 54, 4);
            float f3 = 16;
            Modifier modifierKN = SizeKt.KN(boxScopeInstance.n(PaddingKt.az(WindowInsetsPadding_androidKt.nr(companion), 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null), companion2.az()), 0.0f, 1, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.nr(), companion2.xMQ(), composerKN, 54);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierKN);
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
            Modifier modifierMUb = SizeKt.mUb(rowScopeInstance.n(PaddingKt.gh(companion, Dp.KN(f3), 0.0f, 2, null), 1.0f, false), Dp.KN(36), Dp.KN(40));
            RoundedCornerShape roundedCornerShapeN = RoundedCornerShapeKt.n(50);
            ButtonDefaults buttonDefaults = ButtonDefaults.f21598n;
            float f4 = 0;
            float fKN = Dp.KN(f4);
            float fKN2 = Dp.KN(f4);
            int i7 = ButtonDefaults.qie;
            ButtonElevation buttonElevationRl = buttonDefaults.rl(fKN, fKN2, 0.0f, 0.0f, 0.0f, composerKN, (i7 << 15) | 54, 28);
            Color.Companion companion4 = Color.INSTANCE;
            ButtonKt.n(onClicked, modifierMUb, false, null, buttonElevationRl, roundedCornerShapeN, null, buttonDefaults.n(Color.az(companion4.KN(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), companion4.KN(), 0L, 0L, composerKN, (i7 << 12) | 54, 12), PaddingKt.t(Dp.KN(12), 0.0f, 2, null), C2306j.f71333n.n(), composerKN, (i5 & 14) | 905969664, 76);
            composerKN = composerKN;
            SpacerKt.n(RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null), composerKN, 0);
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: o.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.t(onClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, int i2, Composer composer, int i3) {
        rl(function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
