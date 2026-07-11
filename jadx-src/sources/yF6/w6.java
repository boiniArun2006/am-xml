package yF6;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yF6.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(String str, String str2, int i2, Composer composer, int i3) {
        O(str, str2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void O(final String str, String str2, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        final String str3;
        Composer composerKN = composer.KN(-2056715406);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.p5(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(str2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
            str3 = str2;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-2056715406, i3, -1, "com.alightcreative.setup.ui.components.ErrorMessage (AppSetupContent.kt:86)");
            }
            Color.Companion companion = Color.INSTANCE;
            long jKN = companion.KN();
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleV = jVar.rl(composerKN, 6).v();
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            composer2 = composerKN;
            TextKt.t(str, PaddingKt.az(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.KN(12), 7, null), jKN, 0L, null, null, null, 0L, null, TextAlign.KN(companion2.n()), 0L, 0, false, 0, 0, null, textStyleV, composer2, (i3 & 14) | 432, 0, 65016);
            str3 = str2;
            TextKt.t(str3, null, companion.KN(), 0L, null, null, null, 0L, null, TextAlign.KN(companion2.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer2, 6).v(), composer2, ((i3 >> 3) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65018);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: yF6.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.J2(str, str3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Ml ml, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        t(ml, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Ml uiState, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Composer composerKN = composer.KN(438696468);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.p5(uiState) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(438696468, i5, -1, "com.alightcreative.setup.ui.components.AppSetupContent (AppSetupContent.kt:45)");
                }
                Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(modifier3, 0.0f, 1, null), ColorResources_androidKt.n(2131099811, composerKN, 6), null, 2, null);
                Arrangement arrangement = Arrangement.f17400n;
                Arrangement.Vertical verticalUo = arrangement.Uo();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion.gh(), composerKN, 0);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion2.n();
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
                Updater.O(composerN, measurePolicyN, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion3, 1.0f, false, 2, null), composerKN, 0);
                Modifier modifierZ = SizeKt.Z(columnScopeInstance.t(companion3, companion.Uo()), Dp.KN(288));
                Modifier modifier4 = modifier3;
                ImageKt.n(PainterResources_androidKt.t(2131231547, composerKN, 6), null, modifierZ, null, null, 0.0f, null, composerKN, 48, b.f61769v);
                Modifier modifierRl = ColumnScope.rl(columnScopeInstance, columnScopeInstance.t(PaddingKt.gh(companion3, Dp.KN(16), 0.0f, 2, null), companion.Uo()), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyN2 = ColumnKt.n(arrangement.Uo(), companion.Uo(), composerKN, 48);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierRl);
                Function0 function0N2 = companion2.n();
                if (composerKN.getApplier() == null) {
                    ComposablesKt.t();
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                    composerKN.r();
                } else {
                    composerKN.s7N(function0N2);
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyN2, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion3, 0.3f, false, 2, null), composerKN, 0);
                if (!(uiState instanceof Ml.n)) {
                    composerKN.eF(183969147);
                    ProgressIndicatorKt.rl(null, ColorResources_androidKt.n(2131099680, composerKN, 6), 0.0f, 0L, 0, composerKN, 0, 29);
                    composerKN.Xw();
                } else {
                    if (!(uiState instanceof Ml.j)) {
                        composerKN.eF(-1656635330);
                        composerKN.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerKN.eF(184169438);
                    Ml.j jVar = (Ml.j) uiState;
                    O(jVar.rl(), jVar.n(), composerKN, 0);
                    composerKN.Xw();
                }
                SpacerKt.n(ColumnScope.rl(columnScopeInstance, companion3, 0.7f, false, 2, null), composerKN, 0);
                composerKN.XQ();
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier4;
            } else {
                composerKN.wTp();
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: yF6.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w6.nr(uiState, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierNr2 = BackgroundKt.nr(SizeKt.J2(modifier3, 0.0f, 1, null), ColorResources_androidKt.n(2131099811, composerKN, 6), null, 2, null);
            Arrangement arrangement2 = Arrangement.f17400n;
            Arrangement.Vertical verticalUo2 = arrangement2.Uo();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN3 = ColumnKt.n(verticalUo2, companion4.gh(), composerKN, 0);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierNr2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N3 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN3, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                SpacerKt.n(ColumnScope.rl(columnScopeInstance2, companion32, 1.0f, false, 2, null), composerKN, 0);
                Modifier modifierZ2 = SizeKt.Z(columnScopeInstance2.t(companion32, companion4.Uo()), Dp.KN(288));
                Modifier modifier42 = modifier3;
                ImageKt.n(PainterResources_androidKt.t(2131231547, composerKN, 6), null, modifierZ2, null, null, 0.0f, null, composerKN, 48, b.f61769v);
                Modifier modifierRl2 = ColumnScope.rl(columnScopeInstance2, columnScopeInstance2.t(PaddingKt.gh(companion32, Dp.KN(16), 0.0f, 2, null), companion4.Uo()), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyN22 = ColumnKt.n(arrangement2.Uo(), companion4.Uo(), composerKN, 48);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierRl2);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyN22, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    SpacerKt.n(ColumnScope.rl(columnScopeInstance2, companion32, 0.3f, false, 2, null), composerKN, 0);
                    if (!(uiState instanceof Ml.n)) {
                    }
                    SpacerKt.n(ColumnScope.rl(columnScopeInstance2, companion32, 0.7f, false, 2, null), composerKN, 0);
                    composerKN.XQ();
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
