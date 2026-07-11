package Dj7;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ml {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final ColumnScope BottomSheetHandle, long j2, Composer composer, final int i2, final int i3) {
        int i5;
        long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(BottomSheetHandle, "$this$BottomSheetHandle");
        Composer composerKN = composer.KN(-618223951);
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (composerKN.p5(BottomSheetHandle) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i3 & 1;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                j3 = j2;
                i5 |= composerKN.nr(j3) ? 32 : 16;
            }
            if ((i5 & 19) == 18 || !composerKN.xMQ()) {
                long jVvq = i7 == 0 ? aD.w6.Vvq() : j3;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-618223951, i5, -1, "com.alightcreative.common.compose.components.BottomSheetHandle (BottomSheetHandle.kt:22)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(8)), composerKN, 6);
                CardKt.n(BottomSheetHandle.t(SizeKt.XQ(companion, DpKt.rl(Dp.KN(54), Dp.KN(4))), Alignment.INSTANCE.Uo()), RoundedCornerShapeKt.t(Dp.KN(100)), jVvq, 0L, null, 0.0f, Q.f1675n.n(), composerKN, ((i5 << 3) & 896) | 1572864, 56);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                j4 = jVvq;
            } else {
                composerKN.wTp();
                j4 = j3;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.w6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Ml.t(BottomSheetHandle, j4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 48;
        j3 = j2;
        if ((i5 & 19) == 18) {
            if (i7 == 0) {
            }
            if (ComposerKt.v()) {
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(8)), composerKN, 6);
            CardKt.n(BottomSheetHandle.t(SizeKt.XQ(companion2, DpKt.rl(Dp.KN(54), Dp.KN(4))), Alignment.INSTANCE.Uo()), RoundedCornerShapeKt.t(Dp.KN(100)), jVvq, 0L, null, 0.0f, Q.f1675n.n(), composerKN, ((i5 << 3) & 896) | 1572864, 56);
            if (ComposerKt.v()) {
            }
            j4 = jVvq;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ColumnScope columnScope, long j2, int i2, int i3, Composer composer, int i5) {
        rl(columnScope, j2, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
