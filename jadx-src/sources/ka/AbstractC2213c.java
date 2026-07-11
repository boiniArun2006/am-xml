package ka;

import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import ka.AbstractC2213c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ka.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class AbstractC2213c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f69997n = Dp.KN(12);

    /* JADX INFO: renamed from: ka.c$j */
    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ FX.j f69998O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Integer f69999n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f70000t;

        j(Integer num, Function0 function0, FX.j jVar) {
            this.f69999n = num;
            this.f70000t = function0;
            this.f69998O = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t() {
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1988649419, i2, -1, "com.alightcreative.app.motion.ranking.ui.CurrentUserRankingCard.<anonymous> (CurrentUserRankingCard.kt:49)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(ClipKt.n(SizeKt.KN(companion, 0.0f, 1, null), RoundedCornerShapeKt.t(AbstractC2213c.f69997n)), aD.w6.az(), null, 2, null);
            composer.eF(-1567064297);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: ka.l3D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC2213c.j.t();
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierNr, false, null, null, (Function0) objIF, 6, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical verticalXMQ = companion2.xMQ();
            Object obj = this.f69999n;
            Function0 function0 = this.f70000t;
            FX.j jVar = this.f69998O;
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            float f3 = 20;
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composer, 6);
            Modifier modifierViF = SizeKt.ViF(companion, Dp.KN(40));
            if (obj == null) {
                obj = "999+";
            }
            String strValueOf = String.valueOf(obj);
            H9N.j jVar2 = H9N.j.f3810n;
            TextStyle textStyleViF = jVar2.rl(composer, 6).ViF();
            long jF = aD.w6.F();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iN2 = companion4.n();
            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
            CM.S(strValueOf, textStyleViF, modifierViF, jF, null, null, TextAlign.KN(iN2), companion5.rl(), false, 1, null, composer, 817892736, 0, 1328);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composer, 6);
            float f4 = 16;
            Modifier modifierRl = RowScope.rl(rowScopeInstance, PaddingKt.az(companion, 0.0f, Dp.KN(f4), Dp.KN(f4), Dp.KN(12), 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composer, 0);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierRl);
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
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN3))) {
                composerN2.o(Integer.valueOf(iN3));
                composerN2.az(Integer.valueOf(iN3), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            CM.S("@" + jVar.rl(), jVar2.rl(composer, 6).nY(), null, aD.w6.F(), null, null, TextAlign.KN(companion4.nr()), companion5.rl(), false, 1, null, composer, 817892352, 0, 1332);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(8)), composer, 6);
            CM.S(StringResources_androidKt.nr(2132017632, new Object[]{Integer.valueOf(jVar.n())}, composer, 6), jVar2.rl(composer, 6).s7N(), null, aD.w6.ER(), null, null, null, 0, false, 0, null, composer, 3072, 0, 2036);
            composer.XQ();
            KA9.UGc.Ik(rowScopeInstance, aD.w6.RQ(), false, function0, composer, 54, 2);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f4)), composer, 6);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Integer num, FX.j jVar, Function0 function0, int i2, int i3, Composer composer, int i5) {
        t(num, jVar, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Integer num, final FX.j profile, Function0 function0, Composer composer, final int i2, final int i3) {
        int i5;
        Function0 function02;
        Function0 function03;
        final Function0 function04;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(profile, "profile");
        Composer composerKN = composer.KN(-1032705032);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(num) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(profile) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function02 = function0;
                i5 |= composerKN.E2(function02) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                if (i7 == 0) {
                    composerKN.eF(962490968);
                    Object objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: ka.z
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC2213c.nr();
                            }
                        };
                        composerKN.o(objIF);
                    }
                    function03 = (Function0) objIF;
                    composerKN.Xw();
                } else {
                    function03 = function02;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1032705032, i5, -1, "com.alightcreative.app.motion.ranking.ui.CurrentUserRankingCard (CurrentUserRankingCard.kt:40)");
                }
                Function0 function05 = function03;
                CardKt.n(PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(16), 0.0f, 2, null), RoundedCornerShapeKt.t(f69997n), 0L, 0L, BorderStrokeKt.n(Dp.KN(1), aD.w6.ty()), Dp.KN(0), ComposableLambdaKt.nr(-1988649419, true, new j(num, function03, profile), composerKN, 54), composerKN, 1794054, 12);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                function04 = function05;
            } else {
                composerKN.wTp();
                function04 = function02;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: ka.QJ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC2213c.O(num, profile, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        function02 = function0;
        if ((i5 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Function0 function052 = function03;
            CardKt.n(PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(16), 0.0f, 2, null), RoundedCornerShapeKt.t(f69997n), 0L, 0L, BorderStrokeKt.n(Dp.KN(1), aD.w6.ty()), Dp.KN(0), ComposableLambdaKt.nr(-1988649419, true, new j(num, function03, profile), composerKN, 54), composerKN, 1794054, 12);
            if (ComposerKt.v()) {
            }
            function04 = function052;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
