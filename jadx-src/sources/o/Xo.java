package o;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Xo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0, Modifier modifier, PaddingValues paddingValues, int i2, int i3, Composer composer, int i5) {
        t(function0, modifier, paddingValues, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 onClicked, Modifier modifier, PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        PaddingValues paddingValues2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        boolean z2;
        Object objIF;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Composer composerKN = composer.KN(1431463593);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    modifier3 = modifier2;
                    paddingValues3 = paddingValues2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    PaddingValues paddingValuesN = i7 == 0 ? PaddingKt.n(Dp.KN(0)) : paddingValues2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1431463593, i5, -1, "com.alightcreative.monetization.ui.components.buttons.PaywallRightArrowIcon (PaywallRightArrowIcon.kt:20)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion3.n();
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
                    Updater.O(composerN, measurePolicyUo, companion3.t());
                    Updater.O(composerN, compositionLocalMapIk, companion3.O());
                    function2Rl = companion3.rl();
                    if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion3.nr());
                    Modifier modifierN = BoxScopeInstance.f17448n.n(modifier4, companion2.ty());
                    composerKN.eF(-1871091117);
                    z2 = (i5 & 14) != 4;
                    objIF = composerKN.iF();
                    if (!z2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: o.qz
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Xo.nr(onClicked);
                            }
                        };
                        composerKN.o(objIF);
                    }
                    composerKN.Xw();
                    Modifier modifierJ2 = ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null);
                    MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion2.KN(), false);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ2);
                    Function0 function0N2 = companion3.n();
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
                    Updater.O(composerN2, measurePolicyUo2, companion3.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
                    function2Rl2 = companion3.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO2, companion3.nr());
                    PaddingValues paddingValues4 = paddingValuesN;
                    ImageKt.n(PainterResources_androidKt.t(2131231871, composerKN, 6), null, PaddingKt.KN(companion, paddingValuesN), null, null, 0.0f, null, composerKN, 48, b.f61769v);
                    composerKN.XQ();
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    paddingValues3 = paddingValues4;
                    modifier3 = modifier4;
                }
                scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: o.Pl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Xo.O(onClicked, modifier3, paddingValues3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            paddingValues2 = paddingValues;
            if ((i5 & 147) == 146) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierKN2 = SizeKt.KN(companion4, 0.0f, 1, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo3 = BoxKt.Uo(companion22.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierKN2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion32.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyUo3, companion32.t());
                Updater.O(composerN, compositionLocalMapIk3, companion32.O());
                function2Rl = companion32.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO3, companion32.nr());
                    Modifier modifierN2 = BoxScopeInstance.f17448n.n(modifier4, companion22.ty());
                    composerKN.eF(-1871091117);
                    if ((i5 & 14) != 4) {
                    }
                    objIF = composerKN.iF();
                    if (!z2) {
                        objIF = new Function0() { // from class: o.qz
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Xo.nr(onClicked);
                            }
                        };
                        composerKN.o(objIF);
                        composerKN.Xw();
                        Modifier modifierJ22 = ClickableKt.J2(modifierN2, false, null, null, (Function0) objIF, 7, null);
                        MeasurePolicy measurePolicyUo22 = BoxKt.Uo(companion22.KN(), false);
                        iN2 = ComposablesKt.n(composerKN, 0);
                        CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                        Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierJ22);
                        Function0 function0N22 = companion32.n();
                        if (composerKN.getApplier() == null) {
                        }
                        composerKN.T();
                        if (composerKN.getInserting()) {
                        }
                        composerN2 = Updater.n(composerKN);
                        Updater.O(composerN2, measurePolicyUo22, companion32.t());
                        Updater.O(composerN2, compositionLocalMapIk22, companion32.O());
                        function2Rl2 = companion32.rl();
                        if (!composerN2.getInserting()) {
                            composerN2.o(Integer.valueOf(iN2));
                            composerN2.az(Integer.valueOf(iN2), function2Rl2);
                            Updater.O(composerN2, modifierO22, companion32.nr());
                            PaddingValues paddingValues42 = paddingValuesN;
                            ImageKt.n(PainterResources_androidKt.t(2131231871, composerKN, 6), null, PaddingKt.KN(companion4, paddingValuesN), null, null, 0.0f, null, composerKN, 48, b.f61769v);
                            composerKN.XQ();
                            composerKN.XQ();
                            if (ComposerKt.v()) {
                            }
                            paddingValues3 = paddingValues42;
                            modifier3 = modifier4;
                        }
                    }
                }
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
