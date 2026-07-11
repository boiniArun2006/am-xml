package iyp;

import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(boolean z2, Function1 function1, int i2, Composer composer, int i3) {
        t(z2, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void t(final boolean z2, final Function1 onCheckedChanged, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onCheckedChanged, "onCheckedChanged");
        Composer composerKN = composer.KN(1318914660);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.n(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onCheckedChanged) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1318914660, i3, -1, "com.alightcreative.monorepo.sercretmenu.items.FTEligibilitySwitch (FTEligibilitySwitch.kt:8)");
            }
            composerKN.eF(1123879521);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z2), null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            boolean zBooleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            composerKN.eF(1123882615);
            boolean z3 = (i3 & 112) == 32;
            Object objIF2 = composerKN.iF();
            if (z3 || objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: iyp.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return w6.nr(mutableState, onCheckedChanged, ((Boolean) obj).booleanValue());
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            SwitchKt.n(zBooleanValue, (Function1) objIF2, null, false, null, null, composerKN, 0, 60);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: iyp.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.O(z2, onCheckedChanged, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(MutableState mutableState, Function1 function1, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
        function1.invoke(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }
}
