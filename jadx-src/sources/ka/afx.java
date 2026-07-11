package ka;

import Dj7.AbstractC1328c;
import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f69993n = Dp.KN(12);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f69994O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f69995n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FX.j f69996t;

        j(int i2, FX.j jVar, Function1 function1) {
            this.f69995n = i2;
            this.f69996t = jVar;
            this.f69994O = function1;
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
                ComposerKt.p5(-533453708, i2, -1, "com.alightcreative.app.motion.ranking.ui.RankingProfileCard.<anonymous> (RankingProfileCard.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNr = BackgroundKt.nr(ClipKt.n(companion, RoundedCornerShapeKt.t(afx.f69993n)), Color.INSTANCE.KN(), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical verticalXMQ = companion2.xMQ();
            int i3 = this.f69995n;
            FX.j jVar = this.f69996t;
            Function1 function1 = this.f69994O;
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierNr);
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
            ci.rl(i3, rowScopeInstance.t(companion, companion2.xMQ()), composer, 0, 0);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composer, 6);
            float f4 = 16;
            Modifier modifierRl = RowScope.rl(rowScopeInstance, PaddingKt.az(companion, 0.0f, Dp.KN(f4), Dp.KN(f4), Dp.KN(12), 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composer, 0);
            int iN2 = ComposablesKt.n(composer, 0);
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
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String str = "@" + jVar.rl();
            H9N.j jVar2 = H9N.j.f3810n;
            TextStyle textStyleNY = jVar2.rl(composer, 6).nY();
            long jF = aD.w6.F();
            int iNr = TextAlign.INSTANCE.nr();
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            CM.S(str, textStyleNY, null, jF, null, null, TextAlign.KN(iNr), companion4.rl(), false, 1, null, composer, 817892352, 0, 1332);
            float f5 = 8;
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f5)), composer, 6);
            CM.S(StringResources_androidKt.nr(2132017632, new Object[]{Integer.valueOf(jVar.n())}, composer, 6), jVar2.rl(composer, 6).s7N(), null, aD.w6.ER(), null, null, null, companion4.rl(), false, 1, null, composer, 817892352, 0, 1396);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f5)), composer, 6);
            MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), companion2.qie(), composer, 0);
            int iN3 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk3 = composer.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composer, companion);
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
            composer.eF(1720930785);
            Iterator it = jVar.t().iterator();
            while (it.hasNext()) {
                K.t((FX.Ml) it.next(), function1, null, composer, 0, 4);
                SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, Dp.KN(f5)), composer, 6);
            }
            composer.Xw();
            composer.XQ();
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(final int i2, final FX.j profile, final Function1 onSocialMediaClicked, Composer composer, final int i3) {
        int i5;
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(onSocialMediaClicked, "onSocialMediaClicked");
        Composer composerKN = composer.KN(-1559354057);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.E2(profile) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onSocialMediaClicked) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1559354057, i5, -1, "com.alightcreative.app.motion.ranking.ui.RankingProfileCard (RankingProfileCard.kt:38)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            long jQZ6 = aD.w6.QZ6();
            float f3 = 0;
            float fKN = Dp.KN(f3);
            float f4 = f69993n;
            CardKt.n(AbstractC1328c.n(modifierJ2, jQZ6, fKN, f4, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f4), 0L, 0L, null, Dp.KN(f3), ComposableLambdaKt.nr(-533453708, true, new j(i2, profile, onSocialMediaClicked), composerKN, 54), composerKN, 1769472, 28);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.g9s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return afx.t(i2, profile, onSocialMediaClicked, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i2, FX.j jVar, Function1 function1, int i3, Composer composer, int i5) {
        rl(i2, jVar, function1, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }
}
