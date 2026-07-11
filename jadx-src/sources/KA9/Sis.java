package KA9;

import Dj7.AbstractC1328c;
import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Sis {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f4890n = Dp.KN(12);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f4891n;

        j(Function0 function0) {
            this.f4891n = function0;
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
                ComposerKt.p5(1884045723, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.XmlPromotionCard.<anonymous> (XmlPromotionCard.kt:47)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 16;
            Modifier modifierXMQ = PaddingKt.xMQ(BackgroundKt.nr(companion, Color.INSTANCE.KN(), null, 2, null), Dp.KN(f3));
            Alignment.Vertical verticalXMQ = Alignment.INSTANCE.xMQ();
            Function0 function0 = this.f4891n;
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), verticalXMQ, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierXMQ);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            ImageKt.n(PainterResources_androidKt.t(2131232066, composer, 6), null, SizeKt.ViF(companion, Dp.KN(48)), null, ContentScale.INSTANCE.O(), 0.0f, null, composer, 25008, 104);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(8)), composer, 6);
            CM.S(StringResources_androidKt.t(2132020403, composer, 6), H9N.j.f3810n.rl(composer, 6).nY(), RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null), aD.w6.F(), null, null, null, 0, false, 0, null, composer, 3072, 0, 2032);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composer, 6);
            Dj7.eO.J2(function0, StringResources_androidKt.t(2132017154, composer, 6), SizeKt.xMQ(companion, Dp.KN(40)), null, Dj7.CN3.f1600t, null, 0, 0, 0.0f, null, null, null, false, composer, 24960, 0, 8168);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0, int i2, int i3, Composer composer, int i5) {
        t(function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    public static final void t(Function0 function0, Composer composer, final int i2, final int i3) {
        Function0 function02;
        int i5;
        final Function0 function03;
        Composer composerKN = composer.KN(936476472);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            function02 = function0;
        } else if ((i2 & 6) == 0) {
            function02 = function0;
            i5 = (composerKN.E2(function02) ? 4 : 2) | i2;
        } else {
            function02 = function0;
            i5 = i2;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            function03 = function02;
        } else {
            if (i7 != 0) {
                composerKN.eF(1688357320);
                Object objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: KA9.yg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Sis.nr();
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                function03 = (Function0) objIF;
            } else {
                function03 = function02;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(936476472, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.projectlist.ui.components.XmlPromotionCard (XmlPromotionCard.kt:34)");
            }
            Modifier modifierGh = PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(16), 0.0f, 2, null);
            long jQZ6 = aD.w6.QZ6();
            float f3 = 0;
            float fKN = Dp.KN(f3);
            float f4 = f4890n;
            CardKt.n(AbstractC1328c.n(modifierGh, jQZ6, fKN, f4, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), RoundedCornerShapeKt.t(f4), 0L, 0L, null, Dp.KN(f3), ComposableLambdaKt.nr(1884045723, true, new j(function03), composerKN, 54), composerKN, 1769472, 28);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KA9.pO
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Sis.O(function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
