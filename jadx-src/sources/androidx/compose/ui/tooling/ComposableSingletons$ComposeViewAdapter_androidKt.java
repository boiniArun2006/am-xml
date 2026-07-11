package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$ComposeViewAdapter_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$ComposeViewAdapter_androidKt f33937n = new ComposableSingletons$ComposeViewAdapter_androidKt();
    public static Function2 rl = ComposableLambdaKt.rl(-1163195098, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1163195098, i2, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-1.<anonymous> (ComposeViewAdapter.android.kt:79)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f33938t = ComposableLambdaKt.rl(2086912010, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(2086912010, i2, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-2.<anonymous> (ComposeViewAdapter.android.kt:159)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });
    public static Function2 nr = ComposableLambdaKt.rl(290922684, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(290922684, i2, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-3.<anonymous> (ComposeViewAdapter.android.kt:363)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    public final Function2 n() {
        return rl;
    }

    public final Function2 rl() {
        return nr;
    }
}
