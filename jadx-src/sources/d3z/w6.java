package d3z;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f63453n = new w6();
    public static Function3 rl = ComposableLambdaKt.rl(-1948544825, false, j.f63455n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f63454t = ComposableLambdaKt.rl(1970721325, false, n.f63456n);

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63455n = new j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope OutlinedButton, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1948544825, i2, -1, "com.bendingspoons.monopoly.secretmenu.ComposableSingletons$ProductsScreenKt.lambda-1.<anonymous> (ProductsScreen.kt:105)");
            }
            TextKt.t("Manage", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f63456n = new n();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope OutlinedButton, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1970721325, i2, -1, "com.bendingspoons.monopoly.secretmenu.ComposableSingletons$ProductsScreenKt.lambda-2.<anonymous> (ProductsScreen.kt:138)");
            }
            TextKt.t("Revoke", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    public final Function3 n() {
        return rl;
    }

    public final Function3 rl() {
        return f63454t;
    }
}
