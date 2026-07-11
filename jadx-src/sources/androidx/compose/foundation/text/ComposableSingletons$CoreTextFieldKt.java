package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$CoreTextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$CoreTextFieldKt f19504n = new ComposableSingletons$CoreTextFieldKt();
    private static Function3 rl = ComposableLambdaKt.rl(-813639903, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            n(function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function2 function2, Composer composer, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= composer.E2(function2) ? 4 : 2;
            }
            if (!composer.HI((i2 & 19) != 18, i2 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-813639903, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:202)");
            }
            function2.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    public final Function3 n() {
        return rl;
    }
}
