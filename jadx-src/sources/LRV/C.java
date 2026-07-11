package LRV;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f6083n = new C();
    public static Function2 rl = ComposableLambdaKt.rl(796863580, false, j.f6085n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f6084t = ComposableLambdaKt.rl(906368523, false, n.f6086n);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f6085n = new j();

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
                ComposerKt.p5(796863580, i2, -1, "com.bendingspoons.secretmenu.backendoverride.internal.ComposableSingletons$BackendOverrideContentKt.lambda-1.<anonymous> (BackendOverrideContent.kt:32)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f6086n = new n();

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
                ComposerKt.p5(906368523, i2, -1, "com.bendingspoons.secretmenu.backendoverride.internal.ComposableSingletons$BackendOverrideContentKt.lambda-2.<anonymous> (BackendOverrideContent.kt:100)");
            }
            TextKt.t("Apply and restart", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    public final Function2 n() {
        return rl;
    }

    public final Function3 rl() {
        return f6084t;
    }
}
