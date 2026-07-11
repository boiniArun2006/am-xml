package com.alightcreative.monetization.stackedintro;

import Dj7.u;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.monetization.stackedintro.C;
import com.alightcreative.monetization.stackedintro.aC;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import g8.AbstractC2112c;
import g8.Pl;
import g8.QJ;
import g8.g9s;
import g8.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class aC {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C.CN3.j f46803n;

        j(C.CN3.j jVar) {
            this.f46803n = jVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            String strT;
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-2054640453, i2, -1, "com.alightcreative.monetization.stackedintro.StackedIntroOffersPaywallScreen.<anonymous>.<anonymous>.<anonymous> (StackedOffersPaywallScreen.kt:107)");
            }
            if (this.f46803n.O()) {
                composer.eF(1537129672);
                strT = StringResources_androidKt.t(2132020193, composer, 6);
                composer.Xw();
            } else {
                composer.eF(1537258291);
                strT = StringResources_androidKt.t(2132020192, composer, 6);
                composer.Xw();
            }
            String str = strT;
            TextKt.t(str, null, 0L, 0L, null, FontWeight.INSTANCE.J2(), null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.f26164n.t(composer, MaterialTheme.rl).getTitleLarge(), composer, 196608, 0, 65502);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Modifier modifier, C.CN3.j jVar, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, int i2, int i3, Composer composer, int i5) {
        rl(modifier, jVar, function0, function1, function12, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void rl(Modifier modifier, final C.CN3.j viewState, final Function0 onExitClicked, final Function1 onPeriodicityChanged, final Function1 onFreeTrialChanged, final Function0 onRestorePurchasesClicked, final Function0 onPurchaseClicked, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Modifier.Companion companion;
        ColumnScopeInstance columnScopeInstance;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onExitClicked, "onExitClicked");
        Intrinsics.checkNotNullParameter(onPeriodicityChanged, "onPeriodicityChanged");
        Intrinsics.checkNotNullParameter(onFreeTrialChanged, "onFreeTrialChanged");
        Intrinsics.checkNotNullParameter(onRestorePurchasesClicked, "onRestorePurchasesClicked");
        Intrinsics.checkNotNullParameter(onPurchaseClicked, "onPurchaseClicked");
        Composer composerKN = composer.KN(1910991311);
        int i8 = i3 & 1;
        if (i8 != 0) {
            modifier2 = modifier;
            i7 = i2 | 6;
            i5 = 16;
        } else if ((i2 & 6) == 0) {
            i5 = 16;
            modifier2 = modifier;
            i7 = i2 | (composerKN.p5(modifier2) ? 4 : 2);
        } else {
            i5 = 16;
            modifier2 = modifier;
            i7 = i2;
        }
        if ((i3 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.p5(viewState) ? 32 : i5;
        }
        int i9 = i7;
        if ((i3 & 4) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerKN.E2(onExitClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i9 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i9 |= composerKN.E2(onPeriodicityChanged) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i9 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i9 |= composerKN.E2(onFreeTrialChanged) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i9 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i9 |= composerKN.E2(onRestorePurchasesClicked) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i9 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i9 |= composerKN.E2(onPurchaseClicked) ? 1048576 : 524288;
        }
        if ((599187 & i9) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
            composer2 = composerKN;
        } else {
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            Modifier modifier4 = modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(1910991311, i9, -1, "com.alightcreative.monetization.stackedintro.StackedIntroOffersPaywallScreen (StackedOffersPaywallScreen.kt:43)");
            }
            Modifier modifierJ2 = SizeKt.J2(modifier4, 0.0f, 1, null);
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
            Modifier.Companion companion4 = Modifier.INSTANCE;
            o.nr(SizeKt.J2(companion4, 0.0f, 1, null), composerKN, 6, 0);
            Modifier modifierUo = ScrollKt.Uo(SizeKt.J2(companion4, 0.0f, 1, null), ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierUo);
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
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
            float f3 = 8;
            int i10 = i9;
            Pl.rl(PaddingKt.mUb(SizeKt.KN(companion4, 0.0f, 1, null), Dp.KN(f3), Dp.KN(20)), onExitClicked, onRestorePurchasesClicked, composerKN, ((i9 >> 3) & 112) | ((i9 >> 9) & 896), 0);
            g9s.J2(columnScopeInstance2, columnScopeInstance2.t(PaddingKt.az(companion4, 0.0f, Dp.KN(0), 0.0f, 0.0f, 13, null), companion2.Uo()), viewState.rl(), onPeriodicityChanged, composerKN, 6 | (i10 & 7168), 0);
            AbstractC2112c.rl(columnScopeInstance2, viewState.rl(), viewState.O(), viewState.n(), viewState.t(), viewState.nr(), composerKN, 6);
            SpacerKt.n(ColumnScope.rl(columnScopeInstance2, companion4, 1.0f, false, 2, null), composerKN, 0);
            float f4 = 24;
            g8.fuX.rl(columnScopeInstance2.t(PaddingKt.gh(SizeKt.xMQ(companion4, Dp.KN(80)), Dp.KN(f4), 0.0f, 2, null), companion2.Uo()), viewState.O(), onFreeTrialChanged, composerKN, (i10 >> 6) & 896, 0);
            composerKN.eF(-1969222980);
            if (viewState.nr() != StackedIntroOffersEntity.Treatment.SIMPLE_STACKED_INTRO_OFFERS) {
                companion = companion4;
                columnScopeInstance = columnScopeInstance2;
                QJ.nr(columnScopeInstance, SizeKt.KN(PaddingKt.gh(PaddingKt.az(companion, 0.0f, Dp.KN(f3), 0.0f, 0.0f, 13, null), Dp.KN(f4), 0.0f, 2, null), 0.0f, 1, null), viewState.rl(), viewState.O(), viewState.n(), viewState.t(), composerKN, 54);
            } else {
                companion = companion4;
                columnScopeInstance = columnScopeInstance2;
            }
            composerKN.Xw();
            ButtonKt.n(onPurchaseClicked, columnScopeInstance.t(SizeKt.xMQ(SizeKt.KN(PaddingKt.gh(PaddingKt.az(companion, 0.0f, Dp.KN(f4), 0.0f, Dp.KN(60), 5, null), Dp.KN(f4), 0.0f, 2, null), 0.0f, 1, null), Dp.KN(64)), companion2.Uo()), false, MaterialTheme.f26164n.rl(composerKN, MaterialTheme.rl).getLarge(), null, null, null, null, null, ComposableLambdaKt.nr(-2054640453, true, new j(viewState), composerKN, 54), composerKN, ((i10 >> 18) & 14) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 500);
            composer2 = composerKN;
            composer2.XQ();
            u.rl(viewState.J2(), 0L, composer2, 0, 2);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: K.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return aC.t(modifier3, viewState, onExitClicked, onPeriodicityChanged, onFreeTrialChanged, onRestorePurchasesClicked, onPurchaseClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
