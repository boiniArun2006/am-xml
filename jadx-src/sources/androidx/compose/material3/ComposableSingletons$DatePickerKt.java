package androidx.compose.material3;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeftKt;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.material.icons.filled.DateRangeKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$DatePickerKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$DatePickerKt f25072n = new ComposableSingletons$DatePickerKt();
    public static Function2 rl = ComposableLambdaKt.rl(1244569435, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1244569435, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-1.<anonymous> (DatePicker.kt:1364)");
            }
            ImageVector imageVectorN = EditKt.n(Icons.Filled.f23862n);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.nr(imageVectorN, Strings_androidKt.n(Strings.n(R.string.f27127S), composer, 0), null, 0L, composer, 0, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f25073t = ComposableLambdaKt.rl(668820324, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(668820324, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-2.<anonymous> (DatePicker.kt:1371)");
            }
            ImageVector imageVectorN = DateRangeKt.n(Icons.Filled.f23862n);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.nr(imageVectorN, Strings_androidKt.n(Strings.n(R.string.f27131Z), composer, 0), null, 0L, composer, 0, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });
    public static Function2 nr = ComposableLambdaKt.rl(1233169686, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1233169686, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-3.<anonymous> (DatePicker.kt:2183)");
            }
            ImageVector imageVectorN = KeyboardArrowLeftKt.n(Icons.AutoMirrored.Filled.f23857n);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.nr(imageVectorN, Strings_androidKt.n(Strings.n(R.string.aYN), composer, 0), null, 0L, composer, 0, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static Function2 f25071O = ComposableLambdaKt.rl(412350847, false, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ComposableSingletons$DatePickerKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            n(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(412350847, i2, -1, "androidx.compose.material3.ComposableSingletons$DatePickerKt.lambda-4.<anonymous> (DatePicker.kt:2189)");
            }
            ImageVector imageVectorN = KeyboardArrowRightKt.n(Icons.AutoMirrored.Filled.f23857n);
            Strings.Companion companion = Strings.INSTANCE;
            IconKt.nr(imageVectorN, Strings_androidKt.n(Strings.n(R.string.WPU), composer, 0), null, 0L, composer, 0, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    public final Function2 n() {
        return rl;
    }

    public final Function2 nr() {
        return f25071O;
    }

    public final Function2 rl() {
        return f25073t;
    }

    public final Function2 t() {
        return nr;
    }
}
