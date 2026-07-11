package rPd;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class I28 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0, Function0 function02, boolean z2, int i2, int i3, Composer composer, int i5) {
        t(function0, function02, z2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Function0 onBackClicked, final Function0 onDoneClicked, boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        boolean z3;
        boolean z4;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Object objIF;
        Modifier.Companion companion;
        RowScopeInstance rowScopeInstance;
        int i7;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onDoneClicked, "onDoneClicked");
        Composer composerKN = composer.KN(1708224659);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(onBackClicked) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onDoneClicked) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 256 : 128;
            }
            if ((i5 & 147) == 146 || !composerKN.xMQ()) {
                z4 = i8 == 0 ? true : z3;
                if (ComposerKt.v()) {
                    ComposerKt.p5(1708224659, i5, -1, "com.alightcreative.privacy.ui.components.PrivacySettingsTopBar (PrivacySettingsTopBar.kt:29)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierGh = PaddingKt.gh(PaddingKt.az(SizeKt.KN(companion2, 0.0f, 1, null), 0.0f, Dp.KN(10), 0.0f, 0.0f, 13, null), Dp.KN(16), 0.0f, 2, null);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.nr(), companion3.xMQ(), composerKN, 54);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierGh);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion4.n();
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
                Updater.O(composerN, measurePolicyRl, companion4.t());
                Updater.O(composerN, compositionLocalMapIk, companion4.O());
                function2Rl = companion4.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion4.nr());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.f17780n;
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion2);
                Function0 function0N2 = companion4.n();
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
                Updater.O(composerN2, measurePolicyUo, companion4.t());
                Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
                function2Rl2 = companion4.rl();
                if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                }
                Updater.O(composerN2, modifierO2, companion4.nr());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                Modifier modifierN = AlphaKt.n(companion2, 0.0f);
                composerKN.eF(-839151639);
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: rPd.w6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I28.nr();
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                E.I28.rl(modifierN, (Function0) objIF, StringResources_androidKt.t(2132020303, composerKN, 6), null, null, false, 0L, 0L, composerKN, 196662, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                composerKN.eF(-839146117);
                if (z4) {
                    companion = companion2;
                    rowScopeInstance = rowScopeInstance2;
                    i7 = i5;
                } else {
                    companion = companion2;
                    i7 = i5;
                    rowScopeInstance = rowScopeInstance2;
                    E.I28.rl(SizeKt.ViF(companion2, Dp.KN(24)), onBackClicked, null, 2131231527, null, false, aD.w6.K(), 0L, composerKN, 1575942 | ((i5 << 3) & 112), 180);
                }
                composerKN.Xw();
                composerKN.XQ();
                String strT = StringResources_androidKt.t(2132019962, composerKN, 6);
                Modifier.Companion companion5 = companion;
                RowScopeInstance rowScopeInstance3 = rowScopeInstance;
                Modifier modifierRl = RowScope.rl(rowScopeInstance3, PaddingKt.gh(SizeKt.mUb(rowScopeInstance3.t(companion5, companion3.xMQ()), Dp.KN(26), Dp.KN(34)), Dp.KN(6), 0.0f, 2, null), 1.0f, false, 2, null);
                long jK = aD.w6.K();
                int iN3 = TextAlign.INSTANCE.n();
                H9N.j jVar = H9N.j.f3810n;
                CM.ty(strT, CollectionsKt.listOf((Object[]) new TextStyle[]{jVar.rl(composerKN, 6).aYN(), jVar.rl(composerKN, 6).ViF(), jVar.rl(composerKN, 6).nY(), jVar.rl(composerKN, 6).g()}), modifierRl, jK, null, TextAlign.KN(iN3), 0, false, 0, composerKN, 3072, 464);
                E.I28.rl(PaddingKt.az(companion5, Dp.KN(15), 0.0f, 0.0f, 0.0f, 14, null), onDoneClicked, StringResources_androidKt.t(2132020303, composerKN, 6), null, null, false, aD.w6.K(), 0L, composerKN, (i7 & 112) | 1572870, 184);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                z5 = z4;
            } else {
                composerKN.wTp();
                z5 = z3;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: rPd.Ml
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return I28.O(onBackClicked, onDoneClicked, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        z3 = z2;
        if ((i5 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier.Companion companion22 = Modifier.INSTANCE;
            Modifier modifierGh2 = PaddingKt.gh(PaddingKt.az(SizeKt.KN(companion22, 0.0f, 1, null), 0.0f, Dp.KN(10), 0.0f, 0.0f, 13, null), Dp.KN(16), 0.0f, 2, null);
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.nr(), companion32.xMQ(), composerKN, 54);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierGh2);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0 function0N3 = companion42.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyRl2, companion42.t());
            Updater.O(composerN, compositionLocalMapIk3, companion42.O());
            function2Rl = companion42.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO3, companion42.nr());
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.f17780n;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion32.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, companion22);
                Function0 function0N22 = companion42.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN2 = Updater.n(composerKN);
                Updater.O(composerN2, measurePolicyUo2, companion42.t());
                Updater.O(composerN2, compositionLocalMapIk22, companion42.O());
                function2Rl2 = companion42.rl();
                if (!composerN2.getInserting()) {
                    composerN2.o(Integer.valueOf(iN2));
                    composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    Updater.O(composerN2, modifierO22, companion42.nr());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    Modifier modifierN2 = AlphaKt.n(companion22, 0.0f);
                    composerKN.eF(-839151639);
                    objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                    }
                    composerKN.Xw();
                    E.I28.rl(modifierN2, (Function0) objIF, StringResources_androidKt.t(2132020303, composerKN, 6), null, null, false, 0L, 0L, composerKN, 196662, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                    composerKN.eF(-839146117);
                    if (z4) {
                    }
                    composerKN.Xw();
                    composerKN.XQ();
                    String strT2 = StringResources_androidKt.t(2132019962, composerKN, 6);
                    Modifier.Companion companion52 = companion;
                    RowScopeInstance rowScopeInstance32 = rowScopeInstance;
                    Modifier modifierRl2 = RowScope.rl(rowScopeInstance32, PaddingKt.gh(SizeKt.mUb(rowScopeInstance32.t(companion52, companion32.xMQ()), Dp.KN(26), Dp.KN(34)), Dp.KN(6), 0.0f, 2, null), 1.0f, false, 2, null);
                    long jK2 = aD.w6.K();
                    int iN32 = TextAlign.INSTANCE.n();
                    H9N.j jVar2 = H9N.j.f3810n;
                    CM.ty(strT2, CollectionsKt.listOf((Object[]) new TextStyle[]{jVar2.rl(composerKN, 6).aYN(), jVar2.rl(composerKN, 6).ViF(), jVar2.rl(composerKN, 6).nY(), jVar2.rl(composerKN, 6).g()}), modifierRl2, jK2, null, TextAlign.KN(iN32), 0, false, 0, composerKN, 3072, 464);
                    E.I28.rl(PaddingKt.az(companion52, Dp.KN(15), 0.0f, 0.0f, 0.0f, 14, null), onDoneClicked, StringResources_androidKt.t(2132020303, composerKN, 6), null, null, false, aD.w6.K(), 0L, composerKN, (i7 & 112) | 1572870, 184);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    z5 = z4;
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }
}
