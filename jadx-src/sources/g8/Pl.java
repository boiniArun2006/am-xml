package g8;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f67072n = ColorKt.nr(4283651156L);
    private static final long rl = ColorKt.nr(4288389793L);

    public static final void rl(Modifier modifier, final Function0 onExitClicked, final Function0 onRestorePurchasesClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onExitClicked, "onExitClicked");
        Intrinsics.checkNotNullParameter(onRestorePurchasesClicked, "onRestorePurchasesClicked");
        Composer composerKN = composer.KN(-787175800);
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
            i5 |= composerKN.E2(onExitClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onRestorePurchasesClicked) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
            composer2 = composerKN;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-787175800, i5, -1, "com.alightcreative.monetization.stackedintro.components.PaywallHeader (PaywallHeader.kt:26)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            IconButtonKt.O(onExitClicked, boxScopeInstance.n(companion3, companion.HI()), false, null, null, Wre.f67079n.n(), composerKN, ((i5 >> 3) & 14) | 196608, 28);
            composer2 = composerKN;
            Modifier modifier5 = modifier4;
            TextKt.t(StringResources_androidKt.t(2132019425, composerKN, 6), ClickableKt.J2(boxScopeInstance.n(companion3, companion.O()), false, null, null, onRestorePurchasesClicked, 7, null), rl, 0L, null, null, null, 0L, TextDecoration.INSTANCE.nr(), null, 0L, 0, false, 0, 0, null, MaterialTheme.f26164n.t(composerKN, MaterialTheme.rl).getTitleMedium(), composer2, 100663680, 0, 65272);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.qz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.t(modifier3, onExitClicked, onRestorePurchasesClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Modifier modifier, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i5) {
        rl(modifier, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
