package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ComposableSingletons$BasicTextFieldKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$BasicTextFieldKt f19498n = new ComposableSingletons$BasicTextFieldKt();
    private static Function3 rl = ComposableLambdaKt.rl(997835932, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-1$1
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
                ComposerKt.p5(997835932, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-1.<anonymous> (BasicTextField.kt:708)");
            }
            function2.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Function3 f19499t = ComposableLambdaKt.rl(2105616367, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1
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
                ComposerKt.p5(2105616367, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-2.<anonymous> (BasicTextField.kt:865)");
            }
            function2.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });
    private static Function3 nr = ComposableLambdaKt.rl(434140383, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-3$1
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
                ComposerKt.p5(434140383, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:909)");
            }
            function2.invoke(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Function3 f19497O = ComposableLambdaKt.rl(-34833998, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-4$1
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
                ComposerKt.p5(-34833998, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-4.<anonymous> (BasicTextField.kt:949)");
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

    public final Function3 nr() {
        return f19497O;
    }

    public final Function3 rl() {
        return f19499t;
    }

    public final Function3 t() {
        return nr;
    }
}
