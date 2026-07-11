package MuZ;

import SFf.g9s;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
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
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, TextStyle textStyle2, R7M.j jVar, R7M.j jVar2, boolean z4, g9s.j jVar3, Function0 function0, Function0 function02, int i2, int i3, int i5, Composer composer, int i7) {
        rl(modifier, z2, z3, textStyle, textStyle2, jVar, jVar2, z4, jVar3, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3), i5);
        return Unit.INSTANCE;
    }

    public static final void rl(Modifier modifier, final boolean z2, final boolean z3, final TextStyle acceptAllButtonTextStyle, final TextStyle declineAllButtonTextStyle, final R7M.j acceptAllButtonStyle, final R7M.j declineAllButtonStyle, final boolean z4, final g9s.j scalingMode, final Function0 onAcceptAllClicked, final Function0 onDeclineAllClicked, Composer composer, final int i2, final int i3, final int i5) {
        Modifier modifier2;
        int i7;
        int i8;
        Modifier modifierRl;
        int i9;
        Modifier.Companion companion;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(acceptAllButtonTextStyle, "acceptAllButtonTextStyle");
        Intrinsics.checkNotNullParameter(declineAllButtonTextStyle, "declineAllButtonTextStyle");
        Intrinsics.checkNotNullParameter(acceptAllButtonStyle, "acceptAllButtonStyle");
        Intrinsics.checkNotNullParameter(declineAllButtonStyle, "declineAllButtonStyle");
        Intrinsics.checkNotNullParameter(scalingMode, "scalingMode");
        Intrinsics.checkNotNullParameter(onAcceptAllClicked, "onAcceptAllClicked");
        Intrinsics.checkNotNullParameter(onDeclineAllClicked, "onDeclineAllClicked");
        Composer composerKN = composer.KN(-1106567882);
        int i10 = i5 & 1;
        if (i10 != 0) {
            modifier2 = modifier;
            i7 = i2 | 6;
        } else {
            modifier2 = modifier;
            if ((i2 & 6) == 0) {
                i7 = i2 | (composerKN.p5(modifier2) ? 4 : 2);
            } else {
                i7 = i2;
            }
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= composerKN.n(z2) ? 32 : 16;
        }
        int i11 = i7;
        if ((i5 & 4) != 0) {
            i11 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i11 |= composerKN.n(z3) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i11 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i11 |= composerKN.p5(acceptAllButtonTextStyle) ? 2048 : 1024;
        }
        if ((i5 & 16) != 0) {
            i11 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i11 |= composerKN.p5(declineAllButtonTextStyle) ? 16384 : 8192;
        }
        if ((i5 & 32) != 0) {
            i11 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i11 |= composerKN.p5(acceptAllButtonStyle) ? 131072 : 65536;
        }
        if ((i5 & 64) != 0) {
            i11 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i11 |= composerKN.p5(declineAllButtonStyle) ? 1048576 : 524288;
        }
        if ((i5 & 128) != 0) {
            i11 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i11 |= composerKN.n(z4) ? 8388608 : 4194304;
        }
        if ((i5 & 256) != 0) {
            i11 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i11 |= (134217728 & i2) == 0 ? composerKN.p5(scalingMode) : composerKN.E2(scalingMode) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i5 & 512) != 0) {
            i11 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
        } else if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i11 |= composerKN.E2(onAcceptAllClicked) ? 536870912 : 268435456;
        }
        if ((i5 & 1024) != 0) {
            i8 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i8 = i3 | (composerKN.E2(onDeclineAllClicked) ? 4 : 2);
        } else {
            i8 = i3;
        }
        if ((i11 & 306783379) == 306783378 && (i8 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i10 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(-1106567882, i11, i8, "com.bendingspoons.legal.privacy.ui.settings.internal.ButtonsRow (ButtonsRow.kt:45)");
            }
            Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
            IntrinsicSize intrinsicSize = IntrinsicSize.f17697t;
            Modifier modifierN = IntrinsicKt.n(modifierKN, intrinsicSize);
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.rl(), Alignment.INSTANCE.qie(), composerKN, 6);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierN);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier5 = modifier4;
            Modifier modifierNr = SizeKt.nr(companion3, 0.0f, 1, null);
            if (Intrinsics.areEqual(scalingMode, g9s.j.n.f9045n)) {
                modifierRl = rowScopeInstance.n(IntrinsicKt.rl(modifierNr, intrinsicSize), 1.0f, false);
            } else {
                if (!Intrinsics.areEqual(scalingMode, g9s.j.C0308j.f9044n)) {
                    throw new NoWhenBranchMatchedException();
                }
                modifierRl = RowScope.rl(rowScopeInstance, SizeKt.KN(modifierNr, 0.0f, 1, null), 1.0f, false, 2, null);
            }
            Modifier modifier6 = modifierRl;
            if (z4) {
                composerKN.eF(-1171235093);
                i9 = 6;
                nr(z3, declineAllButtonStyle, declineAllButtonTextStyle, modifier6, onDeclineAllClicked, composerKN, 0);
                modifier6 = modifier6;
                composerKN = composerKN;
                composerKN.Xw();
                companion = companion3;
            } else {
                i9 = 6;
                composerKN.eF(-1171187508);
                companion = companion3;
                t(z2, acceptAllButtonStyle, acceptAllButtonTextStyle, modifier6, onAcceptAllClicked, composerKN, 0);
                composerKN.Xw();
            }
            composerKN.eF(239316126);
            if (z2 && z3) {
                SpacerKt.n(SizeKt.ViF(companion, Dp.KN(20)), composerKN, i9);
            }
            composerKN.Xw();
            if (z4) {
                composerKN.eF(-1170982164);
                t(z2, acceptAllButtonStyle, acceptAllButtonTextStyle, modifier6, onAcceptAllClicked, composerKN, 0);
                composerKN.Xw();
            } else {
                composerKN.eF(-1170935509);
                nr(z3, declineAllButtonStyle, declineAllButtonTextStyle, modifier6, onDeclineAllClicked, composerKN, 0);
                composerKN.Xw();
            }
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: MuZ.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n.O(modifier3, z2, z3, acceptAllButtonTextStyle, declineAllButtonTextStyle, acceptAllButtonStyle, declineAllButtonStyle, z4, scalingMode, onAcceptAllClicked, onDeclineAllClicked, i2, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void nr(boolean z2, R7M.j jVar, TextStyle textStyle, Modifier modifier, Function0 function0, Composer composer, int i2) {
        Composer composer2;
        composer.eF(-2061902181);
        if (ComposerKt.v()) {
            ComposerKt.p5(-2061902181, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.ButtonsRow.<anonymous>.declineAllButton (ButtonsRow.kt:71)");
        }
        if (z2) {
            composer2 = composer;
            Yd.Wre.rl(StringResources_androidKt.t(K0.aC.ck, composer, 0), jVar, textStyle, modifier, function0, composer2, 0, 0);
        } else {
            composer2 = composer;
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer2.Xw();
    }

    private static final void t(boolean z2, R7M.j jVar, TextStyle textStyle, Modifier modifier, Function0 function0, Composer composer, int i2) {
        Composer composer2;
        composer.eF(1768657901);
        if (ComposerKt.v()) {
            ComposerKt.p5(1768657901, i2, -1, "com.bendingspoons.legal.privacy.ui.settings.internal.ButtonsRow.<anonymous>.acceptAllButton (ButtonsRow.kt:60)");
        }
        if (z2) {
            composer2 = composer;
            Yd.Wre.rl(StringResources_androidKt.t(K0.aC.az, composer, 0), jVar, textStyle, modifier, function0, composer2, 0, 0);
        } else {
            composer2 = composer;
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer2.Xw();
    }
}
