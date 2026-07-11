package Ax;

import Dj7.hQ;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ax.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1306c {

    /* JADX INFO: renamed from: Ax.c$j */
    static final class j implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f165O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f166n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f167t;

        j(boolean z2, Function0 function0, Function0 function02, Function0 function03) {
            this.f166n = z2;
            this.f167t = function0;
            this.f165O = function02;
            this.J2 = function03;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            String strT;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2036459606, i2, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingOptInCard.<anonymous> (CreatorRankingOptInCard.kt:36)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion.Uo();
            boolean z2 = this.f166n;
            Function0 function0 = this.f167t;
            Function0 function02 = this.f165O;
            Function0 function03 = this.J2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion2);
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
            float f3 = 24;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composer, 6);
            Modifier modifierKN = SizeKt.KN(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierKN);
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
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            hQ.rl(StringResources_androidKt.t(2132017542, composer, 6), BoxScopeInstance.f17448n.n(companion2, companion.ty()), null, composer, 0, 4);
            composer.XQ();
            ImageKt.n(PainterResources_androidKt.t(2131231319, composer, 6), null, SizeKt.xMQ(companion2, Dp.KN(80)), null, ContentScale.INSTANCE.nr(), 0.0f, null, composer, 25008, 104);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(16)), composer, 6);
            String strT2 = StringResources_androidKt.t(2132017635, composer, 6);
            Modifier modifierKN2 = SizeKt.KN(companion2, 0.0f, 1, null);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleIF = jVar.rl(composer, 6).iF();
            long jS2 = aD.w6.s();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.t(strT2, modifierKN2, jS2, 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, textStyleIF, composer, 432, 0, 65016);
            float f4 = 8;
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f4)), composer, 6);
            TextKt.t(StringResources_androidKt.t(2132017629, composer, 6), SizeKt.KN(companion2, 0.0f, 1, null), aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).v(), composer, 432, 0, 65016);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f3)), composer, 6);
            if (z2) {
                composer.eF(-1831508401);
                strT = StringResources_androidKt.t(2132017617, composer, 6);
                composer.Xw();
            } else {
                composer.eF(-1831405884);
                strT = StringResources_androidKt.t(2132017627, composer, 6);
                composer.Xw();
            }
            Dj7.eO.J2(function0, strT, SizeKt.KN(companion2, 0.0f, 1, null), null, null, null, 0, 0, 0.0f, null, null, null, false, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8184);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f4)), composer, 6);
            Dj7.eO.J2(function02, StringResources_androidKt.t(2132017626, composer, 6), SizeKt.KN(companion2, 0.0f, 1, null), null, Dj7.CN3.f1600t, null, 0, 0, 0.0f, null, null, null, false, composer, 24960, 0, 8168);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f4)), composer, 6);
            cg.z.t(StringResources_androidKt.t(2132017543, composer, 6), function03, null, composer, 0, 4);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final boolean z2, final Function0 onJoinButtonClick, final Function0 onRankingButtonClick, final Function0 onFaqButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onJoinButtonClick, "onJoinButtonClick");
        Intrinsics.checkNotNullParameter(onRankingButtonClick, "onRankingButtonClick");
        Intrinsics.checkNotNullParameter(onFaqButtonClick, "onFaqButtonClick");
        Composer composerKN = composer.KN(27110056);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onJoinButtonClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onRankingButtonClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onFaqButtonClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(27110056, i3, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingOptInCard (CreatorRankingOptInCard.kt:34)");
            }
            Dj7.QJ.rl(ComposableLambdaKt.nr(2036459606, true, new j(z2, onJoinButtonClick, onRankingButtonClick, onFaqButtonClick), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Ax.l3D
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1306c.t(z2, onJoinButtonClick, onRankingButtonClick, onFaqButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(boolean z2, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        rl(z2, function0, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
