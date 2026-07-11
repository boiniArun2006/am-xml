package Yz;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f12243n = new j();
    public static Function2 rl = ComposableLambdaKt.rl(1493549031, false, C0443j.f12245n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f12244t = ComposableLambdaKt.rl(625624490, false, n.f12246n);

    /* JADX INFO: renamed from: Yz.j$j, reason: collision with other inner class name */
    static final class C0443j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0443j f12245n = new C0443j();

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
                ComposerKt.p5(1493549031, i2, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.ComposableSingletons$OracleSettingsScreenKt.lambda-1.<anonymous> (OracleSettingsScreen.kt:117)");
            }
            TextKt.t("Search Settings", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0443j() {
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f12246n = new n();

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
                ComposerKt.p5(625624490, i2, -1, "com.bendingspoons.oracle.secretmenu.oracleSettings.ComposableSingletons$OracleSettingsScreenKt.lambda-2.<anonymous> (OracleSettingsScreen.kt:118)");
            }
            IconKt.nr(SearchKt.n(Icons.f23855n.n()), "Search", null, 0L, composer, 48, 12);
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

    public final Function2 rl() {
        return f12244t;
    }
}
