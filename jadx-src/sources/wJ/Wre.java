package wJ;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.AndroidAlertDialog_androidKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wJ.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Wre {

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f74904n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f74905t;

        j(Function0 function0, Function0 function02) {
            this.f74904n = function0;
            this.f74905t = function02;
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
                ComposerKt.p5(944592369, i2, -1, "com.alightcreative.monetization.ui.components.dialogs.FreeTrialAlertDialog.<anonymous> (FreeTrialAlertDialog.kt:44)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(companion, 0.0f, 0.0f, Dp.KN(35), Dp.KN(20), 3, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(15));
            final Function0 function0 = this.f74904n;
            final Function0 function02 = this.f74905t;
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
            composer.eF(-629307404);
            boolean zP5 = composer.p5(function0);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: wJ.Ml
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.j.nr(function0);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Modifier modifierJ2 = ClickableKt.J2(companion, false, null, null, (Function0) objIF, 7, null);
            long jO = Color.INSTANCE.O();
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, modifierJ2, jO, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(jVar.rl(composer, 6).r(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.KN(22), null, null, null, 0, 0, null, 16646143, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
            String strT2 = StringResources_androidKt.t(2132020048, composer, 6);
            composer.eF(-629296674);
            boolean zP52 = composer.p5(function02);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: wJ.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.j.O(function02);
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
    public static final Unit O(Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        t(function0, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final Function0 onDialogClosed, final Function0 onSkipClicked, final Function0 onContinueButtonClicked, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onDialogClosed, "onDialogClosed");
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Composer composerKN = composer.KN(2021141417);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onDialogClosed) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onSkipClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(2021141417, i3, -1, "com.alightcreative.monetization.ui.components.dialogs.FreeTrialAlertDialog (FreeTrialAlertDialog.kt:26)");
            }
            composerKN.eF(-727994057);
            boolean z2 = (i3 & 14) == 4;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: wJ.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.nr(onDialogClosed);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(944592369, true, new j(onSkipClicked, onContinueButtonClicked), composerKN, 54);
            C2414j c2414j = C2414j.f74916n;
            composer2 = composerKN;
            AndroidAlertDialog_androidKt.rl((Function0) objIF, composableLambdaNr, null, c2414j.n(), c2414j.rl(), null, 0L, 0L, null, composer2, 27696, 484);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: wJ.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wre.O(onDialogClosed, onSkipClicked, onContinueButtonClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
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
