package pBD;

import Dj7.CM;
import R5.Ml;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.media3.exoplayer.RendererCapabilities;
import eo.AbstractC1969w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Dsr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(ColumnScope columnScope, int i2, Composer composer, int i3) {
        O(columnScope, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void O(final ColumnScope columnScope, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1666603555);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1666603555, i3, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.LimitedTimeOfferCard (CountdownPaywallMainContent.kt:82)");
            }
            Modifier modifierMUb = PaddingKt.mUb(BackgroundKt.nr(ClipKt.n(Modifier.INSTANCE, RoundedCornerShapeKt.t(Dp.KN(4))), aD.w6.I(), null, 2, null), Dp.KN(8), Dp.KN((float) 0.5d));
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierT = columnScope.t(modifierMUb, companion.Uo());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
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
            CM.S(StringResources_androidKt.t(2132017529, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).aYN(), null, aD.w6.M7(), null, null, null, 0, false, 0, null, composerKN, 3072, 0, 2036);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.J2(columnScope, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Ml.j.n nVar, Function0 function0, Function0 function02, Function1 function1, int i2, Composer composer, int i3) {
        t(nVar, function0, function02, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final Ml.j.n viewState, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function1 onSubscriptionClicked, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companion;
        int i5;
        float f3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Composer composerKN = composer.KN(-741496035);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onManageSubscriptionClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 2048 : 1024;
        }
        int i7 = i3;
        if ((i7 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-741496035, i7, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.CountdownPaywallMainContent (CountdownPaywallMainContent.kt:41)");
            }
            R5.Wre wreRl = viewState.rl();
            ScrollState scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierGh = PaddingKt.gh(PaddingKt.az(ScrollKt.Uo(SizeKt.KN(companion2, 0.0f, 1, null), scrollStateT, false, null, false, 14, null), 0.0f, Dp.KN(72), 0.0f, 0.0f, 13, null), Dp.KN(19), 0.0f, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
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
            O(ColumnScopeInstance.f17468n, composerKN, 6);
            float f4 = 16;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f4)), composerKN, 6);
            Integer numT = wreRl != null ? wreRl.t() : null;
            composerKN.eF(-635978776);
            if (numT != null) {
                Xo.rl(numT.intValue(), composerKN, 0);
            }
            composerKN.Xw();
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f4)), composerKN, 6);
            mb8.fuX.ty(viewState.J2(), viewState.O(), onSubscriptionClicked, null, composerKN, (i7 >> 3) & 896, 8);
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(24)), composerKN, 6);
            qz.nr(viewState.nr(), composerKN, 0);
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(32)), composerKN, 6);
            o.o.t((wreRl != null ? wreRl.Uo() : null) != null, !viewState.n(), onContinueButtonClicked, 0.0f, composerKN, (i7 << 3) & 896, 8);
            composerKN = composerKN;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f4)), composerKN, 6);
            if (viewState.n()) {
                composerKN.eF(1760287654);
                o.Ml.t(onManageSubscriptionClicked, composerKN, (i7 >> 6) & 14);
                composerKN.Xw();
                i5 = 6;
                companion = companion2;
                f3 = f4;
            } else {
                composerKN.eF(1760367665);
                companion = companion2;
                i5 = 6;
                f3 = f4;
                AbstractC1969w6.t(D.fuX.Uo(wreRl, false, false, false, composerKN, 0, 14), null, 0, 0, composerKN, 0, 14);
                composerKN.Xw();
            }
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composerKN, i5);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.nr(viewState, onContinueButtonClicked, onManageSubscriptionClicked, onSubscriptionClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
