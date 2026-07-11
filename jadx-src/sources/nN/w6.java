package nN;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nN.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {
    public static final void rl(final State viewState, final Function0 onSignInButtonClick, final Function0 onOptInButtonClick, final Function0 onClaimRewardButtonClick, final Function0 onHowItWorksButtonClick, final Function0 onFAQsButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onSignInButtonClick, "onSignInButtonClick");
        Intrinsics.checkNotNullParameter(onOptInButtonClick, "onOptInButtonClick");
        Intrinsics.checkNotNullParameter(onClaimRewardButtonClick, "onClaimRewardButtonClick");
        Intrinsics.checkNotNullParameter(onHowItWorksButtonClick, "onHowItWorksButtonClick");
        Intrinsics.checkNotNullParameter(onFAQsButtonClick, "onFAQsButtonClick");
        Composer composerKN = composer.KN(-1581230532);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onSignInButtonClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onOptInButtonClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onClaimRewardButtonClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onHowItWorksButtonClick) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onFAQsButtonClick) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1581230532, i3, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorCard (CreatorCard.kt:17)");
            }
            fuX fux = (fuX) viewState.getValue();
            if (Intrinsics.areEqual(fux, fuX.n.f71089n)) {
                composerKN.eF(250143409);
                qz.O(true, onOptInButtonClick, onHowItWorksButtonClick, composerKN, ((i3 >> 3) & 112) | 6 | ((i3 >> 6) & 896));
                composerKN.Xw();
            } else if (Intrinsics.areEqual(fux, fuX.w6.f71090n)) {
                composerKN.eF(250150425);
                QJ.rl(composerKN, 0);
                composerKN.Xw();
            } else if (Intrinsics.areEqual(fux, fuX.Ml.f71087n)) {
                composerKN.eF(250152659);
                qz.O(false, onSignInButtonClick, onHowItWorksButtonClick, composerKN, (i3 & 112) | 6 | ((i3 >> 6) & 896));
                composerKN.Xw();
            } else if (fux instanceof fuX.I28) {
                composerKN.eF(250159727);
                fuX.I28 i28 = (fuX.I28) fux;
                int i5 = i3;
                eO.t(i28.n(), i28.rl(), onClaimRewardButtonClick, onFAQsButtonClick, composerKN, ((i5 >> 6) & 7168) | ((i5 >> 3) & 896));
                composerKN.Xw();
            } else if (Intrinsics.areEqual(fux, fuX.j.f71088n)) {
                composerKN.eF(250168327);
                composerKN.Xw();
            } else {
                if (fux != null) {
                    composerKN.eF(250141698);
                    composerKN.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composerKN.eF(250169511);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: nN.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.t(viewState, onSignInButtonClick, onOptInButtonClick, onClaimRewardButtonClick, onHowItWorksButtonClick, onFAQsButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(State state, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i2, Composer composer, int i3) {
        rl(state, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
