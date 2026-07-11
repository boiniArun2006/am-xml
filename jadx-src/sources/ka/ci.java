package ka;

import Dj7.CM;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class ci {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final int i2, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-114882880);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        int i8 = i5 & 2;
        if (i8 == 0) {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            if ((i7 & 19) == 18 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-114882880, i7, -1, "com.alightcreative.app.motion.ranking.ui.RankingProfileBadge (RankingProfileBadge.kt:28)");
                }
                Modifier modifierViF = SizeKt.ViF(modifier4, Dp.KN(40));
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierViF);
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
                int i9 = (i2 != 0 || i2 == 1 || i2 == 2) ? 2131232213 : 2131232212;
                long jBu = i2 == 0 ? i2 != 1 ? i2 != 2 ? aD.w6.Bu() : aD.w6.T3L() : aD.w6.Uf() : aD.w6.p0N();
                float fKN = (i2 != 0 || i2 == 1 || i2 == 2) ? Dp.KN(12) : Dp.KN(9);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                IconKt.n(PainterResources_androidKt.t(i9, composerKN, 0), null, boxScopeInstance.n(companion3, companion.az()), jBu, composerKN, 48, 0);
                composer2 = composerKN;
                modifier3 = modifier4;
                CM.S(String.valueOf(i2 + 1), TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).nY(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), SizeKt.KN(PaddingKt.az(companion3, 0.0f, fKN, 0.0f, 0.0f, 13, null), 0.0f, 1, null), aD.w6.s(), null, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0, false, 1, null, composer2, 805309440, 0, 1456);
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
                scopeUpdateScopeGh.n(new Function2() { // from class: ka.SPz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ci.t(i2, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= 48;
        modifier2 = modifier;
        if ((i7 & 19) == 18) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierViF2 = SizeKt.ViF(modifier4, Dp.KN(40));
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierViF2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion22.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo2, companion22.t());
            Updater.O(composerN, compositionLocalMapIk2, companion22.O());
            function2Rl = companion22.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion22.nr());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                if (i2 != 0) {
                    if (i2 == 0) {
                    }
                    if (i2 != 0) {
                        float fKN2 = (i2 != 0 || i2 == 1 || i2 == 2) ? Dp.KN(12) : Dp.KN(9);
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        IconKt.n(PainterResources_androidKt.t(i9, composerKN, 0), null, boxScopeInstance2.n(companion32, companion4.az()), jBu, composerKN, 48, 0);
                        composer2 = composerKN;
                        modifier3 = modifier4;
                        CM.S(String.valueOf(i2 + 1), TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).nY(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), SizeKt.KN(PaddingKt.az(companion32, 0.0f, fKN2, 0.0f, 0.0f, 13, null), 0.0f, 1, null), aD.w6.s(), null, null, TextAlign.KN(TextAlign.INSTANCE.n()), 0, false, 1, null, composer2, 805309440, 0, 1456);
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i2, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        rl(i2, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }
}
