package VV;

import VV.n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(FQq.Dsr dsr, aC aCVar, float f3) {
        if (f3 >= 0.0f || dsr != null) {
            return (dsr != null && f3 < 0.0f) ? 1.0f : 0.0f;
        }
        return 1.0f;
    }

    public static final n n() {
        return new w6();
    }

    public static final Object O(n nVar, Continuation continuation) {
        FQq.Dsr dsrWPU = nVar.WPU();
        nVar.ViF();
        Object objRl = n.j.rl(nVar, null, t(dsrWPU, null, nVar.o()), 1, false, continuation, 9, null);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }

    public static final n nr(Composer composer, int i2) {
        composer.te(2024497114);
        if (ComposerKt.v()) {
            ComposerKt.p5(2024497114, i2, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.te(-610207850);
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = n();
            composer.o(objIF);
        }
        n nVar = (n) objIF;
        composer.M7();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.M7();
        return nVar;
    }
}
