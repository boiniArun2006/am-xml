package pFG;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f71814n = new n();
    public static Function3 rl = ComposableLambdaKt.rl(525141161, false, j.f71816n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f71815t = ComposableLambdaKt.rl(869969323, false, C1097n.f71817n);
    public static Function2 nr = ComposableLambdaKt.rl(1476074290, false, w6.f71818n);

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f71816n = new j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(525141161, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ComposableSingletons$SetSegmentDialogKt.lambda-1.<anonymous> (SetSegmentDialog.kt:49)");
            }
            TextKt.t("Set segment", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: pFG.n$n, reason: collision with other inner class name */
    static final class C1097n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1097n f71817n = new C1097n();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(869969323, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ComposableSingletons$SetSegmentDialogKt.lambda-2.<anonymous> (SetSegmentDialog.kt:54)");
            }
            TextKt.t("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1097n() {
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f71818n = new w6();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1476074290, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ComposableSingletons$SetSegmentDialogKt.lambda-3.<anonymous> (SetSegmentDialog.kt:101)");
            }
            TextKt.t("De-segment from experiment", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        w6() {
        }
    }

    public final Function3 n() {
        return rl;
    }

    public final Function3 rl() {
        return f71815t;
    }

    public final Function2 t() {
        return nr;
    }
}
