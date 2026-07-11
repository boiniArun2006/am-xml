package PB;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {
    public static final void rl(Modifier modifier, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        Composer composerKN = composer.KN(206340533);
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
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(206340533, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.composables.TemplateErrorPlaceholder (TemplatesErrorPlaceholder.kt:20)");
            }
            Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.t(modifier4, Color.az(Color.INSTANCE.n(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.t(Dp.KN(16))), Dp.KN(24));
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierXMQ);
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            String strT = StringResources_androidKt.t(2132018961, composerKN, 6);
            TextStyle textStyleWTp = H9N.j.f3810n.rl(composerKN, 6).wTp();
            composer2 = composerKN;
            long jPo6 = aD.w6.Po6();
            Modifier modifierN = boxScopeInstance.n(Modifier.INSTANCE, companion.O());
            modifier3 = modifier4;
            TextKt.t(strT, modifierN, jPo6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleWTp, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: PB.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I28.t(modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Modifier modifier, int i2, int i3, Composer composer, int i5) {
        rl(modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
