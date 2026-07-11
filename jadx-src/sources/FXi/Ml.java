package FXi;

import FXi.l3D;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(l3D l3d, Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        nr(l3d, function0, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void gh(l3D l3d, final Function0 function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        l3D l3d2;
        int i5;
        Function0 function02;
        Modifier modifier2;
        int i7;
        int iN;
        Composer composerN;
        Function2 function2Rl;
        Integer numXMQ;
        float f3;
        String strHI;
        String strZ;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Composer composerKN = composer.KN(-1278258052);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
            l3d2 = l3d;
        } else {
            l3d2 = l3d;
            if ((i2 & 6) == 0) {
                i5 = (composerKN.p5(l3d2) ? 4 : 2) | i2;
            } else {
                i5 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i5 |= composerKN.E2(function02) ? 32 : 16;
            }
        }
        int i8 = i3 & 4;
        if (i8 == 0) {
            if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            i7 = i5;
            if ((i7 & 147) == 146 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1278258052, i7, -1, "com.bendingspoons.legal.privacy.ui.banner.ScrollingContent (PrivacyBannerContent.kt:98)");
                }
                Modifier modifierUo = ScrollKt.Uo(modifier4, ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
                iN = ComposablesKt.n(composerKN, 0);
                CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
                Modifier modifierO = ComposedModifierKt.O(composerKN, modifierUo);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0 function0N = companion.n();
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
                Updater.O(composerN, measurePolicyN, companion.t());
                Updater.O(composerN, compositionLocalMapIk, companion.O());
                function2Rl = companion.rl();
                if (!composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion.nr());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                numXMQ = l3d2.xMQ();
                composerKN.eF(-151474014);
                if (numXMQ != null) {
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                    I8.Ml.rl(l3d2.xMQ().intValue(), l3d2.gh(), SizeKt.aYN(PaddingKt.KN(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), l3d2.mUb()), 0.0f, 0.0f, 0.0f, Dp.KN(Dp.KN(((Configuration) composerKN.ty(AndroidCompositionLocals_androidKt.J2())).screenHeightDp) / 2), 7, null), composerKN, 0, 0);
                }
                composerKN.Xw();
                strHI = l3d2.HI();
                composerKN.eF(-151461576);
                if (strHI != null) {
                    I8.Dsr.KN(l3d2.Ik(), PaddingKt.KN(Modifier.INSTANCE, l3d2.ck()), l3d2.HI(), composerKN, 0, 0);
                }
                composerKN.Xw();
                strZ = l3d2.Z();
                composerKN.eF(-151453221);
                if (strZ == null) {
                    strZ = StringResources_androidKt.t(K0.aC.qie, composerKN, 0);
                }
                String str = strZ;
                composerKN.Xw();
                TextStyle textStyleXQ = l3d2.XQ();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f4 = 20;
                I8.Dsr.mUb(textStyleXQ, PaddingKt.gh(companion2, Dp.KN(f4), f3, 2, null), str, composerKN, 48, 0);
                SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f4)), composerKN, 6);
                I8.Dsr.O(function02, l3d2.nr(), l3d2.qie(), l3d2.O() == l3D.j.f2690t, l3d2.aYN(), PaddingKt.gh(companion2, Dp.KN(f4), f3, 2, null), l3d2.WPU(), composerKN, ((i7 >> 3) & 14) | 196608, 0);
                composerKN = composerKN;
                composerKN.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                final l3D l3d3 = l3d2;
                scopeUpdateScopeGh.n(new Function2() { // from class: FXi.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Ml.qie(l3d3, function0, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        i7 = i5;
        if ((i7 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier modifierUo2 = ScrollKt.Uo(modifier4, ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyN2 = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
            iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierUo2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N2 = companion3.n();
            if (composerKN.getApplier() == null) {
            }
            composerKN.T();
            if (composerKN.getInserting()) {
            }
            composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN2, companion3.t());
            Updater.O(composerN, compositionLocalMapIk2, companion3.O());
            function2Rl = companion3.rl();
            if (!composerN.getInserting()) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
                Updater.O(composerN, modifierO2, companion3.nr());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.f17468n;
                numXMQ = l3d2.xMQ();
                composerKN.eF(-151474014);
                if (numXMQ != null) {
                }
                composerKN.Xw();
                strHI = l3d2.HI();
                composerKN.eF(-151461576);
                if (strHI != null) {
                }
                composerKN.Xw();
                strZ = l3d2.Z();
                composerKN.eF(-151453221);
                if (strZ == null) {
                }
                String str2 = strZ;
                composerKN.Xw();
                TextStyle textStyleXQ2 = l3d2.XQ();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                float f42 = 20;
                I8.Dsr.mUb(textStyleXQ2, PaddingKt.gh(companion22, Dp.KN(f42), f3, 2, null), str2, composerKN, 48, 0);
                SpacerKt.n(SizeKt.xMQ(companion22, Dp.KN(f42)), composerKN, 6);
                if (l3d2.O() == l3D.j.f2690t) {
                }
                I8.Dsr.O(function02, l3d2.nr(), l3d2.qie(), l3d2.O() == l3D.j.f2690t, l3d2.aYN(), PaddingKt.gh(companion22, Dp.KN(f42), f3, 2, null), l3d2.WPU(), composerKN, ((i7 >> 3) & 14) | 196608, 0);
                composerKN = composerKN;
                composerKN.XQ();
                if (ComposerKt.v()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(Modifier modifier, l3D l3d, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, int i3, Composer composer, int i5) {
        xMQ(modifier, l3d, z2, function0, function02, function03, function04, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(l3D l3d, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        gh(l3d, function0, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void xMQ(Modifier modifier, l3D l3d, final boolean z2, final Function0 onAcceptAllClicked, final Function0 onCustomizeClicked, final Function0 onCloseClicked, final Function0 onPrivacyPolicyLinkClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        l3D l3d2;
        Modifier modifier3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(onAcceptAllClicked, "onAcceptAllClicked");
        Intrinsics.checkNotNullParameter(onCustomizeClicked, "onCustomizeClicked");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onPrivacyPolicyLinkClicked, "onPrivacyPolicyLinkClicked");
        Composer composerKN = composer.KN(544429025);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                l3d2 = l3d;
                int i8 = composerKN.p5(l3d2) ? 32 : 16;
                i5 |= i8;
            } else {
                l3d2 = l3d;
            }
            i5 |= i8;
        } else {
            l3d2 = l3d;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.n(z2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= composerKN.E2(onAcceptAllClicked) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onCustomizeClicked) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i5 |= composerKN.E2(onCloseClicked) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 |= composerKN.E2(onPrivacyPolicyLinkClicked) ? 1048576 : 524288;
        }
        if ((599187 & i5) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier4 = modifier2;
        } else {
            composerKN.e();
            if ((i2 & 1) == 0 || composerKN.rV9()) {
                modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    l3d2 = new l3D(null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, false, null, null, false, false, 33554431, null);
                    i5 &= -113;
                }
            } else {
                composerKN.wTp();
                if ((i3 & 2) != 0) {
                    i5 &= -113;
                }
                modifier3 = modifier2;
            }
            int i9 = i5;
            composerKN.S();
            if (ComposerKt.v()) {
                ComposerKt.p5(544429025, i9, -1, "com.bendingspoons.legal.privacy.ui.banner.PrivacyBannerContent (PrivacyBannerContent.kt:52)");
            }
            Modifier modifierNr = BackgroundKt.nr(SizeKt.J2(modifier3, 0.0f, 1, null), l3d2.t(), null, 2, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierNr);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyUo, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f3 = 20;
            Modifier modifierAz = PaddingKt.az(companion3, 0.0f, 0.0f, 0.0f, Dp.KN(f3), 7, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion.gh(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierAz);
            Modifier modifier5 = modifier3;
            Function0 function0N2 = companion2.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyN, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(l3d2.S())), composerKN, 0);
            int i10 = (i9 >> 3) & 14;
            int i11 = i9 >> 15;
            l3D l3d3 = l3d2;
            gh(l3d3, onPrivacyPolicyLinkClicked, ColumnScope.rl(columnScopeInstance, companion3, 1.0f, false, 2, null), composerKN, (i11 & 112) | i10, 0);
            composerKN = composerKN;
            SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(f3)), composerKN, 6);
            int i12 = i9 >> 6;
            nr(l3d3, onAcceptAllClicked, onCustomizeClicked, onCloseClicked, composerKN, i10 | (i12 & 112) | (i12 & 896) | (i12 & 7168));
            l3d2 = l3d3;
            composerKN.XQ();
            composerKN.eF(48530628);
            if (l3d2.O() == l3D.j.f2689n) {
                I8.n.rl(onCloseClicked, l3d2.J2(), PaddingKt.xMQ(WindowInsetsPadding_androidKt.nr(WindowInsetsPadding_androidKt.n(boxScopeInstance.n(companion3, companion.HI()))), Dp.KN(10)), composerKN, i11 & 14, 0);
            }
            composerKN.Xw();
            composerKN.eF(48543411);
            if (z2) {
                Yd.Ml.t(l3d2.az(), l3d2.ty(), composerKN, 0);
            }
            composerKN.Xw();
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier4 = modifier5;
        }
        final l3D l3d4 = l3d2;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: FXi.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.mUb(modifier4, l3d4, z2, onAcceptAllClicked, onCustomizeClicked, onCloseClicked, onPrivacyPolicyLinkClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void J2(l3D l3d, Function0 function0, Composer composer, int i2) {
        composer.eF(-1295946223);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1295946223, i2, -1, YjqZUJsVmhcjko.XmDUKiZWdwddwR);
        }
        Yd.Wre.rl(StringResources_androidKt.t(K0.aC.f4813O, composer, 0), l3d.Uo(), l3d.KN(), PaddingKt.gh(IntrinsicKt.n(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.f17696n), Dp.KN(20), 0.0f, 2, null), function0, composer, 3072, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
    }

    private static final void KN(l3D l3d, Function0 function0, Composer composer, int i2) {
        composer.eF(-1574751228);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1574751228, i2, -1, "com.bendingspoons.legal.privacy.ui.banner.Buttons.refuseButton (PrivacyBannerContent.kt:170)");
        }
        Yd.Wre.rl(StringResources_androidKt.t(K0.aC.gh, composer, 0), l3d.r(), l3d.o(), PaddingKt.gh(IntrinsicKt.n(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.f17696n), Dp.KN(20), 0.0f, 2, null), function0, composer, 3072, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
    }

    private static final void O(l3D l3d, Function0 function0, Composer composer, int i2) {
        composer.eF(-315074160);
        if (ComposerKt.v()) {
            ComposerKt.p5(-315074160, i2, -1, "com.bendingspoons.legal.privacy.ui.banner.Buttons.acceptButton (PrivacyBannerContent.kt:146)");
        }
        Yd.Wre.rl(StringResources_androidKt.t(K0.aC.nr, composer, 0), l3d.n(), l3d.rl(), PaddingKt.gh(IntrinsicKt.n(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.f17696n), Dp.KN(20), 0.0f, 2, null), function0, composer, 3072, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
    }

    private static final void nr(final l3D l3d, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, final int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        Composer composerKN = composer.KN(1922664142);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(l3d)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(function0)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.E2(function02)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (composerKN.E2(function03)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i3 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1922664142, i3, -1, "com.bendingspoons.legal.privacy.ui.banner.Buttons (PrivacyBannerContent.kt:144)");
            }
            if (l3d.ViF()) {
                composerKN.eF(2001767295);
                J2(l3d, function02, composerKN, 0);
            } else {
                composerKN.eF(2001768028);
                O(l3d, function0, composerKN, 0);
            }
            composerKN.Xw();
            composerKN.eF(2001768698);
            if (l3d.O() == l3D.j.f2690t) {
                KN(l3d, function03, composerKN, 0);
            }
            composerKN.Xw();
            if (l3d.ViF()) {
                composerKN.eF(2001772316);
                O(l3d, function0, composerKN, 0);
            } else {
                composerKN.eF(2001772959);
                J2(l3d, function02, composerKN, 0);
            }
            composerKN.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: FXi.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.Uo(l3d, function0, function02, function03, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
