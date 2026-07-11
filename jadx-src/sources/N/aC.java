package N;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class aC {
    public static final Dsr n(boolean z2, Composer composer, int i2, int i3) {
        composer.eF(670767482);
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(670767482, i2, -1, "com.alightcreative.common.compose.rememberDialogState (DialogState.kt:40)");
        }
        composer.eF(-1416343860);
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = new Dsr(z2);
            composer.o(objIF);
        }
        Dsr dsr = (Dsr) objIF;
        composer.Xw();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return dsr;
    }
}
