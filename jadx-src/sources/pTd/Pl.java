package pTd;

import R5.Ml;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import eo.AbstractC1969w6;
import f.EnumC1982eO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mb8.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Pl {
    public static final void rl(final WindowSizeClass windowSizeClass, final ScrollState scrollState, final LazyListState cloudBackupRowLazyListState, Ml.j.C0297j viewState, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function0 onFreeTrialCheckboxClicked, final Function1 onSubscriptionClicked, final Function1 onTierSelected, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Ml.j.C0297j c0297j;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(cloudBackupRowLazyListState, "cloudBackupRowLazyListState");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onTierSelected, "onTierSelected");
        Composer composerKN = composer.KN(-1614935448);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(windowSizeClass) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(scrollState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(cloudBackupRowLazyListState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(viewState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onManageSubscriptionClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.E2(onTierSelected) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            c0297j = viewState;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1614935448, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.CloudCardsMainContent (CloudCardsMainContent.kt:39)");
            }
            boolean zQie = WindowWidthSizeClass.qie(windowSizeClass.getWidthSizeClass(), WindowWidthSizeClass.INSTANCE.nr());
            EnumC1982eO enumC1982eOJ2 = viewState.J2();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i5 = i3;
            Modifier modifierUo = ScrollKt.Uo(WindowInsetsPadding_androidKt.t(SizeKt.J2(companion2, 0.0f, 1, null)), scrollState, false, null, false, 14, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion3.Uo();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.n(), horizontalUo, composerKN, 54);
            boolean z2 = false;
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierUo);
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
            if (enumC1982eOJ2 == EnumC1982eO.f64023o) {
                z2 = true;
            }
            int i7 = i5 >> 6;
            int i8 = i7 & 112;
            int i9 = i5 >> 9;
            Ml.rl(columnScopeInstance, viewState, z2, cloudBackupRowLazyListState, onSubscriptionClicked, onTierSelected, composerKN, 6 | i8 | ((i5 << 3) & 7168) | (i9 & 57344) | (i9 & 458752));
            composer2 = composerKN;
            Modifier modifierG = SizeKt.g(PaddingKt.gh(companion2, Dp.KN(24), 0.0f, 2, null), 0.0f, Dp.KN(334), 1, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.n(), companion3.gh(), composer2, 6);
            int iN2 = ComposablesKt.n(composer2, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer2.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer2, modifierG);
            Function0 function0N2 = companion4.n();
            if (composer2.getApplier() == null) {
                ComposablesKt.t();
            }
            composer2.T();
            if (composer2.getInserting()) {
                composer2.s7N(function0N2);
            } else {
                composer2.r();
            }
            Composer composerN2 = Updater.n(composer2);
            Updater.O(composerN2, measurePolicyN2, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            QJ.qie(enumC1982eOJ2, viewState, onFreeTrialCheckboxClicked, zQie, composer2, i8 | ((i5 >> 12) & 896));
            c0297j = viewState;
            float f3 = 16;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composer2, 6);
            boolean zT2 = c0297j.t();
            boolean z3 = !c0297j.n();
            composer2.eF(1007229434);
            float fKN = c0297j.gh() ? Dp.KN(84) : Dj7.fuX.rl(Dj7.CN3.f1599r, false, composer2, 6, 1);
            composer2.Xw();
            o.o.t(zT2, z3, onContinueButtonClicked, fKN, composer2, i7 & 896, 0);
            if (c0297j.n()) {
                composer2.eF(1159564863);
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composer2, 6);
                o.Ml.t(onManageSubscriptionClicked, composer2, (i5 >> 15) & 14);
                composer2.Xw();
                companion = companion2;
            } else if (c0297j.gh()) {
                companion = companion2;
                composer2.eF(1159870988);
                composer2.Xw();
            } else {
                composer2.eF(1159743175);
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composer2, 6);
                companion = companion2;
                AbstractC1969w6.t(Xo.n(c0297j, null, composer2, i9 & 14, 1), null, 0, 0, composer2, 0, 14);
                composer2 = composer2;
                composer2.Xw();
            }
            composer2.XQ();
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f3)), composer2, 6);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            final Ml.j.C0297j c0297j2 = c0297j;
            scopeUpdateScopeGh.n(new Function2() { // from class: pTd.qz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.t(windowSizeClass, scrollState, cloudBackupRowLazyListState, c0297j2, onContinueButtonClicked, onManageSubscriptionClicked, onFreeTrialCheckboxClicked, onSubscriptionClicked, onTierSelected, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(WindowSizeClass windowSizeClass, ScrollState scrollState, LazyListState lazyListState, Ml.j.C0297j c0297j, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        rl(windowSizeClass, scrollState, lazyListState, c0297j, function0, function02, function03, function1, function12, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
