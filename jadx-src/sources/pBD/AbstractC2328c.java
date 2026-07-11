package pBD;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import eo.AbstractC1969w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pBD.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2328c {
    public static final void rl(R5.Wre wre, final Function0 onDoNotShowAgainClicked, Function0 function0, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companion;
        Composer composer2;
        final R5.Wre selectedSubscriptionItem = wre;
        final Function0 onGetMeDiscountClicked = function0;
        Intrinsics.checkNotNullParameter(selectedSubscriptionItem, "selectedSubscriptionItem");
        Intrinsics.checkNotNullParameter(onDoNotShowAgainClicked, "onDoNotShowAgainClicked");
        Intrinsics.checkNotNullParameter(onGetMeDiscountClicked, "onGetMeDiscountClicked");
        Composer composerKN = composer.KN(-1670892271);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(selectedSubscriptionItem) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onDoNotShowAgainClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onGetMeDiscountClicked) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1670892271, i3, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimePaywallBottomSheet (OneTimePaywallBottomSheet.kt:46)");
            }
            ScrollState scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f3 = 24;
            Modifier modifierT = WindowInsetsPadding_androidKt.t(PaddingKt.gh(ScrollKt.Uo(SizeKt.KN(companion2, 0.0f, 1, null), scrollStateT, false, null, false, 14, null), Dp.KN(f3), 0.0f, 2, null));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion3.Uo(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
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
            Updater.O(composerN, measurePolicyN, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Dj7.Ml.rl(columnScopeInstance, aD.w6.rV9(), composerKN, 54, 0);
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
            String strT = StringResources_androidKt.t(2132019795, composerKN, 6);
            Modifier modifierT2 = columnScopeInstance.t(companion2, companion3.Uo());
            long jKN = Color.INSTANCE.KN();
            TextAlign textAlignKN = TextAlign.KN(TextAlign.INSTANCE.n());
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, modifierT2, jKN, 0L, null, null, null, 0L, null, textAlignKN, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).qie(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
            int i5 = i3;
            eo.C.O(columnScopeInstance, StringResources_androidKt.t(2132019794, composerKN, 6), 0L, jVar.rl(composerKN, 6).o(), onDoNotShowAgainClicked, composerKN, ((i3 << 9) & 57344) | 6, 2);
            Integer numT = selectedSubscriptionItem.t();
            composerKN.eF(-420328113);
            if (numT == null) {
                onGetMeDiscountClicked = function0;
                composer2 = composerKN;
                companion = companion2;
            } else {
                int iIntValue = numT.intValue();
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(16)), composerKN, 6);
                companion = companion2;
                Dj7.eO.J2(function0, StringResources_androidKt.nr(2132019793, new Object[]{Integer.valueOf(iIntValue)}, composerKN, 6), SizeKt.KN(companion2, 0.0f, 1, null), null, Dj7.CN3.f1599r, null, 0, 0, 0.0f, null, null, null, false, composerKN, ((i5 >> 6) & 14) | 24960, 0, 8168);
                onGetMeDiscountClicked = function0;
                composer2 = composerKN;
            }
            composer2.Xw();
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer2, 6);
            int i7 = i5 & 14;
            Modifier.Companion companion5 = companion;
            selectedSubscriptionItem = wre;
            AbstractC1969w6.t(D.fuX.Uo(selectedSubscriptionItem, false, false, false, composer2, i7, 14), null, 0, 0, composer2, 0, 14);
            SpacerKt.n(SizeKt.xMQ(companion5, Dp.KN(16)), composer2, 6);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.l3D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2328c.t(selectedSubscriptionItem, onDoNotShowAgainClicked, onGetMeDiscountClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(R5.Wre wre, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        rl(wre, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
