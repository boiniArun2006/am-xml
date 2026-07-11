package Ax;

import Ax.QJ;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(QJ qj, Function0 function0, Function1 function1, Function0 function02, Function1 function12, Function1 function13, Function0 function03, int i2, Composer composer, int i3) {
        t(qj, function0, function1, function02, function12, function13, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(Function1 function1, QJ qj) {
        function1.invoke(Boolean.valueOf(((QJ.n) qj).n()));
        return Unit.INSTANCE;
    }

    public static final void t(final QJ qj, final Function0 onSignInButtonClick, final Function1 onJoinButtonClick, final Function0 onRankingButtonClick, final Function1 onSocialMediaClick, final Function1 onMenuClick, final Function0 onFaqButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onSignInButtonClick, "onSignInButtonClick");
        Intrinsics.checkNotNullParameter(onJoinButtonClick, "onJoinButtonClick");
        Intrinsics.checkNotNullParameter(onRankingButtonClick, "onRankingButtonClick");
        Intrinsics.checkNotNullParameter(onSocialMediaClick, "onSocialMediaClick");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        Intrinsics.checkNotNullParameter(onFaqButtonClick, "onFaqButtonClick");
        Composer composerKN = composer.KN(-1872426121);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerKN.p5(qj) : composerKN.E2(qj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onSignInButtonClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onJoinButtonClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onRankingButtonClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onSocialMediaClick) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onMenuClick) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onFaqButtonClick) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1872426121, i3, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingCard (CreatorRankingCard.kt:18)");
            }
            if (qj instanceof QJ.n) {
                composerKN.eF(-1357571073);
                composerKN.eF(-1357568462);
                boolean z2 = false;
                boolean z3 = (i3 & 896) == 256;
                if ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerKN.E2(qj))) {
                    z2 = true;
                }
                boolean z4 = z3 | z2;
                Object objIF = composerKN.iF();
                if (z4 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Ax.j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w6.nr(onJoinButtonClick, qj);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                AbstractC1306c.rl(true, (Function0) objIF, onRankingButtonClick, onFaqButtonClick, composerKN, ((i3 >> 3) & 896) | 6 | ((i3 >> 9) & 7168));
                composerKN.Xw();
            } else if (Intrinsics.areEqual(qj, QJ.w6.f158n)) {
                composerKN.eF(-1357561467);
                AbstractC1306c.rl(false, onSignInButtonClick, onRankingButtonClick, onFaqButtonClick, composerKN, (i3 & 112) | 6 | ((i3 >> 3) & 896) | ((i3 >> 9) & 7168));
                composerKN = composerKN;
                composerKN.Xw();
            } else if (qj instanceof QJ.Ml) {
                composerKN.eF(-1357552596);
                SPz.O(((QJ.Ml) qj).n(), onRankingButtonClick, onSocialMediaClick, onMenuClick, onFaqButtonClick, composerKN, (i3 >> 6) & 65520);
                composerKN.Xw();
            } else if (Intrinsics.areEqual(qj, QJ.j.f156n)) {
                composerKN.eF(-1357541912);
                composerKN.Xw();
            } else {
                if (qj != null) {
                    composerKN.eF(-1357572478);
                    composerKN.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composerKN.eF(-1357540728);
                composerKN.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Ax.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.O(qj, onSignInButtonClick, onJoinButtonClick, onRankingButtonClick, onSocialMediaClick, onMenuClick, onFaqButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
