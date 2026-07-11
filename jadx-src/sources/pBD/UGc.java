package pBD;

import D.AbstractC1319c;
import R5.Ml;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class UGc {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f71657O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.w6 f71658n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f71659t;

        j(Ml.j.w6 w6Var, Function0 function0, Function0 function02) {
            this.f71658n = w6Var;
            this.f71659t = function0;
            this.f71657O = function02;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(ColumnScope ModalBottomSheetLayout, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(449286959, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimePaywallContent.<anonymous> (OneTimePaywallContent.kt:48)");
            }
            AbstractC2328c.rl((R5.Wre) this.f71658n.O().get(this.f71658n.nr()), this.f71659t, this.f71657O, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f71660O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.w6 f71661n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f71662r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f71663t;

        static final class j implements Function2 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f71664O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml.j.w6 f71665n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function0 f71666r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f71667t;

            j(Ml.j.w6 w6Var, Function0 function0, Function0 function02, Function1 function1, Function0 function03) {
                this.f71665n = w6Var;
                this.f71667t = function0;
                this.f71664O = function02;
                this.J2 = function1;
                this.f71666r = function03;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(1437912164, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimePaywallContent.<anonymous>.<anonymous> (OneTimePaywallContent.kt:67)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(-220));
                Ml.j.w6 w6Var = this.f71665n;
                Function0 function0 = this.f71667t;
                Function0 function02 = this.f71664O;
                Function1 function1 = this.J2;
                Function0 function03 = this.f71666r;
                MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, Alignment.INSTANCE.gh(), composer, 6);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
                if (composer.getApplier() == null) {
                    ComposablesKt.t();
                }
                composer.T();
                if (composer.getInserting()) {
                    composer.s7N(function0N);
                } else {
                    composer.r();
                }
                Composer composerN = Updater.n(composer);
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                Function2 function2Rl = companion2.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                AbstractC1319c.mUb(ColumnScope.rl(ColumnScopeInstance.f17468n, companion, 1.0f, false, 2, null), composer, 0, 0);
                ci.KN(w6Var, function0, function02, function1, function03, composer, 0);
                composer.XQ();
                D.I28.rl(0.9f, this.f71665n.t(), composer, 6, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n(Ml.j.w6 w6Var, Function0 function0, Function0 function02, Function1 function1, Function0 function03) {
            this.f71661n = w6Var;
            this.f71663t = function0;
            this.f71660O = function02;
            this.J2 = function1;
            this.f71662r = function03;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(210518312, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimePaywallContent.<anonymous> (OneTimePaywallContent.kt:60)");
            }
            Modifier modifierT = WindowInsetsPadding_androidKt.t(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null));
            H9N.j jVar = H9N.j.f3810n;
            SurfaceKt.n(modifierT, null, jVar.n(composer, 6).rl(), jVar.n(composer, 6).t(), null, 0.0f, ComposableLambdaKt.nr(1437912164, true, new j(this.f71661n, this.f71663t, this.f71660O, this.J2, this.f71662r), composer, 54), composer, 1572864, 50);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final Ml.j.w6 viewState, final ModalBottomSheetState sheetState, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function1 onSubscriptionClicked, final Function0 onGiveUpClicked, final Function0 onDoNotShowAgainClicked, final Function0 onBottomSheetDismissed, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onGiveUpClicked, "onGiveUpClicked");
        Intrinsics.checkNotNullParameter(onDoNotShowAgainClicked, "onDoNotShowAgainClicked");
        Intrinsics.checkNotNullParameter(onBottomSheetDismissed, "onBottomSheetDismissed");
        Composer composerKN = composer.KN(162938881);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onManageSubscriptionClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onGiveUpClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onDoNotShowAgainClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(onBottomSheetDismissed) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(162938881, i3, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.OneTimePaywallContent (OneTimePaywallContent.kt:44)");
            }
            float f3 = 20;
            ModalBottomSheetKt.rl(ComposableLambdaKt.nr(449286959, true, new j(viewState, onDoNotShowAgainClicked, onBottomSheetDismissed), composerKN, 54), null, sheetState, false, RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), 0.0f, aD.w6.M7(), Color.INSTANCE.KN(), aD.w6.fD(), ComposableLambdaKt.nr(210518312, true, new n(viewState, onContinueButtonClicked, onManageSubscriptionClicked, onSubscriptionClicked, onGiveUpClicked), composerKN, 54), composerKN, (ModalBottomSheetState.f22280O << 6) | 920125446 | ((i3 << 3) & 896), 42);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.s4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UGc.t(viewState, sheetState, onContinueButtonClicked, onManageSubscriptionClicked, onSubscriptionClicked, onGiveUpClicked, onDoNotShowAgainClicked, onBottomSheetDismissed, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Ml.j.w6 w6Var, ModalBottomSheetState modalBottomSheetState, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function0 function05, int i2, Composer composer, int i3) {
        rl(w6Var, modalBottomSheetState, function0, function02, function1, function03, function04, function05, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
