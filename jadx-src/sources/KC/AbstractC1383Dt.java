package KC;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: KC.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class AbstractC1383Dt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(RowScope rowScope, int i2, String str, Function0 function0, int i3, Composer composer, int i5) {
        nr(rowScope, i2, str, function0, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        Uo(function0, function02, function03, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Uo(final Function0 onExportClicked, final Function0 function0, final Function0 onDeleteClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        Modifier modifier3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        int i7;
        int i8;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onExportClicked, "onExportClicked");
        Intrinsics.checkNotNullParameter(onDeleteClicked, "onDeleteClicked");
        Composer composerKN = composer.KN(19509804);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onExportClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(function0) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onDeleteClicked) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(19509804, i5, -1, "com.alightcreative.app.motion.activities.main.BottomSelectionNavbar (ProjectBottomSelectionNavbar.kt:34)");
                }
                Modifier modifierNr = BackgroundKt.nr(SizeKt.xMQ(modifier3, Dp.KN(72)), aD.w6.mUb(), null, 2, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
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
                Updater.O(composerN, measurePolicyUo, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                Modifier modifierMUb = PaddingKt.mUb(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(8), Dp.KN(12));
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion.qie(), composerKN, 0);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierMUb);
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
                Updater.O(composerN2, measurePolicyRl, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                composer2 = composerKN;
                nr(rowScopeInstance, 2131231911, StringResources_androidKt.t(2132019025, composerKN, 6), onExportClicked, composer2, ((i5 << 9) & 7168) | 54);
                composer2.eF(1757209212);
                if (function0 != null) {
                    i8 = 54;
                    i7 = 6;
                } else {
                    i7 = 6;
                    i8 = 54;
                    nr(rowScopeInstance, 2131231910, StringResources_androidKt.t(2132017711, composer2, 6), function0, composer2, 54);
                }
                composer2.Xw();
                nr(rowScopeInstance, 2131231909, StringResources_androidKt.t(2132017650, composer2, i7), onDeleteClicked, composer2, i8 | ((i5 << 3) & 7168));
                composer2.XQ();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeGh.n(new Function2() { // from class: KC.m8h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC1383Dt.KN(onExportClicked, function0, onDeleteClicked, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        modifier2 = modifier;
        if ((i5 & 1171) == 1170) {
            if (i9 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierNr2 = BackgroundKt.nr(SizeKt.xMQ(modifier3, Dp.KN(72)), aD.w6.mUb(), null, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
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
            Updater.O(composerN, measurePolicyUo2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                Modifier modifierMUb2 = PaddingKt.mUb(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(8), Dp.KN(12));
                MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), companion3.qie(), composerKN, 0);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierMUb2);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyRl2, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                    composer2 = composerKN;
                    nr(rowScopeInstance2, 2131231911, StringResources_androidKt.t(2132019025, composerKN, 6), onExportClicked, composer2, ((i5 << 9) & 7168) | 54);
                    composer2.eF(1757209212);
                    if (function0 != null) {
                    }
                    composer2.Xw();
                    nr(rowScopeInstance2, 2131231909, StringResources_androidKt.t(2132017650, composer2, i7), onDeleteClicked, composer2, i8 | ((i5 << 3) & 7168));
                    composer2.XQ();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    private static final void nr(final RowScope rowScope, final int i2, final String str, final Function0 function0, Composer composer, final int i3) {
        int i5;
        Composer composerKN = composer.KN(-1808533365);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(rowScope) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.t(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(function0) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1808533365, i5, -1, "com.alightcreative.app.motion.activities.main.BottomSelectionBarItem (ProjectBottomSelectionNavbar.kt:71)");
            }
            Modifier modifierRl = RowScope.rl(rowScope, SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(48)), 1.0f, false, 2, null);
            composerKN.eF(233919636);
            boolean z2 = (i5 & 7168) == 2048;
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: KC.Um
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC1383Dt.O(function0);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierRl, false, null, null, (Function0) objIF, 7, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.nr(), Alignment.INSTANCE.Uo(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierJ2);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
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
            Updater.O(composerN, measurePolicyN, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            ImageKt.n(PainterResources_androidKt.t(i2, composerKN, (i5 >> 3) & 14), null, null, null, null, 0.0f, null, composerKN, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            Dj7.CM.S(str, H9N.j.f3810n.rl(composerKN, 6).X(), null, aD.w6.nO(), null, null, null, TextOverflow.INSTANCE.rl(), false, 1, null, composerKN, ((i5 >> 6) & 14) | 817892352, 0, 1396);
            composerKN = composerKN;
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: KC.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC1383Dt.J2(rowScope, i2, str, function0, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
