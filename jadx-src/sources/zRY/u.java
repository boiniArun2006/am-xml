package zRY;

import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(long j2, Function0 function0, int i2, Composer composer, int i3) {
        t(j2, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final long j2, final Function0 onViewAllClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onViewAllClicked, "onViewAllClicked");
        Composer composerKN = composer.KN(865370983);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.nr(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onViewAllClicked) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(865370983, i3, -1, "com.alightcreative.app.motion.premade.ui.PremadeViewAllItem (PremadeViewAllItem.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 12;
            Modifier modifierN = ClipKt.n(SizeKt.XQ(companion, j2), RoundedCornerShapeKt.t(Dp.KN(f3)));
            composerKN.eF(-51125629);
            boolean z2 = (i3 & 112) == 32;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: zRY.nKK
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.nr(onViewAllClicked);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalRl = Arrangement.f17400n.rl();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalRl, companion2.Uo(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
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
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Modifier modifierT = BackgroundKt.t(SizeKt.Z(companion, Dp.KN(40)), aD.w6.nO(), RoundedCornerShapeKt.t(Dp.KN(48)));
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT);
            Function0 function0N2 = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ImageKt.n(PainterResources_androidKt.t(2131232047, composerKN, 6), null, BoxScopeInstance.f17448n.n(companion, companion2.O()), null, null, 0.0f, null, composerKN, 48, b.f61769v);
            composerKN.XQ();
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(6)), composerKN, 6);
            CM.S(StringResources_androidKt.t(2132020425, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).X(), PaddingKt.gh(companion, Dp.KN(f3), 0.0f, 2, null), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0, false, 0, null, composerKN, 3456, 0, 1968);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: zRY.DAz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.O(j2, onViewAllClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
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
