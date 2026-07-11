package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SnackbarHostKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$SnackbarHostKt f25108n = new ComposableSingletons$SnackbarHostKt();
    public static Function3 rl = ComposableLambdaKt.rl(818736383, false, new Function3<SnackbarData, Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            n(snackbarData, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(SnackbarData snackbarData, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.p5(snackbarData) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(818736383, i3, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
            }
            SnackbarKt.nr(snackbarData, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i3 & 14, 510);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    public final Function3 n() {
        return rl;
    }
}
