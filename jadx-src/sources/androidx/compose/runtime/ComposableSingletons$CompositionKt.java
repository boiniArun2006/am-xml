package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$CompositionKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$CompositionKt f30068n = new ComposableSingletons$CompositionKt();
    private static Function2 rl = ComposableLambdaKt.rl(954879418, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
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
                ComposerKt.p5(954879418, i2, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:600)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Function2 f30069t = ComposableLambdaKt.rl(1918065384, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
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
                ComposerKt.p5(1918065384, i2, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:815)");
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
        return f30069t;
    }
}
