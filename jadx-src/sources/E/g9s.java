package E;

import Dj7.crp;
import Dj7.h6y;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class g9s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(int i2, Composer composer, int i3) {
        nr(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        Uo(function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final Function0 onButtonClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        final Modifier modifier3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onButtonClicked, "onButtonClicked");
        Composer composerKN = composer.KN(-75049245);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onButtonClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i7 = 2 & i3;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-75049245, i5, -1, "com.alightcreative.template.importpreview.ui.components.TemplateTooltip (TemplateTooltip.kt:25)");
                }
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N);
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                crp crpVar = crp.f1753t;
                String strT = StringResources_androidKt.t(2132020312, composerKN, 6);
                String strT2 = StringResources_androidKt.t(2132017378, composerKN, 6);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                h6y.Uo(crpVar, onButtonClicked, strT, strT2, SizeKt.ViF(companion2, Dp.KN(234)), PaddingKt.az(companion2, Dp.KN(32), 0.0f, 0.0f, 0.0f, 14, null), composerKN, ((i5 << 3) & 112) | 221190, 0);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: E.r
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g9s.KN(onButtonClicked, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        modifier2 = modifier;
        if ((i5 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion3.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion3.t());
            Updater.O(composerN, compositionLocalMapIk2, companion3.O());
            function2Rl = companion3.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion3.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                crp crpVar2 = crp.f1753t;
                String strT3 = StringResources_androidKt.t(2132020312, composerKN, 6);
                String strT22 = StringResources_androidKt.t(2132017378, composerKN, 6);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                h6y.Uo(crpVar2, onButtonClicked, strT3, strT22, SizeKt.ViF(companion22, Dp.KN(234)), PaddingKt.az(companion22, Dp.KN(32), 0.0f, 0.0f, 0.0f, 14, null), composerKN, ((i5 << 3) & 112) | 221190, 0);
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    public static final void nr(Composer composer, final int i2) {
        Composer composerKN = composer.KN(-634050380);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-634050380, i2, -1, "com.alightcreative.template.importpreview.ui.components.OverlayTooltip (TemplateTooltip.kt:39)");
            }
            Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), Color.az(aD.w6.xVH(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            composerKN.eF(-1256723494);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = InteractionSourceKt.n();
                composerKN.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composerKN.Xw();
            composerKN.eF(-1256720651);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: E.SPz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.O();
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            BoxKt.n(ClickableKt.nr(modifierNr, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g9s.J2(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
