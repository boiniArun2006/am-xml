package Zd1;

import Dj7.AbstractC1328c;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class s4 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final Dp dp, final mg4.w6 subscriptionTier, final boolean z2, final boolean z3, final Map storageMap, final String str, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        boolean z4;
        String str2;
        int i7;
        final Modifier modifier2;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        int iN2;
        Composer composerN2;
        Function2 function2Rl2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(subscriptionTier, "subscriptionTier");
        Intrinsics.checkNotNullParameter(storageMap, "storageMap");
        Composer composerKN = composer.KN(1834060180);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(dp) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.p5(subscriptionTier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                z4 = z2;
                i5 |= composerKN.n(z4) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerKN.n(z3) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerKN.E2(storageMap) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 |= 196608;
                str2 = str;
            } else {
                str2 = str;
                if ((i2 & 196608) == 0) {
                    i5 |= composerKN.p5(str2) ? 131072 : 65536;
                }
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((1572864 & i2) == 0) {
                    modifier2 = modifier;
                    i5 |= composerKN.p5(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i5) == 599186 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                } else {
                    Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1834060180, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulCard (PlayfulCard.kt:48)");
                    }
                    Modifier modifierIF = SizeKt.iF(dp == null ? SizeKt.ViF(modifier3, dp.getValue()) : SizeKt.KN(modifier3, 0.0f, 1, null), null, false, 3, null);
                    if (z3) {
                        modifierIF = AbstractC1328c.n(modifierIF, Color.az(aD.w6.Y(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(12), Dp.KN(20), (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f);
                    }
                    float f3 = 12;
                    Modifier modifierO = BorderKt.O(BackgroundKt.nr(ClipKt.n(modifierIF, RoundedCornerShapeKt.t(Dp.KN(f3))), aD.w6.M7(), null, 2, null), BorderStrokeKt.n(Dp.KN(1), !z3 ? aD.w6.Y() : aD.w6.k()), RoundedCornerShapeKt.t(Dp.KN(f3)));
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
                    iN = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                    Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierO);
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
                    Updater.O(composerN, modifierO2, companion2.nr());
                    Modifier modifierN = BoxScopeInstance.f17448n.n(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(20)), companion.nr());
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion.gh(), composerKN, 0);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
                    Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierN);
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
                    Updater.O(composerN2, measurePolicyN, companion2.t());
                    Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
                    function2Rl2 = companion2.rl();
                    if (!composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                    }
                    Updater.O(composerN2, modifierO3, companion2.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    int i8 = i5 >> 6;
                    boolean z5 = z4;
                    composer2 = composerKN;
                    pTd.n.rl(z5, subscriptionTier, storageMap, str2, composer2, (i8 & 14) | (i5 & 112) | (i8 & 896) | (i8 & 7168));
                    composer2.XQ();
                    composer2.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    modifier2 = modifier3;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.c
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s4.t(dp, subscriptionTier, z2, z3, storageMap, str, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i5) == 599186) {
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                Modifier modifierIF2 = SizeKt.iF(dp == null ? SizeKt.ViF(modifier3, dp.getValue()) : SizeKt.KN(modifier3, 0.0f, 1, null), null, false, 3, null);
                if (z3) {
                }
                float f32 = 12;
                Modifier modifierO4 = BorderKt.O(BackgroundKt.nr(ClipKt.n(modifierIF2, RoundedCornerShapeKt.t(Dp.KN(f32))), aD.w6.M7(), null, 2, null), BorderStrokeKt.n(Dp.KN(1), !z3 ? aD.w6.Y() : aD.w6.k()), RoundedCornerShapeKt.t(Dp.KN(f32)));
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyUo2 = BoxKt.Uo(companion3.HI(), false);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
                Modifier modifierO22 = ComposedModifierKt.O(composerKN, modifierO4);
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
                    Updater.O(composerN, modifierO22, companion22.nr());
                    Modifier modifierN2 = BoxScopeInstance.f17448n.n(PaddingKt.xMQ(Modifier.INSTANCE, Dp.KN(20)), companion3.nr());
                    MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), companion3.gh(), composerKN, 0);
                    iN2 = ComposablesKt.n(composerKN, 0);
                    CompositionLocalMap compositionLocalMapIk22 = composerKN.Ik();
                    Modifier modifierO32 = ComposedModifierKt.O(composerKN, modifierN2);
                    Function0 function0N22 = companion22.n();
                    if (composerKN.getApplier() == null) {
                    }
                    composerKN.T();
                    if (composerKN.getInserting()) {
                    }
                    composerN2 = Updater.n(composerKN);
                    Updater.O(composerN2, measurePolicyN2, companion22.t());
                    Updater.O(composerN2, compositionLocalMapIk22, companion22.O());
                    function2Rl2 = companion22.rl();
                    if (!composerN2.getInserting()) {
                        composerN2.o(Integer.valueOf(iN2));
                        composerN2.az(Integer.valueOf(iN2), function2Rl2);
                        Updater.O(composerN2, modifierO32, companion22.nr());
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                        int i82 = i5 >> 6;
                        boolean z52 = z4;
                        composer2 = composerKN;
                        pTd.n.rl(z52, subscriptionTier, storageMap, str2, composer2, (i82 & 14) | (i5 & 112) | (i82 & 896) | (i82 & 7168));
                        composer2.XQ();
                        composer2.XQ();
                        if (ComposerKt.v()) {
                        }
                        modifier2 = modifier3;
                    }
                }
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        z4 = z2;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Dp dp, mg4.w6 w6Var, boolean z2, boolean z3, Map map, String str, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        rl(dp, w6Var, z2, z3, map, str, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
