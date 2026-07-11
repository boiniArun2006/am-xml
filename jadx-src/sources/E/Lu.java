package E;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Lu {
    public static final void rl(Modifier modifier, final Function0 onCloseButtonClicked, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i5;
        Intrinsics.checkNotNullParameter(onCloseButtonClicked, "onCloseButtonClicked");
        Composer composerKN = composer.KN(470910483);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = i2 | (composerKN.p5(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onCloseButtonClicked) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(470910483, i5, -1, "com.alightcreative.template.importpreview.ui.components.VideoTrimmerHeader (VideoTrimmerHeader.kt:19)");
            }
            Arrangement.Horizontal horizontalJ2 = Arrangement.f17400n.J2();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion.qie(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i8 = (i5 & 112) | 3072;
            Modifier modifier4 = modifier3;
            I28.rl(rowScopeInstance.t(SizeKt.Z(companion3, Dp.KN(16)), companion.xMQ()), onCloseButtonClicked, null, 2131232012, null, false, 0L, 0L, composerKN, i8, 244);
            CM.ty(StringResources_androidKt.t(2132020304, composerKN, 6), CollectionsKt.listOf(H9N.j.f3810n.rl(composerKN, 6).fD()), rowScopeInstance.t(PaddingKt.gh(companion3, Dp.KN(20), 0.0f, 2, null), companion.xMQ()), 0L, null, null, 0, false, 0, composerKN, 0, 504);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.vd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Lu.t(modifier2, onCloseButtonClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Modifier modifier, Function0 function0, int i2, int i3, Composer composer, int i5) {
        rl(modifier, function0, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
