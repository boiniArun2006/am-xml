package pBD;

import Dj7.CM;
import Dj7.QaP;
import R5.Ml;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class ci {
    private static final void J2(final ColumnScope columnScope, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1076731627);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1076731627, i3, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimeChanceCard (OneTimePaywallMainContent.kt:98)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierGh = PaddingKt.gh(BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(Dp.KN(4))), aD.w6.I(), null, 2, null), Dp.KN(10), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierT = columnScope.t(modifierGh, companion2.Uo());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierT);
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
            CM.S(StringResources_androidKt.t(2132019799, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).t(), BoxScopeInstance.f17448n.n(companion, companion2.O()), aD.w6.M7(), null, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0, false, 0, null, composerKN, 3072, 0, 1968);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.SPz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ci.Uo(columnScope, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void KN(final Ml.j.w6 viewState, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function1 onSubscriptionClicked, final Function0 onGiveUpClicked, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onGiveUpClicked, "onGiveUpClicked");
        Composer composerKN = composer.KN(-1115593781);
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
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onGiveUpClicked) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((i5 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1115593781, i5, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimePaywallMainContent (OneTimePaywallMainContent.kt:53)");
            }
            R5.Wre wreRl = viewState.rl();
            ScrollState scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierGh = PaddingKt.gh(PaddingKt.az(ScrollKt.Uo(SizeKt.KN(companion2, 0.0f, 1, null), scrollStateT, false, null, false, 14, null), 0.0f, Dp.KN(72), 0.0f, 0.0f, 13, null), Dp.KN(24), 0.0f, 2, null);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            J2(columnScopeInstance, composerKN, 6);
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(36)), composerKN, 6);
            Integer numT = wreRl != null ? wreRl.t() : null;
            composerKN.eF(-258675260);
            if (numT == null) {
                composer2 = composerKN;
            } else {
                int iIntValue = numT.intValue();
                Xo.rl(iIntValue, composerKN, 0);
                float f3 = 16;
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
                mb8.fuX.ty(viewState.O(), viewState.nr(), onSubscriptionClicked, null, composerKN, (i5 >> 3) & 896, 8);
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(48)), composerKN, 6);
                nr(wreRl, iIntValue, composerKN, 0);
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composerKN, 6);
                o.o.t(wreRl.Uo() != null, !viewState.n(), onContinueButtonClicked, 0.0f, composerKN, (i5 << 3) & 896, 8);
                composer2 = composerKN;
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composer2, 6);
                if (viewState.n()) {
                    composer2.eF(-1378943811);
                    o.Ml.t(onManageSubscriptionClicked, composer2, (i5 >> 6) & 14);
                    composer2.Xw();
                    companion = companion2;
                } else {
                    composer2.eF(-1378849726);
                    int i7 = 6 | (57344 & i5);
                    companion = companion2;
                    eo.C.O(columnScopeInstance, StringResources_androidKt.t(2132019798, composer2, 6), 0L, H9N.j.f3810n.rl(composer2, 6).o(), onGiveUpClicked, composer2, i7, 2);
                    composer2 = composer2;
                    composer2.Xw();
                }
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer2, 6);
            }
            composer2.Xw();
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.Q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ci.xMQ(viewState, onContinueButtonClicked, onManageSubscriptionClicked, onSubscriptionClicked, onGiveUpClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(R5.Wre wre, int i2, int i3, Composer composer, int i5) {
        nr(wre, i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(ColumnScope columnScope, int i2, Composer composer, int i3) {
        J2(columnScope, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void nr(final R5.Wre wre, final int i2, Composer composer, final int i3) {
        int i5;
        Composer composerKN = composer.KN(-1994111045);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(wre) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1994111045, i5, -1, gUxOLwRQBPPLC.soDCdpkViuBId);
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            float f3 = 20;
            float f4 = 16;
            Modifier modifierN = BoxScopeInstance.f17448n.n(PaddingKt.mUb(BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(Dp.KN(f3))), Color.az(aD.w6.dR0(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.KN(f3), Dp.KN(f4)), companion2.ty());
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.HI(), false);
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
            Updater.O(composerN2, measurePolicyUo2, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            Modifier modifierKN2 = SizeKt.KN(companion, 0.0f, 1, null);
            Alignment.Vertical verticalXMQ = companion2.xMQ();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composerKN, 48);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierKN2);
            Function0 function0N3 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyRl, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            Modifier modifierRl = RowScope.rl(RowScopeInstance.f17780n, PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(f4), 0.0f, 11, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composerKN, 0);
            int iN4 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk4 = composerKN.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composerKN, modifierRl);
            Function0 function0N4 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N4);
            } else {
                composerKN.r();
            }
            Composer composerN4 = Updater.n(composerKN);
            Updater.O(composerN4, measurePolicyN, companion3.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion3.O());
            Function2 function2Rl4 = companion3.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String str = "{line_through}" + wre.qie() + "{/line_through} {yellow}" + StringResources_androidKt.nr(2132019808, new Object[]{Integer.valueOf(i2)}, composerKN, 6) + "{/yellow}";
            long jDR0 = aD.w6.dR0();
            H9N.j jVar = H9N.j.f3810n;
            CM.xMQ(str, null, jDR0, null, jVar.rl(composerKN, 6).bzg(), CollectionsKt.listOf((Object[]) new QaP[]{new QaP("line_through", new P0j.Dsr(false, true, true, false, false, Color.xMQ(aD.w6.P5()), 0L, null, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, null)), new QaP("yellow", new P0j.Dsr(false, false, true, false, false, Color.xMQ(aD.w6.I()), 0L, null, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, null))}), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 10);
            float f5 = 4;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f5)), composerKN, 6);
            TextKt.t(D.fuX.Uo(wre, false, true, false, composerKN, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 10), null, aD.w6.dR0(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).N(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            composerKN.XQ();
            ImageKt.n(PainterResources_androidKt.t(2131231747, composerKN, 6), "Giftbox icon", PaddingKt.xMQ(companion, Dp.KN(f5)), null, null, 0.0f, null, composerKN, 432, b.f61769v);
            composerKN.XQ();
            composerKN.XQ();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ci.O(wre, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Ml.j.w6 w6Var, Function0 function0, Function0 function02, Function1 function1, Function0 function03, int i2, Composer composer, int i3) {
        KN(w6Var, function0, function02, function1, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
