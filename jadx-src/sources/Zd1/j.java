package Zd1;

import Dj7.YzO;
import Dj7.xZD;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12506n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(1802568931, false, C0450j.f12507n);

    /* JADX INFO: renamed from: Zd1.j$j, reason: collision with other inner class name */
    static final class C0450j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0450j f12507n = new C0450j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1802568931, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.ComposableSingletons$PlayfulStartScreenKt.lambda-1.<anonymous> (PlayfulStartScreen.kt:86)");
            }
            int i5 = (i3 & 14) | 28080;
            M.Uo(BoxWithConstraints, 0.18f, Dp.KN(-100), Dp.KN(-50), Dp.KN(188), composer, i5);
            M.Uo(BoxWithConstraints, 0.12f, Dp.KN(0), Dp.KN(100), Dp.KN(376), composer, i5);
            Painter painterT = PainterResources_androidKt.t(2131231971, composer, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            ImageKt.n(painterT, "Present box", PaddingKt.az(SizeKt.KN(companion, 0.0f, 1, null), 0.0f, Dp.KN(50), 0.0f, 0.0f, 13, null), null, ContentScale.INSTANCE.n(), 0.0f, null, composer, 25008, 104);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierGh = SizeKt.gh(PaddingKt.gh(PaddingKt.az(BoxWithConstraints.n(companion, companion2.O()), 0.0f, Dp.KN(75), 0.0f, 0.0f, 13, null), Dp.KN(16), 0.0f, 2, null), 0.0f, Dp.KN(150), 1, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.ty(Dp.KN(10)), companion2.qie(), composer, 6);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierGh);
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
            M.ck(rowScopeInstance, composer, 6);
            M.ck(rowScopeInstance, composer, 6);
            M.ck(rowScopeInstance, composer, 6);
            composer.XQ();
            YzO.rl(aD.w6.M7(), BoxWithConstraints.n(SizeKt.xMQ(companion, Dp.KN(80)), companion2.rl()), xZD.f1896t, composer, 390, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0450j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
