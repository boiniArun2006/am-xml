package ka;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f69956n = new CN3();
    public static Function2 rl = ComposableLambdaKt.rl(443519447, false, j.f69957n);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f69957n = new j();

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
                ComposerKt.p5(443519447, i2, -1, "com.alightcreative.app.motion.ranking.ui.ComposableSingletons$RankingScreenKt.lambda-1.<anonymous> (RankingScreen.kt:104)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 24;
            Modifier modifierAz = PaddingKt.az(PaddingKt.gh(companion, Dp.KN(10), 0.0f, 2, null), 0.0f, Dp.KN(f3), 0.0f, Dp.KN(32), 5, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composer, 48);
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            IconKt.n(PainterResources_androidKt.t(2131231931, composer, 6), null, SizeKt.Z(companion, Dp.KN(f3)), 0L, composer, 432, 8);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(16)), composer, 6);
            String strT = StringResources_androidKt.t(2132017631, composer, 6);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleNY = jVar.rl(composer, 6).nY();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            CM.S(strT, textStyleNY, null, aD.w6.s(), null, null, TextAlign.KN(companion3.n()), 0, false, 0, null, composer, 3072, 0, 1972);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(8)), composer, 6);
            CM.S(StringResources_androidKt.t(2132017630, composer, 6), jVar.rl(composer, 6).wTp(), null, aD.w6.s(), null, null, TextAlign.KN(companion3.n()), 0, false, 0, null, composer, 3072, 0, 1972);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    public final Function2 n() {
        return rl;
    }
}
