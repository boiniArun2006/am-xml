package nN;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class QJ {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i2, Composer composer, int i3) {
        rl(composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void rl(Composer composer, final int i2) {
        Composer composerKN = composer.KN(511766207);
        if (i2 == 0 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(511766207, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.optin.CreatorSuspendedCard (CreatorSuspendedCard.kt:22)");
            }
            CardKt.n(PaddingKt.az(Modifier.INSTANCE, 0.0f, Dp.KN(24), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.t(Dp.KN(12)), 0L, 0L, BorderStrokeKt.n(Dp.KN((float) 1.5d), aD.w6.s()), 0.0f, j.f71091n.n(), composerKN, 1597446, 44);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: nN.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.t(i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
