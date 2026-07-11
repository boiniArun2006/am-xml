package Yd;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(long j2, long j3, int i2, Composer composer, int i3) {
        t(j2, j3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    public static final void t(final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        Composer composerKN = composer.KN(962788652);
        if ((i2 & 6) == 0) {
            if (composerKN.nr(j2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i2 | i7;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.nr(j3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(962788652, i3, -1, "com.bendingspoons.legal.privacy.ui.internal.LoadingOverlay (LoadingOverlay.kt:18)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(BackgroundKt.nr(companion, j3, null, 2, null), 0.0f, 1, null);
            composerKN.eF(-1230979363);
            Object objIF = composerKN.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF == companion2.n()) {
                objIF = InteractionSourceKt.n();
                composerKN.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composerKN.Xw();
            composerKN.eF(-1230976519);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion2.n()) {
                objIF2 = new Function0() { // from class: Yd.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ml.nr();
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            Modifier modifierNr = ClickableKt.nr(modifierJ2, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion4.n();
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
            Updater.O(composerN, measurePolicyUo, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ProgressIndicatorKt.nr(BoxScopeInstance.f17448n.n(companion, companion3.O()), j2, 0.0f, 0L, 0, composerKN, (i3 << 3) & 112, 28);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Yd.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.O(j2, j3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
