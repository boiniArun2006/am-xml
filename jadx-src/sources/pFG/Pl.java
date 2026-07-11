package pFG;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pFG.Pl;
import pFG.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Pl {

    static final class j implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f71760O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f71761n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Z.j f71762t;

        j(Function1 function1, Z.j jVar, Function1 function12, Function1 function13) {
            this.f71761n = function1;
            this.f71762t = jVar;
            this.f71760O = function12;
            this.J2 = function13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(KeyboardActionScope KeyboardActions) {
            Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
            KeyboardActions.n(ImeAction.INSTANCE.rl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Function1 function1, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        public final void O(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(345658021, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ExperimentsScreenContent.<anonymous>.<anonymous> (ExperimentsScreenContent.kt:54)");
            }
            final Function1 function1 = this.f71761n;
            final Z.j jVar = this.f71762t;
            final Function1 function12 = this.f71760O;
            final Function1 function13 = this.J2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f3 = 16;
            Modifier modifierKN = SizeKt.KN(PaddingKt.gh(companion, Dp.KN(f3), 0.0f, 2, null), 0.0f, 1, null);
            composer.eF(270182254);
            boolean zP5 = composer.p5(function1) | composer.E2(jVar);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: pFG.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.j.J2(function1, jVar);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierKN, false, null, null, (Function0) objIF, 7, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.nr(), companion2.xMQ(), composer, 54);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierJ2);
            Function0 function0N2 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            float f4 = 8;
            Modifier modifierGh = PaddingKt.gh(companion, 0.0f, Dp.KN(f4), 1, null);
            MaterialTheme materialTheme = MaterialTheme.f26164n;
            int i3 = MaterialTheme.rl;
            TextKt.t("Show All Experiments", modifierGh, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.t(composer, i3).getBodyLarge(), composer, 54, 0, 65532);
            SwitchKt.n(jVar.nr(), function1, null, null, false, null, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            composer.XQ();
            Modifier modifierKN2 = SizeKt.KN(PaddingKt.gh(companion, Dp.KN(f3), 0.0f, 2, null), 0.0f, 1, null);
            composer.eF(270211857);
            boolean zP52 = composer.p5(function12) | composer.E2(jVar);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: pFG.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.j.Uo(function12, jVar);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            Modifier modifierJ22 = ClickableKt.J2(modifierKN2, false, null, null, (Function0) objIF2, 7, null);
            MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.nr(), companion2.xMQ(), composer, 54);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, modifierJ22);
            Function0 function0N3 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N3);
            } else {
                composer.r();
            }
            Composer composerN3 = Updater.n(composer);
            Updater.O(composerN3, measurePolicyRl2, companion3.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion3.O());
            Function2 function2Rl3 = companion3.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion3.nr());
            TextKt.t("Show active experiments only", PaddingKt.gh(companion, 0.0f, Dp.KN(f4), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.t(composer, i3).getBodyLarge(), composer, 54, 0, 65532);
            SwitchKt.n(jVar.t(), function12, null, null, false, null, null, composer, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            composer.XQ();
            Modifier modifierAz = PaddingKt.az(PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.KN(f4), 7, null);
            String strRl = jVar.rl();
            Shape shapeQie = OutlinedTextFieldDefaults.f26813n.qie(composer, 6);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.Uo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, (DefaultConstructorMarker) null);
            composer.eF(270261633);
            Object objIF3 = composer.iF();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objIF3 == companion4.n()) {
                objIF3 = new Function1() { // from class: pFG.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Pl.j.KN((KeyboardActionScope) obj);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (Function1) objIF3, null, 47, null);
            composer.eF(270249832);
            boolean zP53 = composer.p5(function13);
            Object objIF4 = composer.iF();
            if (zP53 || objIF4 == companion4.n()) {
                objIF4 = new Function1() { // from class: pFG.qz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Pl.j.xMQ(function13, (String) obj);
                    }
                };
                composer.o(objIF4);
            }
            composer.Xw();
            pFG.j jVar2 = pFG.j.f71796n;
            OutlinedTextFieldKt.rl(strRl, (Function1) objIF4, modifierAz, false, false, null, jVar2.n(), null, null, jVar2.rl(), null, null, null, false, null, keyboardOptions, keyboardActions, false, 0, 0, null, shapeQie, null, composer, 806879616, 196608, 0, 6192568);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            O((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(Function1 function1, Z.j jVar) {
            function1.invoke(Boolean.valueOf(!jVar.nr()));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Function1 function1, Z.j jVar) {
            function1.invoke(Boolean.valueOf(!jVar.t()));
            return Unit.INSTANCE;
        }
    }

    static final class n implements Function3 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f71763O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CN3 f71764n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Z.j f71765t;

        n(CN3 cn3, Z.j jVar, Function1 function1, Function1 function12) {
            this.f71764n = cn3;
            this.f71765t = jVar;
            this.f71763O = function1;
            this.J2 = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void t(LazyItemScope item, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(24373763, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ExperimentsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExperimentsScreenContent.kt:120)");
            }
            CN3 cn3 = this.f71764n;
            boolean zNr = this.f71765t.nr();
            composer.eF(43819609);
            boolean zP5 = composer.p5(this.f71763O) | composer.E2(this.f71764n);
            final Function1 function1 = this.f71763O;
            final CN3 cn32 = this.f71764n;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: pFG.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.n.nr(function1, cn32);
                    }
                };
                composer.o(objIF);
            }
            Function0 function0 = (Function0) objIF;
            composer.Xw();
            composer.eF(43822588);
            boolean zP52 = composer.p5(this.J2) | composer.E2(this.f71764n);
            final Function1 function12 = this.J2;
            final CN3 cn33 = this.f71764n;
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: pFG.eO
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.n.O(function12, cn33);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            Wre.t(null, cn3, zNr, function0, (Function0) objIF2, composer, 0, 1);
            DividerKt.rl(null, 0.0f, 0L, composer, 0, 7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function1 function1, CN3 cn3) {
            function1.invoke(cn3);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(Function1 function1, CN3 cn3) {
            function1.invoke(cn3);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, Z.j jVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, int i2, int i3, Composer composer, int i5) {
        t(modifier, jVar, function1, function12, function13, function14, function15, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Z.j jVar, Function1 function1, Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        for (CN3 cn3 : jVar.n()) {
            LazyListScope.O(LazyColumn, cn3.rl(), null, ComposableLambdaKt.rl(24373763, true, new n(cn3, jVar, function1, function12)), 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void t(Modifier modifier, final Z.j experimentsUIState, final Function1 onShowAllExperimentsClicked, final Function1 onShowActiveExperimentsClicked, final Function1 onSearchChanged, final Function1 onExperimentClicked, final Function1 onFavouriteIconClicked, final Function0 onSaveAndExitClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(experimentsUIState, "experimentsUIState");
        Intrinsics.checkNotNullParameter(onShowAllExperimentsClicked, "onShowAllExperimentsClicked");
        Intrinsics.checkNotNullParameter(onShowActiveExperimentsClicked, "onShowActiveExperimentsClicked");
        Intrinsics.checkNotNullParameter(onSearchChanged, "onSearchChanged");
        Intrinsics.checkNotNullParameter(onExperimentClicked, "onExperimentClicked");
        Intrinsics.checkNotNullParameter(onFavouriteIconClicked, "onFavouriteIconClicked");
        Intrinsics.checkNotNullParameter(onSaveAndExitClicked, "onSaveAndExitClicked");
        Composer composerKN = composer.KN(1252887830);
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
            i5 |= composerKN.E2(experimentsUIState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onShowAllExperimentsClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onShowActiveExperimentsClicked) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onSearchChanged) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(onExperimentClicked) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= composerKN.E2(onFavouriteIconClicked) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= composerKN.E2(onSaveAndExitClicked) ? 8388608 : 4194304;
        }
        if ((4793491 & i5) == 4793490 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(1252887830, i5, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ExperimentsScreenContent (ExperimentsScreenContent.kt:43)");
            }
            Modifier modifierJ2 = SizeKt.J2(modifier4, 0.0f, 1, null);
            Color.Companion companion = Color.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(modifierJ2, companion.KN(), null, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.nr(), Alignment.INSTANCE.gh(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f3 = 8;
            int i8 = i5;
            Modifier modifier5 = modifier4;
            SurfaceKt.n(null, null, companion.KN(), 0L, 0.0f, Dp.KN(f3), null, ComposableLambdaKt.nr(345658021, true, new j(onShowAllExperimentsClicked, experimentsUIState, onShowActiveExperimentsClicked, onSearchChanged), composerKN, 54), composerKN, 12779904, 91);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierRl = ColumnScope.rl(columnScopeInstance, companion3, 1.0f, false, 2, null);
            composerKN.eF(1474653014);
            boolean zE2 = ((i8 & 458752) == 131072) | composerKN.E2(experimentsUIState) | ((i8 & 3670016) == 1048576);
            Object objIF = composerKN.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: pFG.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Pl.nr(experimentsUIState, onExperimentClicked, onFavouriteIconClicked, (LazyListScope) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            LazyDslKt.t(modifierRl, null, null, false, null, null, null, false, (Function1) objIF, composerKN, 0, 254);
            composer2 = composerKN;
            ButtonKt.n(onSaveAndExitClicked, SizeKt.KN(PaddingKt.mUb(companion3, Dp.KN(16), Dp.KN(f3)), 0.0f, 1, null), false, null, null, null, null, null, null, pFG.j.f71796n.t(), composer2, ((i8 >> 21) & 14) | com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 508);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pFG.Dsr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.O(modifier3, experimentsUIState, onShowAllExperimentsClicked, onShowActiveExperimentsClicked, onSearchChanged, onExperimentClicked, onFavouriteIconClicked, onSaveAndExitClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
