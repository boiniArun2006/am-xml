package pBD;

import D.AbstractC1319c;
import R5.Ml;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pBD.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {

    static final class j implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f71639O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f71640n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1 f71641r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ml.j.n f71642t;

        j(Function0 function0, Ml.j.n nVar, Function0 function02, Function0 function03, Function1 function1) {
            this.f71640n = function0;
            this.f71642t = nVar;
            this.f71639O = function02;
            this.J2 = function03;
            this.f71641r = function1;
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
                ComposerKt.p5(-978155747, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.CountdownPaywallContent.<anonymous> (CountdownPaywallContent.kt:58)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(-144));
            Ml.j.n nVar = this.f71642t;
            Function0 function0 = this.f71639O;
            Function0 function02 = this.J2;
            Function1 function1 = this.f71641r;
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
            AbstractC1319c.J2(ColumnScope.rl(ColumnScopeInstance.f17468n, companion, 1.0f, false, 2, null), composer, 0, 0);
            Dsr.t(nVar, function0, function02, function1, composer, 0);
            composer.XQ();
            o.CN3.t(this.f71640n, PaddingKt.az(WindowInsetsPadding_androidKt.nr(companion), Dp.KN(8), Dp.KN(4), 0.0f, 0.0f, 12, null), PaddingKt.n(Dp.KN(12)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            D.I28.rl(0.9f, this.f71642t.t(), composer, 6, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f71643n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f71644t;

        n(Function0 function0, Function0 function02) {
            this.f71643n = function0;
            this.f71644t = function02;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1126771660, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.CountdownPaywallContent.<anonymous> (CountdownPaywallContent.kt:101)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(35), Dp.KN(20), 3, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(15));
            final Function0 function0 = this.f71643n;
            final Function0 function02 = this.f71644t;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalTy, Alignment.INSTANCE.qie(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierAz);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            SpacerKt.n(RowScope.rl(RowScopeInstance.f17780n, companion, 1.0f, false, 2, null), composer, 0);
            String strT = StringResources_androidKt.t(2132019791, composer, 6);
            composer.eF(774123750);
            boolean zP5 = composer.p5(function0);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: pBD.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ml.n.nr(function0);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Modifier modifierJ2 = ClickableKt.J2(companion, false, null, null, (Function0) objIF, 7, null);
            long jO = Color.INSTANCE.O();
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, modifierJ2, jO, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(jVar.rl(composer, 6).r(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(22), null, null, null, 0, 0, null, 16646143, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            String strT2 = StringResources_androidKt.t(2132017524, composer, 6);
            composer.eF(774135462);
            boolean zP52 = composer.p5(function02);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: pBD.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ml.n.O(function02);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            TextKt.t(strT2, ClickableKt.J2(companion, false, null, null, (Function0) objIF2, 7, null), aD.w6.Y(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(jVar.rl(composer, 6).r(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(22), null, null, null, 0, 0, null, 16646143, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Ml.j.n nVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function0 function05, int i2, Composer composer, int i3) {
        t(nVar, function0, function02, function1, function03, function04, function05, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final Ml.j.n viewState, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function1 onSubscriptionClicked, final Function0 onCloseIconClicked, final Function0 onCloseAttemptConfirmed, final Function0 onCloseAttemptCancelled, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onCloseIconClicked, "onCloseIconClicked");
        Intrinsics.checkNotNullParameter(onCloseAttemptConfirmed, "onCloseAttemptConfirmed");
        Intrinsics.checkNotNullParameter(onCloseAttemptCancelled, "onCloseAttemptCancelled");
        Composer composerKN = composer.KN(1212489697);
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
            i3 |= composerKN.E2(onCloseIconClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onCloseAttemptConfirmed) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onCloseAttemptCancelled) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1212489697, i3, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.CountdownPaywallContent (CountdownPaywallContent.kt:50)");
            }
            Modifier modifierT = WindowInsetsPadding_androidKt.t(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null));
            H9N.j jVar = H9N.j.f3810n;
            int i5 = i3;
            SurfaceKt.n(modifierT, null, jVar.n(composerKN, 6).rl(), jVar.n(composerKN, 6).t(), null, 0.0f, ComposableLambdaKt.nr(-978155747, true, new j(onCloseIconClicked, viewState, onContinueButtonClicked, onManageSubscriptionClicked, onSubscriptionClicked), composerKN, 54), composerKN, 1572864, 50);
            if (viewState.Uo()) {
                composerKN.eF(-1014716504);
                boolean z2 = (i5 & 3670016) == 1048576;
                Object objIF = composerKN.iF();
                if (z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: pBD.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Ml.nr(onCloseAttemptCancelled);
                        }
                    };
                    composerKN.o(objIF);
                }
                Function0 function0 = (Function0) objIF;
                composerKN.Xw();
                ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1126771660, true, new n(onCloseAttemptConfirmed, onCloseAttemptCancelled), composerKN, 54);
                pBD.j jVar2 = pBD.j.f71678n;
                AndroidAlertDialog_androidKt.rl(function0, composableLambdaNr, null, jVar2.n(), jVar2.rl(), null, 0L, 0L, null, composerKN, 27696, 484);
                composer2 = composerKN;
            } else {
                composer2 = composerKN;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.O(viewState, onContinueButtonClicked, onManageSubscriptionClicked, onSubscriptionClicked, onCloseIconClicked, onCloseAttemptConfirmed, onCloseAttemptCancelled, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
