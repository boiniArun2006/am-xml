package jOL;

import Dj7.CM;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class o {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(int i2, Function0 function0, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        t(i2, function0, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final int i2, final Function0 onCancelClicked, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        boolean z2;
        Object objIF;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onCancelClicked, "onCancelClicked");
        Composer composerKN = composer.KN(1215863867);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.E2(onCancelClicked) ? 32 : 16;
        }
        int i8 = i5 & 4;
        if (i8 == 0) {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i7 & 147) == 146 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1215863867, i7, -1, "com.alightcreative.common.compose.components.header.SelectionHeader (SelectionHeader.kt:31)");
                }
                Modifier modifierNr = BackgroundKt.nr(SizeKt.xMQ(modifier4, Dp.KN(57)), aD.w6.W(), null, 2, null);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierMUb = PaddingKt.mUb(boxScopeInstance.n(SizeKt.KN(companion3, 0.0f, 1, null), companion.rl()), Dp.KN(16), Dp.KN(4));
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
                String strRl = StringResources_androidKt.rl(2131886120, i2, new Object[]{Integer.valueOf(i2)}, composerKN, ((i7 << 3) & 112) | 6);
                H9N.j jVar = H9N.j.f3810n;
                TextStyle textStyleG = jVar.rl(composerKN, 6).g();
                long jF = aD.w6.F();
                TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                Modifier modifier5 = modifier4;
                CM.S(strRl, textStyleG, null, jF, null, null, null, companion4.rl(), false, 1, null, composerKN, 817892352, 0, 1396);
                SpacerKt.n(RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), composerKN, 0);
                String strT = StringResources_androidKt.t(2132017396, composerKN, 6);
                TextStyle textStyleRV9 = jVar.rl(composerKN, 6).rV9();
                composerKN.eF(-1861323487);
                z2 = (i7 & 112) != 32;
                objIF = composerKN.iF();
                if (!z2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: jOL.aC
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.nr(onCancelClicked);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                composer2 = composerKN;
                CM.S(strT, textStyleRV9, ClickableKt.J2(companion3, false, null, null, (Function0) objIF, 7, null), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.rl()), companion4.rl(), false, 1, null, composer2, 817892352, 0, 1328);
                composer2.XQ();
                composer2.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier5;
            } else {
                composerKN.wTp();
                composer2 = composerKN;
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: jOL.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return o.O(i2, onCancelClicked, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i7 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierNr2 = BackgroundKt.nr(SizeKt.xMQ(modifier4, Dp.KN(57)), aD.w6.W(), null, 2, null);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion5.HI(), false);
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
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierMUb2 = PaddingKt.mUb(boxScopeInstance2.n(SizeKt.KN(companion32, 0.0f, 1, null), companion5.rl()), Dp.KN(16), Dp.KN(4));
                MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.J2(), companion5.qie(), composerKN, 0);
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
                    String strRl2 = StringResources_androidKt.rl(2131886120, i2, new Object[]{Integer.valueOf(i2)}, composerKN, ((i7 << 3) & 112) | 6);
                    H9N.j jVar2 = H9N.j.f3810n;
                    TextStyle textStyleG2 = jVar2.rl(composerKN, 6).g();
                    long jF2 = aD.w6.F();
                    TextOverflow.Companion companion42 = TextOverflow.INSTANCE;
                    Modifier modifier52 = modifier4;
                    CM.S(strRl2, textStyleG2, null, jF2, null, null, null, companion42.rl(), false, 1, null, composerKN, 817892352, 0, 1396);
                    SpacerKt.n(RowScope.rl(rowScopeInstance2, companion32, 1.0f, false, 2, null), composerKN, 0);
                    String strT2 = StringResources_androidKt.t(2132017396, composerKN, 6);
                    TextStyle textStyleRV92 = jVar2.rl(composerKN, 6).rV9();
                    composerKN.eF(-1861323487);
                    if ((i7 & 112) != 32) {
                    }
                    objIF = composerKN.iF();
                    if (!z2) {
                        objIF = new Function0() { // from class: jOL.aC
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return o.nr(onCancelClicked);
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        composer2 = composerKN;
                        CM.S(strT2, textStyleRV92, ClickableKt.J2(companion32, false, null, null, (Function0) objIF, 7, null), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.rl()), companion42.rl(), false, 1, null, composer2, 817892352, 0, 1328);
                        composer2.XQ();
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
