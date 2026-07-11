package mA;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String title, Modifier modifier, Function2 function2, Function2 content, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        Function2 function2N;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        final Function2 function22;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerKN = composer.KN(22515604);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(title) ? 4 : 2) | i2;
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
                    function2N = function2;
                    i5 |= composerKN.E2(function2N) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= composerKN.E2(content) ? 2048 : 1024;
                }
                if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
                    composerKN.wTp();
                    function22 = content;
                    composer2 = composerKN;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        function2N = j.f70642n.n();
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(22515604, i5, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.composables.HomeScreenSection (HomeScreenSection.kt:20)");
                    }
                    Arrangement arrangement = Arrangement.f17400n;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(8));
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, companion.gh(), composerKN, 6);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composerKN, modifier4);
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
                    Arrangement.HorizontalOrVertical horizontalOrVerticalNr = arrangement.nr();
                    Alignment.Vertical verticalXMQ = companion.xMQ();
                    Modifier modifierGh = PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(20), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRl = RowKt.rl(horizontalOrVerticalNr, verticalXMQ, composerKN, 54);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh);
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
                    int i9 = i5;
                    Modifier modifier5 = modifier4;
                    TextKt.t(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).nHg(), composerKN, i5 & 14, 0, 65534);
                    composer2 = composerKN;
                    function2N = function2N;
                    function2N.invoke(composer2, Integer.valueOf((i9 >> 6) & 14));
                    composer2.XQ();
                    function22 = content;
                    function22.invoke(composer2, Integer.valueOf((i9 >> 9) & 14));
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier3 = modifier5;
                }
                final Function2 function23 = function2N;
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: mA.fuX
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Dsr.t(title, modifier3, function23, function22, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            function2N = function2;
            if ((i3 & 8) != 0) {
            }
            if ((i5 & 1171) == 1170) {
                if (i8 == 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.v()) {
                }
                Arrangement arrangement2 = Arrangement.f17400n;
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy2 = arrangement2.ty(Dp.KN(8));
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN2 = ColumnKt.n(horizontalOrVerticalTy2, companion3.gh(), composerKN, 6);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifier4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0 function0N3 = companion22.n();
                if (composerKN.getApplier() == null) {
                }
                composerKN.T();
                if (composerKN.getInserting()) {
                }
                composerN = Updater.n(composerKN);
                Updater.O(composerN, measurePolicyN2, companion22.t());
                Updater.O(composerN, compositionLocalMapIk3, companion22.O());
                function2Rl = companion22.rl();
                if (!composerN.getInserting()) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                    Updater.O(composerN, modifierO3, companion22.nr());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalNr2 = arrangement2.nr();
                    Alignment.Vertical verticalXMQ2 = companion3.xMQ();
                    Modifier modifierGh2 = PaddingKt.gh(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(20), 0.0f, 2, null);
                    MeasurePolicy measurePolicyRl2 = RowKt.rl(horizontalOrVerticalNr2, verticalXMQ2, composerKN, 54);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierGh2);
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
                        int i92 = i5;
                        Modifier modifier52 = modifier4;
                        TextKt.t(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composerKN, 6).nHg(), composerKN, i5 & 14, 0, 65534);
                        composer2 = composerKN;
                        function2N = function2N;
                        function2N.invoke(composer2, Integer.valueOf((i92 >> 6) & 14));
                        composer2.XQ();
                        function22 = content;
                        function22.invoke(composer2, Integer.valueOf((i92 >> 9) & 14));
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            final Function2 function232 = function2N;
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        function2N = function2;
        if ((i3 & 8) != 0) {
        }
        if ((i5 & 1171) == 1170) {
        }
        final Function2 function2322 = function2N;
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, Modifier modifier, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i5) {
        rl(str, modifier, function2, function22, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
