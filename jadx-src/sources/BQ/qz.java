package BQ;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class qz {
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 onYourTemplatesClicked, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onYourTemplatesClicked, "onYourTemplatesClicked");
        Composer composerKN = composer.KN(-1469031119);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onYourTemplatesClicked) ? 4 : 2) | i2;
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
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1469031119, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.TemplatesTabHeader (TemplatesTabHeader.kt:22)");
                }
                Arrangement arrangement = Arrangement.f17400n;
                Arrangement.HorizontalOrVertical horizontalOrVerticalNr = arrangement.nr();
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical verticalXMQ = companion.xMQ();
                Modifier modifierKN = SizeKt.KN(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, verticalXMQ, composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
                Updater.O(composerN, measurePolicyRl, companion2.t());
                Updater.O(composerN, compositionLocalMapIk, companion2.O());
                function2Rl = companion2.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion2.nr());
                RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
                H9N.j jVar = H9N.j.f3810n;
                TextKt.t("Templates", null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).iF(), composerKN, 390, 0, 65530);
                Alignment.Vertical verticalXMQ2 = companion.xMQ();
                Modifier modifier4 = modifier3;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierJ2 = ClickableKt.J2(companion3, false, null, null, onYourTemplatesClicked, 7, null);
                MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), verticalXMQ2, composerKN, 48);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ2);
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
                Updater.O(composerN2, measurePolicyRl2, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                TextKt.t(gUxOLwRQBPPLC.RMuKsCHAU, null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).wTp(), composerKN, 390, 0, 65530);
                IconKt.t(PainterResources_androidKt.t(2131231596, composerKN, 6), "Your Templates", SizeKt.Z(companion3, Dp.KN(24)), aD.w6.EWS(), composerKN, 3504, 0);
                composer2 = composerKN;
                composer2.XQ();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier2 = modifier4;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: BQ.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return qz.t(onYourTemplatesClicked, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
            Arrangement arrangement2 = Arrangement.f17400n;
            Arrangement.HorizontalOrVertical horizontalOrVerticalNr2 = arrangement2.nr();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical verticalXMQ3 = companion4.xMQ();
            Modifier modifierKN2 = SizeKt.KN(modifier3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRl3 = RowKt.rl(horizontalOrVerticalNr2, verticalXMQ3, composerKN, 54);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierKN2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N3 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl3, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                H9N.j jVar2 = H9N.j.f3810n;
                TextKt.t("Templates", null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.rl(composerKN, 6).iF(), composerKN, 390, 0, 65530);
                Alignment.Vertical verticalXMQ22 = companion4.xMQ();
                Modifier modifier42 = modifier3;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierJ22 = ClickableKt.J2(companion32, false, null, null, onYourTemplatesClicked, 7, null);
                MeasurePolicy measurePolicyRl22 = RowKt.rl(arrangement2.J2(), verticalXMQ22, composerKN, 48);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierJ22);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyRl22, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    TextKt.t(gUxOLwRQBPPLC.RMuKsCHAU, null, aD.w6.EWS(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.rl(composerKN, 6).wTp(), composerKN, 390, 0, 65530);
                    IconKt.t(PainterResources_androidKt.t(2131231596, composerKN, 6), "Your Templates", SizeKt.Z(companion32, Dp.KN(24)), aD.w6.EWS(), composerKN, 3504, 0);
                    composer2 = composerKN;
                    composer2.XQ();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        rl(function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
