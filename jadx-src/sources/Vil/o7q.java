package Vil;

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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class o7q {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final Modifier modifier, final Function0 onBackClicked, final Function0 onApplyClicked, boolean z2, Composer composer, final int i2, final int i3) {
        int i5;
        boolean z3;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Object objIF;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onApplyClicked, "onApplyClicked");
        Composer composerKN = composer.KN(638458005);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onBackClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onApplyClicked) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 == 0) {
            if ((i2 & 3072) == 0) {
                z3 = z2;
                i5 |= composerKN.n(z3) ? 2048 : 1024;
            }
            if ((i5 & 1171) == 1170 || !composerKN.xMQ()) {
                boolean z5 = i7 == 0 ? true : z3;
                if (ComposerKt.v()) {
                    ComposerKt.p5(638458005, i5, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetPreviewHeaderButtonsRow (PresetPreviewHeaderButtonsRow.kt:31)");
                }
                Modifier modifierKN = SizeKt.KN(modifier, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.nr(), companion.xMQ(), composerKN, 54);
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
                MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
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
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                Modifier modifierN = AlphaKt.n(companion3, 0.0f);
                composerKN.eF(1896607042);
                objIF = composerKN.iF();
                if (objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Vil.KH
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o7q.nr();
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                E.I28.rl(modifierN, (Function0) objIF, StringResources_androidKt.t(2132019914, composerKN, 6), null, null, false, 0L, 0L, composerKN, 196662, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                int i8 = i5;
                composerKN = composerKN;
                E.I28.rl(SizeKt.ViF(companion3, Dp.KN(24)), onBackClicked, null, 2131231894, null, false, aD.w6.mYa(), 0L, composerKN, (i5 & 112) | 1575942, 180);
                composerKN.XQ();
                String strT = StringResources_androidKt.t(2132019915, composerKN, 6);
                Modifier modifierRl = RowScope.rl(rowScopeInstance, PaddingKt.gh(SizeKt.mUb(rowScopeInstance.t(companion3, companion.xMQ()), Dp.KN(26), Dp.KN(34)), Dp.KN(6), 0.0f, 2, null), 1.0f, false, 2, null);
                long jMYa = aD.w6.mYa();
                int iN3 = TextAlign.INSTANCE.n();
                H9N.j jVar = H9N.j.f3810n;
                CM.ty(strT, CollectionsKt.listOf((Object[]) new TextStyle[]{jVar.rl(composerKN, 6).ViF(), jVar.rl(composerKN, 6).nY(), jVar.rl(composerKN, 6).g(), jVar.rl(composerKN, 6).te()}), modifierRl, jMYa, null, TextAlign.KN(iN3), 0, false, 0, composerKN, 3072, 464);
                boolean z6 = z5;
                E.I28.rl(companion3, onApplyClicked, StringResources_androidKt.t(2132019914, composerKN, 6), null, null, z6, aD.w6.mYa(), aD.w6.Org(), composerKN, ((i8 >> 3) & 112) | 14155782 | (458752 & (i8 << 6)), 24);
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                z4 = z6;
            } else {
                composerKN.wTp();
                z4 = z3;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Vil.Mf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return o7q.O(modifier, onBackClicked, onApplyClicked, z4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 3072;
        z3 = z2;
        if ((i5 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierKN2 = SizeKt.KN(modifier, 0.0f, 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl2 = RowKt.rl(Arrangement.f17400n.nr(), companion4.xMQ(), composerKN, 54);
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
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion4.HI(), false);
                iN2 = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, companion32);
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
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f17448n;
                    Modifier modifierN2 = AlphaKt.n(companion32, 0.0f);
                    composerKN.eF(1896607042);
                    objIF = composerKN.iF();
                    if (objIF == Composer.INSTANCE.n()) {
                    }
                    composerKN.Xw();
                    E.I28.rl(modifierN2, (Function0) objIF, StringResources_androidKt.t(2132019914, composerKN, 6), null, null, false, 0L, 0L, composerKN, 196662, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                    int i82 = i5;
                    composerKN = composerKN;
                    E.I28.rl(SizeKt.ViF(companion32, Dp.KN(24)), onBackClicked, null, 2131231894, null, false, aD.w6.mYa(), 0L, composerKN, (i5 & 112) | 1575942, 180);
                    composerKN.XQ();
                    String strT2 = StringResources_androidKt.t(2132019915, composerKN, 6);
                    Modifier modifierRl2 = RowScope.rl(rowScopeInstance2, PaddingKt.gh(SizeKt.mUb(rowScopeInstance2.t(companion32, companion4.xMQ()), Dp.KN(26), Dp.KN(34)), Dp.KN(6), 0.0f, 2, null), 1.0f, false, 2, null);
                    long jMYa2 = aD.w6.mYa();
                    int iN32 = TextAlign.INSTANCE.n();
                    H9N.j jVar2 = H9N.j.f3810n;
                    CM.ty(strT2, CollectionsKt.listOf((Object[]) new TextStyle[]{jVar2.rl(composerKN, 6).ViF(), jVar2.rl(composerKN, 6).nY(), jVar2.rl(composerKN, 6).g(), jVar2.rl(composerKN, 6).te()}), modifierRl2, jMYa2, null, TextAlign.KN(iN32), 0, false, 0, composerKN, 3072, 464);
                    boolean z62 = z5;
                    E.I28.rl(companion32, onApplyClicked, StringResources_androidKt.t(2132019914, composerKN, 6), null, null, z62, aD.w6.mYa(), aD.w6.Org(), composerKN, ((i82 >> 3) & 112) | 14155782 | (458752 & (i82 << 6)), 24);
                    composerKN.XQ();
                    if (ComposerKt.v()) {
                    }
                    z4 = z62;
                }
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, Function0 function0, Function0 function02, boolean z2, int i2, int i3, Composer composer, int i5) {
        t(modifier, function0, function02, z2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }
}
