package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$BackdropScaffoldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$BackdropScaffoldKt f21721n = new ComposableSingletons$BackdropScaffoldKt();
    private static Function3 rl = ComposableLambdaKt.rl(-1054097158, false, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            n(snackbarHostState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(SnackbarHostState snackbarHostState, Composer composer, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= composer.p5(snackbarHostState) ? 4 : 2;
            }
            if (!composer.HI((i2 & 19) != 18, i2 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1054097158, i2, -1, gUxOLwRQBPPLC.gpc);
            }
            SnackbarHostKt.rl(snackbarHostState, null, null, composer, i2 & 14, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    public final Function3 n() {
        return rl;
    }
}
