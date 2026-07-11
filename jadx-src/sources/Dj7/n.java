package Dj7;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final void rl(final ModalBottomSheetState sheetState, final Function3 sheetContent, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(sheetContent, "sheetContent");
        Composer composerKN = composer.KN(-1104764248);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(sheetContent) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1104764248, i3, -1, "com.alightcreative.common.compose.components.ActivityBottomSheet (ActivityBottomSheet.kt:17)");
            }
            float f3 = 12;
            ModalBottomSheetKt.rl(sheetContent, null, sheetState, false, RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, aD.w6.iF(), UGc.f1707n.n(), composerKN, ((i3 >> 3) & 14) | 905969664 | (ModalBottomSheetState.f22280O << 6) | ((i3 << 6) & 896), 234);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n.t(sheetState, sheetContent, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ModalBottomSheetState modalBottomSheetState, Function3 function3, int i2, Composer composer, int i3) {
        rl(modalBottomSheetState, function3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
