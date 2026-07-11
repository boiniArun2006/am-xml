package mA;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class C {
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Function0 onClick, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerKN = composer.KN(-505197119);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onClick) ? 4 : 2) | i2;
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
                    ComposerKt.p5(-505197119, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.composables.NewProjectCTA (NewProjectCTA.kt:32)");
                }
                Arrangement arrangement = Arrangement.f17400n;
                float fKN = Dp.KN(17);
                Alignment.Companion companion = Alignment.INSTANCE;
                Arrangement.Horizontal horizontalHI = arrangement.HI(fKN, companion.Uo());
                Alignment.Vertical verticalXMQ = companion.xMQ();
                float f3 = 12;
                Modifier modifier4 = modifier3;
                Modifier modifierKN = SizeKt.KN(PaddingKt.gh(ClickableKt.J2(ClipKt.n(BackgroundKt.t(w6.t(modifier3, aD.w6.ER(), RoundedCornerShapeKt.t(Dp.KN(f3)), Dp.KN(2), Dp.KN(f3), Dp.KN(f3), 0, 32, null), Color.INSTANCE.KN(), RoundedCornerShapeKt.t(Dp.KN(f3))), RoundedCornerShapeKt.t(Dp.KN(f3))), false, null, null, onClick, 7, null), 0.0f, Dp.KN(18), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRl = RowKt.rl(horizontalHI, verticalXMQ, composerKN, 54);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierT = BackgroundKt.t(SizeKt.Z(companion3, Dp.KN(32)), ((aF1.j) composerKN.ty(aF1.w6.t())).ck(), RoundedCornerShapeKt.J2());
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierT);
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
                Updater.O(composerN2, measurePolicyUo, companion2.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                function2Rl2 = companion2.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion2.nr());
                IconKt.t(PainterResources_androidKt.t(2131231469, composerKN, 6), "", BoxScopeInstance.f17448n.n(SizeKt.Z(companion3, Dp.KN(15)), companion.O()), 0L, composerKN, 48, 8);
                composerKN.XQ();
                TextKt.t(StringResources_androidKt.t(2132017539, composerKN, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).nHg(), composerKN, 0, 0, 65534);
                composerKN = composerKN;
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
                scopeUpdateScopeGh.n(new Function2() { // from class: mA.aC
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C.t(onClick, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
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
            float fKN2 = Dp.KN(17);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Arrangement.Horizontal horizontalHI2 = arrangement2.HI(fKN2, companion4.Uo());
            Alignment.Vertical verticalXMQ2 = companion4.xMQ();
            float f32 = 12;
            Modifier modifier42 = modifier3;
            Modifier modifierKN2 = SizeKt.KN(PaddingKt.gh(ClickableKt.J2(ClipKt.n(BackgroundKt.t(w6.t(modifier3, aD.w6.ER(), RoundedCornerShapeKt.t(Dp.KN(f32)), Dp.KN(2), Dp.KN(f32), Dp.KN(f32), 0, 32, null), Color.INSTANCE.KN(), RoundedCornerShapeKt.t(Dp.KN(f32))), RoundedCornerShapeKt.t(Dp.KN(f32))), false, null, null, onClick, 7, null), 0.0f, Dp.KN(18), 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalHI2, verticalXMQ2, composerKN, 54);
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
            Updater.O(composerN, measurePolicyRl2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk3, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion22.nr());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierT2 = BackgroundKt.t(SizeKt.Z(companion32, Dp.KN(32)), ((aF1.j) composerKN.ty(aF1.w6.t())).ck(), RoundedCornerShapeKt.J2());
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierT2);
                Function0 function0N22 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyUo2, companion22.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                function2Rl2 = companion22.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion22.nr());
                    IconKt.t(PainterResources_androidKt.t(2131231469, composerKN, 6), "", BoxScopeInstance.f17448n.n(SizeKt.Z(companion32, Dp.KN(15)), companion4.O()), 0L, composerKN, 48, 8);
                    composerKN.XQ();
                    TextKt.t(StringResources_androidKt.t(2132017539, composerKN, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).nHg(), composerKN, 0, 0, 65534);
                    composerKN = composerKN;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        rl(function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
